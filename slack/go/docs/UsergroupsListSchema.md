# UsergroupsListSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Usergroups** | [**[]ObjsSubteam**](ObjsSubteam.md) |  | 

## Methods

### NewUsergroupsListSchema

`func NewUsergroupsListSchema(ok DefsOkTrue, usergroups []ObjsSubteam, ) *UsergroupsListSchema`

NewUsergroupsListSchema instantiates a new UsergroupsListSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsergroupsListSchemaWithDefaults

`func NewUsergroupsListSchemaWithDefaults() *UsergroupsListSchema`

NewUsergroupsListSchemaWithDefaults instantiates a new UsergroupsListSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOk

`func (o *UsergroupsListSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *UsergroupsListSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *UsergroupsListSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetUsergroups

`func (o *UsergroupsListSchema) GetUsergroups() []ObjsSubteam`

GetUsergroups returns the Usergroups field if non-nil, zero value otherwise.

### GetUsergroupsOk

`func (o *UsergroupsListSchema) GetUsergroupsOk() (*[]ObjsSubteam, bool)`

GetUsergroupsOk returns a tuple with the Usergroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUsergroups

`func (o *UsergroupsListSchema) SetUsergroups(v []ObjsSubteam)`

SetUsergroups sets Usergroups field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


