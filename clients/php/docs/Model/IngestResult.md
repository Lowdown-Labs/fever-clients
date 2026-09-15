# IngestResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**existing** | [**\LowdownLabs\Fever\Model\IngestedMedia[]**](IngestedMedia.md) | Items skipped by delta ingest because they were already indexed, returned with their current blob_ids (only when overwrite&#x3D;false). | [optional]
**ingested** | [**\LowdownLabs\Fever\Model\IngestedMedia[]**](IngestedMedia.md) | Media items processed inline (small requests). | [optional]
**job** | [**\LowdownLabs\Fever\Model\Job**](Job.md) | For large or bucket-source ingests, poll this job for progress. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
