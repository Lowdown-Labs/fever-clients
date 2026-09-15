# ExportResult


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exported** | **int** |  | 
**s3_uri** | **str** |  | 

## Example

```python
from fever_client.models.export_result import ExportResult

# TODO update the JSON string below
json = "{}"
# create an instance of ExportResult from a JSON string
export_result_instance = ExportResult.from_json(json)
# print the JSON string representation of the object
print(ExportResult.to_json())

# convert the object into a dict
export_result_dict = export_result_instance.to_dict()
# create an instance of ExportResult from a dict
export_result_from_dict = ExportResult.from_dict(export_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


