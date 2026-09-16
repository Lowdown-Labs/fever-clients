# MediaAttachment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BlobId** | **int32** |  | 
**ByteSize** | Pointer to **NullableInt32** |  | [optional] 
**ContentType** | Pointer to **NullableString** |  | [optional] 
**Filename** | Pointer to **NullableString** |  | [optional] 
**Kind** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewMediaAttachment

`func NewMediaAttachment(blobId int32, ) *MediaAttachment`

NewMediaAttachment instantiates a new MediaAttachment object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMediaAttachmentWithDefaults

`func NewMediaAttachmentWithDefaults() *MediaAttachment`

NewMediaAttachmentWithDefaults instantiates a new MediaAttachment object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlobId

`func (o *MediaAttachment) GetBlobId() int32`

GetBlobId returns the BlobId field if non-nil, zero value otherwise.

### GetBlobIdOk

`func (o *MediaAttachment) GetBlobIdOk() (*int32, bool)`

GetBlobIdOk returns a tuple with the BlobId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobId

`func (o *MediaAttachment) SetBlobId(v int32)`

SetBlobId sets BlobId field to given value.


### GetByteSize

`func (o *MediaAttachment) GetByteSize() int32`

GetByteSize returns the ByteSize field if non-nil, zero value otherwise.

### GetByteSizeOk

`func (o *MediaAttachment) GetByteSizeOk() (*int32, bool)`

GetByteSizeOk returns a tuple with the ByteSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetByteSize

`func (o *MediaAttachment) SetByteSize(v int32)`

SetByteSize sets ByteSize field to given value.

### HasByteSize

`func (o *MediaAttachment) HasByteSize() bool`

HasByteSize returns a boolean if a field has been set.

### SetByteSizeNil

`func (o *MediaAttachment) SetByteSizeNil(b bool)`

 SetByteSizeNil sets the value for ByteSize to be an explicit nil

### UnsetByteSize
`func (o *MediaAttachment) UnsetByteSize()`

UnsetByteSize ensures that no value is present for ByteSize, not even an explicit nil
### GetContentType

`func (o *MediaAttachment) GetContentType() string`

GetContentType returns the ContentType field if non-nil, zero value otherwise.

### GetContentTypeOk

`func (o *MediaAttachment) GetContentTypeOk() (*string, bool)`

GetContentTypeOk returns a tuple with the ContentType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetContentType

`func (o *MediaAttachment) SetContentType(v string)`

SetContentType sets ContentType field to given value.

### HasContentType

`func (o *MediaAttachment) HasContentType() bool`

HasContentType returns a boolean if a field has been set.

### SetContentTypeNil

`func (o *MediaAttachment) SetContentTypeNil(b bool)`

 SetContentTypeNil sets the value for ContentType to be an explicit nil

### UnsetContentType
`func (o *MediaAttachment) UnsetContentType()`

UnsetContentType ensures that no value is present for ContentType, not even an explicit nil
### GetFilename

`func (o *MediaAttachment) GetFilename() string`

GetFilename returns the Filename field if non-nil, zero value otherwise.

### GetFilenameOk

`func (o *MediaAttachment) GetFilenameOk() (*string, bool)`

GetFilenameOk returns a tuple with the Filename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilename

`func (o *MediaAttachment) SetFilename(v string)`

SetFilename sets Filename field to given value.

### HasFilename

`func (o *MediaAttachment) HasFilename() bool`

HasFilename returns a boolean if a field has been set.

### SetFilenameNil

`func (o *MediaAttachment) SetFilenameNil(b bool)`

 SetFilenameNil sets the value for Filename to be an explicit nil

### UnsetFilename
`func (o *MediaAttachment) UnsetFilename()`

UnsetFilename ensures that no value is present for Filename, not even an explicit nil
### GetKind

`func (o *MediaAttachment) GetKind() string`

GetKind returns the Kind field if non-nil, zero value otherwise.

### GetKindOk

`func (o *MediaAttachment) GetKindOk() (*string, bool)`

GetKindOk returns a tuple with the Kind field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKind

`func (o *MediaAttachment) SetKind(v string)`

SetKind sets Kind field to given value.

### HasKind

`func (o *MediaAttachment) HasKind() bool`

HasKind returns a boolean if a field has been set.

### SetKindNil

`func (o *MediaAttachment) SetKindNil(b bool)`

 SetKindNil sets the value for Kind to be an explicit nil

### UnsetKind
`func (o *MediaAttachment) UnsetKind()`

UnsetKind ensures that no value is present for Kind, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


