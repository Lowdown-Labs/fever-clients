# SearchHit


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_id** | **int** |  | 
**caption** | **str** |  | [optional] 
**collection_id** | **str** | Collection this item was grouped under at ingest, if any. | [optional] 
**customer_id** | **str** |  | [optional] 
**duplicate_count** | **int** | Number of near-duplicates collapsed into this hit. | [optional] [default to 0]
**duplicates** | **List[int]** | blob_ids of near-duplicates collapsed into this hit. | [optional] 
**geo_label** | **str** | Reverse-geocode label from EXIF GPS (e.g. &#39;Lisbon, PT&#39;), when the asset carries intact camera coordinates (the geo:&lt;label&gt; tag rides alongside). | [optional] 
**headline** | **str** | Lexical FTS highlight (ts_headline) when the hit came via full-text search. | [optional] 
**height** | **int** | Stored media height in pixels, when known. | [optional] 
**kind** | **str** | Media kind of this hit&#39;s parent blob. | [optional] 
**media_ref** | **str** | s3:// URI of the matched media item. | [optional] 
**metadata** | **Dict[str, object]** |  | [optional] 
**parent_ref** | **str** | Pointer to this item&#39;s related parent asset, if declared. | [optional] 
**score** | **float** | For score_type &#39;rerank&#39; this is the model&#39;s match probability in [0,1] (a calibrated confidence); &#39;cosine&#39; is vector similarity; &#39;rrf&#39; is a lexical rank score. | 
**score_type** | **str** |  | 
**seek_ms** | **int** | For video hits: timestamp of the winning frame, for seek-to-moment playback. | [optional] 
**span** | [**MediaSpan**](MediaSpan.md) | For transcript hits: the matching whisper segment, with literal text for highlighting. | [optional] 
**span_headline** | **str** | Lexical FTS highlight (ts_headline) of the winning transcript segment. | [optional] 
**tags** | **List[str]** | Tags on this item: client-supplied at ingest and/or the appliance&#39;s zero-shot autotags. | [optional] 
**width** | **int** | Stored media width in pixels, when known. | [optional] 

## Example

```python
from fever_client.models.search_hit import SearchHit

# TODO update the JSON string below
json = "{}"
# create an instance of SearchHit from a JSON string
search_hit_instance = SearchHit.from_json(json)
# print the JSON string representation of the object
print(SearchHit.to_json())

# convert the object into a dict
search_hit_dict = search_hit_instance.to_dict()
# create an instance of SearchHit from a dict
search_hit_from_dict = SearchHit.from_dict(search_hit_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


