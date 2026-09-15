# IngestResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**existing** | [**List[IngestedMedia]**](IngestedMedia.md) | Items skipped by delta ingest because they were already indexed, returned with their current blob_ids (only when overwrite&#x3D;false). | [optional] 
**ingested** | [**List[IngestedMedia]**](IngestedMedia.md) | Media items processed inline (small requests). | [optional] 
**job** | [**Job**](Job.md) | For large or bucket-source ingests, poll this job for progress. | [optional] 

## Example

```python
from fever_client.models.ingest_result import IngestResult

# TODO update the JSON string below
json = "{}"
# create an instance of IngestResult from a JSON string
ingest_result_instance = IngestResult.from_json(json)
# print the JSON string representation of the object
print(IngestResult.to_json())

# convert the object into a dict
ingest_result_dict = ingest_result_instance.to_dict()
# create an instance of IngestResult from a dict
ingest_result_from_dict = IngestResult.from_dict(ingest_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


