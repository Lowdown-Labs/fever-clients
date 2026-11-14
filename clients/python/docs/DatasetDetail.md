# DatasetDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_ids** | **List[int]** |  | [optional] 
**created_at** | **str** |  | [optional] 
**customer_id** | **str** |  | [optional] 
**id** | **int** |  | 
**item_count** | **int** |  | [optional] [default to 0]
**name** | **str** |  | 
**source_sql** | **str** |  | [optional] 

## Example

```python
from fever_client.models.dataset_detail import DatasetDetail

# TODO update the JSON string below
json = "{}"
# create an instance of DatasetDetail from a JSON string
dataset_detail_instance = DatasetDetail.from_json(json)
# print the JSON string representation of the object
print(DatasetDetail.to_json())

# convert the object into a dict
dataset_detail_dict = dataset_detail_instance.to_dict()
# create an instance of DatasetDetail from a dict
dataset_detail_from_dict = DatasetDetail.from_dict(dataset_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


