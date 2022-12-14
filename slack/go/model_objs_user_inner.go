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

// ObjsUserInner struct for ObjsUserInner
type ObjsUserInner struct {
	ObjsUserInnerAnyOf *ObjsUserInnerAnyOf
	ObjsUserInnerAnyOf1 *ObjsUserInnerAnyOf1
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *ObjsUserInner) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into ObjsUserInnerAnyOf
	err = json.Unmarshal(data, &dst.ObjsUserInnerAnyOf);
	if err == nil {
		jsonObjsUserInnerAnyOf, _ := json.Marshal(dst.ObjsUserInnerAnyOf)
		if string(jsonObjsUserInnerAnyOf) == "{}" { // empty struct
			dst.ObjsUserInnerAnyOf = nil
		} else {
			return nil // data stored in dst.ObjsUserInnerAnyOf, return on the first match
		}
	} else {
		dst.ObjsUserInnerAnyOf = nil
	}

	// try to unmarshal JSON data into ObjsUserInnerAnyOf1
	err = json.Unmarshal(data, &dst.ObjsUserInnerAnyOf1);
	if err == nil {
		jsonObjsUserInnerAnyOf1, _ := json.Marshal(dst.ObjsUserInnerAnyOf1)
		if string(jsonObjsUserInnerAnyOf1) == "{}" { // empty struct
			dst.ObjsUserInnerAnyOf1 = nil
		} else {
			return nil // data stored in dst.ObjsUserInnerAnyOf1, return on the first match
		}
	} else {
		dst.ObjsUserInnerAnyOf1 = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(ObjsUserInner)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *ObjsUserInner) MarshalJSON() ([]byte, error) {
	if src.ObjsUserInnerAnyOf != nil {
		return json.Marshal(&src.ObjsUserInnerAnyOf)
	}

	if src.ObjsUserInnerAnyOf1 != nil {
		return json.Marshal(&src.ObjsUserInnerAnyOf1)
	}

	return nil, nil // no data in anyOf schemas
}

type NullableObjsUserInner struct {
	value *ObjsUserInner
	isSet bool
}

func (v NullableObjsUserInner) Get() *ObjsUserInner {
	return v.value
}

func (v *NullableObjsUserInner) Set(val *ObjsUserInner) {
	v.value = val
	v.isSet = true
}

func (v NullableObjsUserInner) IsSet() bool {
	return v.isSet
}

func (v *NullableObjsUserInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableObjsUserInner(val *ObjsUserInner) *NullableObjsUserInner {
	return &NullableObjsUserInner{value: val, isSet: true}
}

func (v NullableObjsUserInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableObjsUserInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


