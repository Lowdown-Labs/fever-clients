# FeverClient::ReportsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**generate_report**](ReportsApi.md#generate_report) | **POST** /v1/reports | Queue a photo report: fill labeled slots with the best-matching photos and render a PDF to S3 |
| [**get_report**](ReportsApi.md#get_report) | **GET** /v1/reports/{job_id} | Get photo report job progress |


## generate_report

> <ReportJob> generate_report(report_request)

Queue a photo report: fill labeled slots with the best-matching photos and render a PDF to S3

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::ReportsApi.new
report_request = FeverClient::ReportRequest.new({slots: [FeverClient::ReportSlot.new({label: 'label_example'})], title: 'title_example'}) # ReportRequest | 

begin
  # Queue a photo report: fill labeled slots with the best-matching photos and render a PDF to S3
  result = api_instance.generate_report(report_request)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling ReportsApi->generate_report: #{e}"
end
```

#### Using the generate_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ReportJob>, Integer, Hash)> generate_report_with_http_info(report_request)

```ruby
begin
  # Queue a photo report: fill labeled slots with the best-matching photos and render a PDF to S3
  data, status_code, headers = api_instance.generate_report_with_http_info(report_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ReportJob>
rescue FeverClient::ApiError => e
  puts "Error when calling ReportsApi->generate_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **report_request** | [**ReportRequest**](ReportRequest.md) |  |  |

### Return type

[**ReportJob**](ReportJob.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_report

> <Job> get_report(job_id)

Get photo report job progress

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::ReportsApi.new
job_id = 56 # Integer | 

begin
  # Get photo report job progress
  result = api_instance.get_report(job_id)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling ReportsApi->get_report: #{e}"
end
```

#### Using the get_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Job>, Integer, Hash)> get_report_with_http_info(job_id)

```ruby
begin
  # Get photo report job progress
  data, status_code, headers = api_instance.get_report_with_http_info(job_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Job>
rescue FeverClient::ApiError => e
  puts "Error when calling ReportsApi->get_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **job_id** | **Integer** |  |  |

### Return type

[**Job**](Job.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

