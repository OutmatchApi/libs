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

// LiveStream struct for LiveStream
type LiveStream struct {
	Assets *LiveStreamAssets `json:"assets,omitempty"`
	// Whether or not you are broadcasting the live video you recorded for others to see. True means you are broadcasting to viewers, false means you are not.
	Broadcasting *bool `json:"broadcasting,omitempty"`
	// The unique identifier for the live stream. Live stream IDs begin with \"li.\"
	LiveStreamId *string `json:"liveStreamId,omitempty"`
	// The name of your live stream.
	Name *string `json:"name,omitempty"`
	// The unique identifier for the player.
	PlayerId *string `json:"playerId,omitempty"`
	// BETA FEATURE Please limit all public = false (\"private\") livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view.
	Public *bool `json:"public,omitempty"`
	// Whether you are recording or not.
	Record *bool `json:"record,omitempty"`
	// The unique, private stream key that you use to begin streaming.
	StreamKey *string `json:"streamKey,omitempty"`
}

// NewLiveStream instantiates a new LiveStream object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewLiveStream() *LiveStream {
	this := LiveStream{}
	return &this
}

// NewLiveStreamWithDefaults instantiates a new LiveStream object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewLiveStreamWithDefaults() *LiveStream {
	this := LiveStream{}
	return &this
}

// GetAssets returns the Assets field value if set, zero value otherwise.
func (o *LiveStream) GetAssets() LiveStreamAssets {
	if o == nil || isNil(o.Assets) {
		var ret LiveStreamAssets
		return ret
	}
	return *o.Assets
}

// GetAssetsOk returns a tuple with the Assets field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LiveStream) GetAssetsOk() (*LiveStreamAssets, bool) {
	if o == nil || isNil(o.Assets) {
    return nil, false
	}
	return o.Assets, true
}

// HasAssets returns a boolean if a field has been set.
func (o *LiveStream) HasAssets() bool {
	if o != nil && !isNil(o.Assets) {
		return true
	}

	return false
}

// SetAssets gets a reference to the given LiveStreamAssets and assigns it to the Assets field.
func (o *LiveStream) SetAssets(v LiveStreamAssets) {
	o.Assets = &v
}

// GetBroadcasting returns the Broadcasting field value if set, zero value otherwise.
func (o *LiveStream) GetBroadcasting() bool {
	if o == nil || isNil(o.Broadcasting) {
		var ret bool
		return ret
	}
	return *o.Broadcasting
}

// GetBroadcastingOk returns a tuple with the Broadcasting field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LiveStream) GetBroadcastingOk() (*bool, bool) {
	if o == nil || isNil(o.Broadcasting) {
    return nil, false
	}
	return o.Broadcasting, true
}

// HasBroadcasting returns a boolean if a field has been set.
func (o *LiveStream) HasBroadcasting() bool {
	if o != nil && !isNil(o.Broadcasting) {
		return true
	}

	return false
}

// SetBroadcasting gets a reference to the given bool and assigns it to the Broadcasting field.
func (o *LiveStream) SetBroadcasting(v bool) {
	o.Broadcasting = &v
}

// GetLiveStreamId returns the LiveStreamId field value if set, zero value otherwise.
func (o *LiveStream) GetLiveStreamId() string {
	if o == nil || isNil(o.LiveStreamId) {
		var ret string
		return ret
	}
	return *o.LiveStreamId
}

// GetLiveStreamIdOk returns a tuple with the LiveStreamId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LiveStream) GetLiveStreamIdOk() (*string, bool) {
	if o == nil || isNil(o.LiveStreamId) {
    return nil, false
	}
	return o.LiveStreamId, true
}

// HasLiveStreamId returns a boolean if a field has been set.
func (o *LiveStream) HasLiveStreamId() bool {
	if o != nil && !isNil(o.LiveStreamId) {
		return true
	}

	return false
}

// SetLiveStreamId gets a reference to the given string and assigns it to the LiveStreamId field.
func (o *LiveStream) SetLiveStreamId(v string) {
	o.LiveStreamId = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *LiveStream) GetName() string {
	if o == nil || isNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LiveStream) GetNameOk() (*string, bool) {
	if o == nil || isNil(o.Name) {
    return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *LiveStream) HasName() bool {
	if o != nil && !isNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *LiveStream) SetName(v string) {
	o.Name = &v
}

// GetPlayerId returns the PlayerId field value if set, zero value otherwise.
func (o *LiveStream) GetPlayerId() string {
	if o == nil || isNil(o.PlayerId) {
		var ret string
		return ret
	}
	return *o.PlayerId
}

// GetPlayerIdOk returns a tuple with the PlayerId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LiveStream) GetPlayerIdOk() (*string, bool) {
	if o == nil || isNil(o.PlayerId) {
    return nil, false
	}
	return o.PlayerId, true
}

// HasPlayerId returns a boolean if a field has been set.
func (o *LiveStream) HasPlayerId() bool {
	if o != nil && !isNil(o.PlayerId) {
		return true
	}

	return false
}

// SetPlayerId gets a reference to the given string and assigns it to the PlayerId field.
func (o *LiveStream) SetPlayerId(v string) {
	o.PlayerId = &v
}

// GetPublic returns the Public field value if set, zero value otherwise.
func (o *LiveStream) GetPublic() bool {
	if o == nil || isNil(o.Public) {
		var ret bool
		return ret
	}
	return *o.Public
}

// GetPublicOk returns a tuple with the Public field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LiveStream) GetPublicOk() (*bool, bool) {
	if o == nil || isNil(o.Public) {
    return nil, false
	}
	return o.Public, true
}

// HasPublic returns a boolean if a field has been set.
func (o *LiveStream) HasPublic() bool {
	if o != nil && !isNil(o.Public) {
		return true
	}

	return false
}

// SetPublic gets a reference to the given bool and assigns it to the Public field.
func (o *LiveStream) SetPublic(v bool) {
	o.Public = &v
}

// GetRecord returns the Record field value if set, zero value otherwise.
func (o *LiveStream) GetRecord() bool {
	if o == nil || isNil(o.Record) {
		var ret bool
		return ret
	}
	return *o.Record
}

// GetRecordOk returns a tuple with the Record field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LiveStream) GetRecordOk() (*bool, bool) {
	if o == nil || isNil(o.Record) {
    return nil, false
	}
	return o.Record, true
}

// HasRecord returns a boolean if a field has been set.
func (o *LiveStream) HasRecord() bool {
	if o != nil && !isNil(o.Record) {
		return true
	}

	return false
}

// SetRecord gets a reference to the given bool and assigns it to the Record field.
func (o *LiveStream) SetRecord(v bool) {
	o.Record = &v
}

// GetStreamKey returns the StreamKey field value if set, zero value otherwise.
func (o *LiveStream) GetStreamKey() string {
	if o == nil || isNil(o.StreamKey) {
		var ret string
		return ret
	}
	return *o.StreamKey
}

// GetStreamKeyOk returns a tuple with the StreamKey field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *LiveStream) GetStreamKeyOk() (*string, bool) {
	if o == nil || isNil(o.StreamKey) {
    return nil, false
	}
	return o.StreamKey, true
}

// HasStreamKey returns a boolean if a field has been set.
func (o *LiveStream) HasStreamKey() bool {
	if o != nil && !isNil(o.StreamKey) {
		return true
	}

	return false
}

// SetStreamKey gets a reference to the given string and assigns it to the StreamKey field.
func (o *LiveStream) SetStreamKey(v string) {
	o.StreamKey = &v
}

func (o LiveStream) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Assets) {
		toSerialize["assets"] = o.Assets
	}
	if !isNil(o.Broadcasting) {
		toSerialize["broadcasting"] = o.Broadcasting
	}
	if !isNil(o.LiveStreamId) {
		toSerialize["liveStreamId"] = o.LiveStreamId
	}
	if !isNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !isNil(o.PlayerId) {
		toSerialize["playerId"] = o.PlayerId
	}
	if !isNil(o.Public) {
		toSerialize["public"] = o.Public
	}
	if !isNil(o.Record) {
		toSerialize["record"] = o.Record
	}
	if !isNil(o.StreamKey) {
		toSerialize["streamKey"] = o.StreamKey
	}
	return json.Marshal(toSerialize)
}

type NullableLiveStream struct {
	value *LiveStream
	isSet bool
}

func (v NullableLiveStream) Get() *LiveStream {
	return v.value
}

func (v *NullableLiveStream) Set(val *LiveStream) {
	v.value = val
	v.isSet = true
}

func (v NullableLiveStream) IsSet() bool {
	return v.isSet
}

func (v *NullableLiveStream) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableLiveStream(val *LiveStream) *NullableLiveStream {
	return &NullableLiveStream{value: val, isSet: true}
}

func (v NullableLiveStream) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableLiveStream) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


