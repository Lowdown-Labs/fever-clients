import io
import json
import re
import ssl
from typing import Any, Dict, Optional, Union

import aiohttp
import aiohttp_retry

from fever_client.exceptions import ApiException, ApiValueError

RESTResponseType = aiohttp.ClientResponse

ALLOW_RETRY_METHODS = frozenset({'DELETE', 'GET', 'HEAD', 'OPTIONS', 'PUT', 'TRACE'})

class RESTResponse(io.IOBase):

    def __init__(self, resp) -> None:
        self.response = resp
        self.status = resp.status
        self.reason = resp.reason
        self.data = None

    async def read(self):
        if self.data is None:
            self.data = await self.response.read()
        return self.data

    @property
    def headers(self):
        return self.response.headers

    def getheaders(self):
        return self.response.headers

    def getheader(self, name, default=None):
        return self.response.headers.get(name, default)

class RESTClientObject:

    def __init__(self, configuration) -> None:

        self.configuration = configuration

        self.maxsize = configuration.connection_pool_maxsize

        self.ssl_context = ssl.create_default_context(
            cafile=configuration.ssl_ca_cert,
            cadata=configuration.ca_cert_data,
        )
        if configuration.cert_file:
            self.ssl_context.load_cert_chain(
                configuration.cert_file, keyfile=configuration.key_file
            )

        if not configuration.verify_ssl:
            self.ssl_context.check_hostname = False
            self.ssl_context.verify_mode = ssl.CERT_NONE

        self.proxy = configuration.proxy
        self.proxy_headers = configuration.proxy_headers

        retries = configuration.retries
        if retries is None:
            self._effective_retry_options = None
        elif isinstance(retries, aiohttp_retry.RetryOptionsBase):
            self._effective_retry_options = retries
        elif isinstance(retries, int):
            self._effective_retry_options = aiohttp_retry.ExponentialRetry(
                attempts=retries,
                factor=2.0,
                start_timeout=0.1,
                max_timeout=120.0
            )
        else:
            self._effective_retry_options = None

        self.pool_manager: Optional[aiohttp.ClientSession] = None
        self.retry_client: Optional[aiohttp_retry.RetryClient] = None

    async def close(self) -> None:
        if self.pool_manager:
            await self.pool_manager.close()
        if self.retry_client is not None:
            await self.retry_client.close()

    def _create_connector(self) -> aiohttp.TCPConnector:
        kwargs: Dict[str, Any] = {
            "limit": self.maxsize,
            "ssl": self.ssl_context,
        }
        limit_per_host = getattr(self.configuration, "tcp_connector_limit_per_host", None)
        if limit_per_host is not None:
            kwargs["limit_per_host"] = limit_per_host
        return aiohttp.TCPConnector(**kwargs)

    def _create_pool_manager(self) -> aiohttp.ClientSession:
        extra = getattr(self.configuration, "client_session_kwargs", None)
        kwargs: Dict[str, Any] = {
            "connector": self._create_connector(),
            "trust_env": True,
        }
        trace_configs = getattr(self.configuration, "trace_configs", None)
        if trace_configs is not None:
            kwargs["trace_configs"] = trace_configs
        if extra:
            kwargs.update(extra)
        return aiohttp.ClientSession(**kwargs)

    async def request(
        self,
        method,
        url,
        headers=None,
        body=None,
        post_params=None,
        _request_timeout=None
    ):
        method = method.upper()
        assert method in [
            'GET',
            'HEAD',
            'DELETE',
            'POST',
            'PUT',
            'PATCH',
            'OPTIONS'
        ]

        if post_params and body:
            raise ApiValueError(
                "body parameter cannot be used with post_params parameter."
            )

        post_params = post_params or {}
        headers = headers or {}
        timeout = _request_timeout or 5 * 60

        if 'Content-Type' not in headers:
            headers['Content-Type'] = 'application/json'

        args = {
            "method": method,
            "url": url,
            "timeout": timeout,
            "headers": headers
        }

        if self.proxy:
            args["proxy"] = self.proxy
        if self.proxy_headers:
            args["proxy_headers"] = self.proxy_headers

        if method in ['POST', 'PUT', 'PATCH', 'OPTIONS', 'DELETE']:
            if re.search('json', headers['Content-Type'], re.IGNORECASE):
                if body is not None:
                    body = json.dumps(body)
                if body is None and post_params:
                    body = json.dumps(dict(post_params))
                args["data"] = body
            elif headers['Content-Type'] == 'application/x-www-form-urlencoded':
                args["data"] = aiohttp.FormData(post_params)
            elif headers['Content-Type'] == 'multipart/form-data':
                del headers['Content-Type']
                data = aiohttp.FormData()
                for param in post_params:
                    k, v = param
                    if isinstance(v, tuple) and len(v) == 3:
                        data.add_field(
                            k,
                            value=v[1],
                            filename=v[0],
                            content_type=v[2]
                        )
                    else:
                        if isinstance(v, dict):
                            v = json.dumps(v)
                        elif isinstance(v, int):
                            v = str(v)
                        data.add_field(k, v)
                args["data"] = data

            elif isinstance(body, str) or isinstance(body, bytes):
                args["data"] = body
            else:
                msg = """Cannot prepare a request message for provided
                         arguments. Please check that your arguments match
                         declared content type."""
                raise ApiException(status=0, reason=msg)

        pool_manager: Union[aiohttp.ClientSession, aiohttp_retry.RetryClient]

        if self.pool_manager is None:
            self.pool_manager = self._create_pool_manager()
        pool_manager = self.pool_manager

        if self._effective_retry_options is not None and method in ALLOW_RETRY_METHODS:
            if self.retry_client is None:
                self.retry_client = aiohttp_retry.RetryClient(
                    client_session=self.pool_manager,
                    retry_options=self._effective_retry_options
                )
            pool_manager = self.retry_client

        r = await pool_manager.request(**args)

        return RESTResponse(r)
