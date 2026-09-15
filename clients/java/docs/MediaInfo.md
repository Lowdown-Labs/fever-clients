

# MediaInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blobId** | **Integer** |  |  |
|**caption** | **String** | The user_text caption/keywords supplied at ingest. |  [optional] |
|**capturedAt** | **OffsetDateTime** | EXIF capture time. |  [optional] |
|**customerId** | **String** |  |  [optional] |
|**device** | **String** | EXIF camera make/model. |  [optional] |
|**externalRef** | **String** | s3:// URI of the stored original. |  [optional] |
|**frameCount** | **Integer** | Sampled video frames derived from this blob. |  [optional] |
|**gpsLat** | **BigDecimal** |  |  [optional] |
|**gpsLon** | **BigDecimal** |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | Media kind of this blob (image/video/audio/pdf/doc/note). |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**ocrText** | **String** | Text OCR&#39;d out of the item (PDF pages always, photos when enabled). |  [optional] |
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



