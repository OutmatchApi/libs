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

// LiveStreamSessionClient What kind of browser the viewer is using for the live stream session.
type LiveStreamSessionClient struct {
	// The name of the browser used to view the live stream session.
	Name *string `json:"name,omitempty"`
	// The type of client used to view the live stream session.
	Type *string `json:"type,omitempty"`
	// The version of the browser used to view the live stream session.
	Version *string `json:"version,omitempty"`
}

// NewLiveStreamSessionClient instantiates a new LiveStreamSessionClient object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewLiveStreamSessionClient() *LiveStreamSessionClient {
	this := LiveStreamSessionClient{}
	return &this
}

// NewLiveStreamSessionClientWithDefaults instantiates a new LiveStreamSessionClient object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewLiveStreamSessionClientWithDefaults() *LiveStreamSessionClient {
	this := LiveStreamSessionClient{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *LiveStreamSessionClient) GetName() string {
	if o == nil || isNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LiveStreamSessionClient) GetNameOk() (*string, bool) {
	if o == nil || isNil(o.Name) {
    return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *LiveStreamSessionClient) HasName() bool {
	if o != nil && !isNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *LiveStreamSessionClient) SetName(v string) {
	o.Name = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *LiveStreamSessionClient) GetType() string {
	if o == nil || isNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LiveStreamSessionClient) GetTypeOk() (*string, bool) {
	if o == nil || isNil(o.Type) {
    return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *LiveStreamSessionClient) HasType() bool {
	if o != nil && !isNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *LiveStreamSessionClient) SetType(v string) {
	o.Type = &v
}

// GetVersion returns the Version field value if set, zero value otherwise.
func (o *LiveStreamSessionClient) GetVersion() string {
	if o == nil || isNil(o.Version) {
		var ret string
		return ret
	}
	return *o.Version
}

// GetVersionOk returns a tuple with the Version field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LiveStreamSessionClient) GetVersionOk() (*string, bool) {
	if o == nil || isNil(o.Version) {
    return nil, false
	}
	return o.Version, true
}

// HasVersion returns a boolean if a field has been set.
func (o *LiveStreamSessionClient) HasVersion() bool {
	if o != nil && !isNil(o.Version) {
		return true
	}

	return false
}

// SetVersion gets a reference to the given string and assigns it to the Version field.
func (o *LiveStreamSessionClient) SetVersion(v string) {
	o.Version = &v
}

func (o LiveStreamSessionClient) MarshalJSON() ([]byte, error) {
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

type NullableLiveStreamSessionClient struct {
	value *LiveStreamSessionClient
	isSet bool
}

func (v NullableLiveStreamSessionClient) Get() *LiveStreamSessionClient {
	return v.value
}

func (v *NullableLiveStreamSessionClient) Set(val *LiveStreamSessionClient) {
	v.value = val
	v.isSet = true
}

func (v NullableLiveStreamSessionClient) IsSet() bool {
	return v.isSet
}

func (v *NullableLiveStreamSessionClient) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLiveStreamSessionClient(val *LiveStreamSessionClient) *NullableLiveStreamSessionClient {
	return &NullableLiveStreamSessionClient{value: val, isSet: true}
}

func (v NullableLiveStreamSessionClient) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLiveStreamSessionClient) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


