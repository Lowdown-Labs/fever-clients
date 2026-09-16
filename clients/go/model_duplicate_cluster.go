package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &DuplicateCluster{}

type DuplicateCluster struct {
	MemberCustomers []*string `json:"member_customers,omitempty"`
	Members []int32 `json:"members"`
	Size int32 `json:"size"`
	Tightness float32 `json:"tightness"`
}

type _DuplicateCluster DuplicateCluster

func NewDuplicateCluster(members []int32, size int32, tightness float32) *DuplicateCluster {
	this := DuplicateCluster{}
	this.Members = members
	this.Size = size
	this.Tightness = tightness
	return &this
}

func NewDuplicateClusterWithDefaults() *DuplicateCluster {
	this := DuplicateCluster{}
	return &this
}

func (o *DuplicateCluster) GetMemberCustomers() []*string {
	if o == nil || IsNil(o.MemberCustomers) {
		var ret []*string
		return ret
	}
	return o.MemberCustomers
}

func (o *DuplicateCluster) GetMemberCustomersOk() ([]*string, bool) {
	if o == nil || IsNil(o.MemberCustomers) {
		return nil, false
	}
	return o.MemberCustomers, true
}

func (o *DuplicateCluster) HasMemberCustomers() bool {
	if o != nil && !IsNil(o.MemberCustomers) {
		return true
	}

	return false
}

func (o *DuplicateCluster) SetMemberCustomers(v []*string) {
	o.MemberCustomers = v
}

func (o *DuplicateCluster) GetMembers() []int32 {
	if o == nil {
		var ret []int32
		return ret
	}

	return o.Members
}

func (o *DuplicateCluster) GetMembersOk() ([]int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.Members, true
}

func (o *DuplicateCluster) SetMembers(v []int32) {
	o.Members = v
}

func (o *DuplicateCluster) GetSize() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Size
}

func (o *DuplicateCluster) GetSizeOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Size, true
}

func (o *DuplicateCluster) SetSize(v int32) {
	o.Size = v
}

func (o *DuplicateCluster) GetTightness() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Tightness
}

func (o *DuplicateCluster) GetTightnessOk() (*float32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Tightness, true
}

func (o *DuplicateCluster) SetTightness(v float32) {
	o.Tightness = v
}

func (o DuplicateCluster) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o DuplicateCluster) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.MemberCustomers) {
		toSerialize["member_customers"] = o.MemberCustomers
	}
	toSerialize["members"] = o.Members
	toSerialize["size"] = o.Size
	toSerialize["tightness"] = o.Tightness
	return toSerialize, nil
}

func (o *DuplicateCluster) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"members",
		"size",
		"tightness",
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

	varDuplicateCluster := _DuplicateCluster{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varDuplicateCluster)

	if err != nil {
		return err
	}

	*o = DuplicateCluster(varDuplicateCluster)

	return err
}

type NullableDuplicateCluster struct {
	value *DuplicateCluster
	isSet bool
}

func (v NullableDuplicateCluster) Get() *DuplicateCluster {
	return v.value
}

func (v *NullableDuplicateCluster) Set(val *DuplicateCluster) {
	v.value = val
	v.isSet = true
}

func (v NullableDuplicateCluster) IsSet() bool {
	return v.isSet
}

func (v *NullableDuplicateCluster) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDuplicateCluster(val *DuplicateCluster) *NullableDuplicateCluster {
	return &NullableDuplicateCluster{value: val, isSet: true}
}

func (v NullableDuplicateCluster) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDuplicateCluster) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

