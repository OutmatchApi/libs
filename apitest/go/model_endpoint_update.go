/*
Svix API

Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 

API version: 1.4.1
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package apitest

import (
	"encoding/json"
)

// EndpointUpdate struct for EndpointUpdate
type EndpointUpdate struct {
	// Optional unique identifier for the endpoint
	Uid NullableString `json:"uid,omitempty"`
	Url string `json:"url"`
	Version int32 `json:"version"`
	Description *string `json:"description,omitempty"`
	FilterTypes []string `json:"filterTypes,omitempty"`
	// List of message channels this endpoint listens to (omit for all)
	Channels []string `json:"channels,omitempty"`
	Disabled *bool `json:"disabled,omitempty"`
	RateLimit NullableInt32 `json:"rateLimit,omitempty"`
	Metadata map[string]string `json:"metadata,omitempty"`
}

// NewEndpointUpdate instantiates a new EndpointUpdate object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewEndpointUpdate(url string, version int32) *EndpointUpdate {
	this := EndpointUpdate{}
	this.Url = url
	this.Version = version
	var description string = ""
	this.Description = &description
	var disabled bool = false
	this.Disabled = &disabled
	return &this
}

// NewEndpointUpdateWithDefaults instantiates a new EndpointUpdate object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewEndpointUpdateWithDefaults() *EndpointUpdate {
	this := EndpointUpdate{}
	var description string = ""
	this.Description = &description
	var disabled bool = false
	this.Disabled = &disabled
	return &this
}

// GetUid returns the Uid field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *EndpointUpdate) GetUid() string {
	if o == nil || isNil(o.Uid.Get()) {
		var ret string
		return ret
	}
	return *o.Uid.Get()
}

// GetUidOk returns a tuple with the Uid field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *EndpointUpdate) GetUidOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Uid.Get(), o.Uid.IsSet()
}

// HasUid returns a boolean if a field has been set.
func (o *EndpointUpdate) HasUid() bool {
	if o != nil && o.Uid.IsSet() {
		return true
	}

	return false
}

// SetUid gets a reference to the given NullableString and assigns it to the Uid field.
func (o *EndpointUpdate) SetUid(v string) {
	o.Uid.Set(&v)
}
// SetUidNil sets the value for Uid to be an explicit nil
func (o *EndpointUpdate) SetUidNil() {
	o.Uid.Set(nil)
}

// UnsetUid ensures that no value is present for Uid, not even an explicit nil
func (o *EndpointUpdate) UnsetUid() {
	o.Uid.Unset()
}

// GetUrl returns the Url field value
func (o *EndpointUpdate) GetUrl() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Url
}

// GetUrlOk returns a tuple with the Url field value
// and a boolean to check if the value has been set.
func (o *EndpointUpdate) GetUrlOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Url, true
}

// SetUrl sets field value
func (o *EndpointUpdate) SetUrl(v string) {
	o.Url = v
}

// GetVersion returns the Version field value
func (o *EndpointUpdate) GetVersion() int32 {
	if o == nil {
		var ret int32
		return ret
	}

	return o.Version
}

// GetVersionOk returns a tuple with the Version field value
// and a boolean to check if the value has been set.
func (o *EndpointUpdate) GetVersionOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Version, true
}

// SetVersion sets field value
func (o *EndpointUpdate) SetVersion(v int32) {
	o.Version = v
}

// GetDescription returns the Description field value if set, zero value otherwise.
func (o *EndpointUpdate) GetDescription() string {
	if o == nil || isNil(o.Description) {
		var ret string
		return ret
	}
	return *o.Description
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EndpointUpdate) GetDescriptionOk() (*string, bool) {
	if o == nil || isNil(o.Description) {
    return nil, false
	}
	return o.Description, true
}

// HasDescription returns a boolean if a field has been set.
func (o *EndpointUpdate) HasDescription() bool {
	if o != nil && !isNil(o.Description) {
		return true
	}

	return false
}

// SetDescription gets a reference to the given string and assigns it to the Description field.
func (o *EndpointUpdate) SetDescription(v string) {
	o.Description = &v
}

// GetFilterTypes returns the FilterTypes field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *EndpointUpdate) GetFilterTypes() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.FilterTypes
}

// GetFilterTypesOk returns a tuple with the FilterTypes field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *EndpointUpdate) GetFilterTypesOk() ([]string, bool) {
	if o == nil || isNil(o.FilterTypes) {
    return nil, false
	}
	return o.FilterTypes, true
}

// HasFilterTypes returns a boolean if a field has been set.
func (o *EndpointUpdate) HasFilterTypes() bool {
	if o != nil && isNil(o.FilterTypes) {
		return true
	}

	return false
}

// SetFilterTypes gets a reference to the given []string and assigns it to the FilterTypes field.
func (o *EndpointUpdate) SetFilterTypes(v []string) {
	o.FilterTypes = v
}

// GetChannels returns the Channels field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *EndpointUpdate) GetChannels() []string {
	if o == nil {
		var ret []string
		return ret
	}
	return o.Channels
}

// GetChannelsOk returns a tuple with the Channels field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *EndpointUpdate) GetChannelsOk() ([]string, bool) {
	if o == nil || isNil(o.Channels) {
    return nil, false
	}
	return o.Channels, true
}

// HasChannels returns a boolean if a field has been set.
func (o *EndpointUpdate) HasChannels() bool {
	if o != nil && isNil(o.Channels) {
		return true
	}

	return false
}

// SetChannels gets a reference to the given []string and assigns it to the Channels field.
func (o *EndpointUpdate) SetChannels(v []string) {
	o.Channels = v
}

// GetDisabled returns the Disabled field value if set, zero value otherwise.
func (o *EndpointUpdate) GetDisabled() bool {
	if o == nil || isNil(o.Disabled) {
		var ret bool
		return ret
	}
	return *o.Disabled
}

// GetDisabledOk returns a tuple with the Disabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *EndpointUpdate) GetDisabledOk() (*bool, bool) {
	if o == nil || isNil(o.Disabled) {
    return nil, false
	}
	return o.Disabled, true
}

// HasDisabled returns a boolean if a field has been set.
func (o *EndpointUpdate) HasDisabled() bool {
	if o != nil && !isNil(o.Disabled) {
		return true
	}

	return false
}

// SetDisabled gets a reference to the given bool and assigns it to the Disabled field.
func (o *EndpointUpdate) SetDisabled(v bool) {
	o.Disabled = &v
}

// GetRateLimit returns the RateLimit field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *EndpointUpdate) GetRateLimit() int32 {
	if o == nil || isNil(o.RateLimit.Get()) {
		var ret int32
		return ret
	}
	return *o.RateLimit.Get()
}

// GetRateLimitOk returns a tuple with the RateLimit field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *EndpointUpdate) GetRateLimitOk() (*int32, bool) {
	if o == nil {
    return nil, false
	}
	return o.RateLimit.Get(), o.RateLimit.IsSet()
}

// HasRateLimit returns a boolean if a field has been set.
func (o *EndpointUpdate) HasRateLimit() bool {
	if o != nil && o.RateLimit.IsSet() {
		return true
	}

	return false
}

// SetRateLimit gets a reference to the given NullableInt32 and assigns it to the RateLimit field.
func (o *EndpointUpdate) SetRateLimit(v int32) {
	o.RateLimit.Set(&v)
}
// SetRateLimitNil sets the value for RateLimit to be an explicit nil
func (o *EndpointUpdate) SetRateLimitNil() {
	o.RateLimit.Set(nil)
}

// UnsetRateLimit ensures that no value is present for RateLimit, not even an explicit nil
func (o *EndpointUpdate) UnsetRateLimit() {
	o.RateLimit.Unset()
}

// GetMetadata returns the Metadata field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *EndpointUpdate) GetMetadata() map[string]string {
	if o == nil {
		var ret map[string]string
		return ret
	}
	return o.Metadata
}

// GetMetadataOk returns a tuple with the Metadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *EndpointUpdate) GetMetadataOk() (*map[string]string, bool) {
	if o == nil || isNil(o.Metadata) {
    return nil, false
	}
	return &o.Metadata, true
}

// HasMetadata returns a boolean if a field has been set.
func (o *EndpointUpdate) HasMetadata() bool {
	if o != nil && isNil(o.Metadata) {
		return true
	}

	return false
}

// SetMetadata gets a reference to the given map[string]string and assigns it to the Metadata field.
func (o *EndpointUpdate) SetMetadata(v map[string]string) {
	o.Metadata = v
}

func (o EndpointUpdate) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Uid.IsSet() {
		toSerialize["uid"] = o.Uid.Get()
	}
	if true {
		toSerialize["url"] = o.Url
	}
	if true {
		toSerialize["version"] = o.Version
	}
	if !isNil(o.Description) {
		toSerialize["description"] = o.Description
	}
	if o.FilterTypes != nil {
		toSerialize["filterTypes"] = o.FilterTypes
	}
	if o.Channels != nil {
		toSerialize["channels"] = o.Channels
	}
	if !isNil(o.Disabled) {
		toSerialize["disabled"] = o.Disabled
	}
	if o.RateLimit.IsSet() {
		toSerialize["rateLimit"] = o.RateLimit.Get()
	}
	if o.Metadata != nil {
		toSerialize["metadata"] = o.Metadata
	}
	return json.Marshal(toSerialize)
}

type NullableEndpointUpdate struct {
	value *EndpointUpdate
	isSet bool
}

func (v NullableEndpointUpdate) Get() *EndpointUpdate {
	return v.value
}

func (v *NullableEndpointUpdate) Set(val *EndpointUpdate) {
	v.value = val
	v.isSet = true
}

func (v NullableEndpointUpdate) IsSet() bool {
	return v.isSet
}

func (v *NullableEndpointUpdate) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableEndpointUpdate(val *EndpointUpdate) *NullableEndpointUpdate {
	return &NullableEndpointUpdate{value: val, isSet: true}
}

func (v NullableEndpointUpdate) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableEndpointUpdate) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

