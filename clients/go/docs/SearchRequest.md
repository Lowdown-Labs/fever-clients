# SearchRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**After** | Pointer to **NullableString** | EXIF capture time &gt;&#x3D; this ISO datetime. | [optional] 
**Before** | Pointer to **NullableString** | EXIF capture time &lt;&#x3D; this ISO datetime. | [optional] 
**CollapseDuplicates** | Pointer to **bool** | Collapse near-duplicate items so each result is a distinct representative; the folded-in duplicates are listed on each hit. | [optional] [default to true]
**CustomerId** | Pointer to **NullableString** | Restrict results to media tagged with this customer_id. | [optional] 
**Device** | Pointer to **NullableString** | EXIF camera make/model substring. | [optional] 
**DupeThreshold** | Pointer to **NullableFloat32** | Cosine similarity cutoff 0..1 for treating two items as duplicates; higher is stricter. Defaults to the appliance setting when omitted. | [optional] 
**ExcludeTags** | Pointer to **[]string** | Exclude blobs carrying any of these tags (ingest tags and/or zero-shot autotags), e.g. [&#39;people&#39;] to build a no-people dataset. | [optional] 
**Image** | Pointer to **NullableString** | Base64 image for image-to-image search / dedup. | [optional] 
**ImageBlobId** | Pointer to **NullableInt32** | Search with the vector of an already-indexed image (no re-upload, no re-embed). | [optional] 
**IncludeTags** | Pointer to **[]string** | Only blobs carrying at least one of these tags (ANY semantics: e.g. a list of geo:&lt;place&gt; tags an integrator&#39;s UI offers). Combine with exclude_tags as you like. | [optional] 
**IndexedRes** | Pointer to **NullableInt32** | Restrict results to blobs indexed at exactly this resolution (pixels; see IngestRequest.target_res). Blobs ingested before this filter existed have no recorded resolution and are excluded whenever this is set. | [optional] 
**K** | Pointer to **int32** | Max results. | [optional] [default to 10]
**Kind** | Pointer to **NullableString** | Constrain results to one media kind; unset scans every kind. Video hits attach seek_ms; audio/transcript hits attach span. | [optional] 
**MaxHeight** | Pointer to **NullableInt32** | Restrict results to blobs at most this many pixels tall (stored media dimensions; blobs with unknown dimensions are excluded whenever this is set). | [optional] 
**MaxWidth** | Pointer to **NullableInt32** | Restrict results to blobs at most this many pixels wide (stored media dimensions; blobs with unknown dimensions are excluded whenever this is set). | [optional] 
**MinScore** | Pointer to **float32** | Confidence cutoff 0..1; for text this is the reranker&#39;s match probability. | [optional] [default to 0.0]
**Near** | Pointer to **[]float32** | Geo filter [lat, lon, radius_km] from EXIF GPS. | [optional] 
**Sort** | Pointer to **NullableString** | &#39;relevance&#39; (default) is the fused/calibrated ordering; &#39;distance&#39; reorders results nearest-first and requires the near filter - e.g. an integrator&#39;s map view. An explicit ordering knob, not another relevance signal. | [optional] 
**Text** | Pointer to **NullableString** | Text query (meaning-based, not keyword). | [optional] 

## Methods

### NewSearchRequest

`func NewSearchRequest() *SearchRequest`

NewSearchRequest instantiates a new SearchRequest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSearchRequestWithDefaults

`func NewSearchRequestWithDefaults() *SearchRequest`

NewSearchRequestWithDefaults instantiates a new SearchRequest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAfter

`func (o *SearchRequest) GetAfter() string`

GetAfter returns the After field if non-nil, zero value otherwise.

### GetAfterOk

`func (o *SearchRequest) GetAfterOk() (*string, bool)`

GetAfterOk returns a tuple with the After field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAfter

`func (o *SearchRequest) SetAfter(v string)`

SetAfter sets After field to given value.

### HasAfter

`func (o *SearchRequest) HasAfter() bool`

HasAfter returns a boolean if a field has been set.

### SetAfterNil

`func (o *SearchRequest) SetAfterNil(b bool)`

 SetAfterNil sets the value for After to be an explicit nil

### UnsetAfter
`func (o *SearchRequest) UnsetAfter()`

UnsetAfter ensures that no value is present for After, not even an explicit nil
### GetBefore

`func (o *SearchRequest) GetBefore() string`

GetBefore returns the Before field if non-nil, zero value otherwise.

### GetBeforeOk

`func (o *SearchRequest) GetBeforeOk() (*string, bool)`

GetBeforeOk returns a tuple with the Before field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBefore

`func (o *SearchRequest) SetBefore(v string)`

SetBefore sets Before field to given value.

### HasBefore

`func (o *SearchRequest) HasBefore() bool`

HasBefore returns a boolean if a field has been set.

### SetBeforeNil

`func (o *SearchRequest) SetBeforeNil(b bool)`

 SetBeforeNil sets the value for Before to be an explicit nil

### UnsetBefore
`func (o *SearchRequest) UnsetBefore()`

UnsetBefore ensures that no value is present for Before, not even an explicit nil
### GetCollapseDuplicates

`func (o *SearchRequest) GetCollapseDuplicates() bool`

GetCollapseDuplicates returns the CollapseDuplicates field if non-nil, zero value otherwise.

### GetCollapseDuplicatesOk

`func (o *SearchRequest) GetCollapseDuplicatesOk() (*bool, bool)`

GetCollapseDuplicatesOk returns a tuple with the CollapseDuplicates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCollapseDuplicates

`func (o *SearchRequest) SetCollapseDuplicates(v bool)`

SetCollapseDuplicates sets CollapseDuplicates field to given value.

### HasCollapseDuplicates

`func (o *SearchRequest) HasCollapseDuplicates() bool`

HasCollapseDuplicates returns a boolean if a field has been set.

### GetCustomerId

`func (o *SearchRequest) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *SearchRequest) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *SearchRequest) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.

### HasCustomerId

`func (o *SearchRequest) HasCustomerId() bool`

HasCustomerId returns a boolean if a field has been set.

### SetCustomerIdNil

`func (o *SearchRequest) SetCustomerIdNil(b bool)`

 SetCustomerIdNil sets the value for CustomerId to be an explicit nil

### UnsetCustomerId
`func (o *SearchRequest) UnsetCustomerId()`

UnsetCustomerId ensures that no value is present for CustomerId, not even an explicit nil
### GetDevice

`func (o *SearchRequest) GetDevice() string`

GetDevice returns the Device field if non-nil, zero value otherwise.

### GetDeviceOk

`func (o *SearchRequest) GetDeviceOk() (*string, bool)`

GetDeviceOk returns a tuple with the Device field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDevice

`func (o *SearchRequest) SetDevice(v string)`

SetDevice sets Device field to given value.

### HasDevice

`func (o *SearchRequest) HasDevice() bool`

HasDevice returns a boolean if a field has been set.

### SetDeviceNil

`func (o *SearchRequest) SetDeviceNil(b bool)`

 SetDeviceNil sets the value for Device to be an explicit nil

### UnsetDevice
`func (o *SearchRequest) UnsetDevice()`

UnsetDevice ensures that no value is present for Device, not even an explicit nil
### GetDupeThreshold

`func (o *SearchRequest) GetDupeThreshold() float32`

GetDupeThreshold returns the DupeThreshold field if non-nil, zero value otherwise.

### GetDupeThresholdOk

`func (o *SearchRequest) GetDupeThresholdOk() (*float32, bool)`

GetDupeThresholdOk returns a tuple with the DupeThreshold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDupeThreshold

`func (o *SearchRequest) SetDupeThreshold(v float32)`

SetDupeThreshold sets DupeThreshold field to given value.

### HasDupeThreshold

`func (o *SearchRequest) HasDupeThreshold() bool`

HasDupeThreshold returns a boolean if a field has been set.

### SetDupeThresholdNil

`func (o *SearchRequest) SetDupeThresholdNil(b bool)`

 SetDupeThresholdNil sets the value for DupeThreshold to be an explicit nil

### UnsetDupeThreshold
`func (o *SearchRequest) UnsetDupeThreshold()`

UnsetDupeThreshold ensures that no value is present for DupeThreshold, not even an explicit nil
### GetExcludeTags

`func (o *SearchRequest) GetExcludeTags() []string`

GetExcludeTags returns the ExcludeTags field if non-nil, zero value otherwise.

### GetExcludeTagsOk

`func (o *SearchRequest) GetExcludeTagsOk() (*[]string, bool)`

GetExcludeTagsOk returns a tuple with the ExcludeTags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExcludeTags

`func (o *SearchRequest) SetExcludeTags(v []string)`

SetExcludeTags sets ExcludeTags field to given value.

### HasExcludeTags

`func (o *SearchRequest) HasExcludeTags() bool`

HasExcludeTags returns a boolean if a field has been set.

### SetExcludeTagsNil

`func (o *SearchRequest) SetExcludeTagsNil(b bool)`

 SetExcludeTagsNil sets the value for ExcludeTags to be an explicit nil

### UnsetExcludeTags
`func (o *SearchRequest) UnsetExcludeTags()`

UnsetExcludeTags ensures that no value is present for ExcludeTags, not even an explicit nil
### GetImage

`func (o *SearchRequest) GetImage() string`

GetImage returns the Image field if non-nil, zero value otherwise.

### GetImageOk

`func (o *SearchRequest) GetImageOk() (*string, bool)`

GetImageOk returns a tuple with the Image field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImage

`func (o *SearchRequest) SetImage(v string)`

SetImage sets Image field to given value.

### HasImage

`func (o *SearchRequest) HasImage() bool`

HasImage returns a boolean if a field has been set.

### SetImageNil

`func (o *SearchRequest) SetImageNil(b bool)`

 SetImageNil sets the value for Image to be an explicit nil

### UnsetImage
`func (o *SearchRequest) UnsetImage()`

UnsetImage ensures that no value is present for Image, not even an explicit nil
### GetImageBlobId

`func (o *SearchRequest) GetImageBlobId() int32`

GetImageBlobId returns the ImageBlobId field if non-nil, zero value otherwise.

### GetImageBlobIdOk

`func (o *SearchRequest) GetImageBlobIdOk() (*int32, bool)`

GetImageBlobIdOk returns a tuple with the ImageBlobId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageBlobId

`func (o *SearchRequest) SetImageBlobId(v int32)`

SetImageBlobId sets ImageBlobId field to given value.

### HasImageBlobId

`func (o *SearchRequest) HasImageBlobId() bool`

HasImageBlobId returns a boolean if a field has been set.

### SetImageBlobIdNil

`func (o *SearchRequest) SetImageBlobIdNil(b bool)`

 SetImageBlobIdNil sets the value for ImageBlobId to be an explicit nil

### UnsetImageBlobId
`func (o *SearchRequest) UnsetImageBlobId()`

UnsetImageBlobId ensures that no value is present for ImageBlobId, not even an explicit nil
### GetIncludeTags

`func (o *SearchRequest) GetIncludeTags() []string`

GetIncludeTags returns the IncludeTags field if non-nil, zero value otherwise.

### GetIncludeTagsOk

`func (o *SearchRequest) GetIncludeTagsOk() (*[]string, bool)`

GetIncludeTagsOk returns a tuple with the IncludeTags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIncludeTags

`func (o *SearchRequest) SetIncludeTags(v []string)`

SetIncludeTags sets IncludeTags field to given value.

### HasIncludeTags

`func (o *SearchRequest) HasIncludeTags() bool`

HasIncludeTags returns a boolean if a field has been set.

### SetIncludeTagsNil

`func (o *SearchRequest) SetIncludeTagsNil(b bool)`

 SetIncludeTagsNil sets the value for IncludeTags to be an explicit nil

### UnsetIncludeTags
`func (o *SearchRequest) UnsetIncludeTags()`

UnsetIncludeTags ensures that no value is present for IncludeTags, not even an explicit nil
### GetIndexedRes

`func (o *SearchRequest) GetIndexedRes() int32`

GetIndexedRes returns the IndexedRes field if non-nil, zero value otherwise.

### GetIndexedResOk

`func (o *SearchRequest) GetIndexedResOk() (*int32, bool)`

GetIndexedResOk returns a tuple with the IndexedRes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIndexedRes

`func (o *SearchRequest) SetIndexedRes(v int32)`

SetIndexedRes sets IndexedRes field to given value.

### HasIndexedRes

`func (o *SearchRequest) HasIndexedRes() bool`

HasIndexedRes returns a boolean if a field has been set.

### SetIndexedResNil

`func (o *SearchRequest) SetIndexedResNil(b bool)`

 SetIndexedResNil sets the value for IndexedRes to be an explicit nil

### UnsetIndexedRes
`func (o *SearchRequest) UnsetIndexedRes()`

UnsetIndexedRes ensures that no value is present for IndexedRes, not even an explicit nil
### GetK

`func (o *SearchRequest) GetK() int32`

GetK returns the K field if non-nil, zero value otherwise.

### GetKOk

`func (o *SearchRequest) GetKOk() (*int32, bool)`

GetKOk returns a tuple with the K field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetK

`func (o *SearchRequest) SetK(v int32)`

SetK sets K field to given value.

### HasK

`func (o *SearchRequest) HasK() bool`

HasK returns a boolean if a field has been set.

### GetKind

`func (o *SearchRequest) GetKind() string`

GetKind returns the Kind field if non-nil, zero value otherwise.

### GetKindOk

`func (o *SearchRequest) GetKindOk() (*string, bool)`

GetKindOk returns a tuple with the Kind field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKind

`func (o *SearchRequest) SetKind(v string)`

SetKind sets Kind field to given value.

### HasKind

`func (o *SearchRequest) HasKind() bool`

HasKind returns a boolean if a field has been set.

### SetKindNil

`func (o *SearchRequest) SetKindNil(b bool)`

 SetKindNil sets the value for Kind to be an explicit nil

### UnsetKind
`func (o *SearchRequest) UnsetKind()`

UnsetKind ensures that no value is present for Kind, not even an explicit nil
### GetMaxHeight

`func (o *SearchRequest) GetMaxHeight() int32`

GetMaxHeight returns the MaxHeight field if non-nil, zero value otherwise.

### GetMaxHeightOk

`func (o *SearchRequest) GetMaxHeightOk() (*int32, bool)`

GetMaxHeightOk returns a tuple with the MaxHeight field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxHeight

`func (o *SearchRequest) SetMaxHeight(v int32)`

SetMaxHeight sets MaxHeight field to given value.

### HasMaxHeight

`func (o *SearchRequest) HasMaxHeight() bool`

HasMaxHeight returns a boolean if a field has been set.

### SetMaxHeightNil

`func (o *SearchRequest) SetMaxHeightNil(b bool)`

 SetMaxHeightNil sets the value for MaxHeight to be an explicit nil

### UnsetMaxHeight
`func (o *SearchRequest) UnsetMaxHeight()`

UnsetMaxHeight ensures that no value is present for MaxHeight, not even an explicit nil
### GetMaxWidth

`func (o *SearchRequest) GetMaxWidth() int32`

GetMaxWidth returns the MaxWidth field if non-nil, zero value otherwise.

### GetMaxWidthOk

`func (o *SearchRequest) GetMaxWidthOk() (*int32, bool)`

GetMaxWidthOk returns a tuple with the MaxWidth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxWidth

`func (o *SearchRequest) SetMaxWidth(v int32)`

SetMaxWidth sets MaxWidth field to given value.

### HasMaxWidth

`func (o *SearchRequest) HasMaxWidth() bool`

HasMaxWidth returns a boolean if a field has been set.

### SetMaxWidthNil

`func (o *SearchRequest) SetMaxWidthNil(b bool)`

 SetMaxWidthNil sets the value for MaxWidth to be an explicit nil

### UnsetMaxWidth
`func (o *SearchRequest) UnsetMaxWidth()`

UnsetMaxWidth ensures that no value is present for MaxWidth, not even an explicit nil
### GetMinScore

`func (o *SearchRequest) GetMinScore() float32`

GetMinScore returns the MinScore field if non-nil, zero value otherwise.

### GetMinScoreOk

`func (o *SearchRequest) GetMinScoreOk() (*float32, bool)`

GetMinScoreOk returns a tuple with the MinScore field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinScore

`func (o *SearchRequest) SetMinScore(v float32)`

SetMinScore sets MinScore field to given value.

### HasMinScore

`func (o *SearchRequest) HasMinScore() bool`

HasMinScore returns a boolean if a field has been set.

### GetNear

`func (o *SearchRequest) GetNear() []float32`

GetNear returns the Near field if non-nil, zero value otherwise.

### GetNearOk

`func (o *SearchRequest) GetNearOk() (*[]float32, bool)`

GetNearOk returns a tuple with the Near field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNear

`func (o *SearchRequest) SetNear(v []float32)`

SetNear sets Near field to given value.

### HasNear

`func (o *SearchRequest) HasNear() bool`

HasNear returns a boolean if a field has been set.

### SetNearNil

`func (o *SearchRequest) SetNearNil(b bool)`

 SetNearNil sets the value for Near to be an explicit nil

### UnsetNear
`func (o *SearchRequest) UnsetNear()`

UnsetNear ensures that no value is present for Near, not even an explicit nil
### GetSort

`func (o *SearchRequest) GetSort() string`

GetSort returns the Sort field if non-nil, zero value otherwise.

### GetSortOk

`func (o *SearchRequest) GetSortOk() (*string, bool)`

GetSortOk returns a tuple with the Sort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSort

`func (o *SearchRequest) SetSort(v string)`

SetSort sets Sort field to given value.

### HasSort

`func (o *SearchRequest) HasSort() bool`

HasSort returns a boolean if a field has been set.

### SetSortNil

`func (o *SearchRequest) SetSortNil(b bool)`

 SetSortNil sets the value for Sort to be an explicit nil

### UnsetSort
`func (o *SearchRequest) UnsetSort()`

UnsetSort ensures that no value is present for Sort, not even an explicit nil
### GetText

`func (o *SearchRequest) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *SearchRequest) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *SearchRequest) SetText(v string)`

SetText sets Text field to given value.

### HasText

`func (o *SearchRequest) HasText() bool`

HasText returns a boolean if a field has been set.

### SetTextNil

`func (o *SearchRequest) SetTextNil(b bool)`

 SetTextNil sets the value for Text to be an explicit nil

### UnsetText
`func (o *SearchRequest) UnsetText()`

UnsetText ensures that no value is present for Text, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


