# FeverClient::SearchHit

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **blob_id** | **Integer** |  |  |
| **caption** | **String** |  | [optional] |
| **collection_id** | **String** | Collection this item was grouped under at ingest, if any. | [optional] |
| **customer_id** | **String** |  | [optional] |
| **duplicate_count** | **Integer** | Number of near-duplicates collapsed into this hit. | [optional][default to 0] |
| **duplicates** | **Array&lt;Integer&gt;** | blob_ids of near-duplicates collapsed into this hit. | [optional] |
| **geo_label** | **String** | Reverse-geocode label from EXIF GPS (e.g. &#39;Lisbon, PT&#39;), when the asset carries intact camera coordinates (the geo:&lt;label&gt; tag rides alongside). | [optional] |
| **headline** | **String** | Lexical FTS highlight (ts_headline) when the hit came via full-text search. | [optional] |
| **height** | **Integer** | Stored media height in pixels, when known. | [optional] |
| **kind** | **String** | Media kind of this hit&#39;s parent blob. | [optional] |
| **media_ref** | **String** | s3:// URI of the matched media item. | [optional] |
| **metadata** | **Hash&lt;String, Object&gt;** |  | [optional] |
| **parent_ref** | **String** | Pointer to this item&#39;s related parent asset, if declared. | [optional] |
| **score** | **Float** | For score_type &#39;rerank&#39; this is the model&#39;s match probability in [0,1] (a calibrated confidence); &#39;cosine&#39; is vector similarity; &#39;rrf&#39; is a lexical rank score. |  |
| **score_type** | **String** |  |  |
| **seek_ms** | **Integer** | For video hits: timestamp of the winning frame, for seek-to-moment playback. | [optional] |
| **span** | [**MediaSpan**](MediaSpan.md) | For transcript hits: the matching whisper segment, with literal text for highlighting. | [optional] |
| **span_headline** | **String** | Lexical FTS highlight (ts_headline) of the winning transcript segment. | [optional] |
| **tags** | **Array&lt;String&gt;** | Tags on this item: client-supplied at ingest and/or the appliance&#39;s zero-shot autotags. | [optional] |
| **width** | **Integer** | Stored media width in pixels, when known. | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::SearchHit.new(
  blob_id: null,
  caption: null,
  collection_id: null,
  customer_id: null,
  duplicate_count: null,
  duplicates: null,
  geo_label: null,
  headline: null,
  height: null,
  kind: null,
  media_ref: null,
  metadata: null,
  parent_ref: null,
  score: null,
  score_type: null,
  seek_ms: null,
  span: null,
  span_headline: null,
  tags: null,
  width: null
)
```

