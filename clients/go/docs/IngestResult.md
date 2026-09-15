# IngestResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Existing** | Pointer to [**[]IngestedMedia**](IngestedMedia.md) | Items skipped by delta ingest because they were already indexed, returned with their current blob_ids (only when overwrite&#x3D;false). | [optional] 
**Ingested** | Pointer to [**[]IngestedMedia**](IngestedMedia.md) | Media items processed inline (small requests). | [optional] 
**Job** | Pointer to [**NullableJob**](Job.md) | For large or bucket-source ingests, poll this job for progress. | [optional] 

## Methods

### NewIngestResult

`func NewIngestResult() *IngestResult`

NewIngestResult instantiates a new IngestResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIngestResultWithDefaults

`func NewIngestResultWithDefaults() *IngestResult`

NewIngestResultWithDefaults instantiates a new IngestResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExisting

`func (o *IngestResult) GetExisting() []IngestedMedia`

GetExisting returns the Existing field if non-nil, zero value otherwise.

### GetExistingOk

`func (o *IngestResult) GetExistingOk() (*[]IngestedMedia, bool)`

GetExistingOk returns a tuple with the Existing field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExisting

`func (o *IngestResult) SetExisting(v []IngestedMedia)`

SetExisting sets Existing field to given value.

### HasExisting

`func (o *IngestResult) HasExisting() bool`

HasExisting returns a boolean if a field has been set.

### GetIngested

`func (o *IngestResult) GetIngested() []IngestedMedia`

GetIngested returns the Ingested field if non-nil, zero value otherwise.

### GetIngestedOk

`func (o *IngestResult) GetIngestedOk() (*[]IngestedMedia, bool)`

GetIngestedOk returns a tuple with the Ingested field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIngested

`func (o *IngestResult) SetIngested(v []IngestedMedia)`

SetIngested sets Ingested field to given value.

### HasIngested

`func (o *IngestResult) HasIngested() bool`

HasIngested returns a boolean if a field has been set.

### GetJob

`func (o *IngestResult) GetJob() Job`

GetJob returns the Job field if non-nil, zero value otherwise.

### GetJobOk

`func (o *IngestResult) GetJobOk() (*Job, bool)`

GetJobOk returns a tuple with the Job field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJob

`func (o *IngestResult) SetJob(v Job)`

SetJob sets Job field to given value.

### HasJob

`func (o *IngestResult) HasJob() bool`

HasJob returns a boolean if a field has been set.

### SetJobNil

`func (o *IngestResult) SetJobNil(b bool)`

 SetJobNil sets the value for Job to be an explicit nil

### UnsetJob
`func (o *IngestResult) UnsetJob()`

UnsetJob ensures that no value is present for Job, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


