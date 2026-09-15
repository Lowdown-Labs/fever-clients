# FeverClient::IngestApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ingest_media**](IngestApi.md#ingest_media) | **POST** /v1/media | Ingest one or many media items |


## ingest_media

> <IngestResult> ingest_media(ingest_request, opts)

Ingest one or many media items

Throw 1..N media items over the wall. Small inline batches are embedded and indexed synchronously and return blob ids; large batches or an s3:// source return a Job you poll at /v1/jobs/{id}. Tenant is taken from the API key.

### Examples

```ruby
require 'time'
require 'fever_client'

api_instance = FeverClient::IngestApi.new
ingest_request = FeverClient::IngestRequest.new # IngestRequest | 
opts = {
  authorization: 'authorization_example' # String | 
}

begin
  # Ingest one or many media items
  result = api_instance.ingest_media(ingest_request, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling IngestApi->ingest_media: #{e}"
end
```

#### Using the ingest_media_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<IngestResult>, Integer, Hash)> ingest_media_with_http_info(ingest_request, opts)

```ruby
begin
  # Ingest one or many media items
  data, status_code, headers = api_instance.ingest_media_with_http_info(ingest_request, opts)
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
| **authorization** | **String** |  | [optional] |

### Return type

[**IngestResult**](IngestResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

