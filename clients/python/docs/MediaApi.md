# fever_client.MediaApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_media_bytes**](MediaApi.md#get_media_bytes) | **GET** /v1/media/{blob_id}/bytes | Fetch an indexed media item&#39;s bytes (images normalized to JPEG)
[**get_media_info**](MediaApi.md#get_media_info) | **GET** /v1/media/{blob_id} | Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts
[**list_media_formats**](MediaApi.md#list_media_formats) | **GET** /v1/media/formats | Ingest capability: supported extensions per media family
[**list_media_frames**](MediaApi.md#list_media_frames) | **GET** /v1/media/{blob_id}/frames | Sampled video frames for a parent blob
[**list_media_transcript**](MediaApi.md#list_media_transcript) | **GET** /v1/media/{blob_id}/transcript | Whisper transcript segments for a parent blob (audio or video)


# **get_media_bytes**
> object get_media_bytes(blob_id, max_dim=max_dim, waveform=waveform, authorization=authorization)

Fetch an indexed media item's bytes (images normalized to JPEG)

Return the bytes for a blob_id (JPEG, normalized to max_dim; 0 = raw
bytes). Scoped keys can only fetch their own customer's items; other
customers' blobs are a 404 (never an existence leak).

?waveform=1 renders an audio blob's waveform as a PNG (ffmpeg showwavespic)
so clients can show a real visual for audio hits without decoding the clip
in the browser.

### Example


```python
import fever_client
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.MediaApi(api_client)
    blob_id = 56 # int | 
    max_dim = 1280 # int |  (optional) (default to 1280)
    waveform = 0 # int |  (optional) (default to 0)
    authorization = 'authorization_example' # str |  (optional)

    try:
        # Fetch an indexed media item's bytes (images normalized to JPEG)
        api_response = await api_instance.get_media_bytes(blob_id, max_dim=max_dim, waveform=waveform, authorization=authorization)
        print("The response of MediaApi->get_media_bytes:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MediaApi->get_media_bytes: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blob_id** | **int**|  | 
 **max_dim** | **int**|  | [optional] [default to 1280]
 **waveform** | **int**|  | [optional] [default to 0]
 **authorization** | **str**|  | [optional] 

### Return type

**object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, image/jpeg, image/png

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_media_info**
> MediaInfo get_media_info(blob_id, customer_id=customer_id, authorization=authorization)

Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts

Unified record for a blob_id. Scoped keys can only read their own
customer's blobs; other customers' blobs are a 404 (never an existence
leak). Admin keys may narrow with ?customer_id=.

### Example


```python
import fever_client
from fever_client.models.media_info import MediaInfo
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.MediaApi(api_client)
    blob_id = 56 # int | 
    customer_id = 'customer_id_example' # str |  (optional)
    authorization = 'authorization_example' # str |  (optional)

    try:
        # Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts
        api_response = await api_instance.get_media_info(blob_id, customer_id=customer_id, authorization=authorization)
        print("The response of MediaApi->get_media_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MediaApi->get_media_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blob_id** | **int**|  | 
 **customer_id** | **str**|  | [optional] 
 **authorization** | **str**|  | [optional] 

### Return type

[**MediaInfo**](MediaInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_media_formats**
> MediaFormats list_media_formats(authorization=authorization)

Ingest capability: supported extensions per media family

### Example


```python
import fever_client
from fever_client.models.media_formats import MediaFormats
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.MediaApi(api_client)
    authorization = 'authorization_example' # str |  (optional)

    try:
        # Ingest capability: supported extensions per media family
        api_response = await api_instance.list_media_formats(authorization=authorization)
        print("The response of MediaApi->list_media_formats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MediaApi->list_media_formats: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **str**|  | [optional] 

### Return type

[**MediaFormats**](MediaFormats.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_media_frames**
> List[MediaFrame] list_media_frames(blob_id, customer_id=customer_id, authorization=authorization)

Sampled video frames for a parent blob

### Example


```python
import fever_client
from fever_client.models.media_frame import MediaFrame
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.MediaApi(api_client)
    blob_id = 56 # int | 
    customer_id = 'customer_id_example' # str |  (optional)
    authorization = 'authorization_example' # str |  (optional)

    try:
        # Sampled video frames for a parent blob
        api_response = await api_instance.list_media_frames(blob_id, customer_id=customer_id, authorization=authorization)
        print("The response of MediaApi->list_media_frames:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MediaApi->list_media_frames: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blob_id** | **int**|  | 
 **customer_id** | **str**|  | [optional] 
 **authorization** | **str**|  | [optional] 

### Return type

[**List[MediaFrame]**](MediaFrame.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_media_transcript**
> List[TranscriptSegment] list_media_transcript(blob_id, customer_id=customer_id, authorization=authorization)

Whisper transcript segments for a parent blob (audio or video)

### Example


```python
import fever_client
from fever_client.models.transcript_segment import TranscriptSegment
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)


# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.MediaApi(api_client)
    blob_id = 56 # int | 
    customer_id = 'customer_id_example' # str |  (optional)
    authorization = 'authorization_example' # str |  (optional)

    try:
        # Whisper transcript segments for a parent blob (audio or video)
        api_response = await api_instance.list_media_transcript(blob_id, customer_id=customer_id, authorization=authorization)
        print("The response of MediaApi->list_media_transcript:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MediaApi->list_media_transcript: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blob_id** | **int**|  | 
 **customer_id** | **str**|  | [optional] 
 **authorization** | **str**|  | [optional] 

### Return type

[**List[TranscriptSegment]**](TranscriptSegment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

