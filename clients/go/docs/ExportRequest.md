# ExportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomerId** | Pointer to **NullableString** | Export only media tagged with this customer_id. | [optional] 
**Format** | Pointer to **string** | &#39;ndjson&#39; (default) is the full vector-bearing backup format /v1/import restores from. &#39;parquet&#39; is a metadata-only dataset export (blob_id, customer_id, media_ref, kind, caption, tags - no vectors) for analysis in DuckDB/pandas/Spark; it is not importable. | [optional] [default to "ndjson"]
**Kind** | Pointer to **NullableString** | Export only blobs of this media kind. | [optional] 
**S3Uri** | **string** | s3://bucket/prefix to write the export to. | 
**Tag** | Pointer to **NullableString** | Export only blobs whose annotation tags contain this tag. | [optional] 

## Methods

### NewExportRequest

`func NewExportRequest(s3Uri string, ) *ExportRequest`

NewExportRequest instantiates a new ExportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewExportRequestWithDefaults

`func NewExportRequestWithDefaults() *ExportRequest`

NewExportRequestWithDefaults instantiates a new ExportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCustomerId

`func (o *ExportRequest) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *ExportRequest) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *ExportRequest) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.

### HasCustomerId

`func (o *ExportRequest) HasCustomerId() bool`

HasCustomerId returns a boolean if a field has been set.

### SetCustomerIdNil

`func (o *ExportRequest) SetCustomerIdNil(b bool)`

 SetCustomerIdNil sets the value for CustomerId to be an explicit nil

### UnsetCustomerId
`func (o *ExportRequest) UnsetCustomerId()`

UnsetCustomerId ensures that no value is present for CustomerId, not even an explicit nil
### GetFormat

`func (o *ExportRequest) GetFormat() string`

GetFormat returns the Format field if non-nil, zero value otherwise.

### GetFormatOk

`func (o *ExportRequest) GetFormatOk() (*string, bool)`

GetFormatOk returns a tuple with the Format field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormat

`func (o *ExportRequest) SetFormat(v string)`

SetFormat sets Format field to given value.

### HasFormat

`func (o *ExportRequest) HasFormat() bool`

HasFormat returns a boolean if a field has been set.

### GetKind

`func (o *ExportRequest) GetKind() string`

GetKind returns the Kind field if non-nil, zero value otherwise.

### GetKindOk

`func (o *ExportRequest) GetKindOk() (*string, bool)`

GetKindOk returns a tuple with the Kind field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKind

`func (o *ExportRequest) SetKind(v string)`

SetKind sets Kind field to given value.

### HasKind

`func (o *ExportRequest) HasKind() bool`

HasKind returns a boolean if a field has been set.

### SetKindNil

`func (o *ExportRequest) SetKindNil(b bool)`

 SetKindNil sets the value for Kind to be an explicit nil

### UnsetKind
`func (o *ExportRequest) UnsetKind()`

UnsetKind ensures that no value is present for Kind, not even an explicit nil
### GetS3Uri

`func (o *ExportRequest) GetS3Uri() string`

GetS3Uri returns the S3Uri field if non-nil, zero value otherwise.

### GetS3UriOk

`func (o *ExportRequest) GetS3UriOk() (*string, bool)`

GetS3UriOk returns a tuple with the S3Uri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetS3Uri

`func (o *ExportRequest) SetS3Uri(v string)`

SetS3Uri sets S3Uri field to given value.


### GetTag

`func (o *ExportRequest) GetTag() string`

GetTag returns the Tag field if non-nil, zero value otherwise.

### GetTagOk

`func (o *ExportRequest) GetTagOk() (*string, bool)`

GetTagOk returns a tuple with the Tag field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTag

`func (o *ExportRequest) SetTag(v string)`

SetTag sets Tag field to given value.

### HasTag

`func (o *ExportRequest) HasTag() bool`

HasTag returns a boolean if a field has been set.

### SetTagNil

`func (o *ExportRequest) SetTagNil(b bool)`

 SetTagNil sets the value for Tag to be an explicit nil

### UnsetTag
`func (o *ExportRequest) UnsetTag()`

UnsetTag ensures that no value is present for Tag, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


