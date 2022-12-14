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

// ReactionsListSchemaItemsInnerInner struct for ReactionsListSchemaItemsInnerInner
type ReactionsListSchemaItemsInnerInner struct {
	ReactionsListSchemaItemsInnerInnerAnyOf *ReactionsListSchemaItemsInnerInnerAnyOf
	ReactionsListSchemaItemsInnerInnerAnyOf1 *ReactionsListSchemaItemsInnerInnerAnyOf1
	ReactionsListSchemaItemsInnerInnerAnyOf2 *ReactionsListSchemaItemsInnerInnerAnyOf2
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *ReactionsListSchemaItemsInnerInner) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into ReactionsListSchemaItemsInnerInnerAnyOf
	err = json.Unmarshal(data, &dst.ReactionsListSchemaItemsInnerInnerAnyOf);
	if err == nil {
		jsonReactionsListSchemaItemsInnerInnerAnyOf, _ := json.Marshal(dst.ReactionsListSchemaItemsInnerInnerAnyOf)
		if string(jsonReactionsListSchemaItemsInnerInnerAnyOf) == "{}" { // empty struct
			dst.ReactionsListSchemaItemsInnerInnerAnyOf = nil
		} else {
			return nil // data stored in dst.ReactionsListSchemaItemsInnerInnerAnyOf, return on the first match
		}
	} else {
		dst.ReactionsListSchemaItemsInnerInnerAnyOf = nil
	}

	// try to unmarshal JSON data into ReactionsListSchemaItemsInnerInnerAnyOf1
	err = json.Unmarshal(data, &dst.ReactionsListSchemaItemsInnerInnerAnyOf1);
	if err == nil {
		jsonReactionsListSchemaItemsInnerInnerAnyOf1, _ := json.Marshal(dst.ReactionsListSchemaItemsInnerInnerAnyOf1)
		if string(jsonReactionsListSchemaItemsInnerInnerAnyOf1) == "{}" { // empty struct
			dst.ReactionsListSchemaItemsInnerInnerAnyOf1 = nil
		} else {
			return nil // data stored in dst.ReactionsListSchemaItemsInnerInnerAnyOf1, return on the first match
		}
	} else {
		dst.ReactionsListSchemaItemsInnerInnerAnyOf1 = nil
	}

	// try to unmarshal JSON data into ReactionsListSchemaItemsInnerInnerAnyOf2
	err = json.Unmarshal(data, &dst.ReactionsListSchemaItemsInnerInnerAnyOf2);
	if err == nil {
		jsonReactionsListSchemaItemsInnerInnerAnyOf2, _ := json.Marshal(dst.ReactionsListSchemaItemsInnerInnerAnyOf2)
		if string(jsonReactionsListSchemaItemsInnerInnerAnyOf2) == "{}" { // empty struct
			dst.ReactionsListSchemaItemsInnerInnerAnyOf2 = nil
		} else {
			return nil // data stored in dst.ReactionsListSchemaItemsInnerInnerAnyOf2, return on the first match
		}
	} else {
		dst.ReactionsListSchemaItemsInnerInnerAnyOf2 = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(ReactionsListSchemaItemsInnerInner)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *ReactionsListSchemaItemsInnerInner) MarshalJSON() ([]byte, error) {
	if src.ReactionsListSchemaItemsInnerInnerAnyOf != nil {
		return json.Marshal(&src.ReactionsListSchemaItemsInnerInnerAnyOf)
	}

	if src.ReactionsListSchemaItemsInnerInnerAnyOf1 != nil {
		return json.Marshal(&src.ReactionsListSchemaItemsInnerInnerAnyOf1)
	}

	if src.ReactionsListSchemaItemsInnerInnerAnyOf2 != nil {
		return json.Marshal(&src.ReactionsListSchemaItemsInnerInnerAnyOf2)
	}

	return nil, nil // no data in anyOf schemas
}

type NullableReactionsListSchemaItemsInnerInner struct {
	value *ReactionsListSchemaItemsInnerInner
	isSet bool
}

func (v NullableReactionsListSchemaItemsInnerInner) Get() *ReactionsListSchemaItemsInnerInner {
	return v.value
}

func (v *NullableReactionsListSchemaItemsInnerInner) Set(val *ReactionsListSchemaItemsInnerInner) {
	v.value = val
	v.isSet = true
}

func (v NullableReactionsListSchemaItemsInnerInner) IsSet() bool {
	return v.isSet
}

func (v *NullableReactionsListSchemaItemsInnerInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableReactionsListSchemaItemsInnerInner(val *ReactionsListSchemaItemsInnerInner) *NullableReactionsListSchemaItemsInnerInner {
	return &NullableReactionsListSchemaItemsInnerInner{value: val, isSet: true}
}

func (v NullableReactionsListSchemaItemsInnerInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableReactionsListSchemaItemsInnerInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


