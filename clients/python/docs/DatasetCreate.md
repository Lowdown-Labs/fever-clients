# DatasetCreate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_ids** | **List[int]** | Optional initial items; every blob must belong to the dataset&#39;s customer. | [optional] 
**customer_id** | **str** | Admin keys only: own this dataset to this customer. Scoped keys are always forced to their own customer_id. | [optional] 
**name** | **str** | Dataset name, unique per tenant. | 
**source_sql** | **str** | Provenance: the SELECT that produced the item set, kept so the curation query can be reviewed and refined later. | [optional] 

## Example

```python
from fever_client.models.dataset_create import DatasetCreate

# TODO update the JSON string below
json = "{}"
# create an instance of DatasetCreate from a JSON string
dataset_create_instance = DatasetCreate.from_json(json)
# print the JSON string representation of the object
print(DatasetCreate.to_json())

# convert the object into a dict
dataset_create_dict = dataset_create_instance.to_dict()
# create an instance of DatasetCreate from a dict
dataset_create_from_dict = DatasetCreate.from_dict(dataset_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


