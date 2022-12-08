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

// ChatDeleteScheduledMessageSchema Schema for successful response from chat.deleteScheduledMessage method
type ChatDeleteScheduledMessageSchema struct {
	Ok DefsOkTrue `json:"ok"`
}

// NewChatDeleteScheduledMessageSchema instantiates a new ChatDeleteScheduledMessageSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewChatDeleteScheduledMessageSchema(ok DefsOkTrue) *ChatDeleteScheduledMessageSchema {
	this := ChatDeleteScheduledMessageSchema{}
	this.Ok = ok
	return &this
}

// NewChatDeleteScheduledMessageSchemaWithDefaults instantiates a new ChatDeleteScheduledMessageSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewChatDeleteScheduledMessageSchemaWithDefaults() *ChatDeleteScheduledMessageSchema {
	this := ChatDeleteScheduledMessageSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *ChatDeleteScheduledMessageSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ChatDeleteScheduledMessageSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ChatDeleteScheduledMessageSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

func (o ChatDeleteScheduledMessageSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableChatDeleteScheduledMessageSchema struct {
	value *ChatDeleteScheduledMessageSchema
	isSet bool
}

func (v NullableChatDeleteScheduledMessageSchema) Get() *ChatDeleteScheduledMessageSchema {
	return v.value
}

func (v *NullableChatDeleteScheduledMessageSchema) Set(val *ChatDeleteScheduledMessageSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableChatDeleteScheduledMessageSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableChatDeleteScheduledMessageSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChatDeleteScheduledMessageSchema(val *ChatDeleteScheduledMessageSchema) *NullableChatDeleteScheduledMessageSchema {
	return &NullableChatDeleteScheduledMessageSchema{value: val, isSet: true}
}

func (v NullableChatDeleteScheduledMessageSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChatDeleteScheduledMessageSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


