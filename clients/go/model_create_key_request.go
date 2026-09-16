package fever

import (
	"encoding/json"
)

var _ MappedNullable = &CreateKeyRequest{}

type CreateKeyRequest struct {
	CustomerId NullableString `json:"customer_id,omitempty"`
	Name NullableString `json:"name,omitempty"`
	Role NullableString `json:"role,omitempty"`
}

func NewCreateKeyRequest() *CreateKeyRequest {
	this := CreateKeyRequest{}
	return &this
}

func NewCreateKeyRequestWithDefaults() *CreateKeyRequest {
	this := CreateKeyRequest{}
	return &this
}

func (o *CreateKeyRequest) GetCustomerId() string {
	if o == nil || IsNil(o.CustomerId.Get()) {
		var ret string
		return ret
	}
	return *o.CustomerId.Get()
}

func (o *CreateKeyRequest) GetCustomerIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.CustomerId.Get(), o.CustomerId.IsSet()
}

func (o *CreateKeyRequest) HasCustomerId() bool {
	if o != nil && o.CustomerId.IsSet() {
		return true
	}

	return false
}

func (o *CreateKeyRequest) SetCustomerId(v string) {
	o.CustomerId.Set(&v)
}
func (o *CreateKeyRequest) SetCustomerIdNil() {
	o.CustomerId.Set(nil)
}

func (o *CreateKeyRequest) UnsetCustomerId() {
	o.CustomerId.Unset()
}

func (o *CreateKeyRequest) GetName() string {
	if o == nil || IsNil(o.Name.Get()) {
		var ret string
		return ret
	}
	return *o.Name.Get()
}

func (o *CreateKeyRequest) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Name.Get(), o.Name.IsSet()
}

func (o *CreateKeyRequest) HasName() bool {
	if o != nil && o.Name.IsSet() {
		return true
	}

	return false
}

func (o *CreateKeyRequest) SetName(v string) {
	o.Name.Set(&v)
}
func (o *CreateKeyRequest) SetNameNil() {
	o.Name.Set(nil)
}

func (o *CreateKeyRequest) UnsetName() {
	o.Name.Unset()
}

func (o *CreateKeyRequest) GetRole() string {
	if o == nil || IsNil(o.Role.Get()) {
		var ret string
		return ret
	}
	return *o.Role.Get()
}

func (o *CreateKeyRequest) GetRoleOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Role.Get(), o.Role.IsSet()
}

func (o *CreateKeyRequest) HasRole() bool {
	if o != nil && o.Role.IsSet() {
		return true
	}

	return false
}

func (o *CreateKeyRequest) SetRole(v string) {
	o.Role.Set(&v)
}
func (o *CreateKeyRequest) SetRoleNil() {
	o.Role.Set(nil)
}

func (o *CreateKeyRequest) UnsetRole() {
	o.Role.Unset()
}

func (o CreateKeyRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreateKeyRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if o.CustomerId.IsSet() {
		toSerialize["customer_id"] = o.CustomerId.Get()
	}
	if o.Name.IsSet() {
		toSerialize["name"] = o.Name.Get()
	}
	if o.Role.IsSet() {
		toSerialize["role"] = o.Role.Get()
	}
	return toSerialize, nil
}

type NullableCreateKeyRequest struct {
	value *CreateKeyRequest
	isSet bool
}

func (v NullableCreateKeyRequest) Get() *CreateKeyRequest {
	return v.value
}

func (v *NullableCreateKeyRequest) Set(val *CreateKeyRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateKeyRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateKeyRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateKeyRequest(val *CreateKeyRequest) *NullableCreateKeyRequest {
	return &NullableCreateKeyRequest{value: val, isSet: true}
}

func (v NullableCreateKeyRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateKeyRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

