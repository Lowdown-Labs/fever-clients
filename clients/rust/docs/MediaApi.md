# \MediaApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**associate_media**](MediaApi.md#associate_media) | **POST** /v1/media/{blob_id}/associate | Set a blob's collection and/or parent association (e.g. attach a LiDAR scan to its source photo)
[**get_media_bytes**](MediaApi.md#get_media_bytes) | **GET** /v1/media/{blob_id}/bytes | Fetch an indexed media item's bytes (images normalized to JPEG)
[**get_media_info**](MediaApi.md#get_media_info) | **GET** /v1/media/{blob_id} | Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts
[**list_media_formats**](MediaApi.md#list_media_formats) | **GET** /v1/media/formats | Ingest capability: supported extensions per media family
[**list_media_frames**](MediaApi.md#list_media_frames) | **GET** /v1/media/{blob_id}/frames | Sampled video frames for a parent blob
[**list_media_transcript**](MediaApi.md#list_media_transcript) | **GET** /v1/media/{blob_id}/transcript | Whisper transcript segments for a parent blob (audio or video)



## associate_media

> models::MediaInfo associate_media(blob_id, associate_request, customer_id)
Set a blob's collection and/or parent association (e.g. attach a LiDAR scan to its source photo)

Fill the relational columns after ingest (the SOR-driven import flow): collection_id groups assets under a client-owned project; parent_ref ties a companion asset (LiDAR, transcript, alternate capture) to its parent. Values are COALESCE-updates - present fields win, omitted fields stay. Re-ingesting the same content with the fields set does the same thing through the upsert.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**blob_id** | **i32** |  | [required] |
**associate_request** | [**AssociateRequest**](AssociateRequest.md) |  | [required] |
**customer_id** | Option<**String**> |  |  |

### Return type

[**models::MediaInfo**](MediaInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_media_bytes

> serde_json::Value get_media_bytes(blob_id, max_dim, waveform)
Fetch an indexed media item's bytes (images normalized to JPEG)

Return the bytes for a blob_id (JPEG, normalized to max_dim; 0 = raw bytes). Scoped keys can only fetch their own customer's items; other customers' blobs are a 404 (never an existence leak).  ?waveform=1 renders an audio blob's waveform as a PNG (ffmpeg showwavespic) so clients can show a real visual for audio hits without decoding the clip in the browser.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**blob_id** | **i32** |  | [required] |
**max_dim** | Option<**i32**> |  |  |[default to 1280]
**waveform** | Option<**i32**> |  |  |[default to 0]

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, image/jpeg, image/png

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## get_media_info

> models::MediaInfo get_media_info(blob_id, customer_id)
Everything known about a blob: annotations, EXIF summary, media kind, derived artifact counts

Unified record for a blob_id. Scoped keys can only read their own customer's blobs; other customers' blobs are a 404 (never an existence leak). Admin keys may narrow with ?customer_id=.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**blob_id** | **i32** |  | [required] |
**customer_id** | Option<**String**> |  |  |

### Return type

[**models::MediaInfo**](MediaInfo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_media_formats

> models::MediaFormats list_media_formats()
Ingest capability: supported extensions per media family

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::MediaFormats**](MediaFormats.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_media_frames

> Vec<models::MediaFrame> list_media_frames(blob_id, customer_id)
Sampled video frames for a parent blob

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**blob_id** | **i32** |  | [required] |
**customer_id** | Option<**String**> |  |  |

### Return type

[**Vec<models::MediaFrame>**](MediaFrame.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_media_transcript

> Vec<models::TranscriptSegment> list_media_transcript(blob_id, customer_id)
Whisper transcript segments for a parent blob (audio or video)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**blob_id** | **i32** |  | [required] |
**customer_id** | Option<**String**> |  |  |

### Return type

[**Vec<models::TranscriptSegment>**](TranscriptSegment.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

