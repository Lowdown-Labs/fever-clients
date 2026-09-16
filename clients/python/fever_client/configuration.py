import aiohttp
import aiohttp_retry
import base64
import copy
import http.client as httplib
import logging
from logging import FileHandler
import sys
from typing import Any, ClassVar, Dict, List, Literal, Optional, TypedDict, Union
from typing_extensions import NotRequired, Self

JSON_SCHEMA_VALIDATION_KEYWORDS = {
    'multipleOf', 'maximum', 'exclusiveMaximum',
    'minimum', 'exclusiveMinimum', 'maxLength',
    'minLength', 'pattern', 'maxItems', 'minItems'
}

ServerVariablesT = Dict[str, str]

GenericAuthSetting = TypedDict(
    "GenericAuthSetting",
    {
        "type": str,
        "in": str,
        "key": str,
        "value": str,
    },
)

OAuth2AuthSetting = TypedDict(
    "OAuth2AuthSetting",
    {
        "type": Literal["oauth2"],
        "in": Literal["header"],
        "key": Literal["Authorization"],
        "value": str,
    },
)

APIKeyAuthSetting = TypedDict(
    "APIKeyAuthSetting",
    {
        "type": Literal["api_key"],
        "in": str,
        "key": str,
        "value": Optional[str],
    },
)

BasicAuthSetting = TypedDict(
    "BasicAuthSetting",
    {
        "type": Literal["basic"],
        "in": Literal["header"],
        "key": Literal["Authorization"],
        "value": Optional[str],
    },
)

BearerFormatAuthSetting = TypedDict(
    "BearerFormatAuthSetting",
    {
        "type": Literal["bearer"],
        "in": Literal["header"],
        "format": Literal["JWT"],
        "key": Literal["Authorization"],
        "value": str,
    },
)

BearerAuthSetting = TypedDict(
    "BearerAuthSetting",
    {
        "type": Literal["bearer"],
        "in": Literal["header"],
        "key": Literal["Authorization"],
        "value": str,
    },
)

HTTPSignatureAuthSetting = TypedDict(
    "HTTPSignatureAuthSetting",
    {
        "type": Literal["http-signature"],
        "in": Literal["header"],
        "key": Literal["Authorization"],
        "value": None,
    },
)

AuthSettings = TypedDict(
    "AuthSettings",
    {
        "adminToken": BearerAuthSetting,
        "bearerAuth": BearerAuthSetting,
    },
    total=False,
)

class HostSettingVariable(TypedDict):
    description: str
    default_value: str
    enum_values: List[str]

class HostSetting(TypedDict):
    url: str
    description: str
    variables: NotRequired[Dict[str, HostSettingVariable]]

class Configuration:

    _default: ClassVar[Optional[Self]] = None

    def __init__(
        self,
        host: Optional[str]=None,
        api_key: Optional[Dict[str, str]]=None,
        api_key_prefix: Optional[Dict[str, str]]=None,
        username: Optional[str]=None,
        password: Optional[str]=None,
        access_token: Optional[str]=None,
        server_index: Optional[int]=None,
        server_variables: Optional[ServerVariablesT]=None,
        server_operation_index: Optional[Dict[int, int]]=None,
        server_operation_variables: Optional[Dict[int, ServerVariablesT]]=None,
        ignore_operation_servers: bool=False,
        ssl_ca_cert: Optional[str]=None,
        retries: Optional[Union[int, aiohttp_retry.RetryOptionsBase]] = None,
        trace_configs: Optional[List[aiohttp.TraceConfig]] = None,
        tcp_connector_limit_per_host: Optional[int] = None,
        client_session_kwargs: Optional[Dict[str, Any]] = None,
        ca_cert_data: Optional[Union[str, bytes]] = None,
        cert_file: Optional[str]=None,
        key_file: Optional[str]=None,
        verify_ssl: bool=True,
        assert_hostname: Optional[bool]=None,
        tls_server_name: Optional[str]=None,
        connection_pool_maxsize: Optional[int]=None,
        proxy: Optional[str]=None,
        proxy_headers: Optional[Any]=None,
        safe_chars_for_path_param: str='',
        client_side_validation: bool=True,
        socket_options: Optional[Any]=None,
        datetime_format: str="%Y-%m-%dT%H:%M:%S.%f%z",
        date_format: str="%Y-%m-%d",
        *,
        debug: Optional[bool] = None,
    ) -> None:
        self._base_path = "http://localhost" if host is None else host
        self.server_index = 0 if server_index is None and host is None else server_index
        self.server_operation_index = server_operation_index or {}
        self.server_variables = server_variables or {}
        self.server_operation_variables = server_operation_variables or {}
        self.ignore_operation_servers = ignore_operation_servers
        self.temp_folder_path = None
        self.api_key = {}
        if api_key:
            self.api_key = api_key
        self.api_key_prefix = {}
        if api_key_prefix:
            self.api_key_prefix = api_key_prefix
        self.refresh_api_key_hook = None
        self.username = username
        self.password = password
        self.access_token = access_token
        self.logger = {}
        self.logger["package_logger"] = logging.getLogger("fever_client")
        self.logger_format = '%(asctime)s %(levelname)s %(message)s'
        self.logger_stream_handler = None
        self.logger_file_handler: Optional[FileHandler] = None
        self.logger_file = None
        if debug is not None:
            self.debug = debug
        else:
            self.__debug = False

        self.verify_ssl = verify_ssl
        self.ssl_ca_cert = ssl_ca_cert
        self.ca_cert_data = ca_cert_data
        self.cert_file = cert_file
        self.key_file = key_file
        self.assert_hostname = assert_hostname
        self.tls_server_name = tls_server_name

        self.connection_pool_maxsize = connection_pool_maxsize if connection_pool_maxsize is not None else 100

        self.proxy = proxy
        self.proxy_headers = proxy_headers
        self.safe_chars_for_path_param = safe_chars_for_path_param
        self.retries = retries
        self.trace_configs = trace_configs
        self.tcp_connector_limit_per_host = tcp_connector_limit_per_host
        self.client_session_kwargs = client_session_kwargs
        self.client_side_validation = client_side_validation

        self.socket_options = socket_options

        self.datetime_format = datetime_format

        self.date_format = date_format

    def __deepcopy__(self, memo:  Dict[int, Any]) -> Self:
        cls = self.__class__
        result = cls.__new__(cls)
        memo[id(self)] = result
        for k, v in self.__dict__.items():
            if k not in ('logger', 'logger_file_handler'):
                setattr(result, k, copy.deepcopy(v, memo))
        result.logger = copy.copy(self.logger)
        result.logger_file = self.logger_file

        return result

    def __setattr__(self, name: str, value: Any) -> None:
        object.__setattr__(self, name, value)

    @classmethod
    def set_default(cls, default: Optional[Self]) -> None:
        cls._default = default

    @classmethod
    def get_default_copy(cls) -> Self:
        return cls.get_default()

    @classmethod
    def get_default(cls) -> Self:
        if cls._default is None:
            cls._default = cls()
        return cls._default

    @property
    def logger_file(self) -> Optional[str]:
        return self.__logger_file

    @logger_file.setter
    def logger_file(self, value: Optional[str]) -> None:
        self.__logger_file = value
        if self.__logger_file:
            self.logger_file_handler = logging.FileHandler(self.__logger_file)
            self.logger_file_handler.setFormatter(self.logger_formatter)
            for _, logger in self.logger.items():
                logger.addHandler(self.logger_file_handler)

    @property
    def debug(self) -> bool:
        return self.__debug

    @debug.setter
    def debug(self, value: bool) -> None:
        self.__debug = value
        if self.__debug:
            for _, logger in self.logger.items():
                logger.setLevel(logging.DEBUG)
            httplib.HTTPConnection.debuglevel = 1
        else:
            for _, logger in self.logger.items():
                logger.setLevel(logging.WARNING)
            httplib.HTTPConnection.debuglevel = 0

    @property
    def logger_format(self) -> str:
        return self.__logger_format

    @logger_format.setter
    def logger_format(self, value: str) -> None:
        self.__logger_format = value
        self.logger_formatter = logging.Formatter(self.__logger_format)

    def get_api_key_with_prefix(self, identifier: str, alias: Optional[str]=None) -> Optional[str]:
        if self.refresh_api_key_hook is not None:
            self.refresh_api_key_hook(self)
        key = self.api_key.get(identifier, self.api_key.get(alias) if alias is not None else None)
        if key:
            prefix = self.api_key_prefix.get(
                identifier, self.api_key_prefix.get(alias) if alias is not None else None)
            if prefix:
                return "%s %s" % (prefix, key)
            else:
                return key

        return None

    def get_basic_auth_token(self) -> Optional[str]:
        username = ""
        if self.username is not None:
            username = self.username
        password = ""
        if self.password is not None:
            password = self.password

        return "Basic " + base64.b64encode(
            (username + ":" + password).encode('utf-8')
        ).decode('utf-8')

    def auth_settings(self)-> AuthSettings:
        auth: AuthSettings = {}
        if self.access_token is not None:
            auth['adminToken'] = {
                'type': 'bearer',
                'in': 'header',
                'key': 'Authorization',
                'value': 'Bearer ' + self.access_token
            }
        if self.access_token is not None:
            auth['bearerAuth'] = {
                'type': 'bearer',
                'in': 'header',
                'key': 'Authorization',
                'value': 'Bearer ' + self.access_token
            }
        return auth

    def to_debug_report(self) -> str:
        return "Python SDK Debug Report:\n"\
               "OS: {env}\n"\
               "Python Version: {pyversion}\n"\
               "Version of the API: 0.3.0\n"\
               "SDK Package Version: 0.3.2".\
               format(env=sys.platform, pyversion=sys.version)

    def get_host_settings(self) -> List[HostSetting]:
        return [
            {
                'url': "",
                'description': "No description provided",
            }
        ]

    def get_host_from_settings(
        self,
        index: Optional[int],
        variables: Optional[ServerVariablesT]=None,
        servers: Optional[List[HostSetting]]=None,
    ) -> str:
        if index is None:
            return self._base_path

        variables = {} if variables is None else variables
        servers = self.get_host_settings() if servers is None else servers

        try:
            server = servers[index]
        except IndexError:
            raise ValueError(
                "Invalid index {0} when selecting the host settings. "
                "Must be less than {1}".format(index, len(servers)))

        url = server['url']

        for variable_name, variable in server.get('variables', {}).items():
            used_value = variables.get(
                variable_name, variable['default_value'])

            if 'enum_values' in variable \
                    and variable['enum_values'] \
                    and used_value not in variable['enum_values']:
                raise ValueError(
                    "The variable `{0}` in the host URL has invalid value "
                    "{1}. Must be {2}.".format(
                        variable_name, variables[variable_name],
                        variable['enum_values']))

            url = url.replace("{" + variable_name + "}", used_value)

        return url

    @property
    def host(self) -> str:
        return self.get_host_from_settings(self.server_index, variables=self.server_variables)

    @host.setter
    def host(self, value: str) -> None:
        self._base_path = value
        self.server_index = None
