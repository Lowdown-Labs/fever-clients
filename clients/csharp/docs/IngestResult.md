# LowdownLabs.Fever.Model.IngestResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Existing** | [**List&lt;IngestedMedia&gt;**](IngestedMedia.md) | Items skipped by delta ingest because they were already indexed, returned with their current blob_ids (only when overwrite&#x3D;false). | [optional] 
**Ingested** | [**List&lt;IngestedMedia&gt;**](IngestedMedia.md) | Media items processed inline (small requests). | [optional] 
**Job** | [**Job**](Job.md) | For large or bucket-source ingests, poll this job for progress. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

