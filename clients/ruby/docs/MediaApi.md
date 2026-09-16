# FeverClient::MediaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**associate_media**](MediaApi.md#associate_media) | **POST** /v1/media/{blob_id}/associate | Set a blob&#39;s collection and/or parent association (e.g. attach a LiDAR scan to its source photo) |
| [**get_media_bytes**](MediaApi.md#get_media_bytes) | **GET** /v1/media/{blob_id}/bytes | Fetch an indexed media item&#39;s bytes (images normalized to JPEG) |
| [**get_media_info**](MediaApi.md#get_media_info) | **GET** /v1/media/{blob_id} | Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts |
| [**list_media_formats**](MediaApi.md#list_media_formats) | **GET** /v1/media/formats | Ingest capability: supported extensions per media family |
| [**list_media_frames**](MediaApi.md#list_media_frames) | **GET** /v1/media/{blob_id}/frames | Sampled video frames for a parent blob |
| [**list_media_transcript**](MediaApi.md#list_media_transcript) | **GET** /v1/media/{blob_id}/transcript | Whisper transcript segments for a parent blob (audio or video) |


## associate_media

> <MediaInfo> associate_media(blob_id, associate_request, opts)

Set a blob's collection and/or parent association (e.g. attach a LiDAR scan to its source photo)

Fill the relational columns after ingest (the SOR-driven import flow): collection_id groups assets under a client-owned project; parent_ref ties a companion asset (LiDAR, transcript, alternate capture) to its parent. Values are COALESCE-updates - present fields win, omitted fields stay. Re-ingesting the same content with the fields set does the same thing through the upsert.

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::MediaApi.new
blob_id = 56 # Integer | 
associate_request = FeverClient::AssociateRequest.new # AssociateRequest | 
opts = {
  customer_id: 'customer_id_example' # String | 
}

begin
  # Set a blob's collection and/or parent association (e.g. attach a LiDAR scan to its source photo)
  result = api_instance.associate_media(blob_id, associate_request, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling MediaApi->associate_media: #{e}"
end
```

#### Using the associate_media_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MediaInfo>, Integer, Hash)> associate_media_with_http_info(blob_id, associate_request, opts)

```ruby
begin
  # Set a blob's collection and/or parent association (e.g. attach a LiDAR scan to its source photo)
  data, status_code, headers = api_instance.associate_media_with_http_info(blob_id, associate_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MediaInfo>
rescue FeverClient::ApiError => e
  puts "Error when calling MediaApi->associate_media_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **blob_id** | **Integer** |  |  |
| **associate_request** | [**AssociateRequest**](AssociateRequest.md) |  |  |
| **customer_id** | **String** |  | [optional] |

### Return type

[**MediaInfo**](MediaInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_media_bytes

> Object get_media_bytes(blob_id, opts)

Fetch an indexed media item's bytes (images normalized to JPEG)

Return the bytes for a blob_id (JPEG, normalized to max_dim; 0 = raw bytes). Scoped keys can only fetch their own customer's items; other customers' blobs are a 404 (never an existence leak).  ?waveform=1 renders an audio blob's waveform as a PNG (ffmpeg showwavespic) so clients can show a real visual for audio hits without decoding the clip in the browser.

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::MediaApi.new
blob_id = 56 # Integer | 
opts = {
  max_dim: 56, # Integer | 
  waveform: 56 # Integer | 
}

begin
  # Fetch an indexed media item's bytes (images normalized to JPEG)
  result = api_instance.get_media_bytes(blob_id, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling MediaApi->get_media_bytes: #{e}"
end
```

#### Using the get_media_bytes_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Object, Integer, Hash)> get_media_bytes_with_http_info(blob_id, opts)

```ruby
begin
  # Fetch an indexed media item's bytes (images normalized to JPEG)
  data, status_code, headers = api_instance.get_media_bytes_with_http_info(blob_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Object
rescue FeverClient::ApiError => e
  puts "Error when calling MediaApi->get_media_bytes_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **blob_id** | **Integer** |  |  |
| **max_dim** | **Integer** |  | [optional][default to 1280] |
| **waveform** | **Integer** |  | [optional][default to 0] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, image/jpeg, image/png


## get_media_info

> <MediaInfo> get_media_info(blob_id, opts)

Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts

Unified record for a blob_id. Scoped keys can only read their own customer's blobs; other customers' blobs are a 404 (never an existence leak). Admin keys may narrow with ?customer_id=.

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::MediaApi.new
blob_id = 56 # Integer | 
opts = {
  customer_id: 'customer_id_example' # String | 
}

begin
  # Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts
  result = api_instance.get_media_info(blob_id, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling MediaApi->get_media_info: #{e}"
end
```

#### Using the get_media_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MediaInfo>, Integer, Hash)> get_media_info_with_http_info(blob_id, opts)

```ruby
begin
  # Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts
  data, status_code, headers = api_instance.get_media_info_with_http_info(blob_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MediaInfo>
rescue FeverClient::ApiError => e
  puts "Error when calling MediaApi->get_media_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **blob_id** | **Integer** |  |  |
| **customer_id** | **String** |  | [optional] |

### Return type

[**MediaInfo**](MediaInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_media_formats

> <MediaFormats> list_media_formats

Ingest capability: supported extensions per media family

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::MediaApi.new

begin
  # Ingest capability: supported extensions per media family
  result = api_instance.list_media_formats
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling MediaApi->list_media_formats: #{e}"
end
```

#### Using the list_media_formats_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MediaFormats>, Integer, Hash)> list_media_formats_with_http_info

```ruby
begin
  # Ingest capability: supported extensions per media family
  data, status_code, headers = api_instance.list_media_formats_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MediaFormats>
rescue FeverClient::ApiError => e
  puts "Error when calling MediaApi->list_media_formats_with_http_info: #{e}"
end
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


## list_media_frames

> <Array<MediaFrame>> list_media_frames(blob_id, opts)

Sampled video frames for a parent blob

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::MediaApi.new
blob_id = 56 # Integer | 
opts = {
  customer_id: 'customer_id_example' # String | 
}

begin
  # Sampled video frames for a parent blob
  result = api_instance.list_media_frames(blob_id, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling MediaApi->list_media_frames: #{e}"
end
```

#### Using the list_media_frames_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<MediaFrame>>, Integer, Hash)> list_media_frames_with_http_info(blob_id, opts)

```ruby
begin
  # Sampled video frames for a parent blob
  data, status_code, headers = api_instance.list_media_frames_with_http_info(blob_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<MediaFrame>>
rescue FeverClient::ApiError => e
  puts "Error when calling MediaApi->list_media_frames_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **blob_id** | **Integer** |  |  |
| **customer_id** | **String** |  | [optional] |

### Return type

[**Array&lt;MediaFrame&gt;**](MediaFrame.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_media_transcript

> <Array<TranscriptSegment>> list_media_transcript(blob_id, opts)

Whisper transcript segments for a parent blob (audio or video)

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::MediaApi.new
blob_id = 56 # Integer | 
opts = {
  customer_id: 'customer_id_example' # String | 
}

begin
  # Whisper transcript segments for a parent blob (audio or video)
  result = api_instance.list_media_transcript(blob_id, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling MediaApi->list_media_transcript: #{e}"
end
```

#### Using the list_media_transcript_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<TranscriptSegment>>, Integer, Hash)> list_media_transcript_with_http_info(blob_id, opts)

```ruby
begin
  # Whisper transcript segments for a parent blob (audio or video)
  data, status_code, headers = api_instance.list_media_transcript_with_http_info(blob_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<TranscriptSegment>>
rescue FeverClient::ApiError => e
  puts "Error when calling MediaApi->list_media_transcript_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **blob_id** | **Integer** |  |  |
| **customer_id** | **String** |  | [optional] |

### Return type

[**Array&lt;TranscriptSegment&gt;**](TranscriptSegment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

