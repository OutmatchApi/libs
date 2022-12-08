# ObjsTeam

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Archived** | Pointer to **bool** |  | [optional] 
**AvatarBaseUrl** | Pointer to **string** |  | [optional] 
**Created** | Pointer to **int32** |  | [optional] 
**DateCreate** | Pointer to **int32** |  | [optional] 
**Deleted** | Pointer to **bool** |  | [optional] 
**Description** | Pointer to **NullableString** |  | [optional] 
**Discoverable** | Pointer to [**[]ObjsTeamDiscoverableInner**](ObjsTeamDiscoverableInner.md) |  | [optional] 
**Domain** | **string** |  | 
**EmailDomain** | **string** |  | 
**EnterpriseId** | Pointer to **string** |  | [optional] 
**EnterpriseName** | Pointer to **string** |  | [optional] 
**ExternalOrgMigrations** | Pointer to [**ObjsExternalOrgMigrations**](ObjsExternalOrgMigrations.md) |  | [optional] 
**HasComplianceExport** | Pointer to **bool** |  | [optional] 
**Icon** | [**ObjsIcon**](ObjsIcon.md) |  | 
**Id** | **string** |  | 
**IsAssigned** | Pointer to **bool** |  | [optional] 
**IsEnterprise** | Pointer to **int32** |  | [optional] 
**IsOverStorageLimit** | Pointer to **bool** |  | [optional] 
**LimitTs** | Pointer to **int32** |  | [optional] 
**Locale** | Pointer to **string** |  | [optional] 
**MessagesCount** | Pointer to **int32** |  | [optional] 
**MsgEditWindowMins** | Pointer to **int32** |  | [optional] 
**Name** | **string** |  | 
**OverIntegrationsLimit** | Pointer to **bool** |  | [optional] 
**OverStorageLimit** | Pointer to **bool** |  | [optional] 
**PayProdCur** | Pointer to **string** |  | [optional] 
**Plan** | Pointer to **string** |  | [optional] 
**PrimaryOwner** | Pointer to [**ObjsPrimaryOwner**](ObjsPrimaryOwner.md) |  | [optional] 
**SsoProvider** | Pointer to [**ObjsTeamSsoProvider**](ObjsTeamSsoProvider.md) |  | [optional] 

## Methods

### NewObjsTeam

`func NewObjsTeam(domain string, emailDomain string, icon ObjsIcon, id string, name string, ) *ObjsTeam`

NewObjsTeam instantiates a new ObjsTeam object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsTeamWithDefaults

`func NewObjsTeamWithDefaults() *ObjsTeam`

NewObjsTeamWithDefaults instantiates a new ObjsTeam object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetArchived

`func (o *ObjsTeam) GetArchived() bool`

GetArchived returns the Archived field if non-nil, zero value otherwise.

### GetArchivedOk

`func (o *ObjsTeam) GetArchivedOk() (*bool, bool)`

GetArchivedOk returns a tuple with the Archived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArchived

`func (o *ObjsTeam) SetArchived(v bool)`

SetArchived sets Archived field to given value.

### HasArchived

`func (o *ObjsTeam) HasArchived() bool`

HasArchived returns a boolean if a field has been set.

### GetAvatarBaseUrl

`func (o *ObjsTeam) GetAvatarBaseUrl() string`

GetAvatarBaseUrl returns the AvatarBaseUrl field if non-nil, zero value otherwise.

### GetAvatarBaseUrlOk

`func (o *ObjsTeam) GetAvatarBaseUrlOk() (*string, bool)`

GetAvatarBaseUrlOk returns a tuple with the AvatarBaseUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvatarBaseUrl

`func (o *ObjsTeam) SetAvatarBaseUrl(v string)`

SetAvatarBaseUrl sets AvatarBaseUrl field to given value.

### HasAvatarBaseUrl

`func (o *ObjsTeam) HasAvatarBaseUrl() bool`

HasAvatarBaseUrl returns a boolean if a field has been set.

### GetCreated

`func (o *ObjsTeam) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *ObjsTeam) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *ObjsTeam) SetCreated(v int32)`

SetCreated sets Created field to given value.

### HasCreated

`func (o *ObjsTeam) HasCreated() bool`

HasCreated returns a boolean if a field has been set.

### GetDateCreate

`func (o *ObjsTeam) GetDateCreate() int32`

GetDateCreate returns the DateCreate field if non-nil, zero value otherwise.

### GetDateCreateOk

`func (o *ObjsTeam) GetDateCreateOk() (*int32, bool)`

GetDateCreateOk returns a tuple with the DateCreate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateCreate

`func (o *ObjsTeam) SetDateCreate(v int32)`

SetDateCreate sets DateCreate field to given value.

### HasDateCreate

`func (o *ObjsTeam) HasDateCreate() bool`

HasDateCreate returns a boolean if a field has been set.

### GetDeleted

`func (o *ObjsTeam) GetDeleted() bool`

GetDeleted returns the Deleted field if non-nil, zero value otherwise.

### GetDeletedOk

`func (o *ObjsTeam) GetDeletedOk() (*bool, bool)`

GetDeletedOk returns a tuple with the Deleted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeleted

`func (o *ObjsTeam) SetDeleted(v bool)`

SetDeleted sets Deleted field to given value.

### HasDeleted

`func (o *ObjsTeam) HasDeleted() bool`

HasDeleted returns a boolean if a field has been set.

### GetDescription

`func (o *ObjsTeam) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ObjsTeam) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ObjsTeam) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ObjsTeam) HasDescription() bool`

HasDescription returns a boolean if a field has been set.

### SetDescriptionNil

`func (o *ObjsTeam) SetDescriptionNil(b bool)`

 SetDescriptionNil sets the value for Description to be an explicit nil

### UnsetDescription
`func (o *ObjsTeam) UnsetDescription()`

UnsetDescription ensures that no value is present for Description, not even an explicit nil
### GetDiscoverable

`func (o *ObjsTeam) GetDiscoverable() []ObjsTeamDiscoverableInner`

GetDiscoverable returns the Discoverable field if non-nil, zero value otherwise.

### GetDiscoverableOk

`func (o *ObjsTeam) GetDiscoverableOk() (*[]ObjsTeamDiscoverableInner, bool)`

GetDiscoverableOk returns a tuple with the Discoverable field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDiscoverable

`func (o *ObjsTeam) SetDiscoverable(v []ObjsTeamDiscoverableInner)`

SetDiscoverable sets Discoverable field to given value.

### HasDiscoverable

`func (o *ObjsTeam) HasDiscoverable() bool`

HasDiscoverable returns a boolean if a field has been set.

### GetDomain

`func (o *ObjsTeam) GetDomain() string`

GetDomain returns the Domain field if non-nil, zero value otherwise.

### GetDomainOk

`func (o *ObjsTeam) GetDomainOk() (*string, bool)`

GetDomainOk returns a tuple with the Domain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDomain

`func (o *ObjsTeam) SetDomain(v string)`

SetDomain sets Domain field to given value.


### GetEmailDomain

`func (o *ObjsTeam) GetEmailDomain() string`

GetEmailDomain returns the EmailDomain field if non-nil, zero value otherwise.

### GetEmailDomainOk

`func (o *ObjsTeam) GetEmailDomainOk() (*string, bool)`

GetEmailDomainOk returns a tuple with the EmailDomain field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailDomain

`func (o *ObjsTeam) SetEmailDomain(v string)`

SetEmailDomain sets EmailDomain field to given value.


### GetEnterpriseId

`func (o *ObjsTeam) GetEnterpriseId() string`

GetEnterpriseId returns the EnterpriseId field if non-nil, zero value otherwise.

### GetEnterpriseIdOk

`func (o *ObjsTeam) GetEnterpriseIdOk() (*string, bool)`

GetEnterpriseIdOk returns a tuple with the EnterpriseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnterpriseId

`func (o *ObjsTeam) SetEnterpriseId(v string)`

SetEnterpriseId sets EnterpriseId field to given value.

### HasEnterpriseId

`func (o *ObjsTeam) HasEnterpriseId() bool`

HasEnterpriseId returns a boolean if a field has been set.

### GetEnterpriseName

`func (o *ObjsTeam) GetEnterpriseName() string`

GetEnterpriseName returns the EnterpriseName field if non-nil, zero value otherwise.

### GetEnterpriseNameOk

`func (o *ObjsTeam) GetEnterpriseNameOk() (*string, bool)`

GetEnterpriseNameOk returns a tuple with the EnterpriseName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnterpriseName

`func (o *ObjsTeam) SetEnterpriseName(v string)`

SetEnterpriseName sets EnterpriseName field to given value.

### HasEnterpriseName

`func (o *ObjsTeam) HasEnterpriseName() bool`

HasEnterpriseName returns a boolean if a field has been set.

### GetExternalOrgMigrations

`func (o *ObjsTeam) GetExternalOrgMigrations() ObjsExternalOrgMigrations`

GetExternalOrgMigrations returns the ExternalOrgMigrations field if non-nil, zero value otherwise.

### GetExternalOrgMigrationsOk

`func (o *ObjsTeam) GetExternalOrgMigrationsOk() (*ObjsExternalOrgMigrations, bool)`

GetExternalOrgMigrationsOk returns a tuple with the ExternalOrgMigrations field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetExternalOrgMigrations

`func (o *ObjsTeam) SetExternalOrgMigrations(v ObjsExternalOrgMigrations)`

SetExternalOrgMigrations sets ExternalOrgMigrations field to given value.

### HasExternalOrgMigrations

`func (o *ObjsTeam) HasExternalOrgMigrations() bool`

HasExternalOrgMigrations returns a boolean if a field has been set.

### GetHasComplianceExport

`func (o *ObjsTeam) GetHasComplianceExport() bool`

GetHasComplianceExport returns the HasComplianceExport field if non-nil, zero value otherwise.

### GetHasComplianceExportOk

`func (o *ObjsTeam) GetHasComplianceExportOk() (*bool, bool)`

GetHasComplianceExportOk returns a tuple with the HasComplianceExport field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHasComplianceExport

`func (o *ObjsTeam) SetHasComplianceExport(v bool)`

SetHasComplianceExport sets HasComplianceExport field to given value.

### HasHasComplianceExport

`func (o *ObjsTeam) HasHasComplianceExport() bool`

HasHasComplianceExport returns a boolean if a field has been set.

### GetIcon

`func (o *ObjsTeam) GetIcon() ObjsIcon`

GetIcon returns the Icon field if non-nil, zero value otherwise.

### GetIconOk

`func (o *ObjsTeam) GetIconOk() (*ObjsIcon, bool)`

GetIconOk returns a tuple with the Icon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIcon

`func (o *ObjsTeam) SetIcon(v ObjsIcon)`

SetIcon sets Icon field to given value.


### GetId

`func (o *ObjsTeam) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ObjsTeam) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ObjsTeam) SetId(v string)`

SetId sets Id field to given value.


### GetIsAssigned

`func (o *ObjsTeam) GetIsAssigned() bool`

GetIsAssigned returns the IsAssigned field if non-nil, zero value otherwise.

### GetIsAssignedOk

`func (o *ObjsTeam) GetIsAssignedOk() (*bool, bool)`

GetIsAssignedOk returns a tuple with the IsAssigned field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAssigned

`func (o *ObjsTeam) SetIsAssigned(v bool)`

SetIsAssigned sets IsAssigned field to given value.

### HasIsAssigned

`func (o *ObjsTeam) HasIsAssigned() bool`

HasIsAssigned returns a boolean if a field has been set.

### GetIsEnterprise

`func (o *ObjsTeam) GetIsEnterprise() int32`

GetIsEnterprise returns the IsEnterprise field if non-nil, zero value otherwise.

### GetIsEnterpriseOk

`func (o *ObjsTeam) GetIsEnterpriseOk() (*int32, bool)`

GetIsEnterpriseOk returns a tuple with the IsEnterprise field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsEnterprise

`func (o *ObjsTeam) SetIsEnterprise(v int32)`

SetIsEnterprise sets IsEnterprise field to given value.

### HasIsEnterprise

`func (o *ObjsTeam) HasIsEnterprise() bool`

HasIsEnterprise returns a boolean if a field has been set.

### GetIsOverStorageLimit

`func (o *ObjsTeam) GetIsOverStorageLimit() bool`

GetIsOverStorageLimit returns the IsOverStorageLimit field if non-nil, zero value otherwise.

### GetIsOverStorageLimitOk

`func (o *ObjsTeam) GetIsOverStorageLimitOk() (*bool, bool)`

GetIsOverStorageLimitOk returns a tuple with the IsOverStorageLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsOverStorageLimit

`func (o *ObjsTeam) SetIsOverStorageLimit(v bool)`

SetIsOverStorageLimit sets IsOverStorageLimit field to given value.

### HasIsOverStorageLimit

`func (o *ObjsTeam) HasIsOverStorageLimit() bool`

HasIsOverStorageLimit returns a boolean if a field has been set.

### GetLimitTs

`func (o *ObjsTeam) GetLimitTs() int32`

GetLimitTs returns the LimitTs field if non-nil, zero value otherwise.

### GetLimitTsOk

`func (o *ObjsTeam) GetLimitTsOk() (*int32, bool)`

GetLimitTsOk returns a tuple with the LimitTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLimitTs

`func (o *ObjsTeam) SetLimitTs(v int32)`

SetLimitTs sets LimitTs field to given value.

### HasLimitTs

`func (o *ObjsTeam) HasLimitTs() bool`

HasLimitTs returns a boolean if a field has been set.

### GetLocale

`func (o *ObjsTeam) GetLocale() string`

GetLocale returns the Locale field if non-nil, zero value otherwise.

### GetLocaleOk

`func (o *ObjsTeam) GetLocaleOk() (*string, bool)`

GetLocaleOk returns a tuple with the Locale field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLocale

`func (o *ObjsTeam) SetLocale(v string)`

SetLocale sets Locale field to given value.

### HasLocale

`func (o *ObjsTeam) HasLocale() bool`

HasLocale returns a boolean if a field has been set.

### GetMessagesCount

`func (o *ObjsTeam) GetMessagesCount() int32`

GetMessagesCount returns the MessagesCount field if non-nil, zero value otherwise.

### GetMessagesCountOk

`func (o *ObjsTeam) GetMessagesCountOk() (*int32, bool)`

GetMessagesCountOk returns a tuple with the MessagesCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessagesCount

`func (o *ObjsTeam) SetMessagesCount(v int32)`

SetMessagesCount sets MessagesCount field to given value.

### HasMessagesCount

`func (o *ObjsTeam) HasMessagesCount() bool`

HasMessagesCount returns a boolean if a field has been set.

### GetMsgEditWindowMins

`func (o *ObjsTeam) GetMsgEditWindowMins() int32`

GetMsgEditWindowMins returns the MsgEditWindowMins field if non-nil, zero value otherwise.

### GetMsgEditWindowMinsOk

`func (o *ObjsTeam) GetMsgEditWindowMinsOk() (*int32, bool)`

GetMsgEditWindowMinsOk returns a tuple with the MsgEditWindowMins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsgEditWindowMins

`func (o *ObjsTeam) SetMsgEditWindowMins(v int32)`

SetMsgEditWindowMins sets MsgEditWindowMins field to given value.

### HasMsgEditWindowMins

`func (o *ObjsTeam) HasMsgEditWindowMins() bool`

HasMsgEditWindowMins returns a boolean if a field has been set.

### GetName

`func (o *ObjsTeam) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ObjsTeam) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ObjsTeam) SetName(v string)`

SetName sets Name field to given value.


### GetOverIntegrationsLimit

`func (o *ObjsTeam) GetOverIntegrationsLimit() bool`

GetOverIntegrationsLimit returns the OverIntegrationsLimit field if non-nil, zero value otherwise.

### GetOverIntegrationsLimitOk

`func (o *ObjsTeam) GetOverIntegrationsLimitOk() (*bool, bool)`

GetOverIntegrationsLimitOk returns a tuple with the OverIntegrationsLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverIntegrationsLimit

`func (o *ObjsTeam) SetOverIntegrationsLimit(v bool)`

SetOverIntegrationsLimit sets OverIntegrationsLimit field to given value.

### HasOverIntegrationsLimit

`func (o *ObjsTeam) HasOverIntegrationsLimit() bool`

HasOverIntegrationsLimit returns a boolean if a field has been set.

### GetOverStorageLimit

`func (o *ObjsTeam) GetOverStorageLimit() bool`

GetOverStorageLimit returns the OverStorageLimit field if non-nil, zero value otherwise.

### GetOverStorageLimitOk

`func (o *ObjsTeam) GetOverStorageLimitOk() (*bool, bool)`

GetOverStorageLimitOk returns a tuple with the OverStorageLimit field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOverStorageLimit

`func (o *ObjsTeam) SetOverStorageLimit(v bool)`

SetOverStorageLimit sets OverStorageLimit field to given value.

### HasOverStorageLimit

`func (o *ObjsTeam) HasOverStorageLimit() bool`

HasOverStorageLimit returns a boolean if a field has been set.

### GetPayProdCur

`func (o *ObjsTeam) GetPayProdCur() string`

GetPayProdCur returns the PayProdCur field if non-nil, zero value otherwise.

### GetPayProdCurOk

`func (o *ObjsTeam) GetPayProdCurOk() (*string, bool)`

GetPayProdCurOk returns a tuple with the PayProdCur field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayProdCur

`func (o *ObjsTeam) SetPayProdCur(v string)`

SetPayProdCur sets PayProdCur field to given value.

### HasPayProdCur

`func (o *ObjsTeam) HasPayProdCur() bool`

HasPayProdCur returns a boolean if a field has been set.

### GetPlan

`func (o *ObjsTeam) GetPlan() string`

GetPlan returns the Plan field if non-nil, zero value otherwise.

### GetPlanOk

`func (o *ObjsTeam) GetPlanOk() (*string, bool)`

GetPlanOk returns a tuple with the Plan field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlan

`func (o *ObjsTeam) SetPlan(v string)`

SetPlan sets Plan field to given value.

### HasPlan

`func (o *ObjsTeam) HasPlan() bool`

HasPlan returns a boolean if a field has been set.

### GetPrimaryOwner

`func (o *ObjsTeam) GetPrimaryOwner() ObjsPrimaryOwner`

GetPrimaryOwner returns the PrimaryOwner field if non-nil, zero value otherwise.

### GetPrimaryOwnerOk

`func (o *ObjsTeam) GetPrimaryOwnerOk() (*ObjsPrimaryOwner, bool)`

GetPrimaryOwnerOk returns a tuple with the PrimaryOwner field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrimaryOwner

`func (o *ObjsTeam) SetPrimaryOwner(v ObjsPrimaryOwner)`

SetPrimaryOwner sets PrimaryOwner field to given value.

### HasPrimaryOwner

`func (o *ObjsTeam) HasPrimaryOwner() bool`

HasPrimaryOwner returns a boolean if a field has been set.

### GetSsoProvider

`func (o *ObjsTeam) GetSsoProvider() ObjsTeamSsoProvider`

GetSsoProvider returns the SsoProvider field if non-nil, zero value otherwise.

### GetSsoProviderOk

`func (o *ObjsTeam) GetSsoProviderOk() (*ObjsTeamSsoProvider, bool)`

GetSsoProviderOk returns a tuple with the SsoProvider field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSsoProvider

`func (o *ObjsTeam) SetSsoProvider(v ObjsTeamSsoProvider)`

SetSsoProvider sets SsoProvider field to given value.

### HasSsoProvider

`func (o *ObjsTeam) HasSsoProvider() bool`

HasSsoProvider returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


