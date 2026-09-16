# AssociateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collection_id** | **str** | Set/update the collection grouping for this blob. | [optional] 
**parent_ref** | **str** | Set/update the pointer to this blob&#39;s related parent asset (its external_ref, key, or blob_id). | [optional] 

## Example

```python
from fever_client.models.associate_request import AssociateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AssociateRequest from a JSON string
associate_request_instance = AssociateRequest.from_json(json)
# print the JSON string representation of the object
print(AssociateRequest.to_json())

# convert the object into a dict
associate_request_dict = associate_request_instance.to_dict()
# create an instance of AssociateRequest from a dict
associate_request_from_dict = AssociateRequest.from_dict(associate_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


