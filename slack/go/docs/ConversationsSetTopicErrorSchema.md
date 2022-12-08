# ConversationsSetTopicErrorSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Callstack** | Pointer to **string** | Note: PHP callstack is only visible in dev/qa | [optional] 
**Error** | **string** |  | 
**Needed** | Pointer to **string** |  | [optional] 
**Ok** | [**DefsOkFalse**](DefsOkFalse.md) |  | 
**Provided** | Pointer to **string** |  | [optional] 

## Methods

### NewConversationsSetTopicErrorSchema

`func NewConversationsSetTopicErrorSchema(error_ string, ok DefsOkFalse, ) *ConversationsSetTopicErrorSchema`

NewConversationsSetTopicErrorSchema instantiates a new ConversationsSetTopicErrorSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsSetTopicErrorSchemaWithDefaults

`func NewConversationsSetTopicErrorSchemaWithDefaults() *ConversationsSetTopicErrorSchema`

NewConversationsSetTopicErrorSchemaWithDefaults instantiates a new ConversationsSetTopicErrorSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCallstack

`func (o *ConversationsSetTopicErrorSchema) GetCallstack() string`

GetCallstack returns the Callstack field if non-nil, zero value otherwise.

### GetCallstackOk

`func (o *ConversationsSetTopicErrorSchema) GetCallstackOk() (*string, bool)`

GetCallstackOk returns a tuple with the Callstack field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCallstack

`func (o *ConversationsSetTopicErrorSchema) SetCallstack(v string)`

SetCallstack sets Callstack field to given value.

### HasCallstack

`func (o *ConversationsSetTopicErrorSchema) HasCallstack() bool`

HasCallstack returns a boolean if a field has been set.

### GetError

`func (o *ConversationsSetTopicErrorSchema) GetError() string`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *ConversationsSetTopicErrorSchema) GetErrorOk() (*string, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *ConversationsSetTopicErrorSchema) SetError(v string)`

SetError sets Error field to given value.


### GetNeeded

`func (o *ConversationsSetTopicErrorSchema) GetNeeded() string`

GetNeeded returns the Needed field if non-nil, zero value otherwise.

### GetNeededOk

`func (o *ConversationsSetTopicErrorSchema) GetNeededOk() (*string, bool)`

GetNeededOk returns a tuple with the Needed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeeded

`func (o *ConversationsSetTopicErrorSchema) SetNeeded(v string)`

SetNeeded sets Needed field to given value.

### HasNeeded

`func (o *ConversationsSetTopicErrorSchema) HasNeeded() bool`

HasNeeded returns a boolean if a field has been set.

### GetOk

`func (o *ConversationsSetTopicErrorSchema) GetOk() DefsOkFalse`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ConversationsSetTopicErrorSchema) GetOkOk() (*DefsOkFalse, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ConversationsSetTopicErrorSchema) SetOk(v DefsOkFalse)`

SetOk sets Ok field to given value.


### GetProvided

`func (o *ConversationsSetTopicErrorSchema) GetProvided() string`

GetProvided returns the Provided field if non-nil, zero value otherwise.

### GetProvidedOk

`func (o *ConversationsSetTopicErrorSchema) GetProvidedOk() (*string, bool)`

GetProvidedOk returns a tuple with the Provided field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProvided

`func (o *ConversationsSetTopicErrorSchema) SetProvided(v string)`

SetProvided sets Provided field to given value.

### HasProvided

`func (o *ConversationsSetTopicErrorSchema) HasProvided() bool`

HasProvided returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


