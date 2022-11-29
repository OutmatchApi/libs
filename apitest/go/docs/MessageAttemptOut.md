# MessageAttemptOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**MsgId** | **string** |  | 
**EndpointId** | **string** |  | 
**Response** | **string** |  | 
**ResponseStatusCode** | **int32** |  | 
**Timestamp** | **time.Time** |  | 
**Status** | [**MessageStatus**](MessageStatus.md) |  | 
**TriggerType** | [**MessageAttemptTriggerType**](MessageAttemptTriggerType.md) |  | 

## Methods

### NewMessageAttemptOut

`func NewMessageAttemptOut(id string, msgId string, endpointId string, response string, responseStatusCode int32, timestamp time.Time, status MessageStatus, triggerType MessageAttemptTriggerType, ) *MessageAttemptOut`

NewMessageAttemptOut instantiates a new MessageAttemptOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAttemptOutWithDefaults

`func NewMessageAttemptOutWithDefaults() *MessageAttemptOut`

NewMessageAttemptOutWithDefaults instantiates a new MessageAttemptOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MessageAttemptOut) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MessageAttemptOut) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MessageAttemptOut) SetId(v string)`

SetId sets Id field to given value.


### GetMsgId

`func (o *MessageAttemptOut) GetMsgId() string`

GetMsgId returns the MsgId field if non-nil, zero value otherwise.

### GetMsgIdOk

`func (o *MessageAttemptOut) GetMsgIdOk() (*string, bool)`

GetMsgIdOk returns a tuple with the MsgId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsgId

`func (o *MessageAttemptOut) SetMsgId(v string)`

SetMsgId sets MsgId field to given value.


### GetEndpointId

`func (o *MessageAttemptOut) GetEndpointId() string`

GetEndpointId returns the EndpointId field if non-nil, zero value otherwise.

### GetEndpointIdOk

`func (o *MessageAttemptOut) GetEndpointIdOk() (*string, bool)`

GetEndpointIdOk returns a tuple with the EndpointId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpointId

`func (o *MessageAttemptOut) SetEndpointId(v string)`

SetEndpointId sets EndpointId field to given value.


### GetResponse

`func (o *MessageAttemptOut) GetResponse() string`

GetResponse returns the Response field if non-nil, zero value otherwise.

### GetResponseOk

`func (o *MessageAttemptOut) GetResponseOk() (*string, bool)`

GetResponseOk returns a tuple with the Response field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponse

`func (o *MessageAttemptOut) SetResponse(v string)`

SetResponse sets Response field to given value.


### GetResponseStatusCode

`func (o *MessageAttemptOut) GetResponseStatusCode() int32`

GetResponseStatusCode returns the ResponseStatusCode field if non-nil, zero value otherwise.

### GetResponseStatusCodeOk

`func (o *MessageAttemptOut) GetResponseStatusCodeOk() (*int32, bool)`

GetResponseStatusCodeOk returns a tuple with the ResponseStatusCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseStatusCode

`func (o *MessageAttemptOut) SetResponseStatusCode(v int32)`

SetResponseStatusCode sets ResponseStatusCode field to given value.


### GetTimestamp

`func (o *MessageAttemptOut) GetTimestamp() time.Time`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *MessageAttemptOut) GetTimestampOk() (*time.Time, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *MessageAttemptOut) SetTimestamp(v time.Time)`

SetTimestamp sets Timestamp field to given value.


### GetStatus

`func (o *MessageAttemptOut) GetStatus() MessageStatus`

GetStatus returns the Status field if non-nil, zero value otherwise.

### GetStatusOk

`func (o *MessageAttemptOut) GetStatusOk() (*MessageStatus, bool)`

GetStatusOk returns a tuple with the Status field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStatus

`func (o *MessageAttemptOut) SetStatus(v MessageStatus)`

SetStatus sets Status field to given value.


### GetTriggerType

`func (o *MessageAttemptOut) GetTriggerType() MessageAttemptTriggerType`

GetTriggerType returns the TriggerType field if non-nil, zero value otherwise.

### GetTriggerTypeOk

`func (o *MessageAttemptOut) GetTriggerTypeOk() (*MessageAttemptTriggerType, bool)`

GetTriggerTypeOk returns a tuple with the TriggerType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTriggerType

`func (o *MessageAttemptOut) SetTriggerType(v MessageAttemptTriggerType)`

SetTriggerType sets TriggerType field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


