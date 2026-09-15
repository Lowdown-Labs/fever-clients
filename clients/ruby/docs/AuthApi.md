# FeverClient::AuthApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**whoami**](AuthApi.md#whoami) | **GET** /v1/whoami | Report the calling key&#39;s role and customer scope |


## whoami

> Object whoami

Report the calling key's role and customer scope

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::AuthApi.new

begin
  # Report the calling key's role and customer scope
  result = api_instance.whoami
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling AuthApi->whoami: #{e}"
end
```

#### Using the whoami_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> whoami_with_http_info

```ruby
begin
  # Report the calling key's role and customer scope
  data, status_code, headers = api_instance.whoami_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Object
rescue FeverClient::ApiError => e
  puts "Error when calling AuthApi->whoami_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

