# fever_client.ExportApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**export_tenant**](ExportApi.md#export_tenant) | **POST** /v1/export | Export the tenant&#39;s vectors and metadata to S3
[**import_tenant**](ExportApi.md#import_tenant) | **POST** /v1/import | Import vectors and metadata from a previous FEVER export in S3


# **export_tenant**
> ExportResult export_tenant(export_request)

Export the tenant's vectors and metadata to S3

### Example

* Bearer Authentication (bearerAuth):

```python
import fever_client
from fever_client.models.export_request import ExportRequest
from fever_client.models.export_result import ExportResult
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.ExportApi(api_client)
    export_request = fever_client.ExportRequest() # ExportRequest | 

    try:
        # Export the tenant's vectors and metadata to S3
        api_response = await api_instance.export_tenant(export_request)
        print("The response of ExportApi->export_tenant:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ExportApi->export_tenant: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **export_request** | [**ExportRequest**](ExportRequest.md)|  | 

### Return type

[**ExportResult**](ExportResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **import_tenant**
> ImportResult import_tenant(import_request)

Import vectors and metadata from a previous FEVER export in S3

### Example

* Bearer Authentication (bearerAuth):

```python
import fever_client
from fever_client.models.import_request import ImportRequest
from fever_client.models.import_result import ImportResult
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.ExportApi(api_client)
    import_request = fever_client.ImportRequest() # ImportRequest | 

    try:
        # Import vectors and metadata from a previous FEVER export in S3
        api_response = await api_instance.import_tenant(import_request)
        print("The response of ExportApi->import_tenant:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ExportApi->import_tenant: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **import_request** | [**ImportRequest**](ImportRequest.md)|  | 

### Return type

[**ImportResult**](ImportResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

