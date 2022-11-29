# MessageAttemptFailingEventData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AppId** | **string** |  | 
**AppUid** | Pointer to **NullableString** | Optional unique identifier for the application | [optional] 
**MsgId** | **string** |  | 
**MsgEventId** | Pointer to **NullableString** | Optional unique identifier for the message | [optional] 
**EndpointId** | **string** |  | 
**LastAttempt** | [**MessageAttemptFailedData**](MessageAttemptFailedData.md) |  | 

## Methods

### NewMessageAttemptFailingEventData

`func NewMessageAttemptFailingEventData(appId string, msgId string, endpointId string, lastAttempt MessageAttemptFailedData, ) *MessageAttemptFailingEventData`

NewMessageAttemptFailingEventData instantiates a new MessageAttemptFailingEventData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAttemptFailingEventDataWithDefaults

`func NewMessageAttemptFailingEventDataWithDefaults() *MessageAttemptFailingEventData`

NewMessageAttemptFailingEventDataWithDefaults instantiates a new MessageAttemptFailingEventData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAppId

`func (o *MessageAttemptFailingEventData) GetAppId() string`

GetAppId returns the AppId field if non-nil, zero value otherwise.

### GetAppIdOk

`func (o *MessageAttemptFailingEventData) GetAppIdOk() (*string, bool)`

GetAppIdOk returns a tuple with the AppId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppId

`func (o *MessageAttemptFailingEventData) SetAppId(v string)`

SetAppId sets AppId field to given value.


### GetAppUid

`func (o *MessageAttemptFailingEventData) GetAppUid() string`

GetAppUid returns the AppUid field if non-nil, zero value otherwise.

### GetAppUidOk

`func (o *MessageAttemptFailingEventData) GetAppUidOk() (*string, bool)`

GetAppUidOk returns a tuple with the AppUid field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAppUid

`func (o *MessageAttemptFailingEventData) SetAppUid(v string)`

SetAppUid sets AppUid field to given value.

### HasAppUid

`func (o *MessageAttemptFailingEventData) HasAppUid() bool`

HasAppUid returns a boolean if a field has been set.

### SetAppUidNil

`func (o *MessageAttemptFailingEventData) SetAppUidNil(b bool)`

 SetAppUidNil sets the value for AppUid to be an explicit nil

### UnsetAppUid
`func (o *MessageAttemptFailingEventData) UnsetAppUid()`

UnsetAppUid ensures that no value is present for AppUid, not even an explicit nil
### GetMsgId

`func (o *MessageAttemptFailingEventData) GetMsgId() string`

GetMsgId returns the MsgId field if non-nil, zero value otherwise.

### GetMsgIdOk

`func (o *MessageAttemptFailingEventData) GetMsgIdOk() (*string, bool)`

GetMsgIdOk returns a tuple with the MsgId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsgId

`func (o *MessageAttemptFailingEventData) SetMsgId(v string)`

SetMsgId sets MsgId field to given value.


### GetMsgEventId

`func (o *MessageAttemptFailingEventData) GetMsgEventId() string`

GetMsgEventId returns the MsgEventId field if non-nil, zero value otherwise.

### GetMsgEventIdOk

`func (o *MessageAttemptFailingEventData) GetMsgEventIdOk() (*string, bool)`

GetMsgEventIdOk returns a tuple with the MsgEventId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMsgEventId

`func (o *MessageAttemptFailingEventData) SetMsgEventId(v string)`

SetMsgEventId sets MsgEventId field to given value.

### HasMsgEventId

`func (o *MessageAttemptFailingEventData) HasMsgEventId() bool`

HasMsgEventId returns a boolean if a field has been set.

### SetMsgEventIdNil

`func (o *MessageAttemptFailingEventData) SetMsgEventIdNil(b bool)`

 SetMsgEventIdNil sets the value for MsgEventId to be an explicit nil

### UnsetMsgEventId
`func (o *MessageAttemptFailingEventData) UnsetMsgEventId()`

UnsetMsgEventId ensures that no value is present for MsgEventId, not even an explicit nil
### GetEndpointId

`func (o *MessageAttemptFailingEventData) GetEndpointId() string`

GetEndpointId returns the EndpointId field if non-nil, zero value otherwise.

### GetEndpointIdOk

`func (o *MessageAttemptFailingEventData) GetEndpointIdOk() (*string, bool)`

GetEndpointIdOk returns a tuple with the EndpointId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEndpointId

`func (o *MessageAttemptFailingEventData) SetEndpointId(v string)`

SetEndpointId sets EndpointId field to given value.


### GetLastAttempt

`func (o *MessageAttemptFailingEventData) GetLastAttempt() MessageAttemptFailedData`

GetLastAttempt returns the LastAttempt field if non-nil, zero value otherwise.

### GetLastAttemptOk

`func (o *MessageAttemptFailingEventData) GetLastAttemptOk() (*MessageAttemptFailedData, bool)`

GetLastAttemptOk returns a tuple with the LastAttempt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastAttempt

`func (o *MessageAttemptFailingEventData) SetLastAttempt(v MessageAttemptFailedData)`

SetLastAttempt sets LastAttempt field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


