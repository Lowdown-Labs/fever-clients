# IngestSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CollectionId** | Pointer to **NullableString** | Tag every vacuumed item with this collection_id. | [optional] 
**CustomerId** | Pointer to **NullableString** | Tag every vacuumed item with this customer_id. | [optional] 
**S3Uri** | **string** | s3://bucket/prefix in your VPC to vacuum every media item under. | 
**TargetRes** | Pointer to **NullableInt32** | Resolution to index at, in pixels (rounded to a multiple of 16). Images are resized to this before embedding; higher means more detail but slower. Leave unset for the fast production default (64). | [optional] 

## Methods

### NewIngestSource

`func NewIngestSource(s3Uri string, ) *IngestSource`

NewIngestSource instantiates a new IngestSource object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIngestSourceWithDefaults

`func NewIngestSourceWithDefaults() *IngestSource`

NewIngestSourceWithDefaults instantiates a new IngestSource object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCollectionId

`func (o *IngestSource) GetCollectionId() string`

GetCollectionId returns the CollectionId field if non-nil, zero value otherwise.

### GetCollectionIdOk

`func (o *IngestSource) GetCollectionIdOk() (*string, bool)`

GetCollectionIdOk returns a tuple with the CollectionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionId

`func (o *IngestSource) SetCollectionId(v string)`

SetCollectionId sets CollectionId field to given value.

### HasCollectionId

`func (o *IngestSource) HasCollectionId() bool`

HasCollectionId returns a boolean if a field has been set.

### SetCollectionIdNil

`func (o *IngestSource) SetCollectionIdNil(b bool)`

 SetCollectionIdNil sets the value for CollectionId to be an explicit nil

### UnsetCollectionId
`func (o *IngestSource) UnsetCollectionId()`

UnsetCollectionId ensures that no value is present for CollectionId, not even an explicit nil
### GetCustomerId

`func (o *IngestSource) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *IngestSource) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *IngestSource) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.

### HasCustomerId

`func (o *IngestSource) HasCustomerId() bool`

HasCustomerId returns a boolean if a field has been set.

### SetCustomerIdNil

`func (o *IngestSource) SetCustomerIdNil(b bool)`

 SetCustomerIdNil sets the value for CustomerId to be an explicit nil

### UnsetCustomerId
`func (o *IngestSource) UnsetCustomerId()`

UnsetCustomerId ensures that no value is present for CustomerId, not even an explicit nil
### GetS3Uri

`func (o *IngestSource) GetS3Uri() string`

GetS3Uri returns the S3Uri field if non-nil, zero value otherwise.

### GetS3UriOk

`func (o *IngestSource) GetS3UriOk() (*string, bool)`

GetS3UriOk returns a tuple with the S3Uri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetS3Uri

`func (o *IngestSource) SetS3Uri(v string)`

SetS3Uri sets S3Uri field to given value.


### GetTargetRes

`func (o *IngestSource) GetTargetRes() int32`

GetTargetRes returns the TargetRes field if non-nil, zero value otherwise.

### GetTargetResOk

`func (o *IngestSource) GetTargetResOk() (*int32, bool)`

GetTargetResOk returns a tuple with the TargetRes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetRes

`func (o *IngestSource) SetTargetRes(v int32)`

SetTargetRes sets TargetRes field to given value.

### HasTargetRes

`func (o *IngestSource) HasTargetRes() bool`

HasTargetRes returns a boolean if a field has been set.

### SetTargetResNil

`func (o *IngestSource) SetTargetResNil(b bool)`

 SetTargetResNil sets the value for TargetRes to be an explicit nil

### UnsetTargetRes
`func (o *IngestSource) UnsetTargetRes()`

UnsetTargetRes ensures that no value is present for TargetRes, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


