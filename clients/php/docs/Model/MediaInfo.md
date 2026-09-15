# MediaInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_id** | **int** |  |
**caption** | **string** | The user_text caption/keywords supplied at ingest. | [optional]
**captured_at** | **\DateTime** | EXIF capture time. | [optional]
**customer_id** | **string** |  | [optional]
**device** | **string** | EXIF camera make/model. | [optional]
**external_ref** | **string** | s3:// URI of the stored original. | [optional]
**frame_count** | **int** | Sampled video frames derived from this blob. | [optional] [default to 0]
**gps_lat** | **float** |  | [optional]
**gps_lon** | **float** |  | [optional]
**kind** | **string** | Media kind of this blob (image/video/audio/pdf/doc/note). | [optional]
**metadata** | **array<string,mixed>** |  | [optional]
**ocr_text** | **string** | Text OCR&#39;d out of the item (PDF pages always, photos when enabled). | [optional]
**synthetic** | **float** | Likely-AI score in [0,1] (FEVER_SYNTHETIC), when scored. | [optional]
**tags** | **string[]** | Client-supplied tags merged with zero-shot autotags. | [optional]
**transcript_segments** | **int** | Whisper transcript segments derived from this blob. | [optional] [default to 0]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
