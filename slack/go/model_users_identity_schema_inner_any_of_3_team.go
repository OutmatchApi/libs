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

// UsersIdentitySchemaInnerAnyOf3Team struct for UsersIdentitySchemaInnerAnyOf3Team
type UsersIdentitySchemaInnerAnyOf3Team struct {
	Domain string `json:"domain"`
	Id string `json:"id"`
	Image102 string `json:"image_102"`
	Image132 string `json:"image_132"`
	Image230 string `json:"image_230"`
	Image34 string `json:"image_34"`
	Image44 string `json:"image_44"`
	Image68 string `json:"image_68"`
	Image88 string `json:"image_88"`
	ImageDefault bool `json:"image_default"`
	Name string `json:"name"`
}

// NewUsersIdentitySchemaInnerAnyOf3Team instantiates a new UsersIdentitySchemaInnerAnyOf3Team object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUsersIdentitySchemaInnerAnyOf3Team(domain string, id string, image102 string, image132 string, image230 string, image34 string, image44 string, image68 string, image88 string, imageDefault bool, name string) *UsersIdentitySchemaInnerAnyOf3Team {
	this := UsersIdentitySchemaInnerAnyOf3Team{}
	this.Domain = domain
	this.Id = id
	this.Image102 = image102
	this.Image132 = image132
	this.Image230 = image230
	this.Image34 = image34
	this.Image44 = image44
	this.Image68 = image68
	this.Image88 = image88
	this.ImageDefault = imageDefault
	this.Name = name
	return &this
}

// NewUsersIdentitySchemaInnerAnyOf3TeamWithDefaults instantiates a new UsersIdentitySchemaInnerAnyOf3Team object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUsersIdentitySchemaInnerAnyOf3TeamWithDefaults() *UsersIdentitySchemaInnerAnyOf3Team {
	this := UsersIdentitySchemaInnerAnyOf3Team{}
	return &this
}

// GetDomain returns the Domain field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetDomain() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Domain
}

// GetDomainOk returns a tuple with the Domain field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetDomainOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Domain, true
}

// SetDomain sets field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) SetDomain(v string) {
	o.Domain = v
}

// GetId returns the Id field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) SetId(v string) {
	o.Id = v
}

// GetImage102 returns the Image102 field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage102() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Image102
}

// GetImage102Ok returns a tuple with the Image102 field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage102Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Image102, true
}

// SetImage102 sets field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) SetImage102(v string) {
	o.Image102 = v
}

// GetImage132 returns the Image132 field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage132() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Image132
}

// GetImage132Ok returns a tuple with the Image132 field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage132Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Image132, true
}

// SetImage132 sets field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) SetImage132(v string) {
	o.Image132 = v
}

// GetImage230 returns the Image230 field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage230() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Image230
}

// GetImage230Ok returns a tuple with the Image230 field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage230Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Image230, true
}

// SetImage230 sets field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) SetImage230(v string) {
	o.Image230 = v
}

// GetImage34 returns the Image34 field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage34() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Image34
}

// GetImage34Ok returns a tuple with the Image34 field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage34Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Image34, true
}

// SetImage34 sets field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) SetImage34(v string) {
	o.Image34 = v
}

// GetImage44 returns the Image44 field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage44() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Image44
}

// GetImage44Ok returns a tuple with the Image44 field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage44Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Image44, true
}

// SetImage44 sets field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) SetImage44(v string) {
	o.Image44 = v
}

// GetImage68 returns the Image68 field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage68() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Image68
}

// GetImage68Ok returns a tuple with the Image68 field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage68Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Image68, true
}

// SetImage68 sets field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) SetImage68(v string) {
	o.Image68 = v
}

// GetImage88 returns the Image88 field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage88() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Image88
}

// GetImage88Ok returns a tuple with the Image88 field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImage88Ok() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Image88, true
}

// SetImage88 sets field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) SetImage88(v string) {
	o.Image88 = v
}

// GetImageDefault returns the ImageDefault field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImageDefault() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.ImageDefault
}

// GetImageDefaultOk returns a tuple with the ImageDefault field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetImageDefaultOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.ImageDefault, true
}

// SetImageDefault sets field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) SetImageDefault(v bool) {
	o.ImageDefault = v
}

// GetName returns the Name field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *UsersIdentitySchemaInnerAnyOf3Team) GetNameOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *UsersIdentitySchemaInnerAnyOf3Team) SetName(v string) {
	o.Name = v
}

func (o UsersIdentitySchemaInnerAnyOf3Team) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["domain"] = o.Domain
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["image_102"] = o.Image102
	}
	if true {
		toSerialize["image_132"] = o.Image132
	}
	if true {
		toSerialize["image_230"] = o.Image230
	}
	if true {
		toSerialize["image_34"] = o.Image34
	}
	if true {
		toSerialize["image_44"] = o.Image44
	}
	if true {
		toSerialize["image_68"] = o.Image68
	}
	if true {
		toSerialize["image_88"] = o.Image88
	}
	if true {
		toSerialize["image_default"] = o.ImageDefault
	}
	if true {
		toSerialize["name"] = o.Name
	}
	return json.Marshal(toSerialize)
}

type NullableUsersIdentitySchemaInnerAnyOf3Team struct {
	value *UsersIdentitySchemaInnerAnyOf3Team
	isSet bool
}

func (v NullableUsersIdentitySchemaInnerAnyOf3Team) Get() *UsersIdentitySchemaInnerAnyOf3Team {
	return v.value
}

func (v *NullableUsersIdentitySchemaInnerAnyOf3Team) Set(val *UsersIdentitySchemaInnerAnyOf3Team) {
	v.value = val
	v.isSet = true
}

func (v NullableUsersIdentitySchemaInnerAnyOf3Team) IsSet() bool {
	return v.isSet
}

func (v *NullableUsersIdentitySchemaInnerAnyOf3Team) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUsersIdentitySchemaInnerAnyOf3Team(val *UsersIdentitySchemaInnerAnyOf3Team) *NullableUsersIdentitySchemaInnerAnyOf3Team {
	return &NullableUsersIdentitySchemaInnerAnyOf3Team{value: val, isSet: true}
}

func (v NullableUsersIdentitySchemaInnerAnyOf3Team) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUsersIdentitySchemaInnerAnyOf3Team) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

