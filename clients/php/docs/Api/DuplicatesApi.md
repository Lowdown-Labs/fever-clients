# LowdownLabs\Fever\DuplicatesApi

Find near-duplicate clusters for a customer.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**findDuplicates()**](DuplicatesApi.md#findDuplicates) | **POST** /v1/duplicates | Find near-duplicate media clusters for a customer |
| [**suggestedDedupThreshold()**](DuplicatesApi.md#suggestedDedupThreshold) | **GET** /v1/duplicates/suggested-threshold | Suggest a duplicate-detection threshold from this customer&#39;s edge cosine distribution |


## `findDuplicates()`

```php
findDuplicates($duplicates_request): \LowdownLabs\Fever\Model\DuplicatesResponse
```

Find near-duplicate media clusters for a customer

Find near-duplicate clusters. Scoped to one customer, this reads the edge set maintained at ingest (millisecond answers; edges exist down to cosine 0.80). An admin key with no customer_id scans live across all customers; passing customer_ids narrows that live scan to a handful of accounts. Both admin shapes see cross-customer duplicates. No delete or keep recommendation is made: the clusters are yours to act on.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\DuplicatesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$duplicates_request = new \LowdownLabs\Fever\Model\DuplicatesRequest(); // \LowdownLabs\Fever\Model\DuplicatesRequest

try {
    $result = $apiInstance->findDuplicates($duplicates_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DuplicatesApi->findDuplicates: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **duplicates_request** | [**\LowdownLabs\Fever\Model\DuplicatesRequest**](../Model/DuplicatesRequest.md)|  | |

### Return type

[**\LowdownLabs\Fever\Model\DuplicatesResponse**](../Model/DuplicatesResponse.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `suggestedDedupThreshold()`

```php
suggestedDedupThreshold($customer_id): mixed
```

Suggest a duplicate-detection threshold from this customer's edge cosine distribution

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\DuplicatesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$customer_id = 'customer_id_example'; // string

try {
    $result = $apiInstance->suggestedDedupThreshold($customer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DuplicatesApi->suggestedDedupThreshold: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customer_id** | **string**|  | [optional] |

### Return type

**mixed**

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
