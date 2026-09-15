# LowdownLabs\Fever\AuthApi

Key identity and scope resolution.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**whoami()**](AuthApi.md#whoami) | **GET** /v1/whoami | Report the calling key&#39;s role and customer scope |


## `whoami()`

```php
whoami($authorization): mixed
```

Report the calling key's role and customer scope

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new LowdownLabs\Fever\Api\AuthApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = 'authorization_example'; // string

try {
    $result = $apiInstance->whoami($authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AuthApi->whoami: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
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
