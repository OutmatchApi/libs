/*
api.video

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package testing-api-video

import (
	"encoding/json"
)

// VideoUpdatePayload struct for VideoUpdatePayload
type VideoUpdatePayload struct {
	// A brief description of the video.
	Description *string `json:"description,omitempty"`
	// A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing metadata for the video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.
	Metadata []Metadata `json:"metadata,omitempty"`
	// Whether the player supports the mp4 format.
	Mp4Support *bool `json:"mp4Support,omitempty"`
	// Whether the video is a 360 degree or immersive video.
	Panoramic *bool `json:"panoramic,omitempty"`
	// The unique ID for the player you want to associate with your video.
	PlayerId *string `json:"playerId,omitempty"`
	// Whether the video is publicly available or not. False means it is set to private. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos).
	Public *bool `json:"public,omitempty"`
	// A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as whatever you send in this list will overwrite the existing list for the video.
	Tags []string `json:"tags,omitempty"`
	// The title you want to use for your video.
	Title *string `json:"title,omitempty"`
}

// NewVideoUpdatePayload instantiates a new VideoUpdatePayload object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVideoUpdatePayload() *VideoUpdatePayload {
	this := VideoUpdatePayload{}
	return &this
}

// NewVideoUpdatePayloadWithDefaults instantiates a new VideoUpdatePayload object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVideoUpdatePayloadWithDefaults() *VideoUpdatePayload {
	this := VideoUpdatePayload{}
	return &this
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *VideoUpdatePayload) GetDescription() string {
	if o == nil || isNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoUpdatePayload) GetDescriptionOk() (*string, bool) {
	if o == nil || isNil(o.Description) {
    return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *VideoUpdatePayload) HasDescription() bool {
	if o != nil && !isNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *VideoUpdatePayload) SetDescription(v string) {
	o.Description = &v
}

// GetMetadata returns the Metadata field value if set, zero value otherwise.
func (o *VideoUpdatePayload) GetMetadata() []Metadata {
	if o == nil || isNil(o.Metadata) {
		var ret []Metadata
		return ret
	}
	return o.Metadata
}

// GetMetadataOk returns a tuple with the Metadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoUpdatePayload) GetMetadataOk() ([]Metadata, bool) {
	if o == nil || isNil(o.Metadata) {
    return nil, false
	}
	return o.Metadata, true
}

// HasMetadata returns a boolean if a field has been set.
func (o *VideoUpdatePayload) HasMetadata() bool {
	if o != nil && !isNil(o.Metadata) {
		return true
	}

	return false
}

// SetMetadata gets a reference to the given []Metadata and assigns it to the Metadata field.
func (o *VideoUpdatePayload) SetMetadata(v []Metadata) {
	o.Metadata = v
}

// GetMp4Support returns the Mp4Support field value if set, zero value otherwise.
func (o *VideoUpdatePayload) GetMp4Support() bool {
	if o == nil || isNil(o.Mp4Support) {
		var ret bool
		return ret
	}
	return *o.Mp4Support
}

// GetMp4SupportOk returns a tuple with the Mp4Support field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoUpdatePayload) GetMp4SupportOk() (*bool, bool) {
	if o == nil || isNil(o.Mp4Support) {
    return nil, false
	}
	return o.Mp4Support, true
}

// HasMp4Support returns a boolean if a field has been set.
func (o *VideoUpdatePayload) HasMp4Support() bool {
	if o != nil && !isNil(o.Mp4Support) {
		return true
	}

	return false
}

// SetMp4Support gets a reference to the given bool and assigns it to the Mp4Support field.
func (o *VideoUpdatePayload) SetMp4Support(v bool) {
	o.Mp4Support = &v
}

// GetPanoramic returns the Panoramic field value if set, zero value otherwise.
func (o *VideoUpdatePayload) GetPanoramic() bool {
	if o == nil || isNil(o.Panoramic) {
		var ret bool
		return ret
	}
	return *o.Panoramic
}

// GetPanoramicOk returns a tuple with the Panoramic field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoUpdatePayload) GetPanoramicOk() (*bool, bool) {
	if o == nil || isNil(o.Panoramic) {
    return nil, false
	}
	return o.Panoramic, true
}

// HasPanoramic returns a boolean if a field has been set.
func (o *VideoUpdatePayload) HasPanoramic() bool {
	if o != nil && !isNil(o.Panoramic) {
		return true
	}

	return false
}

// SetPanoramic gets a reference to the given bool and assigns it to the Panoramic field.
func (o *VideoUpdatePayload) SetPanoramic(v bool) {
	o.Panoramic = &v
}

// GetPlayerId returns the PlayerId field value if set, zero value otherwise.
func (o *VideoUpdatePayload) GetPlayerId() string {
	if o == nil || isNil(o.PlayerId) {
		var ret string
		return ret
	}
	return *o.PlayerId
}

// GetPlayerIdOk returns a tuple with the PlayerId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoUpdatePayload) GetPlayerIdOk() (*string, bool) {
	if o == nil || isNil(o.PlayerId) {
    return nil, false
	}
	return o.PlayerId, true
}

// HasPlayerId returns a boolean if a field has been set.
func (o *VideoUpdatePayload) HasPlayerId() bool {
	if o != nil && !isNil(o.PlayerId) {
		return true
	}

	return false
}

// SetPlayerId gets a reference to the given string and assigns it to the PlayerId field.
func (o *VideoUpdatePayload) SetPlayerId(v string) {
	o.PlayerId = &v
}

// GetPublic returns the Public field value if set, zero value otherwise.
func (o *VideoUpdatePayload) GetPublic() bool {
	if o == nil || isNil(o.Public) {
		var ret bool
		return ret
	}
	return *o.Public
}

// GetPublicOk returns a tuple with the Public field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoUpdatePayload) GetPublicOk() (*bool, bool) {
	if o == nil || isNil(o.Public) {
    return nil, false
	}
	return o.Public, true
}

// HasPublic returns a boolean if a field has been set.
func (o *VideoUpdatePayload) HasPublic() bool {
	if o != nil && !isNil(o.Public) {
		return true
	}

	return false
}

// SetPublic gets a reference to the given bool and assigns it to the Public field.
func (o *VideoUpdatePayload) SetPublic(v bool) {
	o.Public = &v
}

// GetTags returns the Tags field value if set, zero value otherwise.
func (o *VideoUpdatePayload) GetTags() []string {
	if o == nil || isNil(o.Tags) {
		var ret []string
		return ret
	}
	return o.Tags
}

// GetTagsOk returns a tuple with the Tags field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoUpdatePayload) GetTagsOk() ([]string, bool) {
	if o == nil || isNil(o.Tags) {
    return nil, false
	}
	return o.Tags, true
}

// HasTags returns a boolean if a field has been set.
func (o *VideoUpdatePayload) HasTags() bool {
	if o != nil && !isNil(o.Tags) {
		return true
	}

	return false
}

// SetTags gets a reference to the given []string and assigns it to the Tags field.
func (o *VideoUpdatePayload) SetTags(v []string) {
	o.Tags = v
}

// GetTitle returns the Title field value if set, zero value otherwise.
func (o *VideoUpdatePayload) GetTitle() string {
	if o == nil || isNil(o.Title) {
		var ret string
		return ret
	}
	return *o.Title
}

// GetTitleOk returns a tuple with the Title field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoUpdatePayload) GetTitleOk() (*string, bool) {
	if o == nil || isNil(o.Title) {
    return nil, false
	}
	return o.Title, true
}

// HasTitle returns a boolean if a field has been set.
func (o *VideoUpdatePayload) HasTitle() bool {
	if o != nil && !isNil(o.Title) {
		return true
	}

	return false
}

// SetTitle gets a reference to the given string and assigns it to the Title field.
func (o *VideoUpdatePayload) SetTitle(v string) {
	o.Title = &v
}

func (o VideoUpdatePayload) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Description) {
		toSerialize["description"] = o.Description
	}
	if !isNil(o.Metadata) {
		toSerialize["metadata"] = o.Metadata
	}
	if !isNil(o.Mp4Support) {
		toSerialize["mp4Support"] = o.Mp4Support
	}
	if !isNil(o.Panoramic) {
		toSerialize["panoramic"] = o.Panoramic
	}
	if !isNil(o.PlayerId) {
		toSerialize["playerId"] = o.PlayerId
	}
	if !isNil(o.Public) {
		toSerialize["public"] = o.Public
	}
	if !isNil(o.Tags) {
		toSerialize["tags"] = o.Tags
	}
	if !isNil(o.Title) {
		toSerialize["title"] = o.Title
	}
	return json.Marshal(toSerialize)
}

type NullableVideoUpdatePayload struct {
	value *VideoUpdatePayload
	isSet bool
}

func (v NullableVideoUpdatePayload) Get() *VideoUpdatePayload {
	return v.value
}

func (v *NullableVideoUpdatePayload) Set(val *VideoUpdatePayload) {
	v.value = val
	v.isSet = true
}

func (v NullableVideoUpdatePayload) IsSet() bool {
	return v.isSet
}

func (v *NullableVideoUpdatePayload) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVideoUpdatePayload(val *VideoUpdatePayload) *NullableVideoUpdatePayload {
	return &NullableVideoUpdatePayload{value: val, isSet: true}
}

func (v NullableVideoUpdatePayload) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVideoUpdatePayload) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


