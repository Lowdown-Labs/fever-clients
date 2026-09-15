

# QueryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rowLimit** | **Integer** | Max rows to return; capped at 1000 regardless of what&#39;s requested. A LIMIT already in the sql, if smaller, is honored instead. |  [optional] |
|**sql** | **String** | A single read-only SELECT over the corpus tables (as_blobs, annotations, dup_edges, video_frames, transcript_segments, embeddings, datasets, dataset_items; internal jobs/job_items stay queryable but are bookkeeping). Raw vector columns (vec_prefix, vec_full) are selectable with an admin key, rejected for scoped keys; tsvector columns (fts) are excluded for everyone. Natural-language search: an &#x60;e.vec_full &lt;&#x3D;&gt; fever_search(&#39;text&#39;)&#x60; comparison may sit in ORDER BY (ranking) or the SELECT target list (raw cosine distance; similarity &#x3D; 1.0 - distance), with at most four distinct texts per statement. |  |



