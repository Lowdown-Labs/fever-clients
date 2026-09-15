# \IngestApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ingest_media**](IngestApi.md#ingest_media) | **POST** /v1/media | Ingest one or many media items



## ingest_media

> models::IngestResult ingest_media(ingest_request, authorization)
Ingest one or many media items

Throw 1..N media items over the wall. Small inline batches are embedded and indexed synchronously and return blob ids; large batches or an s3:// source return a Job you poll at /v1/jobs/{id}. Tenant is taken from the API key.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ingest_request** | [**IngestRequest**](IngestRequest.md) |  | [required] |
**authorization** | Option<**String**> |  |  |

### Return type

[**models::IngestResult**](IngestResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

