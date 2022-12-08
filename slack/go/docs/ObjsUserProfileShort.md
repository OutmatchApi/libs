# ObjsUserProfileShort

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AvatarHash** | **string** |  | 
**DisplayName** | **string** |  | 
**DisplayNameNormalized** | Pointer to **string** |  | [optional] 
**FirstName** | **NullableString** |  | 
**Image72** | **string** |  | 
**IsRestricted** | **bool** |  | 
**IsUltraRestricted** | **bool** |  | 
**Name** | **string** |  | 
**RealName** | **string** |  | 
**RealNameNormalized** | Pointer to **string** |  | [optional] 
**Team** | **string** |  | 

## Methods

### NewObjsUserProfileShort

`func NewObjsUserProfileShort(avatarHash string, displayName string, firstName NullableString, image72 string, isRestricted bool, isUltraRestricted bool, name string, realName string, team string, ) *ObjsUserProfileShort`

NewObjsUserProfileShort instantiates a new ObjsUserProfileShort object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsUserProfileShortWithDefaults

`func NewObjsUserProfileShortWithDefaults() *ObjsUserProfileShort`

NewObjsUserProfileShortWithDefaults instantiates a new ObjsUserProfileShort object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAvatarHash

`func (o *ObjsUserProfileShort) GetAvatarHash() string`

GetAvatarHash returns the AvatarHash field if non-nil, zero value otherwise.

### GetAvatarHashOk

`func (o *ObjsUserProfileShort) GetAvatarHashOk() (*string, bool)`

GetAvatarHashOk returns a tuple with the AvatarHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvatarHash

`func (o *ObjsUserProfileShort) SetAvatarHash(v string)`

SetAvatarHash sets AvatarHash field to given value.


### GetDisplayName

`func (o *ObjsUserProfileShort) GetDisplayName() string`

GetDisplayName returns the DisplayName field if non-nil, zero value otherwise.

### GetDisplayNameOk

`func (o *ObjsUserProfileShort) GetDisplayNameOk() (*string, bool)`

GetDisplayNameOk returns a tuple with the DisplayName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayName

`func (o *ObjsUserProfileShort) SetDisplayName(v string)`

SetDisplayName sets DisplayName field to given value.


### GetDisplayNameNormalized

`func (o *ObjsUserProfileShort) GetDisplayNameNormalized() string`

GetDisplayNameNormalized returns the DisplayNameNormalized field if non-nil, zero value otherwise.

### GetDisplayNameNormalizedOk

`func (o *ObjsUserProfileShort) GetDisplayNameNormalizedOk() (*string, bool)`

GetDisplayNameNormalizedOk returns a tuple with the DisplayNameNormalized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayNameNormalized

`func (o *ObjsUserProfileShort) SetDisplayNameNormalized(v string)`

SetDisplayNameNormalized sets DisplayNameNormalized field to given value.

### HasDisplayNameNormalized

`func (o *ObjsUserProfileShort) HasDisplayNameNormalized() bool`

HasDisplayNameNormalized returns a boolean if a field has been set.

### GetFirstName

`func (o *ObjsUserProfileShort) GetFirstName() string`

GetFirstName returns the FirstName field if non-nil, zero value otherwise.

### GetFirstNameOk

`func (o *ObjsUserProfileShort) GetFirstNameOk() (*string, bool)`

GetFirstNameOk returns a tuple with the FirstName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstName

`func (o *ObjsUserProfileShort) SetFirstName(v string)`

SetFirstName sets FirstName field to given value.


### SetFirstNameNil

`func (o *ObjsUserProfileShort) SetFirstNameNil(b bool)`

 SetFirstNameNil sets the value for FirstName to be an explicit nil

### UnsetFirstName
`func (o *ObjsUserProfileShort) UnsetFirstName()`

UnsetFirstName ensures that no value is present for FirstName, not even an explicit nil
### GetImage72

`func (o *ObjsUserProfileShort) GetImage72() string`

GetImage72 returns the Image72 field if non-nil, zero value otherwise.

### GetImage72Ok

`func (o *ObjsUserProfileShort) GetImage72Ok() (*string, bool)`

GetImage72Ok returns a tuple with the Image72 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImage72

`func (o *ObjsUserProfileShort) SetImage72(v string)`

SetImage72 sets Image72 field to given value.


### GetIsRestricted

`func (o *ObjsUserProfileShort) GetIsRestricted() bool`

GetIsRestricted returns the IsRestricted field if non-nil, zero value otherwise.

### GetIsRestrictedOk

`func (o *ObjsUserProfileShort) GetIsRestrictedOk() (*bool, bool)`

GetIsRestrictedOk returns a tuple with the IsRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRestricted

`func (o *ObjsUserProfileShort) SetIsRestricted(v bool)`

SetIsRestricted sets IsRestricted field to given value.


### GetIsUltraRestricted

`func (o *ObjsUserProfileShort) GetIsUltraRestricted() bool`

GetIsUltraRestricted returns the IsUltraRestricted field if non-nil, zero value otherwise.

### GetIsUltraRestrictedOk

`func (o *ObjsUserProfileShort) GetIsUltraRestrictedOk() (*bool, bool)`

GetIsUltraRestrictedOk returns a tuple with the IsUltraRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsUltraRestricted

`func (o *ObjsUserProfileShort) SetIsUltraRestricted(v bool)`

SetIsUltraRestricted sets IsUltraRestricted field to given value.


### GetName

`func (o *ObjsUserProfileShort) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ObjsUserProfileShort) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ObjsUserProfileShort) SetName(v string)`

SetName sets Name field to given value.


### GetRealName

`func (o *ObjsUserProfileShort) GetRealName() string`

GetRealName returns the RealName field if non-nil, zero value otherwise.

### GetRealNameOk

`func (o *ObjsUserProfileShort) GetRealNameOk() (*string, bool)`

GetRealNameOk returns a tuple with the RealName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRealName

`func (o *ObjsUserProfileShort) SetRealName(v string)`

SetRealName sets RealName field to given value.


### GetRealNameNormalized

`func (o *ObjsUserProfileShort) GetRealNameNormalized() string`

GetRealNameNormalized returns the RealNameNormalized field if non-nil, zero value otherwise.

### GetRealNameNormalizedOk

`func (o *ObjsUserProfileShort) GetRealNameNormalizedOk() (*string, bool)`

GetRealNameNormalizedOk returns a tuple with the RealNameNormalized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRealNameNormalized

`func (o *ObjsUserProfileShort) SetRealNameNormalized(v string)`

SetRealNameNormalized sets RealNameNormalized field to given value.

### HasRealNameNormalized

`func (o *ObjsUserProfileShort) HasRealNameNormalized() bool`

HasRealNameNormalized returns a boolean if a field has been set.

### GetTeam

`func (o *ObjsUserProfileShort) GetTeam() string`

GetTeam returns the Team field if non-nil, zero value otherwise.

### GetTeamOk

`func (o *ObjsUserProfileShort) GetTeamOk() (*string, bool)`

GetTeamOk returns a tuple with the Team field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeam

`func (o *ObjsUserProfileShort) SetTeam(v string)`

SetTeam sets Team field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


