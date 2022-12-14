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

// BotsInfoSchema Schema for successful response from bots.info method
type BotsInfoSchema struct {
	Bot BotsInfoSchemaBot `json:"bot"`
	Ok DefsOkTrue `json:"ok"`
}

// NewBotsInfoSchema instantiates a new BotsInfoSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBotsInfoSchema(bot BotsInfoSchemaBot, ok DefsOkTrue) *BotsInfoSchema {
	this := BotsInfoSchema{}
	this.Bot = bot
	this.Ok = ok
	return &this
}

// NewBotsInfoSchemaWithDefaults instantiates a new BotsInfoSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBotsInfoSchemaWithDefaults() *BotsInfoSchema {
	this := BotsInfoSchema{}
	return &this
}

// GetBot returns the Bot field value
func (o *BotsInfoSchema) GetBot() BotsInfoSchemaBot {
	if o == nil {
		var ret BotsInfoSchemaBot
		return ret
	}

	return o.Bot
}

// GetBotOk returns a tuple with the Bot field value
// and a boolean to check if the value has been set.
func (o *BotsInfoSchema) GetBotOk() (*BotsInfoSchemaBot, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Bot, true
}

// SetBot sets field value
func (o *BotsInfoSchema) SetBot(v BotsInfoSchemaBot) {
	o.Bot = v
}

// GetOk returns the Ok field value
func (o *BotsInfoSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *BotsInfoSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *BotsInfoSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

func (o BotsInfoSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["bot"] = o.Bot
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableBotsInfoSchema struct {
	value *BotsInfoSchema
	isSet bool
}

func (v NullableBotsInfoSchema) Get() *BotsInfoSchema {
	return v.value
}

func (v *NullableBotsInfoSchema) Set(val *BotsInfoSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableBotsInfoSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableBotsInfoSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBotsInfoSchema(val *BotsInfoSchema) *NullableBotsInfoSchema {
	return &NullableBotsInfoSchema{value: val, isSet: true}
}

func (v NullableBotsInfoSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBotsInfoSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


