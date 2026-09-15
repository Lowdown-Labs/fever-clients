# \CustomersApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**reassign_customers_bulk**](CustomersApi.md#reassign_customers_bulk) | **POST** /v1/customers/reassign-bulk | Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping



## reassign_customers_bulk

> serde_json::Value reassign_customers_bulk(authorization, file)
Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping

Associate already-ingested images to customers after the fact, at millions-of-rows scale. Accepts a multipart file upload (.csv, .jsonl, .parquet) or a JSON body {\"s3_uri\": \"s3://bucket/key\", \"format\"?: \"csv|jsonl|parquet\"}. Each row maps a key (exact blob key) or filename to a customer_id; key is preferred when both are present. Rows are loaded with COPY and moved with one set-based UPDATE per table, so a million-row file completes in seconds. Reports matched/updated/noop/unmatched/conflict counts; filename fanout moves every match.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**authorization** | Option<**String**> |  |  |
**file** | Option<**std::path::PathBuf**> |  |  |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

