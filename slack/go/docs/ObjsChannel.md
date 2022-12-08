# ObjsChannel

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AcceptedUser** | Pointer to **string** |  | [optional] 
**Created** | **int32** |  | 
**Creator** | **string** |  | 
**Id** | **string** |  | 
**IsArchived** | Pointer to **bool** |  | [optional] 
**IsChannel** | **bool** |  | 
**IsFrozen** | Pointer to **bool** |  | [optional] 
**IsGeneral** | Pointer to **bool** |  | [optional] 
**IsMember** | Pointer to **bool** |  | [optional] 
**IsMoved** | Pointer to **int32** |  | [optional] 
**IsMpim** | **bool** |  | 
**IsNonThreadable** | Pointer to **bool** |  | [optional] 
**IsOrgShared** | **bool** |  | 
**IsPendingExtShared** | Pointer to **bool** |  | [optional] 
**IsPrivate** | **bool** |  | 
**IsReadOnly** | Pointer to **bool** |  | [optional] 
**IsShared** | **bool** |  | 
**IsThreadOnly** | Pointer to **bool** |  | [optional] 
**LastRead** | Pointer to **string** |  | [optional] 
**Latest** | Pointer to [**[]ObjsChannelLatestInner**](ObjsChannelLatestInner.md) |  | [optional] 
**Members** | **[]string** |  | 
**Name** | **string** |  | 
**NameNormalized** | **string** |  | 
**NumMembers** | Pointer to **int32** |  | [optional] 
**PendingShared** | Pointer to **[]string** |  | [optional] 
**PreviousNames** | Pointer to **[]string** |  | [optional] 
**Priority** | Pointer to **float32** |  | [optional] 
**Purpose** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  | 
**Topic** | [**ObjsChannelPurpose**](ObjsChannelPurpose.md) |  | 
**Unlinked** | Pointer to **int32** |  | [optional] 
**UnreadCount** | Pointer to **int32** |  | [optional] 
**UnreadCountDisplay** | Pointer to **int32** |  | [optional] 

## Methods

### NewObjsChannel

`func NewObjsChannel(created int32, creator string, id string, isChannel bool, isMpim bool, isOrgShared bool, isPrivate bool, isShared bool, members []string, name string, nameNormalized string, purpose ObjsChannelPurpose, topic ObjsChannelPurpose, ) *ObjsChannel`

NewObjsChannel instantiates a new ObjsChannel object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsChannelWithDefaults

`func NewObjsChannelWithDefaults() *ObjsChannel`

NewObjsChannelWithDefaults instantiates a new ObjsChannel object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAcceptedUser

`func (o *ObjsChannel) GetAcceptedUser() string`

GetAcceptedUser returns the AcceptedUser field if non-nil, zero value otherwise.

### GetAcceptedUserOk

`func (o *ObjsChannel) GetAcceptedUserOk() (*string, bool)`

GetAcceptedUserOk returns a tuple with the AcceptedUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAcceptedUser

`func (o *ObjsChannel) SetAcceptedUser(v string)`

SetAcceptedUser sets AcceptedUser field to given value.

### HasAcceptedUser

`func (o *ObjsChannel) HasAcceptedUser() bool`

HasAcceptedUser returns a boolean if a field has been set.

### GetCreated

`func (o *ObjsChannel) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ObjsChannel) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ObjsChannel) SetCreated(v int32)`

SetCreated sets Created field to given value.


### GetCreator

`func (o *ObjsChannel) GetCreator() string`

GetCreator returns the Creator field if non-nil, zero value otherwise.

### GetCreatorOk

`func (o *ObjsChannel) GetCreatorOk() (*string, bool)`

GetCreatorOk returns a tuple with the Creator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreator

`func (o *ObjsChannel) SetCreator(v string)`

SetCreator sets Creator field to given value.


### GetId

`func (o *ObjsChannel) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ObjsChannel) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ObjsChannel) SetId(v string)`

SetId sets Id field to given value.


### GetIsArchived

`func (o *ObjsChannel) GetIsArchived() bool`

GetIsArchived returns the IsArchived field if non-nil, zero value otherwise.

### GetIsArchivedOk

`func (o *ObjsChannel) GetIsArchivedOk() (*bool, bool)`

GetIsArchivedOk returns a tuple with the IsArchived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsArchived

`func (o *ObjsChannel) SetIsArchived(v bool)`

SetIsArchived sets IsArchived field to given value.

### HasIsArchived

`func (o *ObjsChannel) HasIsArchived() bool`

HasIsArchived returns a boolean if a field has been set.

### GetIsChannel

`func (o *ObjsChannel) GetIsChannel() bool`

GetIsChannel returns the IsChannel field if non-nil, zero value otherwise.

### GetIsChannelOk

`func (o *ObjsChannel) GetIsChannelOk() (*bool, bool)`

GetIsChannelOk returns a tuple with the IsChannel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsChannel

`func (o *ObjsChannel) SetIsChannel(v bool)`

SetIsChannel sets IsChannel field to given value.


### GetIsFrozen

`func (o *ObjsChannel) GetIsFrozen() bool`

GetIsFrozen returns the IsFrozen field if non-nil, zero value otherwise.

### GetIsFrozenOk

`func (o *ObjsChannel) GetIsFrozenOk() (*bool, bool)`

GetIsFrozenOk returns a tuple with the IsFrozen field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsFrozen

`func (o *ObjsChannel) SetIsFrozen(v bool)`

SetIsFrozen sets IsFrozen field to given value.

### HasIsFrozen

`func (o *ObjsChannel) HasIsFrozen() bool`

HasIsFrozen returns a boolean if a field has been set.

### GetIsGeneral

`func (o *ObjsChannel) GetIsGeneral() bool`

GetIsGeneral returns the IsGeneral field if non-nil, zero value otherwise.

### GetIsGeneralOk

`func (o *ObjsChannel) GetIsGeneralOk() (*bool, bool)`

GetIsGeneralOk returns a tuple with the IsGeneral field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsGeneral

`func (o *ObjsChannel) SetIsGeneral(v bool)`

SetIsGeneral sets IsGeneral field to given value.

### HasIsGeneral

`func (o *ObjsChannel) HasIsGeneral() bool`

HasIsGeneral returns a boolean if a field has been set.

### GetIsMember

`func (o *ObjsChannel) GetIsMember() bool`

GetIsMember returns the IsMember field if non-nil, zero value otherwise.

### GetIsMemberOk

`func (o *ObjsChannel) GetIsMemberOk() (*bool, bool)`

GetIsMemberOk returns a tuple with the IsMember field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMember

`func (o *ObjsChannel) SetIsMember(v bool)`

SetIsMember sets IsMember field to given value.

### HasIsMember

`func (o *ObjsChannel) HasIsMember() bool`

HasIsMember returns a boolean if a field has been set.

### GetIsMoved

`func (o *ObjsChannel) GetIsMoved() int32`

GetIsMoved returns the IsMoved field if non-nil, zero value otherwise.

### GetIsMovedOk

`func (o *ObjsChannel) GetIsMovedOk() (*int32, bool)`

GetIsMovedOk returns a tuple with the IsMoved field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMoved

`func (o *ObjsChannel) SetIsMoved(v int32)`

SetIsMoved sets IsMoved field to given value.

### HasIsMoved

`func (o *ObjsChannel) HasIsMoved() bool`

HasIsMoved returns a boolean if a field has been set.

### GetIsMpim

`func (o *ObjsChannel) GetIsMpim() bool`

GetIsMpim returns the IsMpim field if non-nil, zero value otherwise.

### GetIsMpimOk

`func (o *ObjsChannel) GetIsMpimOk() (*bool, bool)`

GetIsMpimOk returns a tuple with the IsMpim field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMpim

`func (o *ObjsChannel) SetIsMpim(v bool)`

SetIsMpim sets IsMpim field to given value.


### GetIsNonThreadable

`func (o *ObjsChannel) GetIsNonThreadable() bool`

GetIsNonThreadable returns the IsNonThreadable field if non-nil, zero value otherwise.

### GetIsNonThreadableOk

`func (o *ObjsChannel) GetIsNonThreadableOk() (*bool, bool)`

GetIsNonThreadableOk returns a tuple with the IsNonThreadable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsNonThreadable

`func (o *ObjsChannel) SetIsNonThreadable(v bool)`

SetIsNonThreadable sets IsNonThreadable field to given value.

### HasIsNonThreadable

`func (o *ObjsChannel) HasIsNonThreadable() bool`

HasIsNonThreadable returns a boolean if a field has been set.

### GetIsOrgShared

`func (o *ObjsChannel) GetIsOrgShared() bool`

GetIsOrgShared returns the IsOrgShared field if non-nil, zero value otherwise.

### GetIsOrgSharedOk

`func (o *ObjsChannel) GetIsOrgSharedOk() (*bool, bool)`

GetIsOrgSharedOk returns a tuple with the IsOrgShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOrgShared

`func (o *ObjsChannel) SetIsOrgShared(v bool)`

SetIsOrgShared sets IsOrgShared field to given value.


### GetIsPendingExtShared

`func (o *ObjsChannel) GetIsPendingExtShared() bool`

GetIsPendingExtShared returns the IsPendingExtShared field if non-nil, zero value otherwise.

### GetIsPendingExtSharedOk

`func (o *ObjsChannel) GetIsPendingExtSharedOk() (*bool, bool)`

GetIsPendingExtSharedOk returns a tuple with the IsPendingExtShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPendingExtShared

`func (o *ObjsChannel) SetIsPendingExtShared(v bool)`

SetIsPendingExtShared sets IsPendingExtShared field to given value.

### HasIsPendingExtShared

`func (o *ObjsChannel) HasIsPendingExtShared() bool`

HasIsPendingExtShared returns a boolean if a field has been set.

### GetIsPrivate

`func (o *ObjsChannel) GetIsPrivate() bool`

GetIsPrivate returns the IsPrivate field if non-nil, zero value otherwise.

### GetIsPrivateOk

`func (o *ObjsChannel) GetIsPrivateOk() (*bool, bool)`

GetIsPrivateOk returns a tuple with the IsPrivate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPrivate

`func (o *ObjsChannel) SetIsPrivate(v bool)`

SetIsPrivate sets IsPrivate field to given value.


### GetIsReadOnly

`func (o *ObjsChannel) GetIsReadOnly() bool`

GetIsReadOnly returns the IsReadOnly field if non-nil, zero value otherwise.

### GetIsReadOnlyOk

`func (o *ObjsChannel) GetIsReadOnlyOk() (*bool, bool)`

GetIsReadOnlyOk returns a tuple with the IsReadOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsReadOnly

`func (o *ObjsChannel) SetIsReadOnly(v bool)`

SetIsReadOnly sets IsReadOnly field to given value.

### HasIsReadOnly

`func (o *ObjsChannel) HasIsReadOnly() bool`

HasIsReadOnly returns a boolean if a field has been set.

### GetIsShared

`func (o *ObjsChannel) GetIsShared() bool`

GetIsShared returns the IsShared field if non-nil, zero value otherwise.

### GetIsSharedOk

`func (o *ObjsChannel) GetIsSharedOk() (*bool, bool)`

GetIsSharedOk returns a tuple with the IsShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsShared

`func (o *ObjsChannel) SetIsShared(v bool)`

SetIsShared sets IsShared field to given value.


### GetIsThreadOnly

`func (o *ObjsChannel) GetIsThreadOnly() bool`

GetIsThreadOnly returns the IsThreadOnly field if non-nil, zero value otherwise.

### GetIsThreadOnlyOk

`func (o *ObjsChannel) GetIsThreadOnlyOk() (*bool, bool)`

GetIsThreadOnlyOk returns a tuple with the IsThreadOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsThreadOnly

`func (o *ObjsChannel) SetIsThreadOnly(v bool)`

SetIsThreadOnly sets IsThreadOnly field to given value.

### HasIsThreadOnly

`func (o *ObjsChannel) HasIsThreadOnly() bool`

HasIsThreadOnly returns a boolean if a field has been set.

### GetLastRead

`func (o *ObjsChannel) GetLastRead() string`

GetLastRead returns the LastRead field if non-nil, zero value otherwise.

### GetLastReadOk

`func (o *ObjsChannel) GetLastReadOk() (*string, bool)`

GetLastReadOk returns a tuple with the LastRead field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastRead

`func (o *ObjsChannel) SetLastRead(v string)`

SetLastRead sets LastRead field to given value.

### HasLastRead

`func (o *ObjsChannel) HasLastRead() bool`

HasLastRead returns a boolean if a field has been set.

### GetLatest

`func (o *ObjsChannel) GetLatest() []ObjsChannelLatestInner`

GetLatest returns the Latest field if non-nil, zero value otherwise.

### GetLatestOk

`func (o *ObjsChannel) GetLatestOk() (*[]ObjsChannelLatestInner, bool)`

GetLatestOk returns a tuple with the Latest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatest

`func (o *ObjsChannel) SetLatest(v []ObjsChannelLatestInner)`

SetLatest sets Latest field to given value.

### HasLatest

`func (o *ObjsChannel) HasLatest() bool`

HasLatest returns a boolean if a field has been set.

### GetMembers

`func (o *ObjsChannel) GetMembers() []string`

GetMembers returns the Members field if non-nil, zero value otherwise.

### GetMembersOk

`func (o *ObjsChannel) GetMembersOk() (*[]string, bool)`

GetMembersOk returns a tuple with the Members field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembers

`func (o *ObjsChannel) SetMembers(v []string)`

SetMembers sets Members field to given value.


### GetName

`func (o *ObjsChannel) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ObjsChannel) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ObjsChannel) SetName(v string)`

SetName sets Name field to given value.


### GetNameNormalized

`func (o *ObjsChannel) GetNameNormalized() string`

GetNameNormalized returns the NameNormalized field if non-nil, zero value otherwise.

### GetNameNormalizedOk

`func (o *ObjsChannel) GetNameNormalizedOk() (*string, bool)`

GetNameNormalizedOk returns a tuple with the NameNormalized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNameNormalized

`func (o *ObjsChannel) SetNameNormalized(v string)`

SetNameNormalized sets NameNormalized field to given value.


### GetNumMembers

`func (o *ObjsChannel) GetNumMembers() int32`

GetNumMembers returns the NumMembers field if non-nil, zero value otherwise.

### GetNumMembersOk

`func (o *ObjsChannel) GetNumMembersOk() (*int32, bool)`

GetNumMembersOk returns a tuple with the NumMembers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNumMembers

`func (o *ObjsChannel) SetNumMembers(v int32)`

SetNumMembers sets NumMembers field to given value.

### HasNumMembers

`func (o *ObjsChannel) HasNumMembers() bool`

HasNumMembers returns a boolean if a field has been set.

### GetPendingShared

`func (o *ObjsChannel) GetPendingShared() []string`

GetPendingShared returns the PendingShared field if non-nil, zero value otherwise.

### GetPendingSharedOk

`func (o *ObjsChannel) GetPendingSharedOk() (*[]string, bool)`

GetPendingSharedOk returns a tuple with the PendingShared field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPendingShared

`func (o *ObjsChannel) SetPendingShared(v []string)`

SetPendingShared sets PendingShared field to given value.

### HasPendingShared

`func (o *ObjsChannel) HasPendingShared() bool`

HasPendingShared returns a boolean if a field has been set.

### GetPreviousNames

`func (o *ObjsChannel) GetPreviousNames() []string`

GetPreviousNames returns the PreviousNames field if non-nil, zero value otherwise.

### GetPreviousNamesOk

`func (o *ObjsChannel) GetPreviousNamesOk() (*[]string, bool)`

GetPreviousNamesOk returns a tuple with the PreviousNames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPreviousNames

`func (o *ObjsChannel) SetPreviousNames(v []string)`

SetPreviousNames sets PreviousNames field to given value.

### HasPreviousNames

`func (o *ObjsChannel) HasPreviousNames() bool`

HasPreviousNames returns a boolean if a field has been set.

### GetPriority

`func (o *ObjsChannel) GetPriority() float32`

GetPriority returns the Priority field if non-nil, zero value otherwise.

### GetPriorityOk

`func (o *ObjsChannel) GetPriorityOk() (*float32, bool)`

GetPriorityOk returns a tuple with the Priority field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriority

`func (o *ObjsChannel) SetPriority(v float32)`

SetPriority sets Priority field to given value.

### HasPriority

`func (o *ObjsChannel) HasPriority() bool`

HasPriority returns a boolean if a field has been set.

### GetPurpose

`func (o *ObjsChannel) GetPurpose() ObjsChannelPurpose`

GetPurpose returns the Purpose field if non-nil, zero value otherwise.

### GetPurposeOk

`func (o *ObjsChannel) GetPurposeOk() (*ObjsChannelPurpose, bool)`

GetPurposeOk returns a tuple with the Purpose field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPurpose

`func (o *ObjsChannel) SetPurpose(v ObjsChannelPurpose)`

SetPurpose sets Purpose field to given value.


### GetTopic

`func (o *ObjsChannel) GetTopic() ObjsChannelPurpose`

GetTopic returns the Topic field if non-nil, zero value otherwise.

### GetTopicOk

`func (o *ObjsChannel) GetTopicOk() (*ObjsChannelPurpose, bool)`

GetTopicOk returns a tuple with the Topic field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopic

`func (o *ObjsChannel) SetTopic(v ObjsChannelPurpose)`

SetTopic sets Topic field to given value.


### GetUnlinked

`func (o *ObjsChannel) GetUnlinked() int32`

GetUnlinked returns the Unlinked field if non-nil, zero value otherwise.

### GetUnlinkedOk

`func (o *ObjsChannel) GetUnlinkedOk() (*int32, bool)`

GetUnlinkedOk returns a tuple with the Unlinked field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnlinked

`func (o *ObjsChannel) SetUnlinked(v int32)`

SetUnlinked sets Unlinked field to given value.

### HasUnlinked

`func (o *ObjsChannel) HasUnlinked() bool`

HasUnlinked returns a boolean if a field has been set.

### GetUnreadCount

`func (o *ObjsChannel) GetUnreadCount() int32`

GetUnreadCount returns the UnreadCount field if non-nil, zero value otherwise.

### GetUnreadCountOk

`func (o *ObjsChannel) GetUnreadCountOk() (*int32, bool)`

GetUnreadCountOk returns a tuple with the UnreadCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCount

`func (o *ObjsChannel) SetUnreadCount(v int32)`

SetUnreadCount sets UnreadCount field to given value.

### HasUnreadCount

`func (o *ObjsChannel) HasUnreadCount() bool`

HasUnreadCount returns a boolean if a field has been set.

### GetUnreadCountDisplay

`func (o *ObjsChannel) GetUnreadCountDisplay() int32`

GetUnreadCountDisplay returns the UnreadCountDisplay field if non-nil, zero value otherwise.

### GetUnreadCountDisplayOk

`func (o *ObjsChannel) GetUnreadCountDisplayOk() (*int32, bool)`

GetUnreadCountDisplayOk returns a tuple with the UnreadCountDisplay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUnreadCountDisplay

`func (o *ObjsChannel) SetUnreadCountDisplay(v int32)`

SetUnreadCountDisplay sets UnreadCountDisplay field to given value.

### HasUnreadCountDisplay

`func (o *ObjsChannel) HasUnreadCountDisplay() bool`

HasUnreadCountDisplay returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


