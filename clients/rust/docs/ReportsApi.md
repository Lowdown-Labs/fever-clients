# \ReportsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generate_report**](ReportsApi.md#generate_report) | **POST** /v1/reports | Queue a photo report: fill labeled slots with the best-matching photos and render a PDF to S3
[**get_report**](ReportsApi.md#get_report) | **GET** /v1/reports/{job_id} | Get photo report job progress



## generate_report

> models::ReportJob generate_report(report_request)
Queue a photo report: fill labeled slots with the best-matching photos and render a PDF to S3

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**report_request** | [**ReportRequest**](ReportRequest.md) |  | [required] |

### Return type

[**models::ReportJob**](ReportJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_report

> models::Job get_report(job_id)
Get photo report job progress

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**job_id** | **i32** |  | [required] |

### Return type

[**models::Job**](Job.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

