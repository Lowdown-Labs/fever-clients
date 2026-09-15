# IngestResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**existing** | Option<[**Vec<models::IngestedMedia>**](IngestedMedia.md)> | Items skipped by delta ingest because they were already indexed, returned with their current blob_ids (only when overwrite=false). | [optional]
**ingested** | Option<[**Vec<models::IngestedMedia>**](IngestedMedia.md)> | Media items processed inline (small requests). | [optional]
**job** | Option<[**models::Job**](Job.md)> | For large or bucket-source ingests, poll this job for progress. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


