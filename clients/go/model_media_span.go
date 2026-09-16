package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &MediaSpan{}

type MediaSpan struct {
	EndMs int32 `json:"end_ms"`
	StartMs int32 `json:"start_ms"`
	Text NullableString `json:"text,omitempty"`
}

type _MediaSpan MediaSpan

func NewMediaSpan(endMs int32, startMs int32) *MediaSpan {
	this := MediaSpan{}
	this.EndMs = endMs
	this.StartMs = startMs
	return &this
}

func NewMediaSpanWithDefaults() *MediaSpan {
	this := MediaSpan{}
	return &this
}

func (o *MediaSpan) GetEndMs() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.EndMs
}

func (o *MediaSpan) GetEndMsOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.EndMs, true
}

func (o *MediaSpan) SetEndMs(v int32) {
	o.EndMs = v
}

func (o *MediaSpan) GetStartMs() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.StartMs
}

func (o *MediaSpan) GetStartMsOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.StartMs, true
}

func (o *MediaSpan) SetStartMs(v int32) {
	o.StartMs = v
}

func (o *MediaSpan) GetText() string {
	if o == nil || IsNil(o.Text.Get()) {
		var ret string
		return ret
	}
	return *o.Text.Get()
}

func (o *MediaSpan) GetTextOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Text.Get(), o.Text.IsSet()
}

func (o *MediaSpan) HasText() bool {
	if o != nil && o.Text.IsSet() {
		return true
	}

	return false
}

func (o *MediaSpan) SetText(v string) {
	o.Text.Set(&v)
}
func (o *MediaSpan) SetTextNil() {
	o.Text.Set(nil)
}

func (o *MediaSpan) UnsetText() {
	o.Text.Unset()
}

func (o MediaSpan) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MediaSpan) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["end_ms"] = o.EndMs
	toSerialize["start_ms"] = o.StartMs
	if o.Text.IsSet() {
		toSerialize["text"] = o.Text.Get()
	}
	return toSerialize, nil
}

func (o *MediaSpan) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"end_ms",
		"start_ms",
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

	varMediaSpan := _MediaSpan{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varMediaSpan)

	if err != nil {
		return err
	}

	*o = MediaSpan(varMediaSpan)

	return err
}

type NullableMediaSpan struct {
	value *MediaSpan
	isSet bool
}

func (v NullableMediaSpan) Get() *MediaSpan {
	return v.value
}

func (v *NullableMediaSpan) Set(val *MediaSpan) {
	v.value = val
	v.isSet = true
}

func (v NullableMediaSpan) IsSet() bool {
	return v.isSet
}

func (v *NullableMediaSpan) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMediaSpan(val *MediaSpan) *NullableMediaSpan {
	return &NullableMediaSpan{value: val, isSet: true}
}

func (v NullableMediaSpan) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMediaSpan) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

