# SearchHit

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BlobId** | **int32** |  | 
**Caption** | Pointer to **NullableString** |  | [optional] 
**CustomerId** | Pointer to **NullableString** |  | [optional] 
**DuplicateCount** | Pointer to **int32** | Number of near-duplicates collapsed into this hit. | [optional] [default to 0]
**Duplicates** | Pointer to **[]int32** | blob_ids of near-duplicates collapsed into this hit. | [optional] 
**GeoLabel** | Pointer to **NullableString** | Reverse-geocode label from EXIF GPS (e.g. &#39;Lisbon, PT&#39;), when the asset carries intact camera coordinates (the geo:&lt;label&gt; tag rides alongside). | [optional] 
**Headline** | Pointer to **NullableString** | Lexical FTS highlight (ts_headline) when the hit came via full-text search. | [optional] 
**Height** | Pointer to **NullableInt32** | Stored media height in pixels, when known. | [optional] 
**Kind** | Pointer to **NullableString** | Media kind of this hit&#39;s parent blob. | [optional] 
**MediaRef** | Pointer to **NullableString** | s3:// URI of the matched media item. | [optional] 
**Metadata** | Pointer to **map[string]interface{}** |  | [optional] 
**Score** | **float32** | For score_type &#39;rerank&#39; this is the model&#39;s match probability in [0,1] (a calibrated confidence); &#39;cosine&#39; is vector similarity; &#39;rrf&#39; is a lexical rank score. | 
**ScoreType** | **string** |  | 
**SeekMs** | Pointer to **NullableInt32** | For video hits: timestamp of the winning frame, for seek-to-moment playback. | [optional] 
**Span** | Pointer to [**NullableMediaSpan**](MediaSpan.md) | For transcript hits: the matching whisper segment, with literal text for highlighting. | [optional] 
**SpanHeadline** | Pointer to **NullableString** | Lexical FTS highlight (ts_headline) of the winning transcript segment. | [optional] 
**Tags** | Pointer to **[]string** | Tags on this item: client-supplied at ingest and/or the appliance&#39;s zero-shot autotags. | [optional] 
**Width** | Pointer to **NullableInt32** | Stored media width in pixels, when known. | [optional] 

## Methods

### NewSearchHit

`func NewSearchHit(blobId int32, score float32, scoreType string, ) *SearchHit`

NewSearchHit instantiates a new SearchHit object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewSearchHitWithDefaults

`func NewSearchHitWithDefaults() *SearchHit`

NewSearchHitWithDefaults instantiates a new SearchHit object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetBlobId

`func (o *SearchHit) GetBlobId() int32`

GetBlobId returns the BlobId field if non-nil, zero value otherwise.

### GetBlobIdOk

`func (o *SearchHit) GetBlobIdOk() (*int32, bool)`

GetBlobIdOk returns a tuple with the BlobId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlobId

`func (o *SearchHit) SetBlobId(v int32)`

SetBlobId sets BlobId field to given value.


### GetCaption

`func (o *SearchHit) GetCaption() string`

GetCaption returns the Caption field if non-nil, zero value otherwise.

### GetCaptionOk

`func (o *SearchHit) GetCaptionOk() (*string, bool)`

GetCaptionOk returns a tuple with the Caption field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCaption

`func (o *SearchHit) SetCaption(v string)`

SetCaption sets Caption field to given value.

### HasCaption

`func (o *SearchHit) HasCaption() bool`

HasCaption returns a boolean if a field has been set.

### SetCaptionNil

`func (o *SearchHit) SetCaptionNil(b bool)`

 SetCaptionNil sets the value for Caption to be an explicit nil

### UnsetCaption
`func (o *SearchHit) UnsetCaption()`

UnsetCaption ensures that no value is present for Caption, not even an explicit nil
### GetCustomerId

`func (o *SearchHit) GetCustomerId() string`

GetCustomerId returns the CustomerId field if non-nil, zero value otherwise.

### GetCustomerIdOk

`func (o *SearchHit) GetCustomerIdOk() (*string, bool)`

GetCustomerIdOk returns a tuple with the CustomerId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomerId

`func (o *SearchHit) SetCustomerId(v string)`

SetCustomerId sets CustomerId field to given value.

### HasCustomerId

`func (o *SearchHit) HasCustomerId() bool`

HasCustomerId returns a boolean if a field has been set.

### SetCustomerIdNil

`func (o *SearchHit) SetCustomerIdNil(b bool)`

 SetCustomerIdNil sets the value for CustomerId to be an explicit nil

### UnsetCustomerId
`func (o *SearchHit) UnsetCustomerId()`

UnsetCustomerId ensures that no value is present for CustomerId, not even an explicit nil
### GetDuplicateCount

`func (o *SearchHit) GetDuplicateCount() int32`

GetDuplicateCount returns the DuplicateCount field if non-nil, zero value otherwise.

### GetDuplicateCountOk

`func (o *SearchHit) GetDuplicateCountOk() (*int32, bool)`

GetDuplicateCountOk returns a tuple with the DuplicateCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuplicateCount

`func (o *SearchHit) SetDuplicateCount(v int32)`

SetDuplicateCount sets DuplicateCount field to given value.

### HasDuplicateCount

`func (o *SearchHit) HasDuplicateCount() bool`

HasDuplicateCount returns a boolean if a field has been set.

### GetDuplicates

`func (o *SearchHit) GetDuplicates() []int32`

GetDuplicates returns the Duplicates field if non-nil, zero value otherwise.

### GetDuplicatesOk

`func (o *SearchHit) GetDuplicatesOk() (*[]int32, bool)`

GetDuplicatesOk returns a tuple with the Duplicates field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDuplicates

`func (o *SearchHit) SetDuplicates(v []int32)`

SetDuplicates sets Duplicates field to given value.

### HasDuplicates

`func (o *SearchHit) HasDuplicates() bool`

HasDuplicates returns a boolean if a field has been set.

### GetGeoLabel

`func (o *SearchHit) GetGeoLabel() string`

GetGeoLabel returns the GeoLabel field if non-nil, zero value otherwise.

### GetGeoLabelOk

`func (o *SearchHit) GetGeoLabelOk() (*string, bool)`

GetGeoLabelOk returns a tuple with the GeoLabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGeoLabel

`func (o *SearchHit) SetGeoLabel(v string)`

SetGeoLabel sets GeoLabel field to given value.

### HasGeoLabel

`func (o *SearchHit) HasGeoLabel() bool`

HasGeoLabel returns a boolean if a field has been set.

### SetGeoLabelNil

`func (o *SearchHit) SetGeoLabelNil(b bool)`

 SetGeoLabelNil sets the value for GeoLabel to be an explicit nil

### UnsetGeoLabel
`func (o *SearchHit) UnsetGeoLabel()`

UnsetGeoLabel ensures that no value is present for GeoLabel, not even an explicit nil
### GetHeadline

`func (o *SearchHit) GetHeadline() string`

GetHeadline returns the Headline field if non-nil, zero value otherwise.

### GetHeadlineOk

`func (o *SearchHit) GetHeadlineOk() (*string, bool)`

GetHeadlineOk returns a tuple with the Headline field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeadline

`func (o *SearchHit) SetHeadline(v string)`

SetHeadline sets Headline field to given value.

### HasHeadline

`func (o *SearchHit) HasHeadline() bool`

HasHeadline returns a boolean if a field has been set.

### SetHeadlineNil

`func (o *SearchHit) SetHeadlineNil(b bool)`

 SetHeadlineNil sets the value for Headline to be an explicit nil

### UnsetHeadline
`func (o *SearchHit) UnsetHeadline()`

UnsetHeadline ensures that no value is present for Headline, not even an explicit nil
### GetHeight

`func (o *SearchHit) GetHeight() int32`

GetHeight returns the Height field if non-nil, zero value otherwise.

### GetHeightOk

`func (o *SearchHit) GetHeightOk() (*int32, bool)`

GetHeightOk returns a tuple with the Height field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeight

`func (o *SearchHit) SetHeight(v int32)`

SetHeight sets Height field to given value.

### HasHeight

`func (o *SearchHit) HasHeight() bool`

HasHeight returns a boolean if a field has been set.

### SetHeightNil

`func (o *SearchHit) SetHeightNil(b bool)`

 SetHeightNil sets the value for Height to be an explicit nil

### UnsetHeight
`func (o *SearchHit) UnsetHeight()`

UnsetHeight ensures that no value is present for Height, not even an explicit nil
### GetKind

`func (o *SearchHit) GetKind() string`

GetKind returns the Kind field if non-nil, zero value otherwise.

### GetKindOk

`func (o *SearchHit) GetKindOk() (*string, bool)`

GetKindOk returns a tuple with the Kind field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKind

`func (o *SearchHit) SetKind(v string)`

SetKind sets Kind field to given value.

### HasKind

`func (o *SearchHit) HasKind() bool`

HasKind returns a boolean if a field has been set.

### SetKindNil

`func (o *SearchHit) SetKindNil(b bool)`

 SetKindNil sets the value for Kind to be an explicit nil

### UnsetKind
`func (o *SearchHit) UnsetKind()`

UnsetKind ensures that no value is present for Kind, not even an explicit nil
### GetMediaRef

`func (o *SearchHit) GetMediaRef() string`

GetMediaRef returns the MediaRef field if non-nil, zero value otherwise.

### GetMediaRefOk

`func (o *SearchHit) GetMediaRefOk() (*string, bool)`

GetMediaRefOk returns a tuple with the MediaRef field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMediaRef

`func (o *SearchHit) SetMediaRef(v string)`

SetMediaRef sets MediaRef field to given value.

### HasMediaRef

`func (o *SearchHit) HasMediaRef() bool`

HasMediaRef returns a boolean if a field has been set.

### SetMediaRefNil

`func (o *SearchHit) SetMediaRefNil(b bool)`

 SetMediaRefNil sets the value for MediaRef to be an explicit nil

### UnsetMediaRef
`func (o *SearchHit) UnsetMediaRef()`

UnsetMediaRef ensures that no value is present for MediaRef, not even an explicit nil
### GetMetadata

`func (o *SearchHit) GetMetadata() map[string]interface{}`

GetMetadata returns the Metadata field if non-nil, zero value otherwise.

### GetMetadataOk

`func (o *SearchHit) GetMetadataOk() (*map[string]interface{}, bool)`

GetMetadataOk returns a tuple with the Metadata field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMetadata

`func (o *SearchHit) SetMetadata(v map[string]interface{})`

SetMetadata sets Metadata field to given value.

### HasMetadata

`func (o *SearchHit) HasMetadata() bool`

HasMetadata returns a boolean if a field has been set.

### SetMetadataNil

`func (o *SearchHit) SetMetadataNil(b bool)`

 SetMetadataNil sets the value for Metadata to be an explicit nil

### UnsetMetadata
`func (o *SearchHit) UnsetMetadata()`

UnsetMetadata ensures that no value is present for Metadata, not even an explicit nil
### GetScore

`func (o *SearchHit) GetScore() float32`

GetScore returns the Score field if non-nil, zero value otherwise.

### GetScoreOk

`func (o *SearchHit) GetScoreOk() (*float32, bool)`

GetScoreOk returns a tuple with the Score field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScore

`func (o *SearchHit) SetScore(v float32)`

SetScore sets Score field to given value.


### GetScoreType

`func (o *SearchHit) GetScoreType() string`

GetScoreType returns the ScoreType field if non-nil, zero value otherwise.

### GetScoreTypeOk

`func (o *SearchHit) GetScoreTypeOk() (*string, bool)`

GetScoreTypeOk returns a tuple with the ScoreType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScoreType

`func (o *SearchHit) SetScoreType(v string)`

SetScoreType sets ScoreType field to given value.


### GetSeekMs

`func (o *SearchHit) GetSeekMs() int32`

GetSeekMs returns the SeekMs field if non-nil, zero value otherwise.

### GetSeekMsOk

`func (o *SearchHit) GetSeekMsOk() (*int32, bool)`

GetSeekMsOk returns a tuple with the SeekMs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSeekMs

`func (o *SearchHit) SetSeekMs(v int32)`

SetSeekMs sets SeekMs field to given value.

### HasSeekMs

`func (o *SearchHit) HasSeekMs() bool`

HasSeekMs returns a boolean if a field has been set.

### SetSeekMsNil

`func (o *SearchHit) SetSeekMsNil(b bool)`

 SetSeekMsNil sets the value for SeekMs to be an explicit nil

### UnsetSeekMs
`func (o *SearchHit) UnsetSeekMs()`

UnsetSeekMs ensures that no value is present for SeekMs, not even an explicit nil
### GetSpan

`func (o *SearchHit) GetSpan() MediaSpan`

GetSpan returns the Span field if non-nil, zero value otherwise.

### GetSpanOk

`func (o *SearchHit) GetSpanOk() (*MediaSpan, bool)`

GetSpanOk returns a tuple with the Span field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpan

`func (o *SearchHit) SetSpan(v MediaSpan)`

SetSpan sets Span field to given value.

### HasSpan

`func (o *SearchHit) HasSpan() bool`

HasSpan returns a boolean if a field has been set.

### SetSpanNil

`func (o *SearchHit) SetSpanNil(b bool)`

 SetSpanNil sets the value for Span to be an explicit nil

### UnsetSpan
`func (o *SearchHit) UnsetSpan()`

UnsetSpan ensures that no value is present for Span, not even an explicit nil
### GetSpanHeadline

`func (o *SearchHit) GetSpanHeadline() string`

GetSpanHeadline returns the SpanHeadline field if non-nil, zero value otherwise.

### GetSpanHeadlineOk

`func (o *SearchHit) GetSpanHeadlineOk() (*string, bool)`

GetSpanHeadlineOk returns a tuple with the SpanHeadline field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpanHeadline

`func (o *SearchHit) SetSpanHeadline(v string)`

SetSpanHeadline sets SpanHeadline field to given value.

### HasSpanHeadline

`func (o *SearchHit) HasSpanHeadline() bool`

HasSpanHeadline returns a boolean if a field has been set.

### SetSpanHeadlineNil

`func (o *SearchHit) SetSpanHeadlineNil(b bool)`

 SetSpanHeadlineNil sets the value for SpanHeadline to be an explicit nil

### UnsetSpanHeadline
`func (o *SearchHit) UnsetSpanHeadline()`

UnsetSpanHeadline ensures that no value is present for SpanHeadline, not even an explicit nil
### GetTags

`func (o *SearchHit) GetTags() []string`

GetTags returns the Tags field if non-nil, zero value otherwise.

### GetTagsOk

`func (o *SearchHit) GetTagsOk() (*[]string, bool)`

GetTagsOk returns a tuple with the Tags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTags

`func (o *SearchHit) SetTags(v []string)`

SetTags sets Tags field to given value.

### HasTags

`func (o *SearchHit) HasTags() bool`

HasTags returns a boolean if a field has been set.

### GetWidth

`func (o *SearchHit) GetWidth() int32`

GetWidth returns the Width field if non-nil, zero value otherwise.

### GetWidthOk

`func (o *SearchHit) GetWidthOk() (*int32, bool)`

GetWidthOk returns a tuple with the Width field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetWidth

`func (o *SearchHit) SetWidth(v int32)`

SetWidth sets Width field to given value.

### HasWidth

`func (o *SearchHit) HasWidth() bool`

HasWidth returns a boolean if a field has been set.

### SetWidthNil

`func (o *SearchHit) SetWidthNil(b bool)`

 SetWidthNil sets the value for Width to be an explicit nil

### UnsetWidth
`func (o *SearchHit) UnsetWidth()`

UnsetWidth ensures that no value is present for Width, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


