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

// AppsPermissionsResourcesListSuccessSchema Schema for successful response apps.permissions.resources.list method
type AppsPermissionsResourcesListSuccessSchema struct {
	Ok DefsOkTrue `json:"ok"`
	Resources []AppsPermissionsResourcesListSuccessSchemaResourcesInner `json:"resources"`
	ResponseMetadata *AppsPermissionsResourcesListSuccessSchemaResponseMetadata `json:"response_metadata,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _AppsPermissionsResourcesListSuccessSchema AppsPermissionsResourcesListSuccessSchema

// NewAppsPermissionsResourcesListSuccessSchema instantiates a new AppsPermissionsResourcesListSuccessSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAppsPermissionsResourcesListSuccessSchema(ok DefsOkTrue, resources []AppsPermissionsResourcesListSuccessSchemaResourcesInner) *AppsPermissionsResourcesListSuccessSchema {
	this := AppsPermissionsResourcesListSuccessSchema{}
	this.Ok = ok
	this.Resources = resources
	return &this
}

// NewAppsPermissionsResourcesListSuccessSchemaWithDefaults instantiates a new AppsPermissionsResourcesListSuccessSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAppsPermissionsResourcesListSuccessSchemaWithDefaults() *AppsPermissionsResourcesListSuccessSchema {
	this := AppsPermissionsResourcesListSuccessSchema{}
	return &this
}

// GetOk returns the Ok field value
func (o *AppsPermissionsResourcesListSuccessSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *AppsPermissionsResourcesListSuccessSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *AppsPermissionsResourcesListSuccessSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetResources returns the Resources field value
func (o *AppsPermissionsResourcesListSuccessSchema) GetResources() []AppsPermissionsResourcesListSuccessSchemaResourcesInner {
	if o == nil {
		var ret []AppsPermissionsResourcesListSuccessSchemaResourcesInner
		return ret
	}

	return o.Resources
}

// GetResourcesOk returns a tuple with the Resources field value
// and a boolean to check if the value has been set.
func (o *AppsPermissionsResourcesListSuccessSchema) GetResourcesOk() ([]AppsPermissionsResourcesListSuccessSchemaResourcesInner, bool) {
	if o == nil {
    return nil, false
	}
	return o.Resources, true
}

// SetResources sets field value
func (o *AppsPermissionsResourcesListSuccessSchema) SetResources(v []AppsPermissionsResourcesListSuccessSchemaResourcesInner) {
	o.Resources = v
}

// GetResponseMetadata returns the ResponseMetadata field value if set, zero value otherwise.
func (o *AppsPermissionsResourcesListSuccessSchema) GetResponseMetadata() AppsPermissionsResourcesListSuccessSchemaResponseMetadata {
	if o == nil || isNil(o.ResponseMetadata) {
		var ret AppsPermissionsResourcesListSuccessSchemaResponseMetadata
		return ret
	}
	return *o.ResponseMetadata
}

// GetResponseMetadataOk returns a tuple with the ResponseMetadata field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AppsPermissionsResourcesListSuccessSchema) GetResponseMetadataOk() (*AppsPermissionsResourcesListSuccessSchemaResponseMetadata, bool) {
	if o == nil || isNil(o.ResponseMetadata) {
    return nil, false
	}
	return o.ResponseMetadata, true
}

// HasResponseMetadata returns a boolean if a field has been set.
func (o *AppsPermissionsResourcesListSuccessSchema) HasResponseMetadata() bool {
	if o != nil && !isNil(o.ResponseMetadata) {
		return true
	}

	return false
}

// SetResponseMetadata gets a reference to the given AppsPermissionsResourcesListSuccessSchemaResponseMetadata and assigns it to the ResponseMetadata field.
func (o *AppsPermissionsResourcesListSuccessSchema) SetResponseMetadata(v AppsPermissionsResourcesListSuccessSchemaResponseMetadata) {
	o.ResponseMetadata = &v
}

func (o AppsPermissionsResourcesListSuccessSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["resources"] = o.Resources
	}
	if !isNil(o.ResponseMetadata) {
		toSerialize["response_metadata"] = o.ResponseMetadata
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *AppsPermissionsResourcesListSuccessSchema) UnmarshalJSON(bytes []byte) (err error) {
	varAppsPermissionsResourcesListSuccessSchema := _AppsPermissionsResourcesListSuccessSchema{}

	if err = json.Unmarshal(bytes, &varAppsPermissionsResourcesListSuccessSchema); err == nil {
		*o = AppsPermissionsResourcesListSuccessSchema(varAppsPermissionsResourcesListSuccessSchema)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "ok")
		delete(additionalProperties, "resources")
		delete(additionalProperties, "response_metadata")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableAppsPermissionsResourcesListSuccessSchema struct {
	value *AppsPermissionsResourcesListSuccessSchema
	isSet bool
}

func (v NullableAppsPermissionsResourcesListSuccessSchema) Get() *AppsPermissionsResourcesListSuccessSchema {
	return v.value
}

func (v *NullableAppsPermissionsResourcesListSuccessSchema) Set(val *AppsPermissionsResourcesListSuccessSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableAppsPermissionsResourcesListSuccessSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableAppsPermissionsResourcesListSuccessSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAppsPermissionsResourcesListSuccessSchema(val *AppsPermissionsResourcesListSuccessSchema) *NullableAppsPermissionsResourcesListSuccessSchema {
	return &NullableAppsPermissionsResourcesListSuccessSchema{value: val, isSet: true}
}

func (v NullableAppsPermissionsResourcesListSuccessSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAppsPermissionsResourcesListSuccessSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


