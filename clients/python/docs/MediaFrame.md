# MediaFrame


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**frame_no** | **int** |  | 
**ts_ms** | **int** |  | 

## Example

```python
from fever_client.models.media_frame import MediaFrame

# TODO update the JSON string below
json = "{}"
# create an instance of MediaFrame from a JSON string
media_frame_instance = MediaFrame.from_json(json)
# print the JSON string representation of the object
print(MediaFrame.to_json())

# convert the object into a dict
media_frame_dict = media_frame_instance.to_dict()
# create an instance of MediaFrame from a dict
media_frame_from_dict = MediaFrame.from_dict(media_frame_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


