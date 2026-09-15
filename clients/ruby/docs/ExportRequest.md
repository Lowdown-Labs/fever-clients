# FeverClient::ExportRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **customer_id** | **String** | Export only media tagged with this customer_id. | [optional] |
| **format** | **String** | &#39;ndjson&#39; (default) is the full vector-bearing backup format /v1/import restores from. &#39;parquet&#39; is a metadata-only dataset export (blob_id, customer_id, media_ref, kind, caption, tags - no vectors) for analysis in DuckDB/pandas/Spark; it is not importable. | [optional][default to &#39;ndjson&#39;] |
| **kind** | **String** | Export only blobs of this media kind. | [optional] |
| **s3_uri** | **String** | s3://bucket/prefix to write the export to. |  |
| **tag** | **String** | Export only blobs whose annotation tags contain this tag. | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::ExportRequest.new(
  customer_id: null,
  format: null,
  kind: null,
  s3_uri: null,
  tag: null
)
```

