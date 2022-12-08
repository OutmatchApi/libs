# ObjsUserInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Color** | Pointer to **string** | refercing to bug: https://jira.tinyspeck.com/browse/EVALUE-1559 | [optional] 
**Deleted** | Pointer to **bool** |  | [optional] 
**EnterpriseUser** | Pointer to [**ObjsEnterpriseUser**](ObjsEnterpriseUser.md) |  | [optional] 
**Has2fa** | Pointer to **bool** |  | [optional] 
**Id** | **string** |  | 
**IsAdmin** | Pointer to **bool** |  | [optional] 
**IsAppUser** | **bool** |  | 
**IsBot** | **bool** |  | 
**IsExternal** | Pointer to **bool** |  | [optional] 
**IsForgotten** | Pointer to **bool** |  | [optional] 
**IsInvitedUser** | Pointer to **bool** |  | [optional] 
**IsOwner** | Pointer to **bool** |  | [optional] 
**IsPrimaryOwner** | Pointer to **bool** |  | [optional] 
**IsRestricted** | Pointer to **bool** |  | [optional] 
**IsStranger** | Pointer to **bool** |  | [optional] 
**IsUltraRestricted** | Pointer to **bool** |  | [optional] 
**Locale** | Pointer to **string** |  | [optional] 
**Name** | **string** |  | 
**Presence** | Pointer to **string** |  | [optional] 
**Profile** | [**ObjsUserProfile**](ObjsUserProfile.md) |  | 
**RealName** | Pointer to **string** |  | [optional] 
**Team** | Pointer to **string** |  | [optional] 
**TeamId** | Pointer to **string** |  | [optional] 
**TeamProfile** | Pointer to [**ObjsUserInnerAnyOfTeamProfile**](ObjsUserInnerAnyOfTeamProfile.md) |  | [optional] 
**TwoFactorType** | Pointer to **string** |  | [optional] 
**Tz** | Pointer to [**[]ObjsTeamDiscoverableInner**](ObjsTeamDiscoverableInner.md) |  | [optional] 
**TzLabel** | Pointer to **string** |  | [optional] 
**TzOffset** | Pointer to **float32** |  | [optional] 
**Updated** | **float32** |  | 
**Teams** | Pointer to **[]string** |  | [optional] 

## Methods

### NewObjsUserInner

`func NewObjsUserInner(id string, isAppUser bool, isBot bool, name string, profile ObjsUserProfile, updated float32, ) *ObjsUserInner`

NewObjsUserInner instantiates a new ObjsUserInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsUserInnerWithDefaults

`func NewObjsUserInnerWithDefaults() *ObjsUserInner`

NewObjsUserInnerWithDefaults instantiates a new ObjsUserInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetColor

`func (o *ObjsUserInner) GetColor() string`

GetColor returns the Color field if non-nil, zero value otherwise.

### GetColorOk

`func (o *ObjsUserInner) GetColorOk() (*string, bool)`

GetColorOk returns a tuple with the Color field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColor

`func (o *ObjsUserInner) SetColor(v string)`

SetColor sets Color field to given value.

### HasColor

`func (o *ObjsUserInner) HasColor() bool`

HasColor returns a boolean if a field has been set.

### GetDeleted

`func (o *ObjsUserInner) GetDeleted() bool`

GetDeleted returns the Deleted field if non-nil, zero value otherwise.

### GetDeletedOk

`func (o *ObjsUserInner) GetDeletedOk() (*bool, bool)`

GetDeletedOk returns a tuple with the Deleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleted

`func (o *ObjsUserInner) SetDeleted(v bool)`

SetDeleted sets Deleted field to given value.

### HasDeleted

`func (o *ObjsUserInner) HasDeleted() bool`

HasDeleted returns a boolean if a field has been set.

### GetEnterpriseUser

`func (o *ObjsUserInner) GetEnterpriseUser() ObjsEnterpriseUser`

GetEnterpriseUser returns the EnterpriseUser field if non-nil, zero value otherwise.

### GetEnterpriseUserOk

`func (o *ObjsUserInner) GetEnterpriseUserOk() (*ObjsEnterpriseUser, bool)`

GetEnterpriseUserOk returns a tuple with the EnterpriseUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnterpriseUser

`func (o *ObjsUserInner) SetEnterpriseUser(v ObjsEnterpriseUser)`

SetEnterpriseUser sets EnterpriseUser field to given value.

### HasEnterpriseUser

`func (o *ObjsUserInner) HasEnterpriseUser() bool`

HasEnterpriseUser returns a boolean if a field has been set.

### GetHas2fa

`func (o *ObjsUserInner) GetHas2fa() bool`

GetHas2fa returns the Has2fa field if non-nil, zero value otherwise.

### GetHas2faOk

`func (o *ObjsUserInner) GetHas2faOk() (*bool, bool)`

GetHas2faOk returns a tuple with the Has2fa field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHas2fa

`func (o *ObjsUserInner) SetHas2fa(v bool)`

SetHas2fa sets Has2fa field to given value.

### HasHas2fa

`func (o *ObjsUserInner) HasHas2fa() bool`

HasHas2fa returns a boolean if a field has been set.

### GetId

`func (o *ObjsUserInner) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ObjsUserInner) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ObjsUserInner) SetId(v string)`

SetId sets Id field to given value.


### GetIsAdmin

`func (o *ObjsUserInner) GetIsAdmin() bool`

GetIsAdmin returns the IsAdmin field if non-nil, zero value otherwise.

### GetIsAdminOk

`func (o *ObjsUserInner) GetIsAdminOk() (*bool, bool)`

GetIsAdminOk returns a tuple with the IsAdmin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAdmin

`func (o *ObjsUserInner) SetIsAdmin(v bool)`

SetIsAdmin sets IsAdmin field to given value.

### HasIsAdmin

`func (o *ObjsUserInner) HasIsAdmin() bool`

HasIsAdmin returns a boolean if a field has been set.

### GetIsAppUser

`func (o *ObjsUserInner) GetIsAppUser() bool`

GetIsAppUser returns the IsAppUser field if non-nil, zero value otherwise.

### GetIsAppUserOk

`func (o *ObjsUserInner) GetIsAppUserOk() (*bool, bool)`

GetIsAppUserOk returns a tuple with the IsAppUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAppUser

`func (o *ObjsUserInner) SetIsAppUser(v bool)`

SetIsAppUser sets IsAppUser field to given value.


### GetIsBot

`func (o *ObjsUserInner) GetIsBot() bool`

GetIsBot returns the IsBot field if non-nil, zero value otherwise.

### GetIsBotOk

`func (o *ObjsUserInner) GetIsBotOk() (*bool, bool)`

GetIsBotOk returns a tuple with the IsBot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBot

`func (o *ObjsUserInner) SetIsBot(v bool)`

SetIsBot sets IsBot field to given value.


### GetIsExternal

`func (o *ObjsUserInner) GetIsExternal() bool`

GetIsExternal returns the IsExternal field if non-nil, zero value otherwise.

### GetIsExternalOk

`func (o *ObjsUserInner) GetIsExternalOk() (*bool, bool)`

GetIsExternalOk returns a tuple with the IsExternal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsExternal

`func (o *ObjsUserInner) SetIsExternal(v bool)`

SetIsExternal sets IsExternal field to given value.

### HasIsExternal

`func (o *ObjsUserInner) HasIsExternal() bool`

HasIsExternal returns a boolean if a field has been set.

### GetIsForgotten

`func (o *ObjsUserInner) GetIsForgotten() bool`

GetIsForgotten returns the IsForgotten field if non-nil, zero value otherwise.

### GetIsForgottenOk

`func (o *ObjsUserInner) GetIsForgottenOk() (*bool, bool)`

GetIsForgottenOk returns a tuple with the IsForgotten field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsForgotten

`func (o *ObjsUserInner) SetIsForgotten(v bool)`

SetIsForgotten sets IsForgotten field to given value.

### HasIsForgotten

`func (o *ObjsUserInner) HasIsForgotten() bool`

HasIsForgotten returns a boolean if a field has been set.

### GetIsInvitedUser

`func (o *ObjsUserInner) GetIsInvitedUser() bool`

GetIsInvitedUser returns the IsInvitedUser field if non-nil, zero value otherwise.

### GetIsInvitedUserOk

`func (o *ObjsUserInner) GetIsInvitedUserOk() (*bool, bool)`

GetIsInvitedUserOk returns a tuple with the IsInvitedUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsInvitedUser

`func (o *ObjsUserInner) SetIsInvitedUser(v bool)`

SetIsInvitedUser sets IsInvitedUser field to given value.

### HasIsInvitedUser

`func (o *ObjsUserInner) HasIsInvitedUser() bool`

HasIsInvitedUser returns a boolean if a field has been set.

### GetIsOwner

`func (o *ObjsUserInner) GetIsOwner() bool`

GetIsOwner returns the IsOwner field if non-nil, zero value otherwise.

### GetIsOwnerOk

`func (o *ObjsUserInner) GetIsOwnerOk() (*bool, bool)`

GetIsOwnerOk returns a tuple with the IsOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOwner

`func (o *ObjsUserInner) SetIsOwner(v bool)`

SetIsOwner sets IsOwner field to given value.

### HasIsOwner

`func (o *ObjsUserInner) HasIsOwner() bool`

HasIsOwner returns a boolean if a field has been set.

### GetIsPrimaryOwner

`func (o *ObjsUserInner) GetIsPrimaryOwner() bool`

GetIsPrimaryOwner returns the IsPrimaryOwner field if non-nil, zero value otherwise.

### GetIsPrimaryOwnerOk

`func (o *ObjsUserInner) GetIsPrimaryOwnerOk() (*bool, bool)`

GetIsPrimaryOwnerOk returns a tuple with the IsPrimaryOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPrimaryOwner

`func (o *ObjsUserInner) SetIsPrimaryOwner(v bool)`

SetIsPrimaryOwner sets IsPrimaryOwner field to given value.

### HasIsPrimaryOwner

`func (o *ObjsUserInner) HasIsPrimaryOwner() bool`

HasIsPrimaryOwner returns a boolean if a field has been set.

### GetIsRestricted

`func (o *ObjsUserInner) GetIsRestricted() bool`

GetIsRestricted returns the IsRestricted field if non-nil, zero value otherwise.

### GetIsRestrictedOk

`func (o *ObjsUserInner) GetIsRestrictedOk() (*bool, bool)`

GetIsRestrictedOk returns a tuple with the IsRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRestricted

`func (o *ObjsUserInner) SetIsRestricted(v bool)`

SetIsRestricted sets IsRestricted field to given value.

### HasIsRestricted

`func (o *ObjsUserInner) HasIsRestricted() bool`

HasIsRestricted returns a boolean if a field has been set.

### GetIsStranger

`func (o *ObjsUserInner) GetIsStranger() bool`

GetIsStranger returns the IsStranger field if non-nil, zero value otherwise.

### GetIsStrangerOk

`func (o *ObjsUserInner) GetIsStrangerOk() (*bool, bool)`

GetIsStrangerOk returns a tuple with the IsStranger field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStranger

`func (o *ObjsUserInner) SetIsStranger(v bool)`

SetIsStranger sets IsStranger field to given value.

### HasIsStranger

`func (o *ObjsUserInner) HasIsStranger() bool`

HasIsStranger returns a boolean if a field has been set.

### GetIsUltraRestricted

`func (o *ObjsUserInner) GetIsUltraRestricted() bool`

GetIsUltraRestricted returns the IsUltraRestricted field if non-nil, zero value otherwise.

### GetIsUltraRestrictedOk

`func (o *ObjsUserInner) GetIsUltraRestrictedOk() (*bool, bool)`

GetIsUltraRestrictedOk returns a tuple with the IsUltraRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsUltraRestricted

`func (o *ObjsUserInner) SetIsUltraRestricted(v bool)`

SetIsUltraRestricted sets IsUltraRestricted field to given value.

### HasIsUltraRestricted

`func (o *ObjsUserInner) HasIsUltraRestricted() bool`

HasIsUltraRestricted returns a boolean if a field has been set.

### GetLocale

`func (o *ObjsUserInner) GetLocale() string`

GetLocale returns the Locale field if non-nil, zero value otherwise.

### GetLocaleOk

`func (o *ObjsUserInner) GetLocaleOk() (*string, bool)`

GetLocaleOk returns a tuple with the Locale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocale

`func (o *ObjsUserInner) SetLocale(v string)`

SetLocale sets Locale field to given value.

### HasLocale

`func (o *ObjsUserInner) HasLocale() bool`

HasLocale returns a boolean if a field has been set.

### GetName

`func (o *ObjsUserInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ObjsUserInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ObjsUserInner) SetName(v string)`

SetName sets Name field to given value.


### GetPresence

`func (o *ObjsUserInner) GetPresence() string`

GetPresence returns the Presence field if non-nil, zero value otherwise.

### GetPresenceOk

`func (o *ObjsUserInner) GetPresenceOk() (*string, bool)`

GetPresenceOk returns a tuple with the Presence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPresence

`func (o *ObjsUserInner) SetPresence(v string)`

SetPresence sets Presence field to given value.

### HasPresence

`func (o *ObjsUserInner) HasPresence() bool`

HasPresence returns a boolean if a field has been set.

### GetProfile

`func (o *ObjsUserInner) GetProfile() ObjsUserProfile`

GetProfile returns the Profile field if non-nil, zero value otherwise.

### GetProfileOk

`func (o *ObjsUserInner) GetProfileOk() (*ObjsUserProfile, bool)`

GetProfileOk returns a tuple with the Profile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfile

`func (o *ObjsUserInner) SetProfile(v ObjsUserProfile)`

SetProfile sets Profile field to given value.


### GetRealName

`func (o *ObjsUserInner) GetRealName() string`

GetRealName returns the RealName field if non-nil, zero value otherwise.

### GetRealNameOk

`func (o *ObjsUserInner) GetRealNameOk() (*string, bool)`

GetRealNameOk returns a tuple with the RealName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRealName

`func (o *ObjsUserInner) SetRealName(v string)`

SetRealName sets RealName field to given value.

### HasRealName

`func (o *ObjsUserInner) HasRealName() bool`

HasRealName returns a boolean if a field has been set.

### GetTeam

`func (o *ObjsUserInner) GetTeam() string`

GetTeam returns the Team field if non-nil, zero value otherwise.

### GetTeamOk

`func (o *ObjsUserInner) GetTeamOk() (*string, bool)`

GetTeamOk returns a tuple with the Team field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeam

`func (o *ObjsUserInner) SetTeam(v string)`

SetTeam sets Team field to given value.

### HasTeam

`func (o *ObjsUserInner) HasTeam() bool`

HasTeam returns a boolean if a field has been set.

### GetTeamId

`func (o *ObjsUserInner) GetTeamId() string`

GetTeamId returns the TeamId field if non-nil, zero value otherwise.

### GetTeamIdOk

`func (o *ObjsUserInner) GetTeamIdOk() (*string, bool)`

GetTeamIdOk returns a tuple with the TeamId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeamId

`func (o *ObjsUserInner) SetTeamId(v string)`

SetTeamId sets TeamId field to given value.

### HasTeamId

`func (o *ObjsUserInner) HasTeamId() bool`

HasTeamId returns a boolean if a field has been set.

### GetTeamProfile

`func (o *ObjsUserInner) GetTeamProfile() ObjsUserInnerAnyOfTeamProfile`

GetTeamProfile returns the TeamProfile field if non-nil, zero value otherwise.

### GetTeamProfileOk

`func (o *ObjsUserInner) GetTeamProfileOk() (*ObjsUserInnerAnyOfTeamProfile, bool)`

GetTeamProfileOk returns a tuple with the TeamProfile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeamProfile

`func (o *ObjsUserInner) SetTeamProfile(v ObjsUserInnerAnyOfTeamProfile)`

SetTeamProfile sets TeamProfile field to given value.

### HasTeamProfile

`func (o *ObjsUserInner) HasTeamProfile() bool`

HasTeamProfile returns a boolean if a field has been set.

### GetTwoFactorType

`func (o *ObjsUserInner) GetTwoFactorType() string`

GetTwoFactorType returns the TwoFactorType field if non-nil, zero value otherwise.

### GetTwoFactorTypeOk

`func (o *ObjsUserInner) GetTwoFactorTypeOk() (*string, bool)`

GetTwoFactorTypeOk returns a tuple with the TwoFactorType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTwoFactorType

`func (o *ObjsUserInner) SetTwoFactorType(v string)`

SetTwoFactorType sets TwoFactorType field to given value.

### HasTwoFactorType

`func (o *ObjsUserInner) HasTwoFactorType() bool`

HasTwoFactorType returns a boolean if a field has been set.

### GetTz

`func (o *ObjsUserInner) GetTz() []ObjsTeamDiscoverableInner`

GetTz returns the Tz field if non-nil, zero value otherwise.

### GetTzOk

`func (o *ObjsUserInner) GetTzOk() (*[]ObjsTeamDiscoverableInner, bool)`

GetTzOk returns a tuple with the Tz field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTz

`func (o *ObjsUserInner) SetTz(v []ObjsTeamDiscoverableInner)`

SetTz sets Tz field to given value.

### HasTz

`func (o *ObjsUserInner) HasTz() bool`

HasTz returns a boolean if a field has been set.

### GetTzLabel

`func (o *ObjsUserInner) GetTzLabel() string`

GetTzLabel returns the TzLabel field if non-nil, zero value otherwise.

### GetTzLabelOk

`func (o *ObjsUserInner) GetTzLabelOk() (*string, bool)`

GetTzLabelOk returns a tuple with the TzLabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTzLabel

`func (o *ObjsUserInner) SetTzLabel(v string)`

SetTzLabel sets TzLabel field to given value.

### HasTzLabel

`func (o *ObjsUserInner) HasTzLabel() bool`

HasTzLabel returns a boolean if a field has been set.

### GetTzOffset

`func (o *ObjsUserInner) GetTzOffset() float32`

GetTzOffset returns the TzOffset field if non-nil, zero value otherwise.

### GetTzOffsetOk

`func (o *ObjsUserInner) GetTzOffsetOk() (*float32, bool)`

GetTzOffsetOk returns a tuple with the TzOffset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTzOffset

`func (o *ObjsUserInner) SetTzOffset(v float32)`

SetTzOffset sets TzOffset field to given value.

### HasTzOffset

`func (o *ObjsUserInner) HasTzOffset() bool`

HasTzOffset returns a boolean if a field has been set.

### GetUpdated

`func (o *ObjsUserInner) GetUpdated() float32`

GetUpdated returns the Updated field if non-nil, zero value otherwise.

### GetUpdatedOk

`func (o *ObjsUserInner) GetUpdatedOk() (*float32, bool)`

GetUpdatedOk returns a tuple with the Updated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdated

`func (o *ObjsUserInner) SetUpdated(v float32)`

SetUpdated sets Updated field to given value.


### GetTeams

`func (o *ObjsUserInner) GetTeams() []string`

GetTeams returns the Teams field if non-nil, zero value otherwise.

### GetTeamsOk

`func (o *ObjsUserInner) GetTeamsOk() (*[]string, bool)`

GetTeamsOk returns a tuple with the Teams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeams

`func (o *ObjsUserInner) SetTeams(v []string)`

SetTeams sets Teams field to given value.

### HasTeams

`func (o *ObjsUserInner) HasTeams() bool`

HasTeams returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


