/*
Slack Web API

One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

API version: 1.7.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package slack

import (
	"encoding/json"
)

// ConversationIMChannelObjectFromConversationsMethods struct for ConversationIMChannelObjectFromConversationsMethods
type ConversationIMChannelObjectFromConversationsMethods struct {
	Created int32 `json:"created"`
	HasPins *bool `json:"has_pins,omitempty"`
	Id string `json:"id"`
	IsArchived *bool `json:"is_archived,omitempty"`
	IsExtShared *bool `json:"is_ext_shared,omitempty"`
	IsFrozen *bool `json:"is_frozen,omitempty"`
	IsIm bool `json:"is_im"`
	IsOpen *bool `json:"is_open,omitempty"`
	IsOrgShared bool `json:"is_org_shared"`
	IsShared *bool `json:"is_shared,omitempty"`
	IsStarred *bool `json:"is_starred,omitempty"`
	IsUserDeleted *bool `json:"is_user_deleted,omitempty"`
	LastRead *string `json:"last_read,omitempty"`
	Latest []ObjsChannelLatestInner `json:"latest,omitempty"`
	ParentConversation []ConversationObjectParentConversationInner `json:"parent_conversation,omitempty"`
	PinCount *int32 `json:"pin_count,omitempty"`
	Priority float32 `json:"priority"`
	Shares []ConversationIMChannelObjectFromConversationsMethodsSharesInner `json:"shares,omitempty"`
	UnreadCount *int32 `json:"unread_count,omitempty"`
	UnreadCountDisplay *int32 `json:"unread_count_display,omitempty"`
	User string `json:"user"`
	Version *int32 `json:"version,omitempty"`
}

// NewConversationIMChannelObjectFromConversationsMethods instantiates a new ConversationIMChannelObjectFromConversationsMethods object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewConversationIMChannelObjectFromConversationsMethods(created int32, id string, isIm bool, isOrgShared bool, priority float32, user string) *ConversationIMChannelObjectFromConversationsMethods {
	this := ConversationIMChannelObjectFromConversationsMethods{}
	this.Created = created
	this.Id = id
	this.IsIm = isIm
	this.IsOrgShared = isOrgShared
	this.Priority = priority
	this.User = user
	return &this
}

// NewConversationIMChannelObjectFromConversationsMethodsWithDefaults instantiates a new ConversationIMChannelObjectFromConversationsMethods object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewConversationIMChannelObjectFromConversationsMethodsWithDefaults() *ConversationIMChannelObjectFromConversationsMethods {
	this := ConversationIMChannelObjectFromConversationsMethods{}
	return &this
}

// GetCreated returns the Created field value
func (o *ConversationIMChannelObjectFromConversationsMethods) GetCreated() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Created
}

// GetCreatedOk returns a tuple with the Created field value
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetCreatedOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Created, true
}

// SetCreated sets field value
func (o *ConversationIMChannelObjectFromConversationsMethods) SetCreated(v int32) {
	o.Created = v
}

// GetHasPins returns the HasPins field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetHasPins() bool {
	if o == nil || isNil(o.HasPins) {
		var ret bool
		return ret
	}
	return *o.HasPins
}

// GetHasPinsOk returns a tuple with the HasPins field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetHasPinsOk() (*bool, bool) {
	if o == nil || isNil(o.HasPins) {
    return nil, false
	}
	return o.HasPins, true
}

// HasHasPins returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasHasPins() bool {
	if o != nil && !isNil(o.HasPins) {
		return true
	}

	return false
}

// SetHasPins gets a reference to the given bool and assigns it to the HasPins field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetHasPins(v bool) {
	o.HasPins = &v
}

// GetId returns the Id field value
func (o *ConversationIMChannelObjectFromConversationsMethods) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ConversationIMChannelObjectFromConversationsMethods) SetId(v string) {
	o.Id = v
}

// GetIsArchived returns the IsArchived field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsArchived() bool {
	if o == nil || isNil(o.IsArchived) {
		var ret bool
		return ret
	}
	return *o.IsArchived
}

// GetIsArchivedOk returns a tuple with the IsArchived field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsArchivedOk() (*bool, bool) {
	if o == nil || isNil(o.IsArchived) {
    return nil, false
	}
	return o.IsArchived, true
}

// HasIsArchived returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsArchived() bool {
	if o != nil && !isNil(o.IsArchived) {
		return true
	}

	return false
}

// SetIsArchived gets a reference to the given bool and assigns it to the IsArchived field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsArchived(v bool) {
	o.IsArchived = &v
}

// GetIsExtShared returns the IsExtShared field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsExtShared() bool {
	if o == nil || isNil(o.IsExtShared) {
		var ret bool
		return ret
	}
	return *o.IsExtShared
}

// GetIsExtSharedOk returns a tuple with the IsExtShared field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsExtSharedOk() (*bool, bool) {
	if o == nil || isNil(o.IsExtShared) {
    return nil, false
	}
	return o.IsExtShared, true
}

// HasIsExtShared returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsExtShared() bool {
	if o != nil && !isNil(o.IsExtShared) {
		return true
	}

	return false
}

// SetIsExtShared gets a reference to the given bool and assigns it to the IsExtShared field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsExtShared(v bool) {
	o.IsExtShared = &v
}

// GetIsFrozen returns the IsFrozen field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsFrozen() bool {
	if o == nil || isNil(o.IsFrozen) {
		var ret bool
		return ret
	}
	return *o.IsFrozen
}

// GetIsFrozenOk returns a tuple with the IsFrozen field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsFrozenOk() (*bool, bool) {
	if o == nil || isNil(o.IsFrozen) {
    return nil, false
	}
	return o.IsFrozen, true
}

// HasIsFrozen returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsFrozen() bool {
	if o != nil && !isNil(o.IsFrozen) {
		return true
	}

	return false
}

// SetIsFrozen gets a reference to the given bool and assigns it to the IsFrozen field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsFrozen(v bool) {
	o.IsFrozen = &v
}

// GetIsIm returns the IsIm field value
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsIm() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.IsIm
}

// GetIsImOk returns a tuple with the IsIm field value
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsImOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.IsIm, true
}

// SetIsIm sets field value
func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsIm(v bool) {
	o.IsIm = v
}

// GetIsOpen returns the IsOpen field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsOpen() bool {
	if o == nil || isNil(o.IsOpen) {
		var ret bool
		return ret
	}
	return *o.IsOpen
}

// GetIsOpenOk returns a tuple with the IsOpen field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsOpenOk() (*bool, bool) {
	if o == nil || isNil(o.IsOpen) {
    return nil, false
	}
	return o.IsOpen, true
}

// HasIsOpen returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsOpen() bool {
	if o != nil && !isNil(o.IsOpen) {
		return true
	}

	return false
}

// SetIsOpen gets a reference to the given bool and assigns it to the IsOpen field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsOpen(v bool) {
	o.IsOpen = &v
}

// GetIsOrgShared returns the IsOrgShared field value
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsOrgShared() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.IsOrgShared
}

// GetIsOrgSharedOk returns a tuple with the IsOrgShared field value
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsOrgSharedOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.IsOrgShared, true
}

// SetIsOrgShared sets field value
func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsOrgShared(v bool) {
	o.IsOrgShared = v
}

// GetIsShared returns the IsShared field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsShared() bool {
	if o == nil || isNil(o.IsShared) {
		var ret bool
		return ret
	}
	return *o.IsShared
}

// GetIsSharedOk returns a tuple with the IsShared field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsSharedOk() (*bool, bool) {
	if o == nil || isNil(o.IsShared) {
    return nil, false
	}
	return o.IsShared, true
}

// HasIsShared returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsShared() bool {
	if o != nil && !isNil(o.IsShared) {
		return true
	}

	return false
}

// SetIsShared gets a reference to the given bool and assigns it to the IsShared field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsShared(v bool) {
	o.IsShared = &v
}

// GetIsStarred returns the IsStarred field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsStarred() bool {
	if o == nil || isNil(o.IsStarred) {
		var ret bool
		return ret
	}
	return *o.IsStarred
}

// GetIsStarredOk returns a tuple with the IsStarred field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsStarredOk() (*bool, bool) {
	if o == nil || isNil(o.IsStarred) {
    return nil, false
	}
	return o.IsStarred, true
}

// HasIsStarred returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsStarred() bool {
	if o != nil && !isNil(o.IsStarred) {
		return true
	}

	return false
}

// SetIsStarred gets a reference to the given bool and assigns it to the IsStarred field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsStarred(v bool) {
	o.IsStarred = &v
}

// GetIsUserDeleted returns the IsUserDeleted field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsUserDeleted() bool {
	if o == nil || isNil(o.IsUserDeleted) {
		var ret bool
		return ret
	}
	return *o.IsUserDeleted
}

// GetIsUserDeletedOk returns a tuple with the IsUserDeleted field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsUserDeletedOk() (*bool, bool) {
	if o == nil || isNil(o.IsUserDeleted) {
    return nil, false
	}
	return o.IsUserDeleted, true
}

// HasIsUserDeleted returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsUserDeleted() bool {
	if o != nil && !isNil(o.IsUserDeleted) {
		return true
	}

	return false
}

// SetIsUserDeleted gets a reference to the given bool and assigns it to the IsUserDeleted field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsUserDeleted(v bool) {
	o.IsUserDeleted = &v
}

// GetLastRead returns the LastRead field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetLastRead() string {
	if o == nil || isNil(o.LastRead) {
		var ret string
		return ret
	}
	return *o.LastRead
}

// GetLastReadOk returns a tuple with the LastRead field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetLastReadOk() (*string, bool) {
	if o == nil || isNil(o.LastRead) {
    return nil, false
	}
	return o.LastRead, true
}

// HasLastRead returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasLastRead() bool {
	if o != nil && !isNil(o.LastRead) {
		return true
	}

	return false
}

// SetLastRead gets a reference to the given string and assigns it to the LastRead field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetLastRead(v string) {
	o.LastRead = &v
}

// GetLatest returns the Latest field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetLatest() []ObjsChannelLatestInner {
	if o == nil || isNil(o.Latest) {
		var ret []ObjsChannelLatestInner
		return ret
	}
	return o.Latest
}

// GetLatestOk returns a tuple with the Latest field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetLatestOk() ([]ObjsChannelLatestInner, bool) {
	if o == nil || isNil(o.Latest) {
    return nil, false
	}
	return o.Latest, true
}

// HasLatest returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasLatest() bool {
	if o != nil && !isNil(o.Latest) {
		return true
	}

	return false
}

// SetLatest gets a reference to the given []ObjsChannelLatestInner and assigns it to the Latest field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetLatest(v []ObjsChannelLatestInner) {
	o.Latest = v
}

// GetParentConversation returns the ParentConversation field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetParentConversation() []ConversationObjectParentConversationInner {
	if o == nil || isNil(o.ParentConversation) {
		var ret []ConversationObjectParentConversationInner
		return ret
	}
	return o.ParentConversation
}

// GetParentConversationOk returns a tuple with the ParentConversation field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetParentConversationOk() ([]ConversationObjectParentConversationInner, bool) {
	if o == nil || isNil(o.ParentConversation) {
    return nil, false
	}
	return o.ParentConversation, true
}

// HasParentConversation returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasParentConversation() bool {
	if o != nil && !isNil(o.ParentConversation) {
		return true
	}

	return false
}

// SetParentConversation gets a reference to the given []ConversationObjectParentConversationInner and assigns it to the ParentConversation field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetParentConversation(v []ConversationObjectParentConversationInner) {
	o.ParentConversation = v
}

// GetPinCount returns the PinCount field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetPinCount() int32 {
	if o == nil || isNil(o.PinCount) {
		var ret int32
		return ret
	}
	return *o.PinCount
}

// GetPinCountOk returns a tuple with the PinCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetPinCountOk() (*int32, bool) {
	if o == nil || isNil(o.PinCount) {
    return nil, false
	}
	return o.PinCount, true
}

// HasPinCount returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasPinCount() bool {
	if o != nil && !isNil(o.PinCount) {
		return true
	}

	return false
}

// SetPinCount gets a reference to the given int32 and assigns it to the PinCount field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetPinCount(v int32) {
	o.PinCount = &v
}

// GetPriority returns the Priority field value
func (o *ConversationIMChannelObjectFromConversationsMethods) GetPriority() float32 {
	if o == nil {
		var ret float32
		return ret
	}

	return o.Priority
}

// GetPriorityOk returns a tuple with the Priority field value
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetPriorityOk() (*float32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Priority, true
}

// SetPriority sets field value
func (o *ConversationIMChannelObjectFromConversationsMethods) SetPriority(v float32) {
	o.Priority = v
}

// GetShares returns the Shares field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetShares() []ConversationIMChannelObjectFromConversationsMethodsSharesInner {
	if o == nil || isNil(o.Shares) {
		var ret []ConversationIMChannelObjectFromConversationsMethodsSharesInner
		return ret
	}
	return o.Shares
}

// GetSharesOk returns a tuple with the Shares field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetSharesOk() ([]ConversationIMChannelObjectFromConversationsMethodsSharesInner, bool) {
	if o == nil || isNil(o.Shares) {
    return nil, false
	}
	return o.Shares, true
}

// HasShares returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasShares() bool {
	if o != nil && !isNil(o.Shares) {
		return true
	}

	return false
}

// SetShares gets a reference to the given []ConversationIMChannelObjectFromConversationsMethodsSharesInner and assigns it to the Shares field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetShares(v []ConversationIMChannelObjectFromConversationsMethodsSharesInner) {
	o.Shares = v
}

// GetUnreadCount returns the UnreadCount field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetUnreadCount() int32 {
	if o == nil || isNil(o.UnreadCount) {
		var ret int32
		return ret
	}
	return *o.UnreadCount
}

// GetUnreadCountOk returns a tuple with the UnreadCount field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetUnreadCountOk() (*int32, bool) {
	if o == nil || isNil(o.UnreadCount) {
    return nil, false
	}
	return o.UnreadCount, true
}

// HasUnreadCount returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasUnreadCount() bool {
	if o != nil && !isNil(o.UnreadCount) {
		return true
	}

	return false
}

// SetUnreadCount gets a reference to the given int32 and assigns it to the UnreadCount field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetUnreadCount(v int32) {
	o.UnreadCount = &v
}

// GetUnreadCountDisplay returns the UnreadCountDisplay field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetUnreadCountDisplay() int32 {
	if o == nil || isNil(o.UnreadCountDisplay) {
		var ret int32
		return ret
	}
	return *o.UnreadCountDisplay
}

// GetUnreadCountDisplayOk returns a tuple with the UnreadCountDisplay field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetUnreadCountDisplayOk() (*int32, bool) {
	if o == nil || isNil(o.UnreadCountDisplay) {
    return nil, false
	}
	return o.UnreadCountDisplay, true
}

// HasUnreadCountDisplay returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasUnreadCountDisplay() bool {
	if o != nil && !isNil(o.UnreadCountDisplay) {
		return true
	}

	return false
}

// SetUnreadCountDisplay gets a reference to the given int32 and assigns it to the UnreadCountDisplay field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetUnreadCountDisplay(v int32) {
	o.UnreadCountDisplay = &v
}

// GetUser returns the User field value
func (o *ConversationIMChannelObjectFromConversationsMethods) GetUser() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.User
}

// GetUserOk returns a tuple with the User field value
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetUserOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.User, true
}

// SetUser sets field value
func (o *ConversationIMChannelObjectFromConversationsMethods) SetUser(v string) {
	o.User = v
}

// GetVersion returns the Version field value if set, zero value otherwise.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetVersion() int32 {
	if o == nil || isNil(o.Version) {
		var ret int32
		return ret
	}
	return *o.Version
}

// GetVersionOk returns a tuple with the Version field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) GetVersionOk() (*int32, bool) {
	if o == nil || isNil(o.Version) {
    return nil, false
	}
	return o.Version, true
}

// HasVersion returns a boolean if a field has been set.
func (o *ConversationIMChannelObjectFromConversationsMethods) HasVersion() bool {
	if o != nil && !isNil(o.Version) {
		return true
	}

	return false
}

// SetVersion gets a reference to the given int32 and assigns it to the Version field.
func (o *ConversationIMChannelObjectFromConversationsMethods) SetVersion(v int32) {
	o.Version = &v
}

func (o ConversationIMChannelObjectFromConversationsMethods) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["created"] = o.Created
	}
	if !isNil(o.HasPins) {
		toSerialize["has_pins"] = o.HasPins
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if !isNil(o.IsArchived) {
		toSerialize["is_archived"] = o.IsArchived
	}
	if !isNil(o.IsExtShared) {
		toSerialize["is_ext_shared"] = o.IsExtShared
	}
	if !isNil(o.IsFrozen) {
		toSerialize["is_frozen"] = o.IsFrozen
	}
	if true {
		toSerialize["is_im"] = o.IsIm
	}
	if !isNil(o.IsOpen) {
		toSerialize["is_open"] = o.IsOpen
	}
	if true {
		toSerialize["is_org_shared"] = o.IsOrgShared
	}
	if !isNil(o.IsShared) {
		toSerialize["is_shared"] = o.IsShared
	}
	if !isNil(o.IsStarred) {
		toSerialize["is_starred"] = o.IsStarred
	}
	if !isNil(o.IsUserDeleted) {
		toSerialize["is_user_deleted"] = o.IsUserDeleted
	}
	if !isNil(o.LastRead) {
		toSerialize["last_read"] = o.LastRead
	}
	if !isNil(o.Latest) {
		toSerialize["latest"] = o.Latest
	}
	if !isNil(o.ParentConversation) {
		toSerialize["parent_conversation"] = o.ParentConversation
	}
	if !isNil(o.PinCount) {
		toSerialize["pin_count"] = o.PinCount
	}
	if true {
		toSerialize["priority"] = o.Priority
	}
	if !isNil(o.Shares) {
		toSerialize["shares"] = o.Shares
	}
	if !isNil(o.UnreadCount) {
		toSerialize["unread_count"] = o.UnreadCount
	}
	if !isNil(o.UnreadCountDisplay) {
		toSerialize["unread_count_display"] = o.UnreadCountDisplay
	}
	if true {
		toSerialize["user"] = o.User
	}
	if !isNil(o.Version) {
		toSerialize["version"] = o.Version
	}
	return json.Marshal(toSerialize)
}

type NullableConversationIMChannelObjectFromConversationsMethods struct {
	value *ConversationIMChannelObjectFromConversationsMethods
	isSet bool
}

func (v NullableConversationIMChannelObjectFromConversationsMethods) Get() *ConversationIMChannelObjectFromConversationsMethods {
	return v.value
}

func (v *NullableConversationIMChannelObjectFromConversationsMethods) Set(val *ConversationIMChannelObjectFromConversationsMethods) {
	v.value = val
	v.isSet = true
}

func (v NullableConversationIMChannelObjectFromConversationsMethods) IsSet() bool {
	return v.isSet
}

func (v *NullableConversationIMChannelObjectFromConversationsMethods) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableConversationIMChannelObjectFromConversationsMethods(val *ConversationIMChannelObjectFromConversationsMethods) *NullableConversationIMChannelObjectFromConversationsMethods {
	return &NullableConversationIMChannelObjectFromConversationsMethods{value: val, isSet: true}
}

func (v NullableConversationIMChannelObjectFromConversationsMethods) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableConversationIMChannelObjectFromConversationsMethods) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


