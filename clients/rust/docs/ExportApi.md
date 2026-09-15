# \ExportApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**export_tenant**](ExportApi.md#export_tenant) | **POST** /v1/export | Export the tenant's vectors and metadata to S3
[**import_tenant**](ExportApi.md#import_tenant) | **POST** /v1/import | Import vectors and metadata from a previous FEVER export in S3



## export_tenant

> models::ExportResult export_tenant(export_request, authorization)
Export the tenant's vectors and metadata to S3

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**export_request** | [**ExportRequest**](ExportRequest.md) |  | [required] |
**authorization** | Option<**String**> |  |  |

### Return type

[**models::ExportResult**](ExportResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## import_tenant

> models::ImportResult import_tenant(import_request, authorization)
Import vectors and metadata from a previous FEVER export in S3

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**import_request** | [**ImportRequest**](ImportRequest.md) |  | [required] |
**authorization** | Option<**String**> |  |  |

### Return type

[**models::ImportResult**](ImportResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

