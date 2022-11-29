/*
Outmatch API

Outmatch API

API version: 0.0.43
Contact: internal@outmatchapi.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package api

import (
	"encoding/json"
)

// Error struct for Error
type Error struct {
	StatusCode int32 `json:"statusCode"`
	Description string `json:"description"`
}

// NewError instantiates a new Error object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewError(statusCode int32, description string) *Error {
	this := Error{}
	this.StatusCode = statusCode
	this.Description = description
	return &this
}

// NewErrorWithDefaults instantiates a new Error object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewErrorWithDefaults() *Error {
	this := Error{}
	return &this
}

// GetStatusCode returns the StatusCode field value
func (o *Error) GetStatusCode() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.StatusCode
}

// GetStatusCodeOk returns a tuple with the StatusCode field value
// and a boolean to check if the value has been set.
func (o *Error) GetStatusCodeOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.StatusCode, true
}

// SetStatusCode sets field value
func (o *Error) SetStatusCode(v int32) {
	o.StatusCode = v
}

// GetDescription returns the Description field value
func (o *Error) GetDescription() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Description
}

// GetDescriptionOk returns a tuple with the Description field value
// and a boolean to check if the value has been set.
func (o *Error) GetDescriptionOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Description, true
}

// SetDescription sets field value
func (o *Error) SetDescription(v string) {
	o.Description = v
}

func (o Error) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["statusCode"] = o.StatusCode
	}
	if true {
		toSerialize["description"] = o.Description
	}
	return json.Marshal(toSerialize)
}

type NullableError struct {
	value *Error
	isSet bool
}

func (v NullableError) Get() *Error {
	return v.value
}

func (v *NullableError) Set(val *Error) {
	v.value = val
	v.isSet = true
}

func (v NullableError) IsSet() bool {
	return v.isSet
}

func (v *NullableError) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableError(val *Error) *NullableError {
	return &NullableError{value: val, isSet: true}
}

func (v NullableError) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableError) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


