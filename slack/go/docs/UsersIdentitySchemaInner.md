# UsersIdentitySchemaInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Team** | [**UsersIdentitySchemaInnerAnyOf3Team**](UsersIdentitySchemaInnerAnyOf3Team.md) |  | 
**User** | [**RtmConnectSchemaSelf**](RtmConnectSchemaSelf.md) |  | 

## Methods

### NewUsersIdentitySchemaInner

`func NewUsersIdentitySchemaInner(ok DefsOkTrue, team UsersIdentitySchemaInnerAnyOf3Team, user RtmConnectSchemaSelf, ) *UsersIdentitySchemaInner`

NewUsersIdentitySchemaInner instantiates a new UsersIdentitySchemaInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsersIdentitySchemaInnerWithDefaults

`func NewUsersIdentitySchemaInnerWithDefaults() *UsersIdentitySchemaInner`

NewUsersIdentitySchemaInnerWithDefaults instantiates a new UsersIdentitySchemaInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOk

`func (o *UsersIdentitySchemaInner) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *UsersIdentitySchemaInner) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *UsersIdentitySchemaInner) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetTeam

`func (o *UsersIdentitySchemaInner) GetTeam() UsersIdentitySchemaInnerAnyOf3Team`

GetTeam returns the Team field if non-nil, zero value otherwise.

### GetTeamOk

`func (o *UsersIdentitySchemaInner) GetTeamOk() (*UsersIdentitySchemaInnerAnyOf3Team, bool)`

GetTeamOk returns a tuple with the Team field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeam

`func (o *UsersIdentitySchemaInner) SetTeam(v UsersIdentitySchemaInnerAnyOf3Team)`

SetTeam sets Team field to given value.


### GetUser

`func (o *UsersIdentitySchemaInner) GetUser() RtmConnectSchemaSelf`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *UsersIdentitySchemaInner) GetUserOk() (*RtmConnectSchemaSelf, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *UsersIdentitySchemaInner) SetUser(v RtmConnectSchemaSelf)`

SetUser sets User field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


