# fever_client.DuplicatesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**find_duplicates**](DuplicatesApi.md#find_duplicates) | **POST** /v1/duplicates | Find near-duplicate media clusters for a customer
[**suggested_dedup_threshold**](DuplicatesApi.md#suggested_dedup_threshold) | **GET** /v1/duplicates/suggested-threshold | Suggest a duplicate-detection threshold from this customer&#39;s edge cosine distribution


# **find_duplicates**
> DuplicatesResponse find_duplicates(duplicates_request)

Find near-duplicate media clusters for a customer

Find near-duplicate clusters. Scoped to one customer, this reads the edge set maintained at ingest (millisecond answers; edges exist down to cosine 0.80). An admin key with no customer_id scans live across all customers; passing customer_ids narrows that live scan to a handful of accounts. Both admin shapes see cross-customer duplicates. No delete or keep recommendation is made: the clusters are yours to act on.

### Example

* Bearer Authentication (bearerAuth):

```python
import fever_client
from fever_client.models.duplicates_request import DuplicatesRequest
from fever_client.models.duplicates_response import DuplicatesResponse
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
    api_instance = fever_client.DuplicatesApi(api_client)
    duplicates_request = fever_client.DuplicatesRequest() # DuplicatesRequest | 

    try:
        # Find near-duplicate media clusters for a customer
        api_response = await api_instance.find_duplicates(duplicates_request)
        print("The response of DuplicatesApi->find_duplicates:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DuplicatesApi->find_duplicates: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **duplicates_request** | [**DuplicatesRequest**](DuplicatesRequest.md)|  | 

### Return type

[**DuplicatesResponse**](DuplicatesResponse.md)

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

# **suggested_dedup_threshold**
> object suggested_dedup_threshold(customer_id=customer_id)

Suggest a duplicate-detection threshold from this customer's edge cosine distribution

### Example

* Bearer Authentication (bearerAuth):

```python
import fever_client
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
    api_instance = fever_client.DuplicatesApi(api_client)
    customer_id = 'customer_id_example' # str |  (optional)

    try:
        # Suggest a duplicate-detection threshold from this customer's edge cosine distribution
        api_response = await api_instance.suggested_dedup_threshold(customer_id=customer_id)
        print("The response of DuplicatesApi->suggested_dedup_threshold:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DuplicatesApi->suggested_dedup_threshold: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | **str**|  | [optional] 

### Return type

**object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

