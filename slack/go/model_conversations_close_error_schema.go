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

// ConversationsCloseErrorSchema Schema for error response from conversations.close method
type ConversationsCloseErrorSchema struct {
	// Note: PHP callstack is only visible in dev/qa
	Callstack *string `json:"callstack,omitempty"`
	Error string `json:"error"`
	Needed *string `json:"needed,omitempty"`
	Ok DefsOkFalse `json:"ok"`
	Provided *string `json:"provided,omitempty"`
}

// NewConversationsCloseErrorSchema instantiates a new ConversationsCloseErrorSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConversationsCloseErrorSchema(error_ string, ok DefsOkFalse) *ConversationsCloseErrorSchema {
	this := ConversationsCloseErrorSchema{}
	this.Error = error_
	this.Ok = ok
	return &this
}

// NewConversationsCloseErrorSchemaWithDefaults instantiates a new ConversationsCloseErrorSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConversationsCloseErrorSchemaWithDefaults() *ConversationsCloseErrorSchema {
	this := ConversationsCloseErrorSchema{}
	return &this
}

// GetCallstack returns the Callstack field value if set, zero value otherwise.
func (o *ConversationsCloseErrorSchema) GetCallstack() string {
	if o == nil || isNil(o.Callstack) {
		var ret string
		return ret
	}
	return *o.Callstack
}

// GetCallstackOk returns a tuple with the Callstack field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsCloseErrorSchema) GetCallstackOk() (*string, bool) {
	if o == nil || isNil(o.Callstack) {
    return nil, false
	}
	return o.Callstack, true
}

// HasCallstack returns a boolean if a field has been set.
func (o *ConversationsCloseErrorSchema) HasCallstack() bool {
	if o != nil && !isNil(o.Callstack) {
		return true
	}

	return false
}

// SetCallstack gets a reference to the given string and assigns it to the Callstack field.
func (o *ConversationsCloseErrorSchema) SetCallstack(v string) {
	o.Callstack = &v
}

// GetError returns the Error field value
func (o *ConversationsCloseErrorSchema) GetError() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Error
}

// GetErrorOk returns a tuple with the Error field value
// and a boolean to check if the value has been set.
func (o *ConversationsCloseErrorSchema) GetErrorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Error, true
}

// SetError sets field value
func (o *ConversationsCloseErrorSchema) SetError(v string) {
	o.Error = v
}

// GetNeeded returns the Needed field value if set, zero value otherwise.
func (o *ConversationsCloseErrorSchema) GetNeeded() string {
	if o == nil || isNil(o.Needed) {
		var ret string
		return ret
	}
	return *o.Needed
}

// GetNeededOk returns a tuple with the Needed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsCloseErrorSchema) GetNeededOk() (*string, bool) {
	if o == nil || isNil(o.Needed) {
    return nil, false
	}
	return o.Needed, true
}

// HasNeeded returns a boolean if a field has been set.
func (o *ConversationsCloseErrorSchema) HasNeeded() bool {
	if o != nil && !isNil(o.Needed) {
		return true
	}

	return false
}

// SetNeeded gets a reference to the given string and assigns it to the Needed field.
func (o *ConversationsCloseErrorSchema) SetNeeded(v string) {
	o.Needed = &v
}

// GetOk returns the Ok field value
func (o *ConversationsCloseErrorSchema) GetOk() DefsOkFalse {
	if o == nil {
		var ret DefsOkFalse
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ConversationsCloseErrorSchema) GetOkOk() (*DefsOkFalse, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ConversationsCloseErrorSchema) SetOk(v DefsOkFalse) {
	o.Ok = v
}

// GetProvided returns the Provided field value if set, zero value otherwise.
func (o *ConversationsCloseErrorSchema) GetProvided() string {
	if o == nil || isNil(o.Provided) {
		var ret string
		return ret
	}
	return *o.Provided
}

// GetProvidedOk returns a tuple with the Provided field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsCloseErrorSchema) GetProvidedOk() (*string, bool) {
	if o == nil || isNil(o.Provided) {
    return nil, false
	}
	return o.Provided, true
}

// HasProvided returns a boolean if a field has been set.
func (o *ConversationsCloseErrorSchema) HasProvided() bool {
	if o != nil && !isNil(o.Provided) {
		return true
	}

	return false
}

// SetProvided gets a reference to the given string and assigns it to the Provided field.
func (o *ConversationsCloseErrorSchema) SetProvided(v string) {
	o.Provided = &v
}

func (o ConversationsCloseErrorSchema) MarshalJSON() ([]byte, error) {
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

type NullableConversationsCloseErrorSchema struct {
	value *ConversationsCloseErrorSchema
	isSet bool
}

func (v NullableConversationsCloseErrorSchema) Get() *ConversationsCloseErrorSchema {
	return v.value
}

func (v *NullableConversationsCloseErrorSchema) Set(val *ConversationsCloseErrorSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableConversationsCloseErrorSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableConversationsCloseErrorSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConversationsCloseErrorSchema(val *ConversationsCloseErrorSchema) *NullableConversationsCloseErrorSchema {
	return &NullableConversationsCloseErrorSchema{value: val, isSet: true}
}

func (v NullableConversationsCloseErrorSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConversationsCloseErrorSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


