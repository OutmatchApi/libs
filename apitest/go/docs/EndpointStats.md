# EndpointStats

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Sending** | **int32** |  | 
**Success** | **int32** |  | 
**Pending** | **int32** |  | 
**Fail** | **int32** |  | 

## Methods

### NewEndpointStats

`func NewEndpointStats(sending int32, success int32, pending int32, fail int32, ) *EndpointStats`

NewEndpointStats instantiates a new EndpointStats object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEndpointStatsWithDefaults

`func NewEndpointStatsWithDefaults() *EndpointStats`

NewEndpointStatsWithDefaults instantiates a new EndpointStats object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSending

`func (o *EndpointStats) GetSending() int32`

GetSending returns the Sending field if non-nil, zero value otherwise.

### GetSendingOk

`func (o *EndpointStats) GetSendingOk() (*int32, bool)`

GetSendingOk returns a tuple with the Sending field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSending

`func (o *EndpointStats) SetSending(v int32)`

SetSending sets Sending field to given value.


### GetSuccess

`func (o *EndpointStats) GetSuccess() int32`

GetSuccess returns the Success field if non-nil, zero value otherwise.

### GetSuccessOk

`func (o *EndpointStats) GetSuccessOk() (*int32, bool)`

GetSuccessOk returns a tuple with the Success field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSuccess

`func (o *EndpointStats) SetSuccess(v int32)`

SetSuccess sets Success field to given value.


### GetPending

`func (o *EndpointStats) GetPending() int32`

GetPending returns the Pending field if non-nil, zero value otherwise.

### GetPendingOk

`func (o *EndpointStats) GetPendingOk() (*int32, bool)`

GetPendingOk returns a tuple with the Pending field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPending

`func (o *EndpointStats) SetPending(v int32)`

SetPending sets Pending field to given value.


### GetFail

`func (o *EndpointStats) GetFail() int32`

GetFail returns the Fail field if non-nil, zero value otherwise.

### GetFailOk

`func (o *EndpointStats) GetFailOk() (*int32, bool)`

GetFailOk returns a tuple with the Fail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFail

`func (o *EndpointStats) SetFail(v int32)`

SetFail sets Fail field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


