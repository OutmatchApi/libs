/*
Slack Web API

One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.

API version: 1.7.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package slack

import (
	"encoding/json"
)

// RemindersInfoSchema Schema for successful response from reminders.info method
type RemindersInfoSchema struct {
	Ok DefsOkTrue `json:"ok"`
	Reminder ObjsReminder `json:"reminder"`
}

// NewRemindersInfoSchema instantiates a new RemindersInfoSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRemindersInfoSchema(ok DefsOkTrue, reminder ObjsReminder) *RemindersInfoSchema {
	this := RemindersInfoSchema{}
	this.Ok = ok
	this.Reminder = reminder
	return &this
}

// NewRemindersInfoSchemaWithDefaults instantiates a new RemindersInfoSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRemindersInfoSchemaWithDefaults() *RemindersInfoSchema {
	this := RemindersInfoSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *RemindersInfoSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *RemindersInfoSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *RemindersInfoSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetReminder returns the Reminder field value
func (o *RemindersInfoSchema) GetReminder() ObjsReminder {
	if o == nil {
		var ret ObjsReminder
		return ret
	}

	return o.Reminder
}

// GetReminderOk returns a tuple with the Reminder field value
// and a boolean to check if the value has been set.
func (o *RemindersInfoSchema) GetReminderOk() (*ObjsReminder, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Reminder, true
}

// SetReminder sets field value
func (o *RemindersInfoSchema) SetReminder(v ObjsReminder) {
	o.Reminder = v
}

func (o RemindersInfoSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["reminder"] = o.Reminder
	}
	return json.Marshal(toSerialize)
}

type NullableRemindersInfoSchema struct {
	value *RemindersInfoSchema
	isSet bool
}

func (v NullableRemindersInfoSchema) Get() *RemindersInfoSchema {
	return v.value
}

func (v *NullableRemindersInfoSchema) Set(val *RemindersInfoSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableRemindersInfoSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableRemindersInfoSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRemindersInfoSchema(val *RemindersInfoSchema) *NullableRemindersInfoSchema {
	return &NullableRemindersInfoSchema{value: val, isSet: true}
}

func (v NullableRemindersInfoSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRemindersInfoSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


