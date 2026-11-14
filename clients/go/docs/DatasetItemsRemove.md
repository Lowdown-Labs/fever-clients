# DatasetItemsRemove

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BlobIds** | Pointer to **[]int32** | Items to remove; omit (or pass null) to clear every item from the dataset. | [optional] 

## Methods

### NewDatasetItemsRemove

`func NewDatasetItemsRemove() *DatasetItemsRemove`

NewDatasetItemsRemove instantiates a new DatasetItemsRemove object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDatasetItemsRemoveWithDefaults

`func NewDatasetItemsRemoveWithDefaults() *DatasetItemsRemove`

NewDatasetItemsRemoveWithDefaults instantiates a new DatasetItemsRemove object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlobIds

`func (o *DatasetItemsRemove) GetBlobIds() []int32`

GetBlobIds returns the BlobIds field if non-nil, zero value otherwise.

### GetBlobIdsOk

`func (o *DatasetItemsRemove) GetBlobIdsOk() (*[]int32, bool)`

GetBlobIdsOk returns a tuple with the BlobIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobIds

`func (o *DatasetItemsRemove) SetBlobIds(v []int32)`

SetBlobIds sets BlobIds field to given value.

### HasBlobIds

`func (o *DatasetItemsRemove) HasBlobIds() bool`

HasBlobIds returns a boolean if a field has been set.

### SetBlobIdsNil

`func (o *DatasetItemsRemove) SetBlobIdsNil(b bool)`

 SetBlobIdsNil sets the value for BlobIds to be an explicit nil

### UnsetBlobIds
`func (o *DatasetItemsRemove) UnsetBlobIds()`

UnsetBlobIds ensures that no value is present for BlobIds, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


