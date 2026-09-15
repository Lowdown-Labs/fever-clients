# FeverClient::IngestApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ingest_media**](IngestApi.md#ingest_media) | **POST** /v1/media | Ingest one or many media items |


## ingest_media

> <IngestResult> ingest_media(ingest_request)

Ingest one or many media items

Throw 1..N media items over the wall. Small inline batches are embedded and indexed synchronously and return blob ids; large batches or an s3:// source return a Job you poll at /v1/jobs/{id}. Tenant is taken from the API key.

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::IngestApi.new
ingest_request = FeverClient::IngestRequest.new # IngestRequest | 

begin
  # Ingest one or many media items
  result = api_instance.ingest_media(ingest_request)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling IngestApi->ingest_media: #{e}"
end
```

#### Using the ingest_media_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IngestResult>, Integer, Hash)> ingest_media_with_http_info(ingest_request)

```ruby
begin
  # Ingest one or many media items
  data, status_code, headers = api_instance.ingest_media_with_http_info(ingest_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <IngestResult>
rescue FeverClient::ApiError => e
  puts "Error when calling IngestApi->ingest_media_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ingest_request** | [**IngestRequest**](IngestRequest.md) |  |  |

### Return type

[**IngestResult**](IngestResult.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

