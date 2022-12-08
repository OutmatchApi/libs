# MessagePin

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Channel** | Pointer to **string** |  | [optional] 
**Created** | Pointer to **int32** |  | [optional] 
**CreatedBy** | Pointer to **string** |  | [optional] 
**Message** | Pointer to [**ObjsMessage**](ObjsMessage.md) |  | [optional] 
**Type** | Pointer to **string** |  | [optional] 

## Methods

### NewMessagePin

`func NewMessagePin() *MessagePin`

NewMessagePin instantiates a new MessagePin object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessagePinWithDefaults

`func NewMessagePinWithDefaults() *MessagePin`

NewMessagePinWithDefaults instantiates a new MessagePin object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChannel

`func (o *MessagePin) GetChannel() string`

GetChannel returns the Channel field if non-nil, zero value otherwise.

### GetChannelOk

`func (o *MessagePin) GetChannelOk() (*string, bool)`

GetChannelOk returns a tuple with the Channel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannel

`func (o *MessagePin) SetChannel(v string)`

SetChannel sets Channel field to given value.

### HasChannel

`func (o *MessagePin) HasChannel() bool`

HasChannel returns a boolean if a field has been set.

### GetCreated

`func (o *MessagePin) GetCreated() int32`

GetCreated returns the Created field if non-nil, zero value otherwise.

### GetCreatedOk

`func (o *MessagePin) GetCreatedOk() (*int32, bool)`

GetCreatedOk returns a tuple with the Created field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreated

`func (o *MessagePin) SetCreated(v int32)`

SetCreated sets Created field to given value.

### HasCreated

`func (o *MessagePin) HasCreated() bool`

HasCreated returns a boolean if a field has been set.

### GetCreatedBy

`func (o *MessagePin) GetCreatedBy() string`

GetCreatedBy returns the CreatedBy field if non-nil, zero value otherwise.

### GetCreatedByOk

`func (o *MessagePin) GetCreatedByOk() (*string, bool)`

GetCreatedByOk returns a tuple with the CreatedBy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedBy

`func (o *MessagePin) SetCreatedBy(v string)`

SetCreatedBy sets CreatedBy field to given value.

### HasCreatedBy

`func (o *MessagePin) HasCreatedBy() bool`

HasCreatedBy returns a boolean if a field has been set.

### GetMessage

`func (o *MessagePin) GetMessage() ObjsMessage`

GetMessage returns the Message field if non-nil, zero value otherwise.

### GetMessageOk

`func (o *MessagePin) GetMessageOk() (*ObjsMessage, bool)`

GetMessageOk returns a tuple with the Message field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMessage

`func (o *MessagePin) SetMessage(v ObjsMessage)`

SetMessage sets Message field to given value.

### HasMessage

`func (o *MessagePin) HasMessage() bool`

HasMessage returns a boolean if a field has been set.

### GetType

`func (o *MessagePin) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessagePin) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessagePin) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *MessagePin) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


