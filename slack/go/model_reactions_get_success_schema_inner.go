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

// ReactionsGetSuccessSchemaInner struct for ReactionsGetSuccessSchemaInner
type ReactionsGetSuccessSchemaInner struct {
	ReactionsGetSuccessSchemaInnerAnyOf *ReactionsGetSuccessSchemaInnerAnyOf
	ReactionsGetSuccessSchemaInnerAnyOf1 *ReactionsGetSuccessSchemaInnerAnyOf1
	ReactionsGetSuccessSchemaInnerAnyOf2 *ReactionsGetSuccessSchemaInnerAnyOf2
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *ReactionsGetSuccessSchemaInner) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into ReactionsGetSuccessSchemaInnerAnyOf
	err = json.Unmarshal(data, &dst.ReactionsGetSuccessSchemaInnerAnyOf);
	if err == nil {
		jsonReactionsGetSuccessSchemaInnerAnyOf, _ := json.Marshal(dst.ReactionsGetSuccessSchemaInnerAnyOf)
		if string(jsonReactionsGetSuccessSchemaInnerAnyOf) == "{}" { // empty struct
			dst.ReactionsGetSuccessSchemaInnerAnyOf = nil
		} else {
			return nil // data stored in dst.ReactionsGetSuccessSchemaInnerAnyOf, return on the first match
		}
	} else {
		dst.ReactionsGetSuccessSchemaInnerAnyOf = nil
	}

	// try to unmarshal JSON data into ReactionsGetSuccessSchemaInnerAnyOf1
	err = json.Unmarshal(data, &dst.ReactionsGetSuccessSchemaInnerAnyOf1);
	if err == nil {
		jsonReactionsGetSuccessSchemaInnerAnyOf1, _ := json.Marshal(dst.ReactionsGetSuccessSchemaInnerAnyOf1)
		if string(jsonReactionsGetSuccessSchemaInnerAnyOf1) == "{}" { // empty struct
			dst.ReactionsGetSuccessSchemaInnerAnyOf1 = nil
		} else {
			return nil // data stored in dst.ReactionsGetSuccessSchemaInnerAnyOf1, return on the first match
		}
	} else {
		dst.ReactionsGetSuccessSchemaInnerAnyOf1 = nil
	}

	// try to unmarshal JSON data into ReactionsGetSuccessSchemaInnerAnyOf2
	err = json.Unmarshal(data, &dst.ReactionsGetSuccessSchemaInnerAnyOf2);
	if err == nil {
		jsonReactionsGetSuccessSchemaInnerAnyOf2, _ := json.Marshal(dst.ReactionsGetSuccessSchemaInnerAnyOf2)
		if string(jsonReactionsGetSuccessSchemaInnerAnyOf2) == "{}" { // empty struct
			dst.ReactionsGetSuccessSchemaInnerAnyOf2 = nil
		} else {
			return nil // data stored in dst.ReactionsGetSuccessSchemaInnerAnyOf2, return on the first match
		}
	} else {
		dst.ReactionsGetSuccessSchemaInnerAnyOf2 = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(ReactionsGetSuccessSchemaInner)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *ReactionsGetSuccessSchemaInner) MarshalJSON() ([]byte, error) {
	if src.ReactionsGetSuccessSchemaInnerAnyOf != nil {
		return json.Marshal(&src.ReactionsGetSuccessSchemaInnerAnyOf)
	}

	if src.ReactionsGetSuccessSchemaInnerAnyOf1 != nil {
		return json.Marshal(&src.ReactionsGetSuccessSchemaInnerAnyOf1)
	}

	if src.ReactionsGetSuccessSchemaInnerAnyOf2 != nil {
		return json.Marshal(&src.ReactionsGetSuccessSchemaInnerAnyOf2)
	}

	return nil, nil // no data in anyOf schemas
}

type NullableReactionsGetSuccessSchemaInner struct {
	value *ReactionsGetSuccessSchemaInner
	isSet bool
}

func (v NullableReactionsGetSuccessSchemaInner) Get() *ReactionsGetSuccessSchemaInner {
	return v.value
}

func (v *NullableReactionsGetSuccessSchemaInner) Set(val *ReactionsGetSuccessSchemaInner) {
	v.value = val
	v.isSet = true
}

func (v NullableReactionsGetSuccessSchemaInner) IsSet() bool {
	return v.isSet
}

func (v *NullableReactionsGetSuccessSchemaInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableReactionsGetSuccessSchemaInner(val *ReactionsGetSuccessSchemaInner) *NullableReactionsGetSuccessSchemaInner {
	return &NullableReactionsGetSuccessSchemaInner{value: val, isSet: true}
}

func (v NullableReactionsGetSuccessSchemaInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableReactionsGetSuccessSchemaInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

