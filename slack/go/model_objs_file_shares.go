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

// ObjsFileShares struct for ObjsFileShares
type ObjsFileShares struct {
	Private map[string]interface{} `json:"private,omitempty"`
	Public map[string]interface{} `json:"public,omitempty"`
}

// NewObjsFileShares instantiates a new ObjsFileShares object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewObjsFileShares() *ObjsFileShares {
	this := ObjsFileShares{}
	return &this
}

// NewObjsFileSharesWithDefaults instantiates a new ObjsFileShares object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewObjsFileSharesWithDefaults() *ObjsFileShares {
	this := ObjsFileShares{}
	return &this
}

// GetPrivate returns the Private field value if set, zero value otherwise.
func (o *ObjsFileShares) GetPrivate() map[string]interface{} {
	if o == nil || isNil(o.Private) {
		var ret map[string]interface{}
		return ret
	}
	return o.Private
}

// GetPrivateOk returns a tuple with the Private field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjsFileShares) GetPrivateOk() (map[string]interface{}, bool) {
	if o == nil || isNil(o.Private) {
    return map[string]interface{}{}, false
	}
	return o.Private, true
}

// HasPrivate returns a boolean if a field has been set.
func (o *ObjsFileShares) HasPrivate() bool {
	if o != nil && !isNil(o.Private) {
		return true
	}

	return false
}

// SetPrivate gets a reference to the given map[string]interface{} and assigns it to the Private field.
func (o *ObjsFileShares) SetPrivate(v map[string]interface{}) {
	o.Private = v
}

// GetPublic returns the Public field value if set, zero value otherwise.
func (o *ObjsFileShares) GetPublic() map[string]interface{} {
	if o == nil || isNil(o.Public) {
		var ret map[string]interface{}
		return ret
	}
	return o.Public
}

// GetPublicOk returns a tuple with the Public field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ObjsFileShares) GetPublicOk() (map[string]interface{}, bool) {
	if o == nil || isNil(o.Public) {
    return map[string]interface{}{}, false
	}
	return o.Public, true
}

// HasPublic returns a boolean if a field has been set.
func (o *ObjsFileShares) HasPublic() bool {
	if o != nil && !isNil(o.Public) {
		return true
	}

	return false
}

// SetPublic gets a reference to the given map[string]interface{} and assigns it to the Public field.
func (o *ObjsFileShares) SetPublic(v map[string]interface{}) {
	o.Public = v
}

func (o ObjsFileShares) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Private) {
		toSerialize["private"] = o.Private
	}
	if !isNil(o.Public) {
		toSerialize["public"] = o.Public
	}
	return json.Marshal(toSerialize)
}

type NullableObjsFileShares struct {
	value *ObjsFileShares
	isSet bool
}

func (v NullableObjsFileShares) Get() *ObjsFileShares {
	return v.value
}

func (v *NullableObjsFileShares) Set(val *ObjsFileShares) {
	v.value = val
	v.isSet = true
}

func (v NullableObjsFileShares) IsSet() bool {
	return v.isSet
}

func (v *NullableObjsFileShares) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableObjsFileShares(val *ObjsFileShares) *NullableObjsFileShares {
	return &NullableObjsFileShares{value: val, isSet: true}
}

func (v NullableObjsFileShares) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableObjsFileShares) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

