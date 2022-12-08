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

// ObjsSubteamAutoTypeInner struct for ObjsSubteamAutoTypeInner
type ObjsSubteamAutoTypeInner struct {
	interface{} *interface{}
	string *string
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *ObjsSubteamAutoTypeInner) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into interface{}
	err = json.Unmarshal(data, &dst.interface{});
	if err == nil {
		jsoninterface{}, _ := json.Marshal(dst.interface{})
		if string(jsoninterface{}) == "{}" { // empty struct
			dst.interface{} = nil
		} else {
			return nil // data stored in dst.interface{}, return on the first match
		}
	} else {
		dst.interface{} = nil
	}

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

	return fmt.Errorf("data failed to match schemas in anyOf(ObjsSubteamAutoTypeInner)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *ObjsSubteamAutoTypeInner) MarshalJSON() ([]byte, error) {
	if src.interface{} != nil {
		return json.Marshal(&src.interface{})
	}

	if src.string != nil {
		return json.Marshal(&src.string)
	}

	return nil, nil // no data in anyOf schemas
}

type NullableObjsSubteamAutoTypeInner struct {
	value *ObjsSubteamAutoTypeInner
	isSet bool
}

func (v NullableObjsSubteamAutoTypeInner) Get() *ObjsSubteamAutoTypeInner {
	return v.value
}

func (v *NullableObjsSubteamAutoTypeInner) Set(val *ObjsSubteamAutoTypeInner) {
	v.value = val
	v.isSet = true
}

func (v NullableObjsSubteamAutoTypeInner) IsSet() bool {
	return v.isSet
}

func (v *NullableObjsSubteamAutoTypeInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableObjsSubteamAutoTypeInner(val *ObjsSubteamAutoTypeInner) *NullableObjsSubteamAutoTypeInner {
	return &NullableObjsSubteamAutoTypeInner{value: val, isSet: true}
}

func (v NullableObjsSubteamAutoTypeInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableObjsSubteamAutoTypeInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


