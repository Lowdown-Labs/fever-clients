

# SearchHit


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**blobId** | **Integer** |  |  |
|**caption** | **String** |  |  [optional] |
|**collectionId** | **String** | Collection this item was grouped under at ingest, if any. |  [optional] |
|**customerId** | **String** |  |  [optional] |
|**duplicateCount** | **Integer** | Number of near-duplicates collapsed into this hit. |  [optional] |
|**duplicates** | **List&lt;Integer&gt;** | blob_ids of near-duplicates collapsed into this hit. |  [optional] |
|**geoLabel** | **String** | Reverse-geocode label from EXIF GPS (e.g. &#39;Lisbon, PT&#39;), when the asset carries intact camera coordinates (the geo:&lt;label&gt; tag rides alongside). |  [optional] |
|**headline** | **String** | Lexical FTS highlight (ts_headline) when the hit came via full-text search. |  [optional] |
|**height** | **Integer** | Stored media height in pixels, when known. |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | Media kind of this hit&#39;s parent blob. |  [optional] |
|**mediaRef** | **String** | s3:// URI of the matched media item. |  [optional] |
|**metadata** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**parentRef** | **String** | Pointer to this item&#39;s related parent asset, if declared. |  [optional] |
|**score** | **BigDecimal** | For score_type &#39;rerank&#39; this is the model&#39;s match probability in [0,1] (a calibrated confidence); &#39;cosine&#39; is vector similarity; &#39;rrf&#39; is a lexical rank score. |  |
|**scoreType** | [**ScoreTypeEnum**](#ScoreTypeEnum) |  |  |
|**seekMs** | **Integer** | For video hits: timestamp of the winning frame, for seek-to-moment playback. |  [optional] |
|**span** | [**MediaSpan**](MediaSpan.md) | For transcript hits: the matching whisper segment, with literal text for highlighting. |  [optional] |
|**spanHeadline** | **String** | Lexical FTS highlight (ts_headline) of the winning transcript segment. |  [optional] |
|**tags** | **List&lt;String&gt;** | Tags on this item: client-supplied at ingest and/or the appliance&#39;s zero-shot autotags. |  [optional] |
|**width** | **Integer** | Stored media width in pixels, when known. |  [optional] |



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



## Enum: ScoreTypeEnum

| Name | Value |
|---- | -----|
| COSINE | &quot;cosine&quot; |
| COSINE_LEX | &quot;cosine+lex&quot; |
| RRF | &quot;rrf&quot; |
| RERANK | &quot;rerank&quot; |



