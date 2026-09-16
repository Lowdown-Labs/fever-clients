# IngestMedia

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Caption** | Pointer to **NullableString** | Optional caption/keywords; indexed at the highest text-search weight. | [optional] 
**CollectionId** | Pointer to **NullableString** | Optional grouping you own (project, case, site - FEVER stores and filters it, never interprets it). Filterable at search time; returned on hits. | [optional] 
**CustomerId** | Pointer to **NullableString** | Optional tag attributing this item to one of your customers; filterable at search time. | [optional] 
**Data** | Pointer to **NullableString** | Base64-encoded media item bytes. | [optional] 
**Filename** | Pointer to **NullableString** | Original file name. Drives format detection for inline documents and LiDAR (extensions like .csv or .las - office formats are recognized by their bytes alone) and is stored on the blob for media info and attachment listings. | [optional] 
**Metadata** | Pointer to **map[string]interface{}** | Opaque JSON returned with search hits. | [optional] 
**ParentRef** | Pointer to **NullableString** | Optional pointer to a related parent asset (its external_ref, key, or blob_id). Non-searchable companions such as LiDAR scans declare the photo or video they belong to; the parent&#39;s record lists them back as attachments. | [optional] 
**StripExif** | Pointer to **bool** | Skip EXIF extraction/retention for this item. | [optional] [default to false]
**Tags** | Pointer to **[]string** | Optional tags for this item; indexed for text search and returned on hits. Merged with the appliance&#39;s zero-shot autotags. | [optional] 
**Url** | Pointer to **NullableString** | An s3:// URI to one media item you already store, instead of inline bytes. | [optional] 

## Methods

### NewIngestMedia

`func NewIngestMedia() *IngestMedia`

NewIngestMedia instantiates a new IngestMedia object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewIngestMediaWithDefaults

`func NewIngestMediaWithDefaults() *IngestMedia`

NewIngestMediaWithDefaults instantiates a new IngestMedia object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCaption

`func (o *IngestMedia) GetCaption() string`

GetCaption returns the Caption field if non-nil, zero value otherwise.

### GetCaptionOk

`func (o *IngestMedia) GetCaptionOk() (*string, bool)`

GetCaptionOk returns a tuple with the Caption field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaption

`func (o *IngestMedia) SetCaption(v string)`

SetCaption sets Caption field to given value.

### HasCaption

`func (o *IngestMedia) HasCaption() bool`

HasCaption returns a boolean if a field has been set.

### SetCaptionNil

`func (o *IngestMedia) SetCaptionNil(b bool)`

 SetCaptionNil sets the value for Caption to be an explicit nil

### UnsetCaption
`func (o *IngestMedia) UnsetCaption()`

UnsetCaption ensures that no value is present for Caption, not even an explicit nil
### GetCollectionId

`func (o *IngestMedia) GetCollectionId() string`

GetCollectionId returns the CollectionId field if non-nil, zero value otherwise.

### GetCollectionIdOk

`func (o *IngestMedia) GetCollectionIdOk() (*string, bool)`

GetCollectionIdOk returns a tuple with the CollectionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollectionId

`func (o *IngestMedia) SetCollectionId(v string)`

SetCollectionId sets CollectionId field to given value.

### HasCollectionId

`func (o *IngestMedia) HasCollectionId() bool`

HasCollectionId returns a boolean if a field has been set.

### SetCollectionIdNil

`func (o *IngestMedia) SetCollectionIdNil(b bool)`

 SetCollectionIdNil sets the value for CollectionId to be an explicit nil

### UnsetCollectionId
`func (o *IngestMedia) UnsetCollectionId()`

UnsetCollectionId ensures that no value is present for CollectionId, not even an explicit nil
### GetCustomerId

`func (o *IngestMedia) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *IngestMedia) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *IngestMedia) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.

### HasCustomerId

`func (o *IngestMedia) HasCustomerId() bool`

HasCustomerId returns a boolean if a field has been set.

### SetCustomerIdNil

`func (o *IngestMedia) SetCustomerIdNil(b bool)`

 SetCustomerIdNil sets the value for CustomerId to be an explicit nil

### UnsetCustomerId
`func (o *IngestMedia) UnsetCustomerId()`

UnsetCustomerId ensures that no value is present for CustomerId, not even an explicit nil
### GetData

`func (o *IngestMedia) GetData() string`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *IngestMedia) GetDataOk() (*string, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *IngestMedia) SetData(v string)`

SetData sets Data field to given value.

### HasData

`func (o *IngestMedia) HasData() bool`

HasData returns a boolean if a field has been set.

### SetDataNil

`func (o *IngestMedia) SetDataNil(b bool)`

 SetDataNil sets the value for Data to be an explicit nil

### UnsetData
`func (o *IngestMedia) UnsetData()`

UnsetData ensures that no value is present for Data, not even an explicit nil
### GetFilename

`func (o *IngestMedia) GetFilename() string`

GetFilename returns the Filename field if non-nil, zero value otherwise.

### GetFilenameOk

`func (o *IngestMedia) GetFilenameOk() (*string, bool)`

GetFilenameOk returns a tuple with the Filename field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFilename

`func (o *IngestMedia) SetFilename(v string)`

SetFilename sets Filename field to given value.

### HasFilename

`func (o *IngestMedia) HasFilename() bool`

HasFilename returns a boolean if a field has been set.

### SetFilenameNil

`func (o *IngestMedia) SetFilenameNil(b bool)`

 SetFilenameNil sets the value for Filename to be an explicit nil

### UnsetFilename
`func (o *IngestMedia) UnsetFilename()`

UnsetFilename ensures that no value is present for Filename, not even an explicit nil
### GetMetadata

`func (o *IngestMedia) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *IngestMedia) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *IngestMedia) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *IngestMedia) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *IngestMedia) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *IngestMedia) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetParentRef

`func (o *IngestMedia) GetParentRef() string`

GetParentRef returns the ParentRef field if non-nil, zero value otherwise.

### GetParentRefOk

`func (o *IngestMedia) GetParentRefOk() (*string, bool)`

GetParentRefOk returns a tuple with the ParentRef field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentRef

`func (o *IngestMedia) SetParentRef(v string)`

SetParentRef sets ParentRef field to given value.

### HasParentRef

`func (o *IngestMedia) HasParentRef() bool`

HasParentRef returns a boolean if a field has been set.

### SetParentRefNil

`func (o *IngestMedia) SetParentRefNil(b bool)`

 SetParentRefNil sets the value for ParentRef to be an explicit nil

### UnsetParentRef
`func (o *IngestMedia) UnsetParentRef()`

UnsetParentRef ensures that no value is present for ParentRef, not even an explicit nil
### GetStripExif

`func (o *IngestMedia) GetStripExif() bool`

GetStripExif returns the StripExif field if non-nil, zero value otherwise.

### GetStripExifOk

`func (o *IngestMedia) GetStripExifOk() (*bool, bool)`

GetStripExifOk returns a tuple with the StripExif field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStripExif

`func (o *IngestMedia) SetStripExif(v bool)`

SetStripExif sets StripExif field to given value.

### HasStripExif

`func (o *IngestMedia) HasStripExif() bool`

HasStripExif returns a boolean if a field has been set.

### GetTags

`func (o *IngestMedia) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *IngestMedia) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *IngestMedia) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *IngestMedia) HasTags() bool`

HasTags returns a boolean if a field has been set.

### SetTagsNil

`func (o *IngestMedia) SetTagsNil(b bool)`

 SetTagsNil sets the value for Tags to be an explicit nil

### UnsetTags
`func (o *IngestMedia) UnsetTags()`

UnsetTags ensures that no value is present for Tags, not even an explicit nil
### GetUrl

`func (o *IngestMedia) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *IngestMedia) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *IngestMedia) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *IngestMedia) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### SetUrlNil

`func (o *IngestMedia) SetUrlNil(b bool)`

 SetUrlNil sets the value for Url to be an explicit nil

### UnsetUrl
`func (o *IngestMedia) UnsetUrl()`

UnsetUrl ensures that no value is present for Url, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


