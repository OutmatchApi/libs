# UsersInfoSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**User** | [**[]ObjsUserInner**](ObjsUserInner.md) |  | 

## Methods

### NewUsersInfoSuccessSchema

`func NewUsersInfoSuccessSchema(ok DefsOkTrue, user []ObjsUserInner, ) *UsersInfoSuccessSchema`

NewUsersInfoSuccessSchema instantiates a new UsersInfoSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsersInfoSuccessSchemaWithDefaults

`func NewUsersInfoSuccessSchemaWithDefaults() *UsersInfoSuccessSchema`

NewUsersInfoSuccessSchemaWithDefaults instantiates a new UsersInfoSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOk

`func (o *UsersInfoSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *UsersInfoSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *UsersInfoSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetUser

`func (o *UsersInfoSuccessSchema) GetUser() []ObjsUserInner`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *UsersInfoSuccessSchema) GetUserOk() (*[]ObjsUserInner, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *UsersInfoSuccessSchema) SetUser(v []ObjsUserInner)`

SetUser sets User field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


