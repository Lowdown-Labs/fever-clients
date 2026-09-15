# MediaFrame

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FrameNo** | **int32** |  | 
**TsMs** | **int32** |  | 

## Methods

### NewMediaFrame

`func NewMediaFrame(frameNo int32, tsMs int32, ) *MediaFrame`

NewMediaFrame instantiates a new MediaFrame object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMediaFrameWithDefaults

`func NewMediaFrameWithDefaults() *MediaFrame`

NewMediaFrameWithDefaults instantiates a new MediaFrame object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFrameNo

`func (o *MediaFrame) GetFrameNo() int32`

GetFrameNo returns the FrameNo field if non-nil, zero value otherwise.

### GetFrameNoOk

`func (o *MediaFrame) GetFrameNoOk() (*int32, bool)`

GetFrameNoOk returns a tuple with the FrameNo field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrameNo

`func (o *MediaFrame) SetFrameNo(v int32)`

SetFrameNo sets FrameNo field to given value.


### GetTsMs

`func (o *MediaFrame) GetTsMs() int32`

GetTsMs returns the TsMs field if non-nil, zero value otherwise.

### GetTsMsOk

`func (o *MediaFrame) GetTsMsOk() (*int32, bool)`

GetTsMsOk returns a tuple with the TsMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTsMs

`func (o *MediaFrame) SetTsMs(v int32)`

SetTsMs sets TsMs field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


