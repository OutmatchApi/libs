# AppsPermissionsResourcesListErrorSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Callstack** | Pointer to **string** | Note: PHP callstack is only visible in dev/qa | [optional] 
**Error** | **string** |  | 
**Ok** | [**DefsOkFalse**](DefsOkFalse.md) |  | 

## Methods

### NewAppsPermissionsResourcesListErrorSchema

`func NewAppsPermissionsResourcesListErrorSchema(error_ string, ok DefsOkFalse, ) *AppsPermissionsResourcesListErrorSchema`

NewAppsPermissionsResourcesListErrorSchema instantiates a new AppsPermissionsResourcesListErrorSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAppsPermissionsResourcesListErrorSchemaWithDefaults

`func NewAppsPermissionsResourcesListErrorSchemaWithDefaults() *AppsPermissionsResourcesListErrorSchema`

NewAppsPermissionsResourcesListErrorSchemaWithDefaults instantiates a new AppsPermissionsResourcesListErrorSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCallstack

`func (o *AppsPermissionsResourcesListErrorSchema) GetCallstack() string`

GetCallstack returns the Callstack field if non-nil, zero value otherwise.

### GetCallstackOk

`func (o *AppsPermissionsResourcesListErrorSchema) GetCallstackOk() (*string, bool)`

GetCallstackOk returns a tuple with the Callstack field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCallstack

`func (o *AppsPermissionsResourcesListErrorSchema) SetCallstack(v string)`

SetCallstack sets Callstack field to given value.

### HasCallstack

`func (o *AppsPermissionsResourcesListErrorSchema) HasCallstack() bool`

HasCallstack returns a boolean if a field has been set.

### GetError

`func (o *AppsPermissionsResourcesListErrorSchema) GetError() string`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *AppsPermissionsResourcesListErrorSchema) GetErrorOk() (*string, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *AppsPermissionsResourcesListErrorSchema) SetError(v string)`

SetError sets Error field to given value.


### GetOk

`func (o *AppsPermissionsResourcesListErrorSchema) GetOk() DefsOkFalse`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *AppsPermissionsResourcesListErrorSchema) GetOkOk() (*DefsOkFalse, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *AppsPermissionsResourcesListErrorSchema) SetOk(v DefsOkFalse)`

SetOk sets Ok field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


