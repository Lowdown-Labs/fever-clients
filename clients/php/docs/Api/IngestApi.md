# LowdownLabs\Fever\IngestApi

Ingest one or many media items (images, video, audio, PDFs) - inline, staged, or S3 source.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**ingestMedia()**](IngestApi.md#ingestMedia) | **POST** /v1/media | Ingest one or many media items |


## `ingestMedia()`

```php
ingestMedia($ingest_request): \LowdownLabs\Fever\Model\IngestResult
```

Ingest one or many media items

Throw 1..N media items over the wall. Small inline batches are embedded and indexed synchronously and return blob ids; large batches or an s3:// source return a Job you poll at /v1/jobs/{id}. Tenant is taken from the API key.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\IngestApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ingest_request = new \LowdownLabs\Fever\Model\IngestRequest(); // \LowdownLabs\Fever\Model\IngestRequest

try {
    $result = $apiInstance->ingestMedia($ingest_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling IngestApi->ingestMedia: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ingest_request** | [**\LowdownLabs\Fever\Model\IngestRequest**](../Model/IngestRequest.md)|  | |

### Return type

[**\LowdownLabs\Fever\Model\IngestResult**](../Model/IngestResult.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
