# KeyReveal


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**api_key** | **str** | Bearer token for this appliance, shown ONCE. Store it now. | 
**customer_id** | **str** |  | [optional] 
**id** | **int** |  | 
**name** | **str** |  | [optional] 
**role** | **str** |  | [optional] [default to 'scoped']

## Example

```python
from fever_client.models.key_reveal import KeyReveal

# TODO update the JSON string below
json = "{}"
# create an instance of KeyReveal from a JSON string
key_reveal_instance = KeyReveal.from_json(json)
# print the JSON string representation of the object
print(KeyReveal.to_json())

# convert the object into a dict
key_reveal_dict = key_reveal_instance.to_dict()
# create an instance of KeyReveal from a dict
key_reveal_from_dict = KeyReveal.from_dict(key_reveal_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


