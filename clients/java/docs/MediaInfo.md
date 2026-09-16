

# MediaInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attachments** | [**List&lt;MediaAttachment&gt;**](MediaAttachment.md) | Related items pointing at this blob via parent_ref (e.g. a LiDAR scan attached to the photo or video it belongs to). |  [optional] |
|**blobId** | **Integer** |  |  |
|**caption** | **String** | The user_text caption/keywords supplied at ingest. |  [optional] |
|**capturedAt** | **OffsetDateTime** | EXIF capture time. |  [optional] |
|**collectionId** | **String** | Collection this item was grouped under at ingest, if any. |  [optional] |
|**customerId** | **String** |  |  [optional] |
|**device** | **String** | EXIF camera make/model. |  [optional] |
|**externalRef** | **String** | s3:// URI of the stored original. |  [optional] |
|**frameCount** | **Integer** | Sampled video frames derived from this blob. |  [optional] |
|**gpsLat** | **BigDecimal** |  |  [optional] |
|**gpsLon** | **BigDecimal** |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | Media kind of this blob (image/video/audio/pdf/doc/note/lidar). |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**ocrText** | **String** | Text OCR&#39;d out of the item (PDF pages always, photos when enabled). |  [optional] |
|**parentRef** | **String** | Pointer to this item&#39;s related parent asset, if declared. |  [optional] |
|**synthetic** | **BigDecimal** | Likely-AI score in [0,1] (FEVER_SYNTHETIC), when scored. |  [optional] |
|**tags** | **List&lt;String&gt;** | Client-supplied tags merged with zero-shot autotags. |  [optional] |
|**transcriptSegments** | **Integer** | Whisper transcript segments derived from this blob. |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| IMAGE | &quot;image&quot; |
| VIDEO | &quot;video&quot; |
| AUDIO | &quot;audio&quot; |
| PDF | &quot;pdf&quot; |
| DOC | &quot;doc&quot; |
| NOTE | &quot;note&quot; |
| LIDAR | &quot;lidar&quot; |



