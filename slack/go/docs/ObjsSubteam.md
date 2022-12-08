# ObjsSubteam

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoProvision** | **bool** |  | 
**AutoType** | [**[]ObjsSubteamAutoTypeInner**](ObjsSubteamAutoTypeInner.md) |  | 
**ChannelCount** | Pointer to **int32** |  | [optional] 
**CreatedBy** | **string** |  | 
**DateCreate** | **int32** |  | 
**DateDelete** | **int32** |  | 
**DateUpdate** | **int32** |  | 
**DeletedBy** | [**[]ObjsSubteamDeletedByInner**](ObjsSubteamDeletedByInner.md) |  | 
**Description** | **string** |  | 
**EnterpriseSubteamId** | **string** |  | 
**Handle** | **string** |  | 
**Id** | **string** |  | 
**IsExternal** | **bool** |  | 
**IsSubteam** | **bool** |  | 
**IsUsergroup** | **bool** |  | 
**Name** | **string** |  | 
**Prefs** | [**ObjsSubteamPrefs**](ObjsSubteamPrefs.md) |  | 
**TeamId** | **string** |  | 
**UpdatedBy** | **string** |  | 
**UserCount** | Pointer to **int32** |  | [optional] 
**Users** | Pointer to **[]string** |  | [optional] 

## Methods

### NewObjsSubteam

`func NewObjsSubteam(autoProvision bool, autoType []ObjsSubteamAutoTypeInner, createdBy string, dateCreate int32, dateDelete int32, dateUpdate int32, deletedBy []ObjsSubteamDeletedByInner, description string, enterpriseSubteamId string, handle string, id string, isExternal bool, isSubteam bool, isUsergroup bool, name string, prefs ObjsSubteamPrefs, teamId string, updatedBy string, ) *ObjsSubteam`

NewObjsSubteam instantiates a new ObjsSubteam object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsSubteamWithDefaults

`func NewObjsSubteamWithDefaults() *ObjsSubteam`

NewObjsSubteamWithDefaults instantiates a new ObjsSubteam object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAutoProvision

`func (o *ObjsSubteam) GetAutoProvision() bool`

GetAutoProvision returns the AutoProvision field if non-nil, zero value otherwise.

### GetAutoProvisionOk

`func (o *ObjsSubteam) GetAutoProvisionOk() (*bool, bool)`

GetAutoProvisionOk returns a tuple with the AutoProvision field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoProvision

`func (o *ObjsSubteam) SetAutoProvision(v bool)`

SetAutoProvision sets AutoProvision field to given value.


### GetAutoType

`func (o *ObjsSubteam) GetAutoType() []ObjsSubteamAutoTypeInner`

GetAutoType returns the AutoType field if non-nil, zero value otherwise.

### GetAutoTypeOk

`func (o *ObjsSubteam) GetAutoTypeOk() (*[]ObjsSubteamAutoTypeInner, bool)`

GetAutoTypeOk returns a tuple with the AutoType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoType

`func (o *ObjsSubteam) SetAutoType(v []ObjsSubteamAutoTypeInner)`

SetAutoType sets AutoType field to given value.


### GetChannelCount

`func (o *ObjsSubteam) GetChannelCount() int32`

GetChannelCount returns the ChannelCount field if non-nil, zero value otherwise.

### GetChannelCountOk

`func (o *ObjsSubteam) GetChannelCountOk() (*int32, bool)`

GetChannelCountOk returns a tuple with the ChannelCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannelCount

`func (o *ObjsSubteam) SetChannelCount(v int32)`

SetChannelCount sets ChannelCount field to given value.

### HasChannelCount

`func (o *ObjsSubteam) HasChannelCount() bool`

HasChannelCount returns a boolean if a field has been set.

### GetCreatedBy

`func (o *ObjsSubteam) GetCreatedBy() string`

GetCreatedBy returns the CreatedBy field if non-nil, zero value otherwise.

### GetCreatedByOk

`func (o *ObjsSubteam) GetCreatedByOk() (*string, bool)`

GetCreatedByOk returns a tuple with the CreatedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedBy

`func (o *ObjsSubteam) SetCreatedBy(v string)`

SetCreatedBy sets CreatedBy field to given value.


### GetDateCreate

`func (o *ObjsSubteam) GetDateCreate() int32`

GetDateCreate returns the DateCreate field if non-nil, zero value otherwise.

### GetDateCreateOk

`func (o *ObjsSubteam) GetDateCreateOk() (*int32, bool)`

GetDateCreateOk returns a tuple with the DateCreate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateCreate

`func (o *ObjsSubteam) SetDateCreate(v int32)`

SetDateCreate sets DateCreate field to given value.


### GetDateDelete

`func (o *ObjsSubteam) GetDateDelete() int32`

GetDateDelete returns the DateDelete field if non-nil, zero value otherwise.

### GetDateDeleteOk

`func (o *ObjsSubteam) GetDateDeleteOk() (*int32, bool)`

GetDateDeleteOk returns a tuple with the DateDelete field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateDelete

`func (o *ObjsSubteam) SetDateDelete(v int32)`

SetDateDelete sets DateDelete field to given value.


### GetDateUpdate

`func (o *ObjsSubteam) GetDateUpdate() int32`

GetDateUpdate returns the DateUpdate field if non-nil, zero value otherwise.

### GetDateUpdateOk

`func (o *ObjsSubteam) GetDateUpdateOk() (*int32, bool)`

GetDateUpdateOk returns a tuple with the DateUpdate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDateUpdate

`func (o *ObjsSubteam) SetDateUpdate(v int32)`

SetDateUpdate sets DateUpdate field to given value.


### GetDeletedBy

`func (o *ObjsSubteam) GetDeletedBy() []ObjsSubteamDeletedByInner`

GetDeletedBy returns the DeletedBy field if non-nil, zero value otherwise.

### GetDeletedByOk

`func (o *ObjsSubteam) GetDeletedByOk() (*[]ObjsSubteamDeletedByInner, bool)`

GetDeletedByOk returns a tuple with the DeletedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDeletedBy

`func (o *ObjsSubteam) SetDeletedBy(v []ObjsSubteamDeletedByInner)`

SetDeletedBy sets DeletedBy field to given value.


### GetDescription

`func (o *ObjsSubteam) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ObjsSubteam) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ObjsSubteam) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetEnterpriseSubteamId

`func (o *ObjsSubteam) GetEnterpriseSubteamId() string`

GetEnterpriseSubteamId returns the EnterpriseSubteamId field if non-nil, zero value otherwise.

### GetEnterpriseSubteamIdOk

`func (o *ObjsSubteam) GetEnterpriseSubteamIdOk() (*string, bool)`

GetEnterpriseSubteamIdOk returns a tuple with the EnterpriseSubteamId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnterpriseSubteamId

`func (o *ObjsSubteam) SetEnterpriseSubteamId(v string)`

SetEnterpriseSubteamId sets EnterpriseSubteamId field to given value.


### GetHandle

`func (o *ObjsSubteam) GetHandle() string`

GetHandle returns the Handle field if non-nil, zero value otherwise.

### GetHandleOk

`func (o *ObjsSubteam) GetHandleOk() (*string, bool)`

GetHandleOk returns a tuple with the Handle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHandle

`func (o *ObjsSubteam) SetHandle(v string)`

SetHandle sets Handle field to given value.


### GetId

`func (o *ObjsSubteam) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ObjsSubteam) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ObjsSubteam) SetId(v string)`

SetId sets Id field to given value.


### GetIsExternal

`func (o *ObjsSubteam) GetIsExternal() bool`

GetIsExternal returns the IsExternal field if non-nil, zero value otherwise.

### GetIsExternalOk

`func (o *ObjsSubteam) GetIsExternalOk() (*bool, bool)`

GetIsExternalOk returns a tuple with the IsExternal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsExternal

`func (o *ObjsSubteam) SetIsExternal(v bool)`

SetIsExternal sets IsExternal field to given value.


### GetIsSubteam

`func (o *ObjsSubteam) GetIsSubteam() bool`

GetIsSubteam returns the IsSubteam field if non-nil, zero value otherwise.

### GetIsSubteamOk

`func (o *ObjsSubteam) GetIsSubteamOk() (*bool, bool)`

GetIsSubteamOk returns a tuple with the IsSubteam field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsSubteam

`func (o *ObjsSubteam) SetIsSubteam(v bool)`

SetIsSubteam sets IsSubteam field to given value.


### GetIsUsergroup

`func (o *ObjsSubteam) GetIsUsergroup() bool`

GetIsUsergroup returns the IsUsergroup field if non-nil, zero value otherwise.

### GetIsUsergroupOk

`func (o *ObjsSubteam) GetIsUsergroupOk() (*bool, bool)`

GetIsUsergroupOk returns a tuple with the IsUsergroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsUsergroup

`func (o *ObjsSubteam) SetIsUsergroup(v bool)`

SetIsUsergroup sets IsUsergroup field to given value.


### GetName

`func (o *ObjsSubteam) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ObjsSubteam) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ObjsSubteam) SetName(v string)`

SetName sets Name field to given value.


### GetPrefs

`func (o *ObjsSubteam) GetPrefs() ObjsSubteamPrefs`

GetPrefs returns the Prefs field if non-nil, zero value otherwise.

### GetPrefsOk

`func (o *ObjsSubteam) GetPrefsOk() (*ObjsSubteamPrefs, bool)`

GetPrefsOk returns a tuple with the Prefs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrefs

`func (o *ObjsSubteam) SetPrefs(v ObjsSubteamPrefs)`

SetPrefs sets Prefs field to given value.


### GetTeamId

`func (o *ObjsSubteam) GetTeamId() string`

GetTeamId returns the TeamId field if non-nil, zero value otherwise.

### GetTeamIdOk

`func (o *ObjsSubteam) GetTeamIdOk() (*string, bool)`

GetTeamIdOk returns a tuple with the TeamId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeamId

`func (o *ObjsSubteam) SetTeamId(v string)`

SetTeamId sets TeamId field to given value.


### GetUpdatedBy

`func (o *ObjsSubteam) GetUpdatedBy() string`

GetUpdatedBy returns the UpdatedBy field if non-nil, zero value otherwise.

### GetUpdatedByOk

`func (o *ObjsSubteam) GetUpdatedByOk() (*string, bool)`

GetUpdatedByOk returns a tuple with the UpdatedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedBy

`func (o *ObjsSubteam) SetUpdatedBy(v string)`

SetUpdatedBy sets UpdatedBy field to given value.


### GetUserCount

`func (o *ObjsSubteam) GetUserCount() int32`

GetUserCount returns the UserCount field if non-nil, zero value otherwise.

### GetUserCountOk

`func (o *ObjsSubteam) GetUserCountOk() (*int32, bool)`

GetUserCountOk returns a tuple with the UserCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserCount

`func (o *ObjsSubteam) SetUserCount(v int32)`

SetUserCount sets UserCount field to given value.

### HasUserCount

`func (o *ObjsSubteam) HasUserCount() bool`

HasUserCount returns a boolean if a field has been set.

### GetUsers

`func (o *ObjsSubteam) GetUsers() []string`

GetUsers returns the Users field if non-nil, zero value otherwise.

### GetUsersOk

`func (o *ObjsSubteam) GetUsersOk() (*[]string, bool)`

GetUsersOk returns a tuple with the Users field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsers

`func (o *ObjsSubteam) SetUsers(v []string)`

SetUsers sets Users field to given value.

### HasUsers

`func (o *ObjsSubteam) HasUsers() bool`

HasUsers returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


