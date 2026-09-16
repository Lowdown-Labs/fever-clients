package fever

import (
	"encoding/json"
)

var _ MappedNullable = &DuplicatesRequest{}

type DuplicatesRequest struct {
	CustomerId NullableString `json:"customer_id,omitempty"`
	CustomerIds []string `json:"customer_ids,omitempty"`
	Limit *int32 `json:"limit,omitempty"`
	Threshold *float32 `json:"threshold,omitempty"`
}

func NewDuplicatesRequest() *DuplicatesRequest {
	this := DuplicatesRequest{}
	var limit int32 = 500
	this.Limit = &limit
	var threshold float32 = 0.92
	this.Threshold = &threshold
	return &this
}

func NewDuplicatesRequestWithDefaults() *DuplicatesRequest {
	this := DuplicatesRequest{}
	var limit int32 = 500
	this.Limit = &limit
	var threshold float32 = 0.92
	this.Threshold = &threshold
	return &this
}

func (o *DuplicatesRequest) GetCustomerId() string {
	if o == nil || IsNil(o.CustomerId.Get()) {
		var ret string
		return ret
	}
	return *o.CustomerId.Get()
}

func (o *DuplicatesRequest) GetCustomerIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CustomerId.Get(), o.CustomerId.IsSet()
}

func (o *DuplicatesRequest) HasCustomerId() bool {
	if o != nil && o.CustomerId.IsSet() {
		return true
	}

	return false
}

func (o *DuplicatesRequest) SetCustomerId(v string) {
	o.CustomerId.Set(&v)
}
func (o *DuplicatesRequest) SetCustomerIdNil() {
	o.CustomerId.Set(nil)
}

func (o *DuplicatesRequest) UnsetCustomerId() {
	o.CustomerId.Unset()
}

func (o *DuplicatesRequest) GetCustomerIds() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.CustomerIds
}

func (o *DuplicatesRequest) GetCustomerIdsOk() ([]string, bool) {
	if o == nil || IsNil(o.CustomerIds) {
		return nil, false
	}
	return o.CustomerIds, true
}

func (o *DuplicatesRequest) HasCustomerIds() bool {
	if o != nil && !IsNil(o.CustomerIds) {
		return true
	}

	return false
}

func (o *DuplicatesRequest) SetCustomerIds(v []string) {
	o.CustomerIds = v
}

func (o *DuplicatesRequest) GetLimit() int32 {
	if o == nil || IsNil(o.Limit) {
		var ret int32
		return ret
	}
	return *o.Limit
}

func (o *DuplicatesRequest) GetLimitOk() (*int32, bool) {
	if o == nil || IsNil(o.Limit) {
		return nil, false
	}
	return o.Limit, true
}

func (o *DuplicatesRequest) HasLimit() bool {
	if o != nil && !IsNil(o.Limit) {
		return true
	}

	return false
}

func (o *DuplicatesRequest) SetLimit(v int32) {
	o.Limit = &v
}

func (o *DuplicatesRequest) GetThreshold() float32 {
	if o == nil || IsNil(o.Threshold) {
		var ret float32
		return ret
	}
	return *o.Threshold
}

func (o *DuplicatesRequest) GetThresholdOk() (*float32, bool) {
	if o == nil || IsNil(o.Threshold) {
		return nil, false
	}
	return o.Threshold, true
}

func (o *DuplicatesRequest) HasThreshold() bool {
	if o != nil && !IsNil(o.Threshold) {
		return true
	}

	return false
}

func (o *DuplicatesRequest) SetThreshold(v float32) {
	o.Threshold = &v
}

func (o DuplicatesRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o DuplicatesRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.CustomerId.IsSet() {
		toSerialize["customer_id"] = o.CustomerId.Get()
	}
	if o.CustomerIds != nil {
		toSerialize["customer_ids"] = o.CustomerIds
	}
	if !IsNil(o.Limit) {
		toSerialize["limit"] = o.Limit
	}
	if !IsNil(o.Threshold) {
		toSerialize["threshold"] = o.Threshold
	}
	return toSerialize, nil
}

type NullableDuplicatesRequest struct {
	value *DuplicatesRequest
	isSet bool
}

func (v NullableDuplicatesRequest) Get() *DuplicatesRequest {
	return v.value
}

func (v *NullableDuplicatesRequest) Set(val *DuplicatesRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableDuplicatesRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableDuplicatesRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDuplicatesRequest(val *DuplicatesRequest) *NullableDuplicatesRequest {
	return &NullableDuplicatesRequest{value: val, isSet: true}
}

func (v NullableDuplicatesRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDuplicatesRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

