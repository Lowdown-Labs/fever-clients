# FeverClient::ExportApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**export_tenant**](ExportApi.md#export_tenant) | **POST** /v1/export | Export the tenant&#39;s vectors and metadata to S3 |
| [**import_tenant**](ExportApi.md#import_tenant) | **POST** /v1/import | Import vectors and metadata from a previous FEVER export in S3 |


## export_tenant

> <ExportResult> export_tenant(export_request, opts)

Export the tenant's vectors and metadata to S3

### Examples

```ruby
require 'time'
require 'fever_client'

api_instance = FeverClient::ExportApi.new
export_request = FeverClient::ExportRequest.new({s3_uri: 's3_uri_example'}) # ExportRequest | 
opts = {
  authorization: 'authorization_example' # String | 
}

begin
  # Export the tenant's vectors and metadata to S3
  result = api_instance.export_tenant(export_request, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling ExportApi->export_tenant: #{e}"
end
```

#### Using the export_tenant_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ExportResult>, Integer, Hash)> export_tenant_with_http_info(export_request, opts)

```ruby
begin
  # Export the tenant's vectors and metadata to S3
  data, status_code, headers = api_instance.export_tenant_with_http_info(export_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ExportResult>
rescue FeverClient::ApiError => e
  puts "Error when calling ExportApi->export_tenant_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **export_request** | [**ExportRequest**](ExportRequest.md) |  |  |
| **authorization** | **String** |  | [optional] |

### Return type

[**ExportResult**](ExportResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## import_tenant

> <ImportResult> import_tenant(import_request, opts)

Import vectors and metadata from a previous FEVER export in S3

### Examples

```ruby
require 'time'
require 'fever_client'

api_instance = FeverClient::ExportApi.new
import_request = FeverClient::ImportRequest.new({s3_uri: 's3_uri_example'}) # ImportRequest | 
opts = {
  authorization: 'authorization_example' # String | 
}

begin
  # Import vectors and metadata from a previous FEVER export in S3
  result = api_instance.import_tenant(import_request, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling ExportApi->import_tenant: #{e}"
end
```

#### Using the import_tenant_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ImportResult>, Integer, Hash)> import_tenant_with_http_info(import_request, opts)

```ruby
begin
  # Import vectors and metadata from a previous FEVER export in S3
  data, status_code, headers = api_instance.import_tenant_with_http_info(import_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ImportResult>
rescue FeverClient::ApiError => e
  puts "Error when calling ExportApi->import_tenant_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **import_request** | [**ImportRequest**](ImportRequest.md) |  |  |
| **authorization** | **String** |  | [optional] |

### Return type

[**ImportResult**](ImportResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

