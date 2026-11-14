

# ExportRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**background** | **Boolean** | Queue the export as a job and return 202 with a job id to poll at /v1/jobs/{id} instead of running it inline. |  [optional] |
|**customerId** | **String** | Export only media tagged with this customer_id. |  [optional] |
|**datasetId** | **Integer** | Export only blobs in this dataset. |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | &#39;ndjson&#39; (default) is the full vector-bearing backup format /v1/import restores from. &#39;parquet&#39; is a columnar export (blob_id, customer_id, media_ref, kind, caption, tags, plus the vector and metadata payload) for analysis in DuckDB/pandas/Spark; it is not importable. |  [optional] |
|**includeLineage** | **Boolean** | Write &lt;prefix&gt;/lineage.ndjson with per-item provenance and flags (synthetic score, face_count, gps, captured_at, device, provenance findings). |  [optional] |
|**includeMedia** | **Boolean** | Copy each exported blob&#39;s original object to &lt;prefix&gt;/media/&lt;blob_id&gt;&lt;ext&gt; (best effort; missing bytes are counted, not fatal). |  [optional] |
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
| LIDAR | &quot;lidar&quot; |
| MODEL3D | &quot;model3d&quot; |



