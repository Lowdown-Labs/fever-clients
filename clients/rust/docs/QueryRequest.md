# QueryRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**row_limit** | Option<**i32**> | Max rows to return; capped at 1000 regardless of what's requested. A LIMIT already in the sql, if smaller, is honored instead. | [optional][default to 200]
**sql** | **String** | A single read-only SELECT over the corpus tables (as_blobs, annotations, dup_edges, video_frames, transcript_segments, embeddings, datasets, dataset_items; internal jobs/job_items stay queryable but are bookkeeping). Raw vector columns (vec_prefix, vec_full) are selectable with an admin key, rejected for scoped keys; tsvector columns (fts) are excluded for everyone. Natural-language search: an `e.vec_full <=> fever_search('text')` comparison may sit in ORDER BY (ranking) or the SELECT target list (raw cosine distance; similarity = 1.0 - distance), with at most four distinct texts per statement. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


