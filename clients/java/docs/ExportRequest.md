

# ExportRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | Export only media tagged with this customer_id. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | &#39;ndjson&#39; (default) is the full vector-bearing backup format /v1/import restores from. &#39;parquet&#39; is a metadata-only dataset export (blob_id, customer_id, media_ref, kind, caption, tags - no vectors) for analysis in DuckDB/pandas/Spark; it is not importable. |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | Export only blobs of this media kind. |  [optional] |
|**s3Uri** | **String** | s3://bucket/prefix to write the export to. |  |
|**tag** | **String** | Export only blobs whose annotation tags contain this tag. |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| NDJSON | &quot;ndjson&quot; |
| PARQUET | &quot;parquet&quot; |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| IMAGE | &quot;image&quot; |
| VIDEO | &quot;video&quot; |
| AUDIO | &quot;audio&quot; |
| PDF | &quot;pdf&quot; |
| DOC | &quot;doc&quot; |
| NOTE | &quot;note&quot; |



