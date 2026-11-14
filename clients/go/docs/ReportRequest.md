# ReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomerId** | Pointer to **NullableString** | Fill slots from this customer&#39;s corpus only. | [optional] 
**OutputS3Uri** | Pointer to **NullableString** | s3://bucket/key for the PDF. Default: reports/&lt;customer_id&gt;/&lt;job_id&gt;.pdf in the tenant bucket. | [optional] 
**Slots** | [**[]ReportSlot**](ReportSlot.md) | Labeled photo slots; each is filled with the best-matching photo. | 
**Title** | **string** | Report title, rendered at the top of the PDF. | 

## Methods

### NewReportRequest

`func NewReportRequest(slots []ReportSlot, title string, ) *ReportRequest`

NewReportRequest instantiates a new ReportRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReportRequestWithDefaults

`func NewReportRequestWithDefaults() *ReportRequest`

NewReportRequestWithDefaults instantiates a new ReportRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCustomerId

`func (o *ReportRequest) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *ReportRequest) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *ReportRequest) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.

### HasCustomerId

`func (o *ReportRequest) HasCustomerId() bool`

HasCustomerId returns a boolean if a field has been set.

### SetCustomerIdNil

`func (o *ReportRequest) SetCustomerIdNil(b bool)`

 SetCustomerIdNil sets the value for CustomerId to be an explicit nil

### UnsetCustomerId
`func (o *ReportRequest) UnsetCustomerId()`

UnsetCustomerId ensures that no value is present for CustomerId, not even an explicit nil
### GetOutputS3Uri

`func (o *ReportRequest) GetOutputS3Uri() string`

GetOutputS3Uri returns the OutputS3Uri field if non-nil, zero value otherwise.

### GetOutputS3UriOk

`func (o *ReportRequest) GetOutputS3UriOk() (*string, bool)`

GetOutputS3UriOk returns a tuple with the OutputS3Uri field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOutputS3Uri

`func (o *ReportRequest) SetOutputS3Uri(v string)`

SetOutputS3Uri sets OutputS3Uri field to given value.

### HasOutputS3Uri

`func (o *ReportRequest) HasOutputS3Uri() bool`

HasOutputS3Uri returns a boolean if a field has been set.

### SetOutputS3UriNil

`func (o *ReportRequest) SetOutputS3UriNil(b bool)`

 SetOutputS3UriNil sets the value for OutputS3Uri to be an explicit nil

### UnsetOutputS3Uri
`func (o *ReportRequest) UnsetOutputS3Uri()`

UnsetOutputS3Uri ensures that no value is present for OutputS3Uri, not even an explicit nil
### GetSlots

`func (o *ReportRequest) GetSlots() []ReportSlot`

GetSlots returns the Slots field if non-nil, zero value otherwise.

### GetSlotsOk

`func (o *ReportRequest) GetSlotsOk() (*[]ReportSlot, bool)`

GetSlotsOk returns a tuple with the Slots field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlots

`func (o *ReportRequest) SetSlots(v []ReportSlot)`

SetSlots sets Slots field to given value.


### GetTitle

`func (o *ReportRequest) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ReportRequest) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ReportRequest) SetTitle(v string)`

SetTitle sets Title field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


