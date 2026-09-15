# FeverClient::DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**health**](DefaultApi.md#health) | **GET** /v1/health | Health check |
| [**healthz_healthz_get**](DefaultApi.md#healthz_healthz_get) | **GET** /healthz | Healthz |


## health

> <Health> health

Health check

### Examples

```ruby
require 'time'
require 'fever_client'

api_instance = FeverClient::DefaultApi.new

begin
  # Health check
  result = api_instance.health
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling DefaultApi->health: #{e}"
end
```

#### Using the health_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Health>, Integer, Hash)> health_with_http_info

```ruby
begin
  # Health check
  data, status_code, headers = api_instance.health_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Health>
rescue FeverClient::ApiError => e
  puts "Error when calling DefaultApi->health_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Health**](Health.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## healthz_healthz_get

> Object healthz_healthz_get

Healthz

### Examples

```ruby
require 'time'
require 'fever_client'

api_instance = FeverClient::DefaultApi.new

begin
  # Healthz
  result = api_instance.healthz_healthz_get
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling DefaultApi->healthz_healthz_get: #{e}"
end
```

#### Using the healthz_healthz_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> healthz_healthz_get_with_http_info

```ruby
begin
  # Healthz
  data, status_code, headers = api_instance.healthz_healthz_get_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Object
rescue FeverClient::ApiError => e
  puts "Error when calling DefaultApi->healthz_healthz_get_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

