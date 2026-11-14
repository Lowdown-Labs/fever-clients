# ExportJob


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**job_id** | **int** |  | 
**status** | **str** |  | [optional] [default to 'pending']

## Example

```python
from fever_client.models.export_job import ExportJob

# TODO update the JSON string below
json = "{}"
# create an instance of ExportJob from a JSON string
export_job_instance = ExportJob.from_json(json)
# print the JSON string representation of the object
print(ExportJob.to_json())

# convert the object into a dict
export_job_dict = export_job_instance.to_dict()
# create an instance of ExportJob from a dict
export_job_from_dict = ExportJob.from_dict(export_job_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


