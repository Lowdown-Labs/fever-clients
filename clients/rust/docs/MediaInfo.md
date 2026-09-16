# MediaInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | Option<[**Vec<models::MediaAttachment>**](MediaAttachment.md)> | Related items pointing at this blob via parent_ref (e.g. a LiDAR scan attached to the photo or video it belongs to). | [optional]
**blob_id** | **i32** |  | 
**caption** | Option<**String**> | The user_text caption/keywords supplied at ingest. | [optional]
**captured_at** | Option<**chrono::DateTime<chrono::FixedOffset>**> | EXIF capture time. | [optional]
**collection_id** | Option<**String**> | Collection this item was grouped under at ingest, if any. | [optional]
**customer_id** | Option<**String**> |  | [optional]
**device** | Option<**String**> | EXIF camera make/model. | [optional]
**external_ref** | Option<**String**> | s3:// URI of the stored original. | [optional]
**frame_count** | Option<**i32**> | Sampled video frames derived from this blob. | [optional][default to 0]
**gps_lat** | Option<**f64**> |  | [optional]
**gps_lon** | Option<**f64**> |  | [optional]
**kind** | Option<**Kind**> | Media kind of this blob (image/video/audio/pdf/doc/note/lidar). (enum: image, video, audio, pdf, doc, note, lidar) | [optional]
**metadata** | Option<**std::collections::HashMap<String, serde_json::Value>**> |  | [optional]
**ocr_text** | Option<**String**> | Text OCR'd out of the item (PDF pages always, photos when enabled). | [optional]
**parent_ref** | Option<**String**> | Pointer to this item's related parent asset, if declared. | [optional]
**synthetic** | Option<**f64**> | Likely-AI score in [0,1] (FEVER_SYNTHETIC), when scored. | [optional]
**tags** | Option<**Vec<String>**> | Client-supplied tags merged with zero-shot autotags. | [optional]
**transcript_segments** | Option<**i32**> | Whisper transcript segments derived from this blob. | [optional][default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


