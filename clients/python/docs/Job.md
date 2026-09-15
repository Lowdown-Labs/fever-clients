# Job


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**done** | **int** |  | [optional] [default to 0]
**error** | **str** |  | [optional] 
**id** | **int** |  | 
**skipped** | **int** | Items skipped by delta ingest because their content was already indexed (overwrite&#x3D;false). | [optional] [default to 0]
**status** | **str** |  | 
**total** | **int** |  | [optional] [default to 0]

## Example

```python
from fever_client.models.job import Job

# TODO update the JSON string below
json = "{}"
# create an instance of Job from a JSON string
job_instance = Job.from_json(json)
# print the JSON string representation of the object
print(Job.to_json())

# convert the object into a dict
job_dict = job_instance.to_dict()
# create an instance of Job from a dict
job_from_dict = Job.from_dict(job_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


