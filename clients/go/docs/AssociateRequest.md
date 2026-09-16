# AssociateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CollectionId** | Pointer to **NullableString** | Set/update the collection grouping for this blob. | [optional] 
**ParentRef** | Pointer to **NullableString** | Set/update the pointer to this blob&#39;s related parent asset (its external_ref, key, or blob_id). | [optional] 

## Methods

### NewAssociateRequest

`func NewAssociateRequest() *AssociateRequest`

NewAssociateRequest instantiates a new AssociateRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAssociateRequestWithDefaults

`func NewAssociateRequestWithDefaults() *AssociateRequest`

NewAssociateRequestWithDefaults instantiates a new AssociateRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCollectionId

`func (o *AssociateRequest) GetCollectionId() string`

GetCollectionId returns the CollectionId field if non-nil, zero value otherwise.

### GetCollectionIdOk

`func (o *AssociateRequest) GetCollectionIdOk() (*string, bool)`

GetCollectionIdOk returns a tuple with the CollectionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionId

`func (o *AssociateRequest) SetCollectionId(v string)`

SetCollectionId sets CollectionId field to given value.

### HasCollectionId

`func (o *AssociateRequest) HasCollectionId() bool`

HasCollectionId returns a boolean if a field has been set.

### SetCollectionIdNil

`func (o *AssociateRequest) SetCollectionIdNil(b bool)`

 SetCollectionIdNil sets the value for CollectionId to be an explicit nil

### UnsetCollectionId
`func (o *AssociateRequest) UnsetCollectionId()`

UnsetCollectionId ensures that no value is present for CollectionId, not even an explicit nil
### GetParentRef

`func (o *AssociateRequest) GetParentRef() string`

GetParentRef returns the ParentRef field if non-nil, zero value otherwise.

### GetParentRefOk

`func (o *AssociateRequest) GetParentRefOk() (*string, bool)`

GetParentRefOk returns a tuple with the ParentRef field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentRef

`func (o *AssociateRequest) SetParentRef(v string)`

SetParentRef sets ParentRef field to given value.

### HasParentRef

`func (o *AssociateRequest) HasParentRef() bool`

HasParentRef returns a boolean if a field has been set.

### SetParentRefNil

`func (o *AssociateRequest) SetParentRefNil(b bool)`

 SetParentRefNil sets the value for ParentRef to be an explicit nil

### UnsetParentRef
`func (o *AssociateRequest) UnsetParentRef()`

UnsetParentRef ensures that no value is present for ParentRef, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


