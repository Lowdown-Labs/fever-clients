package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &QueryResult{}

type QueryResult struct {
	Columns []string `json:"columns"`
	Rows [][]interface{} `json:"rows"`
	Truncated bool `json:"truncated"`
}

type _QueryResult QueryResult

func NewQueryResult(columns []string, rows [][]interface{}, truncated bool) *QueryResult {
	this := QueryResult{}
	this.Columns = columns
	this.Rows = rows
	this.Truncated = truncated
	return &this
}

func NewQueryResultWithDefaults() *QueryResult {
	this := QueryResult{}
	return &this
}

func (o *QueryResult) GetColumns() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Columns
}

func (o *QueryResult) GetColumnsOk() ([]string, bool) {
	if o == nil {
		return nil, false
	}
	return o.Columns, true
}

func (o *QueryResult) SetColumns(v []string) {
	o.Columns = v
}

func (o *QueryResult) GetRows() [][]interface{} {
	if o == nil {
		var ret [][]interface{}
		return ret
	}

	return o.Rows
}

func (o *QueryResult) GetRowsOk() ([][]interface{}, bool) {
	if o == nil {
		return nil, false
	}
	return o.Rows, true
}

func (o *QueryResult) SetRows(v [][]interface{}) {
	o.Rows = v
}

func (o *QueryResult) GetTruncated() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Truncated
}

func (o *QueryResult) GetTruncatedOk() (*bool, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Truncated, true
}

func (o *QueryResult) SetTruncated(v bool) {
	o.Truncated = v
}

func (o QueryResult) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o QueryResult) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["columns"] = o.Columns
	toSerialize["rows"] = o.Rows
	toSerialize["truncated"] = o.Truncated
	return toSerialize, nil
}

func (o *QueryResult) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"columns",
		"rows",
		"truncated",
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

	varQueryResult := _QueryResult{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varQueryResult)

	if err != nil {
		return err
	}

	*o = QueryResult(varQueryResult)

	return err
}

type NullableQueryResult struct {
	value *QueryResult
	isSet bool
}

func (v NullableQueryResult) Get() *QueryResult {
	return v.value
}

func (v *NullableQueryResult) Set(val *QueryResult) {
	v.value = val
	v.isSet = true
}

func (v NullableQueryResult) IsSet() bool {
	return v.isSet
}

func (v *NullableQueryResult) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableQueryResult(val *QueryResult) *NullableQueryResult {
	return &NullableQueryResult{value: val, isSet: true}
}

func (v NullableQueryResult) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableQueryResult) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

