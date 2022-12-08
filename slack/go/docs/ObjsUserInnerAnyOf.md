# ObjsUserInnerAnyOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Color** | Pointer to **string** |  | [optional] 
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

## Methods

### NewObjsUserInnerAnyOf

`func NewObjsUserInnerAnyOf(id string, isAppUser bool, isBot bool, name string, profile ObjsUserProfile, updated float32, ) *ObjsUserInnerAnyOf`

NewObjsUserInnerAnyOf instantiates a new ObjsUserInnerAnyOf object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsUserInnerAnyOfWithDefaults

`func NewObjsUserInnerAnyOfWithDefaults() *ObjsUserInnerAnyOf`

NewObjsUserInnerAnyOfWithDefaults instantiates a new ObjsUserInnerAnyOf object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetColor

`func (o *ObjsUserInnerAnyOf) GetColor() string`

GetColor returns the Color field if non-nil, zero value otherwise.

### GetColorOk

`func (o *ObjsUserInnerAnyOf) GetColorOk() (*string, bool)`

GetColorOk returns a tuple with the Color field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColor

`func (o *ObjsUserInnerAnyOf) SetColor(v string)`

SetColor sets Color field to given value.

### HasColor

`func (o *ObjsUserInnerAnyOf) HasColor() bool`

HasColor returns a boolean if a field has been set.

### GetDeleted

`func (o *ObjsUserInnerAnyOf) GetDeleted() bool`

GetDeleted returns the Deleted field if non-nil, zero value otherwise.

### GetDeletedOk

`func (o *ObjsUserInnerAnyOf) GetDeletedOk() (*bool, bool)`

GetDeletedOk returns a tuple with the Deleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleted

`func (o *ObjsUserInnerAnyOf) SetDeleted(v bool)`

SetDeleted sets Deleted field to given value.

### HasDeleted

`func (o *ObjsUserInnerAnyOf) HasDeleted() bool`

HasDeleted returns a boolean if a field has been set.

### GetEnterpriseUser

`func (o *ObjsUserInnerAnyOf) GetEnterpriseUser() ObjsEnterpriseUser`

GetEnterpriseUser returns the EnterpriseUser field if non-nil, zero value otherwise.

### GetEnterpriseUserOk

`func (o *ObjsUserInnerAnyOf) GetEnterpriseUserOk() (*ObjsEnterpriseUser, bool)`

GetEnterpriseUserOk returns a tuple with the EnterpriseUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnterpriseUser

`func (o *ObjsUserInnerAnyOf) SetEnterpriseUser(v ObjsEnterpriseUser)`

SetEnterpriseUser sets EnterpriseUser field to given value.

### HasEnterpriseUser

`func (o *ObjsUserInnerAnyOf) HasEnterpriseUser() bool`

HasEnterpriseUser returns a boolean if a field has been set.

### GetHas2fa

`func (o *ObjsUserInnerAnyOf) GetHas2fa() bool`

GetHas2fa returns the Has2fa field if non-nil, zero value otherwise.

### GetHas2faOk

`func (o *ObjsUserInnerAnyOf) GetHas2faOk() (*bool, bool)`

GetHas2faOk returns a tuple with the Has2fa field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHas2fa

`func (o *ObjsUserInnerAnyOf) SetHas2fa(v bool)`

SetHas2fa sets Has2fa field to given value.

### HasHas2fa

`func (o *ObjsUserInnerAnyOf) HasHas2fa() bool`

HasHas2fa returns a boolean if a field has been set.

### GetId

`func (o *ObjsUserInnerAnyOf) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ObjsUserInnerAnyOf) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ObjsUserInnerAnyOf) SetId(v string)`

SetId sets Id field to given value.


### GetIsAdmin

`func (o *ObjsUserInnerAnyOf) GetIsAdmin() bool`

GetIsAdmin returns the IsAdmin field if non-nil, zero value otherwise.

### GetIsAdminOk

`func (o *ObjsUserInnerAnyOf) GetIsAdminOk() (*bool, bool)`

GetIsAdminOk returns a tuple with the IsAdmin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAdmin

`func (o *ObjsUserInnerAnyOf) SetIsAdmin(v bool)`

SetIsAdmin sets IsAdmin field to given value.

### HasIsAdmin

`func (o *ObjsUserInnerAnyOf) HasIsAdmin() bool`

HasIsAdmin returns a boolean if a field has been set.

### GetIsAppUser

`func (o *ObjsUserInnerAnyOf) GetIsAppUser() bool`

GetIsAppUser returns the IsAppUser field if non-nil, zero value otherwise.

### GetIsAppUserOk

`func (o *ObjsUserInnerAnyOf) GetIsAppUserOk() (*bool, bool)`

GetIsAppUserOk returns a tuple with the IsAppUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAppUser

`func (o *ObjsUserInnerAnyOf) SetIsAppUser(v bool)`

SetIsAppUser sets IsAppUser field to given value.


### GetIsBot

`func (o *ObjsUserInnerAnyOf) GetIsBot() bool`

GetIsBot returns the IsBot field if non-nil, zero value otherwise.

### GetIsBotOk

`func (o *ObjsUserInnerAnyOf) GetIsBotOk() (*bool, bool)`

GetIsBotOk returns a tuple with the IsBot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBot

`func (o *ObjsUserInnerAnyOf) SetIsBot(v bool)`

SetIsBot sets IsBot field to given value.


### GetIsExternal

`func (o *ObjsUserInnerAnyOf) GetIsExternal() bool`

GetIsExternal returns the IsExternal field if non-nil, zero value otherwise.

### GetIsExternalOk

`func (o *ObjsUserInnerAnyOf) GetIsExternalOk() (*bool, bool)`

GetIsExternalOk returns a tuple with the IsExternal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsExternal

`func (o *ObjsUserInnerAnyOf) SetIsExternal(v bool)`

SetIsExternal sets IsExternal field to given value.

### HasIsExternal

`func (o *ObjsUserInnerAnyOf) HasIsExternal() bool`

HasIsExternal returns a boolean if a field has been set.

### GetIsForgotten

`func (o *ObjsUserInnerAnyOf) GetIsForgotten() bool`

GetIsForgotten returns the IsForgotten field if non-nil, zero value otherwise.

### GetIsForgottenOk

`func (o *ObjsUserInnerAnyOf) GetIsForgottenOk() (*bool, bool)`

GetIsForgottenOk returns a tuple with the IsForgotten field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsForgotten

`func (o *ObjsUserInnerAnyOf) SetIsForgotten(v bool)`

SetIsForgotten sets IsForgotten field to given value.

### HasIsForgotten

`func (o *ObjsUserInnerAnyOf) HasIsForgotten() bool`

HasIsForgotten returns a boolean if a field has been set.

### GetIsInvitedUser

`func (o *ObjsUserInnerAnyOf) GetIsInvitedUser() bool`

GetIsInvitedUser returns the IsInvitedUser field if non-nil, zero value otherwise.

### GetIsInvitedUserOk

`func (o *ObjsUserInnerAnyOf) GetIsInvitedUserOk() (*bool, bool)`

GetIsInvitedUserOk returns a tuple with the IsInvitedUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsInvitedUser

`func (o *ObjsUserInnerAnyOf) SetIsInvitedUser(v bool)`

SetIsInvitedUser sets IsInvitedUser field to given value.

### HasIsInvitedUser

`func (o *ObjsUserInnerAnyOf) HasIsInvitedUser() bool`

HasIsInvitedUser returns a boolean if a field has been set.

### GetIsOwner

`func (o *ObjsUserInnerAnyOf) GetIsOwner() bool`

GetIsOwner returns the IsOwner field if non-nil, zero value otherwise.

### GetIsOwnerOk

`func (o *ObjsUserInnerAnyOf) GetIsOwnerOk() (*bool, bool)`

GetIsOwnerOk returns a tuple with the IsOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOwner

`func (o *ObjsUserInnerAnyOf) SetIsOwner(v bool)`

SetIsOwner sets IsOwner field to given value.

### HasIsOwner

`func (o *ObjsUserInnerAnyOf) HasIsOwner() bool`

HasIsOwner returns a boolean if a field has been set.

### GetIsPrimaryOwner

`func (o *ObjsUserInnerAnyOf) GetIsPrimaryOwner() bool`

GetIsPrimaryOwner returns the IsPrimaryOwner field if non-nil, zero value otherwise.

### GetIsPrimaryOwnerOk

`func (o *ObjsUserInnerAnyOf) GetIsPrimaryOwnerOk() (*bool, bool)`

GetIsPrimaryOwnerOk returns a tuple with the IsPrimaryOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPrimaryOwner

`func (o *ObjsUserInnerAnyOf) SetIsPrimaryOwner(v bool)`

SetIsPrimaryOwner sets IsPrimaryOwner field to given value.

### HasIsPrimaryOwner

`func (o *ObjsUserInnerAnyOf) HasIsPrimaryOwner() bool`

HasIsPrimaryOwner returns a boolean if a field has been set.

### GetIsRestricted

`func (o *ObjsUserInnerAnyOf) GetIsRestricted() bool`

GetIsRestricted returns the IsRestricted field if non-nil, zero value otherwise.

### GetIsRestrictedOk

`func (o *ObjsUserInnerAnyOf) GetIsRestrictedOk() (*bool, bool)`

GetIsRestrictedOk returns a tuple with the IsRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRestricted

`func (o *ObjsUserInnerAnyOf) SetIsRestricted(v bool)`

SetIsRestricted sets IsRestricted field to given value.

### HasIsRestricted

`func (o *ObjsUserInnerAnyOf) HasIsRestricted() bool`

HasIsRestricted returns a boolean if a field has been set.

### GetIsStranger

`func (o *ObjsUserInnerAnyOf) GetIsStranger() bool`

GetIsStranger returns the IsStranger field if non-nil, zero value otherwise.

### GetIsStrangerOk

`func (o *ObjsUserInnerAnyOf) GetIsStrangerOk() (*bool, bool)`

GetIsStrangerOk returns a tuple with the IsStranger field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStranger

`func (o *ObjsUserInnerAnyOf) SetIsStranger(v bool)`

SetIsStranger sets IsStranger field to given value.

### HasIsStranger

`func (o *ObjsUserInnerAnyOf) HasIsStranger() bool`

HasIsStranger returns a boolean if a field has been set.

### GetIsUltraRestricted

`func (o *ObjsUserInnerAnyOf) GetIsUltraRestricted() bool`

GetIsUltraRestricted returns the IsUltraRestricted field if non-nil, zero value otherwise.

### GetIsUltraRestrictedOk

`func (o *ObjsUserInnerAnyOf) GetIsUltraRestrictedOk() (*bool, bool)`

GetIsUltraRestrictedOk returns a tuple with the IsUltraRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsUltraRestricted

`func (o *ObjsUserInnerAnyOf) SetIsUltraRestricted(v bool)`

SetIsUltraRestricted sets IsUltraRestricted field to given value.

### HasIsUltraRestricted

`func (o *ObjsUserInnerAnyOf) HasIsUltraRestricted() bool`

HasIsUltraRestricted returns a boolean if a field has been set.

### GetLocale

`func (o *ObjsUserInnerAnyOf) GetLocale() string`

GetLocale returns the Locale field if non-nil, zero value otherwise.

### GetLocaleOk

`func (o *ObjsUserInnerAnyOf) GetLocaleOk() (*string, bool)`

GetLocaleOk returns a tuple with the Locale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocale

`func (o *ObjsUserInnerAnyOf) SetLocale(v string)`

SetLocale sets Locale field to given value.

### HasLocale

`func (o *ObjsUserInnerAnyOf) HasLocale() bool`

HasLocale returns a boolean if a field has been set.

### GetName

`func (o *ObjsUserInnerAnyOf) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ObjsUserInnerAnyOf) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ObjsUserInnerAnyOf) SetName(v string)`

SetName sets Name field to given value.


### GetPresence

`func (o *ObjsUserInnerAnyOf) GetPresence() string`

GetPresence returns the Presence field if non-nil, zero value otherwise.

### GetPresenceOk

`func (o *ObjsUserInnerAnyOf) GetPresenceOk() (*string, bool)`

GetPresenceOk returns a tuple with the Presence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPresence

`func (o *ObjsUserInnerAnyOf) SetPresence(v string)`

SetPresence sets Presence field to given value.

### HasPresence

`func (o *ObjsUserInnerAnyOf) HasPresence() bool`

HasPresence returns a boolean if a field has been set.

### GetProfile

`func (o *ObjsUserInnerAnyOf) GetProfile() ObjsUserProfile`

GetProfile returns the Profile field if non-nil, zero value otherwise.

### GetProfileOk

`func (o *ObjsUserInnerAnyOf) GetProfileOk() (*ObjsUserProfile, bool)`

GetProfileOk returns a tuple with the Profile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfile

`func (o *ObjsUserInnerAnyOf) SetProfile(v ObjsUserProfile)`

SetProfile sets Profile field to given value.


### GetRealName

`func (o *ObjsUserInnerAnyOf) GetRealName() string`

GetRealName returns the RealName field if non-nil, zero value otherwise.

### GetRealNameOk

`func (o *ObjsUserInnerAnyOf) GetRealNameOk() (*string, bool)`

GetRealNameOk returns a tuple with the RealName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRealName

`func (o *ObjsUserInnerAnyOf) SetRealName(v string)`

SetRealName sets RealName field to given value.

### HasRealName

`func (o *ObjsUserInnerAnyOf) HasRealName() bool`

HasRealName returns a boolean if a field has been set.

### GetTeam

`func (o *ObjsUserInnerAnyOf) GetTeam() string`

GetTeam returns the Team field if non-nil, zero value otherwise.

### GetTeamOk

`func (o *ObjsUserInnerAnyOf) GetTeamOk() (*string, bool)`

GetTeamOk returns a tuple with the Team field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeam

`func (o *ObjsUserInnerAnyOf) SetTeam(v string)`

SetTeam sets Team field to given value.

### HasTeam

`func (o *ObjsUserInnerAnyOf) HasTeam() bool`

HasTeam returns a boolean if a field has been set.

### GetTeamId

`func (o *ObjsUserInnerAnyOf) GetTeamId() string`

GetTeamId returns the TeamId field if non-nil, zero value otherwise.

### GetTeamIdOk

`func (o *ObjsUserInnerAnyOf) GetTeamIdOk() (*string, bool)`

GetTeamIdOk returns a tuple with the TeamId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeamId

`func (o *ObjsUserInnerAnyOf) SetTeamId(v string)`

SetTeamId sets TeamId field to given value.

### HasTeamId

`func (o *ObjsUserInnerAnyOf) HasTeamId() bool`

HasTeamId returns a boolean if a field has been set.

### GetTeamProfile

`func (o *ObjsUserInnerAnyOf) GetTeamProfile() ObjsUserInnerAnyOfTeamProfile`

GetTeamProfile returns the TeamProfile field if non-nil, zero value otherwise.

### GetTeamProfileOk

`func (o *ObjsUserInnerAnyOf) GetTeamProfileOk() (*ObjsUserInnerAnyOfTeamProfile, bool)`

GetTeamProfileOk returns a tuple with the TeamProfile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeamProfile

`func (o *ObjsUserInnerAnyOf) SetTeamProfile(v ObjsUserInnerAnyOfTeamProfile)`

SetTeamProfile sets TeamProfile field to given value.

### HasTeamProfile

`func (o *ObjsUserInnerAnyOf) HasTeamProfile() bool`

HasTeamProfile returns a boolean if a field has been set.

### GetTwoFactorType

`func (o *ObjsUserInnerAnyOf) GetTwoFactorType() string`

GetTwoFactorType returns the TwoFactorType field if non-nil, zero value otherwise.

### GetTwoFactorTypeOk

`func (o *ObjsUserInnerAnyOf) GetTwoFactorTypeOk() (*string, bool)`

GetTwoFactorTypeOk returns a tuple with the TwoFactorType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTwoFactorType

`func (o *ObjsUserInnerAnyOf) SetTwoFactorType(v string)`

SetTwoFactorType sets TwoFactorType field to given value.

### HasTwoFactorType

`func (o *ObjsUserInnerAnyOf) HasTwoFactorType() bool`

HasTwoFactorType returns a boolean if a field has been set.

### GetTz

`func (o *ObjsUserInnerAnyOf) GetTz() []ObjsTeamDiscoverableInner`

GetTz returns the Tz field if non-nil, zero value otherwise.

### GetTzOk

`func (o *ObjsUserInnerAnyOf) GetTzOk() (*[]ObjsTeamDiscoverableInner, bool)`

GetTzOk returns a tuple with the Tz field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTz

`func (o *ObjsUserInnerAnyOf) SetTz(v []ObjsTeamDiscoverableInner)`

SetTz sets Tz field to given value.

### HasTz

`func (o *ObjsUserInnerAnyOf) HasTz() bool`

HasTz returns a boolean if a field has been set.

### GetTzLabel

`func (o *ObjsUserInnerAnyOf) GetTzLabel() string`

GetTzLabel returns the TzLabel field if non-nil, zero value otherwise.

### GetTzLabelOk

`func (o *ObjsUserInnerAnyOf) GetTzLabelOk() (*string, bool)`

GetTzLabelOk returns a tuple with the TzLabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTzLabel

`func (o *ObjsUserInnerAnyOf) SetTzLabel(v string)`

SetTzLabel sets TzLabel field to given value.

### HasTzLabel

`func (o *ObjsUserInnerAnyOf) HasTzLabel() bool`

HasTzLabel returns a boolean if a field has been set.

### GetTzOffset

`func (o *ObjsUserInnerAnyOf) GetTzOffset() float32`

GetTzOffset returns the TzOffset field if non-nil, zero value otherwise.

### GetTzOffsetOk

`func (o *ObjsUserInnerAnyOf) GetTzOffsetOk() (*float32, bool)`

GetTzOffsetOk returns a tuple with the TzOffset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTzOffset

`func (o *ObjsUserInnerAnyOf) SetTzOffset(v float32)`

SetTzOffset sets TzOffset field to given value.

### HasTzOffset

`func (o *ObjsUserInnerAnyOf) HasTzOffset() bool`

HasTzOffset returns a boolean if a field has been set.

### GetUpdated

`func (o *ObjsUserInnerAnyOf) GetUpdated() float32`

GetUpdated returns the Updated field if non-nil, zero value otherwise.

### GetUpdatedOk

`func (o *ObjsUserInnerAnyOf) GetUpdatedOk() (*float32, bool)`

GetUpdatedOk returns a tuple with the Updated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdated

`func (o *ObjsUserInnerAnyOf) SetUpdated(v float32)`

SetUpdated sets Updated field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


