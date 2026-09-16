package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &SearchHit{}

type SearchHit struct {
	BlobId int32 `json:"blob_id"`
	Caption NullableString `json:"caption,omitempty"`
	CustomerId NullableString `json:"customer_id,omitempty"`
	DuplicateCount *int32 `json:"duplicate_count,omitempty"`
	Duplicates []int32 `json:"duplicates,omitempty"`
	GeoLabel NullableString `json:"geo_label,omitempty"`
	Headline NullableString `json:"headline,omitempty"`
	Height NullableInt32 `json:"height,omitempty"`
	Kind NullableString `json:"kind,omitempty"`
	MediaRef NullableString `json:"media_ref,omitempty"`
	Metadata map[string]interface{} `json:"metadata,omitempty"`
	Score float32 `json:"score"`
	ScoreType string `json:"score_type"`
	SeekMs NullableInt32 `json:"seek_ms,omitempty"`
	Span NullableMediaSpan `json:"span,omitempty"`
	SpanHeadline NullableString `json:"span_headline,omitempty"`
	Tags []string `json:"tags,omitempty"`
	Width NullableInt32 `json:"width,omitempty"`
}

type _SearchHit SearchHit

func NewSearchHit(blobId int32, score float32, scoreType string) *SearchHit {
	this := SearchHit{}
	this.BlobId = blobId
	var duplicateCount int32 = 0
	this.DuplicateCount = &duplicateCount
	this.Score = score
	this.ScoreType = scoreType
	return &this
}

func NewSearchHitWithDefaults() *SearchHit {
	this := SearchHit{}
	var duplicateCount int32 = 0
	this.DuplicateCount = &duplicateCount
	return &this
}

func (o *SearchHit) GetBlobId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.BlobId
}

func (o *SearchHit) GetBlobIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.BlobId, true
}

func (o *SearchHit) SetBlobId(v int32) {
	o.BlobId = v
}

func (o *SearchHit) GetCaption() string {
	if o == nil || IsNil(o.Caption.Get()) {
		var ret string
		return ret
	}
	return *o.Caption.Get()
}

func (o *SearchHit) GetCaptionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Caption.Get(), o.Caption.IsSet()
}

func (o *SearchHit) HasCaption() bool {
	if o != nil && o.Caption.IsSet() {
		return true
	}

	return false
}

func (o *SearchHit) SetCaption(v string) {
	o.Caption.Set(&v)
}
func (o *SearchHit) SetCaptionNil() {
	o.Caption.Set(nil)
}

func (o *SearchHit) UnsetCaption() {
	o.Caption.Unset()
}

func (o *SearchHit) GetCustomerId() string {
	if o == nil || IsNil(o.CustomerId.Get()) {
		var ret string
		return ret
	}
	return *o.CustomerId.Get()
}

func (o *SearchHit) GetCustomerIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CustomerId.Get(), o.CustomerId.IsSet()
}

func (o *SearchHit) HasCustomerId() bool {
	if o != nil && o.CustomerId.IsSet() {
		return true
	}

	return false
}

func (o *SearchHit) SetCustomerId(v string) {
	o.CustomerId.Set(&v)
}
func (o *SearchHit) SetCustomerIdNil() {
	o.CustomerId.Set(nil)
}

func (o *SearchHit) UnsetCustomerId() {
	o.CustomerId.Unset()
}

func (o *SearchHit) GetDuplicateCount() int32 {
	if o == nil || IsNil(o.DuplicateCount) {
		var ret int32
		return ret
	}
	return *o.DuplicateCount
}

func (o *SearchHit) GetDuplicateCountOk() (*int32, bool) {
	if o == nil || IsNil(o.DuplicateCount) {
		return nil, false
	}
	return o.DuplicateCount, true
}

func (o *SearchHit) HasDuplicateCount() bool {
	if o != nil && !IsNil(o.DuplicateCount) {
		return true
	}

	return false
}

func (o *SearchHit) SetDuplicateCount(v int32) {
	o.DuplicateCount = &v
}

func (o *SearchHit) GetDuplicates() []int32 {
	if o == nil || IsNil(o.Duplicates) {
		var ret []int32
		return ret
	}
	return o.Duplicates
}

func (o *SearchHit) GetDuplicatesOk() ([]int32, bool) {
	if o == nil || IsNil(o.Duplicates) {
		return nil, false
	}
	return o.Duplicates, true
}

func (o *SearchHit) HasDuplicates() bool {
	if o != nil && !IsNil(o.Duplicates) {
		return true
	}

	return false
}

func (o *SearchHit) SetDuplicates(v []int32) {
	o.Duplicates = v
}

func (o *SearchHit) GetGeoLabel() string {
	if o == nil || IsNil(o.GeoLabel.Get()) {
		var ret string
		return ret
	}
	return *o.GeoLabel.Get()
}

func (o *SearchHit) GetGeoLabelOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.GeoLabel.Get(), o.GeoLabel.IsSet()
}

func (o *SearchHit) HasGeoLabel() bool {
	if o != nil && o.GeoLabel.IsSet() {
		return true
	}

	return false
}

func (o *SearchHit) SetGeoLabel(v string) {
	o.GeoLabel.Set(&v)
}
func (o *SearchHit) SetGeoLabelNil() {
	o.GeoLabel.Set(nil)
}

func (o *SearchHit) UnsetGeoLabel() {
	o.GeoLabel.Unset()
}

func (o *SearchHit) GetHeadline() string {
	if o == nil || IsNil(o.Headline.Get()) {
		var ret string
		return ret
	}
	return *o.Headline.Get()
}

func (o *SearchHit) GetHeadlineOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Headline.Get(), o.Headline.IsSet()
}

func (o *SearchHit) HasHeadline() bool {
	if o != nil && o.Headline.IsSet() {
		return true
	}

	return false
}

func (o *SearchHit) SetHeadline(v string) {
	o.Headline.Set(&v)
}
func (o *SearchHit) SetHeadlineNil() {
	o.Headline.Set(nil)
}

func (o *SearchHit) UnsetHeadline() {
	o.Headline.Unset()
}

func (o *SearchHit) GetHeight() int32 {
	if o == nil || IsNil(o.Height.Get()) {
		var ret int32
		return ret
	}
	return *o.Height.Get()
}

func (o *SearchHit) GetHeightOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.Height.Get(), o.Height.IsSet()
}

func (o *SearchHit) HasHeight() bool {
	if o != nil && o.Height.IsSet() {
		return true
	}

	return false
}

func (o *SearchHit) SetHeight(v int32) {
	o.Height.Set(&v)
}
func (o *SearchHit) SetHeightNil() {
	o.Height.Set(nil)
}

func (o *SearchHit) UnsetHeight() {
	o.Height.Unset()
}

func (o *SearchHit) GetKind() string {
	if o == nil || IsNil(o.Kind.Get()) {
		var ret string
		return ret
	}
	return *o.Kind.Get()
}

func (o *SearchHit) GetKindOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Kind.Get(), o.Kind.IsSet()
}

func (o *SearchHit) HasKind() bool {
	if o != nil && o.Kind.IsSet() {
		return true
	}

	return false
}

func (o *SearchHit) SetKind(v string) {
	o.Kind.Set(&v)
}
func (o *SearchHit) SetKindNil() {
	o.Kind.Set(nil)
}

func (o *SearchHit) UnsetKind() {
	o.Kind.Unset()
}

func (o *SearchHit) GetMediaRef() string {
	if o == nil || IsNil(o.MediaRef.Get()) {
		var ret string
		return ret
	}
	return *o.MediaRef.Get()
}

func (o *SearchHit) GetMediaRefOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.MediaRef.Get(), o.MediaRef.IsSet()
}

func (o *SearchHit) HasMediaRef() bool {
	if o != nil && o.MediaRef.IsSet() {
		return true
	}

	return false
}

func (o *SearchHit) SetMediaRef(v string) {
	o.MediaRef.Set(&v)
}
func (o *SearchHit) SetMediaRefNil() {
	o.MediaRef.Set(nil)
}

func (o *SearchHit) UnsetMediaRef() {
	o.MediaRef.Unset()
}

func (o *SearchHit) GetMetadata() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}
	return o.Metadata
}

func (o *SearchHit) GetMetadataOk() (map[string]interface{}, bool) {
	if o == nil || IsNil(o.Metadata) {
		return map[string]interface{}{}, false
	}
	return o.Metadata, true
}

func (o *SearchHit) HasMetadata() bool {
	if o != nil && !IsNil(o.Metadata) {
		return true
	}

	return false
}

func (o *SearchHit) SetMetadata(v map[string]interface{}) {
	o.Metadata = v
}

func (o *SearchHit) GetScore() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Score
}

func (o *SearchHit) GetScoreOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Score, true
}

func (o *SearchHit) SetScore(v float32) {
	o.Score = v
}

func (o *SearchHit) GetScoreType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ScoreType
}

func (o *SearchHit) GetScoreTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ScoreType, true
}

func (o *SearchHit) SetScoreType(v string) {
	o.ScoreType = v
}

func (o *SearchHit) GetSeekMs() int32 {
	if o == nil || IsNil(o.SeekMs.Get()) {
		var ret int32
		return ret
	}
	return *o.SeekMs.Get()
}

func (o *SearchHit) GetSeekMsOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.SeekMs.Get(), o.SeekMs.IsSet()
}

func (o *SearchHit) HasSeekMs() bool {
	if o != nil && o.SeekMs.IsSet() {
		return true
	}

	return false
}

func (o *SearchHit) SetSeekMs(v int32) {
	o.SeekMs.Set(&v)
}
func (o *SearchHit) SetSeekMsNil() {
	o.SeekMs.Set(nil)
}

func (o *SearchHit) UnsetSeekMs() {
	o.SeekMs.Unset()
}

func (o *SearchHit) GetSpan() MediaSpan {
	if o == nil || IsNil(o.Span.Get()) {
		var ret MediaSpan
		return ret
	}
	return *o.Span.Get()
}

func (o *SearchHit) GetSpanOk() (*MediaSpan, bool) {
	if o == nil {
		return nil, false
	}
	return o.Span.Get(), o.Span.IsSet()
}

func (o *SearchHit) HasSpan() bool {
	if o != nil && o.Span.IsSet() {
		return true
	}

	return false
}

func (o *SearchHit) SetSpan(v MediaSpan) {
	o.Span.Set(&v)
}
func (o *SearchHit) SetSpanNil() {
	o.Span.Set(nil)
}

func (o *SearchHit) UnsetSpan() {
	o.Span.Unset()
}

func (o *SearchHit) GetSpanHeadline() string {
	if o == nil || IsNil(o.SpanHeadline.Get()) {
		var ret string
		return ret
	}
	return *o.SpanHeadline.Get()
}

func (o *SearchHit) GetSpanHeadlineOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.SpanHeadline.Get(), o.SpanHeadline.IsSet()
}

func (o *SearchHit) HasSpanHeadline() bool {
	if o != nil && o.SpanHeadline.IsSet() {
		return true
	}

	return false
}

func (o *SearchHit) SetSpanHeadline(v string) {
	o.SpanHeadline.Set(&v)
}
func (o *SearchHit) SetSpanHeadlineNil() {
	o.SpanHeadline.Set(nil)
}

func (o *SearchHit) UnsetSpanHeadline() {
	o.SpanHeadline.Unset()
}

func (o *SearchHit) GetTags() []string {
	if o == nil || IsNil(o.Tags) {
		var ret []string
		return ret
	}
	return o.Tags
}

func (o *SearchHit) GetTagsOk() ([]string, bool) {
	if o == nil || IsNil(o.Tags) {
		return nil, false
	}
	return o.Tags, true
}

func (o *SearchHit) HasTags() bool {
	if o != nil && !IsNil(o.Tags) {
		return true
	}

	return false
}

func (o *SearchHit) SetTags(v []string) {
	o.Tags = v
}

func (o *SearchHit) GetWidth() int32 {
	if o == nil || IsNil(o.Width.Get()) {
		var ret int32
		return ret
	}
	return *o.Width.Get()
}

func (o *SearchHit) GetWidthOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.Width.Get(), o.Width.IsSet()
}

func (o *SearchHit) HasWidth() bool {
	if o != nil && o.Width.IsSet() {
		return true
	}

	return false
}

func (o *SearchHit) SetWidth(v int32) {
	o.Width.Set(&v)
}
func (o *SearchHit) SetWidthNil() {
	o.Width.Set(nil)
}

func (o *SearchHit) UnsetWidth() {
	o.Width.Unset()
}

func (o SearchHit) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o SearchHit) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["blob_id"] = o.BlobId
	if o.Caption.IsSet() {
		toSerialize["caption"] = o.Caption.Get()
	}
	if o.CustomerId.IsSet() {
		toSerialize["customer_id"] = o.CustomerId.Get()
	}
	if !IsNil(o.DuplicateCount) {
		toSerialize["duplicate_count"] = o.DuplicateCount
	}
	if !IsNil(o.Duplicates) {
		toSerialize["duplicates"] = o.Duplicates
	}
	if o.GeoLabel.IsSet() {
		toSerialize["geo_label"] = o.GeoLabel.Get()
	}
	if o.Headline.IsSet() {
		toSerialize["headline"] = o.Headline.Get()
	}
	if o.Height.IsSet() {
		toSerialize["height"] = o.Height.Get()
	}
	if o.Kind.IsSet() {
		toSerialize["kind"] = o.Kind.Get()
	}
	if o.MediaRef.IsSet() {
		toSerialize["media_ref"] = o.MediaRef.Get()
	}
	if o.Metadata != nil {
		toSerialize["metadata"] = o.Metadata
	}
	toSerialize["score"] = o.Score
	toSerialize["score_type"] = o.ScoreType
	if o.SeekMs.IsSet() {
		toSerialize["seek_ms"] = o.SeekMs.Get()
	}
	if o.Span.IsSet() {
		toSerialize["span"] = o.Span.Get()
	}
	if o.SpanHeadline.IsSet() {
		toSerialize["span_headline"] = o.SpanHeadline.Get()
	}
	if !IsNil(o.Tags) {
		toSerialize["tags"] = o.Tags
	}
	if o.Width.IsSet() {
		toSerialize["width"] = o.Width.Get()
	}
	return toSerialize, nil
}

func (o *SearchHit) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"blob_id",
		"score",
		"score_type",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varSearchHit := _SearchHit{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varSearchHit)

	if err != nil {
		return err
	}

	*o = SearchHit(varSearchHit)

	return err
}

type NullableSearchHit struct {
	value *SearchHit
	isSet bool
}

func (v NullableSearchHit) Get() *SearchHit {
	return v.value
}

func (v *NullableSearchHit) Set(val *SearchHit) {
	v.value = val
	v.isSet = true
}

func (v NullableSearchHit) IsSet() bool {
	return v.isSet
}

func (v *NullableSearchHit) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSearchHit(val *SearchHit) *NullableSearchHit {
	return &NullableSearchHit{value: val, isSet: true}
}

func (v NullableSearchHit) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSearchHit) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

