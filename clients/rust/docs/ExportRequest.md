# ExportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | Option<**String**> | Export only media tagged with this customer_id. | [optional]
**format** | Option<**Format**> | 'ndjson' (default) is the full vector-bearing backup format /v1/import restores from. 'parquet' is a metadata-only dataset export (blob_id, customer_id, media_ref, kind, caption, tags - no vectors) for analysis in DuckDB/pandas/Spark; it is not importable. (enum: ndjson, parquet) | [optional][default to Ndjson]
**kind** | Option<**Kind**> | Export only blobs of this media kind. (enum: image, video, audio, pdf, doc, note) | [optional]
**s3_uri** | **String** | s3://bucket/prefix to write the export to. | 
**tag** | Option<**String**> | Export only blobs whose annotation tags contain this tag. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


