/*
Slack Web API

One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

API version: 1.7.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package slack

import (
	"encoding/json"
	"fmt"
)

// PinsListSuccessSchemaInner struct for PinsListSuccessSchemaInner
type PinsListSuccessSchemaInner struct {
	PinsListSuccessSchemaInnerAnyOf *PinsListSuccessSchemaInnerAnyOf
	PinsListSuccessSchemaInnerAnyOf1 *PinsListSuccessSchemaInnerAnyOf1
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *PinsListSuccessSchemaInner) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into PinsListSuccessSchemaInnerAnyOf
	err = json.Unmarshal(data, &dst.PinsListSuccessSchemaInnerAnyOf);
	if err == nil {
		jsonPinsListSuccessSchemaInnerAnyOf, _ := json.Marshal(dst.PinsListSuccessSchemaInnerAnyOf)
		if string(jsonPinsListSuccessSchemaInnerAnyOf) == "{}" { // empty struct
			dst.PinsListSuccessSchemaInnerAnyOf = nil
		} else {
			return nil // data stored in dst.PinsListSuccessSchemaInnerAnyOf, return on the first match
		}
	} else {
		dst.PinsListSuccessSchemaInnerAnyOf = nil
	}

	// try to unmarshal JSON data into PinsListSuccessSchemaInnerAnyOf1
	err = json.Unmarshal(data, &dst.PinsListSuccessSchemaInnerAnyOf1);
	if err == nil {
		jsonPinsListSuccessSchemaInnerAnyOf1, _ := json.Marshal(dst.PinsListSuccessSchemaInnerAnyOf1)
		if string(jsonPinsListSuccessSchemaInnerAnyOf1) == "{}" { // empty struct
			dst.PinsListSuccessSchemaInnerAnyOf1 = nil
		} else {
			return nil // data stored in dst.PinsListSuccessSchemaInnerAnyOf1, return on the first match
		}
	} else {
		dst.PinsListSuccessSchemaInnerAnyOf1 = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(PinsListSuccessSchemaInner)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *PinsListSuccessSchemaInner) MarshalJSON() ([]byte, error) {
	if src.PinsListSuccessSchemaInnerAnyOf != nil {
		return json.Marshal(&src.PinsListSuccessSchemaInnerAnyOf)
	}

	if src.PinsListSuccessSchemaInnerAnyOf1 != nil {
		return json.Marshal(&src.PinsListSuccessSchemaInnerAnyOf1)
	}

	return nil, nil // no data in anyOf schemas
}

type NullablePinsListSuccessSchemaInner struct {
	value *PinsListSuccessSchemaInner
	isSet bool
}

func (v NullablePinsListSuccessSchemaInner) Get() *PinsListSuccessSchemaInner {
	return v.value
}

func (v *NullablePinsListSuccessSchemaInner) Set(val *PinsListSuccessSchemaInner) {
	v.value = val
	v.isSet = true
}

func (v NullablePinsListSuccessSchemaInner) IsSet() bool {
	return v.isSet
}

func (v *NullablePinsListSuccessSchemaInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePinsListSuccessSchemaInner(val *PinsListSuccessSchemaInner) *NullablePinsListSuccessSchemaInner {
	return &NullablePinsListSuccessSchemaInner{value: val, isSet: true}
}

func (v NullablePinsListSuccessSchemaInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePinsListSuccessSchemaInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


