# IngestedMedia

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_id** | **int** |  |
**customer_id** | **string** | Echoed only when the ingest response carries embeddings (FEVER_RETURN_EMBEDDING_ON_INGEST / embedding-only mode). | [optional]
**embedding** | **float[]** | The full embedding vector, returned only when the ingest response carries embeddings. | [optional]
**embedding_prefix** | **float[]** | The coarse prefix vector, returned only when the ingest response carries embeddings. | [optional]
**external_ref** | **string** |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
