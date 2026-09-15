# LowdownLabs\Fever\CorpusApi

Corpus composition for dashboards and the demo page.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**corpusStats()**](CorpusApi.md#corpusStats) | **GET** /v1/corpus | Corpus composition: per-kind counts and top autotags |


## `corpusStats()`

```php
corpusStats($customer_id, $authorization): \LowdownLabs\Fever\Model\CorpusStats
```

Corpus composition: per-kind counts and top autotags

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new LowdownLabs\Fever\Api\CorpusApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$customer_id = 'customer_id_example'; // string
$authorization = 'authorization_example'; // string

try {
    $result = $apiInstance->corpusStats($customer_id, $authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CorpusApi->corpusStats: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customer_id** | **string**|  | [optional] |
| **authorization** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\CorpusStats**](../Model/CorpusStats.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
