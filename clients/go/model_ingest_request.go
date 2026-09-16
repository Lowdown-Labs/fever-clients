package fever

import (
	"encoding/json"
)

var _ MappedNullable = &IngestRequest{}

type IngestRequest struct {
	Media []IngestMedia `json:"media,omitempty"`
	Overwrite *bool `json:"overwrite,omitempty"`
	Source NullableIngestSource `json:"source,omitempty"`
	TargetRes NullableInt32 `json:"target_res,omitempty"`
}

func NewIngestRequest() *IngestRequest {
	this := IngestRequest{}
	var overwrite bool = false
	this.Overwrite = &overwrite
	return &this
}

func NewIngestRequestWithDefaults() *IngestRequest {
	this := IngestRequest{}
	var overwrite bool = false
	this.Overwrite = &overwrite
	return &this
}

func (o *IngestRequest) GetMedia() []IngestMedia {
	if o == nil {
		var ret []IngestMedia
		return ret
	}
	return o.Media
}

func (o *IngestRequest) GetMediaOk() ([]IngestMedia, bool) {
	if o == nil || IsNil(o.Media) {
		return nil, false
	}
	return o.Media, true
}

func (o *IngestRequest) HasMedia() bool {
	if o != nil && !IsNil(o.Media) {
		return true
	}

	return false
}

func (o *IngestRequest) SetMedia(v []IngestMedia) {
	o.Media = v
}

func (o *IngestRequest) GetOverwrite() bool {
	if o == nil || IsNil(o.Overwrite) {
		var ret bool
		return ret
	}
	return *o.Overwrite
}

func (o *IngestRequest) GetOverwriteOk() (*bool, bool) {
	if o == nil || IsNil(o.Overwrite) {
		return nil, false
	}
	return o.Overwrite, true
}

func (o *IngestRequest) HasOverwrite() bool {
	if o != nil && !IsNil(o.Overwrite) {
		return true
	}

	return false
}

func (o *IngestRequest) SetOverwrite(v bool) {
	o.Overwrite = &v
}

func (o *IngestRequest) GetSource() IngestSource {
	if o == nil || IsNil(o.Source.Get()) {
		var ret IngestSource
		return ret
	}
	return *o.Source.Get()
}

func (o *IngestRequest) GetSourceOk() (*IngestSource, bool) {
	if o == nil {
		return nil, false
	}
	return o.Source.Get(), o.Source.IsSet()
}

func (o *IngestRequest) HasSource() bool {
	if o != nil && o.Source.IsSet() {
		return true
	}

	return false
}

func (o *IngestRequest) SetSource(v IngestSource) {
	o.Source.Set(&v)
}
func (o *IngestRequest) SetSourceNil() {
	o.Source.Set(nil)
}

func (o *IngestRequest) UnsetSource() {
	o.Source.Unset()
}

func (o *IngestRequest) GetTargetRes() int32 {
	if o == nil || IsNil(o.TargetRes.Get()) {
		var ret int32
		return ret
	}
	return *o.TargetRes.Get()
}

func (o *IngestRequest) GetTargetResOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.TargetRes.Get(), o.TargetRes.IsSet()
}

func (o *IngestRequest) HasTargetRes() bool {
	if o != nil && o.TargetRes.IsSet() {
		return true
	}

	return false
}

func (o *IngestRequest) SetTargetRes(v int32) {
	o.TargetRes.Set(&v)
}
func (o *IngestRequest) SetTargetResNil() {
	o.TargetRes.Set(nil)
}

func (o *IngestRequest) UnsetTargetRes() {
	o.TargetRes.Unset()
}

func (o IngestRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o IngestRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.Media != nil {
		toSerialize["media"] = o.Media
	}
	if !IsNil(o.Overwrite) {
		toSerialize["overwrite"] = o.Overwrite
	}
	if o.Source.IsSet() {
		toSerialize["source"] = o.Source.Get()
	}
	if o.TargetRes.IsSet() {
		toSerialize["target_res"] = o.TargetRes.Get()
	}
	return toSerialize, nil
}

type NullableIngestRequest struct {
	value *IngestRequest
	isSet bool
}

func (v NullableIngestRequest) Get() *IngestRequest {
	return v.value
}

func (v *NullableIngestRequest) Set(val *IngestRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableIngestRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableIngestRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIngestRequest(val *IngestRequest) *NullableIngestRequest {
	return &NullableIngestRequest{value: val, isSet: true}
}

func (v NullableIngestRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIngestRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

