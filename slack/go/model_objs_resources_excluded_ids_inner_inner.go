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

// ObjsResourcesExcludedIdsInnerInner struct for ObjsResourcesExcludedIdsInnerInner
type ObjsResourcesExcludedIdsInnerInner struct {
	string *string
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *ObjsResourcesExcludedIdsInnerInner) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into string
	err = json.Unmarshal(data, &dst.string);
	if err == nil {
		jsonstring, _ := json.Marshal(dst.string)
		if string(jsonstring) == "{}" { // empty struct
			dst.string = nil
		} else {
			return nil // data stored in dst.string, return on the first match
		}
	} else {
		dst.string = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(ObjsResourcesExcludedIdsInnerInner)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *ObjsResourcesExcludedIdsInnerInner) MarshalJSON() ([]byte, error) {
	if src.string != nil {
		return json.Marshal(&src.string)
	}

	return nil, nil // no data in anyOf schemas
}

type NullableObjsResourcesExcludedIdsInnerInner struct {
	value *ObjsResourcesExcludedIdsInnerInner
	isSet bool
}

func (v NullableObjsResourcesExcludedIdsInnerInner) Get() *ObjsResourcesExcludedIdsInnerInner {
	return v.value
}

func (v *NullableObjsResourcesExcludedIdsInnerInner) Set(val *ObjsResourcesExcludedIdsInnerInner) {
	v.value = val
	v.isSet = true
}

func (v NullableObjsResourcesExcludedIdsInnerInner) IsSet() bool {
	return v.isSet
}

func (v *NullableObjsResourcesExcludedIdsInnerInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableObjsResourcesExcludedIdsInnerInner(val *ObjsResourcesExcludedIdsInnerInner) *NullableObjsResourcesExcludedIdsInnerInner {
	return &NullableObjsResourcesExcludedIdsInnerInner{value: val, isSet: true}
}

func (v NullableObjsResourcesExcludedIdsInnerInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableObjsResourcesExcludedIdsInnerInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


