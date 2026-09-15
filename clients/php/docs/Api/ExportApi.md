# LowdownLabs\Fever\ExportApi

Dump a tenant&#39;s vectors and metadata to S3.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**exportTenant()**](ExportApi.md#exportTenant) | **POST** /v1/export | Export the tenant&#39;s vectors and metadata to S3 |
| [**importTenant()**](ExportApi.md#importTenant) | **POST** /v1/import | Import vectors and metadata from a previous FEVER export in S3 |


## `exportTenant()`

```php
exportTenant($export_request): \LowdownLabs\Fever\Model\ExportResult
```

Export the tenant's vectors and metadata to S3

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\ExportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$export_request = new \LowdownLabs\Fever\Model\ExportRequest(); // \LowdownLabs\Fever\Model\ExportRequest

try {
    $result = $apiInstance->exportTenant($export_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExportApi->exportTenant: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **export_request** | [**\LowdownLabs\Fever\Model\ExportRequest**](../Model/ExportRequest.md)|  | |

### Return type

[**\LowdownLabs\Fever\Model\ExportResult**](../Model/ExportResult.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `importTenant()`

```php
importTenant($import_request): \LowdownLabs\Fever\Model\ImportResult
```

Import vectors and metadata from a previous FEVER export in S3

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\ExportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$import_request = new \LowdownLabs\Fever\Model\ImportRequest(); // \LowdownLabs\Fever\Model\ImportRequest

try {
    $result = $apiInstance->importTenant($import_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExportApi->importTenant: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **import_request** | [**\LowdownLabs\Fever\Model\ImportRequest**](../Model/ImportRequest.md)|  | |

### Return type

[**\LowdownLabs\Fever\Model\ImportResult**](../Model/ImportResult.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
