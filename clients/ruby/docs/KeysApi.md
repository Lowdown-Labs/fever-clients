# FeverClient::KeysApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_key**](KeysApi.md#create_key) | **POST** /v1/keys | Mint an API key for this appliance |
| [**list_keys**](KeysApi.md#list_keys) | **GET** /v1/keys | List this appliance&#39;s API keys |
| [**revoke_key**](KeysApi.md#revoke_key) | **POST** /v1/keys/{key_id}/revoke | Revoke an API key |


## create_key

> <KeyReveal> create_key(create_key_request, opts)

Mint an API key for this appliance

### Examples

```ruby
require 'time'
require 'fever_client'

api_instance = FeverClient::KeysApi.new
create_key_request = FeverClient::CreateKeyRequest.new # CreateKeyRequest | 
opts = {
  authorization: 'authorization_example' # String | 
}

begin
  # Mint an API key for this appliance
  result = api_instance.create_key(create_key_request, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling KeysApi->create_key: #{e}"
end
```

#### Using the create_key_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<KeyReveal>, Integer, Hash)> create_key_with_http_info(create_key_request, opts)

```ruby
begin
  # Mint an API key for this appliance
  data, status_code, headers = api_instance.create_key_with_http_info(create_key_request, opts)
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
| **authorization** | **String** |  | [optional] |

### Return type

[**KeyReveal**](KeyReveal.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## list_keys

> <Array<ApiKey>> list_keys(opts)

List this appliance's API keys

### Examples

```ruby
require 'time'
require 'fever_client'

api_instance = FeverClient::KeysApi.new
opts = {
  authorization: 'authorization_example' # String | 
}

begin
  # List this appliance's API keys
  result = api_instance.list_keys(opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling KeysApi->list_keys: #{e}"
end
```

#### Using the list_keys_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<ApiKey>>, Integer, Hash)> list_keys_with_http_info(opts)

```ruby
begin
  # List this appliance's API keys
  data, status_code, headers = api_instance.list_keys_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<ApiKey>>
rescue FeverClient::ApiError => e
  puts "Error when calling KeysApi->list_keys_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **authorization** | **String** |  | [optional] |

### Return type

[**Array&lt;ApiKey&gt;**](ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## revoke_key

> Object revoke_key(key_id, opts)

Revoke an API key

### Examples

```ruby
require 'time'
require 'fever_client'

api_instance = FeverClient::KeysApi.new
key_id = 56 # Integer | 
opts = {
  authorization: 'authorization_example' # String | 
}

begin
  # Revoke an API key
  result = api_instance.revoke_key(key_id, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling KeysApi->revoke_key: #{e}"
end
```

#### Using the revoke_key_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> revoke_key_with_http_info(key_id, opts)

```ruby
begin
  # Revoke an API key
  data, status_code, headers = api_instance.revoke_key_with_http_info(key_id, opts)
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
| **authorization** | **String** |  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

