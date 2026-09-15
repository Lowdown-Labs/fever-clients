# ExportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | **str** | Export only media tagged with this customer_id. | [optional] 
**format** | **str** | &#39;ndjson&#39; (default) is the full vector-bearing backup format /v1/import restores from. &#39;parquet&#39; is a metadata-only dataset export (blob_id, customer_id, media_ref, kind, caption, tags - no vectors) for analysis in DuckDB/pandas/Spark; it is not importable. | [optional] [default to 'ndjson']
**kind** | **str** | Export only blobs of this media kind. | [optional] 
**s3_uri** | **str** | s3://bucket/prefix to write the export to. | 
**tag** | **str** | Export only blobs whose annotation tags contain this tag. | [optional] 

## Example

```python
from fever_client.models.export_request import ExportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ExportRequest from a JSON string
export_request_instance = ExportRequest.from_json(json)
# print the JSON string representation of the object
print(ExportRequest.to_json())

# convert the object into a dict
export_request_dict = export_request_instance.to_dict()
# create an instance of ExportRequest from a dict
export_request_from_dict = ExportRequest.from_dict(export_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


