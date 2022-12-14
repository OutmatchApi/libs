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

// ConversationsCloseSuccessSchema Schema for successful response conversations.close method
type ConversationsCloseSuccessSchema struct {
	AlreadyClosed *bool `json:"already_closed,omitempty"`
	NoOp *bool `json:"no_op,omitempty"`
	Ok DefsOkTrue `json:"ok"`
}

// NewConversationsCloseSuccessSchema instantiates a new ConversationsCloseSuccessSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConversationsCloseSuccessSchema(ok DefsOkTrue) *ConversationsCloseSuccessSchema {
	this := ConversationsCloseSuccessSchema{}
	this.Ok = ok
	return &this
}

// NewConversationsCloseSuccessSchemaWithDefaults instantiates a new ConversationsCloseSuccessSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConversationsCloseSuccessSchemaWithDefaults() *ConversationsCloseSuccessSchema {
	this := ConversationsCloseSuccessSchema{}
	return &this
}

// GetAlreadyClosed returns the AlreadyClosed field value if set, zero value otherwise.
func (o *ConversationsCloseSuccessSchema) GetAlreadyClosed() bool {
	if o == nil || isNil(o.AlreadyClosed) {
		var ret bool
		return ret
	}
	return *o.AlreadyClosed
}

// GetAlreadyClosedOk returns a tuple with the AlreadyClosed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsCloseSuccessSchema) GetAlreadyClosedOk() (*bool, bool) {
	if o == nil || isNil(o.AlreadyClosed) {
    return nil, false
	}
	return o.AlreadyClosed, true
}

// HasAlreadyClosed returns a boolean if a field has been set.
func (o *ConversationsCloseSuccessSchema) HasAlreadyClosed() bool {
	if o != nil && !isNil(o.AlreadyClosed) {
		return true
	}

	return false
}

// SetAlreadyClosed gets a reference to the given bool and assigns it to the AlreadyClosed field.
func (o *ConversationsCloseSuccessSchema) SetAlreadyClosed(v bool) {
	o.AlreadyClosed = &v
}

// GetNoOp returns the NoOp field value if set, zero value otherwise.
func (o *ConversationsCloseSuccessSchema) GetNoOp() bool {
	if o == nil || isNil(o.NoOp) {
		var ret bool
		return ret
	}
	return *o.NoOp
}

// GetNoOpOk returns a tuple with the NoOp field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsCloseSuccessSchema) GetNoOpOk() (*bool, bool) {
	if o == nil || isNil(o.NoOp) {
    return nil, false
	}
	return o.NoOp, true
}

// HasNoOp returns a boolean if a field has been set.
func (o *ConversationsCloseSuccessSchema) HasNoOp() bool {
	if o != nil && !isNil(o.NoOp) {
		return true
	}

	return false
}

// SetNoOp gets a reference to the given bool and assigns it to the NoOp field.
func (o *ConversationsCloseSuccessSchema) SetNoOp(v bool) {
	o.NoOp = &v
}

// GetOk returns the Ok field value
func (o *ConversationsCloseSuccessSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ConversationsCloseSuccessSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ConversationsCloseSuccessSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

func (o ConversationsCloseSuccessSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.AlreadyClosed) {
		toSerialize["already_closed"] = o.AlreadyClosed
	}
	if !isNil(o.NoOp) {
		toSerialize["no_op"] = o.NoOp
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	return json.Marshal(toSerialize)
}

type NullableConversationsCloseSuccessSchema struct {
	value *ConversationsCloseSuccessSchema
	isSet bool
}

func (v NullableConversationsCloseSuccessSchema) Get() *ConversationsCloseSuccessSchema {
	return v.value
}

func (v *NullableConversationsCloseSuccessSchema) Set(val *ConversationsCloseSuccessSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableConversationsCloseSuccessSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableConversationsCloseSuccessSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConversationsCloseSuccessSchema(val *ConversationsCloseSuccessSchema) *NullableConversationsCloseSuccessSchema {
	return &NullableConversationsCloseSuccessSchema{value: val, isSet: true}
}

func (v NullableConversationsCloseSuccessSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConversationsCloseSuccessSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


