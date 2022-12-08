# TeamAccessLogsErrorSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Callstack** | Pointer to **string** | Note: PHP callstack is only visible in dev/qa | [optional] 
**Error** | **string** |  | 
**Ok** | [**DefsOkFalse**](DefsOkFalse.md) |  | 

## Methods

### NewTeamAccessLogsErrorSchema

`func NewTeamAccessLogsErrorSchema(error_ string, ok DefsOkFalse, ) *TeamAccessLogsErrorSchema`

NewTeamAccessLogsErrorSchema instantiates a new TeamAccessLogsErrorSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTeamAccessLogsErrorSchemaWithDefaults

`func NewTeamAccessLogsErrorSchemaWithDefaults() *TeamAccessLogsErrorSchema`

NewTeamAccessLogsErrorSchemaWithDefaults instantiates a new TeamAccessLogsErrorSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCallstack

`func (o *TeamAccessLogsErrorSchema) GetCallstack() string`

GetCallstack returns the Callstack field if non-nil, zero value otherwise.

### GetCallstackOk

`func (o *TeamAccessLogsErrorSchema) GetCallstackOk() (*string, bool)`

GetCallstackOk returns a tuple with the Callstack field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCallstack

`func (o *TeamAccessLogsErrorSchema) SetCallstack(v string)`

SetCallstack sets Callstack field to given value.

### HasCallstack

`func (o *TeamAccessLogsErrorSchema) HasCallstack() bool`

HasCallstack returns a boolean if a field has been set.

### GetError

`func (o *TeamAccessLogsErrorSchema) GetError() string`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *TeamAccessLogsErrorSchema) GetErrorOk() (*string, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *TeamAccessLogsErrorSchema) SetError(v string)`

SetError sets Error field to given value.


### GetOk

`func (o *TeamAccessLogsErrorSchema) GetOk() DefsOkFalse`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *TeamAccessLogsErrorSchema) GetOkOk() (*DefsOkFalse, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *TeamAccessLogsErrorSchema) SetOk(v DefsOkFalse)`

SetOk sets Ok field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


