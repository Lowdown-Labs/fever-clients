# LowdownLabs.Fever.Model.ExportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Background** | **bool** | Queue the export as a job and return 202 with a job id to poll at /v1/jobs/{id} instead of running it inline. | [optional] [default to false]
**CustomerId** | **string** | Export only media tagged with this customer_id. | [optional] 
**DatasetId** | **int?** | Export only blobs in this dataset. | [optional] 
**Format** | **string** | &#39;ndjson&#39; (default) is the full vector-bearing backup format /v1/import restores from. &#39;parquet&#39; is a columnar export (blob_id, customer_id, media_ref, kind, caption, tags, plus the vector and metadata payload) for analysis in DuckDB/pandas/Spark; it is not importable. | [optional] [default to FormatEnum.Ndjson]
**IncludeLineage** | **bool** | Write &lt;prefix&gt;/lineage.ndjson with per-item provenance and flags (synthetic score, face_count, gps, captured_at, device, provenance findings). | [optional] [default to false]
**IncludeMedia** | **bool** | Copy each exported blob&#39;s original object to &lt;prefix&gt;/media/&lt;blob_id&gt;&lt;ext&gt; (best effort; missing bytes are counted, not fatal). | [optional] [default to false]
**Kind** | **string** | Export only blobs of this media kind. | [optional] 
**S3Uri** | **string** | s3://bucket/prefix to write the export to. | 
**Tag** | **string** | Export only blobs whose annotation tags contain this tag. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

