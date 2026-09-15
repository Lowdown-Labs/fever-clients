# FeverClient::MediaInfo

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **blob_id** | **Integer** |  |  |
| **caption** | **String** | The user_text caption/keywords supplied at ingest. | [optional] |
| **captured_at** | **Time** | EXIF capture time. | [optional] |
| **customer_id** | **String** |  | [optional] |
| **device** | **String** | EXIF camera make/model. | [optional] |
| **external_ref** | **String** | s3:// URI of the stored original. | [optional] |
| **frame_count** | **Integer** | Sampled video frames derived from this blob. | [optional][default to 0] |
| **gps_lat** | **Float** |  | [optional] |
| **gps_lon** | **Float** |  | [optional] |
| **kind** | **String** | Media kind of this blob (image/video/audio/pdf/doc/note). | [optional] |
| **metadata** | **Hash&lt;String, Object&gt;** |  | [optional] |
| **ocr_text** | **String** | Text OCR&#39;d out of the item (PDF pages always, photos when enabled). | [optional] |
| **synthetic** | **Float** | Likely-AI score in [0,1] (FEVER_SYNTHETIC), when scored. | [optional] |
| **tags** | **Array&lt;String&gt;** | Client-supplied tags merged with zero-shot autotags. | [optional] |
| **transcript_segments** | **Integer** | Whisper transcript segments derived from this blob. | [optional][default to 0] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::MediaInfo.new(
  blob_id: null,
  caption: null,
  captured_at: null,
  customer_id: null,
  device: null,
  external_ref: null,
  frame_count: null,
  gps_lat: null,
  gps_lon: null,
  kind: null,
  metadata: null,
  ocr_text: null,
  synthetic: null,
  tags: null,
  transcript_segments: null
)
```

