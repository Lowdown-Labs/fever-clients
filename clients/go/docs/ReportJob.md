# ReportJob

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**JobId** | **int32** |  | 
**Status** | Pointer to **string** |  | [optional] [default to "pending"]

## Methods

### NewReportJob

`func NewReportJob(jobId int32, ) *ReportJob`

NewReportJob instantiates a new ReportJob object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReportJobWithDefaults

`func NewReportJobWithDefaults() *ReportJob`

NewReportJobWithDefaults instantiates a new ReportJob object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetJobId

`func (o *ReportJob) GetJobId() int32`

GetJobId returns the JobId field if non-nil, zero value otherwise.

### GetJobIdOk

`func (o *ReportJob) GetJobIdOk() (*int32, bool)`

GetJobIdOk returns a tuple with the JobId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJobId

`func (o *ReportJob) SetJobId(v int32)`

SetJobId sets JobId field to given value.


### GetStatus

`func (o *ReportJob) GetStatus() string`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *ReportJob) GetStatusOk() (*string, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *ReportJob) SetStatus(v string)`

SetStatus sets Status field to given value.

### HasStatus

`func (o *ReportJob) HasStatus() bool`

HasStatus returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


