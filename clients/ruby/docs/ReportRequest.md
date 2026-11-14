# FeverClient::ReportRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **customer_id** | **String** | Fill slots from this customer&#39;s corpus only. | [optional] |
| **output_s3_uri** | **String** | s3://bucket/key for the PDF. Default: reports/&lt;customer_id&gt;/&lt;job_id&gt;.pdf in the tenant bucket. | [optional] |
| **slots** | [**Array&lt;ReportSlot&gt;**](ReportSlot.md) | Labeled photo slots; each is filled with the best-matching photo. |  |
| **title** | **String** | Report title, rendered at the top of the PDF. |  |

## Example

```ruby
require 'fever_client'

instance = FeverClient::ReportRequest.new(
  customer_id: null,
  output_s3_uri: null,
  slots: null,
  title: null
)
```

