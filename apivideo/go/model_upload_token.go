/*
api.video

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

API version: 1.0.1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package apivideo

import (
	"encoding/json"
	"time"
)

// UploadToken struct for UploadToken
type UploadToken struct {
	// When the token was created, displayed in ISO-8601 format.
	CreatedAt *time.Time `json:"createdAt,omitempty"`
	// When the token expires, displayed in ISO-8601 format.
	ExpiresAt *time.Time `json:"expiresAt,omitempty"`
	// The unique identifier for the token you will use to authenticate an upload.
	Token *string `json:"token,omitempty"`
	// Time-to-live - how long the upload token is valid for.
	Ttl *int32 `json:"ttl,omitempty"`
}

// NewUploadToken instantiates a new UploadToken object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUploadToken() *UploadToken {
	this := UploadToken{}
	return &this
}

// NewUploadTokenWithDefaults instantiates a new UploadToken object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUploadTokenWithDefaults() *UploadToken {
	this := UploadToken{}
	return &this
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *UploadToken) GetCreatedAt() time.Time {
	if o == nil || isNil(o.CreatedAt) {
		var ret time.Time
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UploadToken) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil || isNil(o.CreatedAt) {
    return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *UploadToken) HasCreatedAt() bool {
	if o != nil && !isNil(o.CreatedAt) {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given time.Time and assigns it to the CreatedAt field.
func (o *UploadToken) SetCreatedAt(v time.Time) {
	o.CreatedAt = &v
}

// GetExpiresAt returns the ExpiresAt field value if set, zero value otherwise.
func (o *UploadToken) GetExpiresAt() time.Time {
	if o == nil || isNil(o.ExpiresAt) {
		var ret time.Time
		return ret
	}
	return *o.ExpiresAt
}

// GetExpiresAtOk returns a tuple with the ExpiresAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UploadToken) GetExpiresAtOk() (*time.Time, bool) {
	if o == nil || isNil(o.ExpiresAt) {
    return nil, false
	}
	return o.ExpiresAt, true
}

// HasExpiresAt returns a boolean if a field has been set.
func (o *UploadToken) HasExpiresAt() bool {
	if o != nil && !isNil(o.ExpiresAt) {
		return true
	}

	return false
}

// SetExpiresAt gets a reference to the given time.Time and assigns it to the ExpiresAt field.
func (o *UploadToken) SetExpiresAt(v time.Time) {
	o.ExpiresAt = &v
}

// GetToken returns the Token field value if set, zero value otherwise.
func (o *UploadToken) GetToken() string {
	if o == nil || isNil(o.Token) {
		var ret string
		return ret
	}
	return *o.Token
}

// GetTokenOk returns a tuple with the Token field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UploadToken) GetTokenOk() (*string, bool) {
	if o == nil || isNil(o.Token) {
    return nil, false
	}
	return o.Token, true
}

// HasToken returns a boolean if a field has been set.
func (o *UploadToken) HasToken() bool {
	if o != nil && !isNil(o.Token) {
		return true
	}

	return false
}

// SetToken gets a reference to the given string and assigns it to the Token field.
func (o *UploadToken) SetToken(v string) {
	o.Token = &v
}

// GetTtl returns the Ttl field value if set, zero value otherwise.
func (o *UploadToken) GetTtl() int32 {
	if o == nil || isNil(o.Ttl) {
		var ret int32
		return ret
	}
	return *o.Ttl
}

// GetTtlOk returns a tuple with the Ttl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UploadToken) GetTtlOk() (*int32, bool) {
	if o == nil || isNil(o.Ttl) {
    return nil, false
	}
	return o.Ttl, true
}

// HasTtl returns a boolean if a field has been set.
func (o *UploadToken) HasTtl() bool {
	if o != nil && !isNil(o.Ttl) {
		return true
	}

	return false
}

// SetTtl gets a reference to the given int32 and assigns it to the Ttl field.
func (o *UploadToken) SetTtl(v int32) {
	o.Ttl = &v
}

func (o UploadToken) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.CreatedAt) {
		toSerialize["createdAt"] = o.CreatedAt
	}
	if !isNil(o.ExpiresAt) {
		toSerialize["expiresAt"] = o.ExpiresAt
	}
	if !isNil(o.Token) {
		toSerialize["token"] = o.Token
	}
	if !isNil(o.Ttl) {
		toSerialize["ttl"] = o.Ttl
	}
	return json.Marshal(toSerialize)
}

type NullableUploadToken struct {
	value *UploadToken
	isSet bool
}

func (v NullableUploadToken) Get() *UploadToken {
	return v.value
}

func (v *NullableUploadToken) Set(val *UploadToken) {
	v.value = val
	v.isSet = true
}

func (v NullableUploadToken) IsSet() bool {
	return v.isSet
}

func (v *NullableUploadToken) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUploadToken(val *UploadToken) *NullableUploadToken {
	return &NullableUploadToken{value: val, isSet: true}
}

func (v NullableUploadToken) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUploadToken) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


