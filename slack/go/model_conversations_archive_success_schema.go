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

// ConversationsArchiveSuccessSchema Schema for successful response conversations.archive method
type ConversationsArchiveSuccessSchema struct {
	Ok DefsOkTrue `json:"ok"`
}

// NewConversationsArchiveSuccessSchema instantiates a new ConversationsArchiveSuccessSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConversationsArchiveSuccessSchema(ok DefsOkTrue) *ConversationsArchiveSuccessSchema {
	this := ConversationsArchiveSuccessSchema{}
	this.Ok = ok
	return &this
}

// NewConversationsArchiveSuccessSchemaWithDefaults instantiates a new ConversationsArchiveSuccessSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConversationsArchiveSuccessSchemaWithDefaults() *ConversationsArchiveSuccessSchema {
	this := ConversationsArchiveSuccessSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *ConversationsArchiveSuccessSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ConversationsArchiveSuccessSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ConversationsArchiveSuccessSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

func (o ConversationsArchiveSuccessSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableConversationsArchiveSuccessSchema struct {
	value *ConversationsArchiveSuccessSchema
	isSet bool
}

func (v NullableConversationsArchiveSuccessSchema) Get() *ConversationsArchiveSuccessSchema {
	return v.value
}

func (v *NullableConversationsArchiveSuccessSchema) Set(val *ConversationsArchiveSuccessSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableConversationsArchiveSuccessSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableConversationsArchiveSuccessSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConversationsArchiveSuccessSchema(val *ConversationsArchiveSuccessSchema) *NullableConversationsArchiveSuccessSchema {
	return &NullableConversationsArchiveSuccessSchema{value: val, isSet: true}
}

func (v NullableConversationsArchiveSuccessSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConversationsArchiveSuccessSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


