# IngestedMedia

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BlobId** | **int32** |  | 
**CustomerId** | Pointer to **NullableString** | Echoed only when the ingest response carries embeddings (FEVER_RETURN_EMBEDDING_ON_INGEST / embedding-only mode). | [optional] 
**Embedding** | Pointer to **[]float32** | The full embedding vector, returned only when the ingest response carries embeddings. | [optional] 
**EmbeddingPrefix** | Pointer to **[]float32** | The coarse prefix vector, returned only when the ingest response carries embeddings. | [optional] 
**ExternalRef** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewIngestedMedia

`func NewIngestedMedia(blobId int32, ) *IngestedMedia`

NewIngestedMedia instantiates a new IngestedMedia object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIngestedMediaWithDefaults

`func NewIngestedMediaWithDefaults() *IngestedMedia`

NewIngestedMediaWithDefaults instantiates a new IngestedMedia object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlobId

`func (o *IngestedMedia) GetBlobId() int32`

GetBlobId returns the BlobId field if non-nil, zero value otherwise.

### GetBlobIdOk

`func (o *IngestedMedia) GetBlobIdOk() (*int32, bool)`

GetBlobIdOk returns a tuple with the BlobId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobId

`func (o *IngestedMedia) SetBlobId(v int32)`

SetBlobId sets BlobId field to given value.


### GetCustomerId

`func (o *IngestedMedia) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *IngestedMedia) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *IngestedMedia) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.

### HasCustomerId

`func (o *IngestedMedia) HasCustomerId() bool`

HasCustomerId returns a boolean if a field has been set.

### SetCustomerIdNil

`func (o *IngestedMedia) SetCustomerIdNil(b bool)`

 SetCustomerIdNil sets the value for CustomerId to be an explicit nil

### UnsetCustomerId
`func (o *IngestedMedia) UnsetCustomerId()`

UnsetCustomerId ensures that no value is present for CustomerId, not even an explicit nil
### GetEmbedding

`func (o *IngestedMedia) GetEmbedding() []float32`

GetEmbedding returns the Embedding field if non-nil, zero value otherwise.

### GetEmbeddingOk

`func (o *IngestedMedia) GetEmbeddingOk() (*[]float32, bool)`

GetEmbeddingOk returns a tuple with the Embedding field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmbedding

`func (o *IngestedMedia) SetEmbedding(v []float32)`

SetEmbedding sets Embedding field to given value.

### HasEmbedding

`func (o *IngestedMedia) HasEmbedding() bool`

HasEmbedding returns a boolean if a field has been set.

### SetEmbeddingNil

`func (o *IngestedMedia) SetEmbeddingNil(b bool)`

 SetEmbeddingNil sets the value for Embedding to be an explicit nil

### UnsetEmbedding
`func (o *IngestedMedia) UnsetEmbedding()`

UnsetEmbedding ensures that no value is present for Embedding, not even an explicit nil
### GetEmbeddingPrefix

`func (o *IngestedMedia) GetEmbeddingPrefix() []float32`

GetEmbeddingPrefix returns the EmbeddingPrefix field if non-nil, zero value otherwise.

### GetEmbeddingPrefixOk

`func (o *IngestedMedia) GetEmbeddingPrefixOk() (*[]float32, bool)`

GetEmbeddingPrefixOk returns a tuple with the EmbeddingPrefix field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmbeddingPrefix

`func (o *IngestedMedia) SetEmbeddingPrefix(v []float32)`

SetEmbeddingPrefix sets EmbeddingPrefix field to given value.

### HasEmbeddingPrefix

`func (o *IngestedMedia) HasEmbeddingPrefix() bool`

HasEmbeddingPrefix returns a boolean if a field has been set.

### SetEmbeddingPrefixNil

`func (o *IngestedMedia) SetEmbeddingPrefixNil(b bool)`

 SetEmbeddingPrefixNil sets the value for EmbeddingPrefix to be an explicit nil

### UnsetEmbeddingPrefix
`func (o *IngestedMedia) UnsetEmbeddingPrefix()`

UnsetEmbeddingPrefix ensures that no value is present for EmbeddingPrefix, not even an explicit nil
### GetExternalRef

`func (o *IngestedMedia) GetExternalRef() string`

GetExternalRef returns the ExternalRef field if non-nil, zero value otherwise.

### GetExternalRefOk

`func (o *IngestedMedia) GetExternalRefOk() (*string, bool)`

GetExternalRefOk returns a tuple with the ExternalRef field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalRef

`func (o *IngestedMedia) SetExternalRef(v string)`

SetExternalRef sets ExternalRef field to given value.

### HasExternalRef

`func (o *IngestedMedia) HasExternalRef() bool`

HasExternalRef returns a boolean if a field has been set.

### SetExternalRefNil

`func (o *IngestedMedia) SetExternalRefNil(b bool)`

 SetExternalRefNil sets the value for ExternalRef to be an explicit nil

### UnsetExternalRef
`func (o *IngestedMedia) UnsetExternalRef()`

UnsetExternalRef ensures that no value is present for ExternalRef, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


