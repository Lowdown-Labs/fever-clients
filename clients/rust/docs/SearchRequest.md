# SearchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**after** | Option<**String**> | EXIF capture time >= this ISO datetime. | [optional]
**before** | Option<**String**> | EXIF capture time <= this ISO datetime. | [optional]
**collapse_duplicates** | Option<**bool**> | Collapse near-duplicate items so each result is a distinct representative; the folded-in duplicates are listed on each hit. | [optional][default to true]
**collection_id** | Option<**String**> | Restrict results to media tagged with this collection_id. | [optional]
**customer_id** | Option<**String**> | Restrict results to media tagged with this customer_id. | [optional]
**device** | Option<**String**> | EXIF camera make/model substring. | [optional]
**dupe_threshold** | Option<**f64**> | Cosine similarity cutoff 0..1 for treating two items as duplicates; higher is stricter. Defaults to the appliance setting when omitted. | [optional]
**exclude_tags** | Option<**Vec<String>**> | Exclude blobs carrying any of these tags (ingest tags and/or zero-shot autotags), e.g. ['people'] to build a no-people dataset. | [optional]
**image** | Option<**String**> | Base64 image for image-to-image search / dedup. | [optional]
**image_blob_id** | Option<**i32**> | Search with the vector of an already-indexed image (no re-upload, no re-embed). | [optional]
**include_tags** | Option<**Vec<String>**> | Only blobs carrying at least one of these tags (ANY semantics: e.g. a list of geo:<place> tags an integrator's UI offers). Combine with exclude_tags as you like. | [optional]
**indexed_res** | Option<**i32**> | Restrict results to blobs indexed at exactly this resolution (pixels; see IngestRequest.target_res). Blobs ingested before this filter existed have no recorded resolution and are excluded whenever this is set. | [optional]
**k** | Option<**i32**> | Max results. | [optional][default to 10]
**kind** | Option<**Kind**> | Constrain results to one media kind; unset scans every kind. Video hits attach seek_ms; audio/transcript hits attach span. (enum: image, video, audio, pdf, doc, note, lidar) | [optional]
**max_height** | Option<**i32**> | Restrict results to blobs at most this many pixels tall (stored media dimensions; blobs with unknown dimensions are excluded whenever this is set). | [optional]
**max_width** | Option<**i32**> | Restrict results to blobs at most this many pixels wide (stored media dimensions; blobs with unknown dimensions are excluded whenever this is set). | [optional]
**min_score** | Option<**f64**> | Confidence cutoff 0..1; for text this is the reranker's match probability. | [optional][default to 0.0]
**near** | Option<**Vec<f64>**> | Geo filter [lat, lon, radius_km] from EXIF GPS. | [optional]
**sort** | Option<**Sort**> | 'relevance' (default) is the fused/calibrated ordering; 'distance' reorders results nearest-first and requires the near filter - e.g. an integrator's map view. An explicit ordering knob, not another relevance signal. (enum: relevance, distance) | [optional]
**text** | Option<**String**> | Text query (meaning-based, not keyword). | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


