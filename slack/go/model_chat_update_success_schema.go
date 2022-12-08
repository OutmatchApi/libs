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

// ChatUpdateSuccessSchema Schema for successful response of chat.update method
type ChatUpdateSuccessSchema struct {
	Channel string `json:"channel"`
	Message MessageObject `json:"message"`
	Ok DefsOkTrue `json:"ok"`
	Text string `json:"text"`
	Ts string `json:"ts"`
}

// NewChatUpdateSuccessSchema instantiates a new ChatUpdateSuccessSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewChatUpdateSuccessSchema(channel string, message MessageObject, ok DefsOkTrue, text string, ts string) *ChatUpdateSuccessSchema {
	this := ChatUpdateSuccessSchema{}
	this.Channel = channel
	this.Message = message
	this.Ok = ok
	this.Text = text
	this.Ts = ts
	return &this
}

// NewChatUpdateSuccessSchemaWithDefaults instantiates a new ChatUpdateSuccessSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewChatUpdateSuccessSchemaWithDefaults() *ChatUpdateSuccessSchema {
	this := ChatUpdateSuccessSchema{}
	return &this
}

// GetChannel returns the Channel field value
func (o *ChatUpdateSuccessSchema) GetChannel() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Channel
}

// GetChannelOk returns a tuple with the Channel field value
// and a boolean to check if the value has been set.
func (o *ChatUpdateSuccessSchema) GetChannelOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Channel, true
}

// SetChannel sets field value
func (o *ChatUpdateSuccessSchema) SetChannel(v string) {
	o.Channel = v
}

// GetMessage returns the Message field value
func (o *ChatUpdateSuccessSchema) GetMessage() MessageObject {
	if o == nil {
		var ret MessageObject
		return ret
	}

	return o.Message
}

// GetMessageOk returns a tuple with the Message field value
// and a boolean to check if the value has been set.
func (o *ChatUpdateSuccessSchema) GetMessageOk() (*MessageObject, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Message, true
}

// SetMessage sets field value
func (o *ChatUpdateSuccessSchema) SetMessage(v MessageObject) {
	o.Message = v
}

// GetOk returns the Ok field value
func (o *ChatUpdateSuccessSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ChatUpdateSuccessSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ChatUpdateSuccessSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetText returns the Text field value
func (o *ChatUpdateSuccessSchema) GetText() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Text
}

// GetTextOk returns a tuple with the Text field value
// and a boolean to check if the value has been set.
func (o *ChatUpdateSuccessSchema) GetTextOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Text, true
}

// SetText sets field value
func (o *ChatUpdateSuccessSchema) SetText(v string) {
	o.Text = v
}

// GetTs returns the Ts field value
func (o *ChatUpdateSuccessSchema) GetTs() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Ts
}

// GetTsOk returns a tuple with the Ts field value
// and a boolean to check if the value has been set.
func (o *ChatUpdateSuccessSchema) GetTsOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ts, true
}

// SetTs sets field value
func (o *ChatUpdateSuccessSchema) SetTs(v string) {
	o.Ts = v
}

func (o ChatUpdateSuccessSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["channel"] = o.Channel
	}
	if true {
		toSerialize["message"] = o.Message
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["text"] = o.Text
	}
	if true {
		toSerialize["ts"] = o.Ts
	}
	return json.Marshal(toSerialize)
}

type NullableChatUpdateSuccessSchema struct {
	value *ChatUpdateSuccessSchema
	isSet bool
}

func (v NullableChatUpdateSuccessSchema) Get() *ChatUpdateSuccessSchema {
	return v.value
}

func (v *NullableChatUpdateSuccessSchema) Set(val *ChatUpdateSuccessSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableChatUpdateSuccessSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableChatUpdateSuccessSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChatUpdateSuccessSchema(val *ChatUpdateSuccessSchema) *NullableChatUpdateSuccessSchema {
	return &NullableChatUpdateSuccessSchema{value: val, isSet: true}
}

func (v NullableChatUpdateSuccessSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChatUpdateSuccessSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


