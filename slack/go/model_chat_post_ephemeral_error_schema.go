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

// ChatPostEphemeralErrorSchema Schema for error response from chat.postEphemeral method
type ChatPostEphemeralErrorSchema struct {
	// Note: PHP callstack is only visible in dev/qa
	Callstack *string `json:"callstack,omitempty"`
	Error string `json:"error"`
	Ok DefsOkFalse `json:"ok"`
}

// NewChatPostEphemeralErrorSchema instantiates a new ChatPostEphemeralErrorSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewChatPostEphemeralErrorSchema(error_ string, ok DefsOkFalse) *ChatPostEphemeralErrorSchema {
	this := ChatPostEphemeralErrorSchema{}
	this.Error = error_
	this.Ok = ok
	return &this
}

// NewChatPostEphemeralErrorSchemaWithDefaults instantiates a new ChatPostEphemeralErrorSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewChatPostEphemeralErrorSchemaWithDefaults() *ChatPostEphemeralErrorSchema {
	this := ChatPostEphemeralErrorSchema{}
	return &this
}

// GetCallstack returns the Callstack field value if set, zero value otherwise.
func (o *ChatPostEphemeralErrorSchema) GetCallstack() string {
	if o == nil || isNil(o.Callstack) {
		var ret string
		return ret
	}
	return *o.Callstack
}

// GetCallstackOk returns a tuple with the Callstack field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ChatPostEphemeralErrorSchema) GetCallstackOk() (*string, bool) {
	if o == nil || isNil(o.Callstack) {
    return nil, false
	}
	return o.Callstack, true
}

// HasCallstack returns a boolean if a field has been set.
func (o *ChatPostEphemeralErrorSchema) HasCallstack() bool {
	if o != nil && !isNil(o.Callstack) {
		return true
	}

	return false
}

// SetCallstack gets a reference to the given string and assigns it to the Callstack field.
func (o *ChatPostEphemeralErrorSchema) SetCallstack(v string) {
	o.Callstack = &v
}

// GetError returns the Error field value
func (o *ChatPostEphemeralErrorSchema) GetError() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Error
}

// GetErrorOk returns a tuple with the Error field value
// and a boolean to check if the value has been set.
func (o *ChatPostEphemeralErrorSchema) GetErrorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Error, true
}

// SetError sets field value
func (o *ChatPostEphemeralErrorSchema) SetError(v string) {
	o.Error = v
}

// GetOk returns the Ok field value
func (o *ChatPostEphemeralErrorSchema) GetOk() DefsOkFalse {
	if o == nil {
		var ret DefsOkFalse
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ChatPostEphemeralErrorSchema) GetOkOk() (*DefsOkFalse, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ChatPostEphemeralErrorSchema) SetOk(v DefsOkFalse) {
	o.Ok = v
}

func (o ChatPostEphemeralErrorSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Callstack) {
		toSerialize["callstack"] = o.Callstack
	}
	if true {
		toSerialize["error"] = o.Error
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableChatPostEphemeralErrorSchema struct {
	value *ChatPostEphemeralErrorSchema
	isSet bool
}

func (v NullableChatPostEphemeralErrorSchema) Get() *ChatPostEphemeralErrorSchema {
	return v.value
}

func (v *NullableChatPostEphemeralErrorSchema) Set(val *ChatPostEphemeralErrorSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableChatPostEphemeralErrorSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableChatPostEphemeralErrorSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChatPostEphemeralErrorSchema(val *ChatPostEphemeralErrorSchema) *NullableChatPostEphemeralErrorSchema {
	return &NullableChatPostEphemeralErrorSchema{value: val, isSet: true}
}

func (v NullableChatPostEphemeralErrorSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChatPostEphemeralErrorSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


