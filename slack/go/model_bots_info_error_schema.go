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

// BotsInfoErrorSchema Schema for error response from bots.info method
type BotsInfoErrorSchema struct {
	// Note: PHP callstack is only visible in dev/qa
	Callstack *string `json:"callstack,omitempty"`
	Error string `json:"error"`
	Ok DefsOkFalse `json:"ok"`
}

// NewBotsInfoErrorSchema instantiates a new BotsInfoErrorSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBotsInfoErrorSchema(error_ string, ok DefsOkFalse) *BotsInfoErrorSchema {
	this := BotsInfoErrorSchema{}
	this.Error = error_
	this.Ok = ok
	return &this
}

// NewBotsInfoErrorSchemaWithDefaults instantiates a new BotsInfoErrorSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBotsInfoErrorSchemaWithDefaults() *BotsInfoErrorSchema {
	this := BotsInfoErrorSchema{}
	return &this
}

// GetCallstack returns the Callstack field value if set, zero value otherwise.
func (o *BotsInfoErrorSchema) GetCallstack() string {
	if o == nil || isNil(o.Callstack) {
		var ret string
		return ret
	}
	return *o.Callstack
}

// GetCallstackOk returns a tuple with the Callstack field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *BotsInfoErrorSchema) GetCallstackOk() (*string, bool) {
	if o == nil || isNil(o.Callstack) {
    return nil, false
	}
	return o.Callstack, true
}

// HasCallstack returns a boolean if a field has been set.
func (o *BotsInfoErrorSchema) HasCallstack() bool {
	if o != nil && !isNil(o.Callstack) {
		return true
	}

	return false
}

// SetCallstack gets a reference to the given string and assigns it to the Callstack field.
func (o *BotsInfoErrorSchema) SetCallstack(v string) {
	o.Callstack = &v
}

// GetError returns the Error field value
func (o *BotsInfoErrorSchema) GetError() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Error
}

// GetErrorOk returns a tuple with the Error field value
// and a boolean to check if the value has been set.
func (o *BotsInfoErrorSchema) GetErrorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Error, true
}

// SetError sets field value
func (o *BotsInfoErrorSchema) SetError(v string) {
	o.Error = v
}

// GetOk returns the Ok field value
func (o *BotsInfoErrorSchema) GetOk() DefsOkFalse {
	if o == nil {
		var ret DefsOkFalse
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *BotsInfoErrorSchema) GetOkOk() (*DefsOkFalse, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *BotsInfoErrorSchema) SetOk(v DefsOkFalse) {
	o.Ok = v
}

func (o BotsInfoErrorSchema) MarshalJSON() ([]byte, error) {
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

type NullableBotsInfoErrorSchema struct {
	value *BotsInfoErrorSchema
	isSet bool
}

func (v NullableBotsInfoErrorSchema) Get() *BotsInfoErrorSchema {
	return v.value
}

func (v *NullableBotsInfoErrorSchema) Set(val *BotsInfoErrorSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableBotsInfoErrorSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableBotsInfoErrorSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBotsInfoErrorSchema(val *BotsInfoErrorSchema) *NullableBotsInfoErrorSchema {
	return &NullableBotsInfoErrorSchema{value: val, isSet: true}
}

func (v NullableBotsInfoErrorSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBotsInfoErrorSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

