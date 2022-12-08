/*
Slack Web API

One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

API version: 1.7.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package slack

import (
	"encoding/json"
)

// BlocksInner struct for BlocksInner
type BlocksInner struct {
	Type string `json:"type"`
	AdditionalProperties map[string]interface{}
}

type _BlocksInner BlocksInner

// NewBlocksInner instantiates a new BlocksInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBlocksInner(type_ string) *BlocksInner {
	this := BlocksInner{}
	this.Type = type_
	return &this
}

// NewBlocksInnerWithDefaults instantiates a new BlocksInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBlocksInnerWithDefaults() *BlocksInner {
	this := BlocksInner{}
	return &this
}

// GetType returns the Type field value
func (o *BlocksInner) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *BlocksInner) GetTypeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *BlocksInner) SetType(v string) {
	o.Type = v
}

func (o BlocksInner) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["type"] = o.Type
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *BlocksInner) UnmarshalJSON(bytes []byte) (err error) {
	varBlocksInner := _BlocksInner{}

	if err = json.Unmarshal(bytes, &varBlocksInner); err == nil {
		*o = BlocksInner(varBlocksInner)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "type")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableBlocksInner struct {
	value *BlocksInner
	isSet bool
}

func (v NullableBlocksInner) Get() *BlocksInner {
	return v.value
}

func (v *NullableBlocksInner) Set(val *BlocksInner) {
	v.value = val
	v.isSet = true
}

func (v NullableBlocksInner) IsSet() bool {
	return v.isSet
}

func (v *NullableBlocksInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBlocksInner(val *BlocksInner) *NullableBlocksInner {
	return &NullableBlocksInner{value: val, isSet: true}
}

func (v NullableBlocksInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBlocksInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


