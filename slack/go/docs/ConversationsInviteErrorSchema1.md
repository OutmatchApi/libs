# ConversationsInviteErrorSchema1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Callstack** | Pointer to **string** | Note: PHP callstack is only visible in dev/qa | [optional] 
**Error** | Pointer to **string** |  | [optional] 
**Errors** | Pointer to [**[]ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner**](ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner.md) |  | [optional] 
**Needed** | Pointer to **string** |  | [optional] 
**Ok** | [**DefsOkFalse**](DefsOkFalse.md) |  | 
**Provided** | Pointer to **string** |  | [optional] 

## Methods

### NewConversationsInviteErrorSchema1

`func NewConversationsInviteErrorSchema1(ok DefsOkFalse, ) *ConversationsInviteErrorSchema1`

NewConversationsInviteErrorSchema1 instantiates a new ConversationsInviteErrorSchema1 object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConversationsInviteErrorSchema1WithDefaults

`func NewConversationsInviteErrorSchema1WithDefaults() *ConversationsInviteErrorSchema1`

NewConversationsInviteErrorSchema1WithDefaults instantiates a new ConversationsInviteErrorSchema1 object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCallstack

`func (o *ConversationsInviteErrorSchema1) GetCallstack() string`

GetCallstack returns the Callstack field if non-nil, zero value otherwise.

### GetCallstackOk

`func (o *ConversationsInviteErrorSchema1) GetCallstackOk() (*string, bool)`

GetCallstackOk returns a tuple with the Callstack field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCallstack

`func (o *ConversationsInviteErrorSchema1) SetCallstack(v string)`

SetCallstack sets Callstack field to given value.

### HasCallstack

`func (o *ConversationsInviteErrorSchema1) HasCallstack() bool`

HasCallstack returns a boolean if a field has been set.

### GetError

`func (o *ConversationsInviteErrorSchema1) GetError() string`

GetError returns the Error field if non-nil, zero value otherwise.

### GetErrorOk

`func (o *ConversationsInviteErrorSchema1) GetErrorOk() (*string, bool)`

GetErrorOk returns a tuple with the Error field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetError

`func (o *ConversationsInviteErrorSchema1) SetError(v string)`

SetError sets Error field to given value.

### HasError

`func (o *ConversationsInviteErrorSchema1) HasError() bool`

HasError returns a boolean if a field has been set.

### GetErrors

`func (o *ConversationsInviteErrorSchema1) GetErrors() []ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner`

GetErrors returns the Errors field if non-nil, zero value otherwise.

### GetErrorsOk

`func (o *ConversationsInviteErrorSchema1) GetErrorsOk() (*[]ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner, bool)`

GetErrorsOk returns a tuple with the Errors field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetErrors

`func (o *ConversationsInviteErrorSchema1) SetErrors(v []ErrorsIsReturnedWhenAnErrorAssociatesAnUserInner)`

SetErrors sets Errors field to given value.

### HasErrors

`func (o *ConversationsInviteErrorSchema1) HasErrors() bool`

HasErrors returns a boolean if a field has been set.

### GetNeeded

`func (o *ConversationsInviteErrorSchema1) GetNeeded() string`

GetNeeded returns the Needed field if non-nil, zero value otherwise.

### GetNeededOk

`func (o *ConversationsInviteErrorSchema1) GetNeededOk() (*string, bool)`

GetNeededOk returns a tuple with the Needed field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNeeded

`func (o *ConversationsInviteErrorSchema1) SetNeeded(v string)`

SetNeeded sets Needed field to given value.

### HasNeeded

`func (o *ConversationsInviteErrorSchema1) HasNeeded() bool`

HasNeeded returns a boolean if a field has been set.

### GetOk

`func (o *ConversationsInviteErrorSchema1) GetOk() DefsOkFalse`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *ConversationsInviteErrorSchema1) GetOkOk() (*DefsOkFalse, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *ConversationsInviteErrorSchema1) SetOk(v DefsOkFalse)`

SetOk sets Ok field to given value.


### GetProvided

`func (o *ConversationsInviteErrorSchema1) GetProvided() string`

GetProvided returns the Provided field if non-nil, zero value otherwise.

### GetProvidedOk

`func (o *ConversationsInviteErrorSchema1) GetProvidedOk() (*string, bool)`

GetProvidedOk returns a tuple with the Provided field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProvided

`func (o *ConversationsInviteErrorSchema1) SetProvided(v string)`

SetProvided sets Provided field to given value.

### HasProvided

`func (o *ConversationsInviteErrorSchema1) HasProvided() bool`

HasProvided returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


