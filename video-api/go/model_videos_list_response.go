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

// VideosListResponse struct for VideosListResponse
type VideosListResponse struct {
	Data []Video `json:"data"`
	Pagination Pagination `json:"pagination"`
}

// NewVideosListResponse instantiates a new VideosListResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewVideosListResponse(data []Video, pagination Pagination) *VideosListResponse {
	this := VideosListResponse{}
	this.Data = data
	this.Pagination = pagination
	return &this
}

// NewVideosListResponseWithDefaults instantiates a new VideosListResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewVideosListResponseWithDefaults() *VideosListResponse {
	this := VideosListResponse{}
	return &this
}

// GetData returns the Data field value
func (o *VideosListResponse) GetData() []Video {
	if o == nil {
		var ret []Video
		return ret
	}

	return o.Data
}

// GetDataOk returns a tuple with the Data field value
// and a boolean to check if the value has been set.
func (o *VideosListResponse) GetDataOk() ([]Video, bool) {
	if o == nil {
    return nil, false
	}
	return o.Data, true
}

// SetData sets field value
func (o *VideosListResponse) SetData(v []Video) {
	o.Data = v
}

// GetPagination returns the Pagination field value
func (o *VideosListResponse) GetPagination() Pagination {
	if o == nil {
		var ret Pagination
		return ret
	}

	return o.Pagination
}

// GetPaginationOk returns a tuple with the Pagination field value
// and a boolean to check if the value has been set.
func (o *VideosListResponse) GetPaginationOk() (*Pagination, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Pagination, true
}

// SetPagination sets field value
func (o *VideosListResponse) SetPagination(v Pagination) {
	o.Pagination = v
}

func (o VideosListResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["data"] = o.Data
	}
	if true {
		toSerialize["pagination"] = o.Pagination
	}
	return json.Marshal(toSerialize)
}

type NullableVideosListResponse struct {
	value *VideosListResponse
	isSet bool
}

func (v NullableVideosListResponse) Get() *VideosListResponse {
	return v.value
}

func (v *NullableVideosListResponse) Set(val *VideosListResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableVideosListResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableVideosListResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableVideosListResponse(val *VideosListResponse) *NullableVideosListResponse {
	return &NullableVideosListResponse{value: val, isSet: true}
}

func (v NullableVideosListResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableVideosListResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


