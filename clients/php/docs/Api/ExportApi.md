# LowdownLabs\Fever\ExportApi

Dump a tenant&#39;s vectors and metadata to S3.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**exportTenant()**](ExportApi.md#exportTenant) | **POST** /v1/export | Export the tenant&#39;s vectors and metadata to S3 |
| [**importTenant()**](ExportApi.md#importTenant) | **POST** /v1/import | Import vectors and metadata from a previous FEVER export in S3 |


## `exportTenant()`

```php
exportTenant($export_request, $authorization): \LowdownLabs\Fever\Model\ExportResult
```

Export the tenant's vectors and metadata to S3

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new LowdownLabs\Fever\Api\ExportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$export_request = new \LowdownLabs\Fever\Model\ExportRequest(); // \LowdownLabs\Fever\Model\ExportRequest
$authorization = 'authorization_example'; // string

try {
    $result = $apiInstance->exportTenant($export_request, $authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExportApi->exportTenant: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **export_request** | [**\LowdownLabs\Fever\Model\ExportRequest**](../Model/ExportRequest.md)|  | |
| **authorization** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\ExportResult**](../Model/ExportResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `importTenant()`

```php
importTenant($import_request, $authorization): \LowdownLabs\Fever\Model\ImportResult
```

Import vectors and metadata from a previous FEVER export in S3

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new LowdownLabs\Fever\Api\ExportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$import_request = new \LowdownLabs\Fever\Model\ImportRequest(); // \LowdownLabs\Fever\Model\ImportRequest
$authorization = 'authorization_example'; // string

try {
    $result = $apiInstance->importTenant($import_request, $authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ExportApi->importTenant: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **import_request** | [**\LowdownLabs\Fever\Model\ImportRequest**](../Model/ImportRequest.md)|  | |
| **authorization** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\ImportResult**](../Model/ImportResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
