# ConversationMPIMObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AcceptedUser** | Pointer to **string** |  | [optional] 
**ConnectedTeamIds** | Pointer to **[]string** |  | [optional] 
**ConversationHostId** | Pointer to **string** |  | [optional] 
**Created** | **int32** |  | 
**Creator** | **string** |  | 
**DisplayCounts** | Pointer to [**ConversationObjectDisplayCounts**](ConversationObjectDisplayCounts.md) |  | [optional] 
**Id** | **string** |  | 
**InternalTeamIds** | Pointer to **[]string** |  | [optional] 
**IsArchived** | **bool** |  | 
**IsChannel** | **bool** |  | 
**IsExtShared** | Pointer to **bool** |  | [optional] 
**IsFrozen** | Pointer to **bool** |  | [optional] 
**IsGeneral** | **bool** |  | 
**IsGroup** | **bool** |  | 
**IsIm** | **bool** |  | 
**IsMember** | Pointer to **bool** |  | [optional] 
**IsMoved** | Pointer to **int32** |  | [optional] 
**IsMpim** | **bool** |  | 
**IsNonThreadable** | Pointer to **bool** |  | [optional] 
**IsOpen** | Pointer to **bool** |  | [optional] 
**IsOrgShared** | **bool** |  | 
**IsPendingExtShared** | Pointer to **bool** |  | [optional] 
**IsPrivate** | **bool** |  | 
**IsReadOnly** | Pointer to **bool** |  | [optional] 
**IsShared** | **bool** |  | 
**IsStarred** | Pointer to **bool** |  | [optional] 
**IsThreadOnly** | Pointer to **bool** |  | [optional] 
**LastRead** | Pointer to **string** |  | [optional] 
**Latest** | Pointer to [**[]ObjsChannelLatestInner**](ObjsChannelLatestInner.md) |  | [optional] 
**Members** | Pointer to **[]string** |  | [optional] 
**Name** | **string** |  | 
**NameNormalized** | **string** |  | 
**NumMembers** | Pointer to **int32** |  | [optional] 
**ParentConversation** | Pointer to [**[]ConversationObjectParentConversationInner**](ConversationObjectParentConversationInner.md) |  | [optional] 
**PendingConnectedTeamIds** | Pointer to **[]string** |  | [optional] 
**PendingShared** | Pointer to **[]string** |  | [optional] 
**PinCount** | Pointer to **int32** |  | [optional] 
**PreviousNames** | Pointer to **[]string** |  | [optional] 
**Priority** | Pointer to **float32** |  | [optional] 
**Purpose** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  | 
**SharedTeamIds** | Pointer to **[]string** |  | [optional] 
**Shares** | Pointer to [**[]ConversationObjectSharesInner**](ConversationObjectSharesInner.md) |  | [optional] 
**TimezoneCount** | Pointer to **int32** |  | [optional] 
**Topic** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  | 
**Unlinked** | Pointer to **int32** |  | [optional] 
**UnreadCount** | Pointer to **int32** |  | [optional] 
**UnreadCountDisplay** | Pointer to **int32** |  | [optional] 
**User** | Pointer to **string** |  | [optional] 
**Version** | Pointer to **int32** |  | [optional] 

## Methods

### NewConversationMPIMObject

`func NewConversationMPIMObject(created int32, creator string, id string, isArchived bool, isChannel bool, isGeneral bool, isGroup bool, isIm bool, isMpim bool, isOrgShared bool, isPrivate bool, isShared bool, name string, nameNormalized string, purpose ObjsChannelPurpose, topic ObjsChannelPurpose, ) *ConversationMPIMObject`

NewConversationMPIMObject instantiates a new ConversationMPIMObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationMPIMObjectWithDefaults

`func NewConversationMPIMObjectWithDefaults() *ConversationMPIMObject`

NewConversationMPIMObjectWithDefaults instantiates a new ConversationMPIMObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAcceptedUser

`func (o *ConversationMPIMObject) GetAcceptedUser() string`

GetAcceptedUser returns the AcceptedUser field if non-nil, zero value otherwise.

### GetAcceptedUserOk

`func (o *ConversationMPIMObject) GetAcceptedUserOk() (*string, bool)`

GetAcceptedUserOk returns a tuple with the AcceptedUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptedUser

`func (o *ConversationMPIMObject) SetAcceptedUser(v string)`

SetAcceptedUser sets AcceptedUser field to given value.

### HasAcceptedUser

`func (o *ConversationMPIMObject) HasAcceptedUser() bool`

HasAcceptedUser returns a boolean if a field has been set.

### GetConnectedTeamIds

`func (o *ConversationMPIMObject) GetConnectedTeamIds() []string`

GetConnectedTeamIds returns the ConnectedTeamIds field if non-nil, zero value otherwise.

### GetConnectedTeamIdsOk

`func (o *ConversationMPIMObject) GetConnectedTeamIdsOk() (*[]string, bool)`

GetConnectedTeamIdsOk returns a tuple with the ConnectedTeamIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedTeamIds

`func (o *ConversationMPIMObject) SetConnectedTeamIds(v []string)`

SetConnectedTeamIds sets ConnectedTeamIds field to given value.

### HasConnectedTeamIds

`func (o *ConversationMPIMObject) HasConnectedTeamIds() bool`

HasConnectedTeamIds returns a boolean if a field has been set.

### GetConversationHostId

`func (o *ConversationMPIMObject) GetConversationHostId() string`

GetConversationHostId returns the ConversationHostId field if non-nil, zero value otherwise.

### GetConversationHostIdOk

`func (o *ConversationMPIMObject) GetConversationHostIdOk() (*string, bool)`

GetConversationHostIdOk returns a tuple with the ConversationHostId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversationHostId

`func (o *ConversationMPIMObject) SetConversationHostId(v string)`

SetConversationHostId sets ConversationHostId field to given value.

### HasConversationHostId

`func (o *ConversationMPIMObject) HasConversationHostId() bool`

HasConversationHostId returns a boolean if a field has been set.

### GetCreated

`func (o *ConversationMPIMObject) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ConversationMPIMObject) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ConversationMPIMObject) SetCreated(v int32)`

SetCreated sets Created field to given value.


### GetCreator

`func (o *ConversationMPIMObject) GetCreator() string`

GetCreator returns the Creator field if non-nil, zero value otherwise.

### GetCreatorOk

`func (o *ConversationMPIMObject) GetCreatorOk() (*string, bool)`

GetCreatorOk returns a tuple with the Creator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreator

`func (o *ConversationMPIMObject) SetCreator(v string)`

SetCreator sets Creator field to given value.


### GetDisplayCounts

`func (o *ConversationMPIMObject) GetDisplayCounts() ConversationObjectDisplayCounts`

GetDisplayCounts returns the DisplayCounts field if non-nil, zero value otherwise.

### GetDisplayCountsOk

`func (o *ConversationMPIMObject) GetDisplayCountsOk() (*ConversationObjectDisplayCounts, bool)`

GetDisplayCountsOk returns a tuple with the DisplayCounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayCounts

`func (o *ConversationMPIMObject) SetDisplayCounts(v ConversationObjectDisplayCounts)`

SetDisplayCounts sets DisplayCounts field to given value.

### HasDisplayCounts

`func (o *ConversationMPIMObject) HasDisplayCounts() bool`

HasDisplayCounts returns a boolean if a field has been set.

### GetId

`func (o *ConversationMPIMObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ConversationMPIMObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ConversationMPIMObject) SetId(v string)`

SetId sets Id field to given value.


### GetInternalTeamIds

`func (o *ConversationMPIMObject) GetInternalTeamIds() []string`

GetInternalTeamIds returns the InternalTeamIds field if non-nil, zero value otherwise.

### GetInternalTeamIdsOk

`func (o *ConversationMPIMObject) GetInternalTeamIdsOk() (*[]string, bool)`

GetInternalTeamIdsOk returns a tuple with the InternalTeamIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalTeamIds

`func (o *ConversationMPIMObject) SetInternalTeamIds(v []string)`

SetInternalTeamIds sets InternalTeamIds field to given value.

### HasInternalTeamIds

`func (o *ConversationMPIMObject) HasInternalTeamIds() bool`

HasInternalTeamIds returns a boolean if a field has been set.

### GetIsArchived

`func (o *ConversationMPIMObject) GetIsArchived() bool`

GetIsArchived returns the IsArchived field if non-nil, zero value otherwise.

### GetIsArchivedOk

`func (o *ConversationMPIMObject) GetIsArchivedOk() (*bool, bool)`

GetIsArchivedOk returns a tuple with the IsArchived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsArchived

`func (o *ConversationMPIMObject) SetIsArchived(v bool)`

SetIsArchived sets IsArchived field to given value.


### GetIsChannel

`func (o *ConversationMPIMObject) GetIsChannel() bool`

GetIsChannel returns the IsChannel field if non-nil, zero value otherwise.

### GetIsChannelOk

`func (o *ConversationMPIMObject) GetIsChannelOk() (*bool, bool)`

GetIsChannelOk returns a tuple with the IsChannel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsChannel

`func (o *ConversationMPIMObject) SetIsChannel(v bool)`

SetIsChannel sets IsChannel field to given value.


### GetIsExtShared

`func (o *ConversationMPIMObject) GetIsExtShared() bool`

GetIsExtShared returns the IsExtShared field if non-nil, zero value otherwise.

### GetIsExtSharedOk

`func (o *ConversationMPIMObject) GetIsExtSharedOk() (*bool, bool)`

GetIsExtSharedOk returns a tuple with the IsExtShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsExtShared

`func (o *ConversationMPIMObject) SetIsExtShared(v bool)`

SetIsExtShared sets IsExtShared field to given value.

### HasIsExtShared

`func (o *ConversationMPIMObject) HasIsExtShared() bool`

HasIsExtShared returns a boolean if a field has been set.

### GetIsFrozen

`func (o *ConversationMPIMObject) GetIsFrozen() bool`

GetIsFrozen returns the IsFrozen field if non-nil, zero value otherwise.

### GetIsFrozenOk

`func (o *ConversationMPIMObject) GetIsFrozenOk() (*bool, bool)`

GetIsFrozenOk returns a tuple with the IsFrozen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFrozen

`func (o *ConversationMPIMObject) SetIsFrozen(v bool)`

SetIsFrozen sets IsFrozen field to given value.

### HasIsFrozen

`func (o *ConversationMPIMObject) HasIsFrozen() bool`

HasIsFrozen returns a boolean if a field has been set.

### GetIsGeneral

`func (o *ConversationMPIMObject) GetIsGeneral() bool`

GetIsGeneral returns the IsGeneral field if non-nil, zero value otherwise.

### GetIsGeneralOk

`func (o *ConversationMPIMObject) GetIsGeneralOk() (*bool, bool)`

GetIsGeneralOk returns a tuple with the IsGeneral field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsGeneral

`func (o *ConversationMPIMObject) SetIsGeneral(v bool)`

SetIsGeneral sets IsGeneral field to given value.


### GetIsGroup

`func (o *ConversationMPIMObject) GetIsGroup() bool`

GetIsGroup returns the IsGroup field if non-nil, zero value otherwise.

### GetIsGroupOk

`func (o *ConversationMPIMObject) GetIsGroupOk() (*bool, bool)`

GetIsGroupOk returns a tuple with the IsGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsGroup

`func (o *ConversationMPIMObject) SetIsGroup(v bool)`

SetIsGroup sets IsGroup field to given value.


### GetIsIm

`func (o *ConversationMPIMObject) GetIsIm() bool`

GetIsIm returns the IsIm field if non-nil, zero value otherwise.

### GetIsImOk

`func (o *ConversationMPIMObject) GetIsImOk() (*bool, bool)`

GetIsImOk returns a tuple with the IsIm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsIm

`func (o *ConversationMPIMObject) SetIsIm(v bool)`

SetIsIm sets IsIm field to given value.


### GetIsMember

`func (o *ConversationMPIMObject) GetIsMember() bool`

GetIsMember returns the IsMember field if non-nil, zero value otherwise.

### GetIsMemberOk

`func (o *ConversationMPIMObject) GetIsMemberOk() (*bool, bool)`

GetIsMemberOk returns a tuple with the IsMember field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMember

`func (o *ConversationMPIMObject) SetIsMember(v bool)`

SetIsMember sets IsMember field to given value.

### HasIsMember

`func (o *ConversationMPIMObject) HasIsMember() bool`

HasIsMember returns a boolean if a field has been set.

### GetIsMoved

`func (o *ConversationMPIMObject) GetIsMoved() int32`

GetIsMoved returns the IsMoved field if non-nil, zero value otherwise.

### GetIsMovedOk

`func (o *ConversationMPIMObject) GetIsMovedOk() (*int32, bool)`

GetIsMovedOk returns a tuple with the IsMoved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMoved

`func (o *ConversationMPIMObject) SetIsMoved(v int32)`

SetIsMoved sets IsMoved field to given value.

### HasIsMoved

`func (o *ConversationMPIMObject) HasIsMoved() bool`

HasIsMoved returns a boolean if a field has been set.

### GetIsMpim

`func (o *ConversationMPIMObject) GetIsMpim() bool`

GetIsMpim returns the IsMpim field if non-nil, zero value otherwise.

### GetIsMpimOk

`func (o *ConversationMPIMObject) GetIsMpimOk() (*bool, bool)`

GetIsMpimOk returns a tuple with the IsMpim field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMpim

`func (o *ConversationMPIMObject) SetIsMpim(v bool)`

SetIsMpim sets IsMpim field to given value.


### GetIsNonThreadable

`func (o *ConversationMPIMObject) GetIsNonThreadable() bool`

GetIsNonThreadable returns the IsNonThreadable field if non-nil, zero value otherwise.

### GetIsNonThreadableOk

`func (o *ConversationMPIMObject) GetIsNonThreadableOk() (*bool, bool)`

GetIsNonThreadableOk returns a tuple with the IsNonThreadable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsNonThreadable

`func (o *ConversationMPIMObject) SetIsNonThreadable(v bool)`

SetIsNonThreadable sets IsNonThreadable field to given value.

### HasIsNonThreadable

`func (o *ConversationMPIMObject) HasIsNonThreadable() bool`

HasIsNonThreadable returns a boolean if a field has been set.

### GetIsOpen

`func (o *ConversationMPIMObject) GetIsOpen() bool`

GetIsOpen returns the IsOpen field if non-nil, zero value otherwise.

### GetIsOpenOk

`func (o *ConversationMPIMObject) GetIsOpenOk() (*bool, bool)`

GetIsOpenOk returns a tuple with the IsOpen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOpen

`func (o *ConversationMPIMObject) SetIsOpen(v bool)`

SetIsOpen sets IsOpen field to given value.

### HasIsOpen

`func (o *ConversationMPIMObject) HasIsOpen() bool`

HasIsOpen returns a boolean if a field has been set.

### GetIsOrgShared

`func (o *ConversationMPIMObject) GetIsOrgShared() bool`

GetIsOrgShared returns the IsOrgShared field if non-nil, zero value otherwise.

### GetIsOrgSharedOk

`func (o *ConversationMPIMObject) GetIsOrgSharedOk() (*bool, bool)`

GetIsOrgSharedOk returns a tuple with the IsOrgShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOrgShared

`func (o *ConversationMPIMObject) SetIsOrgShared(v bool)`

SetIsOrgShared sets IsOrgShared field to given value.


### GetIsPendingExtShared

`func (o *ConversationMPIMObject) GetIsPendingExtShared() bool`

GetIsPendingExtShared returns the IsPendingExtShared field if non-nil, zero value otherwise.

### GetIsPendingExtSharedOk

`func (o *ConversationMPIMObject) GetIsPendingExtSharedOk() (*bool, bool)`

GetIsPendingExtSharedOk returns a tuple with the IsPendingExtShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPendingExtShared

`func (o *ConversationMPIMObject) SetIsPendingExtShared(v bool)`

SetIsPendingExtShared sets IsPendingExtShared field to given value.

### HasIsPendingExtShared

`func (o *ConversationMPIMObject) HasIsPendingExtShared() bool`

HasIsPendingExtShared returns a boolean if a field has been set.

### GetIsPrivate

`func (o *ConversationMPIMObject) GetIsPrivate() bool`

GetIsPrivate returns the IsPrivate field if non-nil, zero value otherwise.

### GetIsPrivateOk

`func (o *ConversationMPIMObject) GetIsPrivateOk() (*bool, bool)`

GetIsPrivateOk returns a tuple with the IsPrivate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPrivate

`func (o *ConversationMPIMObject) SetIsPrivate(v bool)`

SetIsPrivate sets IsPrivate field to given value.


### GetIsReadOnly

`func (o *ConversationMPIMObject) GetIsReadOnly() bool`

GetIsReadOnly returns the IsReadOnly field if non-nil, zero value otherwise.

### GetIsReadOnlyOk

`func (o *ConversationMPIMObject) GetIsReadOnlyOk() (*bool, bool)`

GetIsReadOnlyOk returns a tuple with the IsReadOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsReadOnly

`func (o *ConversationMPIMObject) SetIsReadOnly(v bool)`

SetIsReadOnly sets IsReadOnly field to given value.

### HasIsReadOnly

`func (o *ConversationMPIMObject) HasIsReadOnly() bool`

HasIsReadOnly returns a boolean if a field has been set.

### GetIsShared

`func (o *ConversationMPIMObject) GetIsShared() bool`

GetIsShared returns the IsShared field if non-nil, zero value otherwise.

### GetIsSharedOk

`func (o *ConversationMPIMObject) GetIsSharedOk() (*bool, bool)`

GetIsSharedOk returns a tuple with the IsShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsShared

`func (o *ConversationMPIMObject) SetIsShared(v bool)`

SetIsShared sets IsShared field to given value.


### GetIsStarred

`func (o *ConversationMPIMObject) GetIsStarred() bool`

GetIsStarred returns the IsStarred field if non-nil, zero value otherwise.

### GetIsStarredOk

`func (o *ConversationMPIMObject) GetIsStarredOk() (*bool, bool)`

GetIsStarredOk returns a tuple with the IsStarred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStarred

`func (o *ConversationMPIMObject) SetIsStarred(v bool)`

SetIsStarred sets IsStarred field to given value.

### HasIsStarred

`func (o *ConversationMPIMObject) HasIsStarred() bool`

HasIsStarred returns a boolean if a field has been set.

### GetIsThreadOnly

`func (o *ConversationMPIMObject) GetIsThreadOnly() bool`

GetIsThreadOnly returns the IsThreadOnly field if non-nil, zero value otherwise.

### GetIsThreadOnlyOk

`func (o *ConversationMPIMObject) GetIsThreadOnlyOk() (*bool, bool)`

GetIsThreadOnlyOk returns a tuple with the IsThreadOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsThreadOnly

`func (o *ConversationMPIMObject) SetIsThreadOnly(v bool)`

SetIsThreadOnly sets IsThreadOnly field to given value.

### HasIsThreadOnly

`func (o *ConversationMPIMObject) HasIsThreadOnly() bool`

HasIsThreadOnly returns a boolean if a field has been set.

### GetLastRead

`func (o *ConversationMPIMObject) GetLastRead() string`

GetLastRead returns the LastRead field if non-nil, zero value otherwise.

### GetLastReadOk

`func (o *ConversationMPIMObject) GetLastReadOk() (*string, bool)`

GetLastReadOk returns a tuple with the LastRead field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastRead

`func (o *ConversationMPIMObject) SetLastRead(v string)`

SetLastRead sets LastRead field to given value.

### HasLastRead

`func (o *ConversationMPIMObject) HasLastRead() bool`

HasLastRead returns a boolean if a field has been set.

### GetLatest

`func (o *ConversationMPIMObject) GetLatest() []ObjsChannelLatestInner`

GetLatest returns the Latest field if non-nil, zero value otherwise.

### GetLatestOk

`func (o *ConversationMPIMObject) GetLatestOk() (*[]ObjsChannelLatestInner, bool)`

GetLatestOk returns a tuple with the Latest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatest

`func (o *ConversationMPIMObject) SetLatest(v []ObjsChannelLatestInner)`

SetLatest sets Latest field to given value.

### HasLatest

`func (o *ConversationMPIMObject) HasLatest() bool`

HasLatest returns a boolean if a field has been set.

### GetMembers

`func (o *ConversationMPIMObject) GetMembers() []string`

GetMembers returns the Members field if non-nil, zero value otherwise.

### GetMembersOk

`func (o *ConversationMPIMObject) GetMembersOk() (*[]string, bool)`

GetMembersOk returns a tuple with the Members field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembers

`func (o *ConversationMPIMObject) SetMembers(v []string)`

SetMembers sets Members field to given value.

### HasMembers

`func (o *ConversationMPIMObject) HasMembers() bool`

HasMembers returns a boolean if a field has been set.

### GetName

`func (o *ConversationMPIMObject) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ConversationMPIMObject) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ConversationMPIMObject) SetName(v string)`

SetName sets Name field to given value.


### GetNameNormalized

`func (o *ConversationMPIMObject) GetNameNormalized() string`

GetNameNormalized returns the NameNormalized field if non-nil, zero value otherwise.

### GetNameNormalizedOk

`func (o *ConversationMPIMObject) GetNameNormalizedOk() (*string, bool)`

GetNameNormalizedOk returns a tuple with the NameNormalized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNameNormalized

`func (o *ConversationMPIMObject) SetNameNormalized(v string)`

SetNameNormalized sets NameNormalized field to given value.


### GetNumMembers

`func (o *ConversationMPIMObject) GetNumMembers() int32`

GetNumMembers returns the NumMembers field if non-nil, zero value otherwise.

### GetNumMembersOk

`func (o *ConversationMPIMObject) GetNumMembersOk() (*int32, bool)`

GetNumMembersOk returns a tuple with the NumMembers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumMembers

`func (o *ConversationMPIMObject) SetNumMembers(v int32)`

SetNumMembers sets NumMembers field to given value.

### HasNumMembers

`func (o *ConversationMPIMObject) HasNumMembers() bool`

HasNumMembers returns a boolean if a field has been set.

### GetParentConversation

`func (o *ConversationMPIMObject) GetParentConversation() []ConversationObjectParentConversationInner`

GetParentConversation returns the ParentConversation field if non-nil, zero value otherwise.

### GetParentConversationOk

`func (o *ConversationMPIMObject) GetParentConversationOk() (*[]ConversationObjectParentConversationInner, bool)`

GetParentConversationOk returns a tuple with the ParentConversation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentConversation

`func (o *ConversationMPIMObject) SetParentConversation(v []ConversationObjectParentConversationInner)`

SetParentConversation sets ParentConversation field to given value.

### HasParentConversation

`func (o *ConversationMPIMObject) HasParentConversation() bool`

HasParentConversation returns a boolean if a field has been set.

### GetPendingConnectedTeamIds

`func (o *ConversationMPIMObject) GetPendingConnectedTeamIds() []string`

GetPendingConnectedTeamIds returns the PendingConnectedTeamIds field if non-nil, zero value otherwise.

### GetPendingConnectedTeamIdsOk

`func (o *ConversationMPIMObject) GetPendingConnectedTeamIdsOk() (*[]string, bool)`

GetPendingConnectedTeamIdsOk returns a tuple with the PendingConnectedTeamIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPendingConnectedTeamIds

`func (o *ConversationMPIMObject) SetPendingConnectedTeamIds(v []string)`

SetPendingConnectedTeamIds sets PendingConnectedTeamIds field to given value.

### HasPendingConnectedTeamIds

`func (o *ConversationMPIMObject) HasPendingConnectedTeamIds() bool`

HasPendingConnectedTeamIds returns a boolean if a field has been set.

### GetPendingShared

`func (o *ConversationMPIMObject) GetPendingShared() []string`

GetPendingShared returns the PendingShared field if non-nil, zero value otherwise.

### GetPendingSharedOk

`func (o *ConversationMPIMObject) GetPendingSharedOk() (*[]string, bool)`

GetPendingSharedOk returns a tuple with the PendingShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPendingShared

`func (o *ConversationMPIMObject) SetPendingShared(v []string)`

SetPendingShared sets PendingShared field to given value.

### HasPendingShared

`func (o *ConversationMPIMObject) HasPendingShared() bool`

HasPendingShared returns a boolean if a field has been set.

### GetPinCount

`func (o *ConversationMPIMObject) GetPinCount() int32`

GetPinCount returns the PinCount field if non-nil, zero value otherwise.

### GetPinCountOk

`func (o *ConversationMPIMObject) GetPinCountOk() (*int32, bool)`

GetPinCountOk returns a tuple with the PinCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinCount

`func (o *ConversationMPIMObject) SetPinCount(v int32)`

SetPinCount sets PinCount field to given value.

### HasPinCount

`func (o *ConversationMPIMObject) HasPinCount() bool`

HasPinCount returns a boolean if a field has been set.

### GetPreviousNames

`func (o *ConversationMPIMObject) GetPreviousNames() []string`

GetPreviousNames returns the PreviousNames field if non-nil, zero value otherwise.

### GetPreviousNamesOk

`func (o *ConversationMPIMObject) GetPreviousNamesOk() (*[]string, bool)`

GetPreviousNamesOk returns a tuple with the PreviousNames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousNames

`func (o *ConversationMPIMObject) SetPreviousNames(v []string)`

SetPreviousNames sets PreviousNames field to given value.

### HasPreviousNames

`func (o *ConversationMPIMObject) HasPreviousNames() bool`

HasPreviousNames returns a boolean if a field has been set.

### GetPriority

`func (o *ConversationMPIMObject) GetPriority() float32`

GetPriority returns the Priority field if non-nil, zero value otherwise.

### GetPriorityOk

`func (o *ConversationMPIMObject) GetPriorityOk() (*float32, bool)`

GetPriorityOk returns a tuple with the Priority field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriority

`func (o *ConversationMPIMObject) SetPriority(v float32)`

SetPriority sets Priority field to given value.

### HasPriority

`func (o *ConversationMPIMObject) HasPriority() bool`

HasPriority returns a boolean if a field has been set.

### GetPurpose

`func (o *ConversationMPIMObject) GetPurpose() ObjsChannelPurpose`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *ConversationMPIMObject) GetPurposeOk() (*ObjsChannelPurpose, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *ConversationMPIMObject) SetPurpose(v ObjsChannelPurpose)`

SetPurpose sets Purpose field to given value.


### GetSharedTeamIds

`func (o *ConversationMPIMObject) GetSharedTeamIds() []string`

GetSharedTeamIds returns the SharedTeamIds field if non-nil, zero value otherwise.

### GetSharedTeamIdsOk

`func (o *ConversationMPIMObject) GetSharedTeamIdsOk() (*[]string, bool)`

GetSharedTeamIdsOk returns a tuple with the SharedTeamIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharedTeamIds

`func (o *ConversationMPIMObject) SetSharedTeamIds(v []string)`

SetSharedTeamIds sets SharedTeamIds field to given value.

### HasSharedTeamIds

`func (o *ConversationMPIMObject) HasSharedTeamIds() bool`

HasSharedTeamIds returns a boolean if a field has been set.

### GetShares

`func (o *ConversationMPIMObject) GetShares() []ConversationObjectSharesInner`

GetShares returns the Shares field if non-nil, zero value otherwise.

### GetSharesOk

`func (o *ConversationMPIMObject) GetSharesOk() (*[]ConversationObjectSharesInner, bool)`

GetSharesOk returns a tuple with the Shares field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShares

`func (o *ConversationMPIMObject) SetShares(v []ConversationObjectSharesInner)`

SetShares sets Shares field to given value.

### HasShares

`func (o *ConversationMPIMObject) HasShares() bool`

HasShares returns a boolean if a field has been set.

### GetTimezoneCount

`func (o *ConversationMPIMObject) GetTimezoneCount() int32`

GetTimezoneCount returns the TimezoneCount field if non-nil, zero value otherwise.

### GetTimezoneCountOk

`func (o *ConversationMPIMObject) GetTimezoneCountOk() (*int32, bool)`

GetTimezoneCountOk returns a tuple with the TimezoneCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezoneCount

`func (o *ConversationMPIMObject) SetTimezoneCount(v int32)`

SetTimezoneCount sets TimezoneCount field to given value.

### HasTimezoneCount

`func (o *ConversationMPIMObject) HasTimezoneCount() bool`

HasTimezoneCount returns a boolean if a field has been set.

### GetTopic

`func (o *ConversationMPIMObject) GetTopic() ObjsChannelPurpose`

GetTopic returns the Topic field if non-nil, zero value otherwise.

### GetTopicOk

`func (o *ConversationMPIMObject) GetTopicOk() (*ObjsChannelPurpose, bool)`

GetTopicOk returns a tuple with the Topic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopic

`func (o *ConversationMPIMObject) SetTopic(v ObjsChannelPurpose)`

SetTopic sets Topic field to given value.


### GetUnlinked

`func (o *ConversationMPIMObject) GetUnlinked() int32`

GetUnlinked returns the Unlinked field if non-nil, zero value otherwise.

### GetUnlinkedOk

`func (o *ConversationMPIMObject) GetUnlinkedOk() (*int32, bool)`

GetUnlinkedOk returns a tuple with the Unlinked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnlinked

`func (o *ConversationMPIMObject) SetUnlinked(v int32)`

SetUnlinked sets Unlinked field to given value.

### HasUnlinked

`func (o *ConversationMPIMObject) HasUnlinked() bool`

HasUnlinked returns a boolean if a field has been set.

### GetUnreadCount

`func (o *ConversationMPIMObject) GetUnreadCount() int32`

GetUnreadCount returns the UnreadCount field if non-nil, zero value otherwise.

### GetUnreadCountOk

`func (o *ConversationMPIMObject) GetUnreadCountOk() (*int32, bool)`

GetUnreadCountOk returns a tuple with the UnreadCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCount

`func (o *ConversationMPIMObject) SetUnreadCount(v int32)`

SetUnreadCount sets UnreadCount field to given value.

### HasUnreadCount

`func (o *ConversationMPIMObject) HasUnreadCount() bool`

HasUnreadCount returns a boolean if a field has been set.

### GetUnreadCountDisplay

`func (o *ConversationMPIMObject) GetUnreadCountDisplay() int32`

GetUnreadCountDisplay returns the UnreadCountDisplay field if non-nil, zero value otherwise.

### GetUnreadCountDisplayOk

`func (o *ConversationMPIMObject) GetUnreadCountDisplayOk() (*int32, bool)`

GetUnreadCountDisplayOk returns a tuple with the UnreadCountDisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCountDisplay

`func (o *ConversationMPIMObject) SetUnreadCountDisplay(v int32)`

SetUnreadCountDisplay sets UnreadCountDisplay field to given value.

### HasUnreadCountDisplay

`func (o *ConversationMPIMObject) HasUnreadCountDisplay() bool`

HasUnreadCountDisplay returns a boolean if a field has been set.

### GetUser

`func (o *ConversationMPIMObject) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ConversationMPIMObject) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ConversationMPIMObject) SetUser(v string)`

SetUser sets User field to given value.

### HasUser

`func (o *ConversationMPIMObject) HasUser() bool`

HasUser returns a boolean if a field has been set.

### GetVersion

`func (o *ConversationMPIMObject) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *ConversationMPIMObject) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *ConversationMPIMObject) SetVersion(v int32)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *ConversationMPIMObject) HasVersion() bool`

HasVersion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


