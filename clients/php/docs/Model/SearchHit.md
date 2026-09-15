# SearchHit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_id** | **int** |  |
**caption** | **string** |  | [optional]
**customer_id** | **string** |  | [optional]
**duplicate_count** | **int** | Number of near-duplicates collapsed into this hit. | [optional] [default to 0]
**duplicates** | **int[]** | blob_ids of near-duplicates collapsed into this hit. | [optional]
**geo_label** | **string** | Reverse-geocode label from EXIF GPS (e.g. &#39;Lisbon, PT&#39;), when the asset carries intact camera coordinates (the geo:&lt;label&gt; tag rides alongside). | [optional]
**headline** | **string** | Lexical FTS highlight (ts_headline) when the hit came via full-text search. | [optional]
**height** | **int** | Stored media height in pixels, when known. | [optional]
**kind** | **string** | Media kind of this hit&#39;s parent blob. | [optional]
**media_ref** | **string** | s3:// URI of the matched media item. | [optional]
**metadata** | **array<string,mixed>** |  | [optional]
**score** | **float** | For score_type &#39;rerank&#39; this is the model&#39;s match probability in [0,1] (a calibrated confidence); &#39;cosine&#39; is vector similarity; &#39;rrf&#39; is a lexical rank score. |
**score_type** | **string** |  |
**seek_ms** | **int** | For video hits: timestamp of the winning frame, for seek-to-moment playback. | [optional]
**span** | [**\LowdownLabs\Fever\Model\MediaSpan**](MediaSpan.md) | For transcript hits: the matching whisper segment, with literal text for highlighting. | [optional]
**span_headline** | **string** | Lexical FTS highlight (ts_headline) of the winning transcript segment. | [optional]
**tags** | **string[]** | Tags on this item: client-supplied at ingest and/or the appliance&#39;s zero-shot autotags. | [optional]
**width** | **int** | Stored media width in pixels, when known. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
