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

// MigrationExchangeSuccessSchema Schema for successful response from migration.exchange method
type MigrationExchangeSuccessSchema struct {
	EnterpriseId string `json:"enterprise_id"`
	InvalidUserIds []string `json:"invalid_user_ids,omitempty"`
	Ok DefsOkTrue `json:"ok"`
	TeamId string `json:"team_id"`
	UserIdMap map[string]interface{} `json:"user_id_map,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _MigrationExchangeSuccessSchema MigrationExchangeSuccessSchema

// NewMigrationExchangeSuccessSchema instantiates a new MigrationExchangeSuccessSchema object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMigrationExchangeSuccessSchema(enterpriseId string, ok DefsOkTrue, teamId string) *MigrationExchangeSuccessSchema {
	this := MigrationExchangeSuccessSchema{}
	this.EnterpriseId = enterpriseId
	this.Ok = ok
	this.TeamId = teamId
	return &this
}

// NewMigrationExchangeSuccessSchemaWithDefaults instantiates a new MigrationExchangeSuccessSchema object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMigrationExchangeSuccessSchemaWithDefaults() *MigrationExchangeSuccessSchema {
	this := MigrationExchangeSuccessSchema{}
	return &this
}

// GetEnterpriseId returns the EnterpriseId field value
func (o *MigrationExchangeSuccessSchema) GetEnterpriseId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.EnterpriseId
}

// GetEnterpriseIdOk returns a tuple with the EnterpriseId field value
// and a boolean to check if the value has been set.
func (o *MigrationExchangeSuccessSchema) GetEnterpriseIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.EnterpriseId, true
}

// SetEnterpriseId sets field value
func (o *MigrationExchangeSuccessSchema) SetEnterpriseId(v string) {
	o.EnterpriseId = v
}

// GetInvalidUserIds returns the InvalidUserIds field value if set, zero value otherwise.
func (o *MigrationExchangeSuccessSchema) GetInvalidUserIds() []string {
	if o == nil || isNil(o.InvalidUserIds) {
		var ret []string
		return ret
	}
	return o.InvalidUserIds
}

// GetInvalidUserIdsOk returns a tuple with the InvalidUserIds field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MigrationExchangeSuccessSchema) GetInvalidUserIdsOk() ([]string, bool) {
	if o == nil || isNil(o.InvalidUserIds) {
    return nil, false
	}
	return o.InvalidUserIds, true
}

// HasInvalidUserIds returns a boolean if a field has been set.
func (o *MigrationExchangeSuccessSchema) HasInvalidUserIds() bool {
	if o != nil && !isNil(o.InvalidUserIds) {
		return true
	}

	return false
}

// SetInvalidUserIds gets a reference to the given []string and assigns it to the InvalidUserIds field.
func (o *MigrationExchangeSuccessSchema) SetInvalidUserIds(v []string) {
	o.InvalidUserIds = v
}

// GetOk returns the Ok field value
func (o *MigrationExchangeSuccessSchema) GetOk() DefsOkTrue {
	if o == nil {
		var ret DefsOkTrue
		return ret
	}

	return o.Ok
}

// GetOkOk returns a tuple with the Ok field value
// and a boolean to check if the value has been set.
func (o *MigrationExchangeSuccessSchema) GetOkOk() (*DefsOkTrue, bool) {
	if o == nil {
    return nil, false
	}
	return &o.Ok, true
}

// SetOk sets field value
func (o *MigrationExchangeSuccessSchema) SetOk(v DefsOkTrue) {
	o.Ok = v
}

// GetTeamId returns the TeamId field value
func (o *MigrationExchangeSuccessSchema) GetTeamId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.TeamId
}

// GetTeamIdOk returns a tuple with the TeamId field value
// and a boolean to check if the value has been set.
func (o *MigrationExchangeSuccessSchema) GetTeamIdOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return &o.TeamId, true
}

// SetTeamId sets field value
func (o *MigrationExchangeSuccessSchema) SetTeamId(v string) {
	o.TeamId = v
}

// GetUserIdMap returns the UserIdMap field value if set, zero value otherwise.
func (o *MigrationExchangeSuccessSchema) GetUserIdMap() map[string]interface{} {
	if o == nil || isNil(o.UserIdMap) {
		var ret map[string]interface{}
		return ret
	}
	return o.UserIdMap
}

// GetUserIdMapOk returns a tuple with the UserIdMap field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MigrationExchangeSuccessSchema) GetUserIdMapOk() (map[string]interface{}, bool) {
	if o == nil || isNil(o.UserIdMap) {
    return map[string]interface{}{}, false
	}
	return o.UserIdMap, true
}

// HasUserIdMap returns a boolean if a field has been set.
func (o *MigrationExchangeSuccessSchema) HasUserIdMap() bool {
	if o != nil && !isNil(o.UserIdMap) {
		return true
	}

	return false
}

// SetUserIdMap gets a reference to the given map[string]interface{} and assigns it to the UserIdMap field.
func (o *MigrationExchangeSuccessSchema) SetUserIdMap(v map[string]interface{}) {
	o.UserIdMap = v
}

func (o MigrationExchangeSuccessSchema) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["enterprise_id"] = o.EnterpriseId
	}
	if !isNil(o.InvalidUserIds) {
		toSerialize["invalid_user_ids"] = o.InvalidUserIds
	}
	if true {
		toSerialize["ok"] = o.Ok
	}
	if true {
		toSerialize["team_id"] = o.TeamId
	}
	if !isNil(o.UserIdMap) {
		toSerialize["user_id_map"] = o.UserIdMap
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *MigrationExchangeSuccessSchema) UnmarshalJSON(bytes []byte) (err error) {
	varMigrationExchangeSuccessSchema := _MigrationExchangeSuccessSchema{}

	if err = json.Unmarshal(bytes, &varMigrationExchangeSuccessSchema); err == nil {
		*o = MigrationExchangeSuccessSchema(varMigrationExchangeSuccessSchema)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "enterprise_id")
		delete(additionalProperties, "invalid_user_ids")
		delete(additionalProperties, "ok")
		delete(additionalProperties, "team_id")
		delete(additionalProperties, "user_id_map")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableMigrationExchangeSuccessSchema struct {
	value *MigrationExchangeSuccessSchema
	isSet bool
}

func (v NullableMigrationExchangeSuccessSchema) Get() *MigrationExchangeSuccessSchema {
	return v.value
}

func (v *NullableMigrationExchangeSuccessSchema) Set(val *MigrationExchangeSuccessSchema) {
	v.value = val
	v.isSet = true
}

func (v NullableMigrationExchangeSuccessSchema) IsSet() bool {
	return v.isSet
}

func (v *NullableMigrationExchangeSuccessSchema) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMigrationExchangeSuccessSchema(val *MigrationExchangeSuccessSchema) *NullableMigrationExchangeSuccessSchema {
	return &NullableMigrationExchangeSuccessSchema{value: val, isSet: true}
}

func (v NullableMigrationExchangeSuccessSchema) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMigrationExchangeSuccessSchema) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


