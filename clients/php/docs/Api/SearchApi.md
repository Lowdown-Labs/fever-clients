# LowdownLabs\Fever\SearchApi

Search by text (hybrid + rerank) or image (cosine), with video seek and transcript spans.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**search()**](SearchApi.md#search) | **POST** /v1/search | Search by text or image |


## `search()`

```php
search($search_request, $authorization): \LowdownLabs\Fever\Model\SearchHit[]
```

Search by text or image

text runs a meaning-based vector search fused with lexical full-text (RRF), reranked and calibrated so min_score is a real match probability. image runs cosine similarity. customer_id and EXIF fields narrow the results.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new LowdownLabs\Fever\Api\SearchApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$search_request = new \LowdownLabs\Fever\Model\SearchRequest(); // \LowdownLabs\Fever\Model\SearchRequest
$authorization = 'authorization_example'; // string

try {
    $result = $apiInstance->search($search_request, $authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SearchApi->search: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **search_request** | [**\LowdownLabs\Fever\Model\SearchRequest**](../Model/SearchRequest.md)|  | |
| **authorization** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\SearchHit[]**](../Model/SearchHit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
