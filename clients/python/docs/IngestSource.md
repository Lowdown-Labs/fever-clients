# IngestSource


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collection_id** | **str** | Tag every vacuumed item with this collection_id. | [optional] 
**customer_id** | **str** | Tag every vacuumed item with this customer_id. | [optional] 
**hf_config** | **str** | Hugging Face dataset config/subset name, when the dataset has several. | [optional] 
**hf_dataset** | **str** | Hugging Face dataset repo id (org/name) whose images are staged and ingested. Only available on deployments with FEVER_HF_INGEST_ENABLED. | [optional] 
**hf_split** | **str** | Hugging Face split to ingest (e.g. &#39;train&#39;); unset ingests every split. | [optional] 
**s3_uri** | **str** | s3://bucket/prefix in your VPC to vacuum every media item under. | [optional] 
**target_res** | **int** | Resolution to index at, in pixels (rounded to a multiple of 16). Images are resized to this before embedding; higher means more detail but slower. Leave unset for the fast production default (64). | [optional] 

## Example

```python
from fever_client.models.ingest_source import IngestSource

# TODO update the JSON string below
json = "{}"
# create an instance of IngestSource from a JSON string
ingest_source_instance = IngestSource.from_json(json)
# print the JSON string representation of the object
print(IngestSource.to_json())

# convert the object into a dict
ingest_source_dict = ingest_source_instance.to_dict()
# create an instance of IngestSource from a dict
ingest_source_from_dict = IngestSource.from_dict(ingest_source_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


