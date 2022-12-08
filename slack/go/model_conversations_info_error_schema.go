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

// ConversationsInfoErrorSchema Schema for error response from conversations.info method
type ConversationsInfoErrorSchema struct {
	// Note: PHP callstack is only visible in dev/qa
	Callstack *string `json:"callstack,omitempty"`
	Error string `json:"error"`
	Needed *string `json:"needed,omitempty"`
	Ok DefsOkFalse `json:"ok"`
	Provided *string `json:"provided,omitempty"`
}

// NewConversationsInfoErrorSchema instantiates a new ConversationsInfoErrorSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConversationsInfoErrorSchema(error_ string, ok DefsOkFalse) *ConversationsInfoErrorSchema {
	this := ConversationsInfoErrorSchema{}
	this.Error = error_
	this.Ok = ok
	return &this
}

// NewConversationsInfoErrorSchemaWithDefaults instantiates a new ConversationsInfoErrorSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConversationsInfoErrorSchemaWithDefaults() *ConversationsInfoErrorSchema {
	this := ConversationsInfoErrorSchema{}
	return &this
}

// GetCallstack returns the Callstack field value if set, zero value otherwise.
func (o *ConversationsInfoErrorSchema) GetCallstack() string {
	if o == nil || isNil(o.Callstack) {
		var ret string
		return ret
	}
	return *o.Callstack
}

// GetCallstackOk returns a tuple with the Callstack field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsInfoErrorSchema) GetCallstackOk() (*string, bool) {
	if o == nil || isNil(o.Callstack) {
    return nil, false
	}
	return o.Callstack, true
}

// HasCallstack returns a boolean if a field has been set.
func (o *ConversationsInfoErrorSchema) HasCallstack() bool {
	if o != nil && !isNil(o.Callstack) {
		return true
	}

	return false
}

// SetCallstack gets a reference to the given string and assigns it to the Callstack field.
func (o *ConversationsInfoErrorSchema) SetCallstack(v string) {
	o.Callstack = &v
}

// GetError returns the Error field value
func (o *ConversationsInfoErrorSchema) GetError() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Error
}

// GetErrorOk returns a tuple with the Error field value
// and a boolean to check if the value has been set.
func (o *ConversationsInfoErrorSchema) GetErrorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Error, true
}

// SetError sets field value
func (o *ConversationsInfoErrorSchema) SetError(v string) {
	o.Error = v
}

// GetNeeded returns the Needed field value if set, zero value otherwise.
func (o *ConversationsInfoErrorSchema) GetNeeded() string {
	if o == nil || isNil(o.Needed) {
		var ret string
		return ret
	}
	return *o.Needed
}

// GetNeededOk returns a tuple with the Needed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsInfoErrorSchema) GetNeededOk() (*string, bool) {
	if o == nil || isNil(o.Needed) {
    return nil, false
	}
	return o.Needed, true
}

// HasNeeded returns a boolean if a field has been set.
func (o *ConversationsInfoErrorSchema) HasNeeded() bool {
	if o != nil && !isNil(o.Needed) {
		return true
	}

	return false
}

// SetNeeded gets a reference to the given string and assigns it to the Needed field.
func (o *ConversationsInfoErrorSchema) SetNeeded(v string) {
	o.Needed = &v
}

// GetOk returns the Ok field value
func (o *ConversationsInfoErrorSchema) GetOk() DefsOkFalse {
	if o == nil {
		var ret DefsOkFalse
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ConversationsInfoErrorSchema) GetOkOk() (*DefsOkFalse, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ConversationsInfoErrorSchema) SetOk(v DefsOkFalse) {
	o.Ok = v
}

// GetProvided returns the Provided field value if set, zero value otherwise.
func (o *ConversationsInfoErrorSchema) GetProvided() string {
	if o == nil || isNil(o.Provided) {
		var ret string
		return ret
	}
	return *o.Provided
}

// GetProvidedOk returns a tuple with the Provided field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsInfoErrorSchema) GetProvidedOk() (*string, bool) {
	if o == nil || isNil(o.Provided) {
    return nil, false
	}
	return o.Provided, true
}

// HasProvided returns a boolean if a field has been set.
func (o *ConversationsInfoErrorSchema) HasProvided() bool {
	if o != nil && !isNil(o.Provided) {
		return true
	}

	return false
}

// SetProvided gets a reference to the given string and assigns it to the Provided field.
func (o *ConversationsInfoErrorSchema) SetProvided(v string) {
	o.Provided = &v
}

func (o ConversationsInfoErrorSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Callstack) {
		toSerialize["callstack"] = o.Callstack
	}
	if true {
		toSerialize["error"] = o.Error
	}
	if !isNil(o.Needed) {
		toSerialize["needed"] = o.Needed
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if !isNil(o.Provided) {
		toSerialize["provided"] = o.Provided
	}
	return json.Marshal(toSerialize)
}

type NullableConversationsInfoErrorSchema struct {
	value *ConversationsInfoErrorSchema
	isSet bool
}

func (v NullableConversationsInfoErrorSchema) Get() *ConversationsInfoErrorSchema {
	return v.value
}

func (v *NullableConversationsInfoErrorSchema) Set(val *ConversationsInfoErrorSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableConversationsInfoErrorSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableConversationsInfoErrorSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConversationsInfoErrorSchema(val *ConversationsInfoErrorSchema) *NullableConversationsInfoErrorSchema {
	return &NullableConversationsInfoErrorSchema{value: val, isSet: true}
}

func (v NullableConversationsInfoErrorSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConversationsInfoErrorSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

