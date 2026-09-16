# LowdownLabs.Fever.Model.SearchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**After** | **string** | EXIF capture time &gt;&#x3D; this ISO datetime. | [optional] 
**Before** | **string** | EXIF capture time &lt;&#x3D; this ISO datetime. | [optional] 
**CollapseDuplicates** | **bool** | Collapse near-duplicate items so each result is a distinct representative; the folded-in duplicates are listed on each hit. | [optional] [default to true]
**CollectionId** | **string** | Restrict results to media tagged with this collection_id. | [optional] 
**CustomerId** | **string** | Restrict results to media tagged with this customer_id. | [optional] 
**Device** | **string** | EXIF camera make/model substring. | [optional] 
**DupeThreshold** | **decimal?** | Cosine similarity cutoff 0..1 for treating two items as duplicates; higher is stricter. Defaults to the appliance setting when omitted. | [optional] 
**ExcludeTags** | **List&lt;string&gt;** | Exclude blobs carrying any of these tags (ingest tags and/or zero-shot autotags), e.g. [&#39;people&#39;] to build a no-people dataset. | [optional] 
**Image** | **string** | Base64 image for image-to-image search / dedup. | [optional] 
**ImageBlobId** | **int?** | Search with the vector of an already-indexed image (no re-upload, no re-embed). | [optional] 
**IncludeTags** | **List&lt;string&gt;** | Only blobs carrying at least one of these tags (ANY semantics: e.g. a list of geo:&lt;place&gt; tags an integrator&#39;s UI offers). Combine with exclude_tags as you like. | [optional] 
**IndexedRes** | **int?** | Restrict results to blobs indexed at exactly this resolution (pixels; see IngestRequest.target_res). Blobs ingested before this filter existed have no recorded resolution and are excluded whenever this is set. | [optional] 
**K** | **int** | Max results. | [optional] [default to 10]
**Kind** | **string** | Constrain results to one media kind; unset scans every kind. Video hits attach seek_ms; audio/transcript hits attach span. | [optional] 
**MaxHeight** | **int?** | Restrict results to blobs at most this many pixels tall (stored media dimensions; blobs with unknown dimensions are excluded whenever this is set). | [optional] 
**MaxWidth** | **int?** | Restrict results to blobs at most this many pixels wide (stored media dimensions; blobs with unknown dimensions are excluded whenever this is set). | [optional] 
**MinScore** | **decimal** | Confidence cutoff 0..1; for text this is the reranker&#39;s match probability. | [optional] [default to 0.0M]
**Near** | **List&lt;decimal&gt;** | Geo filter [lat, lon, radius_km] from EXIF GPS. | [optional] 
**Sort** | **string** | &#39;relevance&#39; (default) is the fused/calibrated ordering; &#39;distance&#39; reorders results nearest-first and requires the near filter - e.g. an integrator&#39;s map view. An explicit ordering knob, not another relevance signal. | [optional] 
**Text** | **string** | Text query (meaning-based, not keyword). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

