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

// WebhooksCreatePayload struct for WebhooksCreatePayload
type WebhooksCreatePayload struct {
	// A list of the webhooks that you are subscribing to. There are Currently four webhook options: * ```video.encoding.quality.completed```  When a new video is uploaded into your account, it will be encoded into several different HLS sizes/bitrates.  When each version is encoded, your webhook will get a notification.  It will look like ```{ \\\"type\\\": \\\"video.encoding.quality.completed\\\", \\\"emittedAt\\\": \\\"2021-01-29T16:46:25.217+01:00\\\", \\\"videoId\\\": \\\"viXXXXXXXX\\\", \\\"encoding\\\": \\\"hls\\\", \\\"quality\\\": \\\"720p\\\"} ```. This request says that the 720p HLS encoding was completed. * ```live-stream.broadcast.started```  When a livestream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * ```live-stream.broadcast.ended```  This event fores when the livestream has finished broadcasting, and the broadcasting parameter flips from false to true. * ```video.source.recorded```  This event is similar to ```video.encoding.quality.completed```, but tells you if a livestream has been recorded as a VOD.
	Events []string `json:"events"`
	// The the url to which HTTP notifications are sent. It could be any http or https URL.
	Url string `json:"url"`
}

// NewWebhooksCreatePayload instantiates a new WebhooksCreatePayload object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewWebhooksCreatePayload(events []string, url string) *WebhooksCreatePayload {
	this := WebhooksCreatePayload{}
	this.Events = events
	this.Url = url
	return &this
}

// NewWebhooksCreatePayloadWithDefaults instantiates a new WebhooksCreatePayload object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewWebhooksCreatePayloadWithDefaults() *WebhooksCreatePayload {
	this := WebhooksCreatePayload{}
	return &this
}

// GetEvents returns the Events field value
func (o *WebhooksCreatePayload) GetEvents() []string {
	if o == nil {
		var ret []string
		return ret
	}

	return o.Events
}

// GetEventsOk returns a tuple with the Events field value
// and a boolean to check if the value has been set.
func (o *WebhooksCreatePayload) GetEventsOk() ([]string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Events, true
}

// SetEvents sets field value
func (o *WebhooksCreatePayload) SetEvents(v []string) {
	o.Events = v
}

// GetUrl returns the Url field value
func (o *WebhooksCreatePayload) GetUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Url
}

// GetUrlOk returns a tuple with the Url field value
// and a boolean to check if the value has been set.
func (o *WebhooksCreatePayload) GetUrlOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Url, true
}

// SetUrl sets field value
func (o *WebhooksCreatePayload) SetUrl(v string) {
	o.Url = v
}

func (o WebhooksCreatePayload) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["events"] = o.Events
	}
	if true {
		toSerialize["url"] = o.Url
	}
	return json.Marshal(toSerialize)
}

type NullableWebhooksCreatePayload struct {
	value *WebhooksCreatePayload
	isSet bool
}

func (v NullableWebhooksCreatePayload) Get() *WebhooksCreatePayload {
	return v.value
}

func (v *NullableWebhooksCreatePayload) Set(val *WebhooksCreatePayload) {
	v.value = val
	v.isSet = true
}

func (v NullableWebhooksCreatePayload) IsSet() bool {
	return v.isSet
}

func (v *NullableWebhooksCreatePayload) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableWebhooksCreatePayload(val *WebhooksCreatePayload) *NullableWebhooksCreatePayload {
	return &NullableWebhooksCreatePayload{value: val, isSet: true}
}

func (v NullableWebhooksCreatePayload) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableWebhooksCreatePayload) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

