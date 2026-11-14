# ReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_id** | **string** | Fill slots from this customer&#39;s corpus only. | [optional]
**output_s3_uri** | **string** | s3://bucket/key for the PDF. Default: reports/&lt;customer_id&gt;/&lt;job_id&gt;.pdf in the tenant bucket. | [optional]
**slots** | [**\LowdownLabs\Fever\Model\ReportSlot[]**](ReportSlot.md) | Labeled photo slots; each is filled with the best-matching photo. |
**title** | **string** | Report title, rendered at the top of the PDF. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
