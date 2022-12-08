# ConversationObject

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
**Priority** | Pointer to **float32** |  | [optional] 
**Purpose** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  | 
**SharedTeamIds** | Pointer to **[]string** |  | [optional] 
**Shares** | Pointer to [**[]ConversationObjectSharesInner**](ConversationObjectSharesInner.md) |  | [optional] 
**TimezoneCount** | Pointer to **int32** |  | [optional] 
**Topic** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  | 
**Unlinked** | Pointer to **int32** |  | [optional] 
**UnreadCount** | Pointer to **int32** |  | [optional] 
**UnreadCountDisplay** | Pointer to **int32** |  | [optional] 
**UseCase** | Pointer to **string** |  | [optional] 
**User** | Pointer to **string** |  | [optional] 
**Version** | Pointer to **int32** |  | [optional] 

## Methods

### NewConversationObject

`func NewConversationObject(created int32, creator string, id string, isArchived bool, isChannel bool, isGeneral bool, isGroup bool, isIm bool, isMpim bool, isOrgShared bool, isPrivate bool, isShared bool, name string, nameNormalized string, purpose ObjsChannelPurpose, topic ObjsChannelPurpose, ) *ConversationObject`

NewConversationObject instantiates a new ConversationObject object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationObjectWithDefaults

`func NewConversationObjectWithDefaults() *ConversationObject`

NewConversationObjectWithDefaults instantiates a new ConversationObject object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAcceptedUser

`func (o *ConversationObject) GetAcceptedUser() string`

GetAcceptedUser returns the AcceptedUser field if non-nil, zero value otherwise.

### GetAcceptedUserOk

`func (o *ConversationObject) GetAcceptedUserOk() (*string, bool)`

GetAcceptedUserOk returns a tuple with the AcceptedUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptedUser

`func (o *ConversationObject) SetAcceptedUser(v string)`

SetAcceptedUser sets AcceptedUser field to given value.

### HasAcceptedUser

`func (o *ConversationObject) HasAcceptedUser() bool`

HasAcceptedUser returns a boolean if a field has been set.

### GetConnectedTeamIds

`func (o *ConversationObject) GetConnectedTeamIds() []string`

GetConnectedTeamIds returns the ConnectedTeamIds field if non-nil, zero value otherwise.

### GetConnectedTeamIdsOk

`func (o *ConversationObject) GetConnectedTeamIdsOk() (*[]string, bool)`

GetConnectedTeamIdsOk returns a tuple with the ConnectedTeamIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectedTeamIds

`func (o *ConversationObject) SetConnectedTeamIds(v []string)`

SetConnectedTeamIds sets ConnectedTeamIds field to given value.

### HasConnectedTeamIds

`func (o *ConversationObject) HasConnectedTeamIds() bool`

HasConnectedTeamIds returns a boolean if a field has been set.

### GetConversationHostId

`func (o *ConversationObject) GetConversationHostId() string`

GetConversationHostId returns the ConversationHostId field if non-nil, zero value otherwise.

### GetConversationHostIdOk

`func (o *ConversationObject) GetConversationHostIdOk() (*string, bool)`

GetConversationHostIdOk returns a tuple with the ConversationHostId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConversationHostId

`func (o *ConversationObject) SetConversationHostId(v string)`

SetConversationHostId sets ConversationHostId field to given value.

### HasConversationHostId

`func (o *ConversationObject) HasConversationHostId() bool`

HasConversationHostId returns a boolean if a field has been set.

### GetCreated

`func (o *ConversationObject) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ConversationObject) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ConversationObject) SetCreated(v int32)`

SetCreated sets Created field to given value.


### GetCreator

`func (o *ConversationObject) GetCreator() string`

GetCreator returns the Creator field if non-nil, zero value otherwise.

### GetCreatorOk

`func (o *ConversationObject) GetCreatorOk() (*string, bool)`

GetCreatorOk returns a tuple with the Creator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreator

`func (o *ConversationObject) SetCreator(v string)`

SetCreator sets Creator field to given value.


### GetDisplayCounts

`func (o *ConversationObject) GetDisplayCounts() ConversationObjectDisplayCounts`

GetDisplayCounts returns the DisplayCounts field if non-nil, zero value otherwise.

### GetDisplayCountsOk

`func (o *ConversationObject) GetDisplayCountsOk() (*ConversationObjectDisplayCounts, bool)`

GetDisplayCountsOk returns a tuple with the DisplayCounts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayCounts

`func (o *ConversationObject) SetDisplayCounts(v ConversationObjectDisplayCounts)`

SetDisplayCounts sets DisplayCounts field to given value.

### HasDisplayCounts

`func (o *ConversationObject) HasDisplayCounts() bool`

HasDisplayCounts returns a boolean if a field has been set.

### GetEnterpriseId

`func (o *ConversationObject) GetEnterpriseId() string`

GetEnterpriseId returns the EnterpriseId field if non-nil, zero value otherwise.

### GetEnterpriseIdOk

`func (o *ConversationObject) GetEnterpriseIdOk() (*string, bool)`

GetEnterpriseIdOk returns a tuple with the EnterpriseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnterpriseId

`func (o *ConversationObject) SetEnterpriseId(v string)`

SetEnterpriseId sets EnterpriseId field to given value.

### HasEnterpriseId

`func (o *ConversationObject) HasEnterpriseId() bool`

HasEnterpriseId returns a boolean if a field has been set.

### GetHasPins

`func (o *ConversationObject) GetHasPins() bool`

GetHasPins returns the HasPins field if non-nil, zero value otherwise.

### GetHasPinsOk

`func (o *ConversationObject) GetHasPinsOk() (*bool, bool)`

GetHasPinsOk returns a tuple with the HasPins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasPins

`func (o *ConversationObject) SetHasPins(v bool)`

SetHasPins sets HasPins field to given value.

### HasHasPins

`func (o *ConversationObject) HasHasPins() bool`

HasHasPins returns a boolean if a field has been set.

### GetId

`func (o *ConversationObject) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ConversationObject) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ConversationObject) SetId(v string)`

SetId sets Id field to given value.


### GetInternalTeamIds

`func (o *ConversationObject) GetInternalTeamIds() []string`

GetInternalTeamIds returns the InternalTeamIds field if non-nil, zero value otherwise.

### GetInternalTeamIdsOk

`func (o *ConversationObject) GetInternalTeamIdsOk() (*[]string, bool)`

GetInternalTeamIdsOk returns a tuple with the InternalTeamIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInternalTeamIds

`func (o *ConversationObject) SetInternalTeamIds(v []string)`

SetInternalTeamIds sets InternalTeamIds field to given value.

### HasInternalTeamIds

`func (o *ConversationObject) HasInternalTeamIds() bool`

HasInternalTeamIds returns a boolean if a field has been set.

### GetIsArchived

`func (o *ConversationObject) GetIsArchived() bool`

GetIsArchived returns the IsArchived field if non-nil, zero value otherwise.

### GetIsArchivedOk

`func (o *ConversationObject) GetIsArchivedOk() (*bool, bool)`

GetIsArchivedOk returns a tuple with the IsArchived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsArchived

`func (o *ConversationObject) SetIsArchived(v bool)`

SetIsArchived sets IsArchived field to given value.


### GetIsChannel

`func (o *ConversationObject) GetIsChannel() bool`

GetIsChannel returns the IsChannel field if non-nil, zero value otherwise.

### GetIsChannelOk

`func (o *ConversationObject) GetIsChannelOk() (*bool, bool)`

GetIsChannelOk returns a tuple with the IsChannel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsChannel

`func (o *ConversationObject) SetIsChannel(v bool)`

SetIsChannel sets IsChannel field to given value.


### GetIsExtShared

`func (o *ConversationObject) GetIsExtShared() bool`

GetIsExtShared returns the IsExtShared field if non-nil, zero value otherwise.

### GetIsExtSharedOk

`func (o *ConversationObject) GetIsExtSharedOk() (*bool, bool)`

GetIsExtSharedOk returns a tuple with the IsExtShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsExtShared

`func (o *ConversationObject) SetIsExtShared(v bool)`

SetIsExtShared sets IsExtShared field to given value.

### HasIsExtShared

`func (o *ConversationObject) HasIsExtShared() bool`

HasIsExtShared returns a boolean if a field has been set.

### GetIsFrozen

`func (o *ConversationObject) GetIsFrozen() bool`

GetIsFrozen returns the IsFrozen field if non-nil, zero value otherwise.

### GetIsFrozenOk

`func (o *ConversationObject) GetIsFrozenOk() (*bool, bool)`

GetIsFrozenOk returns a tuple with the IsFrozen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFrozen

`func (o *ConversationObject) SetIsFrozen(v bool)`

SetIsFrozen sets IsFrozen field to given value.

### HasIsFrozen

`func (o *ConversationObject) HasIsFrozen() bool`

HasIsFrozen returns a boolean if a field has been set.

### GetIsGeneral

`func (o *ConversationObject) GetIsGeneral() bool`

GetIsGeneral returns the IsGeneral field if non-nil, zero value otherwise.

### GetIsGeneralOk

`func (o *ConversationObject) GetIsGeneralOk() (*bool, bool)`

GetIsGeneralOk returns a tuple with the IsGeneral field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsGeneral

`func (o *ConversationObject) SetIsGeneral(v bool)`

SetIsGeneral sets IsGeneral field to given value.


### GetIsGlobalShared

`func (o *ConversationObject) GetIsGlobalShared() bool`

GetIsGlobalShared returns the IsGlobalShared field if non-nil, zero value otherwise.

### GetIsGlobalSharedOk

`func (o *ConversationObject) GetIsGlobalSharedOk() (*bool, bool)`

GetIsGlobalSharedOk returns a tuple with the IsGlobalShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsGlobalShared

`func (o *ConversationObject) SetIsGlobalShared(v bool)`

SetIsGlobalShared sets IsGlobalShared field to given value.

### HasIsGlobalShared

`func (o *ConversationObject) HasIsGlobalShared() bool`

HasIsGlobalShared returns a boolean if a field has been set.

### GetIsGroup

`func (o *ConversationObject) GetIsGroup() bool`

GetIsGroup returns the IsGroup field if non-nil, zero value otherwise.

### GetIsGroupOk

`func (o *ConversationObject) GetIsGroupOk() (*bool, bool)`

GetIsGroupOk returns a tuple with the IsGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsGroup

`func (o *ConversationObject) SetIsGroup(v bool)`

SetIsGroup sets IsGroup field to given value.


### GetIsIm

`func (o *ConversationObject) GetIsIm() bool`

GetIsIm returns the IsIm field if non-nil, zero value otherwise.

### GetIsImOk

`func (o *ConversationObject) GetIsImOk() (*bool, bool)`

GetIsImOk returns a tuple with the IsIm field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsIm

`func (o *ConversationObject) SetIsIm(v bool)`

SetIsIm sets IsIm field to given value.


### GetIsMember

`func (o *ConversationObject) GetIsMember() bool`

GetIsMember returns the IsMember field if non-nil, zero value otherwise.

### GetIsMemberOk

`func (o *ConversationObject) GetIsMemberOk() (*bool, bool)`

GetIsMemberOk returns a tuple with the IsMember field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMember

`func (o *ConversationObject) SetIsMember(v bool)`

SetIsMember sets IsMember field to given value.

### HasIsMember

`func (o *ConversationObject) HasIsMember() bool`

HasIsMember returns a boolean if a field has been set.

### GetIsMoved

`func (o *ConversationObject) GetIsMoved() int32`

GetIsMoved returns the IsMoved field if non-nil, zero value otherwise.

### GetIsMovedOk

`func (o *ConversationObject) GetIsMovedOk() (*int32, bool)`

GetIsMovedOk returns a tuple with the IsMoved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMoved

`func (o *ConversationObject) SetIsMoved(v int32)`

SetIsMoved sets IsMoved field to given value.

### HasIsMoved

`func (o *ConversationObject) HasIsMoved() bool`

HasIsMoved returns a boolean if a field has been set.

### GetIsMpim

`func (o *ConversationObject) GetIsMpim() bool`

GetIsMpim returns the IsMpim field if non-nil, zero value otherwise.

### GetIsMpimOk

`func (o *ConversationObject) GetIsMpimOk() (*bool, bool)`

GetIsMpimOk returns a tuple with the IsMpim field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMpim

`func (o *ConversationObject) SetIsMpim(v bool)`

SetIsMpim sets IsMpim field to given value.


### GetIsNonThreadable

`func (o *ConversationObject) GetIsNonThreadable() bool`

GetIsNonThreadable returns the IsNonThreadable field if non-nil, zero value otherwise.

### GetIsNonThreadableOk

`func (o *ConversationObject) GetIsNonThreadableOk() (*bool, bool)`

GetIsNonThreadableOk returns a tuple with the IsNonThreadable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsNonThreadable

`func (o *ConversationObject) SetIsNonThreadable(v bool)`

SetIsNonThreadable sets IsNonThreadable field to given value.

### HasIsNonThreadable

`func (o *ConversationObject) HasIsNonThreadable() bool`

HasIsNonThreadable returns a boolean if a field has been set.

### GetIsOpen

`func (o *ConversationObject) GetIsOpen() bool`

GetIsOpen returns the IsOpen field if non-nil, zero value otherwise.

### GetIsOpenOk

`func (o *ConversationObject) GetIsOpenOk() (*bool, bool)`

GetIsOpenOk returns a tuple with the IsOpen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOpen

`func (o *ConversationObject) SetIsOpen(v bool)`

SetIsOpen sets IsOpen field to given value.

### HasIsOpen

`func (o *ConversationObject) HasIsOpen() bool`

HasIsOpen returns a boolean if a field has been set.

### GetIsOrgDefault

`func (o *ConversationObject) GetIsOrgDefault() bool`

GetIsOrgDefault returns the IsOrgDefault field if non-nil, zero value otherwise.

### GetIsOrgDefaultOk

`func (o *ConversationObject) GetIsOrgDefaultOk() (*bool, bool)`

GetIsOrgDefaultOk returns a tuple with the IsOrgDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOrgDefault

`func (o *ConversationObject) SetIsOrgDefault(v bool)`

SetIsOrgDefault sets IsOrgDefault field to given value.

### HasIsOrgDefault

`func (o *ConversationObject) HasIsOrgDefault() bool`

HasIsOrgDefault returns a boolean if a field has been set.

### GetIsOrgMandatory

`func (o *ConversationObject) GetIsOrgMandatory() bool`

GetIsOrgMandatory returns the IsOrgMandatory field if non-nil, zero value otherwise.

### GetIsOrgMandatoryOk

`func (o *ConversationObject) GetIsOrgMandatoryOk() (*bool, bool)`

GetIsOrgMandatoryOk returns a tuple with the IsOrgMandatory field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOrgMandatory

`func (o *ConversationObject) SetIsOrgMandatory(v bool)`

SetIsOrgMandatory sets IsOrgMandatory field to given value.

### HasIsOrgMandatory

`func (o *ConversationObject) HasIsOrgMandatory() bool`

HasIsOrgMandatory returns a boolean if a field has been set.

### GetIsOrgShared

`func (o *ConversationObject) GetIsOrgShared() bool`

GetIsOrgShared returns the IsOrgShared field if non-nil, zero value otherwise.

### GetIsOrgSharedOk

`func (o *ConversationObject) GetIsOrgSharedOk() (*bool, bool)`

GetIsOrgSharedOk returns a tuple with the IsOrgShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOrgShared

`func (o *ConversationObject) SetIsOrgShared(v bool)`

SetIsOrgShared sets IsOrgShared field to given value.


### GetIsPendingExtShared

`func (o *ConversationObject) GetIsPendingExtShared() bool`

GetIsPendingExtShared returns the IsPendingExtShared field if non-nil, zero value otherwise.

### GetIsPendingExtSharedOk

`func (o *ConversationObject) GetIsPendingExtSharedOk() (*bool, bool)`

GetIsPendingExtSharedOk returns a tuple with the IsPendingExtShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPendingExtShared

`func (o *ConversationObject) SetIsPendingExtShared(v bool)`

SetIsPendingExtShared sets IsPendingExtShared field to given value.

### HasIsPendingExtShared

`func (o *ConversationObject) HasIsPendingExtShared() bool`

HasIsPendingExtShared returns a boolean if a field has been set.

### GetIsPrivate

`func (o *ConversationObject) GetIsPrivate() bool`

GetIsPrivate returns the IsPrivate field if non-nil, zero value otherwise.

### GetIsPrivateOk

`func (o *ConversationObject) GetIsPrivateOk() (*bool, bool)`

GetIsPrivateOk returns a tuple with the IsPrivate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPrivate

`func (o *ConversationObject) SetIsPrivate(v bool)`

SetIsPrivate sets IsPrivate field to given value.


### GetIsReadOnly

`func (o *ConversationObject) GetIsReadOnly() bool`

GetIsReadOnly returns the IsReadOnly field if non-nil, zero value otherwise.

### GetIsReadOnlyOk

`func (o *ConversationObject) GetIsReadOnlyOk() (*bool, bool)`

GetIsReadOnlyOk returns a tuple with the IsReadOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsReadOnly

`func (o *ConversationObject) SetIsReadOnly(v bool)`

SetIsReadOnly sets IsReadOnly field to given value.

### HasIsReadOnly

`func (o *ConversationObject) HasIsReadOnly() bool`

HasIsReadOnly returns a boolean if a field has been set.

### GetIsShared

`func (o *ConversationObject) GetIsShared() bool`

GetIsShared returns the IsShared field if non-nil, zero value otherwise.

### GetIsSharedOk

`func (o *ConversationObject) GetIsSharedOk() (*bool, bool)`

GetIsSharedOk returns a tuple with the IsShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsShared

`func (o *ConversationObject) SetIsShared(v bool)`

SetIsShared sets IsShared field to given value.


### GetIsStarred

`func (o *ConversationObject) GetIsStarred() bool`

GetIsStarred returns the IsStarred field if non-nil, zero value otherwise.

### GetIsStarredOk

`func (o *ConversationObject) GetIsStarredOk() (*bool, bool)`

GetIsStarredOk returns a tuple with the IsStarred field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStarred

`func (o *ConversationObject) SetIsStarred(v bool)`

SetIsStarred sets IsStarred field to given value.

### HasIsStarred

`func (o *ConversationObject) HasIsStarred() bool`

HasIsStarred returns a boolean if a field has been set.

### GetIsThreadOnly

`func (o *ConversationObject) GetIsThreadOnly() bool`

GetIsThreadOnly returns the IsThreadOnly field if non-nil, zero value otherwise.

### GetIsThreadOnlyOk

`func (o *ConversationObject) GetIsThreadOnlyOk() (*bool, bool)`

GetIsThreadOnlyOk returns a tuple with the IsThreadOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsThreadOnly

`func (o *ConversationObject) SetIsThreadOnly(v bool)`

SetIsThreadOnly sets IsThreadOnly field to given value.

### HasIsThreadOnly

`func (o *ConversationObject) HasIsThreadOnly() bool`

HasIsThreadOnly returns a boolean if a field has been set.

### GetLastRead

`func (o *ConversationObject) GetLastRead() string`

GetLastRead returns the LastRead field if non-nil, zero value otherwise.

### GetLastReadOk

`func (o *ConversationObject) GetLastReadOk() (*string, bool)`

GetLastReadOk returns a tuple with the LastRead field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastRead

`func (o *ConversationObject) SetLastRead(v string)`

SetLastRead sets LastRead field to given value.

### HasLastRead

`func (o *ConversationObject) HasLastRead() bool`

HasLastRead returns a boolean if a field has been set.

### GetLatest

`func (o *ConversationObject) GetLatest() []ObjsChannelLatestInner`

GetLatest returns the Latest field if non-nil, zero value otherwise.

### GetLatestOk

`func (o *ConversationObject) GetLatestOk() (*[]ObjsChannelLatestInner, bool)`

GetLatestOk returns a tuple with the Latest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatest

`func (o *ConversationObject) SetLatest(v []ObjsChannelLatestInner)`

SetLatest sets Latest field to given value.

### HasLatest

`func (o *ConversationObject) HasLatest() bool`

HasLatest returns a boolean if a field has been set.

### GetMembers

`func (o *ConversationObject) GetMembers() []string`

GetMembers returns the Members field if non-nil, zero value otherwise.

### GetMembersOk

`func (o *ConversationObject) GetMembersOk() (*[]string, bool)`

GetMembersOk returns a tuple with the Members field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembers

`func (o *ConversationObject) SetMembers(v []string)`

SetMembers sets Members field to given value.

### HasMembers

`func (o *ConversationObject) HasMembers() bool`

HasMembers returns a boolean if a field has been set.

### GetName

`func (o *ConversationObject) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ConversationObject) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ConversationObject) SetName(v string)`

SetName sets Name field to given value.


### GetNameNormalized

`func (o *ConversationObject) GetNameNormalized() string`

GetNameNormalized returns the NameNormalized field if non-nil, zero value otherwise.

### GetNameNormalizedOk

`func (o *ConversationObject) GetNameNormalizedOk() (*string, bool)`

GetNameNormalizedOk returns a tuple with the NameNormalized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNameNormalized

`func (o *ConversationObject) SetNameNormalized(v string)`

SetNameNormalized sets NameNormalized field to given value.


### GetNumMembers

`func (o *ConversationObject) GetNumMembers() int32`

GetNumMembers returns the NumMembers field if non-nil, zero value otherwise.

### GetNumMembersOk

`func (o *ConversationObject) GetNumMembersOk() (*int32, bool)`

GetNumMembersOk returns a tuple with the NumMembers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumMembers

`func (o *ConversationObject) SetNumMembers(v int32)`

SetNumMembers sets NumMembers field to given value.

### HasNumMembers

`func (o *ConversationObject) HasNumMembers() bool`

HasNumMembers returns a boolean if a field has been set.

### GetParentConversation

`func (o *ConversationObject) GetParentConversation() []ConversationObjectParentConversationInner`

GetParentConversation returns the ParentConversation field if non-nil, zero value otherwise.

### GetParentConversationOk

`func (o *ConversationObject) GetParentConversationOk() (*[]ConversationObjectParentConversationInner, bool)`

GetParentConversationOk returns a tuple with the ParentConversation field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetParentConversation

`func (o *ConversationObject) SetParentConversation(v []ConversationObjectParentConversationInner)`

SetParentConversation sets ParentConversation field to given value.

### HasParentConversation

`func (o *ConversationObject) HasParentConversation() bool`

HasParentConversation returns a boolean if a field has been set.

### GetPendingConnectedTeamIds

`func (o *ConversationObject) GetPendingConnectedTeamIds() []string`

GetPendingConnectedTeamIds returns the PendingConnectedTeamIds field if non-nil, zero value otherwise.

### GetPendingConnectedTeamIdsOk

`func (o *ConversationObject) GetPendingConnectedTeamIdsOk() (*[]string, bool)`

GetPendingConnectedTeamIdsOk returns a tuple with the PendingConnectedTeamIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPendingConnectedTeamIds

`func (o *ConversationObject) SetPendingConnectedTeamIds(v []string)`

SetPendingConnectedTeamIds sets PendingConnectedTeamIds field to given value.

### HasPendingConnectedTeamIds

`func (o *ConversationObject) HasPendingConnectedTeamIds() bool`

HasPendingConnectedTeamIds returns a boolean if a field has been set.

### GetPendingShared

`func (o *ConversationObject) GetPendingShared() []string`

GetPendingShared returns the PendingShared field if non-nil, zero value otherwise.

### GetPendingSharedOk

`func (o *ConversationObject) GetPendingSharedOk() (*[]string, bool)`

GetPendingSharedOk returns a tuple with the PendingShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPendingShared

`func (o *ConversationObject) SetPendingShared(v []string)`

SetPendingShared sets PendingShared field to given value.

### HasPendingShared

`func (o *ConversationObject) HasPendingShared() bool`

HasPendingShared returns a boolean if a field has been set.

### GetPinCount

`func (o *ConversationObject) GetPinCount() int32`

GetPinCount returns the PinCount field if non-nil, zero value otherwise.

### GetPinCountOk

`func (o *ConversationObject) GetPinCountOk() (*int32, bool)`

GetPinCountOk returns a tuple with the PinCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPinCount

`func (o *ConversationObject) SetPinCount(v int32)`

SetPinCount sets PinCount field to given value.

### HasPinCount

`func (o *ConversationObject) HasPinCount() bool`

HasPinCount returns a boolean if a field has been set.

### GetPreviousNames

`func (o *ConversationObject) GetPreviousNames() []string`

GetPreviousNames returns the PreviousNames field if non-nil, zero value otherwise.

### GetPreviousNamesOk

`func (o *ConversationObject) GetPreviousNamesOk() (*[]string, bool)`

GetPreviousNamesOk returns a tuple with the PreviousNames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousNames

`func (o *ConversationObject) SetPreviousNames(v []string)`

SetPreviousNames sets PreviousNames field to given value.

### HasPreviousNames

`func (o *ConversationObject) HasPreviousNames() bool`

HasPreviousNames returns a boolean if a field has been set.

### GetPriority

`func (o *ConversationObject) GetPriority() float32`

GetPriority returns the Priority field if non-nil, zero value otherwise.

### GetPriorityOk

`func (o *ConversationObject) GetPriorityOk() (*float32, bool)`

GetPriorityOk returns a tuple with the Priority field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriority

`func (o *ConversationObject) SetPriority(v float32)`

SetPriority sets Priority field to given value.

### HasPriority

`func (o *ConversationObject) HasPriority() bool`

HasPriority returns a boolean if a field has been set.

### GetPurpose

`func (o *ConversationObject) GetPurpose() ObjsChannelPurpose`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *ConversationObject) GetPurposeOk() (*ObjsChannelPurpose, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *ConversationObject) SetPurpose(v ObjsChannelPurpose)`

SetPurpose sets Purpose field to given value.


### GetSharedTeamIds

`func (o *ConversationObject) GetSharedTeamIds() []string`

GetSharedTeamIds returns the SharedTeamIds field if non-nil, zero value otherwise.

### GetSharedTeamIdsOk

`func (o *ConversationObject) GetSharedTeamIdsOk() (*[]string, bool)`

GetSharedTeamIdsOk returns a tuple with the SharedTeamIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSharedTeamIds

`func (o *ConversationObject) SetSharedTeamIds(v []string)`

SetSharedTeamIds sets SharedTeamIds field to given value.

### HasSharedTeamIds

`func (o *ConversationObject) HasSharedTeamIds() bool`

HasSharedTeamIds returns a boolean if a field has been set.

### GetShares

`func (o *ConversationObject) GetShares() []ConversationObjectSharesInner`

GetShares returns the Shares field if non-nil, zero value otherwise.

### GetSharesOk

`func (o *ConversationObject) GetSharesOk() (*[]ConversationObjectSharesInner, bool)`

GetSharesOk returns a tuple with the Shares field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShares

`func (o *ConversationObject) SetShares(v []ConversationObjectSharesInner)`

SetShares sets Shares field to given value.

### HasShares

`func (o *ConversationObject) HasShares() bool`

HasShares returns a boolean if a field has been set.

### GetTimezoneCount

`func (o *ConversationObject) GetTimezoneCount() int32`

GetTimezoneCount returns the TimezoneCount field if non-nil, zero value otherwise.

### GetTimezoneCountOk

`func (o *ConversationObject) GetTimezoneCountOk() (*int32, bool)`

GetTimezoneCountOk returns a tuple with the TimezoneCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimezoneCount

`func (o *ConversationObject) SetTimezoneCount(v int32)`

SetTimezoneCount sets TimezoneCount field to given value.

### HasTimezoneCount

`func (o *ConversationObject) HasTimezoneCount() bool`

HasTimezoneCount returns a boolean if a field has been set.

### GetTopic

`func (o *ConversationObject) GetTopic() ObjsChannelPurpose`

GetTopic returns the Topic field if non-nil, zero value otherwise.

### GetTopicOk

`func (o *ConversationObject) GetTopicOk() (*ObjsChannelPurpose, bool)`

GetTopicOk returns a tuple with the Topic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopic

`func (o *ConversationObject) SetTopic(v ObjsChannelPurpose)`

SetTopic sets Topic field to given value.


### GetUnlinked

`func (o *ConversationObject) GetUnlinked() int32`

GetUnlinked returns the Unlinked field if non-nil, zero value otherwise.

### GetUnlinkedOk

`func (o *ConversationObject) GetUnlinkedOk() (*int32, bool)`

GetUnlinkedOk returns a tuple with the Unlinked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnlinked

`func (o *ConversationObject) SetUnlinked(v int32)`

SetUnlinked sets Unlinked field to given value.

### HasUnlinked

`func (o *ConversationObject) HasUnlinked() bool`

HasUnlinked returns a boolean if a field has been set.

### GetUnreadCount

`func (o *ConversationObject) GetUnreadCount() int32`

GetUnreadCount returns the UnreadCount field if non-nil, zero value otherwise.

### GetUnreadCountOk

`func (o *ConversationObject) GetUnreadCountOk() (*int32, bool)`

GetUnreadCountOk returns a tuple with the UnreadCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCount

`func (o *ConversationObject) SetUnreadCount(v int32)`

SetUnreadCount sets UnreadCount field to given value.

### HasUnreadCount

`func (o *ConversationObject) HasUnreadCount() bool`

HasUnreadCount returns a boolean if a field has been set.

### GetUnreadCountDisplay

`func (o *ConversationObject) GetUnreadCountDisplay() int32`

GetUnreadCountDisplay returns the UnreadCountDisplay field if non-nil, zero value otherwise.

### GetUnreadCountDisplayOk

`func (o *ConversationObject) GetUnreadCountDisplayOk() (*int32, bool)`

GetUnreadCountDisplayOk returns a tuple with the UnreadCountDisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCountDisplay

`func (o *ConversationObject) SetUnreadCountDisplay(v int32)`

SetUnreadCountDisplay sets UnreadCountDisplay field to given value.

### HasUnreadCountDisplay

`func (o *ConversationObject) HasUnreadCountDisplay() bool`

HasUnreadCountDisplay returns a boolean if a field has been set.

### GetUseCase

`func (o *ConversationObject) GetUseCase() string`

GetUseCase returns the UseCase field if non-nil, zero value otherwise.

### GetUseCaseOk

`func (o *ConversationObject) GetUseCaseOk() (*string, bool)`

GetUseCaseOk returns a tuple with the UseCase field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseCase

`func (o *ConversationObject) SetUseCase(v string)`

SetUseCase sets UseCase field to given value.

### HasUseCase

`func (o *ConversationObject) HasUseCase() bool`

HasUseCase returns a boolean if a field has been set.

### GetUser

`func (o *ConversationObject) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ConversationObject) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ConversationObject) SetUser(v string)`

SetUser sets User field to given value.

### HasUser

`func (o *ConversationObject) HasUser() bool`

HasUser returns a boolean if a field has been set.

### GetVersion

`func (o *ConversationObject) GetVersion() int32`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *ConversationObject) GetVersionOk() (*int32, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *ConversationObject) SetVersion(v int32)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *ConversationObject) HasVersion() bool`

HasVersion returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


