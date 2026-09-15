# FeverClient::SearchApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**search**](SearchApi.md#search) | **POST** /v1/search | Search by text or image |


## search

> <Array<SearchHit>> search(search_request, opts)

Search by text or image

text runs a meaning-based vector search fused with lexical full-text (RRF), reranked and calibrated so min_score is a real match probability. image runs cosine similarity. customer_id and EXIF fields narrow the results.

### Examples

```ruby
require 'time'
require 'fever_client'

api_instance = FeverClient::SearchApi.new
search_request = FeverClient::SearchRequest.new # SearchRequest | 
opts = {
  authorization: 'authorization_example' # String | 
}

begin
  # Search by text or image
  result = api_instance.search(search_request, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling SearchApi->search: #{e}"
end
```

#### Using the search_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<SearchHit>>, Integer, Hash)> search_with_http_info(search_request, opts)

```ruby
begin
  # Search by text or image
  data, status_code, headers = api_instance.search_with_http_info(search_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<SearchHit>>
rescue FeverClient::ApiError => e
  puts "Error when calling SearchApi->search_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **search_request** | [**SearchRequest**](SearchRequest.md) |  |  |
| **authorization** | **String** |  | [optional] |

### Return type

[**Array&lt;SearchHit&gt;**](SearchHit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

