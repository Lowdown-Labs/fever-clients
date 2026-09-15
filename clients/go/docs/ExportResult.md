# ExportResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exported** | **int32** |  | 
**S3Uri** | **string** |  | 

## Methods

### NewExportResult

`func NewExportResult(exported int32, s3Uri string, ) *ExportResult`

NewExportResult instantiates a new ExportResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewExportResultWithDefaults

`func NewExportResultWithDefaults() *ExportResult`

NewExportResultWithDefaults instantiates a new ExportResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetExported

`func (o *ExportResult) GetExported() int32`

GetExported returns the Exported field if non-nil, zero value otherwise.

### GetExportedOk

`func (o *ExportResult) GetExportedOk() (*int32, bool)`

GetExportedOk returns a tuple with the Exported field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExported

`func (o *ExportResult) SetExported(v int32)`

SetExported sets Exported field to given value.


### GetS3Uri

`func (o *ExportResult) GetS3Uri() string`

GetS3Uri returns the S3Uri field if non-nil, zero value otherwise.

### GetS3UriOk

`func (o *ExportResult) GetS3UriOk() (*string, bool)`

GetS3UriOk returns a tuple with the S3Uri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetS3Uri

`func (o *ExportResult) SetS3Uri(v string)`

SetS3Uri sets S3Uri field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


