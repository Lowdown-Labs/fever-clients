package fever

import (
	"encoding/json"
)

var _ MappedNullable = &IngestMedia{}

type IngestMedia struct {
	Caption NullableString `json:"caption,omitempty"`
	CustomerId NullableString `json:"customer_id,omitempty"`
	Data NullableString `json:"data,omitempty"`
	Metadata map[string]interface{} `json:"metadata,omitempty"`
	StripExif *bool `json:"strip_exif,omitempty"`
	Tags []string `json:"tags,omitempty"`
	Url NullableString `json:"url,omitempty"`
}

func NewIngestMedia() *IngestMedia {
	this := IngestMedia{}
	var stripExif bool = false
	this.StripExif = &stripExif
	return &this
}

func NewIngestMediaWithDefaults() *IngestMedia {
	this := IngestMedia{}
	var stripExif bool = false
	this.StripExif = &stripExif
	return &this
}

func (o *IngestMedia) GetCaption() string {
	if o == nil || IsNil(o.Caption.Get()) {
		var ret string
		return ret
	}
	return *o.Caption.Get()
}

func (o *IngestMedia) GetCaptionOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Caption.Get(), o.Caption.IsSet()
}

func (o *IngestMedia) HasCaption() bool {
	if o != nil && o.Caption.IsSet() {
		return true
	}

	return false
}

func (o *IngestMedia) SetCaption(v string) {
	o.Caption.Set(&v)
}
func (o *IngestMedia) SetCaptionNil() {
	o.Caption.Set(nil)
}

func (o *IngestMedia) UnsetCaption() {
	o.Caption.Unset()
}

func (o *IngestMedia) GetCustomerId() string {
	if o == nil || IsNil(o.CustomerId.Get()) {
		var ret string
		return ret
	}
	return *o.CustomerId.Get()
}

func (o *IngestMedia) GetCustomerIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CustomerId.Get(), o.CustomerId.IsSet()
}

func (o *IngestMedia) HasCustomerId() bool {
	if o != nil && o.CustomerId.IsSet() {
		return true
	}

	return false
}

func (o *IngestMedia) SetCustomerId(v string) {
	o.CustomerId.Set(&v)
}
func (o *IngestMedia) SetCustomerIdNil() {
	o.CustomerId.Set(nil)
}

func (o *IngestMedia) UnsetCustomerId() {
	o.CustomerId.Unset()
}

func (o *IngestMedia) GetData() string {
	if o == nil || IsNil(o.Data.Get()) {
		var ret string
		return ret
	}
	return *o.Data.Get()
}

func (o *IngestMedia) GetDataOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Data.Get(), o.Data.IsSet()
}

func (o *IngestMedia) HasData() bool {
	if o != nil && o.Data.IsSet() {
		return true
	}

	return false
}

func (o *IngestMedia) SetData(v string) {
	o.Data.Set(&v)
}
func (o *IngestMedia) SetDataNil() {
	o.Data.Set(nil)
}

func (o *IngestMedia) UnsetData() {
	o.Data.Unset()
}

func (o *IngestMedia) GetMetadata() map[string]interface{} {
	if o == nil {
		var ret map[string]interface{}
		return ret
	}
	return o.Metadata
}

func (o *IngestMedia) GetMetadataOk() (map[string]interface{}, bool) {
	if o == nil || IsNil(o.Metadata) {
		return map[string]interface{}{}, false
	}
	return o.Metadata, true
}

func (o *IngestMedia) HasMetadata() bool {
	if o != nil && !IsNil(o.Metadata) {
		return true
	}

	return false
}

func (o *IngestMedia) SetMetadata(v map[string]interface{}) {
	o.Metadata = v
}

func (o *IngestMedia) GetStripExif() bool {
	if o == nil || IsNil(o.StripExif) {
		var ret bool
		return ret
	}
	return *o.StripExif
}

func (o *IngestMedia) GetStripExifOk() (*bool, bool) {
	if o == nil || IsNil(o.StripExif) {
		return nil, false
	}
	return o.StripExif, true
}

func (o *IngestMedia) HasStripExif() bool {
	if o != nil && !IsNil(o.StripExif) {
		return true
	}

	return false
}

func (o *IngestMedia) SetStripExif(v bool) {
	o.StripExif = &v
}

func (o *IngestMedia) GetTags() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.Tags
}

func (o *IngestMedia) GetTagsOk() ([]string, bool) {
	if o == nil || IsNil(o.Tags) {
		return nil, false
	}
	return o.Tags, true
}

func (o *IngestMedia) HasTags() bool {
	if o != nil && !IsNil(o.Tags) {
		return true
	}

	return false
}

func (o *IngestMedia) SetTags(v []string) {
	o.Tags = v
}

func (o *IngestMedia) GetUrl() string {
	if o == nil || IsNil(o.Url.Get()) {
		var ret string
		return ret
	}
	return *o.Url.Get()
}

func (o *IngestMedia) GetUrlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Url.Get(), o.Url.IsSet()
}

func (o *IngestMedia) HasUrl() bool {
	if o != nil && o.Url.IsSet() {
		return true
	}

	return false
}

func (o *IngestMedia) SetUrl(v string) {
	o.Url.Set(&v)
}
func (o *IngestMedia) SetUrlNil() {
	o.Url.Set(nil)
}

func (o *IngestMedia) UnsetUrl() {
	o.Url.Unset()
}

func (o IngestMedia) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o IngestMedia) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.Caption.IsSet() {
		toSerialize["caption"] = o.Caption.Get()
	}
	if o.CustomerId.IsSet() {
		toSerialize["customer_id"] = o.CustomerId.Get()
	}
	if o.Data.IsSet() {
		toSerialize["data"] = o.Data.Get()
	}
	if o.Metadata != nil {
		toSerialize["metadata"] = o.Metadata
	}
	if !IsNil(o.StripExif) {
		toSerialize["strip_exif"] = o.StripExif
	}
	if o.Tags != nil {
		toSerialize["tags"] = o.Tags
	}
	if o.Url.IsSet() {
		toSerialize["url"] = o.Url.Get()
	}
	return toSerialize, nil
}

type NullableIngestMedia struct {
	value *IngestMedia
	isSet bool
}

func (v NullableIngestMedia) Get() *IngestMedia {
	return v.value
}

func (v *NullableIngestMedia) Set(val *IngestMedia) {
	v.value = val
	v.isSet = true
}

func (v NullableIngestMedia) IsSet() bool {
	return v.isSet
}

func (v *NullableIngestMedia) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIngestMedia(val *IngestMedia) *NullableIngestMedia {
	return &NullableIngestMedia{value: val, isSet: true}
}

func (v NullableIngestMedia) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIngestMedia) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

