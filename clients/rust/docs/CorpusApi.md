# \CorpusApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**corpus_stats**](CorpusApi.md#corpus_stats) | **GET** /v1/corpus | Corpus composition: per-kind counts and top autotags



## corpus_stats

> models::CorpusStats corpus_stats(customer_id)
Corpus composition: per-kind counts and top autotags

kinds/top_tags/storage_bytes follow the same customer scoping. index_bytes is the appliance-wide footprint of as_blobs/embeddings/ annotations including their indexes: those tables are hash-partitioned by customer_id, not per tenant, so a per-tenant share is not attributable and every caller sees the same global value.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**customer_id** | Option<**String**> |  |  |

### Return type

[**models::CorpusStats**](CorpusStats.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

