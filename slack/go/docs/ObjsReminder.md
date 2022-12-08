# ObjsReminder

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompleteTs** | Pointer to **int32** |  | [optional] 
**Creator** | **string** |  | 
**Id** | **string** |  | 
**Recurring** | **bool** |  | 
**Text** | **string** |  | 
**Time** | Pointer to **int32** |  | [optional] 
**User** | **string** |  | 

## Methods

### NewObjsReminder

`func NewObjsReminder(creator string, id string, recurring bool, text string, user string, ) *ObjsReminder`

NewObjsReminder instantiates a new ObjsReminder object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsReminderWithDefaults

`func NewObjsReminderWithDefaults() *ObjsReminder`

NewObjsReminderWithDefaults instantiates a new ObjsReminder object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCompleteTs

`func (o *ObjsReminder) GetCompleteTs() int32`

GetCompleteTs returns the CompleteTs field if non-nil, zero value otherwise.

### GetCompleteTsOk

`func (o *ObjsReminder) GetCompleteTsOk() (*int32, bool)`

GetCompleteTsOk returns a tuple with the CompleteTs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCompleteTs

`func (o *ObjsReminder) SetCompleteTs(v int32)`

SetCompleteTs sets CompleteTs field to given value.

### HasCompleteTs

`func (o *ObjsReminder) HasCompleteTs() bool`

HasCompleteTs returns a boolean if a field has been set.

### GetCreator

`func (o *ObjsReminder) GetCreator() string`

GetCreator returns the Creator field if non-nil, zero value otherwise.

### GetCreatorOk

`func (o *ObjsReminder) GetCreatorOk() (*string, bool)`

GetCreatorOk returns a tuple with the Creator field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreator

`func (o *ObjsReminder) SetCreator(v string)`

SetCreator sets Creator field to given value.


### GetId

`func (o *ObjsReminder) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ObjsReminder) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ObjsReminder) SetId(v string)`

SetId sets Id field to given value.


### GetRecurring

`func (o *ObjsReminder) GetRecurring() bool`

GetRecurring returns the Recurring field if non-nil, zero value otherwise.

### GetRecurringOk

`func (o *ObjsReminder) GetRecurringOk() (*bool, bool)`

GetRecurringOk returns a tuple with the Recurring field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecurring

`func (o *ObjsReminder) SetRecurring(v bool)`

SetRecurring sets Recurring field to given value.


### GetText

`func (o *ObjsReminder) GetText() string`

GetText returns the Text field if non-nil, zero value otherwise.

### GetTextOk

`func (o *ObjsReminder) GetTextOk() (*string, bool)`

GetTextOk returns a tuple with the Text field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetText

`func (o *ObjsReminder) SetText(v string)`

SetText sets Text field to given value.


### GetTime

`func (o *ObjsReminder) GetTime() int32`

GetTime returns the Time field if non-nil, zero value otherwise.

### GetTimeOk

`func (o *ObjsReminder) GetTimeOk() (*int32, bool)`

GetTimeOk returns a tuple with the Time field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTime

`func (o *ObjsReminder) SetTime(v int32)`

SetTime sets Time field to given value.

### HasTime

`func (o *ObjsReminder) HasTime() bool`

HasTime returns a boolean if a field has been set.

### GetUser

`func (o *ObjsReminder) GetUser() string`

GetUser returns the User field if non-nil, zero value otherwise.

### GetUserOk

`func (o *ObjsReminder) GetUserOk() (*string, bool)`

GetUserOk returns a tuple with the User field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUser

`func (o *ObjsReminder) SetUser(v string)`

SetUser sets User field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


