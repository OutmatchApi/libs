# MessageAttemptFailedData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** |  | 
**ResponseStatusCode** | **int32** |  | 
**Timestamp** | **time.Time** |  | 

## Methods

### NewMessageAttemptFailedData

`func NewMessageAttemptFailedData(id string, responseStatusCode int32, timestamp time.Time, ) *MessageAttemptFailedData`

NewMessageAttemptFailedData instantiates a new MessageAttemptFailedData object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMessageAttemptFailedDataWithDefaults

`func NewMessageAttemptFailedDataWithDefaults() *MessageAttemptFailedData`

NewMessageAttemptFailedDataWithDefaults instantiates a new MessageAttemptFailedData object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MessageAttemptFailedData) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MessageAttemptFailedData) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MessageAttemptFailedData) SetId(v string)`

SetId sets Id field to given value.


### GetResponseStatusCode

`func (o *MessageAttemptFailedData) GetResponseStatusCode() int32`

GetResponseStatusCode returns the ResponseStatusCode field if non-nil, zero value otherwise.

### GetResponseStatusCodeOk

`func (o *MessageAttemptFailedData) GetResponseStatusCodeOk() (*int32, bool)`

GetResponseStatusCodeOk returns a tuple with the ResponseStatusCode field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResponseStatusCode

`func (o *MessageAttemptFailedData) SetResponseStatusCode(v int32)`

SetResponseStatusCode sets ResponseStatusCode field to given value.


### GetTimestamp

`func (o *MessageAttemptFailedData) GetTimestamp() time.Time`

GetTimestamp returns the Timestamp field if non-nil, zero value otherwise.

### GetTimestampOk

`func (o *MessageAttemptFailedData) GetTimestampOk() (*time.Time, bool)`

GetTimestampOk returns a tuple with the Timestamp field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTimestamp

`func (o *MessageAttemptFailedData) SetTimestamp(v time.Time)`

SetTimestamp sets Timestamp field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


