# \DuplicatesApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**find_duplicates**](DuplicatesApi.md#find_duplicates) | **POST** /v1/duplicates | Find near-duplicate media clusters for a customer
[**suggested_dedup_threshold**](DuplicatesApi.md#suggested_dedup_threshold) | **GET** /v1/duplicates/suggested-threshold | Suggest a duplicate-detection threshold from this customer's edge cosine distribution



## find_duplicates

> models::DuplicatesResponse find_duplicates(duplicates_request)
Find near-duplicate media clusters for a customer

Find near-duplicate clusters. Scoped to one customer, this reads the edge set maintained at ingest (millisecond answers; edges exist down to cosine 0.80). An admin key with no customer_id scans live across all customers; passing customer_ids narrows that live scan to a handful of accounts. Both admin shapes see cross-customer duplicates. No delete or keep recommendation is made: the clusters are yours to act on.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**duplicates_request** | [**DuplicatesRequest**](DuplicatesRequest.md) |  | [required] |

### Return type

[**models::DuplicatesResponse**](DuplicatesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## suggested_dedup_threshold

> serde_json::Value suggested_dedup_threshold(customer_id)
Suggest a duplicate-detection threshold from this customer's edge cosine distribution

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**customer_id** | Option<**String**> |  |  |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

