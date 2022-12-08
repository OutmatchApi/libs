# TeamIntegrationLogsSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Logs** | [**[]TeamIntegrationLogsSchemaLogsInner**](TeamIntegrationLogsSchemaLogsInner.md) |  | 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Paging** | [**ObjsPaging**](ObjsPaging.md) |  | 

## Methods

### NewTeamIntegrationLogsSchema

`func NewTeamIntegrationLogsSchema(logs []TeamIntegrationLogsSchemaLogsInner, ok DefsOkTrue, paging ObjsPaging, ) *TeamIntegrationLogsSchema`

NewTeamIntegrationLogsSchema instantiates a new TeamIntegrationLogsSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTeamIntegrationLogsSchemaWithDefaults

`func NewTeamIntegrationLogsSchemaWithDefaults() *TeamIntegrationLogsSchema`

NewTeamIntegrationLogsSchemaWithDefaults instantiates a new TeamIntegrationLogsSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLogs

`func (o *TeamIntegrationLogsSchema) GetLogs() []TeamIntegrationLogsSchemaLogsInner`

GetLogs returns the Logs field if non-nil, zero value otherwise.

### GetLogsOk

`func (o *TeamIntegrationLogsSchema) GetLogsOk() (*[]TeamIntegrationLogsSchemaLogsInner, bool)`

GetLogsOk returns a tuple with the Logs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogs

`func (o *TeamIntegrationLogsSchema) SetLogs(v []TeamIntegrationLogsSchemaLogsInner)`

SetLogs sets Logs field to given value.


### GetOk

`func (o *TeamIntegrationLogsSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *TeamIntegrationLogsSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *TeamIntegrationLogsSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetPaging

`func (o *TeamIntegrationLogsSchema) GetPaging() ObjsPaging`

GetPaging returns the Paging field if non-nil, zero value otherwise.

### GetPagingOk

`func (o *TeamIntegrationLogsSchema) GetPagingOk() (*ObjsPaging, bool)`

GetPagingOk returns a tuple with the Paging field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPaging

`func (o *TeamIntegrationLogsSchema) SetPaging(v ObjsPaging)`

SetPaging sets Paging field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


