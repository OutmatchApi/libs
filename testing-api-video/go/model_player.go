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

// Player struct for Player
type Player struct {
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
	Assets *PlayerAllOfAssets `json:"assets,omitempty"`
	// When the player was created, presented in ISO-8601 format.
	CreatedAt *time.Time `json:"createdAt,omitempty"`
	// Deprecated
	LinkActive *string `json:"linkActive,omitempty"`
	PlayerId *string `json:"playerId,omitempty"`
	// Deprecated
	ShapeAspect *string `json:"shapeAspect,omitempty"`
	// Deprecated
	ShapeBackgroundBottom *string `json:"shapeBackgroundBottom,omitempty"`
	// Deprecated
	ShapeBackgroundTop *string `json:"shapeBackgroundTop,omitempty"`
	// Deprecated
	ShapeMargin *int32 `json:"shapeMargin,omitempty"`
	// Deprecated
	ShapeRadius *int32 `json:"shapeRadius,omitempty"`
	// When the player was last updated, presented in ISO-8601 format.
	UpdatedAt *time.Time `json:"updatedAt,omitempty"`
}

// NewPlayer instantiates a new Player object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPlayer() *Player {
	this := Player{}
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

// NewPlayerWithDefaults instantiates a new Player object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPlayerWithDefaults() *Player {
	this := Player{}
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
func (o *Player) GetBackgroundBottom() string {
	if o == nil || isNil(o.BackgroundBottom) {
		var ret string
		return ret
	}
	return *o.BackgroundBottom
}

// GetBackgroundBottomOk returns a tuple with the BackgroundBottom field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetBackgroundBottomOk() (*string, bool) {
	if o == nil || isNil(o.BackgroundBottom) {
    return nil, false
	}
	return o.BackgroundBottom, true
}

// HasBackgroundBottom returns a boolean if a field has been set.
func (o *Player) HasBackgroundBottom() bool {
	if o != nil && !isNil(o.BackgroundBottom) {
		return true
	}

	return false
}

// SetBackgroundBottom gets a reference to the given string and assigns it to the BackgroundBottom field.
func (o *Player) SetBackgroundBottom(v string) {
	o.BackgroundBottom = &v
}

// GetBackgroundText returns the BackgroundText field value if set, zero value otherwise.
func (o *Player) GetBackgroundText() string {
	if o == nil || isNil(o.BackgroundText) {
		var ret string
		return ret
	}
	return *o.BackgroundText
}

// GetBackgroundTextOk returns a tuple with the BackgroundText field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetBackgroundTextOk() (*string, bool) {
	if o == nil || isNil(o.BackgroundText) {
    return nil, false
	}
	return o.BackgroundText, true
}

// HasBackgroundText returns a boolean if a field has been set.
func (o *Player) HasBackgroundText() bool {
	if o != nil && !isNil(o.BackgroundText) {
		return true
	}

	return false
}

// SetBackgroundText gets a reference to the given string and assigns it to the BackgroundText field.
func (o *Player) SetBackgroundText(v string) {
	o.BackgroundText = &v
}

// GetBackgroundTop returns the BackgroundTop field value if set, zero value otherwise.
func (o *Player) GetBackgroundTop() string {
	if o == nil || isNil(o.BackgroundTop) {
		var ret string
		return ret
	}
	return *o.BackgroundTop
}

// GetBackgroundTopOk returns a tuple with the BackgroundTop field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetBackgroundTopOk() (*string, bool) {
	if o == nil || isNil(o.BackgroundTop) {
    return nil, false
	}
	return o.BackgroundTop, true
}

// HasBackgroundTop returns a boolean if a field has been set.
func (o *Player) HasBackgroundTop() bool {
	if o != nil && !isNil(o.BackgroundTop) {
		return true
	}

	return false
}

// SetBackgroundTop gets a reference to the given string and assigns it to the BackgroundTop field.
func (o *Player) SetBackgroundTop(v string) {
	o.BackgroundTop = &v
}

// GetEnableApi returns the EnableApi field value if set, zero value otherwise.
func (o *Player) GetEnableApi() bool {
	if o == nil || isNil(o.EnableApi) {
		var ret bool
		return ret
	}
	return *o.EnableApi
}

// GetEnableApiOk returns a tuple with the EnableApi field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetEnableApiOk() (*bool, bool) {
	if o == nil || isNil(o.EnableApi) {
    return nil, false
	}
	return o.EnableApi, true
}

// HasEnableApi returns a boolean if a field has been set.
func (o *Player) HasEnableApi() bool {
	if o != nil && !isNil(o.EnableApi) {
		return true
	}

	return false
}

// SetEnableApi gets a reference to the given bool and assigns it to the EnableApi field.
func (o *Player) SetEnableApi(v bool) {
	o.EnableApi = &v
}

// GetEnableControls returns the EnableControls field value if set, zero value otherwise.
func (o *Player) GetEnableControls() bool {
	if o == nil || isNil(o.EnableControls) {
		var ret bool
		return ret
	}
	return *o.EnableControls
}

// GetEnableControlsOk returns a tuple with the EnableControls field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetEnableControlsOk() (*bool, bool) {
	if o == nil || isNil(o.EnableControls) {
    return nil, false
	}
	return o.EnableControls, true
}

// HasEnableControls returns a boolean if a field has been set.
func (o *Player) HasEnableControls() bool {
	if o != nil && !isNil(o.EnableControls) {
		return true
	}

	return false
}

// SetEnableControls gets a reference to the given bool and assigns it to the EnableControls field.
func (o *Player) SetEnableControls(v bool) {
	o.EnableControls = &v
}

// GetForceAutoplay returns the ForceAutoplay field value if set, zero value otherwise.
func (o *Player) GetForceAutoplay() bool {
	if o == nil || isNil(o.ForceAutoplay) {
		var ret bool
		return ret
	}
	return *o.ForceAutoplay
}

// GetForceAutoplayOk returns a tuple with the ForceAutoplay field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetForceAutoplayOk() (*bool, bool) {
	if o == nil || isNil(o.ForceAutoplay) {
    return nil, false
	}
	return o.ForceAutoplay, true
}

// HasForceAutoplay returns a boolean if a field has been set.
func (o *Player) HasForceAutoplay() bool {
	if o != nil && !isNil(o.ForceAutoplay) {
		return true
	}

	return false
}

// SetForceAutoplay gets a reference to the given bool and assigns it to the ForceAutoplay field.
func (o *Player) SetForceAutoplay(v bool) {
	o.ForceAutoplay = &v
}

// GetForceLoop returns the ForceLoop field value if set, zero value otherwise.
func (o *Player) GetForceLoop() bool {
	if o == nil || isNil(o.ForceLoop) {
		var ret bool
		return ret
	}
	return *o.ForceLoop
}

// GetForceLoopOk returns a tuple with the ForceLoop field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetForceLoopOk() (*bool, bool) {
	if o == nil || isNil(o.ForceLoop) {
    return nil, false
	}
	return o.ForceLoop, true
}

// HasForceLoop returns a boolean if a field has been set.
func (o *Player) HasForceLoop() bool {
	if o != nil && !isNil(o.ForceLoop) {
		return true
	}

	return false
}

// SetForceLoop gets a reference to the given bool and assigns it to the ForceLoop field.
func (o *Player) SetForceLoop(v bool) {
	o.ForceLoop = &v
}

// GetHideTitle returns the HideTitle field value if set, zero value otherwise.
func (o *Player) GetHideTitle() bool {
	if o == nil || isNil(o.HideTitle) {
		var ret bool
		return ret
	}
	return *o.HideTitle
}

// GetHideTitleOk returns a tuple with the HideTitle field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetHideTitleOk() (*bool, bool) {
	if o == nil || isNil(o.HideTitle) {
    return nil, false
	}
	return o.HideTitle, true
}

// HasHideTitle returns a boolean if a field has been set.
func (o *Player) HasHideTitle() bool {
	if o != nil && !isNil(o.HideTitle) {
		return true
	}

	return false
}

// SetHideTitle gets a reference to the given bool and assigns it to the HideTitle field.
func (o *Player) SetHideTitle(v bool) {
	o.HideTitle = &v
}

// GetLink returns the Link field value if set, zero value otherwise.
func (o *Player) GetLink() string {
	if o == nil || isNil(o.Link) {
		var ret string
		return ret
	}
	return *o.Link
}

// GetLinkOk returns a tuple with the Link field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetLinkOk() (*string, bool) {
	if o == nil || isNil(o.Link) {
    return nil, false
	}
	return o.Link, true
}

// HasLink returns a boolean if a field has been set.
func (o *Player) HasLink() bool {
	if o != nil && !isNil(o.Link) {
		return true
	}

	return false
}

// SetLink gets a reference to the given string and assigns it to the Link field.
func (o *Player) SetLink(v string) {
	o.Link = &v
}

// GetLinkHover returns the LinkHover field value if set, zero value otherwise.
func (o *Player) GetLinkHover() string {
	if o == nil || isNil(o.LinkHover) {
		var ret string
		return ret
	}
	return *o.LinkHover
}

// GetLinkHoverOk returns a tuple with the LinkHover field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetLinkHoverOk() (*string, bool) {
	if o == nil || isNil(o.LinkHover) {
    return nil, false
	}
	return o.LinkHover, true
}

// HasLinkHover returns a boolean if a field has been set.
func (o *Player) HasLinkHover() bool {
	if o != nil && !isNil(o.LinkHover) {
		return true
	}

	return false
}

// SetLinkHover gets a reference to the given string and assigns it to the LinkHover field.
func (o *Player) SetLinkHover(v string) {
	o.LinkHover = &v
}

// GetText returns the Text field value if set, zero value otherwise.
func (o *Player) GetText() string {
	if o == nil || isNil(o.Text) {
		var ret string
		return ret
	}
	return *o.Text
}

// GetTextOk returns a tuple with the Text field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetTextOk() (*string, bool) {
	if o == nil || isNil(o.Text) {
    return nil, false
	}
	return o.Text, true
}

// HasText returns a boolean if a field has been set.
func (o *Player) HasText() bool {
	if o != nil && !isNil(o.Text) {
		return true
	}

	return false
}

// SetText gets a reference to the given string and assigns it to the Text field.
func (o *Player) SetText(v string) {
	o.Text = &v
}

// GetTrackBackground returns the TrackBackground field value if set, zero value otherwise.
func (o *Player) GetTrackBackground() string {
	if o == nil || isNil(o.TrackBackground) {
		var ret string
		return ret
	}
	return *o.TrackBackground
}

// GetTrackBackgroundOk returns a tuple with the TrackBackground field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetTrackBackgroundOk() (*string, bool) {
	if o == nil || isNil(o.TrackBackground) {
    return nil, false
	}
	return o.TrackBackground, true
}

// HasTrackBackground returns a boolean if a field has been set.
func (o *Player) HasTrackBackground() bool {
	if o != nil && !isNil(o.TrackBackground) {
		return true
	}

	return false
}

// SetTrackBackground gets a reference to the given string and assigns it to the TrackBackground field.
func (o *Player) SetTrackBackground(v string) {
	o.TrackBackground = &v
}

// GetTrackPlayed returns the TrackPlayed field value if set, zero value otherwise.
func (o *Player) GetTrackPlayed() string {
	if o == nil || isNil(o.TrackPlayed) {
		var ret string
		return ret
	}
	return *o.TrackPlayed
}

// GetTrackPlayedOk returns a tuple with the TrackPlayed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetTrackPlayedOk() (*string, bool) {
	if o == nil || isNil(o.TrackPlayed) {
    return nil, false
	}
	return o.TrackPlayed, true
}

// HasTrackPlayed returns a boolean if a field has been set.
func (o *Player) HasTrackPlayed() bool {
	if o != nil && !isNil(o.TrackPlayed) {
		return true
	}

	return false
}

// SetTrackPlayed gets a reference to the given string and assigns it to the TrackPlayed field.
func (o *Player) SetTrackPlayed(v string) {
	o.TrackPlayed = &v
}

// GetTrackUnplayed returns the TrackUnplayed field value if set, zero value otherwise.
func (o *Player) GetTrackUnplayed() string {
	if o == nil || isNil(o.TrackUnplayed) {
		var ret string
		return ret
	}
	return *o.TrackUnplayed
}

// GetTrackUnplayedOk returns a tuple with the TrackUnplayed field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetTrackUnplayedOk() (*string, bool) {
	if o == nil || isNil(o.TrackUnplayed) {
    return nil, false
	}
	return o.TrackUnplayed, true
}

// HasTrackUnplayed returns a boolean if a field has been set.
func (o *Player) HasTrackUnplayed() bool {
	if o != nil && !isNil(o.TrackUnplayed) {
		return true
	}

	return false
}

// SetTrackUnplayed gets a reference to the given string and assigns it to the TrackUnplayed field.
func (o *Player) SetTrackUnplayed(v string) {
	o.TrackUnplayed = &v
}

// GetAssets returns the Assets field value if set, zero value otherwise.
func (o *Player) GetAssets() PlayerAllOfAssets {
	if o == nil || isNil(o.Assets) {
		var ret PlayerAllOfAssets
		return ret
	}
	return *o.Assets
}

// GetAssetsOk returns a tuple with the Assets field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetAssetsOk() (*PlayerAllOfAssets, bool) {
	if o == nil || isNil(o.Assets) {
    return nil, false
	}
	return o.Assets, true
}

// HasAssets returns a boolean if a field has been set.
func (o *Player) HasAssets() bool {
	if o != nil && !isNil(o.Assets) {
		return true
	}

	return false
}

// SetAssets gets a reference to the given PlayerAllOfAssets and assigns it to the Assets field.
func (o *Player) SetAssets(v PlayerAllOfAssets) {
	o.Assets = &v
}

// GetCreatedAt returns the CreatedAt field value if set, zero value otherwise.
func (o *Player) GetCreatedAt() time.Time {
	if o == nil || isNil(o.CreatedAt) {
		var ret time.Time
		return ret
	}
	return *o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil || isNil(o.CreatedAt) {
    return nil, false
	}
	return o.CreatedAt, true
}

// HasCreatedAt returns a boolean if a field has been set.
func (o *Player) HasCreatedAt() bool {
	if o != nil && !isNil(o.CreatedAt) {
		return true
	}

	return false
}

// SetCreatedAt gets a reference to the given time.Time and assigns it to the CreatedAt field.
func (o *Player) SetCreatedAt(v time.Time) {
	o.CreatedAt = &v
}

// GetLinkActive returns the LinkActive field value if set, zero value otherwise.
func (o *Player) GetLinkActive() string {
	if o == nil || isNil(o.LinkActive) {
		var ret string
		return ret
	}
	return *o.LinkActive
}

// GetLinkActiveOk returns a tuple with the LinkActive field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetLinkActiveOk() (*string, bool) {
	if o == nil || isNil(o.LinkActive) {
    return nil, false
	}
	return o.LinkActive, true
}

// HasLinkActive returns a boolean if a field has been set.
func (o *Player) HasLinkActive() bool {
	if o != nil && !isNil(o.LinkActive) {
		return true
	}

	return false
}

// SetLinkActive gets a reference to the given string and assigns it to the LinkActive field.
func (o *Player) SetLinkActive(v string) {
	o.LinkActive = &v
}

// GetPlayerId returns the PlayerId field value if set, zero value otherwise.
func (o *Player) GetPlayerId() string {
	if o == nil || isNil(o.PlayerId) {
		var ret string
		return ret
	}
	return *o.PlayerId
}

// GetPlayerIdOk returns a tuple with the PlayerId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetPlayerIdOk() (*string, bool) {
	if o == nil || isNil(o.PlayerId) {
    return nil, false
	}
	return o.PlayerId, true
}

// HasPlayerId returns a boolean if a field has been set.
func (o *Player) HasPlayerId() bool {
	if o != nil && !isNil(o.PlayerId) {
		return true
	}

	return false
}

// SetPlayerId gets a reference to the given string and assigns it to the PlayerId field.
func (o *Player) SetPlayerId(v string) {
	o.PlayerId = &v
}

// GetShapeAspect returns the ShapeAspect field value if set, zero value otherwise.
func (o *Player) GetShapeAspect() string {
	if o == nil || isNil(o.ShapeAspect) {
		var ret string
		return ret
	}
	return *o.ShapeAspect
}

// GetShapeAspectOk returns a tuple with the ShapeAspect field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetShapeAspectOk() (*string, bool) {
	if o == nil || isNil(o.ShapeAspect) {
    return nil, false
	}
	return o.ShapeAspect, true
}

// HasShapeAspect returns a boolean if a field has been set.
func (o *Player) HasShapeAspect() bool {
	if o != nil && !isNil(o.ShapeAspect) {
		return true
	}

	return false
}

// SetShapeAspect gets a reference to the given string and assigns it to the ShapeAspect field.
func (o *Player) SetShapeAspect(v string) {
	o.ShapeAspect = &v
}

// GetShapeBackgroundBottom returns the ShapeBackgroundBottom field value if set, zero value otherwise.
func (o *Player) GetShapeBackgroundBottom() string {
	if o == nil || isNil(o.ShapeBackgroundBottom) {
		var ret string
		return ret
	}
	return *o.ShapeBackgroundBottom
}

// GetShapeBackgroundBottomOk returns a tuple with the ShapeBackgroundBottom field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetShapeBackgroundBottomOk() (*string, bool) {
	if o == nil || isNil(o.ShapeBackgroundBottom) {
    return nil, false
	}
	return o.ShapeBackgroundBottom, true
}

// HasShapeBackgroundBottom returns a boolean if a field has been set.
func (o *Player) HasShapeBackgroundBottom() bool {
	if o != nil && !isNil(o.ShapeBackgroundBottom) {
		return true
	}

	return false
}

// SetShapeBackgroundBottom gets a reference to the given string and assigns it to the ShapeBackgroundBottom field.
func (o *Player) SetShapeBackgroundBottom(v string) {
	o.ShapeBackgroundBottom = &v
}

// GetShapeBackgroundTop returns the ShapeBackgroundTop field value if set, zero value otherwise.
func (o *Player) GetShapeBackgroundTop() string {
	if o == nil || isNil(o.ShapeBackgroundTop) {
		var ret string
		return ret
	}
	return *o.ShapeBackgroundTop
}

// GetShapeBackgroundTopOk returns a tuple with the ShapeBackgroundTop field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetShapeBackgroundTopOk() (*string, bool) {
	if o == nil || isNil(o.ShapeBackgroundTop) {
    return nil, false
	}
	return o.ShapeBackgroundTop, true
}

// HasShapeBackgroundTop returns a boolean if a field has been set.
func (o *Player) HasShapeBackgroundTop() bool {
	if o != nil && !isNil(o.ShapeBackgroundTop) {
		return true
	}

	return false
}

// SetShapeBackgroundTop gets a reference to the given string and assigns it to the ShapeBackgroundTop field.
func (o *Player) SetShapeBackgroundTop(v string) {
	o.ShapeBackgroundTop = &v
}

// GetShapeMargin returns the ShapeMargin field value if set, zero value otherwise.
func (o *Player) GetShapeMargin() int32 {
	if o == nil || isNil(o.ShapeMargin) {
		var ret int32
		return ret
	}
	return *o.ShapeMargin
}

// GetShapeMarginOk returns a tuple with the ShapeMargin field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetShapeMarginOk() (*int32, bool) {
	if o == nil || isNil(o.ShapeMargin) {
    return nil, false
	}
	return o.ShapeMargin, true
}

// HasShapeMargin returns a boolean if a field has been set.
func (o *Player) HasShapeMargin() bool {
	if o != nil && !isNil(o.ShapeMargin) {
		return true
	}

	return false
}

// SetShapeMargin gets a reference to the given int32 and assigns it to the ShapeMargin field.
func (o *Player) SetShapeMargin(v int32) {
	o.ShapeMargin = &v
}

// GetShapeRadius returns the ShapeRadius field value if set, zero value otherwise.
func (o *Player) GetShapeRadius() int32 {
	if o == nil || isNil(o.ShapeRadius) {
		var ret int32
		return ret
	}
	return *o.ShapeRadius
}

// GetShapeRadiusOk returns a tuple with the ShapeRadius field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetShapeRadiusOk() (*int32, bool) {
	if o == nil || isNil(o.ShapeRadius) {
    return nil, false
	}
	return o.ShapeRadius, true
}

// HasShapeRadius returns a boolean if a field has been set.
func (o *Player) HasShapeRadius() bool {
	if o != nil && !isNil(o.ShapeRadius) {
		return true
	}

	return false
}

// SetShapeRadius gets a reference to the given int32 and assigns it to the ShapeRadius field.
func (o *Player) SetShapeRadius(v int32) {
	o.ShapeRadius = &v
}

// GetUpdatedAt returns the UpdatedAt field value if set, zero value otherwise.
func (o *Player) GetUpdatedAt() time.Time {
	if o == nil || isNil(o.UpdatedAt) {
		var ret time.Time
		return ret
	}
	return *o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Player) GetUpdatedAtOk() (*time.Time, bool) {
	if o == nil || isNil(o.UpdatedAt) {
    return nil, false
	}
	return o.UpdatedAt, true
}

// HasUpdatedAt returns a boolean if a field has been set.
func (o *Player) HasUpdatedAt() bool {
	if o != nil && !isNil(o.UpdatedAt) {
		return true
	}

	return false
}

// SetUpdatedAt gets a reference to the given time.Time and assigns it to the UpdatedAt field.
func (o *Player) SetUpdatedAt(v time.Time) {
	o.UpdatedAt = &v
}

func (o Player) MarshalJSON() ([]byte, error) {
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
	if !isNil(o.Assets) {
		toSerialize["assets"] = o.Assets
	}
	if !isNil(o.CreatedAt) {
		toSerialize["createdAt"] = o.CreatedAt
	}
	if !isNil(o.LinkActive) {
		toSerialize["linkActive"] = o.LinkActive
	}
	if !isNil(o.PlayerId) {
		toSerialize["playerId"] = o.PlayerId
	}
	if !isNil(o.ShapeAspect) {
		toSerialize["shapeAspect"] = o.ShapeAspect
	}
	if !isNil(o.ShapeBackgroundBottom) {
		toSerialize["shapeBackgroundBottom"] = o.ShapeBackgroundBottom
	}
	if !isNil(o.ShapeBackgroundTop) {
		toSerialize["shapeBackgroundTop"] = o.ShapeBackgroundTop
	}
	if !isNil(o.ShapeMargin) {
		toSerialize["shapeMargin"] = o.ShapeMargin
	}
	if !isNil(o.ShapeRadius) {
		toSerialize["shapeRadius"] = o.ShapeRadius
	}
	if !isNil(o.UpdatedAt) {
		toSerialize["updatedAt"] = o.UpdatedAt
	}
	return json.Marshal(toSerialize)
}

type NullablePlayer struct {
	value *Player
	isSet bool
}

func (v NullablePlayer) Get() *Player {
	return v.value
}

func (v *NullablePlayer) Set(val *Player) {
	v.value = val
	v.isSet = true
}

func (v NullablePlayer) IsSet() bool {
	return v.isSet
}

func (v *NullablePlayer) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePlayer(val *Player) *NullablePlayer {
	return &NullablePlayer{value: val, isSet: true}
}

func (v NullablePlayer) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePlayer) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

