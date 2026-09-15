# IngestRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Media** | Pointer to [**[]IngestMedia**](IngestMedia.md) | 1..N media items to ingest inline. | [optional] 
**Overwrite** | Pointer to **bool** | Re-embed and update items already indexed (clobber). Default false &#x3D; delta ingest: content already indexed is skipped, so re-running an ingest only processes new items. | [optional] [default to false]
**Source** | Pointer to [**NullableIngestSource**](IngestSource.md) | Ingest every media item under an S3 prefix instead of sending bytes. | [optional] 
**TargetRes** | Pointer to **NullableInt32** | Resolution to index this batch at, in pixels (rounded to a multiple of 16). Images are resized to this before embedding; higher means more detail but slower. Leave unset for the fast production default (64), which retains most of the search quality at a fraction of the cost. | [optional] 

## Methods

### NewIngestRequest

`func NewIngestRequest() *IngestRequest`

NewIngestRequest instantiates a new IngestRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIngestRequestWithDefaults

`func NewIngestRequestWithDefaults() *IngestRequest`

NewIngestRequestWithDefaults instantiates a new IngestRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMedia

`func (o *IngestRequest) GetMedia() []IngestMedia`

GetMedia returns the Media field if non-nil, zero value otherwise.

### GetMediaOk

`func (o *IngestRequest) GetMediaOk() (*[]IngestMedia, bool)`

GetMediaOk returns a tuple with the Media field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMedia

`func (o *IngestRequest) SetMedia(v []IngestMedia)`

SetMedia sets Media field to given value.

### HasMedia

`func (o *IngestRequest) HasMedia() bool`

HasMedia returns a boolean if a field has been set.

### SetMediaNil

`func (o *IngestRequest) SetMediaNil(b bool)`

 SetMediaNil sets the value for Media to be an explicit nil

### UnsetMedia
`func (o *IngestRequest) UnsetMedia()`

UnsetMedia ensures that no value is present for Media, not even an explicit nil
### GetOverwrite

`func (o *IngestRequest) GetOverwrite() bool`

GetOverwrite returns the Overwrite field if non-nil, zero value otherwise.

### GetOverwriteOk

`func (o *IngestRequest) GetOverwriteOk() (*bool, bool)`

GetOverwriteOk returns a tuple with the Overwrite field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverwrite

`func (o *IngestRequest) SetOverwrite(v bool)`

SetOverwrite sets Overwrite field to given value.

### HasOverwrite

`func (o *IngestRequest) HasOverwrite() bool`

HasOverwrite returns a boolean if a field has been set.

### GetSource

`func (o *IngestRequest) GetSource() IngestSource`

GetSource returns the Source field if non-nil, zero value otherwise.

### GetSourceOk

`func (o *IngestRequest) GetSourceOk() (*IngestSource, bool)`

GetSourceOk returns a tuple with the Source field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSource

`func (o *IngestRequest) SetSource(v IngestSource)`

SetSource sets Source field to given value.

### HasSource

`func (o *IngestRequest) HasSource() bool`

HasSource returns a boolean if a field has been set.

### SetSourceNil

`func (o *IngestRequest) SetSourceNil(b bool)`

 SetSourceNil sets the value for Source to be an explicit nil

### UnsetSource
`func (o *IngestRequest) UnsetSource()`

UnsetSource ensures that no value is present for Source, not even an explicit nil
### GetTargetRes

`func (o *IngestRequest) GetTargetRes() int32`

GetTargetRes returns the TargetRes field if non-nil, zero value otherwise.

### GetTargetResOk

`func (o *IngestRequest) GetTargetResOk() (*int32, bool)`

GetTargetResOk returns a tuple with the TargetRes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTargetRes

`func (o *IngestRequest) SetTargetRes(v int32)`

SetTargetRes sets TargetRes field to given value.

### HasTargetRes

`func (o *IngestRequest) HasTargetRes() bool`

HasTargetRes returns a boolean if a field has been set.

### SetTargetResNil

`func (o *IngestRequest) SetTargetResNil(b bool)`

 SetTargetResNil sets the value for TargetRes to be an explicit nil

### UnsetTargetRes
`func (o *IngestRequest) UnsetTargetRes()`

UnsetTargetRes ensures that no value is present for TargetRes, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


