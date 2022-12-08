# RemindersListSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Reminders** | [**[]ObjsReminder**](ObjsReminder.md) |  | 

## Methods

### NewRemindersListSchema

`func NewRemindersListSchema(ok DefsOkTrue, reminders []ObjsReminder, ) *RemindersListSchema`

NewRemindersListSchema instantiates a new RemindersListSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewRemindersListSchemaWithDefaults

`func NewRemindersListSchemaWithDefaults() *RemindersListSchema`

NewRemindersListSchemaWithDefaults instantiates a new RemindersListSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOk

`func (o *RemindersListSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *RemindersListSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *RemindersListSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetReminders

`func (o *RemindersListSchema) GetReminders() []ObjsReminder`

GetReminders returns the Reminders field if non-nil, zero value otherwise.

### GetRemindersOk

`func (o *RemindersListSchema) GetRemindersOk() (*[]ObjsReminder, bool)`

GetRemindersOk returns a tuple with the Reminders field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReminders

`func (o *RemindersListSchema) SetReminders(v []ObjsReminder)`

SetReminders sets Reminders field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


