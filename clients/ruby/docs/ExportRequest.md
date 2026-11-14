# FeverClient::ExportRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **background** | **Boolean** | Queue the export as a job and return 202 with a job id to poll at /v1/jobs/{id} instead of running it inline. | [optional][default to false] |
| **customer_id** | **String** | Export only media tagged with this customer_id. | [optional] |
| **dataset_id** | **Integer** | Export only blobs in this dataset. | [optional] |
| **format** | **String** | &#39;ndjson&#39; (default) is the full vector-bearing backup format /v1/import restores from. &#39;parquet&#39; is a columnar export (blob_id, customer_id, media_ref, kind, caption, tags, plus the vector and metadata payload) for analysis in DuckDB/pandas/Spark; it is not importable. | [optional][default to &#39;ndjson&#39;] |
| **include_lineage** | **Boolean** | Write &lt;prefix&gt;/lineage.ndjson with per-item provenance and flags (synthetic score, face_count, gps, captured_at, device, provenance findings). | [optional][default to false] |
| **include_media** | **Boolean** | Copy each exported blob&#39;s original object to &lt;prefix&gt;/media/&lt;blob_id&gt;&lt;ext&gt; (best effort; missing bytes are counted, not fatal). | [optional][default to false] |
| **kind** | **String** | Export only blobs of this media kind. | [optional] |
| **s3_uri** | **String** | s3://bucket/prefix to write the export to. |  |
| **tag** | **String** | Export only blobs whose annotation tags contain this tag. | [optional] |

## Example

```ruby
require 'fever_client'

instance = FeverClient::ExportRequest.new(
  background: null,
  customer_id: null,
  dataset_id: null,
  format: null,
  include_lineage: null,
  include_media: null,
  kind: null,
  s3_uri: null,
  tag: null
)
```

