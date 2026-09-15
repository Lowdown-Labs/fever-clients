# LowdownLabs.Fever.Model.MediaInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BlobId** | **int** |  | 
**Caption** | **string** | The user_text caption/keywords supplied at ingest. | [optional] 
**CapturedAt** | **DateTime?** | EXIF capture time. | [optional] 
**CustomerId** | **string** |  | [optional] 
**Device** | **string** | EXIF camera make/model. | [optional] 
**ExternalRef** | **string** | s3:// URI of the stored original. | [optional] 
**FrameCount** | **int** | Sampled video frames derived from this blob. | [optional] [default to 0]
**GpsLat** | **decimal?** |  | [optional] 
**GpsLon** | **decimal?** |  | [optional] 
**Kind** | **string** | Media kind of this blob (image/video/audio/pdf/doc/note). | [optional] 
**Metadata** | **Dictionary&lt;string, Object&gt;** |  | [optional] 
**OcrText** | **string** | Text OCR&#39;d out of the item (PDF pages always, photos when enabled). | [optional] 
**Synthetic** | **decimal?** | Likely-AI score in [0,1] (FEVER_SYNTHETIC), when scored. | [optional] 
**Tags** | **List&lt;string&gt;** | Client-supplied tags merged with zero-shot autotags. | [optional] 
**TranscriptSegments** | **int** | Whisper transcript segments derived from this blob. | [optional] [default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

