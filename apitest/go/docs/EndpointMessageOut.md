# EndpointMessageOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EventType** | **string** |  | 
**EventId** | Pointer to **NullableString** | Optional unique identifier for the message | [optional] 
**Channels** | Pointer to **[]string** | List of free-form identifiers that endpoints can filter by | [optional] 
**Payload** | **map[string]interface{}** |  | 
**Id** | **string** |  | 
**Timestamp** | **time.Time** |  | 
**Status** | [**MessageStatus**](MessageStatus.md) |  | 
**NextAttempt** | Pointer to **NullableTime** |  | [optional] 

## Methods

### NewEndpointMessageOut

`func NewEndpointMessageOut(eventType string, payload map[string]interface{}, id string, timestamp time.Time, status MessageStatus, ) *EndpointMessageOut`

NewEndpointMessageOut instantiates a new EndpointMessageOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointMessageOutWithDefaults

`func NewEndpointMessageOutWithDefaults() *EndpointMessageOut`

NewEndpointMessageOutWithDefaults instantiates a new EndpointMessageOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEventType

`func (o *EndpointMessageOut) GetEventType() string`

GetEventType returns the EventType field if non-nil, zero value otherwise.

### GetEventTypeOk

`func (o *EndpointMessageOut) GetEventTypeOk() (*string, bool)`

GetEventTypeOk returns a tuple with the EventType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventType

`func (o *EndpointMessageOut) SetEventType(v string)`

SetEventType sets EventType field to given value.


### GetEventId

`func (o *EndpointMessageOut) GetEventId() string`

GetEventId returns the EventId field if non-nil, zero value otherwise.

### GetEventIdOk

`func (o *EndpointMessageOut) GetEventIdOk() (*string, bool)`

GetEventIdOk returns a tuple with the EventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEventId

`func (o *EndpointMessageOut) SetEventId(v string)`

SetEventId sets EventId field to given value.

### HasEventId

`func (o *EndpointMessageOut) HasEventId() bool`

HasEventId returns a boolean if a field has been set.

### SetEventIdNil

`func (o *EndpointMessageOut) SetEventIdNil(b bool)`

 SetEventIdNil sets the value for EventId to be an explicit nil

### UnsetEventId
`func (o *EndpointMessageOut) UnsetEventId()`

UnsetEventId ensures that no value is present for EventId, not even an explicit nil
### GetChannels

`func (o *EndpointMessageOut) GetChannels() []string`

GetChannels returns the Channels field if non-nil, zero value otherwise.

### GetChannelsOk

`func (o *EndpointMessageOut) GetChannelsOk() (*[]string, bool)`

GetChannelsOk returns a tuple with the Channels field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChannels

`func (o *EndpointMessageOut) SetChannels(v []string)`

SetChannels sets Channels field to given value.

### HasChannels

`func (o *EndpointMessageOut) HasChannels() bool`

HasChannels returns a boolean if a field has been set.

### SetChannelsNil

`func (o *EndpointMessageOut) SetChannelsNil(b bool)`

 SetChannelsNil sets the value for Channels to be an explicit nil

### UnsetChannels
`func (o *EndpointMessageOut) UnsetChannels()`

UnsetChannels ensures that no value is present for Channels, not even an explicit nil
### GetPayload

`func (o *EndpointMessageOut) GetPayload() map[string]interface{}`

GetPayload returns the Payload field if non-nil, zero value otherwise.

### GetPayloadOk

`func (o *EndpointMessageOut) GetPayloadOk() (*map[string]interface{}, bool)`

GetPayloadOk returns a tuple with the Payload field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPayload

`func (o *EndpointMessageOut) SetPayload(v map[string]interface{})`

SetPayload sets Payload field to given value.


### GetId

`func (o *EndpointMessageOut) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EndpointMessageOut) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EndpointMessageOut) SetId(v string)`

SetId sets Id field to given value.


### GetTimestamp

`func (o *EndpointMessageOut) GetTimestamp() time.Time`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *EndpointMessageOut) GetTimestampOk() (*time.Time, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *EndpointMessageOut) SetTimestamp(v time.Time)`

SetTimestamp sets Timestamp field to given value.


### GetStatus

`func (o *EndpointMessageOut) GetStatus() MessageStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *EndpointMessageOut) GetStatusOk() (*MessageStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *EndpointMessageOut) SetStatus(v MessageStatus)`

SetStatus sets Status field to given value.


### GetNextAttempt

`func (o *EndpointMessageOut) GetNextAttempt() time.Time`

GetNextAttempt returns the NextAttempt field if non-nil, zero value otherwise.

### GetNextAttemptOk

`func (o *EndpointMessageOut) GetNextAttemptOk() (*time.Time, bool)`

GetNextAttemptOk returns a tuple with the NextAttempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNextAttempt

`func (o *EndpointMessageOut) SetNextAttempt(v time.Time)`

SetNextAttempt sets NextAttempt field to given value.

### HasNextAttempt

`func (o *EndpointMessageOut) HasNextAttempt() bool`

HasNextAttempt returns a boolean if a field has been set.

### SetNextAttemptNil

`func (o *EndpointMessageOut) SetNextAttemptNil(b bool)`

 SetNextAttemptNil sets the value for NextAttempt to be an explicit nil

### UnsetNextAttempt
`func (o *EndpointMessageOut) UnsetNextAttempt()`

UnsetNextAttempt ensures that no value is present for NextAttempt, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


