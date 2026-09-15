# fever_client.AuthApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**whoami**](AuthApi.md#whoami) | **GET** /v1/whoami | Report the calling key&#39;s role and customer scope


# **whoami**
> object whoami(authorization=authorization)

Report the calling key's role and customer scope

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
    api_instance = fever_client.AuthApi(api_client)
    authorization = 'authorization_example' # str |  (optional)

    try:
        # Report the calling key's role and customer scope
        api_response = await api_instance.whoami(authorization=authorization)
        print("The response of AuthApi->whoami:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AuthApi->whoami: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**|  | [optional] 

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
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

