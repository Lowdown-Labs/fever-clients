# FeverClient::JobsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**cancel_job**](JobsApi.md#cancel_job) | **POST** /v1/jobs/{job_id}/cancel | Cancel a pending or running ingest job |
| [**get_job**](JobsApi.md#get_job) | **GET** /v1/jobs/{job_id} | Get ingest job progress |


## cancel_job

> <Job> cancel_job(job_id)

Cancel a pending or running ingest job

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::JobsApi.new
job_id = 56 # Integer | 

begin
  # Cancel a pending or running ingest job
  result = api_instance.cancel_job(job_id)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling JobsApi->cancel_job: #{e}"
end
```

#### Using the cancel_job_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Job>, Integer, Hash)> cancel_job_with_http_info(job_id)

```ruby
begin
  # Cancel a pending or running ingest job
  data, status_code, headers = api_instance.cancel_job_with_http_info(job_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Job>
rescue FeverClient::ApiError => e
  puts "Error when calling JobsApi->cancel_job_with_http_info: #{e}"
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


## get_job

> <Job> get_job(job_id)

Get ingest job progress

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::JobsApi.new
job_id = 56 # Integer | 

begin
  # Get ingest job progress
  result = api_instance.get_job(job_id)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling JobsApi->get_job: #{e}"
end
```

#### Using the get_job_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Job>, Integer, Hash)> get_job_with_http_info(job_id)

```ruby
begin
  # Get ingest job progress
  data, status_code, headers = api_instance.get_job_with_http_info(job_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Job>
rescue FeverClient::ApiError => e
  puts "Error when calling JobsApi->get_job_with_http_info: #{e}"
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

