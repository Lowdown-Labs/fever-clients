# ImportResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Imported** | **int32** |  | 
**S3Uri** | **string** |  | 

## Methods

### NewImportResult

`func NewImportResult(imported int32, s3Uri string, ) *ImportResult`

NewImportResult instantiates a new ImportResult object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewImportResultWithDefaults

`func NewImportResultWithDefaults() *ImportResult`

NewImportResultWithDefaults instantiates a new ImportResult object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetImported

`func (o *ImportResult) GetImported() int32`

GetImported returns the Imported field if non-nil, zero value otherwise.

### GetImportedOk

`func (o *ImportResult) GetImportedOk() (*int32, bool)`

GetImportedOk returns a tuple with the Imported field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImported

`func (o *ImportResult) SetImported(v int32)`

SetImported sets Imported field to given value.


### GetS3Uri

`func (o *ImportResult) GetS3Uri() string`

GetS3Uri returns the S3Uri field if non-nil, zero value otherwise.

### GetS3UriOk

`func (o *ImportResult) GetS3UriOk() (*string, bool)`

GetS3UriOk returns a tuple with the S3Uri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetS3Uri

`func (o *ImportResult) SetS3Uri(v string)`

SetS3Uri sets S3Uri field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


