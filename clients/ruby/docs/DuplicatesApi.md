# FeverClient::DuplicatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**find_duplicates**](DuplicatesApi.md#find_duplicates) | **POST** /v1/duplicates | Find near-duplicate media clusters for a customer |
| [**suggested_dedup_threshold**](DuplicatesApi.md#suggested_dedup_threshold) | **GET** /v1/duplicates/suggested-threshold | Suggest a duplicate-detection threshold from this customer&#39;s edge cosine distribution |


## find_duplicates

> <DuplicatesResponse> find_duplicates(duplicates_request, opts)

Find near-duplicate media clusters for a customer

Find near-duplicate clusters. Scoped to one customer, this reads the edge set maintained at ingest (millisecond answers; edges exist down to cosine 0.80). An admin key with no customer_id scans live across all customers; passing customer_ids narrows that live scan to a handful of accounts. Both admin shapes see cross-customer duplicates. No delete or keep recommendation is made: the clusters are yours to act on.

### Examples

```ruby
require 'time'
require 'fever_client'

api_instance = FeverClient::DuplicatesApi.new
duplicates_request = FeverClient::DuplicatesRequest.new # DuplicatesRequest | 
opts = {
  authorization: 'authorization_example' # String | 
}

begin
  # Find near-duplicate media clusters for a customer
  result = api_instance.find_duplicates(duplicates_request, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling DuplicatesApi->find_duplicates: #{e}"
end
```

#### Using the find_duplicates_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DuplicatesResponse>, Integer, Hash)> find_duplicates_with_http_info(duplicates_request, opts)

```ruby
begin
  # Find near-duplicate media clusters for a customer
  data, status_code, headers = api_instance.find_duplicates_with_http_info(duplicates_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DuplicatesResponse>
rescue FeverClient::ApiError => e
  puts "Error when calling DuplicatesApi->find_duplicates_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **duplicates_request** | [**DuplicatesRequest**](DuplicatesRequest.md) |  |  |
| **authorization** | **String** |  | [optional] |

### Return type

[**DuplicatesResponse**](DuplicatesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## suggested_dedup_threshold

> Object suggested_dedup_threshold(opts)

Suggest a duplicate-detection threshold from this customer's edge cosine distribution

### Examples

```ruby
require 'time'
require 'fever_client'

api_instance = FeverClient::DuplicatesApi.new
opts = {
  customer_id: 'customer_id_example', # String | 
  authorization: 'authorization_example' # String | 
}

begin
  # Suggest a duplicate-detection threshold from this customer's edge cosine distribution
  result = api_instance.suggested_dedup_threshold(opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling DuplicatesApi->suggested_dedup_threshold: #{e}"
end
```

#### Using the suggested_dedup_threshold_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> suggested_dedup_threshold_with_http_info(opts)

```ruby
begin
  # Suggest a duplicate-detection threshold from this customer's edge cosine distribution
  data, status_code, headers = api_instance.suggested_dedup_threshold_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Object
rescue FeverClient::ApiError => e
  puts "Error when calling DuplicatesApi->suggested_dedup_threshold_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **customer_id** | **String** |  | [optional] |
| **authorization** | **String** |  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

