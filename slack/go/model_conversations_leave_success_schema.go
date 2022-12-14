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

// ConversationsLeaveSuccessSchema Schema for successful response from conversations.leave method
type ConversationsLeaveSuccessSchema struct {
	NotInChannel *bool `json:"not_in_channel,omitempty"`
	Ok DefsOkTrue `json:"ok"`
}

// NewConversationsLeaveSuccessSchema instantiates a new ConversationsLeaveSuccessSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConversationsLeaveSuccessSchema(ok DefsOkTrue) *ConversationsLeaveSuccessSchema {
	this := ConversationsLeaveSuccessSchema{}
	this.Ok = ok
	return &this
}

// NewConversationsLeaveSuccessSchemaWithDefaults instantiates a new ConversationsLeaveSuccessSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConversationsLeaveSuccessSchemaWithDefaults() *ConversationsLeaveSuccessSchema {
	this := ConversationsLeaveSuccessSchema{}
	return &this
}

// GetNotInChannel returns the NotInChannel field value if set, zero value otherwise.
func (o *ConversationsLeaveSuccessSchema) GetNotInChannel() bool {
	if o == nil || isNil(o.NotInChannel) {
		var ret bool
		return ret
	}
	return *o.NotInChannel
}

// GetNotInChannelOk returns a tuple with the NotInChannel field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsLeaveSuccessSchema) GetNotInChannelOk() (*bool, bool) {
	if o == nil || isNil(o.NotInChannel) {
    return nil, false
	}
	return o.NotInChannel, true
}

// HasNotInChannel returns a boolean if a field has been set.
func (o *ConversationsLeaveSuccessSchema) HasNotInChannel() bool {
	if o != nil && !isNil(o.NotInChannel) {
		return true
	}

	return false
}

// SetNotInChannel gets a reference to the given bool and assigns it to the NotInChannel field.
func (o *ConversationsLeaveSuccessSchema) SetNotInChannel(v bool) {
	o.NotInChannel = &v
}

// GetOk returns the Ok field value
func (o *ConversationsLeaveSuccessSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ConversationsLeaveSuccessSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ConversationsLeaveSuccessSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

func (o ConversationsLeaveSuccessSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.NotInChannel) {
		toSerialize["not_in_channel"] = o.NotInChannel
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableConversationsLeaveSuccessSchema struct {
	value *ConversationsLeaveSuccessSchema
	isSet bool
}

func (v NullableConversationsLeaveSuccessSchema) Get() *ConversationsLeaveSuccessSchema {
	return v.value
}

func (v *NullableConversationsLeaveSuccessSchema) Set(val *ConversationsLeaveSuccessSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableConversationsLeaveSuccessSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableConversationsLeaveSuccessSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConversationsLeaveSuccessSchema(val *ConversationsLeaveSuccessSchema) *NullableConversationsLeaveSuccessSchema {
	return &NullableConversationsLeaveSuccessSchema{value: val, isSet: true}
}

func (v NullableConversationsLeaveSuccessSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConversationsLeaveSuccessSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


