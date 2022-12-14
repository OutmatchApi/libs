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

// WebhooksListResponse struct for WebhooksListResponse
type WebhooksListResponse struct {
	Data []Webhook `json:"data,omitempty"`
	Pagination *Pagination `json:"pagination,omitempty"`
}

// NewWebhooksListResponse instantiates a new WebhooksListResponse object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewWebhooksListResponse() *WebhooksListResponse {
	this := WebhooksListResponse{}
	return &this
}

// NewWebhooksListResponseWithDefaults instantiates a new WebhooksListResponse object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewWebhooksListResponseWithDefaults() *WebhooksListResponse {
	this := WebhooksListResponse{}
	return &this
}

// GetData returns the Data field value if set, zero value otherwise.
func (o *WebhooksListResponse) GetData() []Webhook {
	if o == nil || isNil(o.Data) {
		var ret []Webhook
		return ret
	}
	return o.Data
}

// GetDataOk returns a tuple with the Data field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *WebhooksListResponse) GetDataOk() ([]Webhook, bool) {
	if o == nil || isNil(o.Data) {
    return nil, false
	}
	return o.Data, true
}

// HasData returns a boolean if a field has been set.
func (o *WebhooksListResponse) HasData() bool {
	if o != nil && !isNil(o.Data) {
		return true
	}

	return false
}

// SetData gets a reference to the given []Webhook and assigns it to the Data field.
func (o *WebhooksListResponse) SetData(v []Webhook) {
	o.Data = v
}

// GetPagination returns the Pagination field value if set, zero value otherwise.
func (o *WebhooksListResponse) GetPagination() Pagination {
	if o == nil || isNil(o.Pagination) {
		var ret Pagination
		return ret
	}
	return *o.Pagination
}

// GetPaginationOk returns a tuple with the Pagination field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *WebhooksListResponse) GetPaginationOk() (*Pagination, bool) {
	if o == nil || isNil(o.Pagination) {
    return nil, false
	}
	return o.Pagination, true
}

// HasPagination returns a boolean if a field has been set.
func (o *WebhooksListResponse) HasPagination() bool {
	if o != nil && !isNil(o.Pagination) {
		return true
	}

	return false
}

// SetPagination gets a reference to the given Pagination and assigns it to the Pagination field.
func (o *WebhooksListResponse) SetPagination(v Pagination) {
	o.Pagination = &v
}

func (o WebhooksListResponse) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Data) {
		toSerialize["data"] = o.Data
	}
	if !isNil(o.Pagination) {
		toSerialize["pagination"] = o.Pagination
	}
	return json.Marshal(toSerialize)
}

type NullableWebhooksListResponse struct {
	value *WebhooksListResponse
	isSet bool
}

func (v NullableWebhooksListResponse) Get() *WebhooksListResponse {
	return v.value
}

func (v *NullableWebhooksListResponse) Set(val *WebhooksListResponse) {
	v.value = val
	v.isSet = true
}

func (v NullableWebhooksListResponse) IsSet() bool {
	return v.isSet
}

func (v *NullableWebhooksListResponse) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableWebhooksListResponse(val *WebhooksListResponse) *NullableWebhooksListResponse {
	return &NullableWebhooksListResponse{value: val, isSet: true}
}

func (v NullableWebhooksListResponse) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableWebhooksListResponse) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


