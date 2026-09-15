# \SearchApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](SearchApi.md#search) | **POST** /v1/search | Search by text or image



## search

> Vec<models::SearchHit> search(search_request, authorization)
Search by text or image

text runs a meaning-based vector search fused with lexical full-text (RRF), reranked and calibrated so min_score is a real match probability. image runs cosine similarity. customer_id and EXIF fields narrow the results.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**search_request** | [**SearchRequest**](SearchRequest.md) |  | [required] |
**authorization** | Option<**String**> |  |  |

### Return type

[**Vec<models::SearchHit>**](SearchHit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

