# TranscriptSegment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_ms** | **int** |  | 
**seq** | **int** |  | 
**start_ms** | **int** |  | 
**text** | **str** |  | 

## Example

```python
from fever_client.models.transcript_segment import TranscriptSegment

# TODO update the JSON string below
json = "{}"
# create an instance of TranscriptSegment from a JSON string
transcript_segment_instance = TranscriptSegment.from_json(json)
# print the JSON string representation of the object
print(TranscriptSegment.to_json())

# convert the object into a dict
transcript_segment_dict = transcript_segment_instance.to_dict()
# create an instance of TranscriptSegment from a dict
transcript_segment_from_dict = TranscriptSegment.from_dict(transcript_segment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


