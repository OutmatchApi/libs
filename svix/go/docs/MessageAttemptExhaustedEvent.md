# MessageAttemptExhaustedEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** |  | [optional] [default to "message.attempt.exhausted"]
**Data** | [**MessageAttemptExhaustedEventData**](MessageAttemptExhaustedEventData.md) |  | 

## Methods

### NewMessageAttemptExhaustedEvent

`func NewMessageAttemptExhaustedEvent(data MessageAttemptExhaustedEventData, ) *MessageAttemptExhaustedEvent`

NewMessageAttemptExhaustedEvent instantiates a new MessageAttemptExhaustedEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAttemptExhaustedEventWithDefaults

`func NewMessageAttemptExhaustedEventWithDefaults() *MessageAttemptExhaustedEvent`

NewMessageAttemptExhaustedEventWithDefaults instantiates a new MessageAttemptExhaustedEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *MessageAttemptExhaustedEvent) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageAttemptExhaustedEvent) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageAttemptExhaustedEvent) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *MessageAttemptExhaustedEvent) HasType() bool`

HasType returns a boolean if a field has been set.

### GetData

`func (o *MessageAttemptExhaustedEvent) GetData() MessageAttemptExhaustedEventData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *MessageAttemptExhaustedEvent) GetDataOk() (*MessageAttemptExhaustedEventData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *MessageAttemptExhaustedEvent) SetData(v MessageAttemptExhaustedEventData)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


