package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &QueryRequest{}

type QueryRequest struct {
	RowLimit *int32 `json:"row_limit,omitempty"`
	Sql string `json:"sql"`
}

type _QueryRequest QueryRequest

func NewQueryRequest(sql string) *QueryRequest {
	this := QueryRequest{}
	var rowLimit int32 = 200
	this.RowLimit = &rowLimit
	this.Sql = sql
	return &this
}

func NewQueryRequestWithDefaults() *QueryRequest {
	this := QueryRequest{}
	var rowLimit int32 = 200
	this.RowLimit = &rowLimit
	return &this
}

func (o *QueryRequest) GetRowLimit() int32 {
	if o == nil || IsNil(o.RowLimit) {
		var ret int32
		return ret
	}
	return *o.RowLimit
}

func (o *QueryRequest) GetRowLimitOk() (*int32, bool) {
	if o == nil || IsNil(o.RowLimit) {
		return nil, false
	}
	return o.RowLimit, true
}

func (o *QueryRequest) HasRowLimit() bool {
	if o != nil && !IsNil(o.RowLimit) {
		return true
	}

	return false
}

func (o *QueryRequest) SetRowLimit(v int32) {
	o.RowLimit = &v
}

func (o *QueryRequest) GetSql() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Sql
}

func (o *QueryRequest) GetSqlOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Sql, true
}

func (o *QueryRequest) SetSql(v string) {
	o.Sql = v
}

func (o QueryRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o QueryRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.RowLimit) {
		toSerialize["row_limit"] = o.RowLimit
	}
	toSerialize["sql"] = o.Sql
	return toSerialize, nil
}

func (o *QueryRequest) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"sql",
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

	varQueryRequest := _QueryRequest{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varQueryRequest)

	if err != nil {
		return err
	}

	*o = QueryRequest(varQueryRequest)

	return err
}

type NullableQueryRequest struct {
	value *QueryRequest
	isSet bool
}

func (v NullableQueryRequest) Get() *QueryRequest {
	return v.value
}

func (v *NullableQueryRequest) Set(val *QueryRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableQueryRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableQueryRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableQueryRequest(val *QueryRequest) *NullableQueryRequest {
	return &NullableQueryRequest{value: val, isSet: true}
}

func (v NullableQueryRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableQueryRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

