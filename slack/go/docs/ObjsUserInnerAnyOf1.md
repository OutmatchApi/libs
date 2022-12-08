# ObjsUserInnerAnyOf1

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
**TeamId** | Pointer to **string** |  | [optional] 
**TeamProfile** | Pointer to [**ObjsUserInnerAnyOfTeamProfile**](ObjsUserInnerAnyOfTeamProfile.md) |  | [optional] 
**Teams** | Pointer to **[]string** |  | [optional] 
**TwoFactorType** | Pointer to **string** |  | [optional] 
**Tz** | Pointer to [**[]ObjsTeamDiscoverableInner**](ObjsTeamDiscoverableInner.md) |  | [optional] 
**TzLabel** | Pointer to **string** |  | [optional] 
**TzOffset** | Pointer to **float32** |  | [optional] 
**Updated** | **float32** |  | 

## Methods

### NewObjsUserInnerAnyOf1

`func NewObjsUserInnerAnyOf1(id string, isAppUser bool, isBot bool, name string, profile ObjsUserProfile, updated float32, ) *ObjsUserInnerAnyOf1`

NewObjsUserInnerAnyOf1 instantiates a new ObjsUserInnerAnyOf1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsUserInnerAnyOf1WithDefaults

`func NewObjsUserInnerAnyOf1WithDefaults() *ObjsUserInnerAnyOf1`

NewObjsUserInnerAnyOf1WithDefaults instantiates a new ObjsUserInnerAnyOf1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetColor

`func (o *ObjsUserInnerAnyOf1) GetColor() string`

GetColor returns the Color field if non-nil, zero value otherwise.

### GetColorOk

`func (o *ObjsUserInnerAnyOf1) GetColorOk() (*string, bool)`

GetColorOk returns a tuple with the Color field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetColor

`func (o *ObjsUserInnerAnyOf1) SetColor(v string)`

SetColor sets Color field to given value.

### HasColor

`func (o *ObjsUserInnerAnyOf1) HasColor() bool`

HasColor returns a boolean if a field has been set.

### GetDeleted

`func (o *ObjsUserInnerAnyOf1) GetDeleted() bool`

GetDeleted returns the Deleted field if non-nil, zero value otherwise.

### GetDeletedOk

`func (o *ObjsUserInnerAnyOf1) GetDeletedOk() (*bool, bool)`

GetDeletedOk returns a tuple with the Deleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleted

`func (o *ObjsUserInnerAnyOf1) SetDeleted(v bool)`

SetDeleted sets Deleted field to given value.

### HasDeleted

`func (o *ObjsUserInnerAnyOf1) HasDeleted() bool`

HasDeleted returns a boolean if a field has been set.

### GetEnterpriseUser

`func (o *ObjsUserInnerAnyOf1) GetEnterpriseUser() ObjsEnterpriseUser`

GetEnterpriseUser returns the EnterpriseUser field if non-nil, zero value otherwise.

### GetEnterpriseUserOk

`func (o *ObjsUserInnerAnyOf1) GetEnterpriseUserOk() (*ObjsEnterpriseUser, bool)`

GetEnterpriseUserOk returns a tuple with the EnterpriseUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnterpriseUser

`func (o *ObjsUserInnerAnyOf1) SetEnterpriseUser(v ObjsEnterpriseUser)`

SetEnterpriseUser sets EnterpriseUser field to given value.

### HasEnterpriseUser

`func (o *ObjsUserInnerAnyOf1) HasEnterpriseUser() bool`

HasEnterpriseUser returns a boolean if a field has been set.

### GetHas2fa

`func (o *ObjsUserInnerAnyOf1) GetHas2fa() bool`

GetHas2fa returns the Has2fa field if non-nil, zero value otherwise.

### GetHas2faOk

`func (o *ObjsUserInnerAnyOf1) GetHas2faOk() (*bool, bool)`

GetHas2faOk returns a tuple with the Has2fa field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHas2fa

`func (o *ObjsUserInnerAnyOf1) SetHas2fa(v bool)`

SetHas2fa sets Has2fa field to given value.

### HasHas2fa

`func (o *ObjsUserInnerAnyOf1) HasHas2fa() bool`

HasHas2fa returns a boolean if a field has been set.

### GetId

`func (o *ObjsUserInnerAnyOf1) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ObjsUserInnerAnyOf1) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ObjsUserInnerAnyOf1) SetId(v string)`

SetId sets Id field to given value.


### GetIsAdmin

`func (o *ObjsUserInnerAnyOf1) GetIsAdmin() bool`

GetIsAdmin returns the IsAdmin field if non-nil, zero value otherwise.

### GetIsAdminOk

`func (o *ObjsUserInnerAnyOf1) GetIsAdminOk() (*bool, bool)`

GetIsAdminOk returns a tuple with the IsAdmin field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAdmin

`func (o *ObjsUserInnerAnyOf1) SetIsAdmin(v bool)`

SetIsAdmin sets IsAdmin field to given value.

### HasIsAdmin

`func (o *ObjsUserInnerAnyOf1) HasIsAdmin() bool`

HasIsAdmin returns a boolean if a field has been set.

### GetIsAppUser

`func (o *ObjsUserInnerAnyOf1) GetIsAppUser() bool`

GetIsAppUser returns the IsAppUser field if non-nil, zero value otherwise.

### GetIsAppUserOk

`func (o *ObjsUserInnerAnyOf1) GetIsAppUserOk() (*bool, bool)`

GetIsAppUserOk returns a tuple with the IsAppUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAppUser

`func (o *ObjsUserInnerAnyOf1) SetIsAppUser(v bool)`

SetIsAppUser sets IsAppUser field to given value.


### GetIsBot

`func (o *ObjsUserInnerAnyOf1) GetIsBot() bool`

GetIsBot returns the IsBot field if non-nil, zero value otherwise.

### GetIsBotOk

`func (o *ObjsUserInnerAnyOf1) GetIsBotOk() (*bool, bool)`

GetIsBotOk returns a tuple with the IsBot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBot

`func (o *ObjsUserInnerAnyOf1) SetIsBot(v bool)`

SetIsBot sets IsBot field to given value.


### GetIsExternal

`func (o *ObjsUserInnerAnyOf1) GetIsExternal() bool`

GetIsExternal returns the IsExternal field if non-nil, zero value otherwise.

### GetIsExternalOk

`func (o *ObjsUserInnerAnyOf1) GetIsExternalOk() (*bool, bool)`

GetIsExternalOk returns a tuple with the IsExternal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsExternal

`func (o *ObjsUserInnerAnyOf1) SetIsExternal(v bool)`

SetIsExternal sets IsExternal field to given value.

### HasIsExternal

`func (o *ObjsUserInnerAnyOf1) HasIsExternal() bool`

HasIsExternal returns a boolean if a field has been set.

### GetIsForgotten

`func (o *ObjsUserInnerAnyOf1) GetIsForgotten() bool`

GetIsForgotten returns the IsForgotten field if non-nil, zero value otherwise.

### GetIsForgottenOk

`func (o *ObjsUserInnerAnyOf1) GetIsForgottenOk() (*bool, bool)`

GetIsForgottenOk returns a tuple with the IsForgotten field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsForgotten

`func (o *ObjsUserInnerAnyOf1) SetIsForgotten(v bool)`

SetIsForgotten sets IsForgotten field to given value.

### HasIsForgotten

`func (o *ObjsUserInnerAnyOf1) HasIsForgotten() bool`

HasIsForgotten returns a boolean if a field has been set.

### GetIsOwner

`func (o *ObjsUserInnerAnyOf1) GetIsOwner() bool`

GetIsOwner returns the IsOwner field if non-nil, zero value otherwise.

### GetIsOwnerOk

`func (o *ObjsUserInnerAnyOf1) GetIsOwnerOk() (*bool, bool)`

GetIsOwnerOk returns a tuple with the IsOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOwner

`func (o *ObjsUserInnerAnyOf1) SetIsOwner(v bool)`

SetIsOwner sets IsOwner field to given value.

### HasIsOwner

`func (o *ObjsUserInnerAnyOf1) HasIsOwner() bool`

HasIsOwner returns a boolean if a field has been set.

### GetIsPrimaryOwner

`func (o *ObjsUserInnerAnyOf1) GetIsPrimaryOwner() bool`

GetIsPrimaryOwner returns the IsPrimaryOwner field if non-nil, zero value otherwise.

### GetIsPrimaryOwnerOk

`func (o *ObjsUserInnerAnyOf1) GetIsPrimaryOwnerOk() (*bool, bool)`

GetIsPrimaryOwnerOk returns a tuple with the IsPrimaryOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsPrimaryOwner

`func (o *ObjsUserInnerAnyOf1) SetIsPrimaryOwner(v bool)`

SetIsPrimaryOwner sets IsPrimaryOwner field to given value.

### HasIsPrimaryOwner

`func (o *ObjsUserInnerAnyOf1) HasIsPrimaryOwner() bool`

HasIsPrimaryOwner returns a boolean if a field has been set.

### GetIsRestricted

`func (o *ObjsUserInnerAnyOf1) GetIsRestricted() bool`

GetIsRestricted returns the IsRestricted field if non-nil, zero value otherwise.

### GetIsRestrictedOk

`func (o *ObjsUserInnerAnyOf1) GetIsRestrictedOk() (*bool, bool)`

GetIsRestrictedOk returns a tuple with the IsRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRestricted

`func (o *ObjsUserInnerAnyOf1) SetIsRestricted(v bool)`

SetIsRestricted sets IsRestricted field to given value.

### HasIsRestricted

`func (o *ObjsUserInnerAnyOf1) HasIsRestricted() bool`

HasIsRestricted returns a boolean if a field has been set.

### GetIsStranger

`func (o *ObjsUserInnerAnyOf1) GetIsStranger() bool`

GetIsStranger returns the IsStranger field if non-nil, zero value otherwise.

### GetIsStrangerOk

`func (o *ObjsUserInnerAnyOf1) GetIsStrangerOk() (*bool, bool)`

GetIsStrangerOk returns a tuple with the IsStranger field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsStranger

`func (o *ObjsUserInnerAnyOf1) SetIsStranger(v bool)`

SetIsStranger sets IsStranger field to given value.

### HasIsStranger

`func (o *ObjsUserInnerAnyOf1) HasIsStranger() bool`

HasIsStranger returns a boolean if a field has been set.

### GetIsUltraRestricted

`func (o *ObjsUserInnerAnyOf1) GetIsUltraRestricted() bool`

GetIsUltraRestricted returns the IsUltraRestricted field if non-nil, zero value otherwise.

### GetIsUltraRestrictedOk

`func (o *ObjsUserInnerAnyOf1) GetIsUltraRestrictedOk() (*bool, bool)`

GetIsUltraRestrictedOk returns a tuple with the IsUltraRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsUltraRestricted

`func (o *ObjsUserInnerAnyOf1) SetIsUltraRestricted(v bool)`

SetIsUltraRestricted sets IsUltraRestricted field to given value.

### HasIsUltraRestricted

`func (o *ObjsUserInnerAnyOf1) HasIsUltraRestricted() bool`

HasIsUltraRestricted returns a boolean if a field has been set.

### GetLocale

`func (o *ObjsUserInnerAnyOf1) GetLocale() string`

GetLocale returns the Locale field if non-nil, zero value otherwise.

### GetLocaleOk

`func (o *ObjsUserInnerAnyOf1) GetLocaleOk() (*string, bool)`

GetLocaleOk returns a tuple with the Locale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocale

`func (o *ObjsUserInnerAnyOf1) SetLocale(v string)`

SetLocale sets Locale field to given value.

### HasLocale

`func (o *ObjsUserInnerAnyOf1) HasLocale() bool`

HasLocale returns a boolean if a field has been set.

### GetName

`func (o *ObjsUserInnerAnyOf1) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ObjsUserInnerAnyOf1) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ObjsUserInnerAnyOf1) SetName(v string)`

SetName sets Name field to given value.


### GetPresence

`func (o *ObjsUserInnerAnyOf1) GetPresence() string`

GetPresence returns the Presence field if non-nil, zero value otherwise.

### GetPresenceOk

`func (o *ObjsUserInnerAnyOf1) GetPresenceOk() (*string, bool)`

GetPresenceOk returns a tuple with the Presence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPresence

`func (o *ObjsUserInnerAnyOf1) SetPresence(v string)`

SetPresence sets Presence field to given value.

### HasPresence

`func (o *ObjsUserInnerAnyOf1) HasPresence() bool`

HasPresence returns a boolean if a field has been set.

### GetProfile

`func (o *ObjsUserInnerAnyOf1) GetProfile() ObjsUserProfile`

GetProfile returns the Profile field if non-nil, zero value otherwise.

### GetProfileOk

`func (o *ObjsUserInnerAnyOf1) GetProfileOk() (*ObjsUserProfile, bool)`

GetProfileOk returns a tuple with the Profile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfile

`func (o *ObjsUserInnerAnyOf1) SetProfile(v ObjsUserProfile)`

SetProfile sets Profile field to given value.


### GetRealName

`func (o *ObjsUserInnerAnyOf1) GetRealName() string`

GetRealName returns the RealName field if non-nil, zero value otherwise.

### GetRealNameOk

`func (o *ObjsUserInnerAnyOf1) GetRealNameOk() (*string, bool)`

GetRealNameOk returns a tuple with the RealName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRealName

`func (o *ObjsUserInnerAnyOf1) SetRealName(v string)`

SetRealName sets RealName field to given value.

### HasRealName

`func (o *ObjsUserInnerAnyOf1) HasRealName() bool`

HasRealName returns a boolean if a field has been set.

### GetTeamId

`func (o *ObjsUserInnerAnyOf1) GetTeamId() string`

GetTeamId returns the TeamId field if non-nil, zero value otherwise.

### GetTeamIdOk

`func (o *ObjsUserInnerAnyOf1) GetTeamIdOk() (*string, bool)`

GetTeamIdOk returns a tuple with the TeamId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeamId

`func (o *ObjsUserInnerAnyOf1) SetTeamId(v string)`

SetTeamId sets TeamId field to given value.

### HasTeamId

`func (o *ObjsUserInnerAnyOf1) HasTeamId() bool`

HasTeamId returns a boolean if a field has been set.

### GetTeamProfile

`func (o *ObjsUserInnerAnyOf1) GetTeamProfile() ObjsUserInnerAnyOfTeamProfile`

GetTeamProfile returns the TeamProfile field if non-nil, zero value otherwise.

### GetTeamProfileOk

`func (o *ObjsUserInnerAnyOf1) GetTeamProfileOk() (*ObjsUserInnerAnyOfTeamProfile, bool)`

GetTeamProfileOk returns a tuple with the TeamProfile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeamProfile

`func (o *ObjsUserInnerAnyOf1) SetTeamProfile(v ObjsUserInnerAnyOfTeamProfile)`

SetTeamProfile sets TeamProfile field to given value.

### HasTeamProfile

`func (o *ObjsUserInnerAnyOf1) HasTeamProfile() bool`

HasTeamProfile returns a boolean if a field has been set.

### GetTeams

`func (o *ObjsUserInnerAnyOf1) GetTeams() []string`

GetTeams returns the Teams field if non-nil, zero value otherwise.

### GetTeamsOk

`func (o *ObjsUserInnerAnyOf1) GetTeamsOk() (*[]string, bool)`

GetTeamsOk returns a tuple with the Teams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeams

`func (o *ObjsUserInnerAnyOf1) SetTeams(v []string)`

SetTeams sets Teams field to given value.

### HasTeams

`func (o *ObjsUserInnerAnyOf1) HasTeams() bool`

HasTeams returns a boolean if a field has been set.

### GetTwoFactorType

`func (o *ObjsUserInnerAnyOf1) GetTwoFactorType() string`

GetTwoFactorType returns the TwoFactorType field if non-nil, zero value otherwise.

### GetTwoFactorTypeOk

`func (o *ObjsUserInnerAnyOf1) GetTwoFactorTypeOk() (*string, bool)`

GetTwoFactorTypeOk returns a tuple with the TwoFactorType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTwoFactorType

`func (o *ObjsUserInnerAnyOf1) SetTwoFactorType(v string)`

SetTwoFactorType sets TwoFactorType field to given value.

### HasTwoFactorType

`func (o *ObjsUserInnerAnyOf1) HasTwoFactorType() bool`

HasTwoFactorType returns a boolean if a field has been set.

### GetTz

`func (o *ObjsUserInnerAnyOf1) GetTz() []ObjsTeamDiscoverableInner`

GetTz returns the Tz field if non-nil, zero value otherwise.

### GetTzOk

`func (o *ObjsUserInnerAnyOf1) GetTzOk() (*[]ObjsTeamDiscoverableInner, bool)`

GetTzOk returns a tuple with the Tz field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTz

`func (o *ObjsUserInnerAnyOf1) SetTz(v []ObjsTeamDiscoverableInner)`

SetTz sets Tz field to given value.

### HasTz

`func (o *ObjsUserInnerAnyOf1) HasTz() bool`

HasTz returns a boolean if a field has been set.

### GetTzLabel

`func (o *ObjsUserInnerAnyOf1) GetTzLabel() string`

GetTzLabel returns the TzLabel field if non-nil, zero value otherwise.

### GetTzLabelOk

`func (o *ObjsUserInnerAnyOf1) GetTzLabelOk() (*string, bool)`

GetTzLabelOk returns a tuple with the TzLabel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTzLabel

`func (o *ObjsUserInnerAnyOf1) SetTzLabel(v string)`

SetTzLabel sets TzLabel field to given value.

### HasTzLabel

`func (o *ObjsUserInnerAnyOf1) HasTzLabel() bool`

HasTzLabel returns a boolean if a field has been set.

### GetTzOffset

`func (o *ObjsUserInnerAnyOf1) GetTzOffset() float32`

GetTzOffset returns the TzOffset field if non-nil, zero value otherwise.

### GetTzOffsetOk

`func (o *ObjsUserInnerAnyOf1) GetTzOffsetOk() (*float32, bool)`

GetTzOffsetOk returns a tuple with the TzOffset field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTzOffset

`func (o *ObjsUserInnerAnyOf1) SetTzOffset(v float32)`

SetTzOffset sets TzOffset field to given value.

### HasTzOffset

`func (o *ObjsUserInnerAnyOf1) HasTzOffset() bool`

HasTzOffset returns a boolean if a field has been set.

### GetUpdated

`func (o *ObjsUserInnerAnyOf1) GetUpdated() float32`

GetUpdated returns the Updated field if non-nil, zero value otherwise.

### GetUpdatedOk

`func (o *ObjsUserInnerAnyOf1) GetUpdatedOk() (*float32, bool)`

GetUpdatedOk returns a tuple with the Updated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdated

`func (o *ObjsUserInnerAnyOf1) SetUpdated(v float32)`

SetUpdated sets Updated field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


