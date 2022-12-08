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

// DndInfoSchema Schema for successful response from dnd.info method
type DndInfoSchema struct {
	DndEnabled bool `json:"dnd_enabled"`
	NextDndEndTs int32 `json:"next_dnd_end_ts"`
	NextDndStartTs int32 `json:"next_dnd_start_ts"`
	Ok DefsOkTrue `json:"ok"`
	SnoozeEnabled *bool `json:"snooze_enabled,omitempty"`
	SnoozeEndtime *int32 `json:"snooze_endtime,omitempty"`
	SnoozeRemaining *int32 `json:"snooze_remaining,omitempty"`
}

// NewDndInfoSchema instantiates a new DndInfoSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewDndInfoSchema(dndEnabled bool, nextDndEndTs int32, nextDndStartTs int32, ok DefsOkTrue) *DndInfoSchema {
	this := DndInfoSchema{}
	this.DndEnabled = dndEnabled
	this.NextDndEndTs = nextDndEndTs
	this.NextDndStartTs = nextDndStartTs
	this.Ok = ok
	return &this
}

// NewDndInfoSchemaWithDefaults instantiates a new DndInfoSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewDndInfoSchemaWithDefaults() *DndInfoSchema {
	this := DndInfoSchema{}
	return &this
}

// GetDndEnabled returns the DndEnabled field value
func (o *DndInfoSchema) GetDndEnabled() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.DndEnabled
}

// GetDndEnabledOk returns a tuple with the DndEnabled field value
// and a boolean to check if the value has been set.
func (o *DndInfoSchema) GetDndEnabledOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.DndEnabled, true
}

// SetDndEnabled sets field value
func (o *DndInfoSchema) SetDndEnabled(v bool) {
	o.DndEnabled = v
}

// GetNextDndEndTs returns the NextDndEndTs field value
func (o *DndInfoSchema) GetNextDndEndTs() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.NextDndEndTs
}

// GetNextDndEndTsOk returns a tuple with the NextDndEndTs field value
// and a boolean to check if the value has been set.
func (o *DndInfoSchema) GetNextDndEndTsOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.NextDndEndTs, true
}

// SetNextDndEndTs sets field value
func (o *DndInfoSchema) SetNextDndEndTs(v int32) {
	o.NextDndEndTs = v
}

// GetNextDndStartTs returns the NextDndStartTs field value
func (o *DndInfoSchema) GetNextDndStartTs() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.NextDndStartTs
}

// GetNextDndStartTsOk returns a tuple with the NextDndStartTs field value
// and a boolean to check if the value has been set.
func (o *DndInfoSchema) GetNextDndStartTsOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.NextDndStartTs, true
}

// SetNextDndStartTs sets field value
func (o *DndInfoSchema) SetNextDndStartTs(v int32) {
	o.NextDndStartTs = v
}

// GetOk returns the Ok field value
func (o *DndInfoSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *DndInfoSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *DndInfoSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetSnoozeEnabled returns the SnoozeEnabled field value if set, zero value otherwise.
func (o *DndInfoSchema) GetSnoozeEnabled() bool {
	if o == nil || isNil(o.SnoozeEnabled) {
		var ret bool
		return ret
	}
	return *o.SnoozeEnabled
}

// GetSnoozeEnabledOk returns a tuple with the SnoozeEnabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DndInfoSchema) GetSnoozeEnabledOk() (*bool, bool) {
	if o == nil || isNil(o.SnoozeEnabled) {
    return nil, false
	}
	return o.SnoozeEnabled, true
}

// HasSnoozeEnabled returns a boolean if a field has been set.
func (o *DndInfoSchema) HasSnoozeEnabled() bool {
	if o != nil && !isNil(o.SnoozeEnabled) {
		return true
	}

	return false
}

// SetSnoozeEnabled gets a reference to the given bool and assigns it to the SnoozeEnabled field.
func (o *DndInfoSchema) SetSnoozeEnabled(v bool) {
	o.SnoozeEnabled = &v
}

// GetSnoozeEndtime returns the SnoozeEndtime field value if set, zero value otherwise.
func (o *DndInfoSchema) GetSnoozeEndtime() int32 {
	if o == nil || isNil(o.SnoozeEndtime) {
		var ret int32
		return ret
	}
	return *o.SnoozeEndtime
}

// GetSnoozeEndtimeOk returns a tuple with the SnoozeEndtime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DndInfoSchema) GetSnoozeEndtimeOk() (*int32, bool) {
	if o == nil || isNil(o.SnoozeEndtime) {
    return nil, false
	}
	return o.SnoozeEndtime, true
}

// HasSnoozeEndtime returns a boolean if a field has been set.
func (o *DndInfoSchema) HasSnoozeEndtime() bool {
	if o != nil && !isNil(o.SnoozeEndtime) {
		return true
	}

	return false
}

// SetSnoozeEndtime gets a reference to the given int32 and assigns it to the SnoozeEndtime field.
func (o *DndInfoSchema) SetSnoozeEndtime(v int32) {
	o.SnoozeEndtime = &v
}

// GetSnoozeRemaining returns the SnoozeRemaining field value if set, zero value otherwise.
func (o *DndInfoSchema) GetSnoozeRemaining() int32 {
	if o == nil || isNil(o.SnoozeRemaining) {
		var ret int32
		return ret
	}
	return *o.SnoozeRemaining
}

// GetSnoozeRemainingOk returns a tuple with the SnoozeRemaining field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *DndInfoSchema) GetSnoozeRemainingOk() (*int32, bool) {
	if o == nil || isNil(o.SnoozeRemaining) {
    return nil, false
	}
	return o.SnoozeRemaining, true
}

// HasSnoozeRemaining returns a boolean if a field has been set.
func (o *DndInfoSchema) HasSnoozeRemaining() bool {
	if o != nil && !isNil(o.SnoozeRemaining) {
		return true
	}

	return false
}

// SetSnoozeRemaining gets a reference to the given int32 and assigns it to the SnoozeRemaining field.
func (o *DndInfoSchema) SetSnoozeRemaining(v int32) {
	o.SnoozeRemaining = &v
}

func (o DndInfoSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["dnd_enabled"] = o.DndEnabled
	}
	if true {
		toSerialize["next_dnd_end_ts"] = o.NextDndEndTs
	}
	if true {
		toSerialize["next_dnd_start_ts"] = o.NextDndStartTs
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if !isNil(o.SnoozeEnabled) {
		toSerialize["snooze_enabled"] = o.SnoozeEnabled
	}
	if !isNil(o.SnoozeEndtime) {
		toSerialize["snooze_endtime"] = o.SnoozeEndtime
	}
	if !isNil(o.SnoozeRemaining) {
		toSerialize["snooze_remaining"] = o.SnoozeRemaining
	}
	return json.Marshal(toSerialize)
}

type NullableDndInfoSchema struct {
	value *DndInfoSchema
	isSet bool
}

func (v NullableDndInfoSchema) Get() *DndInfoSchema {
	return v.value
}

func (v *NullableDndInfoSchema) Set(val *DndInfoSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableDndInfoSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableDndInfoSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableDndInfoSchema(val *DndInfoSchema) *NullableDndInfoSchema {
	return &NullableDndInfoSchema{value: val, isSet: true}
}

func (v NullableDndInfoSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableDndInfoSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


