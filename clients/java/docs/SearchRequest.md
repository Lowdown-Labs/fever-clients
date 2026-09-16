

# SearchRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**after** | **String** | EXIF capture time &gt;&#x3D; this ISO datetime. |  [optional] |
|**before** | **String** | EXIF capture time &lt;&#x3D; this ISO datetime. |  [optional] |
|**collapseDuplicates** | **Boolean** | Collapse near-duplicate items so each result is a distinct representative; the folded-in duplicates are listed on each hit. |  [optional] |
|**collectionId** | **String** | Restrict results to media tagged with this collection_id. |  [optional] |
|**customerId** | **String** | Restrict results to media tagged with this customer_id. |  [optional] |
|**device** | **String** | EXIF camera make/model substring. |  [optional] |
|**dupeThreshold** | **BigDecimal** | Cosine similarity cutoff 0..1 for treating two items as duplicates; higher is stricter. Defaults to the appliance setting when omitted. |  [optional] |
|**excludeTags** | **List&lt;String&gt;** | Exclude blobs carrying any of these tags (ingest tags and/or zero-shot autotags), e.g. [&#39;people&#39;] to build a no-people dataset. |  [optional] |
|**image** | **String** | Base64 image for image-to-image search / dedup. |  [optional] |
|**imageBlobId** | **Integer** | Search with the vector of an already-indexed image (no re-upload, no re-embed). |  [optional] |
|**includeTags** | **List&lt;String&gt;** | Only blobs carrying at least one of these tags (ANY semantics: e.g. a list of geo:&lt;place&gt; tags an integrator&#39;s UI offers). Combine with exclude_tags as you like. |  [optional] |
|**indexedRes** | **Integer** | Restrict results to blobs indexed at exactly this resolution (pixels; see IngestRequest.target_res). Blobs ingested before this filter existed have no recorded resolution and are excluded whenever this is set. |  [optional] |
|**k** | **Integer** | Max results. |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | Constrain results to one media kind; unset scans every kind. Video hits attach seek_ms; audio/transcript hits attach span. |  [optional] |
|**maxHeight** | **Integer** | Restrict results to blobs at most this many pixels tall (stored media dimensions; blobs with unknown dimensions are excluded whenever this is set). |  [optional] |
|**maxWidth** | **Integer** | Restrict results to blobs at most this many pixels wide (stored media dimensions; blobs with unknown dimensions are excluded whenever this is set). |  [optional] |
|**minScore** | **BigDecimal** | Confidence cutoff 0..1; for text this is the reranker&#39;s match probability. |  [optional] |
|**near** | **List&lt;BigDecimal&gt;** | Geo filter [lat, lon, radius_km] from EXIF GPS. |  [optional] |
|**sort** | [**SortEnum**](#SortEnum) | &#39;relevance&#39; (default) is the fused/calibrated ordering; &#39;distance&#39; reorders results nearest-first and requires the near filter - e.g. an integrator&#39;s map view. An explicit ordering knob, not another relevance signal. |  [optional] |
|**text** | **String** | Text query (meaning-based, not keyword). |  [optional] |



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



## Enum: SortEnum

| Name | Value |
|---- | -----|
| RELEVANCE | &quot;relevance&quot; |
| DISTANCE | &quot;distance&quot; |



