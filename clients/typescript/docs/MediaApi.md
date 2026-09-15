# MediaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMediaBytes**](MediaApi.md#getmediabytes) | **GET** /v1/media/{blob_id}/bytes | Fetch an indexed media item\&#39;s bytes (images normalized to JPEG) |
| [**getMediaInfo**](MediaApi.md#getmediainfo) | **GET** /v1/media/{blob_id} | Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts |
| [**listMediaFormats**](MediaApi.md#listmediaformats) | **GET** /v1/media/formats | Ingest capability: supported extensions per media family |
| [**listMediaFrames**](MediaApi.md#listmediaframes) | **GET** /v1/media/{blob_id}/frames | Sampled video frames for a parent blob |
| [**listMediaTranscript**](MediaApi.md#listmediatranscript) | **GET** /v1/media/{blob_id}/transcript | Whisper transcript segments for a parent blob (audio or video) |



## getMediaBytes

> any getMediaBytes(blobId, maxDim, waveform)

Fetch an indexed media item\&#39;s bytes (images normalized to JPEG)

Return the bytes for a blob_id (JPEG, normalized to max_dim; 0 &#x3D; raw bytes). Scoped keys can only fetch their own customer\&#39;s items; other customers\&#39; blobs are a 404 (never an existence leak).  ?waveform&#x3D;1 renders an audio blob\&#39;s waveform as a PNG (ffmpeg showwavespic) so clients can show a real visual for audio hits without decoding the clip in the browser.

### Example

```ts
import {
  Configuration,
  MediaApi,
} from 'fever-client';
import type { GetMediaBytesRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new MediaApi(config);

  const body = {
    // number
    blobId: 56,
    // number (optional)
    maxDim: 56,
    // number (optional)
    waveform: 56,
  } satisfies GetMediaBytesRequest;

  try {
    const data = await api.getMediaBytes(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobId** | `number` |  | [Defaults to `undefined`] |
| **maxDim** | `number` |  | [Optional] [Defaults to `1280`] |
| **waveform** | `number` |  | [Optional] [Defaults to `0`] |

### Return type

**any**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `image/jpeg`, `image/png`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getMediaInfo

> MediaInfo getMediaInfo(blobId, customerId)

Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts

Unified record for a blob_id. Scoped keys can only read their own customer\&#39;s blobs; other customers\&#39; blobs are a 404 (never an existence leak). Admin keys may narrow with ?customer_id&#x3D;.

### Example

```ts
import {
  Configuration,
  MediaApi,
} from 'fever-client';
import type { GetMediaInfoRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new MediaApi(config);

  const body = {
    // number
    blobId: 56,
    // string (optional)
    customerId: customerId_example,
  } satisfies GetMediaInfoRequest;

  try {
    const data = await api.getMediaInfo(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobId** | `number` |  | [Defaults to `undefined`] |
| **customerId** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**MediaInfo**](MediaInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listMediaFormats

> MediaFormats listMediaFormats()

Ingest capability: supported extensions per media family

### Example

```ts
import {
  Configuration,
  MediaApi,
} from 'fever-client';
import type { ListMediaFormatsRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new MediaApi(config);

  try {
    const data = await api.listMediaFormats();
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**MediaFormats**](MediaFormats.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listMediaFrames

> Array&lt;MediaFrame&gt; listMediaFrames(blobId, customerId)

Sampled video frames for a parent blob

### Example

```ts
import {
  Configuration,
  MediaApi,
} from 'fever-client';
import type { ListMediaFramesRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new MediaApi(config);

  const body = {
    // number
    blobId: 56,
    // string (optional)
    customerId: customerId_example,
  } satisfies ListMediaFramesRequest;

  try {
    const data = await api.listMediaFrames(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobId** | `number` |  | [Defaults to `undefined`] |
| **customerId** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**Array&lt;MediaFrame&gt;**](MediaFrame.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## listMediaTranscript

> Array&lt;TranscriptSegment&gt; listMediaTranscript(blobId, customerId)

Whisper transcript segments for a parent blob (audio or video)

### Example

```ts
import {
  Configuration,
  MediaApi,
} from 'fever-client';
import type { ListMediaTranscriptRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new MediaApi(config);

  const body = {
    // number
    blobId: 56,
    // string (optional)
    customerId: customerId_example,
  } satisfies ListMediaTranscriptRequest;

  try {
    const data = await api.listMediaTranscript(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobId** | `number` |  | [Defaults to `undefined`] |
| **customerId** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**Array&lt;TranscriptSegment&gt;**](TranscriptSegment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

