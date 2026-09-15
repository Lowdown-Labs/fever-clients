# FeverClient::KeysApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_key**](KeysApi.md#create_key) | **POST** /v1/keys | Mint an API key for this appliance |
| [**list_keys**](KeysApi.md#list_keys) | **GET** /v1/keys | List this appliance&#39;s API keys |
| [**revoke_key**](KeysApi.md#revoke_key) | **POST** /v1/keys/{key_id}/revoke | Revoke an API key |


## create_key

> <KeyReveal> create_key(create_key_request)

Mint an API key for this appliance

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: adminToken
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::KeysApi.new
create_key_request = FeverClient::CreateKeyRequest.new # CreateKeyRequest | 

begin
  # Mint an API key for this appliance
  result = api_instance.create_key(create_key_request)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling KeysApi->create_key: #{e}"
end
```

#### Using the create_key_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<KeyReveal>, Integer, Hash)> create_key_with_http_info(create_key_request)

```ruby
begin
  # Mint an API key for this appliance
  data, status_code, headers = api_instance.create_key_with_http_info(create_key_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <KeyReveal>
rescue FeverClient::ApiError => e
  puts "Error when calling KeysApi->create_key_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **create_key_request** | [**CreateKeyRequest**](CreateKeyRequest.md) |  |  |

### Return type

[**KeyReveal**](KeyReveal.md)

### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## list_keys

> <Array<ApiKey>> list_keys

List this appliance's API keys

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: adminToken
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::KeysApi.new

begin
  # List this appliance's API keys
  result = api_instance.list_keys
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling KeysApi->list_keys: #{e}"
end
```

#### Using the list_keys_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<ApiKey>>, Integer, Hash)> list_keys_with_http_info

```ruby
begin
  # List this appliance's API keys
  data, status_code, headers = api_instance.list_keys_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<ApiKey>>
rescue FeverClient::ApiError => e
  puts "Error when calling KeysApi->list_keys_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Array&lt;ApiKey&gt;**](ApiKey.md)

### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## revoke_key

> Object revoke_key(key_id)

Revoke an API key

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: adminToken
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::KeysApi.new
key_id = 56 # Integer | 

begin
  # Revoke an API key
  result = api_instance.revoke_key(key_id)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling KeysApi->revoke_key: #{e}"
end
```

#### Using the revoke_key_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> revoke_key_with_http_info(key_id)

```ruby
begin
  # Revoke an API key
  data, status_code, headers = api_instance.revoke_key_with_http_info(key_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Object
rescue FeverClient::ApiError => e
  puts "Error when calling KeysApi->revoke_key_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **key_id** | **Integer** |  |  |

### Return type

**Object**

### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

