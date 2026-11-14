# ReportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | **str** | Fill slots from this customer&#39;s corpus only. | [optional] 
**output_s3_uri** | **str** | s3://bucket/key for the PDF. Default: reports/&lt;customer_id&gt;/&lt;job_id&gt;.pdf in the tenant bucket. | [optional] 
**slots** | [**List[ReportSlot]**](ReportSlot.md) | Labeled photo slots; each is filled with the best-matching photo. | 
**title** | **str** | Report title, rendered at the top of the PDF. | 

## Example

```python
from fever_client.models.report_request import ReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ReportRequest from a JSON string
report_request_instance = ReportRequest.from_json(json)
# print the JSON string representation of the object
print(ReportRequest.to_json())

# convert the object into a dict
report_request_dict = report_request_instance.to_dict()
# create an instance of ReportRequest from a dict
report_request_from_dict = ReportRequest.from_dict(report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


