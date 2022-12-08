# ObjsConversationInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AcceptedUser** | Pointer to **string** |  | [optional] 
**ConnectedTeamIds** | Pointer to **[]string** |  | [optional] 
**ConversationHostId** | Pointer to **string** |  | [optional] 
**Created** | **int32** |  | 
**Creator** | **string** |  | 
**DisplayCounts** | Pointer to [**ConversationObjectDisplayCounts**](ConversationObjectDisplayCounts.md) |  | [optional] 
**EnterpriseId** | Pointer to **string** |  | [optional] 
**HasPins** | Pointer to **bool** |  | [optional] 
**Id** | **string** |  | 
**InternalTeamIds** | Pointer to **[]string** |  | [optional] 
**IsArchived** | **bool** |  | 
**IsChannel** | **bool** |  | 
**IsExtShared** | Pointer to **bool** |  | [optional] 
**IsFrozen** | Pointer to **bool** |  | [optional] 
**IsGeneral** | **bool** |  | 
**IsGlobalShared** | Pointer to **bool** |  | [optional] 
**IsGroup** | **bool** |  | 
**IsIm** | **bool** |  | 
**IsMember** | Pointer to **bool** |  | [optional] 
**IsMoved** | Pointer to **int32** |  | [optional] 
**IsMpim** | **bool** |  | 
**IsNonThreadable** | Pointer to **bool** |  | [optional] 
**IsOpen** | Pointer to **bool** |  | [optional] 
**IsOrgDefault** | Pointer to **bool** |  | [optional] 
**IsOrgMandatory** | Pointer to **bool** |  | [optional] 
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
**Priority** | **float32** |  | 
**Purpose** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  | 
**SharedTeamIds** | Pointer to **[]string** |  | [optional] 
**Shares** | Pointer to [**[]ConversationIMChannelObjectFromConversationsMethodsSharesInner**](ConversationIMChannelObjectFromConversationsMethodsSharesInner.md) |  | [optional] 
**TimezoneCount** | Pointer to **int32** |  | [optional] 
**Topic** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  | 
**Unlinked** | Pointer to **int32** |  | [optional] 
**UnreadCount** | Pointer to **int32** |  | [optional] 
**UnreadCountDisplay** | Pointer to **int32** |  | [optional] 
**UseCase** | Pointer to **string** |  | [optional] 
**User** | **string** |  | 
**Version** | Pointer to **int32** |  | [optional] 
**IsUserDeleted** | Pointer to **bool** |  | [optional] 

## Methods

### NewObjsConversationInner

`func NewObjsConversationInner(created int32, creator string, id string, isArchived bool, isChannel bool, isGeneral bool, isGroup bool, isIm bool, isMpim bool, isOrgShared bool, isPrivate bool, isShared bool, name string, nameNormalized string, priority float32, purpose ObjsChannelPurpose, topic ObjsChannelPurpose, user string, ) *ObjsConversationInner`

NewObjsConversationInner instantiates a new ObjsConversationInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsConversationInnerWithDefaults

`func NewObjsConversationInnerWithDefaults() *ObjsConversationInner`

NewObjsConversationInnerWithDefaults instantiates a new ObjsConversationInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAcceptedUser

`func (o *ObjsConversationInner) GetAcceptedUser() string`

GetAcceptedUser returns the AcceptedUser field if non-nil, zero value otherwise.

### GetAcceptedUserOk

`func (o *ObjsConversationInner) GetAcceptedUserOk() (*string, bool)`

GetAcceptedUserOk returns a tuple with the AcceptedUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptedUser

`func (o *ObjsConversationInner) SetAcceptedUser(v string)`

SetAcceptedUser sets AcceptedUser field to given value.

### HasAcceptedUser

`func (o *ObjsConversationInner) HasAcceptedUser() bool`

HasAcceptedUser returns a boolean if a field has been set.

### GetConnectedTeamIds

`func (o *ObjsConversationInner) GetConnectedTeamIds() []string`

GetConnectedTeamIds returns the ConnectedTeamIds field if non-nil, zero value otherwise.

### GetConnectedTeamIdsOk

`func (o *ObjsConversationInner) GetConnectedTeamIdsOk() (*[]string, bool)`

GetConnectedTeamIdsOk returns a tuple with the ConnectedTeamIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedTeamIds

`func (o *ObjsConversationInner) SetConnectedTeamIds(v []string)`

SetConnectedTeamIds sets ConnectedTeamIds field to given value.

### HasConnectedTeamIds

`func (o *ObjsConversationInner) HasConnectedTeamIds() bool`

HasConnectedTeamIds returns a boolean if a field has been set.

### GetConversationHostId

`func (o *ObjsConversationInner) GetConversationHostId() string`

GetConversationHostId returns the ConversationHostId field if non-nil, zero value otherwise.

### GetConversationHostIdOk

`func (o *ObjsConversationInner) GetConversationHostIdOk() (*string, bool)`

GetConversationHostIdOk returns a tuple with the ConversationHostId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversationHostId

`func (o *ObjsConversationInner) SetConversationHostId(v string)`

SetConversationHostId sets ConversationHostId field to given value.

### HasConversationHostId

`func (o *ObjsConversationInner) HasConversationHostId() bool`

HasConversationHostId returns a boolean if a field has been set.

### GetCreated

`func (o *ObjsConversationInner) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ObjsConversationInner) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ObjsConversationInner) SetCreated(v int32)`

SetCreated sets Created field to given value.


### GetCreator

`func (o *ObjsConversationInner) GetCreator() string`

GetCreator returns the Creator field if non-nil, zero value otherwise.

### GetCreatorOk

`func (o *ObjsConversationInner) GetCreatorOk() (*string, bool)`

GetCreatorOk returns a tuple with the Creator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreator

`func (o *ObjsConversationInner) SetCreator(v string)`

SetCreator sets Creator field to given value.


### GetDisplayCounts

`func (o *ObjsConversationInner) GetDisplayCounts() ConversationObjectDisplayCounts`

GetDisplayCounts returns the DisplayCounts field if non-nil, zero value otherwise.

### GetDisplayCountsOk

`func (o *ObjsConversationInner) GetDisplayCountsOk() (*ConversationObjectDisplayCounts, bool)`

GetDisplayCountsOk returns a tuple with the DisplayCounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayCounts

`func (o *ObjsConversationInner) SetDisplayCounts(v ConversationObjectDisplayCounts)`

SetDisplayCounts sets DisplayCounts field to given value.

### HasDisplayCounts

`func (o *ObjsConversationInner) HasDisplayCounts() bool`

HasDisplayCounts returns a boolean if a field has been set.

### GetEnterpriseId

`func (o *ObjsConversationInner) GetEnterpriseId() string`

GetEnterpriseId returns the EnterpriseId field if non-nil, zero value otherwise.

### GetEnterpriseIdOk

`func (o *ObjsConversationInner) GetEnterpriseIdOk() (*string, bool)`

GetEnterpriseIdOk returns a tuple with the EnterpriseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnterpriseId

`func (o *ObjsConversationInner) SetEnterpriseId(v string)`

SetEnterpriseId sets EnterpriseId field to given value.

### HasEnterpriseId

`func (o *ObjsConversationInner) HasEnterpriseId() bool`

HasEnterpriseId returns a boolean if a field has been set.

### GetHasPins

`func (o *ObjsConversationInner) GetHasPins() bool`

GetHasPins returns the HasPins field if non-nil, zero value otherwise.

### GetHasPinsOk

`func (o *ObjsConversationInner) GetHasPinsOk() (*bool, bool)`

GetHasPinsOk returns a tuple with the HasPins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasPins

`func (o *ObjsConversationInner) SetHasPins(v bool)`

SetHasPins sets HasPins field to given value.

### HasHasPins

`func (o *ObjsConversationInner) HasHasPins() bool`

HasHasPins returns a boolean if a field has been set.

### GetId

`func (o *ObjsConversationInner) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ObjsConversationInner) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ObjsConversationInner) SetId(v string)`

SetId sets Id field to given value.


### GetInternalTeamIds

`func (o *ObjsConversationInner) GetInternalTeamIds() []string`

GetInternalTeamIds returns the InternalTeamIds field if non-nil, zero value otherwise.

### GetInternalTeamIdsOk

`func (o *ObjsConversationInner) GetInternalTeamIdsOk() (*[]string, bool)`

GetInternalTeamIdsOk returns a tuple with the InternalTeamIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalTeamIds

`func (o *ObjsConversationInner) SetInternalTeamIds(v []string)`

SetInternalTeamIds sets InternalTeamIds field to given value.

### HasInternalTeamIds

`func (o *ObjsConversationInner) HasInternalTeamIds() bool`

HasInternalTeamIds returns a boolean if a field has been set.

### GetIsArchived

`func (o *ObjsConversationInner) GetIsArchived() bool`

GetIsArchived returns the IsArchived field if non-nil, zero value otherwise.

### GetIsArchivedOk

`func (o *ObjsConversationInner) GetIsArchivedOk() (*bool, bool)`

GetIsArchivedOk returns a tuple with the IsArchived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsArchived

`func (o *ObjsConversationInner) SetIsArchived(v bool)`

SetIsArchived sets IsArchived field to given value.


### GetIsChannel

`func (o *ObjsConversationInner) GetIsChannel() bool`

GetIsChannel returns the IsChannel field if non-nil, zero value otherwise.

### GetIsChannelOk

`func (o *ObjsConversationInner) GetIsChannelOk() (*bool, bool)`

GetIsChannelOk returns a tuple with the IsChannel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsChannel

`func (o *ObjsConversationInner) SetIsChannel(v bool)`

SetIsChannel sets IsChannel field to given value.


### GetIsExtShared

`func (o *ObjsConversationInner) GetIsExtShared() bool`

GetIsExtShared returns the IsExtShared field if non-nil, zero value otherwise.

### GetIsExtSharedOk

`func (o *ObjsConversationInner) GetIsExtSharedOk() (*bool, bool)`

GetIsExtSharedOk returns a tuple with the IsExtShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsExtShared

`func (o *ObjsConversationInner) SetIsExtShared(v bool)`

SetIsExtShared sets IsExtShared field to given value.

### HasIsExtShared

`func (o *ObjsConversationInner) HasIsExtShared() bool`

HasIsExtShared returns a boolean if a field has been set.

### GetIsFrozen

`func (o *ObjsConversationInner) GetIsFrozen() bool`

GetIsFrozen returns the IsFrozen field if non-nil, zero value otherwise.

### GetIsFrozenOk

`func (o *ObjsConversationInner) GetIsFrozenOk() (*bool, bool)`

GetIsFrozenOk returns a tuple with the IsFrozen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFrozen

`func (o *ObjsConversationInner) SetIsFrozen(v bool)`

SetIsFrozen sets IsFrozen field to given value.

### HasIsFrozen

`func (o *ObjsConversationInner) HasIsFrozen() bool`

HasIsFrozen returns a boolean if a field has been set.

### GetIsGeneral

`func (o *ObjsConversationInner) GetIsGeneral() bool`

GetIsGeneral returns the IsGeneral field if non-nil, zero value otherwise.

### GetIsGeneralOk

`func (o *ObjsConversationInner) GetIsGeneralOk() (*bool, bool)`

GetIsGeneralOk returns a tuple with the IsGeneral field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsGeneral

`func (o *ObjsConversationInner) SetIsGeneral(v bool)`

SetIsGeneral sets IsGeneral field to given value.


### GetIsGlobalShared

`func (o *ObjsConversationInner) GetIsGlobalShared() bool`

GetIsGlobalShared returns the IsGlobalShared field if non-nil, zero value otherwise.

### GetIsGlobalSharedOk

`func (o *ObjsConversationInner) GetIsGlobalSharedOk() (*bool, bool)`

GetIsGlobalSharedOk returns a tuple with the IsGlobalShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsGlobalShared

`func (o *ObjsConversationInner) SetIsGlobalShared(v bool)`

SetIsGlobalShared sets IsGlobalShared field to given value.

### HasIsGlobalShared

`func (o *ObjsConversationInner) HasIsGlobalShared() bool`

HasIsGlobalShared returns a boolean if a field has been set.

### GetIsGroup

`func (o *ObjsConversationInner) GetIsGroup() bool`

GetIsGroup returns the IsGroup field if non-nil, zero value otherwise.

### GetIsGroupOk

`func (o *ObjsConversationInner) GetIsGroupOk() (*bool, bool)`

GetIsGroupOk returns a tuple with the IsGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsGroup

`func (o *ObjsConversationInner) SetIsGroup(v bool)`

SetIsGroup sets IsGroup field to given value.


### GetIsIm

`func (o *ObjsConversationInner) GetIsIm() bool`

GetIsIm returns the IsIm field if non-nil, zero value otherwise.

### GetIsImOk

`func (o *ObjsConversationInner) GetIsImOk() (*bool, bool)`

GetIsImOk returns a tuple with the IsIm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsIm

`func (o *ObjsConversationInner) SetIsIm(v bool)`

SetIsIm sets IsIm field to given value.


### GetIsMember

`func (o *ObjsConversationInner) GetIsMember() bool`

GetIsMember returns the IsMember field if non-nil, zero value otherwise.

### GetIsMemberOk

`func (o *ObjsConversationInner) GetIsMemberOk() (*bool, bool)`

GetIsMemberOk returns a tuple with the IsMember field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMember

`func (o *ObjsConversationInner) SetIsMember(v bool)`

SetIsMember sets IsMember field to given value.

### HasIsMember

`func (o *ObjsConversationInner) HasIsMember() bool`

HasIsMember returns a boolean if a field has been set.

### GetIsMoved

`func (o *ObjsConversationInner) GetIsMoved() int32`

GetIsMoved returns the IsMoved field if non-nil, zero value otherwise.

### GetIsMovedOk

`func (o *ObjsConversationInner) GetIsMovedOk() (*int32, bool)`

GetIsMovedOk returns a tuple with the IsMoved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMoved

`func (o *ObjsConversationInner) SetIsMoved(v int32)`

SetIsMoved sets IsMoved field to given value.

### HasIsMoved

`func (o *ObjsConversationInner) HasIsMoved() bool`

HasIsMoved returns a boolean if a field has been set.

### GetIsMpim

`func (o *ObjsConversationInner) GetIsMpim() bool`

GetIsMpim returns the IsMpim field if non-nil, zero value otherwise.

### GetIsMpimOk

`func (o *ObjsConversationInner) GetIsMpimOk() (*bool, bool)`

GetIsMpimOk returns a tuple with the IsMpim field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMpim

`func (o *ObjsConversationInner) SetIsMpim(v bool)`

SetIsMpim sets IsMpim field to given value.


### GetIsNonThreadable

`func (o *ObjsConversationInner) GetIsNonThreadable() bool`

GetIsNonThreadable returns the IsNonThreadable field if non-nil, zero value otherwise.

### GetIsNonThreadableOk

`func (o *ObjsConversationInner) GetIsNonThreadableOk() (*bool, bool)`

GetIsNonThreadableOk returns a tuple with the IsNonThreadable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsNonThreadable

`func (o *ObjsConversationInner) SetIsNonThreadable(v bool)`

SetIsNonThreadable sets IsNonThreadable field to given value.

### HasIsNonThreadable

`func (o *ObjsConversationInner) HasIsNonThreadable() bool`

HasIsNonThreadable returns a boolean if a field has been set.

### GetIsOpen

`func (o *ObjsConversationInner) GetIsOpen() bool`

GetIsOpen returns the IsOpen field if non-nil, zero value otherwise.

### GetIsOpenOk

`func (o *ObjsConversationInner) GetIsOpenOk() (*bool, bool)`

GetIsOpenOk returns a tuple with the IsOpen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOpen

`func (o *ObjsConversationInner) SetIsOpen(v bool)`

SetIsOpen sets IsOpen field to given value.

### HasIsOpen

`func (o *ObjsConversationInner) HasIsOpen() bool`

HasIsOpen returns a boolean if a field has been set.

### GetIsOrgDefault

`func (o *ObjsConversationInner) GetIsOrgDefault() bool`

GetIsOrgDefault returns the IsOrgDefault field if non-nil, zero value otherwise.

### GetIsOrgDefaultOk

`func (o *ObjsConversationInner) GetIsOrgDefaultOk() (*bool, bool)`

GetIsOrgDefaultOk returns a tuple with the IsOrgDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOrgDefault

`func (o *ObjsConversationInner) SetIsOrgDefault(v bool)`

SetIsOrgDefault sets IsOrgDefault field to given value.

### HasIsOrgDefault

`func (o *ObjsConversationInner) HasIsOrgDefault() bool`

HasIsOrgDefault returns a boolean if a field has been set.

### GetIsOrgMandatory

`func (o *ObjsConversationInner) GetIsOrgMandatory() bool`

GetIsOrgMandatory returns the IsOrgMandatory field if non-nil, zero value otherwise.

### GetIsOrgMandatoryOk

`func (o *ObjsConversationInner) GetIsOrgMandatoryOk() (*bool, bool)`

GetIsOrgMandatoryOk returns a tuple with the IsOrgMandatory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOrgMandatory

`func (o *ObjsConversationInner) SetIsOrgMandatory(v bool)`

SetIsOrgMandatory sets IsOrgMandatory field to given value.

### HasIsOrgMandatory

`func (o *ObjsConversationInner) HasIsOrgMandatory() bool`

HasIsOrgMandatory returns a boolean if a field has been set.

### GetIsOrgShared

`func (o *ObjsConversationInner) GetIsOrgShared() bool`

GetIsOrgShared returns the IsOrgShared field if non-nil, zero value otherwise.

### GetIsOrgSharedOk

`func (o *ObjsConversationInner) GetIsOrgSharedOk() (*bool, bool)`

GetIsOrgSharedOk returns a tuple with the IsOrgShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOrgShared

`func (o *ObjsConversationInner) SetIsOrgShared(v bool)`

SetIsOrgShared sets IsOrgShared field to given value.


### GetIsPendingExtShared

`func (o *ObjsConversationInner) GetIsPendingExtShared() bool`

GetIsPendingExtShared returns the IsPendingExtShared field if non-nil, zero value otherwise.

### GetIsPendingExtSharedOk

`func (o *ObjsConversationInner) GetIsPendingExtSharedOk() (*bool, bool)`

GetIsPendingExtSharedOk returns a tuple with the IsPendingExtShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPendingExtShared

`func (o *ObjsConversationInner) SetIsPendingExtShared(v bool)`

SetIsPendingExtShared sets IsPendingExtShared field to given value.

### HasIsPendingExtShared

`func (o *ObjsConversationInner) HasIsPendingExtShared() bool`

HasIsPendingExtShared returns a boolean if a field has been set.

### GetIsPrivate

`func (o *ObjsConversationInner) GetIsPrivate() bool`

GetIsPrivate returns the IsPrivate field if non-nil, zero value otherwise.

### GetIsPrivateOk

`func (o *ObjsConversationInner) GetIsPrivateOk() (*bool, bool)`

GetIsPrivateOk returns a tuple with the IsPrivate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPrivate

`func (o *ObjsConversationInner) SetIsPrivate(v bool)`

SetIsPrivate sets IsPrivate field to given value.


### GetIsReadOnly

`func (o *ObjsConversationInner) GetIsReadOnly() bool`

GetIsReadOnly returns the IsReadOnly field if non-nil, zero value otherwise.

### GetIsReadOnlyOk

`func (o *ObjsConversationInner) GetIsReadOnlyOk() (*bool, bool)`

GetIsReadOnlyOk returns a tuple with the IsReadOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsReadOnly

`func (o *ObjsConversationInner) SetIsReadOnly(v bool)`

SetIsReadOnly sets IsReadOnly field to given value.

### HasIsReadOnly

`func (o *ObjsConversationInner) HasIsReadOnly() bool`

HasIsReadOnly returns a boolean if a field has been set.

### GetIsShared

`func (o *ObjsConversationInner) GetIsShared() bool`

GetIsShared returns the IsShared field if non-nil, zero value otherwise.

### GetIsSharedOk

`func (o *ObjsConversationInner) GetIsSharedOk() (*bool, bool)`

GetIsSharedOk returns a tuple with the IsShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsShared

`func (o *ObjsConversationInner) SetIsShared(v bool)`

SetIsShared sets IsShared field to given value.


### GetIsStarred

`func (o *ObjsConversationInner) GetIsStarred() bool`

GetIsStarred returns the IsStarred field if non-nil, zero value otherwise.

### GetIsStarredOk

`func (o *ObjsConversationInner) GetIsStarredOk() (*bool, bool)`

GetIsStarredOk returns a tuple with the IsStarred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStarred

`func (o *ObjsConversationInner) SetIsStarred(v bool)`

SetIsStarred sets IsStarred field to given value.

### HasIsStarred

`func (o *ObjsConversationInner) HasIsStarred() bool`

HasIsStarred returns a boolean if a field has been set.

### GetIsThreadOnly

`func (o *ObjsConversationInner) GetIsThreadOnly() bool`

GetIsThreadOnly returns the IsThreadOnly field if non-nil, zero value otherwise.

### GetIsThreadOnlyOk

`func (o *ObjsConversationInner) GetIsThreadOnlyOk() (*bool, bool)`

GetIsThreadOnlyOk returns a tuple with the IsThreadOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsThreadOnly

`func (o *ObjsConversationInner) SetIsThreadOnly(v bool)`

SetIsThreadOnly sets IsThreadOnly field to given value.

### HasIsThreadOnly

`func (o *ObjsConversationInner) HasIsThreadOnly() bool`

HasIsThreadOnly returns a boolean if a field has been set.

### GetLastRead

`func (o *ObjsConversationInner) GetLastRead() string`

GetLastRead returns the LastRead field if non-nil, zero value otherwise.

### GetLastReadOk

`func (o *ObjsConversationInner) GetLastReadOk() (*string, bool)`

GetLastReadOk returns a tuple with the LastRead field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastRead

`func (o *ObjsConversationInner) SetLastRead(v string)`

SetLastRead sets LastRead field to given value.

### HasLastRead

`func (o *ObjsConversationInner) HasLastRead() bool`

HasLastRead returns a boolean if a field has been set.

### GetLatest

`func (o *ObjsConversationInner) GetLatest() []ObjsChannelLatestInner`

GetLatest returns the Latest field if non-nil, zero value otherwise.

### GetLatestOk

`func (o *ObjsConversationInner) GetLatestOk() (*[]ObjsChannelLatestInner, bool)`

GetLatestOk returns a tuple with the Latest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatest

`func (o *ObjsConversationInner) SetLatest(v []ObjsChannelLatestInner)`

SetLatest sets Latest field to given value.

### HasLatest

`func (o *ObjsConversationInner) HasLatest() bool`

HasLatest returns a boolean if a field has been set.

### GetMembers

`func (o *ObjsConversationInner) GetMembers() []string`

GetMembers returns the Members field if non-nil, zero value otherwise.

### GetMembersOk

`func (o *ObjsConversationInner) GetMembersOk() (*[]string, bool)`

GetMembersOk returns a tuple with the Members field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembers

`func (o *ObjsConversationInner) SetMembers(v []string)`

SetMembers sets Members field to given value.

### HasMembers

`func (o *ObjsConversationInner) HasMembers() bool`

HasMembers returns a boolean if a field has been set.

### GetName

`func (o *ObjsConversationInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ObjsConversationInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ObjsConversationInner) SetName(v string)`

SetName sets Name field to given value.


### GetNameNormalized

`func (o *ObjsConversationInner) GetNameNormalized() string`

GetNameNormalized returns the NameNormalized field if non-nil, zero value otherwise.

### GetNameNormalizedOk

`func (o *ObjsConversationInner) GetNameNormalizedOk() (*string, bool)`

GetNameNormalizedOk returns a tuple with the NameNormalized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNameNormalized

`func (o *ObjsConversationInner) SetNameNormalized(v string)`

SetNameNormalized sets NameNormalized field to given value.


### GetNumMembers

`func (o *ObjsConversationInner) GetNumMembers() int32`

GetNumMembers returns the NumMembers field if non-nil, zero value otherwise.

### GetNumMembersOk

`func (o *ObjsConversationInner) GetNumMembersOk() (*int32, bool)`

GetNumMembersOk returns a tuple with the NumMembers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumMembers

`func (o *ObjsConversationInner) SetNumMembers(v int32)`

SetNumMembers sets NumMembers field to given value.

### HasNumMembers

`func (o *ObjsConversationInner) HasNumMembers() bool`

HasNumMembers returns a boolean if a field has been set.

### GetParentConversation

`func (o *ObjsConversationInner) GetParentConversation() []ConversationObjectParentConversationInner`

GetParentConversation returns the ParentConversation field if non-nil, zero value otherwise.

### GetParentConversationOk

`func (o *ObjsConversationInner) GetParentConversationOk() (*[]ConversationObjectParentConversationInner, bool)`

GetParentConversationOk returns a tuple with the ParentConversation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentConversation

`func (o *ObjsConversationInner) SetParentConversation(v []ConversationObjectParentConversationInner)`

SetParentConversation sets ParentConversation field to given value.

### HasParentConversation

`func (o *ObjsConversationInner) HasParentConversation() bool`

HasParentConversation returns a boolean if a field has been set.

### GetPendingConnectedTeamIds

`func (o *ObjsConversationInner) GetPendingConnectedTeamIds() []string`

GetPendingConnectedTeamIds returns the PendingConnectedTeamIds field if non-nil, zero value otherwise.

### GetPendingConnectedTeamIdsOk

`func (o *ObjsConversationInner) GetPendingConnectedTeamIdsOk() (*[]string, bool)`

GetPendingConnectedTeamIdsOk returns a tuple with the PendingConnectedTeamIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPendingConnectedTeamIds

`func (o *ObjsConversationInner) SetPendingConnectedTeamIds(v []string)`

SetPendingConnectedTeamIds sets PendingConnectedTeamIds field to given value.

### HasPendingConnectedTeamIds

`func (o *ObjsConversationInner) HasPendingConnectedTeamIds() bool`

HasPendingConnectedTeamIds returns a boolean if a field has been set.

### GetPendingShared

`func (o *ObjsConversationInner) GetPendingShared() []string`

GetPendingShared returns the PendingShared field if non-nil, zero value otherwise.

### GetPendingSharedOk

`func (o *ObjsConversationInner) GetPendingSharedOk() (*[]string, bool)`

GetPendingSharedOk returns a tuple with the PendingShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPendingShared

`func (o *ObjsConversationInner) SetPendingShared(v []string)`

SetPendingShared sets PendingShared field to given value.

### HasPendingShared

`func (o *ObjsConversationInner) HasPendingShared() bool`

HasPendingShared returns a boolean if a field has been set.

### GetPinCount

`func (o *ObjsConversationInner) GetPinCount() int32`

GetPinCount returns the PinCount field if non-nil, zero value otherwise.

### GetPinCountOk

`func (o *ObjsConversationInner) GetPinCountOk() (*int32, bool)`

GetPinCountOk returns a tuple with the PinCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinCount

`func (o *ObjsConversationInner) SetPinCount(v int32)`

SetPinCount sets PinCount field to given value.

### HasPinCount

`func (o *ObjsConversationInner) HasPinCount() bool`

HasPinCount returns a boolean if a field has been set.

### GetPreviousNames

`func (o *ObjsConversationInner) GetPreviousNames() []string`

GetPreviousNames returns the PreviousNames field if non-nil, zero value otherwise.

### GetPreviousNamesOk

`func (o *ObjsConversationInner) GetPreviousNamesOk() (*[]string, bool)`

GetPreviousNamesOk returns a tuple with the PreviousNames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousNames

`func (o *ObjsConversationInner) SetPreviousNames(v []string)`

SetPreviousNames sets PreviousNames field to given value.

### HasPreviousNames

`func (o *ObjsConversationInner) HasPreviousNames() bool`

HasPreviousNames returns a boolean if a field has been set.

### GetPriority

`func (o *ObjsConversationInner) GetPriority() float32`

GetPriority returns the Priority field if non-nil, zero value otherwise.

### GetPriorityOk

`func (o *ObjsConversationInner) GetPriorityOk() (*float32, bool)`

GetPriorityOk returns a tuple with the Priority field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriority

`func (o *ObjsConversationInner) SetPriority(v float32)`

SetPriority sets Priority field to given value.


### GetPurpose

`func (o *ObjsConversationInner) GetPurpose() ObjsChannelPurpose`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *ObjsConversationInner) GetPurposeOk() (*ObjsChannelPurpose, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *ObjsConversationInner) SetPurpose(v ObjsChannelPurpose)`

SetPurpose sets Purpose field to given value.


### GetSharedTeamIds

`func (o *ObjsConversationInner) GetSharedTeamIds() []string`

GetSharedTeamIds returns the SharedTeamIds field if non-nil, zero value otherwise.

### GetSharedTeamIdsOk

`func (o *ObjsConversationInner) GetSharedTeamIdsOk() (*[]string, bool)`

GetSharedTeamIdsOk returns a tuple with the SharedTeamIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharedTeamIds

`func (o *ObjsConversationInner) SetSharedTeamIds(v []string)`

SetSharedTeamIds sets SharedTeamIds field to given value.

### HasSharedTeamIds

`func (o *ObjsConversationInner) HasSharedTeamIds() bool`

HasSharedTeamIds returns a boolean if a field has been set.

### GetShares

`func (o *ObjsConversationInner) GetShares() []ConversationIMChannelObjectFromConversationsMethodsSharesInner`

GetShares returns the Shares field if non-nil, zero value otherwise.

### GetSharesOk

`func (o *ObjsConversationInner) GetSharesOk() (*[]ConversationIMChannelObjectFromConversationsMethodsSharesInner, bool)`

GetSharesOk returns a tuple with the Shares field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShares

`func (o *ObjsConversationInner) SetShares(v []ConversationIMChannelObjectFromConversationsMethodsSharesInner)`

SetShares sets Shares field to given value.

### HasShares

`func (o *ObjsConversationInner) HasShares() bool`

HasShares returns a boolean if a field has been set.

### GetTimezoneCount

`func (o *ObjsConversationInner) GetTimezoneCount() int32`

GetTimezoneCount returns the TimezoneCount field if non-nil, zero value otherwise.

### GetTimezoneCountOk

`func (o *ObjsConversationInner) GetTimezoneCountOk() (*int32, bool)`

GetTimezoneCountOk returns a tuple with the TimezoneCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezoneCount

`func (o *ObjsConversationInner) SetTimezoneCount(v int32)`

SetTimezoneCount sets TimezoneCount field to given value.

### HasTimezoneCount

`func (o *ObjsConversationInner) HasTimezoneCount() bool`

HasTimezoneCount returns a boolean if a field has been set.

### GetTopic

`func (o *ObjsConversationInner) GetTopic() ObjsChannelPurpose`

GetTopic returns the Topic field if non-nil, zero value otherwise.

### GetTopicOk

`func (o *ObjsConversationInner) GetTopicOk() (*ObjsChannelPurpose, bool)`

GetTopicOk returns a tuple with the Topic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopic

`func (o *ObjsConversationInner) SetTopic(v ObjsChannelPurpose)`

SetTopic sets Topic field to given value.


### GetUnlinked

`func (o *ObjsConversationInner) GetUnlinked() int32`

GetUnlinked returns the Unlinked field if non-nil, zero value otherwise.

### GetUnlinkedOk

`func (o *ObjsConversationInner) GetUnlinkedOk() (*int32, bool)`

GetUnlinkedOk returns a tuple with the Unlinked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnlinked

`func (o *ObjsConversationInner) SetUnlinked(v int32)`

SetUnlinked sets Unlinked field to given value.

### HasUnlinked

`func (o *ObjsConversationInner) HasUnlinked() bool`

HasUnlinked returns a boolean if a field has been set.

### GetUnreadCount

`func (o *ObjsConversationInner) GetUnreadCount() int32`

GetUnreadCount returns the UnreadCount field if non-nil, zero value otherwise.

### GetUnreadCountOk

`func (o *ObjsConversationInner) GetUnreadCountOk() (*int32, bool)`

GetUnreadCountOk returns a tuple with the UnreadCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCount

`func (o *ObjsConversationInner) SetUnreadCount(v int32)`

SetUnreadCount sets UnreadCount field to given value.

### HasUnreadCount

`func (o *ObjsConversationInner) HasUnreadCount() bool`

HasUnreadCount returns a boolean if a field has been set.

### GetUnreadCountDisplay

`func (o *ObjsConversationInner) GetUnreadCountDisplay() int32`

GetUnreadCountDisplay returns the UnreadCountDisplay field if non-nil, zero value otherwise.

### GetUnreadCountDisplayOk

`func (o *ObjsConversationInner) GetUnreadCountDisplayOk() (*int32, bool)`

GetUnreadCountDisplayOk returns a tuple with the UnreadCountDisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCountDisplay

`func (o *ObjsConversationInner) SetUnreadCountDisplay(v int32)`

SetUnreadCountDisplay sets UnreadCountDisplay field to given value.

### HasUnreadCountDisplay

`func (o *ObjsConversationInner) HasUnreadCountDisplay() bool`

HasUnreadCountDisplay returns a boolean if a field has been set.

### GetUseCase

`func (o *ObjsConversationInner) GetUseCase() string`

GetUseCase returns the UseCase field if non-nil, zero value otherwise.

### GetUseCaseOk

`func (o *ObjsConversationInner) GetUseCaseOk() (*string, bool)`

GetUseCaseOk returns a tuple with the UseCase field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseCase

`func (o *ObjsConversationInner) SetUseCase(v string)`

SetUseCase sets UseCase field to given value.

### HasUseCase

`func (o *ObjsConversationInner) HasUseCase() bool`

HasUseCase returns a boolean if a field has been set.

### GetUser

`func (o *ObjsConversationInner) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ObjsConversationInner) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ObjsConversationInner) SetUser(v string)`

SetUser sets User field to given value.


### GetVersion

`func (o *ObjsConversationInner) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *ObjsConversationInner) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *ObjsConversationInner) SetVersion(v int32)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *ObjsConversationInner) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetIsUserDeleted

`func (o *ObjsConversationInner) GetIsUserDeleted() bool`

GetIsUserDeleted returns the IsUserDeleted field if non-nil, zero value otherwise.

### GetIsUserDeletedOk

`func (o *ObjsConversationInner) GetIsUserDeletedOk() (*bool, bool)`

GetIsUserDeletedOk returns a tuple with the IsUserDeleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsUserDeleted

`func (o *ObjsConversationInner) SetIsUserDeleted(v bool)`

SetIsUserDeleted sets IsUserDeleted field to given value.

### HasIsUserDeleted

`func (o *ObjsConversationInner) HasIsUserDeleted() bool`

HasIsUserDeleted returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


