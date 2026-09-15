# fever_client.IngestApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ingest_media**](IngestApi.md#ingest_media) | **POST** /v1/media | Ingest one or many media items


# **ingest_media**
> IngestResult ingest_media(ingest_request)

Ingest one or many media items

Throw 1..N media items over the wall. Small inline batches are embedded and indexed synchronously and return blob ids; large batches or an s3:// source return a Job you poll at /v1/jobs/{id}. Tenant is taken from the API key.

### Example

* Bearer Authentication (bearerAuth):

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
    api_instance = fever_client.IngestApi(api_client)
    ingest_request = fever_client.IngestRequest() # IngestRequest | 

    try:
        # Ingest one or many media items
        api_response = await api_instance.ingest_media(ingest_request)
        print("The response of IngestApi->ingest_media:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling IngestApi->ingest_media: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingest_request** | [**IngestRequest**](IngestRequest.md)|  | 

### Return type

[**IngestResult**](IngestResult.md)

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

