# MediaFormats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio** | **List[str]** |  | 
**document** | **List[str]** |  | 
**image** | **List[str]** |  | 
**lidar** | **List[str]** |  | 
**video** | **List[str]** |  | 

## Example

```python
from fever_client.models.media_formats import MediaFormats

# TODO update the JSON string below
json = "{}"
# create an instance of MediaFormats from a JSON string
media_formats_instance = MediaFormats.from_json(json)
# print the JSON string representation of the object
print(MediaFormats.to_json())

# convert the object into a dict
media_formats_dict = media_formats_instance.to_dict()
# create an instance of MediaFormats from a dict
media_formats_from_dict = MediaFormats.from_dict(media_formats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


