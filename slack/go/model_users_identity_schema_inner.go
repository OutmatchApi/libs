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

// UsersIdentitySchemaInner struct for UsersIdentitySchemaInner
type UsersIdentitySchemaInner struct {
	UsersIdentitySchemaInnerAnyOf *UsersIdentitySchemaInnerAnyOf
	UsersIdentitySchemaInnerAnyOf1 *UsersIdentitySchemaInnerAnyOf1
	UsersIdentitySchemaInnerAnyOf2 *UsersIdentitySchemaInnerAnyOf2
	UsersIdentitySchemaInnerAnyOf3 *UsersIdentitySchemaInnerAnyOf3
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *UsersIdentitySchemaInner) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into UsersIdentitySchemaInnerAnyOf
	err = json.Unmarshal(data, &dst.UsersIdentitySchemaInnerAnyOf);
	if err == nil {
		jsonUsersIdentitySchemaInnerAnyOf, _ := json.Marshal(dst.UsersIdentitySchemaInnerAnyOf)
		if string(jsonUsersIdentitySchemaInnerAnyOf) == "{}" { // empty struct
			dst.UsersIdentitySchemaInnerAnyOf = nil
		} else {
			return nil // data stored in dst.UsersIdentitySchemaInnerAnyOf, return on the first match
		}
	} else {
		dst.UsersIdentitySchemaInnerAnyOf = nil
	}

	// try to unmarshal JSON data into UsersIdentitySchemaInnerAnyOf1
	err = json.Unmarshal(data, &dst.UsersIdentitySchemaInnerAnyOf1);
	if err == nil {
		jsonUsersIdentitySchemaInnerAnyOf1, _ := json.Marshal(dst.UsersIdentitySchemaInnerAnyOf1)
		if string(jsonUsersIdentitySchemaInnerAnyOf1) == "{}" { // empty struct
			dst.UsersIdentitySchemaInnerAnyOf1 = nil
		} else {
			return nil // data stored in dst.UsersIdentitySchemaInnerAnyOf1, return on the first match
		}
	} else {
		dst.UsersIdentitySchemaInnerAnyOf1 = nil
	}

	// try to unmarshal JSON data into UsersIdentitySchemaInnerAnyOf2
	err = json.Unmarshal(data, &dst.UsersIdentitySchemaInnerAnyOf2);
	if err == nil {
		jsonUsersIdentitySchemaInnerAnyOf2, _ := json.Marshal(dst.UsersIdentitySchemaInnerAnyOf2)
		if string(jsonUsersIdentitySchemaInnerAnyOf2) == "{}" { // empty struct
			dst.UsersIdentitySchemaInnerAnyOf2 = nil
		} else {
			return nil // data stored in dst.UsersIdentitySchemaInnerAnyOf2, return on the first match
		}
	} else {
		dst.UsersIdentitySchemaInnerAnyOf2 = nil
	}

	// try to unmarshal JSON data into UsersIdentitySchemaInnerAnyOf3
	err = json.Unmarshal(data, &dst.UsersIdentitySchemaInnerAnyOf3);
	if err == nil {
		jsonUsersIdentitySchemaInnerAnyOf3, _ := json.Marshal(dst.UsersIdentitySchemaInnerAnyOf3)
		if string(jsonUsersIdentitySchemaInnerAnyOf3) == "{}" { // empty struct
			dst.UsersIdentitySchemaInnerAnyOf3 = nil
		} else {
			return nil // data stored in dst.UsersIdentitySchemaInnerAnyOf3, return on the first match
		}
	} else {
		dst.UsersIdentitySchemaInnerAnyOf3 = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(UsersIdentitySchemaInner)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *UsersIdentitySchemaInner) MarshalJSON() ([]byte, error) {
	if src.UsersIdentitySchemaInnerAnyOf != nil {
		return json.Marshal(&src.UsersIdentitySchemaInnerAnyOf)
	}

	if src.UsersIdentitySchemaInnerAnyOf1 != nil {
		return json.Marshal(&src.UsersIdentitySchemaInnerAnyOf1)
	}

	if src.UsersIdentitySchemaInnerAnyOf2 != nil {
		return json.Marshal(&src.UsersIdentitySchemaInnerAnyOf2)
	}

	if src.UsersIdentitySchemaInnerAnyOf3 != nil {
		return json.Marshal(&src.UsersIdentitySchemaInnerAnyOf3)
	}

	return nil, nil // no data in anyOf schemas
}

type NullableUsersIdentitySchemaInner struct {
	value *UsersIdentitySchemaInner
	isSet bool
}

func (v NullableUsersIdentitySchemaInner) Get() *UsersIdentitySchemaInner {
	return v.value
}

func (v *NullableUsersIdentitySchemaInner) Set(val *UsersIdentitySchemaInner) {
	v.value = val
	v.isSet = true
}

func (v NullableUsersIdentitySchemaInner) IsSet() bool {
	return v.isSet
}

func (v *NullableUsersIdentitySchemaInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUsersIdentitySchemaInner(val *UsersIdentitySchemaInner) *NullableUsersIdentitySchemaInner {
	return &NullableUsersIdentitySchemaInner{value: val, isSet: true}
}

func (v NullableUsersIdentitySchemaInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUsersIdentitySchemaInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


