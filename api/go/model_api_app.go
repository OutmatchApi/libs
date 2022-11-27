/*
Outmatch API

Outmatch API

API version: 0.0.34
Contact: internal@outmatchapi.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// ApiApp struct for ApiApp
type ApiApp struct {
	Id string `json:"id"`
	Name string `json:"name"`
	DisplayName string `json:"displayName"`
}

// NewApiApp instantiates a new ApiApp object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewApiApp(id string, name string, displayName string) *ApiApp {
	this := ApiApp{}
	this.Id = id
	this.Name = name
	this.DisplayName = displayName
	return &this
}

// NewApiAppWithDefaults instantiates a new ApiApp object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewApiAppWithDefaults() *ApiApp {
	this := ApiApp{}
	return &this
}

// GetId returns the Id field value
func (o *ApiApp) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ApiApp) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ApiApp) SetId(v string) {
	o.Id = v
}

// GetName returns the Name field value
func (o *ApiApp) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *ApiApp) GetNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *ApiApp) SetName(v string) {
	o.Name = v
}

// GetDisplayName returns the DisplayName field value
func (o *ApiApp) GetDisplayName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.DisplayName
}

// GetDisplayNameOk returns a tuple with the DisplayName field value
// and a boolean to check if the value has been set.
func (o *ApiApp) GetDisplayNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.DisplayName, true
}

// SetDisplayName sets field value
func (o *ApiApp) SetDisplayName(v string) {
	o.DisplayName = v
}

func (o ApiApp) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["displayName"] = o.DisplayName
	}
	return json.Marshal(toSerialize)
}

type NullableApiApp struct {
	value *ApiApp
	isSet bool
}

func (v NullableApiApp) Get() *ApiApp {
	return v.value
}

func (v *NullableApiApp) Set(val *ApiApp) {
	v.value = val
	v.isSet = true
}

func (v NullableApiApp) IsSet() bool {
	return v.isSet
}

func (v *NullableApiApp) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableApiApp(val *ApiApp) *NullableApiApp {
	return &NullableApiApp{value: val, isSet: true}
}

func (v NullableApiApp) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableApiApp) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


