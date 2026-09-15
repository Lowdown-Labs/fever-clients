# SearchHit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_id** | **i32** |  | 
**caption** | Option<**String**> |  | [optional]
**customer_id** | Option<**String**> |  | [optional]
**duplicate_count** | Option<**i32**> | Number of near-duplicates collapsed into this hit. | [optional][default to 0]
**duplicates** | Option<**Vec<i32>**> | blob_ids of near-duplicates collapsed into this hit. | [optional]
**geo_label** | Option<**String**> | Reverse-geocode label from EXIF GPS (e.g. 'Lisbon, PT'), when the asset carries intact camera coordinates (the geo:<label> tag rides alongside). | [optional]
**headline** | Option<**String**> | Lexical FTS highlight (ts_headline) when the hit came via full-text search. | [optional]
**height** | Option<**i32**> | Stored media height in pixels, when known. | [optional]
**kind** | Option<**Kind**> | Media kind of this hit's parent blob. (enum: image, video, audio, pdf, doc, note) | [optional]
**media_ref** | Option<**String**> | s3:// URI of the matched media item. | [optional]
**metadata** | Option<**std::collections::HashMap<String, serde_json::Value>**> |  | [optional]
**score** | **f64** | For score_type 'rerank' this is the model's match probability in [0,1] (a calibrated confidence); 'cosine' is vector similarity; 'rrf' is a lexical rank score. | 
**score_type** | **ScoreType** |  (enum: cosine, cosine+lex, rrf, rerank) | 
**seek_ms** | Option<**i32**> | For video hits: timestamp of the winning frame, for seek-to-moment playback. | [optional]
**span** | Option<[**models::MediaSpan**](MediaSpan.md)> | For transcript hits: the matching whisper segment, with literal text for highlighting. | [optional]
**span_headline** | Option<**String**> | Lexical FTS highlight (ts_headline) of the winning transcript segment. | [optional]
**tags** | Option<**Vec<String>**> | Tags on this item: client-supplied at ingest and/or the appliance's zero-shot autotags. | [optional]
**width** | Option<**i32**> | Stored media width in pixels, when known. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


