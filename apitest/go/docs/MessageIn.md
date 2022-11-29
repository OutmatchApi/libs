# MessageIn

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventType** | **string** |  | 
**EventId** | Pointer to **NullableString** | Optional unique identifier for the message | [optional] 
**Channels** | Pointer to **[]string** | List of free-form identifiers that endpoints can filter by | [optional] 
**Payload** | **map[string]interface{}** |  | 
**PayloadRetentionPeriod** | Pointer to **int32** | The retention period for the payload (in days). | [optional] [default to 90]

## Methods

### NewMessageIn

`func NewMessageIn(eventType string, payload map[string]interface{}, ) *MessageIn`

NewMessageIn instantiates a new MessageIn object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageInWithDefaults

`func NewMessageInWithDefaults() *MessageIn`

NewMessageInWithDefaults instantiates a new MessageIn object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventType

`func (o *MessageIn) GetEventType() string`

GetEventType returns the EventType field if non-nil, zero value otherwise.

### GetEventTypeOk

`func (o *MessageIn) GetEventTypeOk() (*string, bool)`

GetEventTypeOk returns a tuple with the EventType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventType

`func (o *MessageIn) SetEventType(v string)`

SetEventType sets EventType field to given value.


### GetEventId

`func (o *MessageIn) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *MessageIn) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *MessageIn) SetEventId(v string)`

SetEventId sets EventId field to given value.

### HasEventId

`func (o *MessageIn) HasEventId() bool`

HasEventId returns a boolean if a field has been set.

### SetEventIdNil

`func (o *MessageIn) SetEventIdNil(b bool)`

 SetEventIdNil sets the value for EventId to be an explicit nil

### UnsetEventId
`func (o *MessageIn) UnsetEventId()`

UnsetEventId ensures that no value is present for EventId, not even an explicit nil
### GetChannels

`func (o *MessageIn) GetChannels() []string`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *MessageIn) GetChannelsOk() (*[]string, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *MessageIn) SetChannels(v []string)`

SetChannels sets Channels field to given value.

### HasChannels

`func (o *MessageIn) HasChannels() bool`

HasChannels returns a boolean if a field has been set.

### SetChannelsNil

`func (o *MessageIn) SetChannelsNil(b bool)`

 SetChannelsNil sets the value for Channels to be an explicit nil

### UnsetChannels
`func (o *MessageIn) UnsetChannels()`

UnsetChannels ensures that no value is present for Channels, not even an explicit nil
### GetPayload

`func (o *MessageIn) GetPayload() map[string]interface{}`

GetPayload returns the Payload field if non-nil, zero value otherwise.

### GetPayloadOk

`func (o *MessageIn) GetPayloadOk() (*map[string]interface{}, bool)`

GetPayloadOk returns a tuple with the Payload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayload

`func (o *MessageIn) SetPayload(v map[string]interface{})`

SetPayload sets Payload field to given value.


### GetPayloadRetentionPeriod

`func (o *MessageIn) GetPayloadRetentionPeriod() int32`

GetPayloadRetentionPeriod returns the PayloadRetentionPeriod field if non-nil, zero value otherwise.

### GetPayloadRetentionPeriodOk

`func (o *MessageIn) GetPayloadRetentionPeriodOk() (*int32, bool)`

GetPayloadRetentionPeriodOk returns a tuple with the PayloadRetentionPeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayloadRetentionPeriod

`func (o *MessageIn) SetPayloadRetentionPeriod(v int32)`

SetPayloadRetentionPeriod sets PayloadRetentionPeriod field to given value.

### HasPayloadRetentionPeriod

`func (o *MessageIn) HasPayloadRetentionPeriod() bool`

HasPayloadRetentionPeriod returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


