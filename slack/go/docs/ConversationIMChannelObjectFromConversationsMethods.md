# ConversationIMChannelObjectFromConversationsMethods

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Created** | **int32** |  | 
**HasPins** | Pointer to **bool** |  | [optional] 
**Id** | **string** |  | 
**IsArchived** | Pointer to **bool** |  | [optional] 
**IsExtShared** | Pointer to **bool** |  | [optional] 
**IsFrozen** | Pointer to **bool** |  | [optional] 
**IsIm** | **bool** |  | 
**IsOpen** | Pointer to **bool** |  | [optional] 
**IsOrgShared** | **bool** |  | 
**IsShared** | Pointer to **bool** |  | [optional] 
**IsStarred** | Pointer to **bool** |  | [optional] 
**IsUserDeleted** | Pointer to **bool** |  | [optional] 
**LastRead** | Pointer to **string** |  | [optional] 
**Latest** | Pointer to [**[]ObjsChannelLatestInner**](ObjsChannelLatestInner.md) |  | [optional] 
**ParentConversation** | Pointer to [**[]ConversationObjectParentConversationInner**](ConversationObjectParentConversationInner.md) |  | [optional] 
**PinCount** | Pointer to **int32** |  | [optional] 
**Priority** | **float32** |  | 
**Shares** | Pointer to [**[]ConversationIMChannelObjectFromConversationsMethodsSharesInner**](ConversationIMChannelObjectFromConversationsMethodsSharesInner.md) |  | [optional] 
**UnreadCount** | Pointer to **int32** |  | [optional] 
**UnreadCountDisplay** | Pointer to **int32** |  | [optional] 
**User** | **string** |  | 
**Version** | Pointer to **int32** |  | [optional] 

## Methods

### NewConversationIMChannelObjectFromConversationsMethods

`func NewConversationIMChannelObjectFromConversationsMethods(created int32, id string, isIm bool, isOrgShared bool, priority float32, user string, ) *ConversationIMChannelObjectFromConversationsMethods`

NewConversationIMChannelObjectFromConversationsMethods instantiates a new ConversationIMChannelObjectFromConversationsMethods object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationIMChannelObjectFromConversationsMethodsWithDefaults

`func NewConversationIMChannelObjectFromConversationsMethodsWithDefaults() *ConversationIMChannelObjectFromConversationsMethods`

NewConversationIMChannelObjectFromConversationsMethodsWithDefaults instantiates a new ConversationIMChannelObjectFromConversationsMethods object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCreated

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetCreated(v int32)`

SetCreated sets Created field to given value.


### GetHasPins

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetHasPins() bool`

GetHasPins returns the HasPins field if non-nil, zero value otherwise.

### GetHasPinsOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetHasPinsOk() (*bool, bool)`

GetHasPinsOk returns a tuple with the HasPins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasPins

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetHasPins(v bool)`

SetHasPins sets HasPins field to given value.

### HasHasPins

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasHasPins() bool`

HasHasPins returns a boolean if a field has been set.

### GetId

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetId(v string)`

SetId sets Id field to given value.


### GetIsArchived

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsArchived() bool`

GetIsArchived returns the IsArchived field if non-nil, zero value otherwise.

### GetIsArchivedOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsArchivedOk() (*bool, bool)`

GetIsArchivedOk returns a tuple with the IsArchived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsArchived

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsArchived(v bool)`

SetIsArchived sets IsArchived field to given value.

### HasIsArchived

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsArchived() bool`

HasIsArchived returns a boolean if a field has been set.

### GetIsExtShared

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsExtShared() bool`

GetIsExtShared returns the IsExtShared field if non-nil, zero value otherwise.

### GetIsExtSharedOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsExtSharedOk() (*bool, bool)`

GetIsExtSharedOk returns a tuple with the IsExtShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsExtShared

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsExtShared(v bool)`

SetIsExtShared sets IsExtShared field to given value.

### HasIsExtShared

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsExtShared() bool`

HasIsExtShared returns a boolean if a field has been set.

### GetIsFrozen

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsFrozen() bool`

GetIsFrozen returns the IsFrozen field if non-nil, zero value otherwise.

### GetIsFrozenOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsFrozenOk() (*bool, bool)`

GetIsFrozenOk returns a tuple with the IsFrozen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFrozen

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsFrozen(v bool)`

SetIsFrozen sets IsFrozen field to given value.

### HasIsFrozen

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsFrozen() bool`

HasIsFrozen returns a boolean if a field has been set.

### GetIsIm

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsIm() bool`

GetIsIm returns the IsIm field if non-nil, zero value otherwise.

### GetIsImOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsImOk() (*bool, bool)`

GetIsImOk returns a tuple with the IsIm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsIm

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsIm(v bool)`

SetIsIm sets IsIm field to given value.


### GetIsOpen

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsOpen() bool`

GetIsOpen returns the IsOpen field if non-nil, zero value otherwise.

### GetIsOpenOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsOpenOk() (*bool, bool)`

GetIsOpenOk returns a tuple with the IsOpen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOpen

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsOpen(v bool)`

SetIsOpen sets IsOpen field to given value.

### HasIsOpen

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsOpen() bool`

HasIsOpen returns a boolean if a field has been set.

### GetIsOrgShared

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsOrgShared() bool`

GetIsOrgShared returns the IsOrgShared field if non-nil, zero value otherwise.

### GetIsOrgSharedOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsOrgSharedOk() (*bool, bool)`

GetIsOrgSharedOk returns a tuple with the IsOrgShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOrgShared

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsOrgShared(v bool)`

SetIsOrgShared sets IsOrgShared field to given value.


### GetIsShared

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsShared() bool`

GetIsShared returns the IsShared field if non-nil, zero value otherwise.

### GetIsSharedOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsSharedOk() (*bool, bool)`

GetIsSharedOk returns a tuple with the IsShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsShared

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsShared(v bool)`

SetIsShared sets IsShared field to given value.

### HasIsShared

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsShared() bool`

HasIsShared returns a boolean if a field has been set.

### GetIsStarred

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsStarred() bool`

GetIsStarred returns the IsStarred field if non-nil, zero value otherwise.

### GetIsStarredOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsStarredOk() (*bool, bool)`

GetIsStarredOk returns a tuple with the IsStarred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStarred

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsStarred(v bool)`

SetIsStarred sets IsStarred field to given value.

### HasIsStarred

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsStarred() bool`

HasIsStarred returns a boolean if a field has been set.

### GetIsUserDeleted

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsUserDeleted() bool`

GetIsUserDeleted returns the IsUserDeleted field if non-nil, zero value otherwise.

### GetIsUserDeletedOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetIsUserDeletedOk() (*bool, bool)`

GetIsUserDeletedOk returns a tuple with the IsUserDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsUserDeleted

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetIsUserDeleted(v bool)`

SetIsUserDeleted sets IsUserDeleted field to given value.

### HasIsUserDeleted

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasIsUserDeleted() bool`

HasIsUserDeleted returns a boolean if a field has been set.

### GetLastRead

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetLastRead() string`

GetLastRead returns the LastRead field if non-nil, zero value otherwise.

### GetLastReadOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetLastReadOk() (*string, bool)`

GetLastReadOk returns a tuple with the LastRead field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastRead

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetLastRead(v string)`

SetLastRead sets LastRead field to given value.

### HasLastRead

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasLastRead() bool`

HasLastRead returns a boolean if a field has been set.

### GetLatest

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetLatest() []ObjsChannelLatestInner`

GetLatest returns the Latest field if non-nil, zero value otherwise.

### GetLatestOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetLatestOk() (*[]ObjsChannelLatestInner, bool)`

GetLatestOk returns a tuple with the Latest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatest

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetLatest(v []ObjsChannelLatestInner)`

SetLatest sets Latest field to given value.

### HasLatest

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasLatest() bool`

HasLatest returns a boolean if a field has been set.

### GetParentConversation

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetParentConversation() []ConversationObjectParentConversationInner`

GetParentConversation returns the ParentConversation field if non-nil, zero value otherwise.

### GetParentConversationOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetParentConversationOk() (*[]ConversationObjectParentConversationInner, bool)`

GetParentConversationOk returns a tuple with the ParentConversation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentConversation

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetParentConversation(v []ConversationObjectParentConversationInner)`

SetParentConversation sets ParentConversation field to given value.

### HasParentConversation

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasParentConversation() bool`

HasParentConversation returns a boolean if a field has been set.

### GetPinCount

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetPinCount() int32`

GetPinCount returns the PinCount field if non-nil, zero value otherwise.

### GetPinCountOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetPinCountOk() (*int32, bool)`

GetPinCountOk returns a tuple with the PinCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinCount

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetPinCount(v int32)`

SetPinCount sets PinCount field to given value.

### HasPinCount

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasPinCount() bool`

HasPinCount returns a boolean if a field has been set.

### GetPriority

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetPriority() float32`

GetPriority returns the Priority field if non-nil, zero value otherwise.

### GetPriorityOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetPriorityOk() (*float32, bool)`

GetPriorityOk returns a tuple with the Priority field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriority

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetPriority(v float32)`

SetPriority sets Priority field to given value.


### GetShares

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetShares() []ConversationIMChannelObjectFromConversationsMethodsSharesInner`

GetShares returns the Shares field if non-nil, zero value otherwise.

### GetSharesOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetSharesOk() (*[]ConversationIMChannelObjectFromConversationsMethodsSharesInner, bool)`

GetSharesOk returns a tuple with the Shares field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShares

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetShares(v []ConversationIMChannelObjectFromConversationsMethodsSharesInner)`

SetShares sets Shares field to given value.

### HasShares

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasShares() bool`

HasShares returns a boolean if a field has been set.

### GetUnreadCount

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetUnreadCount() int32`

GetUnreadCount returns the UnreadCount field if non-nil, zero value otherwise.

### GetUnreadCountOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetUnreadCountOk() (*int32, bool)`

GetUnreadCountOk returns a tuple with the UnreadCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCount

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetUnreadCount(v int32)`

SetUnreadCount sets UnreadCount field to given value.

### HasUnreadCount

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasUnreadCount() bool`

HasUnreadCount returns a boolean if a field has been set.

### GetUnreadCountDisplay

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetUnreadCountDisplay() int32`

GetUnreadCountDisplay returns the UnreadCountDisplay field if non-nil, zero value otherwise.

### GetUnreadCountDisplayOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetUnreadCountDisplayOk() (*int32, bool)`

GetUnreadCountDisplayOk returns a tuple with the UnreadCountDisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCountDisplay

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetUnreadCountDisplay(v int32)`

SetUnreadCountDisplay sets UnreadCountDisplay field to given value.

### HasUnreadCountDisplay

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasUnreadCountDisplay() bool`

HasUnreadCountDisplay returns a boolean if a field has been set.

### GetUser

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetUser(v string)`

SetUser sets User field to given value.


### GetVersion

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *ConversationIMChannelObjectFromConversationsMethods) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *ConversationIMChannelObjectFromConversationsMethods) SetVersion(v int32)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *ConversationIMChannelObjectFromConversationsMethods) HasVersion() bool`

HasVersion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


