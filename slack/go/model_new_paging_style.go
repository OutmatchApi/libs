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

// NewPagingStyle struct for NewPagingStyle
type NewPagingStyle struct {
	NextCursor string `json:"next_cursor"`
}

// NewNewPagingStyle instantiates a new NewPagingStyle object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewNewPagingStyle(nextCursor string) *NewPagingStyle {
	this := NewPagingStyle{}
	this.NextCursor = nextCursor
	return &this
}

// NewNewPagingStyleWithDefaults instantiates a new NewPagingStyle object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewNewPagingStyleWithDefaults() *NewPagingStyle {
	this := NewPagingStyle{}
	return &this
}

// GetNextCursor returns the NextCursor field value
func (o *NewPagingStyle) GetNextCursor() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.NextCursor
}

// GetNextCursorOk returns a tuple with the NextCursor field value
// and a boolean to check if the value has been set.
func (o *NewPagingStyle) GetNextCursorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.NextCursor, true
}

// SetNextCursor sets field value
func (o *NewPagingStyle) SetNextCursor(v string) {
	o.NextCursor = v
}

func (o NewPagingStyle) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["next_cursor"] = o.NextCursor
	}
	return json.Marshal(toSerialize)
}

type NullableNewPagingStyle struct {
	value *NewPagingStyle
	isSet bool
}

func (v NullableNewPagingStyle) Get() *NewPagingStyle {
	return v.value
}

func (v *NullableNewPagingStyle) Set(val *NewPagingStyle) {
	v.value = val
	v.isSet = true
}

func (v NullableNewPagingStyle) IsSet() bool {
	return v.isSet
}

func (v *NullableNewPagingStyle) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableNewPagingStyle(val *NewPagingStyle) *NullableNewPagingStyle {
	return &NullableNewPagingStyle{value: val, isSet: true}
}

func (v NullableNewPagingStyle) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableNewPagingStyle) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


