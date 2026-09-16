package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &MediaFrame{}

type MediaFrame struct {
	FrameNo int32 `json:"frame_no"`
	TsMs int32 `json:"ts_ms"`
}

type _MediaFrame MediaFrame

func NewMediaFrame(frameNo int32, tsMs int32) *MediaFrame {
	this := MediaFrame{}
	this.FrameNo = frameNo
	this.TsMs = tsMs
	return &this
}

func NewMediaFrameWithDefaults() *MediaFrame {
	this := MediaFrame{}
	return &this
}

func (o *MediaFrame) GetFrameNo() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.FrameNo
}

func (o *MediaFrame) GetFrameNoOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.FrameNo, true
}

func (o *MediaFrame) SetFrameNo(v int32) {
	o.FrameNo = v
}

func (o *MediaFrame) GetTsMs() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.TsMs
}

func (o *MediaFrame) GetTsMsOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TsMs, true
}

func (o *MediaFrame) SetTsMs(v int32) {
	o.TsMs = v
}

func (o MediaFrame) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o MediaFrame) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["frame_no"] = o.FrameNo
	toSerialize["ts_ms"] = o.TsMs
	return toSerialize, nil
}

func (o *MediaFrame) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"frame_no",
		"ts_ms",
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

	varMediaFrame := _MediaFrame{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varMediaFrame)

	if err != nil {
		return err
	}

	*o = MediaFrame(varMediaFrame)

	return err
}

type NullableMediaFrame struct {
	value *MediaFrame
	isSet bool
}

func (v NullableMediaFrame) Get() *MediaFrame {
	return v.value
}

func (v *NullableMediaFrame) Set(val *MediaFrame) {
	v.value = val
	v.isSet = true
}

func (v NullableMediaFrame) IsSet() bool {
	return v.isSet
}

func (v *NullableMediaFrame) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMediaFrame(val *MediaFrame) *NullableMediaFrame {
	return &NullableMediaFrame{value: val, isSet: true}
}

func (v NullableMediaFrame) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMediaFrame) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

