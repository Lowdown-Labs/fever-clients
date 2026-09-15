# FeverClient::CorpusApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**corpus_stats**](CorpusApi.md#corpus_stats) | **GET** /v1/corpus | Corpus composition: per-kind counts and top autotags |


## corpus_stats

> <CorpusStats> corpus_stats(opts)

Corpus composition: per-kind counts and top autotags

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::CorpusApi.new
opts = {
  customer_id: 'customer_id_example' # String | 
}

begin
  # Corpus composition: per-kind counts and top autotags
  result = api_instance.corpus_stats(opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling CorpusApi->corpus_stats: #{e}"
end
```

#### Using the corpus_stats_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CorpusStats>, Integer, Hash)> corpus_stats_with_http_info(opts)

```ruby
begin
  # Corpus composition: per-kind counts and top autotags
  data, status_code, headers = api_instance.corpus_stats_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CorpusStats>
rescue FeverClient::ApiError => e
  puts "Error when calling CorpusApi->corpus_stats_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **customer_id** | **String** |  | [optional] |

### Return type

[**CorpusStats**](CorpusStats.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

