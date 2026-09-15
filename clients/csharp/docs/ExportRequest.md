# LowdownLabs.Fever.Model.ExportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomerId** | **string** | Export only media tagged with this customer_id. | [optional] 
**Format** | **string** | &#39;ndjson&#39; (default) is the full vector-bearing backup format /v1/import restores from. &#39;parquet&#39; is a metadata-only dataset export (blob_id, customer_id, media_ref, kind, caption, tags - no vectors) for analysis in DuckDB/pandas/Spark; it is not importable. | [optional] [default to FormatEnum.Ndjson]
**Kind** | **string** | Export only blobs of this media kind. | [optional] 
**S3Uri** | **string** | s3://bucket/prefix to write the export to. | 
**Tag** | **string** | Export only blobs whose annotation tags contain this tag. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

