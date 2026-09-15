# IngestedMedia

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BlobId** | **int32** |  | 
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


