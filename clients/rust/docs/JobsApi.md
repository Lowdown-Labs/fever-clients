# \JobsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_job**](JobsApi.md#cancel_job) | **POST** /v1/jobs/{job_id}/cancel | Cancel a pending or running ingest job
[**get_job**](JobsApi.md#get_job) | **GET** /v1/jobs/{job_id} | Get ingest job progress



## cancel_job

> models::Job cancel_job(job_id, authorization)
Cancel a pending or running ingest job

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **i32** |  | [required] |
**authorization** | Option<**String**> |  |  |

### Return type

[**models::Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_job

> models::Job get_job(job_id, authorization)
Get ingest job progress

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **i32** |  | [required] |
**authorization** | Option<**String**> |  |  |

### Return type

[**models::Job**](Job.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

