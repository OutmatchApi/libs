# ObjsUserProfile

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AlwaysActive** | Pointer to **bool** |  | [optional] 
**ApiAppId** | Pointer to **string** |  | [optional] 
**AvatarHash** | **string** |  | 
**BotId** | Pointer to **string** |  | [optional] 
**DisplayName** | **string** |  | 
**DisplayNameNormalized** | **string** |  | 
**Email** | Pointer to **NullableString** |  | [optional] 
**Fields** | **[]map[string]interface{}** |  | 
**FirstName** | Pointer to **NullableString** |  | [optional] 
**GuestExpirationTs** | Pointer to **NullableInt32** |  | [optional] 
**GuestInvitedBy** | Pointer to **NullableString** |  | [optional] 
**Image1024** | Pointer to **NullableString** |  | [optional] 
**Image192** | Pointer to **NullableString** |  | [optional] 
**Image24** | Pointer to **NullableString** |  | [optional] 
**Image32** | Pointer to **NullableString** |  | [optional] 
**Image48** | Pointer to **NullableString** |  | [optional] 
**Image512** | Pointer to **NullableString** |  | [optional] 
**Image72** | Pointer to **NullableString** |  | [optional] 
**ImageOriginal** | Pointer to **NullableString** |  | [optional] 
**IsAppUser** | Pointer to **bool** |  | [optional] 
**IsCustomImage** | Pointer to **bool** |  | [optional] 
**IsRestricted** | Pointer to **NullableBool** |  | [optional] 
**IsUltraRestricted** | Pointer to **NullableBool** |  | [optional] 
**LastAvatarImageHash** | Pointer to **string** |  | [optional] 
**LastName** | Pointer to **NullableString** |  | [optional] 
**MembershipsCount** | Pointer to **int32** |  | [optional] 
**Name** | Pointer to **NullableString** |  | [optional] 
**Phone** | **string** |  | 
**Pronouns** | Pointer to **string** |  | [optional] 
**RealName** | **string** |  | 
**RealNameNormalized** | **string** |  | 
**Skype** | **string** |  | 
**StatusDefaultEmoji** | Pointer to **string** |  | [optional] 
**StatusDefaultText** | Pointer to **string** |  | [optional] 
**StatusDefaultTextCanonical** | Pointer to **NullableString** |  | [optional] 
**StatusEmoji** | **string** |  | 
**StatusExpiration** | Pointer to **int32** |  | [optional] 
**StatusText** | **string** |  | 
**StatusTextCanonical** | Pointer to **NullableString** |  | [optional] 
**Team** | Pointer to **string** |  | [optional] 
**Title** | **string** |  | 
**Updated** | Pointer to **int32** |  | [optional] 
**UserId** | Pointer to **string** |  | [optional] 
**Username** | Pointer to **NullableString** |  | [optional] 

## Methods

### NewObjsUserProfile

`func NewObjsUserProfile(avatarHash string, displayName string, displayNameNormalized string, fields []map[string]interface{}, phone string, realName string, realNameNormalized string, skype string, statusEmoji string, statusText string, title string, ) *ObjsUserProfile`

NewObjsUserProfile instantiates a new ObjsUserProfile object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsUserProfileWithDefaults

`func NewObjsUserProfileWithDefaults() *ObjsUserProfile`

NewObjsUserProfileWithDefaults instantiates a new ObjsUserProfile object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAlwaysActive

`func (o *ObjsUserProfile) GetAlwaysActive() bool`

GetAlwaysActive returns the AlwaysActive field if non-nil, zero value otherwise.

### GetAlwaysActiveOk

`func (o *ObjsUserProfile) GetAlwaysActiveOk() (*bool, bool)`

GetAlwaysActiveOk returns a tuple with the AlwaysActive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAlwaysActive

`func (o *ObjsUserProfile) SetAlwaysActive(v bool)`

SetAlwaysActive sets AlwaysActive field to given value.

### HasAlwaysActive

`func (o *ObjsUserProfile) HasAlwaysActive() bool`

HasAlwaysActive returns a boolean if a field has been set.

### GetApiAppId

`func (o *ObjsUserProfile) GetApiAppId() string`

GetApiAppId returns the ApiAppId field if non-nil, zero value otherwise.

### GetApiAppIdOk

`func (o *ObjsUserProfile) GetApiAppIdOk() (*string, bool)`

GetApiAppIdOk returns a tuple with the ApiAppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetApiAppId

`func (o *ObjsUserProfile) SetApiAppId(v string)`

SetApiAppId sets ApiAppId field to given value.

### HasApiAppId

`func (o *ObjsUserProfile) HasApiAppId() bool`

HasApiAppId returns a boolean if a field has been set.

### GetAvatarHash

`func (o *ObjsUserProfile) GetAvatarHash() string`

GetAvatarHash returns the AvatarHash field if non-nil, zero value otherwise.

### GetAvatarHashOk

`func (o *ObjsUserProfile) GetAvatarHashOk() (*string, bool)`

GetAvatarHashOk returns a tuple with the AvatarHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAvatarHash

`func (o *ObjsUserProfile) SetAvatarHash(v string)`

SetAvatarHash sets AvatarHash field to given value.


### GetBotId

`func (o *ObjsUserProfile) GetBotId() string`

GetBotId returns the BotId field if non-nil, zero value otherwise.

### GetBotIdOk

`func (o *ObjsUserProfile) GetBotIdOk() (*string, bool)`

GetBotIdOk returns a tuple with the BotId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBotId

`func (o *ObjsUserProfile) SetBotId(v string)`

SetBotId sets BotId field to given value.

### HasBotId

`func (o *ObjsUserProfile) HasBotId() bool`

HasBotId returns a boolean if a field has been set.

### GetDisplayName

`func (o *ObjsUserProfile) GetDisplayName() string`

GetDisplayName returns the DisplayName field if non-nil, zero value otherwise.

### GetDisplayNameOk

`func (o *ObjsUserProfile) GetDisplayNameOk() (*string, bool)`

GetDisplayNameOk returns a tuple with the DisplayName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayName

`func (o *ObjsUserProfile) SetDisplayName(v string)`

SetDisplayName sets DisplayName field to given value.


### GetDisplayNameNormalized

`func (o *ObjsUserProfile) GetDisplayNameNormalized() string`

GetDisplayNameNormalized returns the DisplayNameNormalized field if non-nil, zero value otherwise.

### GetDisplayNameNormalizedOk

`func (o *ObjsUserProfile) GetDisplayNameNormalizedOk() (*string, bool)`

GetDisplayNameNormalizedOk returns a tuple with the DisplayNameNormalized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDisplayNameNormalized

`func (o *ObjsUserProfile) SetDisplayNameNormalized(v string)`

SetDisplayNameNormalized sets DisplayNameNormalized field to given value.


### GetEmail

`func (o *ObjsUserProfile) GetEmail() string`

GetEmail returns the Email field if non-nil, zero value otherwise.

### GetEmailOk

`func (o *ObjsUserProfile) GetEmailOk() (*string, bool)`

GetEmailOk returns a tuple with the Email field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmail

`func (o *ObjsUserProfile) SetEmail(v string)`

SetEmail sets Email field to given value.

### HasEmail

`func (o *ObjsUserProfile) HasEmail() bool`

HasEmail returns a boolean if a field has been set.

### SetEmailNil

`func (o *ObjsUserProfile) SetEmailNil(b bool)`

 SetEmailNil sets the value for Email to be an explicit nil

### UnsetEmail
`func (o *ObjsUserProfile) UnsetEmail()`

UnsetEmail ensures that no value is present for Email, not even an explicit nil
### GetFields

`func (o *ObjsUserProfile) GetFields() []map[string]interface{}`

GetFields returns the Fields field if non-nil, zero value otherwise.

### GetFieldsOk

`func (o *ObjsUserProfile) GetFieldsOk() (*[]map[string]interface{}, bool)`

GetFieldsOk returns a tuple with the Fields field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFields

`func (o *ObjsUserProfile) SetFields(v []map[string]interface{})`

SetFields sets Fields field to given value.


### SetFieldsNil

`func (o *ObjsUserProfile) SetFieldsNil(b bool)`

 SetFieldsNil sets the value for Fields to be an explicit nil

### UnsetFields
`func (o *ObjsUserProfile) UnsetFields()`

UnsetFields ensures that no value is present for Fields, not even an explicit nil
### GetFirstName

`func (o *ObjsUserProfile) GetFirstName() string`

GetFirstName returns the FirstName field if non-nil, zero value otherwise.

### GetFirstNameOk

`func (o *ObjsUserProfile) GetFirstNameOk() (*string, bool)`

GetFirstNameOk returns a tuple with the FirstName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFirstName

`func (o *ObjsUserProfile) SetFirstName(v string)`

SetFirstName sets FirstName field to given value.

### HasFirstName

`func (o *ObjsUserProfile) HasFirstName() bool`

HasFirstName returns a boolean if a field has been set.

### SetFirstNameNil

`func (o *ObjsUserProfile) SetFirstNameNil(b bool)`

 SetFirstNameNil sets the value for FirstName to be an explicit nil

### UnsetFirstName
`func (o *ObjsUserProfile) UnsetFirstName()`

UnsetFirstName ensures that no value is present for FirstName, not even an explicit nil
### GetGuestExpirationTs

`func (o *ObjsUserProfile) GetGuestExpirationTs() int32`

GetGuestExpirationTs returns the GuestExpirationTs field if non-nil, zero value otherwise.

### GetGuestExpirationTsOk

`func (o *ObjsUserProfile) GetGuestExpirationTsOk() (*int32, bool)`

GetGuestExpirationTsOk returns a tuple with the GuestExpirationTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestExpirationTs

`func (o *ObjsUserProfile) SetGuestExpirationTs(v int32)`

SetGuestExpirationTs sets GuestExpirationTs field to given value.

### HasGuestExpirationTs

`func (o *ObjsUserProfile) HasGuestExpirationTs() bool`

HasGuestExpirationTs returns a boolean if a field has been set.

### SetGuestExpirationTsNil

`func (o *ObjsUserProfile) SetGuestExpirationTsNil(b bool)`

 SetGuestExpirationTsNil sets the value for GuestExpirationTs to be an explicit nil

### UnsetGuestExpirationTs
`func (o *ObjsUserProfile) UnsetGuestExpirationTs()`

UnsetGuestExpirationTs ensures that no value is present for GuestExpirationTs, not even an explicit nil
### GetGuestInvitedBy

`func (o *ObjsUserProfile) GetGuestInvitedBy() string`

GetGuestInvitedBy returns the GuestInvitedBy field if non-nil, zero value otherwise.

### GetGuestInvitedByOk

`func (o *ObjsUserProfile) GetGuestInvitedByOk() (*string, bool)`

GetGuestInvitedByOk returns a tuple with the GuestInvitedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGuestInvitedBy

`func (o *ObjsUserProfile) SetGuestInvitedBy(v string)`

SetGuestInvitedBy sets GuestInvitedBy field to given value.

### HasGuestInvitedBy

`func (o *ObjsUserProfile) HasGuestInvitedBy() bool`

HasGuestInvitedBy returns a boolean if a field has been set.

### SetGuestInvitedByNil

`func (o *ObjsUserProfile) SetGuestInvitedByNil(b bool)`

 SetGuestInvitedByNil sets the value for GuestInvitedBy to be an explicit nil

### UnsetGuestInvitedBy
`func (o *ObjsUserProfile) UnsetGuestInvitedBy()`

UnsetGuestInvitedBy ensures that no value is present for GuestInvitedBy, not even an explicit nil
### GetImage1024

`func (o *ObjsUserProfile) GetImage1024() string`

GetImage1024 returns the Image1024 field if non-nil, zero value otherwise.

### GetImage1024Ok

`func (o *ObjsUserProfile) GetImage1024Ok() (*string, bool)`

GetImage1024Ok returns a tuple with the Image1024 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImage1024

`func (o *ObjsUserProfile) SetImage1024(v string)`

SetImage1024 sets Image1024 field to given value.

### HasImage1024

`func (o *ObjsUserProfile) HasImage1024() bool`

HasImage1024 returns a boolean if a field has been set.

### SetImage1024Nil

`func (o *ObjsUserProfile) SetImage1024Nil(b bool)`

 SetImage1024Nil sets the value for Image1024 to be an explicit nil

### UnsetImage1024
`func (o *ObjsUserProfile) UnsetImage1024()`

UnsetImage1024 ensures that no value is present for Image1024, not even an explicit nil
### GetImage192

`func (o *ObjsUserProfile) GetImage192() string`

GetImage192 returns the Image192 field if non-nil, zero value otherwise.

### GetImage192Ok

`func (o *ObjsUserProfile) GetImage192Ok() (*string, bool)`

GetImage192Ok returns a tuple with the Image192 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImage192

`func (o *ObjsUserProfile) SetImage192(v string)`

SetImage192 sets Image192 field to given value.

### HasImage192

`func (o *ObjsUserProfile) HasImage192() bool`

HasImage192 returns a boolean if a field has been set.

### SetImage192Nil

`func (o *ObjsUserProfile) SetImage192Nil(b bool)`

 SetImage192Nil sets the value for Image192 to be an explicit nil

### UnsetImage192
`func (o *ObjsUserProfile) UnsetImage192()`

UnsetImage192 ensures that no value is present for Image192, not even an explicit nil
### GetImage24

`func (o *ObjsUserProfile) GetImage24() string`

GetImage24 returns the Image24 field if non-nil, zero value otherwise.

### GetImage24Ok

`func (o *ObjsUserProfile) GetImage24Ok() (*string, bool)`

GetImage24Ok returns a tuple with the Image24 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImage24

`func (o *ObjsUserProfile) SetImage24(v string)`

SetImage24 sets Image24 field to given value.

### HasImage24

`func (o *ObjsUserProfile) HasImage24() bool`

HasImage24 returns a boolean if a field has been set.

### SetImage24Nil

`func (o *ObjsUserProfile) SetImage24Nil(b bool)`

 SetImage24Nil sets the value for Image24 to be an explicit nil

### UnsetImage24
`func (o *ObjsUserProfile) UnsetImage24()`

UnsetImage24 ensures that no value is present for Image24, not even an explicit nil
### GetImage32

`func (o *ObjsUserProfile) GetImage32() string`

GetImage32 returns the Image32 field if non-nil, zero value otherwise.

### GetImage32Ok

`func (o *ObjsUserProfile) GetImage32Ok() (*string, bool)`

GetImage32Ok returns a tuple with the Image32 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImage32

`func (o *ObjsUserProfile) SetImage32(v string)`

SetImage32 sets Image32 field to given value.

### HasImage32

`func (o *ObjsUserProfile) HasImage32() bool`

HasImage32 returns a boolean if a field has been set.

### SetImage32Nil

`func (o *ObjsUserProfile) SetImage32Nil(b bool)`

 SetImage32Nil sets the value for Image32 to be an explicit nil

### UnsetImage32
`func (o *ObjsUserProfile) UnsetImage32()`

UnsetImage32 ensures that no value is present for Image32, not even an explicit nil
### GetImage48

`func (o *ObjsUserProfile) GetImage48() string`

GetImage48 returns the Image48 field if non-nil, zero value otherwise.

### GetImage48Ok

`func (o *ObjsUserProfile) GetImage48Ok() (*string, bool)`

GetImage48Ok returns a tuple with the Image48 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImage48

`func (o *ObjsUserProfile) SetImage48(v string)`

SetImage48 sets Image48 field to given value.

### HasImage48

`func (o *ObjsUserProfile) HasImage48() bool`

HasImage48 returns a boolean if a field has been set.

### SetImage48Nil

`func (o *ObjsUserProfile) SetImage48Nil(b bool)`

 SetImage48Nil sets the value for Image48 to be an explicit nil

### UnsetImage48
`func (o *ObjsUserProfile) UnsetImage48()`

UnsetImage48 ensures that no value is present for Image48, not even an explicit nil
### GetImage512

`func (o *ObjsUserProfile) GetImage512() string`

GetImage512 returns the Image512 field if non-nil, zero value otherwise.

### GetImage512Ok

`func (o *ObjsUserProfile) GetImage512Ok() (*string, bool)`

GetImage512Ok returns a tuple with the Image512 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImage512

`func (o *ObjsUserProfile) SetImage512(v string)`

SetImage512 sets Image512 field to given value.

### HasImage512

`func (o *ObjsUserProfile) HasImage512() bool`

HasImage512 returns a boolean if a field has been set.

### SetImage512Nil

`func (o *ObjsUserProfile) SetImage512Nil(b bool)`

 SetImage512Nil sets the value for Image512 to be an explicit nil

### UnsetImage512
`func (o *ObjsUserProfile) UnsetImage512()`

UnsetImage512 ensures that no value is present for Image512, not even an explicit nil
### GetImage72

`func (o *ObjsUserProfile) GetImage72() string`

GetImage72 returns the Image72 field if non-nil, zero value otherwise.

### GetImage72Ok

`func (o *ObjsUserProfile) GetImage72Ok() (*string, bool)`

GetImage72Ok returns a tuple with the Image72 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImage72

`func (o *ObjsUserProfile) SetImage72(v string)`

SetImage72 sets Image72 field to given value.

### HasImage72

`func (o *ObjsUserProfile) HasImage72() bool`

HasImage72 returns a boolean if a field has been set.

### SetImage72Nil

`func (o *ObjsUserProfile) SetImage72Nil(b bool)`

 SetImage72Nil sets the value for Image72 to be an explicit nil

### UnsetImage72
`func (o *ObjsUserProfile) UnsetImage72()`

UnsetImage72 ensures that no value is present for Image72, not even an explicit nil
### GetImageOriginal

`func (o *ObjsUserProfile) GetImageOriginal() string`

GetImageOriginal returns the ImageOriginal field if non-nil, zero value otherwise.

### GetImageOriginalOk

`func (o *ObjsUserProfile) GetImageOriginalOk() (*string, bool)`

GetImageOriginalOk returns a tuple with the ImageOriginal field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetImageOriginal

`func (o *ObjsUserProfile) SetImageOriginal(v string)`

SetImageOriginal sets ImageOriginal field to given value.

### HasImageOriginal

`func (o *ObjsUserProfile) HasImageOriginal() bool`

HasImageOriginal returns a boolean if a field has been set.

### SetImageOriginalNil

`func (o *ObjsUserProfile) SetImageOriginalNil(b bool)`

 SetImageOriginalNil sets the value for ImageOriginal to be an explicit nil

### UnsetImageOriginal
`func (o *ObjsUserProfile) UnsetImageOriginal()`

UnsetImageOriginal ensures that no value is present for ImageOriginal, not even an explicit nil
### GetIsAppUser

`func (o *ObjsUserProfile) GetIsAppUser() bool`

GetIsAppUser returns the IsAppUser field if non-nil, zero value otherwise.

### GetIsAppUserOk

`func (o *ObjsUserProfile) GetIsAppUserOk() (*bool, bool)`

GetIsAppUserOk returns a tuple with the IsAppUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsAppUser

`func (o *ObjsUserProfile) SetIsAppUser(v bool)`

SetIsAppUser sets IsAppUser field to given value.

### HasIsAppUser

`func (o *ObjsUserProfile) HasIsAppUser() bool`

HasIsAppUser returns a boolean if a field has been set.

### GetIsCustomImage

`func (o *ObjsUserProfile) GetIsCustomImage() bool`

GetIsCustomImage returns the IsCustomImage field if non-nil, zero value otherwise.

### GetIsCustomImageOk

`func (o *ObjsUserProfile) GetIsCustomImageOk() (*bool, bool)`

GetIsCustomImageOk returns a tuple with the IsCustomImage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsCustomImage

`func (o *ObjsUserProfile) SetIsCustomImage(v bool)`

SetIsCustomImage sets IsCustomImage field to given value.

### HasIsCustomImage

`func (o *ObjsUserProfile) HasIsCustomImage() bool`

HasIsCustomImage returns a boolean if a field has been set.

### GetIsRestricted

`func (o *ObjsUserProfile) GetIsRestricted() bool`

GetIsRestricted returns the IsRestricted field if non-nil, zero value otherwise.

### GetIsRestrictedOk

`func (o *ObjsUserProfile) GetIsRestrictedOk() (*bool, bool)`

GetIsRestrictedOk returns a tuple with the IsRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsRestricted

`func (o *ObjsUserProfile) SetIsRestricted(v bool)`

SetIsRestricted sets IsRestricted field to given value.

### HasIsRestricted

`func (o *ObjsUserProfile) HasIsRestricted() bool`

HasIsRestricted returns a boolean if a field has been set.

### SetIsRestrictedNil

`func (o *ObjsUserProfile) SetIsRestrictedNil(b bool)`

 SetIsRestrictedNil sets the value for IsRestricted to be an explicit nil

### UnsetIsRestricted
`func (o *ObjsUserProfile) UnsetIsRestricted()`

UnsetIsRestricted ensures that no value is present for IsRestricted, not even an explicit nil
### GetIsUltraRestricted

`func (o *ObjsUserProfile) GetIsUltraRestricted() bool`

GetIsUltraRestricted returns the IsUltraRestricted field if non-nil, zero value otherwise.

### GetIsUltraRestrictedOk

`func (o *ObjsUserProfile) GetIsUltraRestrictedOk() (*bool, bool)`

GetIsUltraRestrictedOk returns a tuple with the IsUltraRestricted field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsUltraRestricted

`func (o *ObjsUserProfile) SetIsUltraRestricted(v bool)`

SetIsUltraRestricted sets IsUltraRestricted field to given value.

### HasIsUltraRestricted

`func (o *ObjsUserProfile) HasIsUltraRestricted() bool`

HasIsUltraRestricted returns a boolean if a field has been set.

### SetIsUltraRestrictedNil

`func (o *ObjsUserProfile) SetIsUltraRestrictedNil(b bool)`

 SetIsUltraRestrictedNil sets the value for IsUltraRestricted to be an explicit nil

### UnsetIsUltraRestricted
`func (o *ObjsUserProfile) UnsetIsUltraRestricted()`

UnsetIsUltraRestricted ensures that no value is present for IsUltraRestricted, not even an explicit nil
### GetLastAvatarImageHash

`func (o *ObjsUserProfile) GetLastAvatarImageHash() string`

GetLastAvatarImageHash returns the LastAvatarImageHash field if non-nil, zero value otherwise.

### GetLastAvatarImageHashOk

`func (o *ObjsUserProfile) GetLastAvatarImageHashOk() (*string, bool)`

GetLastAvatarImageHashOk returns a tuple with the LastAvatarImageHash field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastAvatarImageHash

`func (o *ObjsUserProfile) SetLastAvatarImageHash(v string)`

SetLastAvatarImageHash sets LastAvatarImageHash field to given value.

### HasLastAvatarImageHash

`func (o *ObjsUserProfile) HasLastAvatarImageHash() bool`

HasLastAvatarImageHash returns a boolean if a field has been set.

### GetLastName

`func (o *ObjsUserProfile) GetLastName() string`

GetLastName returns the LastName field if non-nil, zero value otherwise.

### GetLastNameOk

`func (o *ObjsUserProfile) GetLastNameOk() (*string, bool)`

GetLastNameOk returns a tuple with the LastName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastName

`func (o *ObjsUserProfile) SetLastName(v string)`

SetLastName sets LastName field to given value.

### HasLastName

`func (o *ObjsUserProfile) HasLastName() bool`

HasLastName returns a boolean if a field has been set.

### SetLastNameNil

`func (o *ObjsUserProfile) SetLastNameNil(b bool)`

 SetLastNameNil sets the value for LastName to be an explicit nil

### UnsetLastName
`func (o *ObjsUserProfile) UnsetLastName()`

UnsetLastName ensures that no value is present for LastName, not even an explicit nil
### GetMembershipsCount

`func (o *ObjsUserProfile) GetMembershipsCount() int32`

GetMembershipsCount returns the MembershipsCount field if non-nil, zero value otherwise.

### GetMembershipsCountOk

`func (o *ObjsUserProfile) GetMembershipsCountOk() (*int32, bool)`

GetMembershipsCountOk returns a tuple with the MembershipsCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMembershipsCount

`func (o *ObjsUserProfile) SetMembershipsCount(v int32)`

SetMembershipsCount sets MembershipsCount field to given value.

### HasMembershipsCount

`func (o *ObjsUserProfile) HasMembershipsCount() bool`

HasMembershipsCount returns a boolean if a field has been set.

### GetName

`func (o *ObjsUserProfile) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ObjsUserProfile) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ObjsUserProfile) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ObjsUserProfile) HasName() bool`

HasName returns a boolean if a field has been set.

### SetNameNil

`func (o *ObjsUserProfile) SetNameNil(b bool)`

 SetNameNil sets the value for Name to be an explicit nil

### UnsetName
`func (o *ObjsUserProfile) UnsetName()`

UnsetName ensures that no value is present for Name, not even an explicit nil
### GetPhone

`func (o *ObjsUserProfile) GetPhone() string`

GetPhone returns the Phone field if non-nil, zero value otherwise.

### GetPhoneOk

`func (o *ObjsUserProfile) GetPhoneOk() (*string, bool)`

GetPhoneOk returns a tuple with the Phone field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPhone

`func (o *ObjsUserProfile) SetPhone(v string)`

SetPhone sets Phone field to given value.


### GetPronouns

`func (o *ObjsUserProfile) GetPronouns() string`

GetPronouns returns the Pronouns field if non-nil, zero value otherwise.

### GetPronounsOk

`func (o *ObjsUserProfile) GetPronounsOk() (*string, bool)`

GetPronounsOk returns a tuple with the Pronouns field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPronouns

`func (o *ObjsUserProfile) SetPronouns(v string)`

SetPronouns sets Pronouns field to given value.

### HasPronouns

`func (o *ObjsUserProfile) HasPronouns() bool`

HasPronouns returns a boolean if a field has been set.

### GetRealName

`func (o *ObjsUserProfile) GetRealName() string`

GetRealName returns the RealName field if non-nil, zero value otherwise.

### GetRealNameOk

`func (o *ObjsUserProfile) GetRealNameOk() (*string, bool)`

GetRealNameOk returns a tuple with the RealName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRealName

`func (o *ObjsUserProfile) SetRealName(v string)`

SetRealName sets RealName field to given value.


### GetRealNameNormalized

`func (o *ObjsUserProfile) GetRealNameNormalized() string`

GetRealNameNormalized returns the RealNameNormalized field if non-nil, zero value otherwise.

### GetRealNameNormalizedOk

`func (o *ObjsUserProfile) GetRealNameNormalizedOk() (*string, bool)`

GetRealNameNormalizedOk returns a tuple with the RealNameNormalized field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRealNameNormalized

`func (o *ObjsUserProfile) SetRealNameNormalized(v string)`

SetRealNameNormalized sets RealNameNormalized field to given value.


### GetSkype

`func (o *ObjsUserProfile) GetSkype() string`

GetSkype returns the Skype field if non-nil, zero value otherwise.

### GetSkypeOk

`func (o *ObjsUserProfile) GetSkypeOk() (*string, bool)`

GetSkypeOk returns a tuple with the Skype field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSkype

`func (o *ObjsUserProfile) SetSkype(v string)`

SetSkype sets Skype field to given value.


### GetStatusDefaultEmoji

`func (o *ObjsUserProfile) GetStatusDefaultEmoji() string`

GetStatusDefaultEmoji returns the StatusDefaultEmoji field if non-nil, zero value otherwise.

### GetStatusDefaultEmojiOk

`func (o *ObjsUserProfile) GetStatusDefaultEmojiOk() (*string, bool)`

GetStatusDefaultEmojiOk returns a tuple with the StatusDefaultEmoji field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusDefaultEmoji

`func (o *ObjsUserProfile) SetStatusDefaultEmoji(v string)`

SetStatusDefaultEmoji sets StatusDefaultEmoji field to given value.

### HasStatusDefaultEmoji

`func (o *ObjsUserProfile) HasStatusDefaultEmoji() bool`

HasStatusDefaultEmoji returns a boolean if a field has been set.

### GetStatusDefaultText

`func (o *ObjsUserProfile) GetStatusDefaultText() string`

GetStatusDefaultText returns the StatusDefaultText field if non-nil, zero value otherwise.

### GetStatusDefaultTextOk

`func (o *ObjsUserProfile) GetStatusDefaultTextOk() (*string, bool)`

GetStatusDefaultTextOk returns a tuple with the StatusDefaultText field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusDefaultText

`func (o *ObjsUserProfile) SetStatusDefaultText(v string)`

SetStatusDefaultText sets StatusDefaultText field to given value.

### HasStatusDefaultText

`func (o *ObjsUserProfile) HasStatusDefaultText() bool`

HasStatusDefaultText returns a boolean if a field has been set.

### GetStatusDefaultTextCanonical

`func (o *ObjsUserProfile) GetStatusDefaultTextCanonical() string`

GetStatusDefaultTextCanonical returns the StatusDefaultTextCanonical field if non-nil, zero value otherwise.

### GetStatusDefaultTextCanonicalOk

`func (o *ObjsUserProfile) GetStatusDefaultTextCanonicalOk() (*string, bool)`

GetStatusDefaultTextCanonicalOk returns a tuple with the StatusDefaultTextCanonical field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusDefaultTextCanonical

`func (o *ObjsUserProfile) SetStatusDefaultTextCanonical(v string)`

SetStatusDefaultTextCanonical sets StatusDefaultTextCanonical field to given value.

### HasStatusDefaultTextCanonical

`func (o *ObjsUserProfile) HasStatusDefaultTextCanonical() bool`

HasStatusDefaultTextCanonical returns a boolean if a field has been set.

### SetStatusDefaultTextCanonicalNil

`func (o *ObjsUserProfile) SetStatusDefaultTextCanonicalNil(b bool)`

 SetStatusDefaultTextCanonicalNil sets the value for StatusDefaultTextCanonical to be an explicit nil

### UnsetStatusDefaultTextCanonical
`func (o *ObjsUserProfile) UnsetStatusDefaultTextCanonical()`

UnsetStatusDefaultTextCanonical ensures that no value is present for StatusDefaultTextCanonical, not even an explicit nil
### GetStatusEmoji

`func (o *ObjsUserProfile) GetStatusEmoji() string`

GetStatusEmoji returns the StatusEmoji field if non-nil, zero value otherwise.

### GetStatusEmojiOk

`func (o *ObjsUserProfile) GetStatusEmojiOk() (*string, bool)`

GetStatusEmojiOk returns a tuple with the StatusEmoji field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusEmoji

`func (o *ObjsUserProfile) SetStatusEmoji(v string)`

SetStatusEmoji sets StatusEmoji field to given value.


### GetStatusExpiration

`func (o *ObjsUserProfile) GetStatusExpiration() int32`

GetStatusExpiration returns the StatusExpiration field if non-nil, zero value otherwise.

### GetStatusExpirationOk

`func (o *ObjsUserProfile) GetStatusExpirationOk() (*int32, bool)`

GetStatusExpirationOk returns a tuple with the StatusExpiration field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusExpiration

`func (o *ObjsUserProfile) SetStatusExpiration(v int32)`

SetStatusExpiration sets StatusExpiration field to given value.

### HasStatusExpiration

`func (o *ObjsUserProfile) HasStatusExpiration() bool`

HasStatusExpiration returns a boolean if a field has been set.

### GetStatusText

`func (o *ObjsUserProfile) GetStatusText() string`

GetStatusText returns the StatusText field if non-nil, zero value otherwise.

### GetStatusTextOk

`func (o *ObjsUserProfile) GetStatusTextOk() (*string, bool)`

GetStatusTextOk returns a tuple with the StatusText field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusText

`func (o *ObjsUserProfile) SetStatusText(v string)`

SetStatusText sets StatusText field to given value.


### GetStatusTextCanonical

`func (o *ObjsUserProfile) GetStatusTextCanonical() string`

GetStatusTextCanonical returns the StatusTextCanonical field if non-nil, zero value otherwise.

### GetStatusTextCanonicalOk

`func (o *ObjsUserProfile) GetStatusTextCanonicalOk() (*string, bool)`

GetStatusTextCanonicalOk returns a tuple with the StatusTextCanonical field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatusTextCanonical

`func (o *ObjsUserProfile) SetStatusTextCanonical(v string)`

SetStatusTextCanonical sets StatusTextCanonical field to given value.

### HasStatusTextCanonical

`func (o *ObjsUserProfile) HasStatusTextCanonical() bool`

HasStatusTextCanonical returns a boolean if a field has been set.

### SetStatusTextCanonicalNil

`func (o *ObjsUserProfile) SetStatusTextCanonicalNil(b bool)`

 SetStatusTextCanonicalNil sets the value for StatusTextCanonical to be an explicit nil

### UnsetStatusTextCanonical
`func (o *ObjsUserProfile) UnsetStatusTextCanonical()`

UnsetStatusTextCanonical ensures that no value is present for StatusTextCanonical, not even an explicit nil
### GetTeam

`func (o *ObjsUserProfile) GetTeam() string`

GetTeam returns the Team field if non-nil, zero value otherwise.

### GetTeamOk

`func (o *ObjsUserProfile) GetTeamOk() (*string, bool)`

GetTeamOk returns a tuple with the Team field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeam

`func (o *ObjsUserProfile) SetTeam(v string)`

SetTeam sets Team field to given value.

### HasTeam

`func (o *ObjsUserProfile) HasTeam() bool`

HasTeam returns a boolean if a field has been set.

### GetTitle

`func (o *ObjsUserProfile) GetTitle() string`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *ObjsUserProfile) GetTitleOk() (*string, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *ObjsUserProfile) SetTitle(v string)`

SetTitle sets Title field to given value.


### GetUpdated

`func (o *ObjsUserProfile) GetUpdated() int32`

GetUpdated returns the Updated field if non-nil, zero value otherwise.

### GetUpdatedOk

`func (o *ObjsUserProfile) GetUpdatedOk() (*int32, bool)`

GetUpdatedOk returns a tuple with the Updated field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdated

`func (o *ObjsUserProfile) SetUpdated(v int32)`

SetUpdated sets Updated field to given value.

### HasUpdated

`func (o *ObjsUserProfile) HasUpdated() bool`

HasUpdated returns a boolean if a field has been set.

### GetUserId

`func (o *ObjsUserProfile) GetUserId() string`

GetUserId returns the UserId field if non-nil, zero value otherwise.

### GetUserIdOk

`func (o *ObjsUserProfile) GetUserIdOk() (*string, bool)`

GetUserIdOk returns a tuple with the UserId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserId

`func (o *ObjsUserProfile) SetUserId(v string)`

SetUserId sets UserId field to given value.

### HasUserId

`func (o *ObjsUserProfile) HasUserId() bool`

HasUserId returns a boolean if a field has been set.

### GetUsername

`func (o *ObjsUserProfile) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *ObjsUserProfile) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *ObjsUserProfile) SetUsername(v string)`

SetUsername sets Username field to given value.

### HasUsername

`func (o *ObjsUserProfile) HasUsername() bool`

HasUsername returns a boolean if a field has been set.

### SetUsernameNil

`func (o *ObjsUserProfile) SetUsernameNil(b bool)`

 SetUsernameNil sets the value for Username to be an explicit nil

### UnsetUsername
`func (o *ObjsUserProfile) UnsetUsername()`

UnsetUsername ensures that no value is present for Username, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


