/*
Outmatch API

Outmatch API

API version: 0.0.34
Contact: internal@outmatchapi.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"fmt"
)

// Status the model 'Status'
type Status string

// List of Status
const (
	PENDING Status = "pending"
	SUCCESS Status = "success"
	FAIL Status = "fail"
)

// All allowed values of Status enum
var AllowedStatusEnumValues = []Status{
	"pending",
	"success",
	"fail",
}

func (v *Status) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := Status(value)
	for _, existing := range AllowedStatusEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid Status", value)
}

// NewStatusFromValue returns a pointer to a valid Status
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewStatusFromValue(v string) (*Status, error) {
	ev := Status(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for Status: valid values are %v", v, AllowedStatusEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v Status) IsValid() bool {
	for _, existing := range AllowedStatusEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to Status value
func (v Status) Ptr() *Status {
	return &v
}

type NullableStatus struct {
	value *Status
	isSet bool
}

func (v NullableStatus) Get() *Status {
	return v.value
}

func (v *NullableStatus) Set(val *Status) {
	v.value = val
	v.isSet = true
}

func (v NullableStatus) IsSet() bool {
	return v.isSet
}

func (v *NullableStatus) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableStatus(val *Status) *NullableStatus {
	return &NullableStatus{value: val, isSet: true}
}

func (v NullableStatus) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableStatus) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

