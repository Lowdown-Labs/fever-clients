# ExportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**background** | **bool** | Queue the export as a job and return 202 with a job id to poll at /v1/jobs/{id} instead of running it inline. | [optional] [default to false]
**customer_id** | **string** | Export only media tagged with this customer_id. | [optional]
**dataset_id** | **int** | Export only blobs in this dataset. | [optional]
**format** | **string** | &#39;ndjson&#39; (default) is the full vector-bearing backup format /v1/import restores from. &#39;parquet&#39; is a columnar export (blob_id, customer_id, media_ref, kind, caption, tags, plus the vector and metadata payload) for analysis in DuckDB/pandas/Spark; it is not importable. | [optional] [default to 'ndjson']
**include_lineage** | **bool** | Write &lt;prefix&gt;/lineage.ndjson with per-item provenance and flags (synthetic score, face_count, gps, captured_at, device, provenance findings). | [optional] [default to false]
**include_media** | **bool** | Copy each exported blob&#39;s original object to &lt;prefix&gt;/media/&lt;blob_id&gt;&lt;ext&gt; (best effort; missing bytes are counted, not fatal). | [optional] [default to false]
**kind** | **string** | Export only blobs of this media kind. | [optional]
**s3_uri** | **string** | s3://bucket/prefix to write the export to. |
**tag** | **string** | Export only blobs whose annotation tags contain this tag. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
