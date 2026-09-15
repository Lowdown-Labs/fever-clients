# fever_client.CorpusApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**corpus_stats**](CorpusApi.md#corpus_stats) | **GET** /v1/corpus | Corpus composition: per-kind counts and top autotags


# **corpus_stats**
> CorpusStats corpus_stats(customer_id=customer_id, authorization=authorization)

Corpus composition: per-kind counts and top autotags

### Example


```python
import fever_client
from fever_client.models.corpus_stats import CorpusStats
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
    api_instance = fever_client.CorpusApi(api_client)
    customer_id = 'customer_id_example' # str |  (optional)
    authorization = 'authorization_example' # str |  (optional)

    try:
        # Corpus composition: per-kind counts and top autotags
        api_response = await api_instance.corpus_stats(customer_id=customer_id, authorization=authorization)
        print("The response of CorpusApi->corpus_stats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CorpusApi->corpus_stats: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | **str**|  | [optional] 
 **authorization** | **str**|  | [optional] 

### Return type

[**CorpusStats**](CorpusStats.md)

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

