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

// ObjsReaction struct for ObjsReaction
type ObjsReaction struct {
	Count int32 `json:"count"`
	Name string `json:"name"`
	Users []string `json:"users"`
	AdditionalProperties map[string]interface{}
}

type _ObjsReaction ObjsReaction

// NewObjsReaction instantiates a new ObjsReaction object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewObjsReaction(count int32, name string, users []string) *ObjsReaction {
	this := ObjsReaction{}
	this.Count = count
	this.Name = name
	this.Users = users
	return &this
}

// NewObjsReactionWithDefaults instantiates a new ObjsReaction object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewObjsReactionWithDefaults() *ObjsReaction {
	this := ObjsReaction{}
	return &this
}

// GetCount returns the Count field value
func (o *ObjsReaction) GetCount() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Count
}

// GetCountOk returns a tuple with the Count field value
// and a boolean to check if the value has been set.
func (o *ObjsReaction) GetCountOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Count, true
}

// SetCount sets field value
func (o *ObjsReaction) SetCount(v int32) {
	o.Count = v
}

// GetName returns the Name field value
func (o *ObjsReaction) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *ObjsReaction) GetNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *ObjsReaction) SetName(v string) {
	o.Name = v
}

// GetUsers returns the Users field value
func (o *ObjsReaction) GetUsers() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Users
}

// GetUsersOk returns a tuple with the Users field value
// and a boolean to check if the value has been set.
func (o *ObjsReaction) GetUsersOk() ([]string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Users, true
}

// SetUsers sets field value
func (o *ObjsReaction) SetUsers(v []string) {
	o.Users = v
}

func (o ObjsReaction) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["count"] = o.Count
	}
	if true {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["users"] = o.Users
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *ObjsReaction) UnmarshalJSON(bytes []byte) (err error) {
	varObjsReaction := _ObjsReaction{}

	if err = json.Unmarshal(bytes, &varObjsReaction); err == nil {
		*o = ObjsReaction(varObjsReaction)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "count")
		delete(additionalProperties, "name")
		delete(additionalProperties, "users")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableObjsReaction struct {
	value *ObjsReaction
	isSet bool
}

func (v NullableObjsReaction) Get() *ObjsReaction {
	return v.value
}

func (v *NullableObjsReaction) Set(val *ObjsReaction) {
	v.value = val
	v.isSet = true
}

func (v NullableObjsReaction) IsSet() bool {
	return v.isSet
}

func (v *NullableObjsReaction) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableObjsReaction(val *ObjsReaction) *NullableObjsReaction {
	return &NullableObjsReaction{value: val, isSet: true}
}

func (v NullableObjsReaction) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableObjsReaction) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


