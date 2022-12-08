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

// VideoAssets Collection of details about the video object that you can use to work with the video object.
type VideoAssets struct {
	// This is the manifest URL. For HTTP Live Streaming (HLS), when a HLS video stream is initiated, the first file to download is the manifest. This file has the extension M3U8, and provides the video player with information about the various bitrates available for streaming.
	Hls *string `json:"hls,omitempty"`
	// Code to use video from a third party website
	Iframe *string `json:"iframe,omitempty"`
	// Available only if mp4Support is enabled. Raw mp4 url.
	Mp4 *string `json:"mp4,omitempty"`
	// Raw url of the player.
	Player *string `json:"player,omitempty"`
	// Poster of the video.
	Thumbnail *string `json:"thumbnail,omitempty"`
}

// NewVideoAssets instantiates a new VideoAssets object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVideoAssets() *VideoAssets {
	this := VideoAssets{}
	return &this
}

// NewVideoAssetsWithDefaults instantiates a new VideoAssets object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVideoAssetsWithDefaults() *VideoAssets {
	this := VideoAssets{}
	return &this
}

// GetHls returns the Hls field value if set, zero value otherwise.
func (o *VideoAssets) GetHls() string {
	if o == nil || isNil(o.Hls) {
		var ret string
		return ret
	}
	return *o.Hls
}

// GetHlsOk returns a tuple with the Hls field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoAssets) GetHlsOk() (*string, bool) {
	if o == nil || isNil(o.Hls) {
    return nil, false
	}
	return o.Hls, true
}

// HasHls returns a boolean if a field has been set.
func (o *VideoAssets) HasHls() bool {
	if o != nil && !isNil(o.Hls) {
		return true
	}

	return false
}

// SetHls gets a reference to the given string and assigns it to the Hls field.
func (o *VideoAssets) SetHls(v string) {
	o.Hls = &v
}

// GetIframe returns the Iframe field value if set, zero value otherwise.
func (o *VideoAssets) GetIframe() string {
	if o == nil || isNil(o.Iframe) {
		var ret string
		return ret
	}
	return *o.Iframe
}

// GetIframeOk returns a tuple with the Iframe field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoAssets) GetIframeOk() (*string, bool) {
	if o == nil || isNil(o.Iframe) {
    return nil, false
	}
	return o.Iframe, true
}

// HasIframe returns a boolean if a field has been set.
func (o *VideoAssets) HasIframe() bool {
	if o != nil && !isNil(o.Iframe) {
		return true
	}

	return false
}

// SetIframe gets a reference to the given string and assigns it to the Iframe field.
func (o *VideoAssets) SetIframe(v string) {
	o.Iframe = &v
}

// GetMp4 returns the Mp4 field value if set, zero value otherwise.
func (o *VideoAssets) GetMp4() string {
	if o == nil || isNil(o.Mp4) {
		var ret string
		return ret
	}
	return *o.Mp4
}

// GetMp4Ok returns a tuple with the Mp4 field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoAssets) GetMp4Ok() (*string, bool) {
	if o == nil || isNil(o.Mp4) {
    return nil, false
	}
	return o.Mp4, true
}

// HasMp4 returns a boolean if a field has been set.
func (o *VideoAssets) HasMp4() bool {
	if o != nil && !isNil(o.Mp4) {
		return true
	}

	return false
}

// SetMp4 gets a reference to the given string and assigns it to the Mp4 field.
func (o *VideoAssets) SetMp4(v string) {
	o.Mp4 = &v
}

// GetPlayer returns the Player field value if set, zero value otherwise.
func (o *VideoAssets) GetPlayer() string {
	if o == nil || isNil(o.Player) {
		var ret string
		return ret
	}
	return *o.Player
}

// GetPlayerOk returns a tuple with the Player field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoAssets) GetPlayerOk() (*string, bool) {
	if o == nil || isNil(o.Player) {
    return nil, false
	}
	return o.Player, true
}

// HasPlayer returns a boolean if a field has been set.
func (o *VideoAssets) HasPlayer() bool {
	if o != nil && !isNil(o.Player) {
		return true
	}

	return false
}

// SetPlayer gets a reference to the given string and assigns it to the Player field.
func (o *VideoAssets) SetPlayer(v string) {
	o.Player = &v
}

// GetThumbnail returns the Thumbnail field value if set, zero value otherwise.
func (o *VideoAssets) GetThumbnail() string {
	if o == nil || isNil(o.Thumbnail) {
		var ret string
		return ret
	}
	return *o.Thumbnail
}

// GetThumbnailOk returns a tuple with the Thumbnail field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *VideoAssets) GetThumbnailOk() (*string, bool) {
	if o == nil || isNil(o.Thumbnail) {
    return nil, false
	}
	return o.Thumbnail, true
}

// HasThumbnail returns a boolean if a field has been set.
func (o *VideoAssets) HasThumbnail() bool {
	if o != nil && !isNil(o.Thumbnail) {
		return true
	}

	return false
}

// SetThumbnail gets a reference to the given string and assigns it to the Thumbnail field.
func (o *VideoAssets) SetThumbnail(v string) {
	o.Thumbnail = &v
}

func (o VideoAssets) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Hls) {
		toSerialize["hls"] = o.Hls
	}
	if !isNil(o.Iframe) {
		toSerialize["iframe"] = o.Iframe
	}
	if !isNil(o.Mp4) {
		toSerialize["mp4"] = o.Mp4
	}
	if !isNil(o.Player) {
		toSerialize["player"] = o.Player
	}
	if !isNil(o.Thumbnail) {
		toSerialize["thumbnail"] = o.Thumbnail
	}
	return json.Marshal(toSerialize)
}

type NullableVideoAssets struct {
	value *VideoAssets
	isSet bool
}

func (v NullableVideoAssets) Get() *VideoAssets {
	return v.value
}

func (v *NullableVideoAssets) Set(val *VideoAssets) {
	v.value = val
	v.isSet = true
}

func (v NullableVideoAssets) IsSet() bool {
	return v.isSet
}

func (v *NullableVideoAssets) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVideoAssets(val *VideoAssets) *NullableVideoAssets {
	return &NullableVideoAssets{value: val, isSet: true}
}

func (v NullableVideoAssets) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVideoAssets) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


