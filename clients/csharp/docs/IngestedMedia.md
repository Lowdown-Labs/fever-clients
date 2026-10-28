# LowdownLabs.Fever.Model.IngestedMedia

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BlobId** | **int** |  | 
**CustomerId** | **string** | Echoed only when the ingest response carries embeddings (FEVER_RETURN_EMBEDDING_ON_INGEST / embedding-only mode). | [optional] 
**Embedding** | **List&lt;decimal&gt;** | The full embedding vector, returned only when the ingest response carries embeddings. | [optional] 
**EmbeddingPrefix** | **List&lt;decimal&gt;** | The coarse prefix vector, returned only when the ingest response carries embeddings. | [optional] 
**ExternalRef** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

