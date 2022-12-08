# UsersProfileSetSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EmailPending** | Pointer to **string** |  | [optional] 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Profile** | [**ObjsUserProfile**](ObjsUserProfile.md) |  | 
**Username** | **string** |  | 

## Methods

### NewUsersProfileSetSchema

`func NewUsersProfileSetSchema(ok DefsOkTrue, profile ObjsUserProfile, username string, ) *UsersProfileSetSchema`

NewUsersProfileSetSchema instantiates a new UsersProfileSetSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsersProfileSetSchemaWithDefaults

`func NewUsersProfileSetSchemaWithDefaults() *UsersProfileSetSchema`

NewUsersProfileSetSchemaWithDefaults instantiates a new UsersProfileSetSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEmailPending

`func (o *UsersProfileSetSchema) GetEmailPending() string`

GetEmailPending returns the EmailPending field if non-nil, zero value otherwise.

### GetEmailPendingOk

`func (o *UsersProfileSetSchema) GetEmailPendingOk() (*string, bool)`

GetEmailPendingOk returns a tuple with the EmailPending field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEmailPending

`func (o *UsersProfileSetSchema) SetEmailPending(v string)`

SetEmailPending sets EmailPending field to given value.

### HasEmailPending

`func (o *UsersProfileSetSchema) HasEmailPending() bool`

HasEmailPending returns a boolean if a field has been set.

### GetOk

`func (o *UsersProfileSetSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *UsersProfileSetSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *UsersProfileSetSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetProfile

`func (o *UsersProfileSetSchema) GetProfile() ObjsUserProfile`

GetProfile returns the Profile field if non-nil, zero value otherwise.

### GetProfileOk

`func (o *UsersProfileSetSchema) GetProfileOk() (*ObjsUserProfile, bool)`

GetProfileOk returns a tuple with the Profile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProfile

`func (o *UsersProfileSetSchema) SetProfile(v ObjsUserProfile)`

SetProfile sets Profile field to given value.


### GetUsername

`func (o *UsersProfileSetSchema) GetUsername() string`

GetUsername returns the Username field if non-nil, zero value otherwise.

### GetUsernameOk

`func (o *UsersProfileSetSchema) GetUsernameOk() (*string, bool)`

GetUsernameOk returns a tuple with the Username field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsername

`func (o *UsersProfileSetSchema) SetUsername(v string)`

SetUsername sets Username field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


