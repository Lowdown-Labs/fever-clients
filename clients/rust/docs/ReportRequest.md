# ReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | Option<**String**> | Fill slots from this customer's corpus only. | [optional]
**output_s3_uri** | Option<**String**> | s3://bucket/key for the PDF. Default: reports/<customer_id>/<job_id>.pdf in the tenant bucket. | [optional]
**slots** | [**Vec<models::ReportSlot>**](ReportSlot.md) | Labeled photo slots; each is filled with the best-matching photo. | 
**title** | **String** | Report title, rendered at the top of the PDF. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


