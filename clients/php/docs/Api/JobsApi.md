# LowdownLabs\Fever\JobsApi

Poll ingest / backfill progress.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelJob()**](JobsApi.md#cancelJob) | **POST** /v1/jobs/{job_id}/cancel | Cancel a pending or running ingest job |
| [**getJob()**](JobsApi.md#getJob) | **GET** /v1/jobs/{job_id} | Get ingest job progress |


## `cancelJob()`

```php
cancelJob($job_id, $authorization): \LowdownLabs\Fever\Model\Job
```

Cancel a pending or running ingest job

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new LowdownLabs\Fever\Api\JobsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$job_id = 56; // int
$authorization = 'authorization_example'; // string

try {
    $result = $apiInstance->cancelJob($job_id, $authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling JobsApi->cancelJob: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **job_id** | **int**|  | |
| **authorization** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\Job**](../Model/Job.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getJob()`

```php
getJob($job_id, $authorization): \LowdownLabs\Fever\Model\Job
```

Get ingest job progress

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new LowdownLabs\Fever\Api\JobsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$job_id = 56; // int
$authorization = 'authorization_example'; // string

try {
    $result = $apiInstance->getJob($job_id, $authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling JobsApi->getJob: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **job_id** | **int**|  | |
| **authorization** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\Job**](../Model/Job.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
