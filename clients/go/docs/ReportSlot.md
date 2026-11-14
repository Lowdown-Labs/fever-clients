# ReportSlot

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Caption** | Pointer to **NullableString** | Extra caption text, appended to the search query. | [optional] 
**Label** | **string** | Slot label; doubles as the text search query for this slot. | 
**MinScore** | Pointer to **NullableFloat32** | Per-slot confidence gate (cosine). Defaults to FEVER_REPORT_MIN_SCORE (0.25). | [optional] 

## Methods

### NewReportSlot

`func NewReportSlot(label string, ) *ReportSlot`

NewReportSlot instantiates a new ReportSlot object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewReportSlotWithDefaults

`func NewReportSlotWithDefaults() *ReportSlot`

NewReportSlotWithDefaults instantiates a new ReportSlot object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCaption

`func (o *ReportSlot) GetCaption() string`

GetCaption returns the Caption field if non-nil, zero value otherwise.

### GetCaptionOk

`func (o *ReportSlot) GetCaptionOk() (*string, bool)`

GetCaptionOk returns a tuple with the Caption field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaption

`func (o *ReportSlot) SetCaption(v string)`

SetCaption sets Caption field to given value.

### HasCaption

`func (o *ReportSlot) HasCaption() bool`

HasCaption returns a boolean if a field has been set.

### SetCaptionNil

`func (o *ReportSlot) SetCaptionNil(b bool)`

 SetCaptionNil sets the value for Caption to be an explicit nil

### UnsetCaption
`func (o *ReportSlot) UnsetCaption()`

UnsetCaption ensures that no value is present for Caption, not even an explicit nil
### GetLabel

`func (o *ReportSlot) GetLabel() string`

GetLabel returns the Label field if non-nil, zero value otherwise.

### GetLabelOk

`func (o *ReportSlot) GetLabelOk() (*string, bool)`

GetLabelOk returns a tuple with the Label field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabel

`func (o *ReportSlot) SetLabel(v string)`

SetLabel sets Label field to given value.


### GetMinScore

`func (o *ReportSlot) GetMinScore() float32`

GetMinScore returns the MinScore field if non-nil, zero value otherwise.

### GetMinScoreOk

`func (o *ReportSlot) GetMinScoreOk() (*float32, bool)`

GetMinScoreOk returns a tuple with the MinScore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinScore

`func (o *ReportSlot) SetMinScore(v float32)`

SetMinScore sets MinScore field to given value.

### HasMinScore

`func (o *ReportSlot) HasMinScore() bool`

HasMinScore returns a boolean if a field has been set.

### SetMinScoreNil

`func (o *ReportSlot) SetMinScoreNil(b bool)`

 SetMinScoreNil sets the value for MinScore to be an explicit nil

### UnsetMinScore
`func (o *ReportSlot) UnsetMinScore()`

UnsetMinScore ensures that no value is present for MinScore, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


