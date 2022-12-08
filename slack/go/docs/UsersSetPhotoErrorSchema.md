# UsersSetPhotoErrorSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Callstack** | Pointer to **string** | Note: PHP callstack is only visible in dev/qa | [optional] 
**DebugStep** | Pointer to **string** | possibly DEV/QA only | [optional] 
**Dims** | Pointer to **string** | possibly DEV/QA only | [optional] 
**Error** | **string** |  | 
**Ok** | [**DefsOkFalse**](DefsOkFalse.md) |  | 
**TimeIdent** | Pointer to **int32** | possibly DEV/QA only | [optional] 

## Methods

### NewUsersSetPhotoErrorSchema

`func NewUsersSetPhotoErrorSchema(error_ string, ok DefsOkFalse, ) *UsersSetPhotoErrorSchema`

NewUsersSetPhotoErrorSchema instantiates a new UsersSetPhotoErrorSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewUsersSetPhotoErrorSchemaWithDefaults

`func NewUsersSetPhotoErrorSchemaWithDefaults() *UsersSetPhotoErrorSchema`

NewUsersSetPhotoErrorSchemaWithDefaults instantiates a new UsersSetPhotoErrorSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCallstack

`func (o *UsersSetPhotoErrorSchema) GetCallstack() string`

GetCallstack returns the Callstack field if non-nil, zero value otherwise.

### GetCallstackOk

`func (o *UsersSetPhotoErrorSchema) GetCallstackOk() (*string, bool)`

GetCallstackOk returns a tuple with the Callstack field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCallstack

`func (o *UsersSetPhotoErrorSchema) SetCallstack(v string)`

SetCallstack sets Callstack field to given value.

### HasCallstack

`func (o *UsersSetPhotoErrorSchema) HasCallstack() bool`

HasCallstack returns a boolean if a field has been set.

### GetDebugStep

`func (o *UsersSetPhotoErrorSchema) GetDebugStep() string`

GetDebugStep returns the DebugStep field if non-nil, zero value otherwise.

### GetDebugStepOk

`func (o *UsersSetPhotoErrorSchema) GetDebugStepOk() (*string, bool)`

GetDebugStepOk returns a tuple with the DebugStep field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebugStep

`func (o *UsersSetPhotoErrorSchema) SetDebugStep(v string)`

SetDebugStep sets DebugStep field to given value.

### HasDebugStep

`func (o *UsersSetPhotoErrorSchema) HasDebugStep() bool`

HasDebugStep returns a boolean if a field has been set.

### GetDims

`func (o *UsersSetPhotoErrorSchema) GetDims() string`

GetDims returns the Dims field if non-nil, zero value otherwise.

### GetDimsOk

`func (o *UsersSetPhotoErrorSchema) GetDimsOk() (*string, bool)`

GetDimsOk returns a tuple with the Dims field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDims

`func (o *UsersSetPhotoErrorSchema) SetDims(v string)`

SetDims sets Dims field to given value.

### HasDims

`func (o *UsersSetPhotoErrorSchema) HasDims() bool`

HasDims returns a boolean if a field has been set.

### GetError

`func (o *UsersSetPhotoErrorSchema) GetError() string`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *UsersSetPhotoErrorSchema) GetErrorOk() (*string, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *UsersSetPhotoErrorSchema) SetError(v string)`

SetError sets Error field to given value.


### GetOk

`func (o *UsersSetPhotoErrorSchema) GetOk() DefsOkFalse`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *UsersSetPhotoErrorSchema) GetOkOk() (*DefsOkFalse, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *UsersSetPhotoErrorSchema) SetOk(v DefsOkFalse)`

SetOk sets Ok field to given value.


### GetTimeIdent

`func (o *UsersSetPhotoErrorSchema) GetTimeIdent() int32`

GetTimeIdent returns the TimeIdent field if non-nil, zero value otherwise.

### GetTimeIdentOk

`func (o *UsersSetPhotoErrorSchema) GetTimeIdentOk() (*int32, bool)`

GetTimeIdentOk returns a tuple with the TimeIdent field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimeIdent

`func (o *UsersSetPhotoErrorSchema) SetTimeIdent(v int32)`

SetTimeIdent sets TimeIdent field to given value.

### HasTimeIdent

`func (o *UsersSetPhotoErrorSchema) HasTimeIdent() bool`

HasTimeIdent returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


