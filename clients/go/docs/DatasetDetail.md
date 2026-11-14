# DatasetDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BlobIds** | Pointer to **[]int32** |  | [optional] 
**CreatedAt** | Pointer to **NullableString** |  | [optional] 
**CustomerId** | Pointer to **NullableString** |  | [optional] 
**Id** | **int32** |  | 
**ItemCount** | Pointer to **int32** |  | [optional] [default to 0]
**Name** | **string** |  | 
**SourceSql** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewDatasetDetail

`func NewDatasetDetail(id int32, name string, ) *DatasetDetail`

NewDatasetDetail instantiates a new DatasetDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDatasetDetailWithDefaults

`func NewDatasetDetailWithDefaults() *DatasetDetail`

NewDatasetDetailWithDefaults instantiates a new DatasetDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlobIds

`func (o *DatasetDetail) GetBlobIds() []int32`

GetBlobIds returns the BlobIds field if non-nil, zero value otherwise.

### GetBlobIdsOk

`func (o *DatasetDetail) GetBlobIdsOk() (*[]int32, bool)`

GetBlobIdsOk returns a tuple with the BlobIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobIds

`func (o *DatasetDetail) SetBlobIds(v []int32)`

SetBlobIds sets BlobIds field to given value.

### HasBlobIds

`func (o *DatasetDetail) HasBlobIds() bool`

HasBlobIds returns a boolean if a field has been set.

### GetCreatedAt

`func (o *DatasetDetail) GetCreatedAt() string`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *DatasetDetail) GetCreatedAtOk() (*string, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *DatasetDetail) SetCreatedAt(v string)`

SetCreatedAt sets CreatedAt field to given value.

### HasCreatedAt

`func (o *DatasetDetail) HasCreatedAt() bool`

HasCreatedAt returns a boolean if a field has been set.

### SetCreatedAtNil

`func (o *DatasetDetail) SetCreatedAtNil(b bool)`

 SetCreatedAtNil sets the value for CreatedAt to be an explicit nil

### UnsetCreatedAt
`func (o *DatasetDetail) UnsetCreatedAt()`

UnsetCreatedAt ensures that no value is present for CreatedAt, not even an explicit nil
### GetCustomerId

`func (o *DatasetDetail) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *DatasetDetail) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *DatasetDetail) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.

### HasCustomerId

`func (o *DatasetDetail) HasCustomerId() bool`

HasCustomerId returns a boolean if a field has been set.

### SetCustomerIdNil

`func (o *DatasetDetail) SetCustomerIdNil(b bool)`

 SetCustomerIdNil sets the value for CustomerId to be an explicit nil

### UnsetCustomerId
`func (o *DatasetDetail) UnsetCustomerId()`

UnsetCustomerId ensures that no value is present for CustomerId, not even an explicit nil
### GetId

`func (o *DatasetDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *DatasetDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *DatasetDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetItemCount

`func (o *DatasetDetail) GetItemCount() int32`

GetItemCount returns the ItemCount field if non-nil, zero value otherwise.

### GetItemCountOk

`func (o *DatasetDetail) GetItemCountOk() (*int32, bool)`

GetItemCountOk returns a tuple with the ItemCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItemCount

`func (o *DatasetDetail) SetItemCount(v int32)`

SetItemCount sets ItemCount field to given value.

### HasItemCount

`func (o *DatasetDetail) HasItemCount() bool`

HasItemCount returns a boolean if a field has been set.

### GetName

`func (o *DatasetDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *DatasetDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *DatasetDetail) SetName(v string)`

SetName sets Name field to given value.


### GetSourceSql

`func (o *DatasetDetail) GetSourceSql() string`

GetSourceSql returns the SourceSql field if non-nil, zero value otherwise.

### GetSourceSqlOk

`func (o *DatasetDetail) GetSourceSqlOk() (*string, bool)`

GetSourceSqlOk returns a tuple with the SourceSql field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceSql

`func (o *DatasetDetail) SetSourceSql(v string)`

SetSourceSql sets SourceSql field to given value.

### HasSourceSql

`func (o *DatasetDetail) HasSourceSql() bool`

HasSourceSql returns a boolean if a field has been set.

### SetSourceSqlNil

`func (o *DatasetDetail) SetSourceSqlNil(b bool)`

 SetSourceSqlNil sets the value for SourceSql to be an explicit nil

### UnsetSourceSql
`func (o *DatasetDetail) UnsetSourceSql()`

UnsetSourceSql ensures that no value is present for SourceSql, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


