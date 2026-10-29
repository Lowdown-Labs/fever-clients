# IngestedMedia

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blob_id** | **i32** |  | 
**customer_id** | Option<**String**> | Echoed only when the ingest response carries embeddings (FEVER_RETURN_EMBEDDING_ON_INGEST / embedding-only mode). | [optional]
**embedding** | Option<**Vec<f64>**> | The full embedding vector, returned only when the ingest response carries embeddings. | [optional]
**embedding_prefix** | Option<**Vec<f64>**> | The coarse prefix vector, returned only when the ingest response carries embeddings. | [optional]
**external_ref** | Option<**String**> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


