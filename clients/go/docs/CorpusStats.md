# CorpusStats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Kinds** | **map[string]int32** |  | 
**TopTags** | [**[]CorpusTag**](CorpusTag.md) |  | 

## Methods

### NewCorpusStats

`func NewCorpusStats(kinds map[string]int32, topTags []CorpusTag, ) *CorpusStats`

NewCorpusStats instantiates a new CorpusStats object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewCorpusStatsWithDefaults

`func NewCorpusStatsWithDefaults() *CorpusStats`

NewCorpusStatsWithDefaults instantiates a new CorpusStats object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetKinds

`func (o *CorpusStats) GetKinds() map[string]int32`

GetKinds returns the Kinds field if non-nil, zero value otherwise.

### GetKindsOk

`func (o *CorpusStats) GetKindsOk() (*map[string]int32, bool)`

GetKindsOk returns a tuple with the Kinds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKinds

`func (o *CorpusStats) SetKinds(v map[string]int32)`

SetKinds sets Kinds field to given value.


### GetTopTags

`func (o *CorpusStats) GetTopTags() []CorpusTag`

GetTopTags returns the TopTags field if non-nil, zero value otherwise.

### GetTopTagsOk

`func (o *CorpusStats) GetTopTagsOk() (*[]CorpusTag, bool)`

GetTopTagsOk returns a tuple with the TopTags field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopTags

`func (o *CorpusStats) SetTopTags(v []CorpusTag)`

SetTopTags sets TopTags field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


