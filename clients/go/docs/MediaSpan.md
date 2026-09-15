# MediaSpan

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EndMs** | **int32** |  | 
**StartMs** | **int32** |  | 
**Text** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewMediaSpan

`func NewMediaSpan(endMs int32, startMs int32, ) *MediaSpan`

NewMediaSpan instantiates a new MediaSpan object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMediaSpanWithDefaults

`func NewMediaSpanWithDefaults() *MediaSpan`

NewMediaSpanWithDefaults instantiates a new MediaSpan object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEndMs

`func (o *MediaSpan) GetEndMs() int32`

GetEndMs returns the EndMs field if non-nil, zero value otherwise.

### GetEndMsOk

`func (o *MediaSpan) GetEndMsOk() (*int32, bool)`

GetEndMsOk returns a tuple with the EndMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndMs

`func (o *MediaSpan) SetEndMs(v int32)`

SetEndMs sets EndMs field to given value.


### GetStartMs

`func (o *MediaSpan) GetStartMs() int32`

GetStartMs returns the StartMs field if non-nil, zero value otherwise.

### GetStartMsOk

`func (o *MediaSpan) GetStartMsOk() (*int32, bool)`

GetStartMsOk returns a tuple with the StartMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStartMs

`func (o *MediaSpan) SetStartMs(v int32)`

SetStartMs sets StartMs field to given value.


### GetText

`func (o *MediaSpan) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *MediaSpan) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *MediaSpan) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *MediaSpan) HasText() bool`

HasText returns a boolean if a field has been set.

### SetTextNil

`func (o *MediaSpan) SetTextNil(b bool)`

 SetTextNil sets the value for Text to be an explicit nil

### UnsetText
`func (o *MediaSpan) UnsetText()`

UnsetText ensures that no value is present for Text, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


