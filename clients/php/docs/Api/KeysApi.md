# LowdownLabs\Fever\KeysApi

Admin-gated API key management for this appliance: mint, list, revoke.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createKey()**](KeysApi.md#createKey) | **POST** /v1/keys | Mint an API key for this appliance |
| [**listKeys()**](KeysApi.md#listKeys) | **GET** /v1/keys | List this appliance&#39;s API keys |
| [**revokeKey()**](KeysApi.md#revokeKey) | **POST** /v1/keys/{key_id}/revoke | Revoke an API key |


## `createKey()`

```php
createKey($create_key_request, $authorization): \LowdownLabs\Fever\Model\KeyReveal
```

Mint an API key for this appliance

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new LowdownLabs\Fever\Api\KeysApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$create_key_request = new \LowdownLabs\Fever\Model\CreateKeyRequest(); // \LowdownLabs\Fever\Model\CreateKeyRequest
$authorization = 'authorization_example'; // string

try {
    $result = $apiInstance->createKey($create_key_request, $authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KeysApi->createKey: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **create_key_request** | [**\LowdownLabs\Fever\Model\CreateKeyRequest**](../Model/CreateKeyRequest.md)|  | |
| **authorization** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\KeyReveal**](../Model/KeyReveal.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listKeys()`

```php
listKeys($authorization): \LowdownLabs\Fever\Model\ApiKey[]
```

List this appliance's API keys

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new LowdownLabs\Fever\Api\KeysApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = 'authorization_example'; // string

try {
    $result = $apiInstance->listKeys($authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KeysApi->listKeys: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **authorization** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\ApiKey[]**](../Model/ApiKey.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `revokeKey()`

```php
revokeKey($key_id, $authorization): mixed
```

Revoke an API key

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new LowdownLabs\Fever\Api\KeysApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$key_id = 56; // int
$authorization = 'authorization_example'; // string

try {
    $result = $apiInstance->revokeKey($key_id, $authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling KeysApi->revokeKey: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **key_id** | **int**|  | |
| **authorization** | **string**|  | [optional] |

### Return type

**mixed**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
