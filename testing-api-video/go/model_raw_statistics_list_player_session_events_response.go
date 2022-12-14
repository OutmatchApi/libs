/*
api.video

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package testing-api-video

import (
	"encoding/json"
)

// RawStatisticsListPlayerSessionEventsResponse struct for RawStatisticsListPlayerSessionEventsResponse
type RawStatisticsListPlayerSessionEventsResponse struct {
	Data []PlayerSessionEvent `json:"data,omitempty"`
	Pagination *Pagination `json:"pagination,omitempty"`
}

// NewRawStatisticsListPlayerSessionEventsResponse instantiates a new RawStatisticsListPlayerSessionEventsResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRawStatisticsListPlayerSessionEventsResponse() *RawStatisticsListPlayerSessionEventsResponse {
	this := RawStatisticsListPlayerSessionEventsResponse{}
	return &this
}

// NewRawStatisticsListPlayerSessionEventsResponseWithDefaults instantiates a new RawStatisticsListPlayerSessionEventsResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRawStatisticsListPlayerSessionEventsResponseWithDefaults() *RawStatisticsListPlayerSessionEventsResponse {
	this := RawStatisticsListPlayerSessionEventsResponse{}
	return &this
}

// GetData returns the Data field value if set, zero value otherwise.
func (o *RawStatisticsListPlayerSessionEventsResponse) GetData() []PlayerSessionEvent {
	if o == nil || isNil(o.Data) {
		var ret []PlayerSessionEvent
		return ret
	}
	return o.Data
}

// GetDataOk returns a tuple with the Data field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RawStatisticsListPlayerSessionEventsResponse) GetDataOk() ([]PlayerSessionEvent, bool) {
	if o == nil || isNil(o.Data) {
    return nil, false
	}
	return o.Data, true
}

// HasData returns a boolean if a field has been set.
func (o *RawStatisticsListPlayerSessionEventsResponse) HasData() bool {
	if o != nil && !isNil(o.Data) {
		return true
	}

	return false
}

// SetData gets a reference to the given []PlayerSessionEvent and assigns it to the Data field.
func (o *RawStatisticsListPlayerSessionEventsResponse) SetData(v []PlayerSessionEvent) {
	o.Data = v
}

// GetPagination returns the Pagination field value if set, zero value otherwise.
func (o *RawStatisticsListPlayerSessionEventsResponse) GetPagination() Pagination {
	if o == nil || isNil(o.Pagination) {
		var ret Pagination
		return ret
	}
	return *o.Pagination
}

// GetPaginationOk returns a tuple with the Pagination field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RawStatisticsListPlayerSessionEventsResponse) GetPaginationOk() (*Pagination, bool) {
	if o == nil || isNil(o.Pagination) {
    return nil, false
	}
	return o.Pagination, true
}

// HasPagination returns a boolean if a field has been set.
func (o *RawStatisticsListPlayerSessionEventsResponse) HasPagination() bool {
	if o != nil && !isNil(o.Pagination) {
		return true
	}

	return false
}

// SetPagination gets a reference to the given Pagination and assigns it to the Pagination field.
func (o *RawStatisticsListPlayerSessionEventsResponse) SetPagination(v Pagination) {
	o.Pagination = &v
}

func (o RawStatisticsListPlayerSessionEventsResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Data) {
		toSerialize["data"] = o.Data
	}
	if !isNil(o.Pagination) {
		toSerialize["pagination"] = o.Pagination
	}
	return json.Marshal(toSerialize)
}

type NullableRawStatisticsListPlayerSessionEventsResponse struct {
	value *RawStatisticsListPlayerSessionEventsResponse
	isSet bool
}

func (v NullableRawStatisticsListPlayerSessionEventsResponse) Get() *RawStatisticsListPlayerSessionEventsResponse {
	return v.value
}

func (v *NullableRawStatisticsListPlayerSessionEventsResponse) Set(val *RawStatisticsListPlayerSessionEventsResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableRawStatisticsListPlayerSessionEventsResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableRawStatisticsListPlayerSessionEventsResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRawStatisticsListPlayerSessionEventsResponse(val *RawStatisticsListPlayerSessionEventsResponse) *NullableRawStatisticsListPlayerSessionEventsResponse {
	return &NullableRawStatisticsListPlayerSessionEventsResponse{value: val, isSet: true}
}

func (v NullableRawStatisticsListPlayerSessionEventsResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRawStatisticsListPlayerSessionEventsResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


