/*
api.video

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

API version: 1.0.1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package video-api

import (
	"encoding/json"
)

// PaginationLink struct for PaginationLink
type PaginationLink struct {
	Rel *string `json:"rel,omitempty"`
	Uri *string `json:"uri,omitempty"`
}

// NewPaginationLink instantiates a new PaginationLink object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPaginationLink() *PaginationLink {
	this := PaginationLink{}
	return &this
}

// NewPaginationLinkWithDefaults instantiates a new PaginationLink object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPaginationLinkWithDefaults() *PaginationLink {
	this := PaginationLink{}
	return &this
}

// GetRel returns the Rel field value if set, zero value otherwise.
func (o *PaginationLink) GetRel() string {
	if o == nil || isNil(o.Rel) {
		var ret string
		return ret
	}
	return *o.Rel
}

// GetRelOk returns a tuple with the Rel field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PaginationLink) GetRelOk() (*string, bool) {
	if o == nil || isNil(o.Rel) {
    return nil, false
	}
	return o.Rel, true
}

// HasRel returns a boolean if a field has been set.
func (o *PaginationLink) HasRel() bool {
	if o != nil && !isNil(o.Rel) {
		return true
	}

	return false
}

// SetRel gets a reference to the given string and assigns it to the Rel field.
func (o *PaginationLink) SetRel(v string) {
	o.Rel = &v
}

// GetUri returns the Uri field value if set, zero value otherwise.
func (o *PaginationLink) GetUri() string {
	if o == nil || isNil(o.Uri) {
		var ret string
		return ret
	}
	return *o.Uri
}

// GetUriOk returns a tuple with the Uri field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PaginationLink) GetUriOk() (*string, bool) {
	if o == nil || isNil(o.Uri) {
    return nil, false
	}
	return o.Uri, true
}

// HasUri returns a boolean if a field has been set.
func (o *PaginationLink) HasUri() bool {
	if o != nil && !isNil(o.Uri) {
		return true
	}

	return false
}

// SetUri gets a reference to the given string and assigns it to the Uri field.
func (o *PaginationLink) SetUri(v string) {
	o.Uri = &v
}

func (o PaginationLink) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Rel) {
		toSerialize["rel"] = o.Rel
	}
	if !isNil(o.Uri) {
		toSerialize["uri"] = o.Uri
	}
	return json.Marshal(toSerialize)
}

type NullablePaginationLink struct {
	value *PaginationLink
	isSet bool
}

func (v NullablePaginationLink) Get() *PaginationLink {
	return v.value
}

func (v *NullablePaginationLink) Set(val *PaginationLink) {
	v.value = val
	v.isSet = true
}

func (v NullablePaginationLink) IsSet() bool {
	return v.isSet
}

func (v *NullablePaginationLink) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePaginationLink(val *PaginationLink) *NullablePaginationLink {
	return &NullablePaginationLink{value: val, isSet: true}
}

func (v NullablePaginationLink) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePaginationLink) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


