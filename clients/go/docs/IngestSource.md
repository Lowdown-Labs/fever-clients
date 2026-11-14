# IngestSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CollectionId** | Pointer to **NullableString** | Tag every vacuumed item with this collection_id. | [optional] 
**CustomerId** | Pointer to **NullableString** | Tag every vacuumed item with this customer_id. | [optional] 
**HfConfig** | Pointer to **NullableString** | Hugging Face dataset config/subset name, when the dataset has several. | [optional] 
**HfDataset** | Pointer to **NullableString** | Hugging Face dataset repo id (org/name) whose images are staged and ingested. Only available on deployments with FEVER_HF_INGEST_ENABLED. | [optional] 
**HfSplit** | Pointer to **NullableString** | Hugging Face split to ingest (e.g. &#39;train&#39;); unset ingests every split. | [optional] 
**S3Uri** | Pointer to **NullableString** | s3://bucket/prefix in your VPC to vacuum every media item under. | [optional] 
**TargetRes** | Pointer to **NullableInt32** | Resolution to index at, in pixels (rounded to a multiple of 16). Images are resized to this before embedding; higher means more detail but slower. Leave unset for the fast production default (64). | [optional] 

## Methods

### NewIngestSource

`func NewIngestSource() *IngestSource`

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
### GetHfConfig

`func (o *IngestSource) GetHfConfig() string`

GetHfConfig returns the HfConfig field if non-nil, zero value otherwise.

### GetHfConfigOk

`func (o *IngestSource) GetHfConfigOk() (*string, bool)`

GetHfConfigOk returns a tuple with the HfConfig field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHfConfig

`func (o *IngestSource) SetHfConfig(v string)`

SetHfConfig sets HfConfig field to given value.

### HasHfConfig

`func (o *IngestSource) HasHfConfig() bool`

HasHfConfig returns a boolean if a field has been set.

### SetHfConfigNil

`func (o *IngestSource) SetHfConfigNil(b bool)`

 SetHfConfigNil sets the value for HfConfig to be an explicit nil

### UnsetHfConfig
`func (o *IngestSource) UnsetHfConfig()`

UnsetHfConfig ensures that no value is present for HfConfig, not even an explicit nil
### GetHfDataset

`func (o *IngestSource) GetHfDataset() string`

GetHfDataset returns the HfDataset field if non-nil, zero value otherwise.

### GetHfDatasetOk

`func (o *IngestSource) GetHfDatasetOk() (*string, bool)`

GetHfDatasetOk returns a tuple with the HfDataset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHfDataset

`func (o *IngestSource) SetHfDataset(v string)`

SetHfDataset sets HfDataset field to given value.

### HasHfDataset

`func (o *IngestSource) HasHfDataset() bool`

HasHfDataset returns a boolean if a field has been set.

### SetHfDatasetNil

`func (o *IngestSource) SetHfDatasetNil(b bool)`

 SetHfDatasetNil sets the value for HfDataset to be an explicit nil

### UnsetHfDataset
`func (o *IngestSource) UnsetHfDataset()`

UnsetHfDataset ensures that no value is present for HfDataset, not even an explicit nil
### GetHfSplit

`func (o *IngestSource) GetHfSplit() string`

GetHfSplit returns the HfSplit field if non-nil, zero value otherwise.

### GetHfSplitOk

`func (o *IngestSource) GetHfSplitOk() (*string, bool)`

GetHfSplitOk returns a tuple with the HfSplit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHfSplit

`func (o *IngestSource) SetHfSplit(v string)`

SetHfSplit sets HfSplit field to given value.

### HasHfSplit

`func (o *IngestSource) HasHfSplit() bool`

HasHfSplit returns a boolean if a field has been set.

### SetHfSplitNil

`func (o *IngestSource) SetHfSplitNil(b bool)`

 SetHfSplitNil sets the value for HfSplit to be an explicit nil

### UnsetHfSplit
`func (o *IngestSource) UnsetHfSplit()`

UnsetHfSplit ensures that no value is present for HfSplit, not even an explicit nil
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

### HasS3Uri

`func (o *IngestSource) HasS3Uri() bool`

HasS3Uri returns a boolean if a field has been set.

### SetS3UriNil

`func (o *IngestSource) SetS3UriNil(b bool)`

 SetS3UriNil sets the value for S3Uri to be an explicit nil

### UnsetS3Uri
`func (o *IngestSource) UnsetS3Uri()`

UnsetS3Uri ensures that no value is present for S3Uri, not even an explicit nil
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


