# SearchRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | **str** | EXIF capture time &gt;&#x3D; this ISO datetime. | [optional] 
**before** | **str** | EXIF capture time &lt;&#x3D; this ISO datetime. | [optional] 
**collapse_duplicates** | **bool** | Collapse near-duplicate items so each result is a distinct representative; the folded-in duplicates are listed on each hit. | [optional] [default to True]
**customer_id** | **str** | Restrict results to media tagged with this customer_id. | [optional] 
**device** | **str** | EXIF camera make/model substring. | [optional] 
**dupe_threshold** | **float** | Cosine similarity cutoff 0..1 for treating two items as duplicates; higher is stricter. Defaults to the appliance setting when omitted. | [optional] 
**exclude_tags** | **List[str]** | Exclude blobs carrying any of these tags (ingest tags and/or zero-shot autotags), e.g. [&#39;people&#39;] to build a no-people dataset. | [optional] 
**image** | **str** | Base64 image for image-to-image search / dedup. | [optional] 
**image_blob_id** | **int** | Search with the vector of an already-indexed image (no re-upload, no re-embed). | [optional] 
**include_tags** | **List[str]** | Only blobs carrying at least one of these tags (ANY semantics: e.g. a list of geo:&lt;place&gt; tags an integrator&#39;s UI offers). Combine with exclude_tags as you like. | [optional] 
**indexed_res** | **int** | Restrict results to blobs indexed at exactly this resolution (pixels; see IngestRequest.target_res). Blobs ingested before this filter existed have no recorded resolution and are excluded whenever this is set. | [optional] 
**k** | **int** | Max results. | [optional] [default to 10]
**kind** | **str** | Constrain results to one media kind; unset scans every kind. Video hits attach seek_ms; audio/transcript hits attach span. | [optional] 
**max_height** | **int** | Restrict results to blobs at most this many pixels tall (stored media dimensions; blobs with unknown dimensions are excluded whenever this is set). | [optional] 
**max_width** | **int** | Restrict results to blobs at most this many pixels wide (stored media dimensions; blobs with unknown dimensions are excluded whenever this is set). | [optional] 
**min_score** | **float** | Confidence cutoff 0..1; for text this is the reranker&#39;s match probability. | [optional] [default to 0.0]
**near** | **List[float]** | Geo filter [lat, lon, radius_km] from EXIF GPS. | [optional] 
**sort** | **str** | &#39;relevance&#39; (default) is the fused/calibrated ordering; &#39;distance&#39; reorders results nearest-first and requires the near filter - e.g. an integrator&#39;s map view. An explicit ordering knob, not another relevance signal. | [optional] 
**text** | **str** | Text query (meaning-based, not keyword). | [optional] 

## Example

```python
from fever_client.models.search_request import SearchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SearchRequest from a JSON string
search_request_instance = SearchRequest.from_json(json)
# print the JSON string representation of the object
print(SearchRequest.to_json())

# convert the object into a dict
search_request_dict = search_request_instance.to_dict()
# create an instance of SearchRequest from a dict
search_request_from_dict = SearchRequest.from_dict(search_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


