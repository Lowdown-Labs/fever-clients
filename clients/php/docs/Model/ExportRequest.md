# ExportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | **string** | Export only media tagged with this customer_id. | [optional]
**format** | **string** | &#39;ndjson&#39; (default) is the full vector-bearing backup format /v1/import restores from. &#39;parquet&#39; is a metadata-only dataset export (blob_id, customer_id, media_ref, kind, caption, tags - no vectors) for analysis in DuckDB/pandas/Spark; it is not importable. | [optional] [default to 'ndjson']
**kind** | **string** | Export only blobs of this media kind. | [optional]
**s3_uri** | **string** | s3://bucket/prefix to write the export to. |
**tag** | **string** | Export only blobs whose annotation tags contain this tag. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
