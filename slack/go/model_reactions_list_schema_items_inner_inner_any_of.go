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

// ReactionsListSchemaItemsInnerInnerAnyOf struct for ReactionsListSchemaItemsInnerInnerAnyOf
type ReactionsListSchemaItemsInnerInnerAnyOf struct {
	Channel string `json:"channel"`
	Message ObjsMessage `json:"message"`
	Type string `json:"type"`
}

// NewReactionsListSchemaItemsInnerInnerAnyOf instantiates a new ReactionsListSchemaItemsInnerInnerAnyOf object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewReactionsListSchemaItemsInnerInnerAnyOf(channel string, message ObjsMessage, type_ string) *ReactionsListSchemaItemsInnerInnerAnyOf {
	this := ReactionsListSchemaItemsInnerInnerAnyOf{}
	this.Channel = channel
	this.Message = message
	this.Type = type_
	return &this
}

// NewReactionsListSchemaItemsInnerInnerAnyOfWithDefaults instantiates a new ReactionsListSchemaItemsInnerInnerAnyOf object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewReactionsListSchemaItemsInnerInnerAnyOfWithDefaults() *ReactionsListSchemaItemsInnerInnerAnyOf {
	this := ReactionsListSchemaItemsInnerInnerAnyOf{}
	return &this
}

// GetChannel returns the Channel field value
func (o *ReactionsListSchemaItemsInnerInnerAnyOf) GetChannel() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Channel
}

// GetChannelOk returns a tuple with the Channel field value
// and a boolean to check if the value has been set.
func (o *ReactionsListSchemaItemsInnerInnerAnyOf) GetChannelOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Channel, true
}

// SetChannel sets field value
func (o *ReactionsListSchemaItemsInnerInnerAnyOf) SetChannel(v string) {
	o.Channel = v
}

// GetMessage returns the Message field value
func (o *ReactionsListSchemaItemsInnerInnerAnyOf) GetMessage() ObjsMessage {
	if o == nil {
		var ret ObjsMessage
		return ret
	}

	return o.Message
}

// GetMessageOk returns a tuple with the Message field value
// and a boolean to check if the value has been set.
func (o *ReactionsListSchemaItemsInnerInnerAnyOf) GetMessageOk() (*ObjsMessage, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Message, true
}

// SetMessage sets field value
func (o *ReactionsListSchemaItemsInnerInnerAnyOf) SetMessage(v ObjsMessage) {
	o.Message = v
}

// GetType returns the Type field value
func (o *ReactionsListSchemaItemsInnerInnerAnyOf) GetType() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Type
}

// GetTypeOk returns a tuple with the Type field value
// and a boolean to check if the value has been set.
func (o *ReactionsListSchemaItemsInnerInnerAnyOf) GetTypeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Type, true
}

// SetType sets field value
func (o *ReactionsListSchemaItemsInnerInnerAnyOf) SetType(v string) {
	o.Type = v
}

func (o ReactionsListSchemaItemsInnerInnerAnyOf) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["channel"] = o.Channel
	}
	if true {
		toSerialize["message"] = o.Message
	}
	if true {
		toSerialize["type"] = o.Type
	}
	return json.Marshal(toSerialize)
}

type NullableReactionsListSchemaItemsInnerInnerAnyOf struct {
	value *ReactionsListSchemaItemsInnerInnerAnyOf
	isSet bool
}

func (v NullableReactionsListSchemaItemsInnerInnerAnyOf) Get() *ReactionsListSchemaItemsInnerInnerAnyOf {
	return v.value
}

func (v *NullableReactionsListSchemaItemsInnerInnerAnyOf) Set(val *ReactionsListSchemaItemsInnerInnerAnyOf) {
	v.value = val
	v.isSet = true
}

func (v NullableReactionsListSchemaItemsInnerInnerAnyOf) IsSet() bool {
	return v.isSet
}

func (v *NullableReactionsListSchemaItemsInnerInnerAnyOf) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableReactionsListSchemaItemsInnerInnerAnyOf(val *ReactionsListSchemaItemsInnerInnerAnyOf) *NullableReactionsListSchemaItemsInnerInnerAnyOf {
	return &NullableReactionsListSchemaItemsInnerInnerAnyOf{value: val, isSet: true}
}

func (v NullableReactionsListSchemaItemsInnerInnerAnyOf) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableReactionsListSchemaItemsInnerInnerAnyOf) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


