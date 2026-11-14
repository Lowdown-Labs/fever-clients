# FeverClient::CustomersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**delete_customer**](CustomersApi.md#delete_customer) | **DELETE** /v1/customers/{customer_id} | Delete all data for one customer |
| [**reassign_customers_bulk**](CustomersApi.md#reassign_customers_bulk) | **POST** /v1/customers/reassign-bulk | Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping |


## delete_customer

> Object delete_customer(customer_id)

Delete all data for one customer

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: adminToken
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::CustomersApi.new
customer_id = 'customer_id_example' # String | 

begin
  # Delete all data for one customer
  result = api_instance.delete_customer(customer_id)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling CustomersApi->delete_customer: #{e}"
end
```

#### Using the delete_customer_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> delete_customer_with_http_info(customer_id)

```ruby
begin
  # Delete all data for one customer
  data, status_code, headers = api_instance.delete_customer_with_http_info(customer_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Object
rescue FeverClient::ApiError => e
  puts "Error when calling CustomersApi->delete_customer_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **customer_id** | **String** |  |  |

### Return type

**Object**

### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## reassign_customers_bulk

> Object reassign_customers_bulk(opts)

Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping

Associate already-ingested images to customers after the fact, at millions-of-rows scale. Accepts a multipart file upload (.csv, .jsonl, .parquet) or a JSON body {\"s3_uri\": \"s3://bucket/key\", \"format\"?: \"csv|jsonl|parquet\"}. Each row maps a key (exact blob key) or filename to a customer_id; key is preferred when both are present. Rows are loaded with COPY and moved with one set-based UPDATE per table, so a million-row file completes in seconds. Reports matched/updated/noop/unmatched/conflict counts; filename fanout moves every match.

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: adminToken
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::CustomersApi.new
opts = {
  file: File.new('/path/to/some/file') # File | 
}

begin
  # Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping
  result = api_instance.reassign_customers_bulk(opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling CustomersApi->reassign_customers_bulk: #{e}"
end
```

#### Using the reassign_customers_bulk_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> reassign_customers_bulk_with_http_info(opts)

```ruby
begin
  # Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping
  data, status_code, headers = api_instance.reassign_customers_bulk_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Object
rescue FeverClient::ApiError => e
  puts "Error when calling CustomersApi->reassign_customers_bulk_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **file** | **File** |  | [optional] |

### Return type

**Object**

### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

