# fever_client.CustomersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reassign_customers_bulk**](CustomersApi.md#reassign_customers_bulk) | **POST** /v1/customers/reassign-bulk | Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping


# **reassign_customers_bulk**
> object reassign_customers_bulk(authorization=authorization, file=file)

Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping

Associate already-ingested images to customers after the fact, at millions-of-rows scale. Accepts a multipart file upload (.csv, .jsonl, .parquet) or a JSON body {"s3_uri": "s3://bucket/key", "format"?: "csv|jsonl|parquet"}. Each row maps a key (exact blob key) or filename to a customer_id; key is preferred when both are present. Rows are loaded with COPY and moved with one set-based UPDATE per table, so a million-row file completes in seconds. Reports matched/updated/noop/unmatched/conflict counts; filename fanout moves every match.

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
    api_instance = fever_client.CustomersApi(api_client)
    authorization = 'authorization_example' # str |  (optional)
    file = None # bytes |  (optional)

    try:
        # Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping
        api_response = await api_instance.reassign_customers_bulk(authorization=authorization, file=file)
        print("The response of CustomersApi->reassign_customers_bulk:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CustomersApi->reassign_customers_bulk: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**|  | [optional] 
 **file** | **bytes**|  | [optional] 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

