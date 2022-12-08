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

// BotsInfoSchemaBotIcons struct for BotsInfoSchemaBotIcons
type BotsInfoSchemaBotIcons struct {
	Image36 string `json:"image_36"`
	Image48 string `json:"image_48"`
	Image72 string `json:"image_72"`
}

// NewBotsInfoSchemaBotIcons instantiates a new BotsInfoSchemaBotIcons object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewBotsInfoSchemaBotIcons(image36 string, image48 string, image72 string) *BotsInfoSchemaBotIcons {
	this := BotsInfoSchemaBotIcons{}
	this.Image36 = image36
	this.Image48 = image48
	this.Image72 = image72
	return &this
}

// NewBotsInfoSchemaBotIconsWithDefaults instantiates a new BotsInfoSchemaBotIcons object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewBotsInfoSchemaBotIconsWithDefaults() *BotsInfoSchemaBotIcons {
	this := BotsInfoSchemaBotIcons{}
	return &this
}

// GetImage36 returns the Image36 field value
func (o *BotsInfoSchemaBotIcons) GetImage36() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Image36
}

// GetImage36Ok returns a tuple with the Image36 field value
// and a boolean to check if the value has been set.
func (o *BotsInfoSchemaBotIcons) GetImage36Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Image36, true
}

// SetImage36 sets field value
func (o *BotsInfoSchemaBotIcons) SetImage36(v string) {
	o.Image36 = v
}

// GetImage48 returns the Image48 field value
func (o *BotsInfoSchemaBotIcons) GetImage48() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Image48
}

// GetImage48Ok returns a tuple with the Image48 field value
// and a boolean to check if the value has been set.
func (o *BotsInfoSchemaBotIcons) GetImage48Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Image48, true
}

// SetImage48 sets field value
func (o *BotsInfoSchemaBotIcons) SetImage48(v string) {
	o.Image48 = v
}

// GetImage72 returns the Image72 field value
func (o *BotsInfoSchemaBotIcons) GetImage72() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Image72
}

// GetImage72Ok returns a tuple with the Image72 field value
// and a boolean to check if the value has been set.
func (o *BotsInfoSchemaBotIcons) GetImage72Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Image72, true
}

// SetImage72 sets field value
func (o *BotsInfoSchemaBotIcons) SetImage72(v string) {
	o.Image72 = v
}

func (o BotsInfoSchemaBotIcons) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["image_36"] = o.Image36
	}
	if true {
		toSerialize["image_48"] = o.Image48
	}
	if true {
		toSerialize["image_72"] = o.Image72
	}
	return json.Marshal(toSerialize)
}

type NullableBotsInfoSchemaBotIcons struct {
	value *BotsInfoSchemaBotIcons
	isSet bool
}

func (v NullableBotsInfoSchemaBotIcons) Get() *BotsInfoSchemaBotIcons {
	return v.value
}

func (v *NullableBotsInfoSchemaBotIcons) Set(val *BotsInfoSchemaBotIcons) {
	v.value = val
	v.isSet = true
}

func (v NullableBotsInfoSchemaBotIcons) IsSet() bool {
	return v.isSet
}

func (v *NullableBotsInfoSchemaBotIcons) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableBotsInfoSchemaBotIcons(val *BotsInfoSchemaBotIcons) *NullableBotsInfoSchemaBotIcons {
	return &NullableBotsInfoSchemaBotIcons{value: val, isSet: true}
}

func (v NullableBotsInfoSchemaBotIcons) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableBotsInfoSchemaBotIcons) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


