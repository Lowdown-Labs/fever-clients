# LowdownLabs\Fever\MediaApi

Media parents: unified info, raw bytes, sampled video frames, whisper transcript segments, supported formats.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getMediaBytes()**](MediaApi.md#getMediaBytes) | **GET** /v1/media/{blob_id}/bytes | Fetch an indexed media item&#39;s bytes (images normalized to JPEG) |
| [**getMediaInfo()**](MediaApi.md#getMediaInfo) | **GET** /v1/media/{blob_id} | Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts |
| [**listMediaFormats()**](MediaApi.md#listMediaFormats) | **GET** /v1/media/formats | Ingest capability: supported extensions per media family |
| [**listMediaFrames()**](MediaApi.md#listMediaFrames) | **GET** /v1/media/{blob_id}/frames | Sampled video frames for a parent blob |
| [**listMediaTranscript()**](MediaApi.md#listMediaTranscript) | **GET** /v1/media/{blob_id}/transcript | Whisper transcript segments for a parent blob (audio or video) |


## `getMediaBytes()`

```php
getMediaBytes($blob_id, $max_dim, $waveform): mixed
```

Fetch an indexed media item's bytes (images normalized to JPEG)

Return the bytes for a blob_id (JPEG, normalized to max_dim; 0 = raw bytes). Scoped keys can only fetch their own customer's items; other customers' blobs are a 404 (never an existence leak).  ?waveform=1 renders an audio blob's waveform as a PNG (ffmpeg showwavespic) so clients can show a real visual for audio hits without decoding the clip in the browser.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\MediaApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$blob_id = 56; // int
$max_dim = 1280; // int
$waveform = 0; // int

try {
    $result = $apiInstance->getMediaBytes($blob_id, $max_dim, $waveform);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MediaApi->getMediaBytes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blob_id** | **int**|  | |
| **max_dim** | **int**|  | [optional] [default to 1280] |
| **waveform** | **int**|  | [optional] [default to 0] |

### Return type

**mixed**

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `image/jpeg`, `image/png`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getMediaInfo()`

```php
getMediaInfo($blob_id, $customer_id): \LowdownLabs\Fever\Model\MediaInfo
```

Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts

Unified record for a blob_id. Scoped keys can only read their own customer's blobs; other customers' blobs are a 404 (never an existence leak). Admin keys may narrow with ?customer_id=.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\MediaApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$blob_id = 56; // int
$customer_id = 'customer_id_example'; // string

try {
    $result = $apiInstance->getMediaInfo($blob_id, $customer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MediaApi->getMediaInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blob_id** | **int**|  | |
| **customer_id** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\MediaInfo**](../Model/MediaInfo.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listMediaFormats()`

```php
listMediaFormats(): \LowdownLabs\Fever\Model\MediaFormats
```

Ingest capability: supported extensions per media family

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\MediaApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->listMediaFormats();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MediaApi->listMediaFormats: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\LowdownLabs\Fever\Model\MediaFormats**](../Model/MediaFormats.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listMediaFrames()`

```php
listMediaFrames($blob_id, $customer_id): \LowdownLabs\Fever\Model\MediaFrame[]
```

Sampled video frames for a parent blob

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\MediaApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$blob_id = 56; // int
$customer_id = 'customer_id_example'; // string

try {
    $result = $apiInstance->listMediaFrames($blob_id, $customer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MediaApi->listMediaFrames: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blob_id** | **int**|  | |
| **customer_id** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\MediaFrame[]**](../Model/MediaFrame.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `listMediaTranscript()`

```php
listMediaTranscript($blob_id, $customer_id): \LowdownLabs\Fever\Model\TranscriptSegment[]
```

Whisper transcript segments for a parent blob (audio or video)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure Bearer authorization: bearerAuth
$config = LowdownLabs\Fever\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new LowdownLabs\Fever\Api\MediaApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$blob_id = 56; // int
$customer_id = 'customer_id_example'; // string

try {
    $result = $apiInstance->listMediaTranscript($blob_id, $customer_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MediaApi->listMediaTranscript: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blob_id** | **int**|  | |
| **customer_id** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\TranscriptSegment[]**](../Model/TranscriptSegment.md)

### Authorization

[bearerAuth](../../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
