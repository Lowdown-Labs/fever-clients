# MediaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMediaBytes**](MediaApi.md#getMediaBytes) | **GET** /v1/media/{blob_id}/bytes | Fetch an indexed media item&#39;s bytes (images normalized to JPEG) |
| [**getMediaBytesWithHttpInfo**](MediaApi.md#getMediaBytesWithHttpInfo) | **GET** /v1/media/{blob_id}/bytes | Fetch an indexed media item&#39;s bytes (images normalized to JPEG) |
| [**getMediaInfo**](MediaApi.md#getMediaInfo) | **GET** /v1/media/{blob_id} | Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts |
| [**getMediaInfoWithHttpInfo**](MediaApi.md#getMediaInfoWithHttpInfo) | **GET** /v1/media/{blob_id} | Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts |
| [**listMediaFormats**](MediaApi.md#listMediaFormats) | **GET** /v1/media/formats | Ingest capability: supported extensions per media family |
| [**listMediaFormatsWithHttpInfo**](MediaApi.md#listMediaFormatsWithHttpInfo) | **GET** /v1/media/formats | Ingest capability: supported extensions per media family |
| [**listMediaFrames**](MediaApi.md#listMediaFrames) | **GET** /v1/media/{blob_id}/frames | Sampled video frames for a parent blob |
| [**listMediaFramesWithHttpInfo**](MediaApi.md#listMediaFramesWithHttpInfo) | **GET** /v1/media/{blob_id}/frames | Sampled video frames for a parent blob |
| [**listMediaTranscript**](MediaApi.md#listMediaTranscript) | **GET** /v1/media/{blob_id}/transcript | Whisper transcript segments for a parent blob (audio or video) |
| [**listMediaTranscriptWithHttpInfo**](MediaApi.md#listMediaTranscriptWithHttpInfo) | **GET** /v1/media/{blob_id}/transcript | Whisper transcript segments for a parent blob (audio or video) |



## getMediaBytes

> Object getMediaBytes(blobId, maxDim, waveform)

Fetch an indexed media item&#39;s bytes (images normalized to JPEG)

Return the bytes for a blob_id (JPEG, normalized to max_dim; 0 &#x3D; raw bytes). Scoped keys can only fetch their own customer&#39;s items; other customers&#39; blobs are a 404 (never an existence leak).  ?waveform&#x3D;1 renders an audio blob&#39;s waveform as a PNG (ffmpeg showwavespic) so clients can show a real visual for audio hits without decoding the clip in the browser.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaApi apiInstance = new MediaApi(defaultClient);
        Integer blobId = 56; // Integer | 
        Integer maxDim = 1280; // Integer | 
        Integer waveform = 0; // Integer | 
        try {
            Object result = apiInstance.getMediaBytes(blobId, maxDim, waveform);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaApi#getMediaBytes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobId** | **Integer**|  | |
| **maxDim** | **Integer**|  | [optional] [default to 1280] |
| **waveform** | **Integer**|  | [optional] [default to 0] |

### Return type

**Object**


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, image/jpeg, image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## getMediaBytesWithHttpInfo

> ApiResponse<Object> getMediaBytesWithHttpInfo(blobId, maxDim, waveform)

Fetch an indexed media item&#39;s bytes (images normalized to JPEG)

Return the bytes for a blob_id (JPEG, normalized to max_dim; 0 &#x3D; raw bytes). Scoped keys can only fetch their own customer&#39;s items; other customers&#39; blobs are a 404 (never an existence leak).  ?waveform&#x3D;1 renders an audio blob&#39;s waveform as a PNG (ffmpeg showwavespic) so clients can show a real visual for audio hits without decoding the clip in the browser.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaApi apiInstance = new MediaApi(defaultClient);
        Integer blobId = 56; // Integer | 
        Integer maxDim = 1280; // Integer | 
        Integer waveform = 0; // Integer | 
        try {
            ApiResponse<Object> response = apiInstance.getMediaBytesWithHttpInfo(blobId, maxDim, waveform);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaApi#getMediaBytes");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobId** | **Integer**|  | |
| **maxDim** | **Integer**|  | [optional] [default to 1280] |
| **waveform** | **Integer**|  | [optional] [default to 0] |

### Return type

ApiResponse<**Object**>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, image/jpeg, image/png

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getMediaInfo

> MediaInfo getMediaInfo(blobId, customerId)

Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts

Unified record for a blob_id. Scoped keys can only read their own customer&#39;s blobs; other customers&#39; blobs are a 404 (never an existence leak). Admin keys may narrow with ?customer_id&#x3D;.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaApi apiInstance = new MediaApi(defaultClient);
        Integer blobId = 56; // Integer | 
        String customerId = "customerId_example"; // String | 
        try {
            MediaInfo result = apiInstance.getMediaInfo(blobId, customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaApi#getMediaInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobId** | **Integer**|  | |
| **customerId** | **String**|  | [optional] |

### Return type

[**MediaInfo**](MediaInfo.md)


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## getMediaInfoWithHttpInfo

> ApiResponse<MediaInfo> getMediaInfoWithHttpInfo(blobId, customerId)

Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts

Unified record for a blob_id. Scoped keys can only read their own customer&#39;s blobs; other customers&#39; blobs are a 404 (never an existence leak). Admin keys may narrow with ?customer_id&#x3D;.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaApi apiInstance = new MediaApi(defaultClient);
        Integer blobId = 56; // Integer | 
        String customerId = "customerId_example"; // String | 
        try {
            ApiResponse<MediaInfo> response = apiInstance.getMediaInfoWithHttpInfo(blobId, customerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaApi#getMediaInfo");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobId** | **Integer**|  | |
| **customerId** | **String**|  | [optional] |

### Return type

ApiResponse<[**MediaInfo**](MediaInfo.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## listMediaFormats

> MediaFormats listMediaFormats()

Ingest capability: supported extensions per media family

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaApi apiInstance = new MediaApi(defaultClient);
        try {
            MediaFormats result = apiInstance.listMediaFormats();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaApi#listMediaFormats");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**MediaFormats**](MediaFormats.md)


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

## listMediaFormatsWithHttpInfo

> ApiResponse<MediaFormats> listMediaFormatsWithHttpInfo()

Ingest capability: supported extensions per media family

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaApi apiInstance = new MediaApi(defaultClient);
        try {
            ApiResponse<MediaFormats> response = apiInstance.listMediaFormatsWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaApi#listMediaFormats");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**MediaFormats**](MediaFormats.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## listMediaFrames

> List<MediaFrame> listMediaFrames(blobId, customerId)

Sampled video frames for a parent blob

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaApi apiInstance = new MediaApi(defaultClient);
        Integer blobId = 56; // Integer | 
        String customerId = "customerId_example"; // String | 
        try {
            List<MediaFrame> result = apiInstance.listMediaFrames(blobId, customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaApi#listMediaFrames");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobId** | **Integer**|  | |
| **customerId** | **String**|  | [optional] |

### Return type

[**List&lt;MediaFrame&gt;**](MediaFrame.md)


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## listMediaFramesWithHttpInfo

> ApiResponse<List<MediaFrame>> listMediaFramesWithHttpInfo(blobId, customerId)

Sampled video frames for a parent blob

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaApi apiInstance = new MediaApi(defaultClient);
        Integer blobId = 56; // Integer | 
        String customerId = "customerId_example"; // String | 
        try {
            ApiResponse<List<MediaFrame>> response = apiInstance.listMediaFramesWithHttpInfo(blobId, customerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaApi#listMediaFrames");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobId** | **Integer**|  | |
| **customerId** | **String**|  | [optional] |

### Return type

ApiResponse<[**List&lt;MediaFrame&gt;**](MediaFrame.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## listMediaTranscript

> List<TranscriptSegment> listMediaTranscript(blobId, customerId)

Whisper transcript segments for a parent blob (audio or video)

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaApi apiInstance = new MediaApi(defaultClient);
        Integer blobId = 56; // Integer | 
        String customerId = "customerId_example"; // String | 
        try {
            List<TranscriptSegment> result = apiInstance.listMediaTranscript(blobId, customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaApi#listMediaTranscript");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobId** | **Integer**|  | |
| **customerId** | **String**|  | [optional] |

### Return type

[**List&lt;TranscriptSegment&gt;**](TranscriptSegment.md)


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## listMediaTranscriptWithHttpInfo

> ApiResponse<List<TranscriptSegment>> listMediaTranscriptWithHttpInfo(blobId, customerId)

Whisper transcript segments for a parent blob (audio or video)

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.MediaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        MediaApi apiInstance = new MediaApi(defaultClient);
        Integer blobId = 56; // Integer | 
        String customerId = "customerId_example"; // String | 
        try {
            ApiResponse<List<TranscriptSegment>> response = apiInstance.listMediaTranscriptWithHttpInfo(blobId, customerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MediaApi#listMediaTranscript");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **blobId** | **Integer**|  | |
| **customerId** | **String**|  | [optional] |

### Return type

ApiResponse<[**List&lt;TranscriptSegment&gt;**](TranscriptSegment.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

