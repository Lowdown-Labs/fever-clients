# MediaInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attachments** | Pointer to [**[]MediaAttachment**](MediaAttachment.md) | Related items pointing at this blob via parent_ref (e.g. a LiDAR scan attached to the photo or video it belongs to). | [optional] 
**BlobId** | **int32** |  | 
**Caption** | Pointer to **NullableString** | The user_text caption/keywords supplied at ingest. | [optional] 
**CapturedAt** | Pointer to **NullableTime** | EXIF capture time. | [optional] 
**CollectionId** | Pointer to **NullableString** | Collection this item was grouped under at ingest, if any. | [optional] 
**CustomerId** | Pointer to **NullableString** |  | [optional] 
**Device** | Pointer to **NullableString** | EXIF camera make/model. | [optional] 
**ExternalRef** | Pointer to **NullableString** | s3:// URI of the stored original. | [optional] 
**FrameCount** | Pointer to **int32** | Sampled video frames derived from this blob. | [optional] [default to 0]
**GpsLat** | Pointer to **NullableFloat32** |  | [optional] 
**GpsLon** | Pointer to **NullableFloat32** |  | [optional] 
**Kind** | Pointer to **NullableString** | Media kind of this blob (image/video/audio/pdf/doc/note/lidar). | [optional] 
**Metadata** | Pointer to **map[string]interface{}** |  | [optional] 
**OcrText** | Pointer to **NullableString** | Text OCR&#39;d out of the item (PDF pages always, photos when enabled). | [optional] 
**ParentRef** | Pointer to **NullableString** | Pointer to this item&#39;s related parent asset, if declared. | [optional] 
**Synthetic** | Pointer to **NullableFloat32** | Likely-AI score in [0,1] (FEVER_SYNTHETIC), when scored. | [optional] 
**Tags** | Pointer to **[]string** | Client-supplied tags merged with zero-shot autotags. | [optional] 
**TranscriptSegments** | Pointer to **int32** | Whisper transcript segments derived from this blob. | [optional] [default to 0]

## Methods

### NewMediaInfo

`func NewMediaInfo(blobId int32, ) *MediaInfo`

NewMediaInfo instantiates a new MediaInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMediaInfoWithDefaults

`func NewMediaInfoWithDefaults() *MediaInfo`

NewMediaInfoWithDefaults instantiates a new MediaInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAttachments

`func (o *MediaInfo) GetAttachments() []MediaAttachment`

GetAttachments returns the Attachments field if non-nil, zero value otherwise.

### GetAttachmentsOk

`func (o *MediaInfo) GetAttachmentsOk() (*[]MediaAttachment, bool)`

GetAttachmentsOk returns a tuple with the Attachments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttachments

`func (o *MediaInfo) SetAttachments(v []MediaAttachment)`

SetAttachments sets Attachments field to given value.

### HasAttachments

`func (o *MediaInfo) HasAttachments() bool`

HasAttachments returns a boolean if a field has been set.

### GetBlobId

`func (o *MediaInfo) GetBlobId() int32`

GetBlobId returns the BlobId field if non-nil, zero value otherwise.

### GetBlobIdOk

`func (o *MediaInfo) GetBlobIdOk() (*int32, bool)`

GetBlobIdOk returns a tuple with the BlobId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobId

`func (o *MediaInfo) SetBlobId(v int32)`

SetBlobId sets BlobId field to given value.


### GetCaption

`func (o *MediaInfo) GetCaption() string`

GetCaption returns the Caption field if non-nil, zero value otherwise.

### GetCaptionOk

`func (o *MediaInfo) GetCaptionOk() (*string, bool)`

GetCaptionOk returns a tuple with the Caption field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaption

`func (o *MediaInfo) SetCaption(v string)`

SetCaption sets Caption field to given value.

### HasCaption

`func (o *MediaInfo) HasCaption() bool`

HasCaption returns a boolean if a field has been set.

### SetCaptionNil

`func (o *MediaInfo) SetCaptionNil(b bool)`

 SetCaptionNil sets the value for Caption to be an explicit nil

### UnsetCaption
`func (o *MediaInfo) UnsetCaption()`

UnsetCaption ensures that no value is present for Caption, not even an explicit nil
### GetCapturedAt

`func (o *MediaInfo) GetCapturedAt() time.Time`

GetCapturedAt returns the CapturedAt field if non-nil, zero value otherwise.

### GetCapturedAtOk

`func (o *MediaInfo) GetCapturedAtOk() (*time.Time, bool)`

GetCapturedAtOk returns a tuple with the CapturedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCapturedAt

`func (o *MediaInfo) SetCapturedAt(v time.Time)`

SetCapturedAt sets CapturedAt field to given value.

### HasCapturedAt

`func (o *MediaInfo) HasCapturedAt() bool`

HasCapturedAt returns a boolean if a field has been set.

### SetCapturedAtNil

`func (o *MediaInfo) SetCapturedAtNil(b bool)`

 SetCapturedAtNil sets the value for CapturedAt to be an explicit nil

### UnsetCapturedAt
`func (o *MediaInfo) UnsetCapturedAt()`

UnsetCapturedAt ensures that no value is present for CapturedAt, not even an explicit nil
### GetCollectionId

`func (o *MediaInfo) GetCollectionId() string`

GetCollectionId returns the CollectionId field if non-nil, zero value otherwise.

### GetCollectionIdOk

`func (o *MediaInfo) GetCollectionIdOk() (*string, bool)`

GetCollectionIdOk returns a tuple with the CollectionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionId

`func (o *MediaInfo) SetCollectionId(v string)`

SetCollectionId sets CollectionId field to given value.

### HasCollectionId

`func (o *MediaInfo) HasCollectionId() bool`

HasCollectionId returns a boolean if a field has been set.

### SetCollectionIdNil

`func (o *MediaInfo) SetCollectionIdNil(b bool)`

 SetCollectionIdNil sets the value for CollectionId to be an explicit nil

### UnsetCollectionId
`func (o *MediaInfo) UnsetCollectionId()`

UnsetCollectionId ensures that no value is present for CollectionId, not even an explicit nil
### GetCustomerId

`func (o *MediaInfo) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *MediaInfo) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *MediaInfo) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.

### HasCustomerId

`func (o *MediaInfo) HasCustomerId() bool`

HasCustomerId returns a boolean if a field has been set.

### SetCustomerIdNil

`func (o *MediaInfo) SetCustomerIdNil(b bool)`

 SetCustomerIdNil sets the value for CustomerId to be an explicit nil

### UnsetCustomerId
`func (o *MediaInfo) UnsetCustomerId()`

UnsetCustomerId ensures that no value is present for CustomerId, not even an explicit nil
### GetDevice

`func (o *MediaInfo) GetDevice() string`

GetDevice returns the Device field if non-nil, zero value otherwise.

### GetDeviceOk

`func (o *MediaInfo) GetDeviceOk() (*string, bool)`

GetDeviceOk returns a tuple with the Device field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDevice

`func (o *MediaInfo) SetDevice(v string)`

SetDevice sets Device field to given value.

### HasDevice

`func (o *MediaInfo) HasDevice() bool`

HasDevice returns a boolean if a field has been set.

### SetDeviceNil

`func (o *MediaInfo) SetDeviceNil(b bool)`

 SetDeviceNil sets the value for Device to be an explicit nil

### UnsetDevice
`func (o *MediaInfo) UnsetDevice()`

UnsetDevice ensures that no value is present for Device, not even an explicit nil
### GetExternalRef

`func (o *MediaInfo) GetExternalRef() string`

GetExternalRef returns the ExternalRef field if non-nil, zero value otherwise.

### GetExternalRefOk

`func (o *MediaInfo) GetExternalRefOk() (*string, bool)`

GetExternalRefOk returns a tuple with the ExternalRef field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalRef

`func (o *MediaInfo) SetExternalRef(v string)`

SetExternalRef sets ExternalRef field to given value.

### HasExternalRef

`func (o *MediaInfo) HasExternalRef() bool`

HasExternalRef returns a boolean if a field has been set.

### SetExternalRefNil

`func (o *MediaInfo) SetExternalRefNil(b bool)`

 SetExternalRefNil sets the value for ExternalRef to be an explicit nil

### UnsetExternalRef
`func (o *MediaInfo) UnsetExternalRef()`

UnsetExternalRef ensures that no value is present for ExternalRef, not even an explicit nil
### GetFrameCount

`func (o *MediaInfo) GetFrameCount() int32`

GetFrameCount returns the FrameCount field if non-nil, zero value otherwise.

### GetFrameCountOk

`func (o *MediaInfo) GetFrameCountOk() (*int32, bool)`

GetFrameCountOk returns a tuple with the FrameCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFrameCount

`func (o *MediaInfo) SetFrameCount(v int32)`

SetFrameCount sets FrameCount field to given value.

### HasFrameCount

`func (o *MediaInfo) HasFrameCount() bool`

HasFrameCount returns a boolean if a field has been set.

### GetGpsLat

`func (o *MediaInfo) GetGpsLat() float32`

GetGpsLat returns the GpsLat field if non-nil, zero value otherwise.

### GetGpsLatOk

`func (o *MediaInfo) GetGpsLatOk() (*float32, bool)`

GetGpsLatOk returns a tuple with the GpsLat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGpsLat

`func (o *MediaInfo) SetGpsLat(v float32)`

SetGpsLat sets GpsLat field to given value.

### HasGpsLat

`func (o *MediaInfo) HasGpsLat() bool`

HasGpsLat returns a boolean if a field has been set.

### SetGpsLatNil

`func (o *MediaInfo) SetGpsLatNil(b bool)`

 SetGpsLatNil sets the value for GpsLat to be an explicit nil

### UnsetGpsLat
`func (o *MediaInfo) UnsetGpsLat()`

UnsetGpsLat ensures that no value is present for GpsLat, not even an explicit nil
### GetGpsLon

`func (o *MediaInfo) GetGpsLon() float32`

GetGpsLon returns the GpsLon field if non-nil, zero value otherwise.

### GetGpsLonOk

`func (o *MediaInfo) GetGpsLonOk() (*float32, bool)`

GetGpsLonOk returns a tuple with the GpsLon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGpsLon

`func (o *MediaInfo) SetGpsLon(v float32)`

SetGpsLon sets GpsLon field to given value.

### HasGpsLon

`func (o *MediaInfo) HasGpsLon() bool`

HasGpsLon returns a boolean if a field has been set.

### SetGpsLonNil

`func (o *MediaInfo) SetGpsLonNil(b bool)`

 SetGpsLonNil sets the value for GpsLon to be an explicit nil

### UnsetGpsLon
`func (o *MediaInfo) UnsetGpsLon()`

UnsetGpsLon ensures that no value is present for GpsLon, not even an explicit nil
### GetKind

`func (o *MediaInfo) GetKind() string`

GetKind returns the Kind field if non-nil, zero value otherwise.

### GetKindOk

`func (o *MediaInfo) GetKindOk() (*string, bool)`

GetKindOk returns a tuple with the Kind field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKind

`func (o *MediaInfo) SetKind(v string)`

SetKind sets Kind field to given value.

### HasKind

`func (o *MediaInfo) HasKind() bool`

HasKind returns a boolean if a field has been set.

### SetKindNil

`func (o *MediaInfo) SetKindNil(b bool)`

 SetKindNil sets the value for Kind to be an explicit nil

### UnsetKind
`func (o *MediaInfo) UnsetKind()`

UnsetKind ensures that no value is present for Kind, not even an explicit nil
### GetMetadata

`func (o *MediaInfo) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *MediaInfo) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *MediaInfo) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *MediaInfo) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *MediaInfo) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *MediaInfo) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetOcrText

`func (o *MediaInfo) GetOcrText() string`

GetOcrText returns the OcrText field if non-nil, zero value otherwise.

### GetOcrTextOk

`func (o *MediaInfo) GetOcrTextOk() (*string, bool)`

GetOcrTextOk returns a tuple with the OcrText field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOcrText

`func (o *MediaInfo) SetOcrText(v string)`

SetOcrText sets OcrText field to given value.

### HasOcrText

`func (o *MediaInfo) HasOcrText() bool`

HasOcrText returns a boolean if a field has been set.

### SetOcrTextNil

`func (o *MediaInfo) SetOcrTextNil(b bool)`

 SetOcrTextNil sets the value for OcrText to be an explicit nil

### UnsetOcrText
`func (o *MediaInfo) UnsetOcrText()`

UnsetOcrText ensures that no value is present for OcrText, not even an explicit nil
### GetParentRef

`func (o *MediaInfo) GetParentRef() string`

GetParentRef returns the ParentRef field if non-nil, zero value otherwise.

### GetParentRefOk

`func (o *MediaInfo) GetParentRefOk() (*string, bool)`

GetParentRefOk returns a tuple with the ParentRef field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentRef

`func (o *MediaInfo) SetParentRef(v string)`

SetParentRef sets ParentRef field to given value.

### HasParentRef

`func (o *MediaInfo) HasParentRef() bool`

HasParentRef returns a boolean if a field has been set.

### SetParentRefNil

`func (o *MediaInfo) SetParentRefNil(b bool)`

 SetParentRefNil sets the value for ParentRef to be an explicit nil

### UnsetParentRef
`func (o *MediaInfo) UnsetParentRef()`

UnsetParentRef ensures that no value is present for ParentRef, not even an explicit nil
### GetSynthetic

`func (o *MediaInfo) GetSynthetic() float32`

GetSynthetic returns the Synthetic field if non-nil, zero value otherwise.

### GetSyntheticOk

`func (o *MediaInfo) GetSyntheticOk() (*float32, bool)`

GetSyntheticOk returns a tuple with the Synthetic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSynthetic

`func (o *MediaInfo) SetSynthetic(v float32)`

SetSynthetic sets Synthetic field to given value.

### HasSynthetic

`func (o *MediaInfo) HasSynthetic() bool`

HasSynthetic returns a boolean if a field has been set.

### SetSyntheticNil

`func (o *MediaInfo) SetSyntheticNil(b bool)`

 SetSyntheticNil sets the value for Synthetic to be an explicit nil

### UnsetSynthetic
`func (o *MediaInfo) UnsetSynthetic()`

UnsetSynthetic ensures that no value is present for Synthetic, not even an explicit nil
### GetTags

`func (o *MediaInfo) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *MediaInfo) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *MediaInfo) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *MediaInfo) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetTranscriptSegments

`func (o *MediaInfo) GetTranscriptSegments() int32`

GetTranscriptSegments returns the TranscriptSegments field if non-nil, zero value otherwise.

### GetTranscriptSegmentsOk

`func (o *MediaInfo) GetTranscriptSegmentsOk() (*int32, bool)`

GetTranscriptSegmentsOk returns a tuple with the TranscriptSegments field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTranscriptSegments

`func (o *MediaInfo) SetTranscriptSegments(v int32)`

SetTranscriptSegments sets TranscriptSegments field to given value.

### HasTranscriptSegments

`func (o *MediaInfo) HasTranscriptSegments() bool`

HasTranscriptSegments returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


