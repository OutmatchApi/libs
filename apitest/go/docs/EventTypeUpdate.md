# EventTypeUpdate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **string** |  | 
**Schemas** | Pointer to **map[string]map[string]interface{}** | The schema for the event type for a specific version as a JSON schema. | [optional] 
**Archived** | Pointer to **bool** |  | [optional] [default to false]

## Methods

### NewEventTypeUpdate

`func NewEventTypeUpdate(description string, ) *EventTypeUpdate`

NewEventTypeUpdate instantiates a new EventTypeUpdate object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEventTypeUpdateWithDefaults

`func NewEventTypeUpdateWithDefaults() *EventTypeUpdate`

NewEventTypeUpdateWithDefaults instantiates a new EventTypeUpdate object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *EventTypeUpdate) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *EventTypeUpdate) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *EventTypeUpdate) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetSchemas

`func (o *EventTypeUpdate) GetSchemas() map[string]map[string]interface{}`

GetSchemas returns the Schemas field if non-nil, zero value otherwise.

### GetSchemasOk

`func (o *EventTypeUpdate) GetSchemasOk() (*map[string]map[string]interface{}, bool)`

GetSchemasOk returns a tuple with the Schemas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchemas

`func (o *EventTypeUpdate) SetSchemas(v map[string]map[string]interface{})`

SetSchemas sets Schemas field to given value.

### HasSchemas

`func (o *EventTypeUpdate) HasSchemas() bool`

HasSchemas returns a boolean if a field has been set.

### SetSchemasNil

`func (o *EventTypeUpdate) SetSchemasNil(b bool)`

 SetSchemasNil sets the value for Schemas to be an explicit nil

### UnsetSchemas
`func (o *EventTypeUpdate) UnsetSchemas()`

UnsetSchemas ensures that no value is present for Schemas, not even an explicit nil
### GetArchived

`func (o *EventTypeUpdate) GetArchived() bool`

GetArchived returns the Archived field if non-nil, zero value otherwise.

### GetArchivedOk

`func (o *EventTypeUpdate) GetArchivedOk() (*bool, bool)`

GetArchivedOk returns a tuple with the Archived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArchived

`func (o *EventTypeUpdate) SetArchived(v bool)`

SetArchived sets Archived field to given value.

### HasArchived

`func (o *EventTypeUpdate) HasArchived() bool`

HasArchived returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


