# DatasetCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BlobIds** | Pointer to **[]int32** | Optional initial items; every blob must belong to the dataset&#39;s customer. | [optional] 
**CustomerId** | Pointer to **NullableString** | Admin keys only: own this dataset to this customer. Scoped keys are always forced to their own customer_id. | [optional] 
**Name** | **string** | Dataset name, unique per tenant. | 
**SourceSql** | Pointer to **NullableString** | Provenance: the SELECT that produced the item set, kept so the curation query can be reviewed and refined later. | [optional] 

## Methods

### NewDatasetCreate

`func NewDatasetCreate(name string, ) *DatasetCreate`

NewDatasetCreate instantiates a new DatasetCreate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDatasetCreateWithDefaults

`func NewDatasetCreateWithDefaults() *DatasetCreate`

NewDatasetCreateWithDefaults instantiates a new DatasetCreate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlobIds

`func (o *DatasetCreate) GetBlobIds() []int32`

GetBlobIds returns the BlobIds field if non-nil, zero value otherwise.

### GetBlobIdsOk

`func (o *DatasetCreate) GetBlobIdsOk() (*[]int32, bool)`

GetBlobIdsOk returns a tuple with the BlobIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobIds

`func (o *DatasetCreate) SetBlobIds(v []int32)`

SetBlobIds sets BlobIds field to given value.

### HasBlobIds

`func (o *DatasetCreate) HasBlobIds() bool`

HasBlobIds returns a boolean if a field has been set.

### SetBlobIdsNil

`func (o *DatasetCreate) SetBlobIdsNil(b bool)`

 SetBlobIdsNil sets the value for BlobIds to be an explicit nil

### UnsetBlobIds
`func (o *DatasetCreate) UnsetBlobIds()`

UnsetBlobIds ensures that no value is present for BlobIds, not even an explicit nil
### GetCustomerId

`func (o *DatasetCreate) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *DatasetCreate) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *DatasetCreate) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.

### HasCustomerId

`func (o *DatasetCreate) HasCustomerId() bool`

HasCustomerId returns a boolean if a field has been set.

### SetCustomerIdNil

`func (o *DatasetCreate) SetCustomerIdNil(b bool)`

 SetCustomerIdNil sets the value for CustomerId to be an explicit nil

### UnsetCustomerId
`func (o *DatasetCreate) UnsetCustomerId()`

UnsetCustomerId ensures that no value is present for CustomerId, not even an explicit nil
### GetName

`func (o *DatasetCreate) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *DatasetCreate) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *DatasetCreate) SetName(v string)`

SetName sets Name field to given value.


### GetSourceSql

`func (o *DatasetCreate) GetSourceSql() string`

GetSourceSql returns the SourceSql field if non-nil, zero value otherwise.

### GetSourceSqlOk

`func (o *DatasetCreate) GetSourceSqlOk() (*string, bool)`

GetSourceSqlOk returns a tuple with the SourceSql field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSourceSql

`func (o *DatasetCreate) SetSourceSql(v string)`

SetSourceSql sets SourceSql field to given value.

### HasSourceSql

`func (o *DatasetCreate) HasSourceSql() bool`

HasSourceSql returns a boolean if a field has been set.

### SetSourceSqlNil

`func (o *DatasetCreate) SetSourceSqlNil(b bool)`

 SetSourceSqlNil sets the value for SourceSql to be an explicit nil

### UnsetSourceSql
`func (o *DatasetCreate) UnsetSourceSql()`

UnsetSourceSql ensures that no value is present for SourceSql, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


