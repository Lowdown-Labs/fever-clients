# FeverClient::AuthApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**whoami**](AuthApi.md#whoami) | **GET** /v1/whoami | Report the calling key&#39;s role and customer scope |


## whoami

> Object whoami(opts)

Report the calling key's role and customer scope

### Examples

```ruby
require 'time'
require 'fever_client'

api_instance = FeverClient::AuthApi.new
opts = {
  authorization: 'authorization_example' # String | 
}

begin
  # Report the calling key's role and customer scope
  result = api_instance.whoami(opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling AuthApi->whoami: #{e}"
end
```

#### Using the whoami_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> whoami_with_http_info(opts)

```ruby
begin
  # Report the calling key's role and customer scope
  data, status_code, headers = api_instance.whoami_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Object
rescue FeverClient::ApiError => e
  puts "Error when calling AuthApi->whoami_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **authorization** | **String** |  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

