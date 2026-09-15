# LowdownLabs\Fever\CustomersApi

Admin-gated per-customer index maintenance: reassign, clear, wipe.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**reassignCustomersBulk()**](CustomersApi.md#reassignCustomersBulk) | **POST** /v1/customers/reassign-bulk | Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping |


## `reassignCustomersBulk()`

```php
reassignCustomersBulk($authorization, $file): mixed
```

Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping

Associate already-ingested images to customers after the fact, at millions-of-rows scale. Accepts a multipart file upload (.csv, .jsonl, .parquet) or a JSON body {\"s3_uri\": \"s3://bucket/key\", \"format\"?: \"csv|jsonl|parquet\"}. Each row maps a key (exact blob key) or filename to a customer_id; key is preferred when both are present. Rows are loaded with COPY and moved with one set-based UPDATE per table, so a million-row file completes in seconds. Reports matched/updated/noop/unmatched/conflict counts; filename fanout moves every match.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new LowdownLabs\Fever\Api\CustomersApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authorization = 'authorization_example'; // string
$file = '/path/to/file.txt'; // \SplFileObject

try {
    $result = $apiInstance->reassignCustomersBulk($authorization, $file);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CustomersApi->reassignCustomersBulk: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **authorization** | **string**|  | [optional] |
| **file** | **\SplFileObject****\SplFileObject**|  | [optional] |

### Return type

**mixed**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
