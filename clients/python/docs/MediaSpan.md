# MediaSpan

The transcript span that matched: where in the audio/video the hit is. Includes the literal segment text so the UI can highlight it.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_ms** | **int** |  | 
**start_ms** | **int** |  | 
**text** | **str** |  | [optional] 

## Example

```python
from fever_client.models.media_span import MediaSpan

# TODO update the JSON string below
json = "{}"
# create an instance of MediaSpan from a JSON string
media_span_instance = MediaSpan.from_json(json)
# print the JSON string representation of the object
print(MediaSpan.to_json())

# convert the object into a dict
media_span_dict = media_span_instance.to_dict()
# create an instance of MediaSpan from a dict
media_span_from_dict = MediaSpan.from_dict(media_span_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


