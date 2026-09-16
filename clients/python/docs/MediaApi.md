# fever_client.MediaApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**associate_media**](MediaApi.md#associate_media) | **POST** /v1/media/{blob_id}/associate | Set a blob&#39;s collection and/or parent association (e.g. attach a LiDAR scan to its source photo)
[**get_media_bytes**](MediaApi.md#get_media_bytes) | **GET** /v1/media/{blob_id}/bytes | Fetch an indexed media item&#39;s bytes (images normalized to JPEG)
[**get_media_info**](MediaApi.md#get_media_info) | **GET** /v1/media/{blob_id} | Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts
[**list_media_formats**](MediaApi.md#list_media_formats) | **GET** /v1/media/formats | Ingest capability: supported extensions per media family
[**list_media_frames**](MediaApi.md#list_media_frames) | **GET** /v1/media/{blob_id}/frames | Sampled video frames for a parent blob
[**list_media_transcript**](MediaApi.md#list_media_transcript) | **GET** /v1/media/{blob_id}/transcript | Whisper transcript segments for a parent blob (audio or video)


# **associate_media**
> MediaInfo associate_media(blob_id, associate_request, customer_id=customer_id)

Set a blob's collection and/or parent association (e.g. attach a LiDAR scan to its source photo)

Fill the relational columns after ingest (the SOR-driven import flow):
collection_id groups assets under a client-owned project; parent_ref ties a
companion asset (LiDAR, transcript, alternate capture) to its parent. Values
are COALESCE-updates - present fields win, omitted fields stay. Re-ingesting
the same content with the fields set does the same thing through the upsert.

### Example

* Bearer Authentication (bearerAuth):

```python
import fever_client
from fever_client.models.associate_request import AssociateRequest
from fever_client.models.media_info import MediaInfo
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.MediaApi(api_client)
    blob_id = 56 # int | 
    associate_request = fever_client.AssociateRequest() # AssociateRequest | 
    customer_id = 'customer_id_example' # str |  (optional)

    try:
        # Set a blob's collection and/or parent association (e.g. attach a LiDAR scan to its source photo)
        api_response = await api_instance.associate_media(blob_id, associate_request, customer_id=customer_id)
        print("The response of MediaApi->associate_media:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MediaApi->associate_media: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **blob_id** | **int**|  | 
 **associate_request** | [**AssociateRequest**](AssociateRequest.md)|  | 
 **customer_id** | **str**|  | [optional] 

### Return type

[**MediaInfo**](MediaInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_media_bytes**
> object get_media_bytes(blob_id, max_dim=max_dim, waveform=waveform)

Fetch an indexed media item's bytes (images normalized to JPEG)

Return the bytes for a blob_id (JPEG, normalized to max_dim; 0 = raw
bytes). Scoped keys can only fetch their own customer's items; other
customers' blobs are a 404 (never an existence leak).

?waveform=1 renders an audio blob's waveform as a PNG (ffmpeg showwavespic)
so clients can show a real visual for audio hits without decoding the clip
in the browser.

### Example

* Bearer Authentication (bearerAuth):

```python
import fever_client
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.MediaApi(api_client)
    blob_id = 56 # int | 
    max_dim = 1280 # int |  (optional) (default to 1280)
    waveform = 0 # int |  (optional) (default to 0)

    try:
        # Fetch an indexed media item's bytes (images normalized to JPEG)
        api_response = await api_instance.get_media_bytes(blob_id, max_dim=max_dim, waveform=waveform)
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

### Return type

**object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

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
> MediaInfo get_media_info(blob_id, customer_id=customer_id)

Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts

Unified record for a blob_id. Scoped keys can only read their own
customer's blobs; other customers' blobs are a 404 (never an existence
leak). Admin keys may narrow with ?customer_id=.

### Example

* Bearer Authentication (bearerAuth):

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

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.MediaApi(api_client)
    blob_id = 56 # int | 
    customer_id = 'customer_id_example' # str |  (optional)

    try:
        # Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts
        api_response = await api_instance.get_media_info(blob_id, customer_id=customer_id)
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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_media_formats**
> MediaFormats list_media_formats()

Ingest capability: supported extensions per media family

### Example

* Bearer Authentication (bearerAuth):

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

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.MediaApi(api_client)

    try:
        # Ingest capability: supported extensions per media family
        api_response = await api_instance.list_media_formats()
        print("The response of MediaApi->list_media_formats:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling MediaApi->list_media_formats: %s\n" % e)
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
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_media_frames**
> List[MediaFrame] list_media_frames(blob_id, customer_id=customer_id)

Sampled video frames for a parent blob

### Example

* Bearer Authentication (bearerAuth):

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

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.MediaApi(api_client)
    blob_id = 56 # int | 
    customer_id = 'customer_id_example' # str |  (optional)

    try:
        # Sampled video frames for a parent blob
        api_response = await api_instance.list_media_frames(blob_id, customer_id=customer_id)
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

### Return type

[**List[MediaFrame]**](MediaFrame.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

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
> List[TranscriptSegment] list_media_transcript(blob_id, customer_id=customer_id)

Whisper transcript segments for a parent blob (audio or video)

### Example

* Bearer Authentication (bearerAuth):

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

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.MediaApi(api_client)
    blob_id = 56 # int | 
    customer_id = 'customer_id_example' # str |  (optional)

    try:
        # Whisper transcript segments for a parent blob (audio or video)
        api_response = await api_instance.list_media_transcript(blob_id, customer_id=customer_id)
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

### Return type

[**List[TranscriptSegment]**](TranscriptSegment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

