# LowdownLabs\Fever\ReportsApi

Photo reports: fill labeled slots with the best-matching corpus photos and render a PDF to S3.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**generateReport()**](ReportsApi.md#generateReport) | **POST** /v1/reports | Queue a photo report: fill labeled slots with the best-matching photos and render a PDF to S3 |
| [**getReport()**](ReportsApi.md#getReport) | **GET** /v1/reports/{job_id} | Get photo report job progress |


## `generateReport()`

```php
generateReport($report_request): \LowdownLabs\Fever\Model\ReportJob
```

Queue a photo report: fill labeled slots with the best-matching photos and render a PDF to S3

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\ReportsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$report_request = new \LowdownLabs\Fever\Model\ReportRequest(); // \LowdownLabs\Fever\Model\ReportRequest

try {
    $result = $apiInstance->generateReport($report_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReportsApi->generateReport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **report_request** | [**\LowdownLabs\Fever\Model\ReportRequest**](../Model/ReportRequest.md)|  | |

### Return type

[**\LowdownLabs\Fever\Model\ReportJob**](../Model/ReportJob.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getReport()`

```php
getReport($job_id): \LowdownLabs\Fever\Model\Job
```

Get photo report job progress

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\ReportsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$job_id = 56; // int

try {
    $result = $apiInstance->getReport($job_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ReportsApi->getReport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **job_id** | **int**|  | |

### Return type

[**\LowdownLabs\Fever\Model\Job**](../Model/Job.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
