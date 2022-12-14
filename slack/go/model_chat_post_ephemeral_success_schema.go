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

// ChatPostEphemeralSuccessSchema Schema for successful response from chat.postEphemeral method
type ChatPostEphemeralSuccessSchema struct {
	MessageTs string `json:"message_ts"`
	Ok DefsOkTrue `json:"ok"`
}

// NewChatPostEphemeralSuccessSchema instantiates a new ChatPostEphemeralSuccessSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewChatPostEphemeralSuccessSchema(messageTs string, ok DefsOkTrue) *ChatPostEphemeralSuccessSchema {
	this := ChatPostEphemeralSuccessSchema{}
	this.MessageTs = messageTs
	this.Ok = ok
	return &this
}

// NewChatPostEphemeralSuccessSchemaWithDefaults instantiates a new ChatPostEphemeralSuccessSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewChatPostEphemeralSuccessSchemaWithDefaults() *ChatPostEphemeralSuccessSchema {
	this := ChatPostEphemeralSuccessSchema{}
	return &this
}

// GetMessageTs returns the MessageTs field value
func (o *ChatPostEphemeralSuccessSchema) GetMessageTs() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.MessageTs
}

// GetMessageTsOk returns a tuple with the MessageTs field value
// and a boolean to check if the value has been set.
func (o *ChatPostEphemeralSuccessSchema) GetMessageTsOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.MessageTs, true
}

// SetMessageTs sets field value
func (o *ChatPostEphemeralSuccessSchema) SetMessageTs(v string) {
	o.MessageTs = v
}

// GetOk returns the Ok field value
func (o *ChatPostEphemeralSuccessSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ChatPostEphemeralSuccessSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ChatPostEphemeralSuccessSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

func (o ChatPostEphemeralSuccessSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["message_ts"] = o.MessageTs
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableChatPostEphemeralSuccessSchema struct {
	value *ChatPostEphemeralSuccessSchema
	isSet bool
}

func (v NullableChatPostEphemeralSuccessSchema) Get() *ChatPostEphemeralSuccessSchema {
	return v.value
}

func (v *NullableChatPostEphemeralSuccessSchema) Set(val *ChatPostEphemeralSuccessSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableChatPostEphemeralSuccessSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableChatPostEphemeralSuccessSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChatPostEphemeralSuccessSchema(val *ChatPostEphemeralSuccessSchema) *NullableChatPostEphemeralSuccessSchema {
	return &NullableChatPostEphemeralSuccessSchema{value: val, isSet: true}
}

func (v NullableChatPostEphemeralSuccessSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChatPostEphemeralSuccessSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


