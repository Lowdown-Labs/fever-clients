package fever

import (
	"encoding/json"
	"fmt"
)

type LocationInner struct {
	Int32 *int32
	String *string
}

func (dst *LocationInner) UnmarshalJSON(data []byte) error {
	var err error
	err = json.Unmarshal(data, &dst.Int32);
	if err == nil {
		jsonInt32, _ := json.Marshal(dst.Int32)
		if string(jsonInt32) == "{}" {
			dst.Int32 = nil
		} else {
			return nil
		}
	} else {
		dst.Int32 = nil
	}

	err = json.Unmarshal(data, &dst.String);
	if err == nil {
		jsonString, _ := json.Marshal(dst.String)
		if string(jsonString) == "{}" {
			dst.String = nil
		} else {
			return nil
		}
	} else {
		dst.String = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(LocationInner)")
}

func (src LocationInner) MarshalJSON() ([]byte, error) {
	if src.Int32 != nil {
		return json.Marshal(&src.Int32)
	}

	if src.String != nil {
		return json.Marshal(&src.String)
	}

	return nil, nil
}

type NullableLocationInner struct {
	value *LocationInner
	isSet bool
}

func (v NullableLocationInner) Get() *LocationInner {
	return v.value
}

func (v *NullableLocationInner) Set(val *LocationInner) {
	v.value = val
	v.isSet = true
}

func (v NullableLocationInner) IsSet() bool {
	return v.isSet
}

func (v *NullableLocationInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLocationInner(val *LocationInner) *NullableLocationInner {
	return &NullableLocationInner{value: val, isSet: true}
}

func (v NullableLocationInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLocationInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

