package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &CorpusStats{}

type CorpusStats struct {
	Kinds map[string]int32 `json:"kinds"`
	TopTags []CorpusTag `json:"top_tags"`
}

type _CorpusStats CorpusStats

func NewCorpusStats(kinds map[string]int32, topTags []CorpusTag) *CorpusStats {
	this := CorpusStats{}
	this.Kinds = kinds
	this.TopTags = topTags
	return &this
}

func NewCorpusStatsWithDefaults() *CorpusStats {
	this := CorpusStats{}
	return &this
}

func (o *CorpusStats) GetKinds() map[string]int32 {
	if o == nil {
		var ret map[string]int32
		return ret
	}

	return o.Kinds
}

func (o *CorpusStats) GetKindsOk() (map[string]int32, bool) {
	if o == nil {
		return map[string]int32{}, false
	}
	return o.Kinds, true
}

func (o *CorpusStats) SetKinds(v map[string]int32) {
	o.Kinds = v
}

func (o *CorpusStats) GetTopTags() []CorpusTag {
	if o == nil {
		var ret []CorpusTag
		return ret
	}

	return o.TopTags
}

func (o *CorpusStats) GetTopTagsOk() ([]CorpusTag, bool) {
	if o == nil {
		return nil, false
	}
	return o.TopTags, true
}

func (o *CorpusStats) SetTopTags(v []CorpusTag) {
	o.TopTags = v
}

func (o CorpusStats) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CorpusStats) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["kinds"] = o.Kinds
	toSerialize["top_tags"] = o.TopTags
	return toSerialize, nil
}

func (o *CorpusStats) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"kinds",
		"top_tags",
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

	varCorpusStats := _CorpusStats{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varCorpusStats)

	if err != nil {
		return err
	}

	*o = CorpusStats(varCorpusStats)

	return err
}

type NullableCorpusStats struct {
	value *CorpusStats
	isSet bool
}

func (v NullableCorpusStats) Get() *CorpusStats {
	return v.value
}

func (v *NullableCorpusStats) Set(val *CorpusStats) {
	v.value = val
	v.isSet = true
}

func (v NullableCorpusStats) IsSet() bool {
	return v.isSet
}

func (v *NullableCorpusStats) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCorpusStats(val *CorpusStats) *NullableCorpusStats {
	return &NullableCorpusStats{value: val, isSet: true}
}

func (v NullableCorpusStats) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCorpusStats) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

