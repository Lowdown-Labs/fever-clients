# LowdownLabs.Fever.Model.MediaInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachments** | [**List&lt;MediaAttachment&gt;**](MediaAttachment.md) | Related items pointing at this blob via parent_ref (e.g. a LiDAR scan attached to the photo or video it belongs to). | [optional] 
**BlobId** | **int** |  | 
**Caption** | **string** | The user_text caption/keywords supplied at ingest. | [optional] 
**CapturedAt** | **DateTime?** | EXIF capture time. | [optional] 
**CollectionId** | **string** | Collection this item was grouped under at ingest, if any. | [optional] 
**CustomerId** | **string** |  | [optional] 
**Device** | **string** | EXIF camera make/model. | [optional] 
**ExternalRef** | **string** | s3:// URI of the stored original. | [optional] 
**FrameCount** | **int** | Sampled video frames derived from this blob. | [optional] [default to 0]
**GpsLat** | **decimal?** |  | [optional] 
**GpsLon** | **decimal?** |  | [optional] 
**Kind** | **string** | Media kind of this blob (image/video/audio/pdf/doc/note/lidar). | [optional] 
**Metadata** | **Dictionary&lt;string, Object&gt;** |  | [optional] 
**OcrText** | **string** | Text OCR&#39;d out of the item (PDF pages always, photos when enabled). | [optional] 
**ParentRef** | **string** | Pointer to this item&#39;s related parent asset, if declared. | [optional] 
**Synthetic** | **decimal?** | Likely-AI score in [0,1] (FEVER_SYNTHETIC), when scored. | [optional] 
**Tags** | **List&lt;string&gt;** | Client-supplied tags merged with zero-shot autotags. | [optional] 
**TranscriptSegments** | **int** | Whisper transcript segments derived from this blob. | [optional] [default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

