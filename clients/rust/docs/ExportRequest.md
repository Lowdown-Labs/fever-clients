# ExportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**background** | Option<**bool**> | Queue the export as a job and return 202 with a job id to poll at /v1/jobs/{id} instead of running it inline. | [optional][default to false]
**customer_id** | Option<**String**> | Export only media tagged with this customer_id. | [optional]
**dataset_id** | Option<**i32**> | Export only blobs in this dataset. | [optional]
**format** | Option<**Format**> | 'ndjson' (default) is the full vector-bearing backup format /v1/import restores from. 'parquet' is a columnar export (blob_id, customer_id, media_ref, kind, caption, tags, plus the vector and metadata payload) for analysis in DuckDB/pandas/Spark; it is not importable. (enum: ndjson, parquet) | [optional][default to Ndjson]
**include_lineage** | Option<**bool**> | Write <prefix>/lineage.ndjson with per-item provenance and flags (synthetic score, face_count, gps, captured_at, device, provenance findings). | [optional][default to false]
**include_media** | Option<**bool**> | Copy each exported blob's original object to <prefix>/media/<blob_id><ext> (best effort; missing bytes are counted, not fatal). | [optional][default to false]
**kind** | Option<**Kind**> | Export only blobs of this media kind. (enum: image, video, audio, pdf, doc, note, lidar, model3d) | [optional]
**s3_uri** | **String** | s3://bucket/prefix to write the export to. | 
**tag** | Option<**String**> | Export only blobs whose annotation tags contain this tag. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


