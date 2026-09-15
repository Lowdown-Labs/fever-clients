# fever_client.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**health**](DefaultApi.md#health) | **GET** /v1/health | Health check
[**healthz_healthz_get**](DefaultApi.md#healthz_healthz_get) | **GET** /healthz | Healthz


# **health**
> Health health()

Health check

### Example


```python
import fever_client
from fever_client.models.health import Health
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.DefaultApi(api_client)

    try:
        # Health check
        api_response = await api_instance.health()
        print("The response of DefaultApi->health:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->health: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**Health**](Health.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **healthz_healthz_get**
> object healthz_healthz_get()

Healthz

### Example


```python
import fever_client
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.DefaultApi(api_client)

    try:
        # Healthz
        api_response = await api_instance.healthz_healthz_get()
        print("The response of DefaultApi->healthz_healthz_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->healthz_healthz_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

