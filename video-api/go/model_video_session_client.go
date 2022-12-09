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

// VideoSessionClient What kind of browser the viewer is using for the video session.
type VideoSessionClient struct {
	// The name of the browser used to view the video session.
	Name *string `json:"name,omitempty"`
	// The type of client used to view the video session.
	Type *string `json:"type,omitempty"`
	// The version of the browser used to view the video session.
	Version *string `json:"version,omitempty"`
}

// NewVideoSessionClient instantiates a new VideoSessionClient object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVideoSessionClient() *VideoSessionClient {
	this := VideoSessionClient{}
	return &this
}

// NewVideoSessionClientWithDefaults instantiates a new VideoSessionClient object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVideoSessionClientWithDefaults() *VideoSessionClient {
	this := VideoSessionClient{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *VideoSessionClient) GetName() string {
	if o == nil || isNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoSessionClient) GetNameOk() (*string, bool) {
	if o == nil || isNil(o.Name) {
    return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *VideoSessionClient) HasName() bool {
	if o != nil && !isNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *VideoSessionClient) SetName(v string) {
	o.Name = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *VideoSessionClient) GetType() string {
	if o == nil || isNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoSessionClient) GetTypeOk() (*string, bool) {
	if o == nil || isNil(o.Type) {
    return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *VideoSessionClient) HasType() bool {
	if o != nil && !isNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *VideoSessionClient) SetType(v string) {
	o.Type = &v
}

// GetVersion returns the Version field value if set, zero value otherwise.
func (o *VideoSessionClient) GetVersion() string {
	if o == nil || isNil(o.Version) {
		var ret string
		return ret
	}
	return *o.Version
}

// GetVersionOk returns a tuple with the Version field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoSessionClient) GetVersionOk() (*string, bool) {
	if o == nil || isNil(o.Version) {
    return nil, false
	}
	return o.Version, true
}

// HasVersion returns a boolean if a field has been set.
func (o *VideoSessionClient) HasVersion() bool {
	if o != nil && !isNil(o.Version) {
		return true
	}

	return false
}

// SetVersion gets a reference to the given string and assigns it to the Version field.
func (o *VideoSessionClient) SetVersion(v string) {
	o.Version = &v
}

func (o VideoSessionClient) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !isNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	if !isNil(o.Version) {
		toSerialize["version"] = o.Version
	}
	return json.Marshal(toSerialize)
}

type NullableVideoSessionClient struct {
	value *VideoSessionClient
	isSet bool
}

func (v NullableVideoSessionClient) Get() *VideoSessionClient {
	return v.value
}

func (v *NullableVideoSessionClient) Set(val *VideoSessionClient) {
	v.value = val
	v.isSet = true
}

func (v NullableVideoSessionClient) IsSet() bool {
	return v.isSet
}

func (v *NullableVideoSessionClient) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVideoSessionClient(val *VideoSessionClient) *NullableVideoSessionClient {
	return &NullableVideoSessionClient{value: val, isSet: true}
}

func (v NullableVideoSessionClient) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVideoSessionClient) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

