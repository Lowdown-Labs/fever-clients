package fever

import (
	"encoding/json"
)

var _ MappedNullable = &SearchRequest{}

type SearchRequest struct {
	After NullableString `json:"after,omitempty"`
	Before NullableString `json:"before,omitempty"`
	CollapseDuplicates *bool `json:"collapse_duplicates,omitempty"`
	CustomerId NullableString `json:"customer_id,omitempty"`
	Device NullableString `json:"device,omitempty"`
	DupeThreshold NullableFloat32 `json:"dupe_threshold,omitempty"`
	ExcludeTags []string `json:"exclude_tags,omitempty"`
	Image NullableString `json:"image,omitempty"`
	ImageBlobId NullableInt32 `json:"image_blob_id,omitempty"`
	IncludeTags []string `json:"include_tags,omitempty"`
	IndexedRes NullableInt32 `json:"indexed_res,omitempty"`
	K *int32 `json:"k,omitempty"`
	Kind NullableString `json:"kind,omitempty"`
	MaxHeight NullableInt32 `json:"max_height,omitempty"`
	MaxWidth NullableInt32 `json:"max_width,omitempty"`
	MinScore *float32 `json:"min_score,omitempty"`
	Near []float32 `json:"near,omitempty"`
	Sort NullableString `json:"sort,omitempty"`
	Text NullableString `json:"text,omitempty"`
}

func NewSearchRequest() *SearchRequest {
	this := SearchRequest{}
	var collapseDuplicates bool = true
	this.CollapseDuplicates = &collapseDuplicates
	var k int32 = 10
	this.K = &k
	var minScore float32 = 0.0
	this.MinScore = &minScore
	return &this
}

func NewSearchRequestWithDefaults() *SearchRequest {
	this := SearchRequest{}
	var collapseDuplicates bool = true
	this.CollapseDuplicates = &collapseDuplicates
	var k int32 = 10
	this.K = &k
	var minScore float32 = 0.0
	this.MinScore = &minScore
	return &this
}

func (o *SearchRequest) GetAfter() string {
	if o == nil || IsNil(o.After.Get()) {
		var ret string
		return ret
	}
	return *o.After.Get()
}

func (o *SearchRequest) GetAfterOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.After.Get(), o.After.IsSet()
}

func (o *SearchRequest) HasAfter() bool {
	if o != nil && o.After.IsSet() {
		return true
	}

	return false
}

func (o *SearchRequest) SetAfter(v string) {
	o.After.Set(&v)
}
func (o *SearchRequest) SetAfterNil() {
	o.After.Set(nil)
}

func (o *SearchRequest) UnsetAfter() {
	o.After.Unset()
}

func (o *SearchRequest) GetBefore() string {
	if o == nil || IsNil(o.Before.Get()) {
		var ret string
		return ret
	}
	return *o.Before.Get()
}

func (o *SearchRequest) GetBeforeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Before.Get(), o.Before.IsSet()
}

func (o *SearchRequest) HasBefore() bool {
	if o != nil && o.Before.IsSet() {
		return true
	}

	return false
}

func (o *SearchRequest) SetBefore(v string) {
	o.Before.Set(&v)
}
func (o *SearchRequest) SetBeforeNil() {
	o.Before.Set(nil)
}

func (o *SearchRequest) UnsetBefore() {
	o.Before.Unset()
}

func (o *SearchRequest) GetCollapseDuplicates() bool {
	if o == nil || IsNil(o.CollapseDuplicates) {
		var ret bool
		return ret
	}
	return *o.CollapseDuplicates
}

func (o *SearchRequest) GetCollapseDuplicatesOk() (*bool, bool) {
	if o == nil || IsNil(o.CollapseDuplicates) {
		return nil, false
	}
	return o.CollapseDuplicates, true
}

func (o *SearchRequest) HasCollapseDuplicates() bool {
	if o != nil && !IsNil(o.CollapseDuplicates) {
		return true
	}

	return false
}

func (o *SearchRequest) SetCollapseDuplicates(v bool) {
	o.CollapseDuplicates = &v
}

func (o *SearchRequest) GetCustomerId() string {
	if o == nil || IsNil(o.CustomerId.Get()) {
		var ret string
		return ret
	}
	return *o.CustomerId.Get()
}

func (o *SearchRequest) GetCustomerIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CustomerId.Get(), o.CustomerId.IsSet()
}

func (o *SearchRequest) HasCustomerId() bool {
	if o != nil && o.CustomerId.IsSet() {
		return true
	}

	return false
}

func (o *SearchRequest) SetCustomerId(v string) {
	o.CustomerId.Set(&v)
}
func (o *SearchRequest) SetCustomerIdNil() {
	o.CustomerId.Set(nil)
}

func (o *SearchRequest) UnsetCustomerId() {
	o.CustomerId.Unset()
}

func (o *SearchRequest) GetDevice() string {
	if o == nil || IsNil(o.Device.Get()) {
		var ret string
		return ret
	}
	return *o.Device.Get()
}

func (o *SearchRequest) GetDeviceOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Device.Get(), o.Device.IsSet()
}

func (o *SearchRequest) HasDevice() bool {
	if o != nil && o.Device.IsSet() {
		return true
	}

	return false
}

func (o *SearchRequest) SetDevice(v string) {
	o.Device.Set(&v)
}
func (o *SearchRequest) SetDeviceNil() {
	o.Device.Set(nil)
}

func (o *SearchRequest) UnsetDevice() {
	o.Device.Unset()
}

func (o *SearchRequest) GetDupeThreshold() float32 {
	if o == nil || IsNil(o.DupeThreshold.Get()) {
		var ret float32
		return ret
	}
	return *o.DupeThreshold.Get()
}

func (o *SearchRequest) GetDupeThresholdOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return o.DupeThreshold.Get(), o.DupeThreshold.IsSet()
}

func (o *SearchRequest) HasDupeThreshold() bool {
	if o != nil && o.DupeThreshold.IsSet() {
		return true
	}

	return false
}

func (o *SearchRequest) SetDupeThreshold(v float32) {
	o.DupeThreshold.Set(&v)
}
func (o *SearchRequest) SetDupeThresholdNil() {
	o.DupeThreshold.Set(nil)
}

func (o *SearchRequest) UnsetDupeThreshold() {
	o.DupeThreshold.Unset()
}

func (o *SearchRequest) GetExcludeTags() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.ExcludeTags
}

func (o *SearchRequest) GetExcludeTagsOk() ([]string, bool) {
	if o == nil || IsNil(o.ExcludeTags) {
		return nil, false
	}
	return o.ExcludeTags, true
}

func (o *SearchRequest) HasExcludeTags() bool {
	if o != nil && !IsNil(o.ExcludeTags) {
		return true
	}

	return false
}

func (o *SearchRequest) SetExcludeTags(v []string) {
	o.ExcludeTags = v
}

func (o *SearchRequest) GetImage() string {
	if o == nil || IsNil(o.Image.Get()) {
		var ret string
		return ret
	}
	return *o.Image.Get()
}

func (o *SearchRequest) GetImageOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Image.Get(), o.Image.IsSet()
}

func (o *SearchRequest) HasImage() bool {
	if o != nil && o.Image.IsSet() {
		return true
	}

	return false
}

func (o *SearchRequest) SetImage(v string) {
	o.Image.Set(&v)
}
func (o *SearchRequest) SetImageNil() {
	o.Image.Set(nil)
}

func (o *SearchRequest) UnsetImage() {
	o.Image.Unset()
}

func (o *SearchRequest) GetImageBlobId() int32 {
	if o == nil || IsNil(o.ImageBlobId.Get()) {
		var ret int32
		return ret
	}
	return *o.ImageBlobId.Get()
}

func (o *SearchRequest) GetImageBlobIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.ImageBlobId.Get(), o.ImageBlobId.IsSet()
}

func (o *SearchRequest) HasImageBlobId() bool {
	if o != nil && o.ImageBlobId.IsSet() {
		return true
	}

	return false
}

func (o *SearchRequest) SetImageBlobId(v int32) {
	o.ImageBlobId.Set(&v)
}
func (o *SearchRequest) SetImageBlobIdNil() {
	o.ImageBlobId.Set(nil)
}

func (o *SearchRequest) UnsetImageBlobId() {
	o.ImageBlobId.Unset()
}

func (o *SearchRequest) GetIncludeTags() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.IncludeTags
}

func (o *SearchRequest) GetIncludeTagsOk() ([]string, bool) {
	if o == nil || IsNil(o.IncludeTags) {
		return nil, false
	}
	return o.IncludeTags, true
}

func (o *SearchRequest) HasIncludeTags() bool {
	if o != nil && !IsNil(o.IncludeTags) {
		return true
	}

	return false
}

func (o *SearchRequest) SetIncludeTags(v []string) {
	o.IncludeTags = v
}

func (o *SearchRequest) GetIndexedRes() int32 {
	if o == nil || IsNil(o.IndexedRes.Get()) {
		var ret int32
		return ret
	}
	return *o.IndexedRes.Get()
}

func (o *SearchRequest) GetIndexedResOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.IndexedRes.Get(), o.IndexedRes.IsSet()
}

func (o *SearchRequest) HasIndexedRes() bool {
	if o != nil && o.IndexedRes.IsSet() {
		return true
	}

	return false
}

func (o *SearchRequest) SetIndexedRes(v int32) {
	o.IndexedRes.Set(&v)
}
func (o *SearchRequest) SetIndexedResNil() {
	o.IndexedRes.Set(nil)
}

func (o *SearchRequest) UnsetIndexedRes() {
	o.IndexedRes.Unset()
}

func (o *SearchRequest) GetK() int32 {
	if o == nil || IsNil(o.K) {
		var ret int32
		return ret
	}
	return *o.K
}

func (o *SearchRequest) GetKOk() (*int32, bool) {
	if o == nil || IsNil(o.K) {
		return nil, false
	}
	return o.K, true
}

func (o *SearchRequest) HasK() bool {
	if o != nil && !IsNil(o.K) {
		return true
	}

	return false
}

func (o *SearchRequest) SetK(v int32) {
	o.K = &v
}

func (o *SearchRequest) GetKind() string {
	if o == nil || IsNil(o.Kind.Get()) {
		var ret string
		return ret
	}
	return *o.Kind.Get()
}

func (o *SearchRequest) GetKindOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Kind.Get(), o.Kind.IsSet()
}

func (o *SearchRequest) HasKind() bool {
	if o != nil && o.Kind.IsSet() {
		return true
	}

	return false
}

func (o *SearchRequest) SetKind(v string) {
	o.Kind.Set(&v)
}
func (o *SearchRequest) SetKindNil() {
	o.Kind.Set(nil)
}

func (o *SearchRequest) UnsetKind() {
	o.Kind.Unset()
}

func (o *SearchRequest) GetMaxHeight() int32 {
	if o == nil || IsNil(o.MaxHeight.Get()) {
		var ret int32
		return ret
	}
	return *o.MaxHeight.Get()
}

func (o *SearchRequest) GetMaxHeightOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.MaxHeight.Get(), o.MaxHeight.IsSet()
}

func (o *SearchRequest) HasMaxHeight() bool {
	if o != nil && o.MaxHeight.IsSet() {
		return true
	}

	return false
}

func (o *SearchRequest) SetMaxHeight(v int32) {
	o.MaxHeight.Set(&v)
}
func (o *SearchRequest) SetMaxHeightNil() {
	o.MaxHeight.Set(nil)
}

func (o *SearchRequest) UnsetMaxHeight() {
	o.MaxHeight.Unset()
}

func (o *SearchRequest) GetMaxWidth() int32 {
	if o == nil || IsNil(o.MaxWidth.Get()) {
		var ret int32
		return ret
	}
	return *o.MaxWidth.Get()
}

func (o *SearchRequest) GetMaxWidthOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.MaxWidth.Get(), o.MaxWidth.IsSet()
}

func (o *SearchRequest) HasMaxWidth() bool {
	if o != nil && o.MaxWidth.IsSet() {
		return true
	}

	return false
}

func (o *SearchRequest) SetMaxWidth(v int32) {
	o.MaxWidth.Set(&v)
}
func (o *SearchRequest) SetMaxWidthNil() {
	o.MaxWidth.Set(nil)
}

func (o *SearchRequest) UnsetMaxWidth() {
	o.MaxWidth.Unset()
}

func (o *SearchRequest) GetMinScore() float32 {
	if o == nil || IsNil(o.MinScore) {
		var ret float32
		return ret
	}
	return *o.MinScore
}

func (o *SearchRequest) GetMinScoreOk() (*float32, bool) {
	if o == nil || IsNil(o.MinScore) {
		return nil, false
	}
	return o.MinScore, true
}

func (o *SearchRequest) HasMinScore() bool {
	if o != nil && !IsNil(o.MinScore) {
		return true
	}

	return false
}

func (o *SearchRequest) SetMinScore(v float32) {
	o.MinScore = &v
}

func (o *SearchRequest) GetNear() []float32 {
	if o == nil {
		var ret []float32
		return ret
	}
	return o.Near
}

func (o *SearchRequest) GetNearOk() ([]float32, bool) {
	if o == nil || IsNil(o.Near) {
		return nil, false
	}
	return o.Near, true
}

func (o *SearchRequest) HasNear() bool {
	if o != nil && !IsNil(o.Near) {
		return true
	}

	return false
}

func (o *SearchRequest) SetNear(v []float32) {
	o.Near = v
}

func (o *SearchRequest) GetSort() string {
	if o == nil || IsNil(o.Sort.Get()) {
		var ret string
		return ret
	}
	return *o.Sort.Get()
}

func (o *SearchRequest) GetSortOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Sort.Get(), o.Sort.IsSet()
}

func (o *SearchRequest) HasSort() bool {
	if o != nil && o.Sort.IsSet() {
		return true
	}

	return false
}

func (o *SearchRequest) SetSort(v string) {
	o.Sort.Set(&v)
}
func (o *SearchRequest) SetSortNil() {
	o.Sort.Set(nil)
}

func (o *SearchRequest) UnsetSort() {
	o.Sort.Unset()
}

func (o *SearchRequest) GetText() string {
	if o == nil || IsNil(o.Text.Get()) {
		var ret string
		return ret
	}
	return *o.Text.Get()
}

func (o *SearchRequest) GetTextOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Text.Get(), o.Text.IsSet()
}

func (o *SearchRequest) HasText() bool {
	if o != nil && o.Text.IsSet() {
		return true
	}

	return false
}

func (o *SearchRequest) SetText(v string) {
	o.Text.Set(&v)
}
func (o *SearchRequest) SetTextNil() {
	o.Text.Set(nil)
}

func (o *SearchRequest) UnsetText() {
	o.Text.Unset()
}

func (o SearchRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o SearchRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.After.IsSet() {
		toSerialize["after"] = o.After.Get()
	}
	if o.Before.IsSet() {
		toSerialize["before"] = o.Before.Get()
	}
	if !IsNil(o.CollapseDuplicates) {
		toSerialize["collapse_duplicates"] = o.CollapseDuplicates
	}
	if o.CustomerId.IsSet() {
		toSerialize["customer_id"] = o.CustomerId.Get()
	}
	if o.Device.IsSet() {
		toSerialize["device"] = o.Device.Get()
	}
	if o.DupeThreshold.IsSet() {
		toSerialize["dupe_threshold"] = o.DupeThreshold.Get()
	}
	if o.ExcludeTags != nil {
		toSerialize["exclude_tags"] = o.ExcludeTags
	}
	if o.Image.IsSet() {
		toSerialize["image"] = o.Image.Get()
	}
	if o.ImageBlobId.IsSet() {
		toSerialize["image_blob_id"] = o.ImageBlobId.Get()
	}
	if o.IncludeTags != nil {
		toSerialize["include_tags"] = o.IncludeTags
	}
	if o.IndexedRes.IsSet() {
		toSerialize["indexed_res"] = o.IndexedRes.Get()
	}
	if !IsNil(o.K) {
		toSerialize["k"] = o.K
	}
	if o.Kind.IsSet() {
		toSerialize["kind"] = o.Kind.Get()
	}
	if o.MaxHeight.IsSet() {
		toSerialize["max_height"] = o.MaxHeight.Get()
	}
	if o.MaxWidth.IsSet() {
		toSerialize["max_width"] = o.MaxWidth.Get()
	}
	if !IsNil(o.MinScore) {
		toSerialize["min_score"] = o.MinScore
	}
	if o.Near != nil {
		toSerialize["near"] = o.Near
	}
	if o.Sort.IsSet() {
		toSerialize["sort"] = o.Sort.Get()
	}
	if o.Text.IsSet() {
		toSerialize["text"] = o.Text.Get()
	}
	return toSerialize, nil
}

type NullableSearchRequest struct {
	value *SearchRequest
	isSet bool
}

func (v NullableSearchRequest) Get() *SearchRequest {
	return v.value
}

func (v *NullableSearchRequest) Set(val *SearchRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableSearchRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableSearchRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSearchRequest(val *SearchRequest) *NullableSearchRequest {
	return &NullableSearchRequest{value: val, isSet: true}
}

func (v NullableSearchRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSearchRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

