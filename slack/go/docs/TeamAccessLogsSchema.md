# TeamAccessLogsSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Logins** | [**[]TeamAccessLogsSchemaLoginsInner**](TeamAccessLogsSchemaLoginsInner.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Paging** | [**ObjsPaging**](ObjsPaging.md) |  | 

## Methods

### NewTeamAccessLogsSchema

`func NewTeamAccessLogsSchema(logins []TeamAccessLogsSchemaLoginsInner, ok DefsOkTrue, paging ObjsPaging, ) *TeamAccessLogsSchema`

NewTeamAccessLogsSchema instantiates a new TeamAccessLogsSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTeamAccessLogsSchemaWithDefaults

`func NewTeamAccessLogsSchemaWithDefaults() *TeamAccessLogsSchema`

NewTeamAccessLogsSchemaWithDefaults instantiates a new TeamAccessLogsSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLogins

`func (o *TeamAccessLogsSchema) GetLogins() []TeamAccessLogsSchemaLoginsInner`

GetLogins returns the Logins field if non-nil, zero value otherwise.

### GetLoginsOk

`func (o *TeamAccessLogsSchema) GetLoginsOk() (*[]TeamAccessLogsSchemaLoginsInner, bool)`

GetLoginsOk returns a tuple with the Logins field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogins

`func (o *TeamAccessLogsSchema) SetLogins(v []TeamAccessLogsSchemaLoginsInner)`

SetLogins sets Logins field to given value.


### GetOk

`func (o *TeamAccessLogsSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *TeamAccessLogsSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *TeamAccessLogsSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetPaging

`func (o *TeamAccessLogsSchema) GetPaging() ObjsPaging`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *TeamAccessLogsSchema) GetPagingOk() (*ObjsPaging, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *TeamAccessLogsSchema) SetPaging(v ObjsPaging)`

SetPaging sets Paging field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


