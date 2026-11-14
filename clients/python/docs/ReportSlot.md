# ReportSlot


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caption** | **str** | Extra caption text, appended to the search query. | [optional] 
**label** | **str** | Slot label; doubles as the text search query for this slot. | 
**min_score** | **float** | Per-slot confidence gate (cosine). Defaults to FEVER_REPORT_MIN_SCORE (0.25). | [optional] 

## Example

```python
from fever_client.models.report_slot import ReportSlot

# TODO update the JSON string below
json = "{}"
# create an instance of ReportSlot from a JSON string
report_slot_instance = ReportSlot.from_json(json)
# print the JSON string representation of the object
print(ReportSlot.to_json())

# convert the object into a dict
report_slot_dict = report_slot_instance.to_dict()
# create an instance of ReportSlot from a dict
report_slot_from_dict = ReportSlot.from_dict(report_slot_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


