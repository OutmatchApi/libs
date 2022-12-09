/*
api.video

api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.

API version: 1.0.1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package video-api

import (
	"encoding/json"
)

// PlayersListResponse struct for PlayersListResponse
type PlayersListResponse struct {
	Data []Player `json:"data,omitempty"`
	Pagination *Pagination `json:"pagination,omitempty"`
}

// NewPlayersListResponse instantiates a new PlayersListResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewPlayersListResponse() *PlayersListResponse {
	this := PlayersListResponse{}
	return &this
}

// NewPlayersListResponseWithDefaults instantiates a new PlayersListResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewPlayersListResponseWithDefaults() *PlayersListResponse {
	this := PlayersListResponse{}
	return &this
}

// GetData returns the Data field value if set, zero value otherwise.
func (o *PlayersListResponse) GetData() []Player {
	if o == nil || isNil(o.Data) {
		var ret []Player
		return ret
	}
	return o.Data
}

// GetDataOk returns a tuple with the Data field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayersListResponse) GetDataOk() ([]Player, bool) {
	if o == nil || isNil(o.Data) {
    return nil, false
	}
	return o.Data, true
}

// HasData returns a boolean if a field has been set.
func (o *PlayersListResponse) HasData() bool {
	if o != nil && !isNil(o.Data) {
		return true
	}

	return false
}

// SetData gets a reference to the given []Player and assigns it to the Data field.
func (o *PlayersListResponse) SetData(v []Player) {
	o.Data = v
}

// GetPagination returns the Pagination field value if set, zero value otherwise.
func (o *PlayersListResponse) GetPagination() Pagination {
	if o == nil || isNil(o.Pagination) {
		var ret Pagination
		return ret
	}
	return *o.Pagination
}

// GetPaginationOk returns a tuple with the Pagination field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *PlayersListResponse) GetPaginationOk() (*Pagination, bool) {
	if o == nil || isNil(o.Pagination) {
    return nil, false
	}
	return o.Pagination, true
}

// HasPagination returns a boolean if a field has been set.
func (o *PlayersListResponse) HasPagination() bool {
	if o != nil && !isNil(o.Pagination) {
		return true
	}

	return false
}

// SetPagination gets a reference to the given Pagination and assigns it to the Pagination field.
func (o *PlayersListResponse) SetPagination(v Pagination) {
	o.Pagination = &v
}

func (o PlayersListResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Data) {
		toSerialize["data"] = o.Data
	}
	if !isNil(o.Pagination) {
		toSerialize["pagination"] = o.Pagination
	}
	return json.Marshal(toSerialize)
}

type NullablePlayersListResponse struct {
	value *PlayersListResponse
	isSet bool
}

func (v NullablePlayersListResponse) Get() *PlayersListResponse {
	return v.value
}

func (v *NullablePlayersListResponse) Set(val *PlayersListResponse) {
	v.value = val
	v.isSet = true
}

func (v NullablePlayersListResponse) IsSet() bool {
	return v.isSet
}

func (v *NullablePlayersListResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullablePlayersListResponse(val *PlayersListResponse) *NullablePlayersListResponse {
	return &NullablePlayersListResponse{value: val, isSet: true}
}

func (v NullablePlayersListResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullablePlayersListResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


