package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &TranscriptSegment{}

type TranscriptSegment struct {
	EndMs NullableInt32 `json:"end_ms"`
	Seq int32 `json:"seq"`
	StartMs NullableInt32 `json:"start_ms"`
	Text NullableString `json:"text"`
}

type _TranscriptSegment TranscriptSegment

func NewTranscriptSegment(endMs NullableInt32, seq int32, startMs NullableInt32, text NullableString) *TranscriptSegment {
	this := TranscriptSegment{}
	this.EndMs = endMs
	this.Seq = seq
	this.StartMs = startMs
	this.Text = text
	return &this
}

func NewTranscriptSegmentWithDefaults() *TranscriptSegment {
	this := TranscriptSegment{}
	return &this
}

func (o *TranscriptSegment) GetEndMs() int32 {
	if o == nil || o.EndMs.Get() == nil {
		var ret int32
		return ret
	}

	return *o.EndMs.Get()
}

func (o *TranscriptSegment) GetEndMsOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.EndMs.Get(), o.EndMs.IsSet()
}

func (o *TranscriptSegment) SetEndMs(v int32) {
	o.EndMs.Set(&v)
}

func (o *TranscriptSegment) GetSeq() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Seq
}

func (o *TranscriptSegment) GetSeqOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Seq, true
}

func (o *TranscriptSegment) SetSeq(v int32) {
	o.Seq = v
}

func (o *TranscriptSegment) GetStartMs() int32 {
	if o == nil || o.StartMs.Get() == nil {
		var ret int32
		return ret
	}

	return *o.StartMs.Get()
}

func (o *TranscriptSegment) GetStartMsOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return o.StartMs.Get(), o.StartMs.IsSet()
}

func (o *TranscriptSegment) SetStartMs(v int32) {
	o.StartMs.Set(&v)
}

func (o *TranscriptSegment) GetText() string {
	if o == nil || o.Text.Get() == nil {
		var ret string
		return ret
	}

	return *o.Text.Get()
}

func (o *TranscriptSegment) GetTextOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Text.Get(), o.Text.IsSet()
}

func (o *TranscriptSegment) SetText(v string) {
	o.Text.Set(&v)
}

func (o TranscriptSegment) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o TranscriptSegment) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["end_ms"] = o.EndMs.Get()
	toSerialize["seq"] = o.Seq
	toSerialize["start_ms"] = o.StartMs.Get()
	toSerialize["text"] = o.Text.Get()
	return toSerialize, nil
}

func (o *TranscriptSegment) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"end_ms",
		"seq",
		"start_ms",
		"text",
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

	varTranscriptSegment := _TranscriptSegment{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varTranscriptSegment)

	if err != nil {
		return err
	}

	*o = TranscriptSegment(varTranscriptSegment)

	return err
}

type NullableTranscriptSegment struct {
	value *TranscriptSegment
	isSet bool
}

func (v NullableTranscriptSegment) Get() *TranscriptSegment {
	return v.value
}

func (v *NullableTranscriptSegment) Set(val *TranscriptSegment) {
	v.value = val
	v.isSet = true
}

func (v NullableTranscriptSegment) IsSet() bool {
	return v.isSet
}

func (v *NullableTranscriptSegment) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableTranscriptSegment(val *TranscriptSegment) *NullableTranscriptSegment {
	return &NullableTranscriptSegment{value: val, isSet: true}
}

func (v NullableTranscriptSegment) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableTranscriptSegment) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

