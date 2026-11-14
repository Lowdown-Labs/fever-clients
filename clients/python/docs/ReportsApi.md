# fever_client.ReportsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generate_report**](ReportsApi.md#generate_report) | **POST** /v1/reports | Queue a photo report: fill labeled slots with the best-matching photos and render a PDF to S3
[**get_report**](ReportsApi.md#get_report) | **GET** /v1/reports/{job_id} | Get photo report job progress


# **generate_report**
> ReportJob generate_report(report_request)

Queue a photo report: fill labeled slots with the best-matching photos and render a PDF to S3

### Example

* Bearer Authentication (bearerAuth):

```python
import fever_client
from fever_client.models.report_job import ReportJob
from fever_client.models.report_request import ReportRequest
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
    api_instance = fever_client.ReportsApi(api_client)
    report_request = fever_client.ReportRequest() # ReportRequest | 

    try:
        # Queue a photo report: fill labeled slots with the best-matching photos and render a PDF to S3
        api_response = await api_instance.generate_report(report_request)
        print("The response of ReportsApi->generate_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_request** | [**ReportRequest**](ReportRequest.md)|  | 

### Return type

[**ReportJob**](ReportJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_report**
> Job get_report(job_id)

Get photo report job progress

### Example

* Bearer Authentication (bearerAuth):

```python
import fever_client
from fever_client.models.job import Job
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
    api_instance = fever_client.ReportsApi(api_client)
    job_id = 56 # int | 

    try:
        # Get photo report job progress
        api_response = await api_instance.get_report(job_id)
        print("The response of ReportsApi->get_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->get_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **int**|  | 

### Return type

[**Job**](Job.md)

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

