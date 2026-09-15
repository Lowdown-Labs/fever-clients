# fever_client.IngestApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ingest_media**](IngestApi.md#ingest_media) | **POST** /v1/media | Ingest one or many media items


# **ingest_media**
> IngestResult ingest_media(ingest_request, authorization=authorization)

Ingest one or many media items

Throw 1..N media items over the wall. Small inline batches are embedded and indexed synchronously and return blob ids; large batches or an s3:// source return a Job you poll at /v1/jobs/{id}. Tenant is taken from the API key.

### Example


```python
import fever_client
from fever_client.models.ingest_request import IngestRequest
from fever_client.models.ingest_result import IngestResult
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
    api_instance = fever_client.IngestApi(api_client)
    ingest_request = fever_client.IngestRequest() # IngestRequest | 
    authorization = 'authorization_example' # str |  (optional)

    try:
        # Ingest one or many media items
        api_response = await api_instance.ingest_media(ingest_request, authorization=authorization)
        print("The response of IngestApi->ingest_media:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IngestApi->ingest_media: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingest_request** | [**IngestRequest**](IngestRequest.md)|  | 
 **authorization** | **str**|  | [optional] 

### Return type

[**IngestResult**](IngestResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

