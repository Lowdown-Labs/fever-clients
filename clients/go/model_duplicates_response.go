package fever

import (
	"encoding/json"
	"bytes"
	"fmt"
)

var _ MappedNullable = &DuplicatesResponse{}

type DuplicatesResponse struct {
	Clusters int32 `json:"clusters"`
	DuplicateClusters []DuplicateCluster `json:"duplicate_clusters,omitempty"`
	TotalDuplicates int32 `json:"total_duplicates"`
}

type _DuplicatesResponse DuplicatesResponse

func NewDuplicatesResponse(clusters int32, totalDuplicates int32) *DuplicatesResponse {
	this := DuplicatesResponse{}
	this.Clusters = clusters
	this.TotalDuplicates = totalDuplicates
	return &this
}

func NewDuplicatesResponseWithDefaults() *DuplicatesResponse {
	this := DuplicatesResponse{}
	return &this
}

func (o *DuplicatesResponse) GetClusters() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Clusters
}

func (o *DuplicatesResponse) GetClustersOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Clusters, true
}

func (o *DuplicatesResponse) SetClusters(v int32) {
	o.Clusters = v
}

func (o *DuplicatesResponse) GetDuplicateClusters() []DuplicateCluster {
	if o == nil || IsNil(o.DuplicateClusters) {
		var ret []DuplicateCluster
		return ret
	}
	return o.DuplicateClusters
}

func (o *DuplicatesResponse) GetDuplicateClustersOk() ([]DuplicateCluster, bool) {
	if o == nil || IsNil(o.DuplicateClusters) {
		return nil, false
	}
	return o.DuplicateClusters, true
}

func (o *DuplicatesResponse) HasDuplicateClusters() bool {
	if o != nil && !IsNil(o.DuplicateClusters) {
		return true
	}

	return false
}

func (o *DuplicatesResponse) SetDuplicateClusters(v []DuplicateCluster) {
	o.DuplicateClusters = v
}

func (o *DuplicatesResponse) GetTotalDuplicates() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.TotalDuplicates
}

func (o *DuplicatesResponse) GetTotalDuplicatesOk() (*int32, bool) {
	if o == nil {
		return nil, false
	}
	return &o.TotalDuplicates, true
}

func (o *DuplicatesResponse) SetTotalDuplicates(v int32) {
	o.TotalDuplicates = v
}

func (o DuplicatesResponse) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o DuplicatesResponse) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["clusters"] = o.Clusters
	if !IsNil(o.DuplicateClusters) {
		toSerialize["duplicate_clusters"] = o.DuplicateClusters
	}
	toSerialize["total_duplicates"] = o.TotalDuplicates
	return toSerialize, nil
}

func (o *DuplicatesResponse) UnmarshalJSON(data []byte) (err error) {
	requiredProperties := []string{
		"clusters",
		"total_duplicates",
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

	varDuplicatesResponse := _DuplicatesResponse{}

	decoder := json.NewDecoder(bytes.NewReader(data))
	decoder.DisallowUnknownFields()
	err = decoder.Decode(&varDuplicatesResponse)

	if err != nil {
		return err
	}

	*o = DuplicatesResponse(varDuplicatesResponse)

	return err
}

type NullableDuplicatesResponse struct {
	value *DuplicatesResponse
	isSet bool
}

func (v NullableDuplicatesResponse) Get() *DuplicatesResponse {
	return v.value
}

func (v *NullableDuplicatesResponse) Set(val *DuplicatesResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableDuplicatesResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableDuplicatesResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDuplicatesResponse(val *DuplicatesResponse) *NullableDuplicatesResponse {
	return &NullableDuplicatesResponse{value: val, isSet: true}
}

func (v NullableDuplicatesResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDuplicatesResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

