/*
Svix API

Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 

API version: 1.4.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package svix

import (
	"encoding/json"
)

// ListResponseIntegrationOut struct for ListResponseIntegrationOut
type ListResponseIntegrationOut struct {
	Data []IntegrationOut `json:"data"`
	Iterator NullableString `json:"iterator,omitempty"`
	Done bool `json:"done"`
}

// NewListResponseIntegrationOut instantiates a new ListResponseIntegrationOut object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewListResponseIntegrationOut(data []IntegrationOut, done bool) *ListResponseIntegrationOut {
	this := ListResponseIntegrationOut{}
	this.Data = data
	this.Done = done
	return &this
}

// NewListResponseIntegrationOutWithDefaults instantiates a new ListResponseIntegrationOut object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewListResponseIntegrationOutWithDefaults() *ListResponseIntegrationOut {
	this := ListResponseIntegrationOut{}
	return &this
}

// GetData returns the Data field value
func (o *ListResponseIntegrationOut) GetData() []IntegrationOut {
	if o == nil {
		var ret []IntegrationOut
		return ret
	}

	return o.Data
}

// GetDataOk returns a tuple with the Data field value
// and a boolean to check if the value has been set.
func (o *ListResponseIntegrationOut) GetDataOk() ([]IntegrationOut, bool) {
	if o == nil {
    return nil, false
	}
	return o.Data, true
}

// SetData sets field value
func (o *ListResponseIntegrationOut) SetData(v []IntegrationOut) {
	o.Data = v
}

// GetIterator returns the Iterator field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *ListResponseIntegrationOut) GetIterator() string {
	if o == nil || isNil(o.Iterator.Get()) {
		var ret string
		return ret
	}
	return *o.Iterator.Get()
}

// GetIteratorOk returns a tuple with the Iterator field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *ListResponseIntegrationOut) GetIteratorOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Iterator.Get(), o.Iterator.IsSet()
}

// HasIterator returns a boolean if a field has been set.
func (o *ListResponseIntegrationOut) HasIterator() bool {
	if o != nil && o.Iterator.IsSet() {
		return true
	}

	return false
}

// SetIterator gets a reference to the given NullableString and assigns it to the Iterator field.
func (o *ListResponseIntegrationOut) SetIterator(v string) {
	o.Iterator.Set(&v)
}
// SetIteratorNil sets the value for Iterator to be an explicit nil
func (o *ListResponseIntegrationOut) SetIteratorNil() {
	o.Iterator.Set(nil)
}

// UnsetIterator ensures that no value is present for Iterator, not even an explicit nil
func (o *ListResponseIntegrationOut) UnsetIterator() {
	o.Iterator.Unset()
}

// GetDone returns the Done field value
func (o *ListResponseIntegrationOut) GetDone() bool {
	if o == nil {
		var ret bool
		return ret
	}

	return o.Done
}

// GetDoneOk returns a tuple with the Done field value
// and a boolean to check if the value has been set.
func (o *ListResponseIntegrationOut) GetDoneOk() (*bool, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Done, true
}

// SetDone sets field value
func (o *ListResponseIntegrationOut) SetDone(v bool) {
	o.Done = v
}

func (o ListResponseIntegrationOut) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["data"] = o.Data
	}
	if o.Iterator.IsSet() {
		toSerialize["iterator"] = o.Iterator.Get()
	}
	if true {
		toSerialize["done"] = o.Done
	}
	return json.Marshal(toSerialize)
}

type NullableListResponseIntegrationOut struct {
	value *ListResponseIntegrationOut
	isSet bool
}

func (v NullableListResponseIntegrationOut) Get() *ListResponseIntegrationOut {
	return v.value
}

func (v *NullableListResponseIntegrationOut) Set(val *ListResponseIntegrationOut) {
	v.value = val
	v.isSet = true
}

func (v NullableListResponseIntegrationOut) IsSet() bool {
	return v.isSet
}

func (v *NullableListResponseIntegrationOut) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableListResponseIntegrationOut(val *ListResponseIntegrationOut) *NullableListResponseIntegrationOut {
	return &NullableListResponseIntegrationOut{value: val, isSet: true}
}

func (v NullableListResponseIntegrationOut) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableListResponseIntegrationOut) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


