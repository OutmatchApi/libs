/*
api.video

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

API version: 1.0.1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package apivideo

import (
	"encoding/json"
)

// Subtitle struct for Subtitle
type Subtitle struct {
	// Whether you will have subtitles or not. True for yes you will have subtitles, false for no you will not have subtitles.
	Default *bool `json:"default,omitempty"`
	Src *string `json:"src,omitempty"`
	Srclang *string `json:"srclang,omitempty"`
	Uri *string `json:"uri,omitempty"`
}

// NewSubtitle instantiates a new Subtitle object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSubtitle() *Subtitle {
	this := Subtitle{}
	var default_ bool = false
	this.Default = &default_
	return &this
}

// NewSubtitleWithDefaults instantiates a new Subtitle object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSubtitleWithDefaults() *Subtitle {
	this := Subtitle{}
	var default_ bool = false
	this.Default = &default_
	return &this
}

// GetDefault returns the Default field value if set, zero value otherwise.
func (o *Subtitle) GetDefault() bool {
	if o == nil || isNil(o.Default) {
		var ret bool
		return ret
	}
	return *o.Default
}

// GetDefaultOk returns a tuple with the Default field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subtitle) GetDefaultOk() (*bool, bool) {
	if o == nil || isNil(o.Default) {
    return nil, false
	}
	return o.Default, true
}

// HasDefault returns a boolean if a field has been set.
func (o *Subtitle) HasDefault() bool {
	if o != nil && !isNil(o.Default) {
		return true
	}

	return false
}

// SetDefault gets a reference to the given bool and assigns it to the Default field.
func (o *Subtitle) SetDefault(v bool) {
	o.Default = &v
}

// GetSrc returns the Src field value if set, zero value otherwise.
func (o *Subtitle) GetSrc() string {
	if o == nil || isNil(o.Src) {
		var ret string
		return ret
	}
	return *o.Src
}

// GetSrcOk returns a tuple with the Src field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subtitle) GetSrcOk() (*string, bool) {
	if o == nil || isNil(o.Src) {
    return nil, false
	}
	return o.Src, true
}

// HasSrc returns a boolean if a field has been set.
func (o *Subtitle) HasSrc() bool {
	if o != nil && !isNil(o.Src) {
		return true
	}

	return false
}

// SetSrc gets a reference to the given string and assigns it to the Src field.
func (o *Subtitle) SetSrc(v string) {
	o.Src = &v
}

// GetSrclang returns the Srclang field value if set, zero value otherwise.
func (o *Subtitle) GetSrclang() string {
	if o == nil || isNil(o.Srclang) {
		var ret string
		return ret
	}
	return *o.Srclang
}

// GetSrclangOk returns a tuple with the Srclang field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subtitle) GetSrclangOk() (*string, bool) {
	if o == nil || isNil(o.Srclang) {
    return nil, false
	}
	return o.Srclang, true
}

// HasSrclang returns a boolean if a field has been set.
func (o *Subtitle) HasSrclang() bool {
	if o != nil && !isNil(o.Srclang) {
		return true
	}

	return false
}

// SetSrclang gets a reference to the given string and assigns it to the Srclang field.
func (o *Subtitle) SetSrclang(v string) {
	o.Srclang = &v
}

// GetUri returns the Uri field value if set, zero value otherwise.
func (o *Subtitle) GetUri() string {
	if o == nil || isNil(o.Uri) {
		var ret string
		return ret
	}
	return *o.Uri
}

// GetUriOk returns a tuple with the Uri field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Subtitle) GetUriOk() (*string, bool) {
	if o == nil || isNil(o.Uri) {
    return nil, false
	}
	return o.Uri, true
}

// HasUri returns a boolean if a field has been set.
func (o *Subtitle) HasUri() bool {
	if o != nil && !isNil(o.Uri) {
		return true
	}

	return false
}

// SetUri gets a reference to the given string and assigns it to the Uri field.
func (o *Subtitle) SetUri(v string) {
	o.Uri = &v
}

func (o Subtitle) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Default) {
		toSerialize["default"] = o.Default
	}
	if !isNil(o.Src) {
		toSerialize["src"] = o.Src
	}
	if !isNil(o.Srclang) {
		toSerialize["srclang"] = o.Srclang
	}
	if !isNil(o.Uri) {
		toSerialize["uri"] = o.Uri
	}
	return json.Marshal(toSerialize)
}

type NullableSubtitle struct {
	value *Subtitle
	isSet bool
}

func (v NullableSubtitle) Get() *Subtitle {
	return v.value
}

func (v *NullableSubtitle) Set(val *Subtitle) {
	v.value = val
	v.isSet = true
}

func (v NullableSubtitle) IsSet() bool {
	return v.isSet
}

func (v *NullableSubtitle) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSubtitle(val *Subtitle) *NullableSubtitle {
	return &NullableSubtitle{value: val, isSet: true}
}

func (v NullableSubtitle) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSubtitle) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


