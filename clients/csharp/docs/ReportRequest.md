# LowdownLabs.Fever.Model.ReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomerId** | **string** | Fill slots from this customer&#39;s corpus only. | [optional] 
**OutputS3Uri** | **string** | s3://bucket/key for the PDF. Default: reports/&lt;customer_id&gt;/&lt;job_id&gt;.pdf in the tenant bucket. | [optional] 
**Slots** | [**List&lt;ReportSlot&gt;**](ReportSlot.md) | Labeled photo slots; each is filled with the best-matching photo. | 
**Title** | **string** | Report title, rendered at the top of the PDF. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

