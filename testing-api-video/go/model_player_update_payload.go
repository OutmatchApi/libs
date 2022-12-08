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

// PlayerUpdatePayload struct for PlayerUpdatePayload
type PlayerUpdatePayload struct {
	// RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)
	BackgroundBottom *string `json:"backgroundBottom,omitempty"`
	// RGBA color for title text. Default: rgba(255, 255, 255, 1)
	BackgroundText *string `json:"backgroundText,omitempty"`
	// RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)
	BackgroundTop *string `json:"backgroundTop,omitempty"`
	// enable/disable player SDK access. Default: true
	EnableApi *bool `json:"enableApi,omitempty"`
	// enable/disable player controls. Default: true
	EnableControls *bool `json:"enableControls,omitempty"`
	// enable/disable player autoplay. Default: false
	ForceAutoplay *bool `json:"forceAutoplay,omitempty"`
	// enable/disable looping. Default: false
	ForceLoop *bool `json:"forceLoop,omitempty"`
	// enable/disable title. Default: false
	HideTitle *bool `json:"hideTitle,omitempty"`
	// RGBA color for all controls. Default: rgba(255, 255, 255, 1)
	Link *string `json:"link,omitempty"`
	// RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)
	LinkHover *string `json:"linkHover,omitempty"`
	// RGBA color for timer text. Default: rgba(255, 255, 255, 1)
	Text *string `json:"text,omitempty"`
	// RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)
	TrackBackground *string `json:"trackBackground,omitempty"`
	// RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)
	TrackPlayed *string `json:"trackPlayed,omitempty"`
	// RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)
	TrackUnplayed *string `json:"trackUnplayed,omitempty"`
}

// NewPlayerUpdatePayload instantiates a new PlayerUpdatePayload object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPlayerUpdatePayload() *PlayerUpdatePayload {
	this := PlayerUpdatePayload{}
	var enableApi bool = true
	this.EnableApi = &enableApi
	var enableControls bool = true
	this.EnableControls = &enableControls
	var forceAutoplay bool = false
	this.ForceAutoplay = &forceAutoplay
	var forceLoop bool = false
	this.ForceLoop = &forceLoop
	var hideTitle bool = false
	this.HideTitle = &hideTitle
	return &this
}

// NewPlayerUpdatePayloadWithDefaults instantiates a new PlayerUpdatePayload object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPlayerUpdatePayloadWithDefaults() *PlayerUpdatePayload {
	this := PlayerUpdatePayload{}
	var enableApi bool = true
	this.EnableApi = &enableApi
	var enableControls bool = true
	this.EnableControls = &enableControls
	var forceAutoplay bool = false
	this.ForceAutoplay = &forceAutoplay
	var forceLoop bool = false
	this.ForceLoop = &forceLoop
	var hideTitle bool = false
	this.HideTitle = &hideTitle
	return &this
}

// GetBackgroundBottom returns the BackgroundBottom field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetBackgroundBottom() string {
	if o == nil || isNil(o.BackgroundBottom) {
		var ret string
		return ret
	}
	return *o.BackgroundBottom
}

// GetBackgroundBottomOk returns a tuple with the BackgroundBottom field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetBackgroundBottomOk() (*string, bool) {
	if o == nil || isNil(o.BackgroundBottom) {
    return nil, false
	}
	return o.BackgroundBottom, true
}

// HasBackgroundBottom returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasBackgroundBottom() bool {
	if o != nil && !isNil(o.BackgroundBottom) {
		return true
	}

	return false
}

// SetBackgroundBottom gets a reference to the given string and assigns it to the BackgroundBottom field.
func (o *PlayerUpdatePayload) SetBackgroundBottom(v string) {
	o.BackgroundBottom = &v
}

// GetBackgroundText returns the BackgroundText field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetBackgroundText() string {
	if o == nil || isNil(o.BackgroundText) {
		var ret string
		return ret
	}
	return *o.BackgroundText
}

// GetBackgroundTextOk returns a tuple with the BackgroundText field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetBackgroundTextOk() (*string, bool) {
	if o == nil || isNil(o.BackgroundText) {
    return nil, false
	}
	return o.BackgroundText, true
}

// HasBackgroundText returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasBackgroundText() bool {
	if o != nil && !isNil(o.BackgroundText) {
		return true
	}

	return false
}

// SetBackgroundText gets a reference to the given string and assigns it to the BackgroundText field.
func (o *PlayerUpdatePayload) SetBackgroundText(v string) {
	o.BackgroundText = &v
}

// GetBackgroundTop returns the BackgroundTop field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetBackgroundTop() string {
	if o == nil || isNil(o.BackgroundTop) {
		var ret string
		return ret
	}
	return *o.BackgroundTop
}

// GetBackgroundTopOk returns a tuple with the BackgroundTop field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetBackgroundTopOk() (*string, bool) {
	if o == nil || isNil(o.BackgroundTop) {
    return nil, false
	}
	return o.BackgroundTop, true
}

// HasBackgroundTop returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasBackgroundTop() bool {
	if o != nil && !isNil(o.BackgroundTop) {
		return true
	}

	return false
}

// SetBackgroundTop gets a reference to the given string and assigns it to the BackgroundTop field.
func (o *PlayerUpdatePayload) SetBackgroundTop(v string) {
	o.BackgroundTop = &v
}

// GetEnableApi returns the EnableApi field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetEnableApi() bool {
	if o == nil || isNil(o.EnableApi) {
		var ret bool
		return ret
	}
	return *o.EnableApi
}

// GetEnableApiOk returns a tuple with the EnableApi field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetEnableApiOk() (*bool, bool) {
	if o == nil || isNil(o.EnableApi) {
    return nil, false
	}
	return o.EnableApi, true
}

// HasEnableApi returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasEnableApi() bool {
	if o != nil && !isNil(o.EnableApi) {
		return true
	}

	return false
}

// SetEnableApi gets a reference to the given bool and assigns it to the EnableApi field.
func (o *PlayerUpdatePayload) SetEnableApi(v bool) {
	o.EnableApi = &v
}

// GetEnableControls returns the EnableControls field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetEnableControls() bool {
	if o == nil || isNil(o.EnableControls) {
		var ret bool
		return ret
	}
	return *o.EnableControls
}

// GetEnableControlsOk returns a tuple with the EnableControls field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetEnableControlsOk() (*bool, bool) {
	if o == nil || isNil(o.EnableControls) {
    return nil, false
	}
	return o.EnableControls, true
}

// HasEnableControls returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasEnableControls() bool {
	if o != nil && !isNil(o.EnableControls) {
		return true
	}

	return false
}

// SetEnableControls gets a reference to the given bool and assigns it to the EnableControls field.
func (o *PlayerUpdatePayload) SetEnableControls(v bool) {
	o.EnableControls = &v
}

// GetForceAutoplay returns the ForceAutoplay field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetForceAutoplay() bool {
	if o == nil || isNil(o.ForceAutoplay) {
		var ret bool
		return ret
	}
	return *o.ForceAutoplay
}

// GetForceAutoplayOk returns a tuple with the ForceAutoplay field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetForceAutoplayOk() (*bool, bool) {
	if o == nil || isNil(o.ForceAutoplay) {
    return nil, false
	}
	return o.ForceAutoplay, true
}

// HasForceAutoplay returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasForceAutoplay() bool {
	if o != nil && !isNil(o.ForceAutoplay) {
		return true
	}

	return false
}

// SetForceAutoplay gets a reference to the given bool and assigns it to the ForceAutoplay field.
func (o *PlayerUpdatePayload) SetForceAutoplay(v bool) {
	o.ForceAutoplay = &v
}

// GetForceLoop returns the ForceLoop field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetForceLoop() bool {
	if o == nil || isNil(o.ForceLoop) {
		var ret bool
		return ret
	}
	return *o.ForceLoop
}

// GetForceLoopOk returns a tuple with the ForceLoop field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetForceLoopOk() (*bool, bool) {
	if o == nil || isNil(o.ForceLoop) {
    return nil, false
	}
	return o.ForceLoop, true
}

// HasForceLoop returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasForceLoop() bool {
	if o != nil && !isNil(o.ForceLoop) {
		return true
	}

	return false
}

// SetForceLoop gets a reference to the given bool and assigns it to the ForceLoop field.
func (o *PlayerUpdatePayload) SetForceLoop(v bool) {
	o.ForceLoop = &v
}

// GetHideTitle returns the HideTitle field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetHideTitle() bool {
	if o == nil || isNil(o.HideTitle) {
		var ret bool
		return ret
	}
	return *o.HideTitle
}

// GetHideTitleOk returns a tuple with the HideTitle field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetHideTitleOk() (*bool, bool) {
	if o == nil || isNil(o.HideTitle) {
    return nil, false
	}
	return o.HideTitle, true
}

// HasHideTitle returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasHideTitle() bool {
	if o != nil && !isNil(o.HideTitle) {
		return true
	}

	return false
}

// SetHideTitle gets a reference to the given bool and assigns it to the HideTitle field.
func (o *PlayerUpdatePayload) SetHideTitle(v bool) {
	o.HideTitle = &v
}

// GetLink returns the Link field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetLink() string {
	if o == nil || isNil(o.Link) {
		var ret string
		return ret
	}
	return *o.Link
}

// GetLinkOk returns a tuple with the Link field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetLinkOk() (*string, bool) {
	if o == nil || isNil(o.Link) {
    return nil, false
	}
	return o.Link, true
}

// HasLink returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasLink() bool {
	if o != nil && !isNil(o.Link) {
		return true
	}

	return false
}

// SetLink gets a reference to the given string and assigns it to the Link field.
func (o *PlayerUpdatePayload) SetLink(v string) {
	o.Link = &v
}

// GetLinkHover returns the LinkHover field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetLinkHover() string {
	if o == nil || isNil(o.LinkHover) {
		var ret string
		return ret
	}
	return *o.LinkHover
}

// GetLinkHoverOk returns a tuple with the LinkHover field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetLinkHoverOk() (*string, bool) {
	if o == nil || isNil(o.LinkHover) {
    return nil, false
	}
	return o.LinkHover, true
}

// HasLinkHover returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasLinkHover() bool {
	if o != nil && !isNil(o.LinkHover) {
		return true
	}

	return false
}

// SetLinkHover gets a reference to the given string and assigns it to the LinkHover field.
func (o *PlayerUpdatePayload) SetLinkHover(v string) {
	o.LinkHover = &v
}

// GetText returns the Text field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetText() string {
	if o == nil || isNil(o.Text) {
		var ret string
		return ret
	}
	return *o.Text
}

// GetTextOk returns a tuple with the Text field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetTextOk() (*string, bool) {
	if o == nil || isNil(o.Text) {
    return nil, false
	}
	return o.Text, true
}

// HasText returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasText() bool {
	if o != nil && !isNil(o.Text) {
		return true
	}

	return false
}

// SetText gets a reference to the given string and assigns it to the Text field.
func (o *PlayerUpdatePayload) SetText(v string) {
	o.Text = &v
}

// GetTrackBackground returns the TrackBackground field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetTrackBackground() string {
	if o == nil || isNil(o.TrackBackground) {
		var ret string
		return ret
	}
	return *o.TrackBackground
}

// GetTrackBackgroundOk returns a tuple with the TrackBackground field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetTrackBackgroundOk() (*string, bool) {
	if o == nil || isNil(o.TrackBackground) {
    return nil, false
	}
	return o.TrackBackground, true
}

// HasTrackBackground returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasTrackBackground() bool {
	if o != nil && !isNil(o.TrackBackground) {
		return true
	}

	return false
}

// SetTrackBackground gets a reference to the given string and assigns it to the TrackBackground field.
func (o *PlayerUpdatePayload) SetTrackBackground(v string) {
	o.TrackBackground = &v
}

// GetTrackPlayed returns the TrackPlayed field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetTrackPlayed() string {
	if o == nil || isNil(o.TrackPlayed) {
		var ret string
		return ret
	}
	return *o.TrackPlayed
}

// GetTrackPlayedOk returns a tuple with the TrackPlayed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetTrackPlayedOk() (*string, bool) {
	if o == nil || isNil(o.TrackPlayed) {
    return nil, false
	}
	return o.TrackPlayed, true
}

// HasTrackPlayed returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasTrackPlayed() bool {
	if o != nil && !isNil(o.TrackPlayed) {
		return true
	}

	return false
}

// SetTrackPlayed gets a reference to the given string and assigns it to the TrackPlayed field.
func (o *PlayerUpdatePayload) SetTrackPlayed(v string) {
	o.TrackPlayed = &v
}

// GetTrackUnplayed returns the TrackUnplayed field value if set, zero value otherwise.
func (o *PlayerUpdatePayload) GetTrackUnplayed() string {
	if o == nil || isNil(o.TrackUnplayed) {
		var ret string
		return ret
	}
	return *o.TrackUnplayed
}

// GetTrackUnplayedOk returns a tuple with the TrackUnplayed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayerUpdatePayload) GetTrackUnplayedOk() (*string, bool) {
	if o == nil || isNil(o.TrackUnplayed) {
    return nil, false
	}
	return o.TrackUnplayed, true
}

// HasTrackUnplayed returns a boolean if a field has been set.
func (o *PlayerUpdatePayload) HasTrackUnplayed() bool {
	if o != nil && !isNil(o.TrackUnplayed) {
		return true
	}

	return false
}

// SetTrackUnplayed gets a reference to the given string and assigns it to the TrackUnplayed field.
func (o *PlayerUpdatePayload) SetTrackUnplayed(v string) {
	o.TrackUnplayed = &v
}

func (o PlayerUpdatePayload) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.BackgroundBottom) {
		toSerialize["backgroundBottom"] = o.BackgroundBottom
	}
	if !isNil(o.BackgroundText) {
		toSerialize["backgroundText"] = o.BackgroundText
	}
	if !isNil(o.BackgroundTop) {
		toSerialize["backgroundTop"] = o.BackgroundTop
	}
	if !isNil(o.EnableApi) {
		toSerialize["enableApi"] = o.EnableApi
	}
	if !isNil(o.EnableControls) {
		toSerialize["enableControls"] = o.EnableControls
	}
	if !isNil(o.ForceAutoplay) {
		toSerialize["forceAutoplay"] = o.ForceAutoplay
	}
	if !isNil(o.ForceLoop) {
		toSerialize["forceLoop"] = o.ForceLoop
	}
	if !isNil(o.HideTitle) {
		toSerialize["hideTitle"] = o.HideTitle
	}
	if !isNil(o.Link) {
		toSerialize["link"] = o.Link
	}
	if !isNil(o.LinkHover) {
		toSerialize["linkHover"] = o.LinkHover
	}
	if !isNil(o.Text) {
		toSerialize["text"] = o.Text
	}
	if !isNil(o.TrackBackground) {
		toSerialize["trackBackground"] = o.TrackBackground
	}
	if !isNil(o.TrackPlayed) {
		toSerialize["trackPlayed"] = o.TrackPlayed
	}
	if !isNil(o.TrackUnplayed) {
		toSerialize["trackUnplayed"] = o.TrackUnplayed
	}
	return json.Marshal(toSerialize)
}

type NullablePlayerUpdatePayload struct {
	value *PlayerUpdatePayload
	isSet bool
}

func (v NullablePlayerUpdatePayload) Get() *PlayerUpdatePayload {
	return v.value
}

func (v *NullablePlayerUpdatePayload) Set(val *PlayerUpdatePayload) {
	v.value = val
	v.isSet = true
}

func (v NullablePlayerUpdatePayload) IsSet() bool {
	return v.isSet
}

func (v *NullablePlayerUpdatePayload) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePlayerUpdatePayload(val *PlayerUpdatePayload) *NullablePlayerUpdatePayload {
	return &NullablePlayerUpdatePayload{value: val, isSet: true}
}

func (v NullablePlayerUpdatePayload) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePlayerUpdatePayload) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

