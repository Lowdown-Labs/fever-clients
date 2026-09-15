# LowdownLabs.Fever.Model.SearchHit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BlobId** | **int** |  | 
**Caption** | **string** |  | [optional] 
**CustomerId** | **string** |  | [optional] 
**DuplicateCount** | **int** | Number of near-duplicates collapsed into this hit. | [optional] [default to 0]
**Duplicates** | **List&lt;int&gt;** | blob_ids of near-duplicates collapsed into this hit. | [optional] 
**GeoLabel** | **string** | Reverse-geocode label from EXIF GPS (e.g. &#39;Lisbon, PT&#39;), when the asset carries intact camera coordinates (the geo:&lt;label&gt; tag rides alongside). | [optional] 
**Headline** | **string** | Lexical FTS highlight (ts_headline) when the hit came via full-text search. | [optional] 
**Height** | **int?** | Stored media height in pixels, when known. | [optional] 
**Kind** | **string** | Media kind of this hit&#39;s parent blob. | [optional] 
**MediaRef** | **string** | s3:// URI of the matched media item. | [optional] 
**Metadata** | **Dictionary&lt;string, Object&gt;** |  | [optional] 
**Score** | **decimal** | For score_type &#39;rerank&#39; this is the model&#39;s match probability in [0,1] (a calibrated confidence); &#39;cosine&#39; is vector similarity; &#39;rrf&#39; is a lexical rank score. | 
**ScoreType** | **string** |  | 
**SeekMs** | **int?** | For video hits: timestamp of the winning frame, for seek-to-moment playback. | [optional] 
**Span** | [**MediaSpan**](MediaSpan.md) | For transcript hits: the matching whisper segment, with literal text for highlighting. | [optional] 
**SpanHeadline** | **string** | Lexical FTS highlight (ts_headline) of the winning transcript segment. | [optional] 
**Tags** | **List&lt;string&gt;** | Tags on this item: client-supplied at ingest and/or the appliance&#39;s zero-shot autotags. | [optional] 
**Width** | **int?** | Stored media width in pixels, when known. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

