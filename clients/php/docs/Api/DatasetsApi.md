# LowdownLabs\Fever\DatasetsApi

Named, customer-owned sets of blobs for curation and filtered export.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addDatasetItems()**](DatasetsApi.md#addDatasetItems) | **POST** /v1/datasets/{dataset_id}/items | Add blobs to a dataset |
| [**createDataset()**](DatasetsApi.md#createDataset) | **POST** /v1/datasets | Create a dataset, optionally with initial items |
| [**deleteDataset()**](DatasetsApi.md#deleteDataset) | **DELETE** /v1/datasets/{dataset_id} | Delete a dataset (the blobs themselves stay indexed) |
| [**getDataset()**](DatasetsApi.md#getDataset) | **GET** /v1/datasets/{dataset_id} | Get a dataset with its blob ids |
| [**listDatasets()**](DatasetsApi.md#listDatasets) | **GET** /v1/datasets | List datasets visible to this key |
| [**removeDatasetItems()**](DatasetsApi.md#removeDatasetItems) | **DELETE** /v1/datasets/{dataset_id}/items | Remove items from a dataset; no body clears every item |


## `addDatasetItems()`

```php
addDatasetItems($dataset_id, $dataset_items_request): \LowdownLabs\Fever\Model\DatasetDetail
```

Add blobs to a dataset

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\DatasetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$dataset_id = 56; // int
$dataset_items_request = new \LowdownLabs\Fever\Model\DatasetItemsRequest(); // \LowdownLabs\Fever\Model\DatasetItemsRequest

try {
    $result = $apiInstance->addDatasetItems($dataset_id, $dataset_items_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DatasetsApi->addDatasetItems: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dataset_id** | **int**|  | |
| **dataset_items_request** | [**\LowdownLabs\Fever\Model\DatasetItemsRequest**](../Model/DatasetItemsRequest.md)|  | |

### Return type

[**\LowdownLabs\Fever\Model\DatasetDetail**](../Model/DatasetDetail.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createDataset()`

```php
createDataset($dataset_create): \LowdownLabs\Fever\Model\DatasetDetail
```

Create a dataset, optionally with initial items

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\DatasetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$dataset_create = new \LowdownLabs\Fever\Model\DatasetCreate(); // \LowdownLabs\Fever\Model\DatasetCreate

try {
    $result = $apiInstance->createDataset($dataset_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DatasetsApi->createDataset: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dataset_create** | [**\LowdownLabs\Fever\Model\DatasetCreate**](../Model/DatasetCreate.md)|  | |

### Return type

[**\LowdownLabs\Fever\Model\DatasetDetail**](../Model/DatasetDetail.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteDataset()`

```php
deleteDataset($dataset_id): array<string,mixed>
```

Delete a dataset (the blobs themselves stay indexed)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\DatasetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$dataset_id = 56; // int

try {
    $result = $apiInstance->deleteDataset($dataset_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DatasetsApi->deleteDataset: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dataset_id** | **int**|  | |

### Return type

**array<string,mixed>**

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getDataset()`

```php
getDataset($dataset_id): \LowdownLabs\Fever\Model\DatasetDetail
```

Get a dataset with its blob ids

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\DatasetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$dataset_id = 56; // int

try {
    $result = $apiInstance->getDataset($dataset_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DatasetsApi->getDataset: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dataset_id** | **int**|  | |

### Return type

[**\LowdownLabs\Fever\Model\DatasetDetail**](../Model/DatasetDetail.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listDatasets()`

```php
listDatasets($customer_id): \LowdownLabs\Fever\Model\Dataset[]
```

List datasets visible to this key

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\DatasetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$customer_id = 'customer_id_example'; // string

try {
    $result = $apiInstance->listDatasets($customer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DatasetsApi->listDatasets: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customer_id** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\Dataset[]**](../Model/Dataset.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `removeDatasetItems()`

```php
removeDatasetItems($dataset_id, $dataset_items_remove): \LowdownLabs\Fever\Model\DatasetDetail
```

Remove items from a dataset; no body clears every item

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\DatasetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$dataset_id = 56; // int
$dataset_items_remove = new \LowdownLabs\Fever\Model\DatasetItemsRemove(); // \LowdownLabs\Fever\Model\DatasetItemsRemove

try {
    $result = $apiInstance->removeDatasetItems($dataset_id, $dataset_items_remove);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DatasetsApi->removeDatasetItems: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dataset_id** | **int**|  | |
| **dataset_items_remove** | [**\LowdownLabs\Fever\Model\DatasetItemsRemove**](../Model/DatasetItemsRemove.md)|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\DatasetDetail**](../Model/DatasetDetail.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
