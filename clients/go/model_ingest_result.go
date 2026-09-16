package fever

import (
	"encoding/json"
)

var _ MappedNullable = &IngestResult{}

type IngestResult struct {
	Existing []IngestedMedia `json:"existing,omitempty"`
	Ingested []IngestedMedia `json:"ingested,omitempty"`
	Job NullableJob `json:"job,omitempty"`
}

func NewIngestResult() *IngestResult {
	this := IngestResult{}
	return &this
}

func NewIngestResultWithDefaults() *IngestResult {
	this := IngestResult{}
	return &this
}

func (o *IngestResult) GetExisting() []IngestedMedia {
	if o == nil || IsNil(o.Existing) {
		var ret []IngestedMedia
		return ret
	}
	return o.Existing
}

func (o *IngestResult) GetExistingOk() ([]IngestedMedia, bool) {
	if o == nil || IsNil(o.Existing) {
		return nil, false
	}
	return o.Existing, true
}

func (o *IngestResult) HasExisting() bool {
	if o != nil && !IsNil(o.Existing) {
		return true
	}

	return false
}

func (o *IngestResult) SetExisting(v []IngestedMedia) {
	o.Existing = v
}

func (o *IngestResult) GetIngested() []IngestedMedia {
	if o == nil || IsNil(o.Ingested) {
		var ret []IngestedMedia
		return ret
	}
	return o.Ingested
}

func (o *IngestResult) GetIngestedOk() ([]IngestedMedia, bool) {
	if o == nil || IsNil(o.Ingested) {
		return nil, false
	}
	return o.Ingested, true
}

func (o *IngestResult) HasIngested() bool {
	if o != nil && !IsNil(o.Ingested) {
		return true
	}

	return false
}

func (o *IngestResult) SetIngested(v []IngestedMedia) {
	o.Ingested = v
}

func (o *IngestResult) GetJob() Job {
	if o == nil || IsNil(o.Job.Get()) {
		var ret Job
		return ret
	}
	return *o.Job.Get()
}

func (o *IngestResult) GetJobOk() (*Job, bool) {
	if o == nil {
		return nil, false
	}
	return o.Job.Get(), o.Job.IsSet()
}

func (o *IngestResult) HasJob() bool {
	if o != nil && o.Job.IsSet() {
		return true
	}

	return false
}

func (o *IngestResult) SetJob(v Job) {
	o.Job.Set(&v)
}
func (o *IngestResult) SetJobNil() {
	o.Job.Set(nil)
}

func (o *IngestResult) UnsetJob() {
	o.Job.Unset()
}

func (o IngestResult) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o IngestResult) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Existing) {
		toSerialize["existing"] = o.Existing
	}
	if !IsNil(o.Ingested) {
		toSerialize["ingested"] = o.Ingested
	}
	if o.Job.IsSet() {
		toSerialize["job"] = o.Job.Get()
	}
	return toSerialize, nil
}

type NullableIngestResult struct {
	value *IngestResult
	isSet bool
}

func (v NullableIngestResult) Get() *IngestResult {
	return v.value
}

func (v *NullableIngestResult) Set(val *IngestResult) {
	v.value = val
	v.isSet = true
}

func (v NullableIngestResult) IsSet() bool {
	return v.isSet
}

func (v *NullableIngestResult) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableIngestResult(val *IngestResult) *NullableIngestResult {
	return &NullableIngestResult{value: val, isSet: true}
}

func (v NullableIngestResult) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableIngestResult) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

