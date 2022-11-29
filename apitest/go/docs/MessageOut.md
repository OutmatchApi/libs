# MessageOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventType** | **string** |  | 
**EventId** | Pointer to **NullableString** | Optional unique identifier for the message | [optional] 
**Channels** | Pointer to **[]string** | List of free-form identifiers that endpoints can filter by | [optional] 
**Payload** | **map[string]interface{}** |  | 
**Id** | **string** |  | 
**Timestamp** | **time.Time** |  | 

## Methods

### NewMessageOut

`func NewMessageOut(eventType string, payload map[string]interface{}, id string, timestamp time.Time, ) *MessageOut`

NewMessageOut instantiates a new MessageOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageOutWithDefaults

`func NewMessageOutWithDefaults() *MessageOut`

NewMessageOutWithDefaults instantiates a new MessageOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventType

`func (o *MessageOut) GetEventType() string`

GetEventType returns the EventType field if non-nil, zero value otherwise.

### GetEventTypeOk

`func (o *MessageOut) GetEventTypeOk() (*string, bool)`

GetEventTypeOk returns a tuple with the EventType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventType

`func (o *MessageOut) SetEventType(v string)`

SetEventType sets EventType field to given value.


### GetEventId

`func (o *MessageOut) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *MessageOut) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *MessageOut) SetEventId(v string)`

SetEventId sets EventId field to given value.

### HasEventId

`func (o *MessageOut) HasEventId() bool`

HasEventId returns a boolean if a field has been set.

### SetEventIdNil

`func (o *MessageOut) SetEventIdNil(b bool)`

 SetEventIdNil sets the value for EventId to be an explicit nil

### UnsetEventId
`func (o *MessageOut) UnsetEventId()`

UnsetEventId ensures that no value is present for EventId, not even an explicit nil
### GetChannels

`func (o *MessageOut) GetChannels() []string`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *MessageOut) GetChannelsOk() (*[]string, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *MessageOut) SetChannels(v []string)`

SetChannels sets Channels field to given value.

### HasChannels

`func (o *MessageOut) HasChannels() bool`

HasChannels returns a boolean if a field has been set.

### SetChannelsNil

`func (o *MessageOut) SetChannelsNil(b bool)`

 SetChannelsNil sets the value for Channels to be an explicit nil

### UnsetChannels
`func (o *MessageOut) UnsetChannels()`

UnsetChannels ensures that no value is present for Channels, not even an explicit nil
### GetPayload

`func (o *MessageOut) GetPayload() map[string]interface{}`

GetPayload returns the Payload field if non-nil, zero value otherwise.

### GetPayloadOk

`func (o *MessageOut) GetPayloadOk() (*map[string]interface{}, bool)`

GetPayloadOk returns a tuple with the Payload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayload

`func (o *MessageOut) SetPayload(v map[string]interface{})`

SetPayload sets Payload field to given value.


### GetId

`func (o *MessageOut) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MessageOut) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MessageOut) SetId(v string)`

SetId sets Id field to given value.


### GetTimestamp

`func (o *MessageOut) GetTimestamp() time.Time`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *MessageOut) GetTimestampOk() (*time.Time, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *MessageOut) SetTimestamp(v time.Time)`

SetTimestamp sets Timestamp field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


