

# ReportRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | Fill slots from this customer&#39;s corpus only. |  [optional] |
|**outputS3Uri** | **String** | s3://bucket/key for the PDF. Default: reports/&lt;customer_id&gt;/&lt;job_id&gt;.pdf in the tenant bucket. |  [optional] |
|**slots** | [**List&lt;ReportSlot&gt;**](ReportSlot.md) | Labeled photo slots; each is filled with the best-matching photo. |  |
|**title** | **String** | Report title, rendered at the top of the PDF. |  |



