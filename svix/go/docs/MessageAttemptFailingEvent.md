# MessageAttemptFailingEvent

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | Pointer to **string** |  | [optional] [default to "message.attempt.failing"]
**Data** | [**MessageAttemptFailingEventData**](MessageAttemptFailingEventData.md) |  | 

## Methods

### NewMessageAttemptFailingEvent

`func NewMessageAttemptFailingEvent(data MessageAttemptFailingEventData, ) *MessageAttemptFailingEvent`

NewMessageAttemptFailingEvent instantiates a new MessageAttemptFailingEvent object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAttemptFailingEventWithDefaults

`func NewMessageAttemptFailingEventWithDefaults() *MessageAttemptFailingEvent`

NewMessageAttemptFailingEventWithDefaults instantiates a new MessageAttemptFailingEvent object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetType

`func (o *MessageAttemptFailingEvent) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *MessageAttemptFailingEvent) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *MessageAttemptFailingEvent) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *MessageAttemptFailingEvent) HasType() bool`

HasType returns a boolean if a field has been set.

### GetData

`func (o *MessageAttemptFailingEvent) GetData() MessageAttemptFailingEventData`

GetData returns the Data field if non-nil, zero value otherwise.

### GetDataOk

`func (o *MessageAttemptFailingEvent) GetDataOk() (*MessageAttemptFailingEventData, bool)`

GetDataOk returns a tuple with the Data field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetData

`func (o *MessageAttemptFailingEvent) SetData(v MessageAttemptFailingEventData)`

SetData sets Data field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


