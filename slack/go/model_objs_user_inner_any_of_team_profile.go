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

// ObjsUserInnerAnyOfTeamProfile struct for ObjsUserInnerAnyOfTeamProfile
type ObjsUserInnerAnyOfTeamProfile struct {
	Fields []ObjsTeamProfileField `json:"fields"`
}

// NewObjsUserInnerAnyOfTeamProfile instantiates a new ObjsUserInnerAnyOfTeamProfile object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewObjsUserInnerAnyOfTeamProfile(fields []ObjsTeamProfileField) *ObjsUserInnerAnyOfTeamProfile {
	this := ObjsUserInnerAnyOfTeamProfile{}
	this.Fields = fields
	return &this
}

// NewObjsUserInnerAnyOfTeamProfileWithDefaults instantiates a new ObjsUserInnerAnyOfTeamProfile object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewObjsUserInnerAnyOfTeamProfileWithDefaults() *ObjsUserInnerAnyOfTeamProfile {
	this := ObjsUserInnerAnyOfTeamProfile{}
	return &this
}

// GetFields returns the Fields field value
func (o *ObjsUserInnerAnyOfTeamProfile) GetFields() []ObjsTeamProfileField {
	if o == nil {
		var ret []ObjsTeamProfileField
		return ret
	}

	return o.Fields
}

// GetFieldsOk returns a tuple with the Fields field value
// and a boolean to check if the value has been set.
func (o *ObjsUserInnerAnyOfTeamProfile) GetFieldsOk() ([]ObjsTeamProfileField, bool) {
	if o == nil {
    return nil, false
	}
	return o.Fields, true
}

// SetFields sets field value
func (o *ObjsUserInnerAnyOfTeamProfile) SetFields(v []ObjsTeamProfileField) {
	o.Fields = v
}

func (o ObjsUserInnerAnyOfTeamProfile) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["fields"] = o.Fields
	}
	return json.Marshal(toSerialize)
}

type NullableObjsUserInnerAnyOfTeamProfile struct {
	value *ObjsUserInnerAnyOfTeamProfile
	isSet bool
}

func (v NullableObjsUserInnerAnyOfTeamProfile) Get() *ObjsUserInnerAnyOfTeamProfile {
	return v.value
}

func (v *NullableObjsUserInnerAnyOfTeamProfile) Set(val *ObjsUserInnerAnyOfTeamProfile) {
	v.value = val
	v.isSet = true
}

func (v NullableObjsUserInnerAnyOfTeamProfile) IsSet() bool {
	return v.isSet
}

func (v *NullableObjsUserInnerAnyOfTeamProfile) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableObjsUserInnerAnyOfTeamProfile(val *ObjsUserInnerAnyOfTeamProfile) *NullableObjsUserInnerAnyOfTeamProfile {
	return &NullableObjsUserInnerAnyOfTeamProfile{value: val, isSet: true}
}

func (v NullableObjsUserInnerAnyOfTeamProfile) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableObjsUserInnerAnyOfTeamProfile) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

