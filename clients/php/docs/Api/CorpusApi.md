# LowdownLabs\Fever\CorpusApi

Corpus composition for dashboards and the demo page.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**corpusStats()**](CorpusApi.md#corpusStats) | **GET** /v1/corpus | Corpus composition: per-kind counts and top autotags |


## `corpusStats()`

```php
corpusStats($customer_id): \LowdownLabs\Fever\Model\CorpusStats
```

Corpus composition: per-kind counts and top autotags

kinds/top_tags/storage_bytes follow the same customer scoping. index_bytes is the appliance-wide footprint of as_blobs/embeddings/ annotations including their indexes: those tables are hash-partitioned by customer_id, not per tenant, so a per-tenant share is not attributable and every caller sees the same global value.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\CorpusApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$customer_id = 'customer_id_example'; // string

try {
    $result = $apiInstance->corpusStats($customer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CorpusApi->corpusStats: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customer_id** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\CorpusStats**](../Model/CorpusStats.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
