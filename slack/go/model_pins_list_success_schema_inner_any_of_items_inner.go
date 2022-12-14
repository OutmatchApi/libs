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

// PinsListSuccessSchemaInnerAnyOfItemsInner struct for PinsListSuccessSchemaInnerAnyOfItemsInner
type PinsListSuccessSchemaInnerAnyOfItemsInner struct {
	FilePin *FilePin
	MessagePin *MessagePin
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *PinsListSuccessSchemaInnerAnyOfItemsInner) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into FilePin
	err = json.Unmarshal(data, &dst.FilePin);
	if err == nil {
		jsonFilePin, _ := json.Marshal(dst.FilePin)
		if string(jsonFilePin) == "{}" { // empty struct
			dst.FilePin = nil
		} else {
			return nil // data stored in dst.FilePin, return on the first match
		}
	} else {
		dst.FilePin = nil
	}

	// try to unmarshal JSON data into MessagePin
	err = json.Unmarshal(data, &dst.MessagePin);
	if err == nil {
		jsonMessagePin, _ := json.Marshal(dst.MessagePin)
		if string(jsonMessagePin) == "{}" { // empty struct
			dst.MessagePin = nil
		} else {
			return nil // data stored in dst.MessagePin, return on the first match
		}
	} else {
		dst.MessagePin = nil
	}

	return fmt.Errorf("data failed to match schemas in anyOf(PinsListSuccessSchemaInnerAnyOfItemsInner)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *PinsListSuccessSchemaInnerAnyOfItemsInner) MarshalJSON() ([]byte, error) {
	if src.FilePin != nil {
		return json.Marshal(&src.FilePin)
	}

	if src.MessagePin != nil {
		return json.Marshal(&src.MessagePin)
	}

	return nil, nil // no data in anyOf schemas
}

type NullablePinsListSuccessSchemaInnerAnyOfItemsInner struct {
	value *PinsListSuccessSchemaInnerAnyOfItemsInner
	isSet bool
}

func (v NullablePinsListSuccessSchemaInnerAnyOfItemsInner) Get() *PinsListSuccessSchemaInnerAnyOfItemsInner {
	return v.value
}

func (v *NullablePinsListSuccessSchemaInnerAnyOfItemsInner) Set(val *PinsListSuccessSchemaInnerAnyOfItemsInner) {
	v.value = val
	v.isSet = true
}

func (v NullablePinsListSuccessSchemaInnerAnyOfItemsInner) IsSet() bool {
	return v.isSet
}

func (v *NullablePinsListSuccessSchemaInnerAnyOfItemsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePinsListSuccessSchemaInnerAnyOfItemsInner(val *PinsListSuccessSchemaInnerAnyOfItemsInner) *NullablePinsListSuccessSchemaInnerAnyOfItemsInner {
	return &NullablePinsListSuccessSchemaInnerAnyOfItemsInner{value: val, isSet: true}
}

func (v NullablePinsListSuccessSchemaInnerAnyOfItemsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePinsListSuccessSchemaInnerAnyOfItemsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


