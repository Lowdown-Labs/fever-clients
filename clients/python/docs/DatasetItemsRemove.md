# DatasetItemsRemove


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_ids** | **List[int]** | Items to remove; omit (or pass null) to clear every item from the dataset. | [optional] 

## Example

```python
from fever_client.models.dataset_items_remove import DatasetItemsRemove

# TODO update the JSON string below
json = "{}"
# create an instance of DatasetItemsRemove from a JSON string
dataset_items_remove_instance = DatasetItemsRemove.from_json(json)
# print the JSON string representation of the object
print(DatasetItemsRemove.to_json())

# convert the object into a dict
dataset_items_remove_dict = dataset_items_remove_instance.to_dict()
# create an instance of DatasetItemsRemove from a dict
dataset_items_remove_from_dict = DatasetItemsRemove.from_dict(dataset_items_remove_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


