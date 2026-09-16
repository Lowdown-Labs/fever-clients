package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &ValidationError{}

type ValidationError struct {
	Ctx map[string]interface{} `json:"ctx,omitempty"`
	Input interface{} `json:"input,omitempty"`
	Loc []LocationInner `json:"loc"`
	Msg string `json:"msg"`
	Type string `json:"type"`
}

type _ValidationError ValidationError

func NewValidationError(loc []LocationInner, msg string, type_ string) *ValidationError {
	this := ValidationError{}
	this.Loc = loc
	this.Msg = msg
	this.Type = type_
	return &this
}

func NewValidationErrorWithDefaults() *ValidationError {
	this := ValidationError{}
	return &this
}

func (o *ValidationError) GetCtx() map[string]interface{} {
	if o == nil || IsNil(o.Ctx) {
		var ret map[string]interface{}
		return ret
	}
	return o.Ctx
}

func (o *ValidationError) GetCtxOk() (map[string]interface{}, bool) {
	if o == nil || IsNil(o.Ctx) {
		return map[string]interface{}{}, false
	}
	return o.Ctx, true
}

func (o *ValidationError) HasCtx() bool {
	if o != nil && !IsNil(o.Ctx) {
		return true
	}

	return false
}

func (o *ValidationError) SetCtx(v map[string]interface{}) {
	o.Ctx = v
}

func (o *ValidationError) GetInput() interface{} {
	if o == nil {
		var ret interface{}
		return ret
	}
	return o.Input
}

func (o *ValidationError) GetInputOk() (*interface{}, bool) {
	if o == nil || IsNil(o.Input) {
		return nil, false
	}
	return &o.Input, true
}

func (o *ValidationError) HasInput() bool {
	if o != nil && !IsNil(o.Input) {
		return true
	}

	return false
}

func (o *ValidationError) SetInput(v interface{}) {
	o.Input = v
}

func (o *ValidationError) GetLoc() []LocationInner {
	if o == nil {
		var ret []LocationInner
		return ret
	}

	return o.Loc
}

func (o *ValidationError) GetLocOk() ([]LocationInner, bool) {
	if o == nil {
		return nil, false
	}
	return o.Loc, true
}

func (o *ValidationError) SetLoc(v []LocationInner) {
	o.Loc = v
}

func (o *ValidationError) GetMsg() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Msg
}

func (o *ValidationError) GetMsgOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Msg, true
}

func (o *ValidationError) SetMsg(v string) {
	o.Msg = v
}

func (o *ValidationError) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

func (o *ValidationError) GetTypeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Type, true
}

func (o *ValidationError) SetType(v string) {
	o.Type = v
}

func (o ValidationError) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ValidationError) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Ctx) {
		toSerialize["ctx"] = o.Ctx
	}
	if o.Input != nil {
		toSerialize["input"] = o.Input
	}
	toSerialize["loc"] = o.Loc
	toSerialize["msg"] = o.Msg
	toSerialize["type"] = o.Type
	return toSerialize, nil
}

func (o *ValidationError) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"loc",
		"msg",
		"type",
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

	varValidationError := _ValidationError{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varValidationError)

	if err != nil {
		return err
	}

	*o = ValidationError(varValidationError)

	return err
}

type NullableValidationError struct {
	value *ValidationError
	isSet bool
}

func (v NullableValidationError) Get() *ValidationError {
	return v.value
}

func (v *NullableValidationError) Set(val *ValidationError) {
	v.value = val
	v.isSet = true
}

func (v NullableValidationError) IsSet() bool {
	return v.isSet
}

func (v *NullableValidationError) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableValidationError(val *ValidationError) *NullableValidationError {
	return &NullableValidationError{value: val, isSet: true}
}

func (v NullableValidationError) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableValidationError) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

