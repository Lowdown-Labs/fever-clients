package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &Job{}

type Job struct {
	Done *int32 `json:"done,omitempty"`
	Error NullableString `json:"error,omitempty"`
	Id int32 `json:"id"`
	Skipped *int32 `json:"skipped,omitempty"`
	Status string `json:"status"`
	Total *int32 `json:"total,omitempty"`
}

type _Job Job

func NewJob(id int32, status string) *Job {
	this := Job{}
	var done int32 = 0
	this.Done = &done
	this.Id = id
	var skipped int32 = 0
	this.Skipped = &skipped
	this.Status = status
	var total int32 = 0
	this.Total = &total
	return &this
}

func NewJobWithDefaults() *Job {
	this := Job{}
	var done int32 = 0
	this.Done = &done
	var skipped int32 = 0
	this.Skipped = &skipped
	var total int32 = 0
	this.Total = &total
	return &this
}

func (o *Job) GetDone() int32 {
	if o == nil || IsNil(o.Done) {
		var ret int32
		return ret
	}
	return *o.Done
}

func (o *Job) GetDoneOk() (*int32, bool) {
	if o == nil || IsNil(o.Done) {
		return nil, false
	}
	return o.Done, true
}

func (o *Job) HasDone() bool {
	if o != nil && !IsNil(o.Done) {
		return true
	}

	return false
}

func (o *Job) SetDone(v int32) {
	o.Done = &v
}

func (o *Job) GetError() string {
	if o == nil || IsNil(o.Error.Get()) {
		var ret string
		return ret
	}
	return *o.Error.Get()
}

func (o *Job) GetErrorOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Error.Get(), o.Error.IsSet()
}

func (o *Job) HasError() bool {
	if o != nil && o.Error.IsSet() {
		return true
	}

	return false
}

func (o *Job) SetError(v string) {
	o.Error.Set(&v)
}
func (o *Job) SetErrorNil() {
	o.Error.Set(nil)
}

func (o *Job) UnsetError() {
	o.Error.Unset()
}

func (o *Job) GetId() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Id
}

func (o *Job) GetIdOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

func (o *Job) SetId(v int32) {
	o.Id = v
}

func (o *Job) GetSkipped() int32 {
	if o == nil || IsNil(o.Skipped) {
		var ret int32
		return ret
	}
	return *o.Skipped
}

func (o *Job) GetSkippedOk() (*int32, bool) {
	if o == nil || IsNil(o.Skipped) {
		return nil, false
	}
	return o.Skipped, true
}

func (o *Job) HasSkipped() bool {
	if o != nil && !IsNil(o.Skipped) {
		return true
	}

	return false
}

func (o *Job) SetSkipped(v int32) {
	o.Skipped = &v
}

func (o *Job) GetStatus() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Status
}

func (o *Job) GetStatusOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

func (o *Job) SetStatus(v string) {
	o.Status = v
}

func (o *Job) GetTotal() int32 {
	if o == nil || IsNil(o.Total) {
		var ret int32
		return ret
	}
	return *o.Total
}

func (o *Job) GetTotalOk() (*int32, bool) {
	if o == nil || IsNil(o.Total) {
		return nil, false
	}
	return o.Total, true
}

func (o *Job) HasTotal() bool {
	if o != nil && !IsNil(o.Total) {
		return true
	}

	return false
}

func (o *Job) SetTotal(v int32) {
	o.Total = &v
}

func (o Job) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Job) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Done) {
		toSerialize["done"] = o.Done
	}
	if o.Error.IsSet() {
		toSerialize["error"] = o.Error.Get()
	}
	toSerialize["id"] = o.Id
	if !IsNil(o.Skipped) {
		toSerialize["skipped"] = o.Skipped
	}
	toSerialize["status"] = o.Status
	if !IsNil(o.Total) {
		toSerialize["total"] = o.Total
	}
	return toSerialize, nil
}

func (o *Job) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"id",
		"status",
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

	varJob := _Job{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varJob)

	if err != nil {
		return err
	}

	*o = Job(varJob)

	return err
}

type NullableJob struct {
	value *Job
	isSet bool
}

func (v NullableJob) Get() *Job {
	return v.value
}

func (v *NullableJob) Set(val *Job) {
	v.value = val
	v.isSet = true
}

func (v NullableJob) IsSet() bool {
	return v.isSet
}

func (v *NullableJob) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableJob(val *Job) *NullableJob {
	return &NullableJob{value: val, isSet: true}
}

func (v NullableJob) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableJob) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

