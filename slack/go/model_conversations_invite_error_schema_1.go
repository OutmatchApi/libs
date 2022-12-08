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

// ConversationsInviteErrorSchema1 Schema for error response from conversations.invite method
type ConversationsInviteErrorSchema1 struct {
	// Note: PHP callstack is only visible in dev/qa
	Callstack *string `json:"callstack,omitempty"`
	Error *string `json:"error,omitempty"`
	Errors []ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner `json:"errors,omitempty"`
	Needed *string `json:"needed,omitempty"`
	Ok DefsOkFalse `json:"ok"`
	Provided *string `json:"provided,omitempty"`
}

// NewConversationsInviteErrorSchema1 instantiates a new ConversationsInviteErrorSchema1 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConversationsInviteErrorSchema1(ok DefsOkFalse) *ConversationsInviteErrorSchema1 {
	this := ConversationsInviteErrorSchema1{}
	this.Ok = ok
	return &this
}

// NewConversationsInviteErrorSchema1WithDefaults instantiates a new ConversationsInviteErrorSchema1 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConversationsInviteErrorSchema1WithDefaults() *ConversationsInviteErrorSchema1 {
	this := ConversationsInviteErrorSchema1{}
	return &this
}

// GetCallstack returns the Callstack field value if set, zero value otherwise.
func (o *ConversationsInviteErrorSchema1) GetCallstack() string {
	if o == nil || isNil(o.Callstack) {
		var ret string
		return ret
	}
	return *o.Callstack
}

// GetCallstackOk returns a tuple with the Callstack field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsInviteErrorSchema1) GetCallstackOk() (*string, bool) {
	if o == nil || isNil(o.Callstack) {
    return nil, false
	}
	return o.Callstack, true
}

// HasCallstack returns a boolean if a field has been set.
func (o *ConversationsInviteErrorSchema1) HasCallstack() bool {
	if o != nil && !isNil(o.Callstack) {
		return true
	}

	return false
}

// SetCallstack gets a reference to the given string and assigns it to the Callstack field.
func (o *ConversationsInviteErrorSchema1) SetCallstack(v string) {
	o.Callstack = &v
}

// GetError returns the Error field value if set, zero value otherwise.
func (o *ConversationsInviteErrorSchema1) GetError() string {
	if o == nil || isNil(o.Error) {
		var ret string
		return ret
	}
	return *o.Error
}

// GetErrorOk returns a tuple with the Error field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsInviteErrorSchema1) GetErrorOk() (*string, bool) {
	if o == nil || isNil(o.Error) {
    return nil, false
	}
	return o.Error, true
}

// HasError returns a boolean if a field has been set.
func (o *ConversationsInviteErrorSchema1) HasError() bool {
	if o != nil && !isNil(o.Error) {
		return true
	}

	return false
}

// SetError gets a reference to the given string and assigns it to the Error field.
func (o *ConversationsInviteErrorSchema1) SetError(v string) {
	o.Error = &v
}

// GetErrors returns the Errors field value if set, zero value otherwise.
func (o *ConversationsInviteErrorSchema1) GetErrors() []ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner {
	if o == nil || isNil(o.Errors) {
		var ret []ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner
		return ret
	}
	return o.Errors
}

// GetErrorsOk returns a tuple with the Errors field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsInviteErrorSchema1) GetErrorsOk() ([]ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner, bool) {
	if o == nil || isNil(o.Errors) {
    return nil, false
	}
	return o.Errors, true
}

// HasErrors returns a boolean if a field has been set.
func (o *ConversationsInviteErrorSchema1) HasErrors() bool {
	if o != nil && !isNil(o.Errors) {
		return true
	}

	return false
}

// SetErrors gets a reference to the given []ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner and assigns it to the Errors field.
func (o *ConversationsInviteErrorSchema1) SetErrors(v []ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner) {
	o.Errors = v
}

// GetNeeded returns the Needed field value if set, zero value otherwise.
func (o *ConversationsInviteErrorSchema1) GetNeeded() string {
	if o == nil || isNil(o.Needed) {
		var ret string
		return ret
	}
	return *o.Needed
}

// GetNeededOk returns a tuple with the Needed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsInviteErrorSchema1) GetNeededOk() (*string, bool) {
	if o == nil || isNil(o.Needed) {
    return nil, false
	}
	return o.Needed, true
}

// HasNeeded returns a boolean if a field has been set.
func (o *ConversationsInviteErrorSchema1) HasNeeded() bool {
	if o != nil && !isNil(o.Needed) {
		return true
	}

	return false
}

// SetNeeded gets a reference to the given string and assigns it to the Needed field.
func (o *ConversationsInviteErrorSchema1) SetNeeded(v string) {
	o.Needed = &v
}

// GetOk returns the Ok field value
func (o *ConversationsInviteErrorSchema1) GetOk() DefsOkFalse {
	if o == nil {
		var ret DefsOkFalse
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *ConversationsInviteErrorSchema1) GetOkOk() (*DefsOkFalse, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *ConversationsInviteErrorSchema1) SetOk(v DefsOkFalse) {
	o.Ok = v
}

// GetProvided returns the Provided field value if set, zero value otherwise.
func (o *ConversationsInviteErrorSchema1) GetProvided() string {
	if o == nil || isNil(o.Provided) {
		var ret string
		return ret
	}
	return *o.Provided
}

// GetProvidedOk returns a tuple with the Provided field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationsInviteErrorSchema1) GetProvidedOk() (*string, bool) {
	if o == nil || isNil(o.Provided) {
    return nil, false
	}
	return o.Provided, true
}

// HasProvided returns a boolean if a field has been set.
func (o *ConversationsInviteErrorSchema1) HasProvided() bool {
	if o != nil && !isNil(o.Provided) {
		return true
	}

	return false
}

// SetProvided gets a reference to the given string and assigns it to the Provided field.
func (o *ConversationsInviteErrorSchema1) SetProvided(v string) {
	o.Provided = &v
}

func (o ConversationsInviteErrorSchema1) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Callstack) {
		toSerialize["callstack"] = o.Callstack
	}
	if !isNil(o.Error) {
		toSerialize["error"] = o.Error
	}
	if !isNil(o.Errors) {
		toSerialize["errors"] = o.Errors
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

type NullableConversationsInviteErrorSchema1 struct {
	value *ConversationsInviteErrorSchema1
	isSet bool
}

func (v NullableConversationsInviteErrorSchema1) Get() *ConversationsInviteErrorSchema1 {
	return v.value
}

func (v *NullableConversationsInviteErrorSchema1) Set(val *ConversationsInviteErrorSchema1) {
	v.value = val
	v.isSet = true
}

func (v NullableConversationsInviteErrorSchema1) IsSet() bool {
	return v.isSet
}

func (v *NullableConversationsInviteErrorSchema1) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConversationsInviteErrorSchema1(val *ConversationsInviteErrorSchema1) *NullableConversationsInviteErrorSchema1 {
	return &NullableConversationsInviteErrorSchema1{value: val, isSet: true}
}

func (v NullableConversationsInviteErrorSchema1) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConversationsInviteErrorSchema1) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


