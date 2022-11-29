# EventTypeOut

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **string** |  | 
**Schemas** | Pointer to **map[string]map[string]interface{}** | The schema for the event type for a specific version as a JSON schema. | [optional] 
**Archived** | Pointer to **bool** |  | [optional] [default to false]
**Name** | **string** |  | 
**CreatedAt** | **time.Time** |  | 
**UpdatedAt** | **time.Time** |  | 

## Methods

### NewEventTypeOut

`func NewEventTypeOut(description string, name string, createdAt time.Time, updatedAt time.Time, ) *EventTypeOut`

NewEventTypeOut instantiates a new EventTypeOut object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEventTypeOutWithDefaults

`func NewEventTypeOutWithDefaults() *EventTypeOut`

NewEventTypeOutWithDefaults instantiates a new EventTypeOut object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDescription

`func (o *EventTypeOut) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *EventTypeOut) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *EventTypeOut) SetDescription(v string)`

SetDescription sets Description field to given value.


### GetSchemas

`func (o *EventTypeOut) GetSchemas() map[string]map[string]interface{}`

GetSchemas returns the Schemas field if non-nil, zero value otherwise.

### GetSchemasOk

`func (o *EventTypeOut) GetSchemasOk() (*map[string]map[string]interface{}, bool)`

GetSchemasOk returns a tuple with the Schemas field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchemas

`func (o *EventTypeOut) SetSchemas(v map[string]map[string]interface{})`

SetSchemas sets Schemas field to given value.

### HasSchemas

`func (o *EventTypeOut) HasSchemas() bool`

HasSchemas returns a boolean if a field has been set.

### SetSchemasNil

`func (o *EventTypeOut) SetSchemasNil(b bool)`

 SetSchemasNil sets the value for Schemas to be an explicit nil

### UnsetSchemas
`func (o *EventTypeOut) UnsetSchemas()`

UnsetSchemas ensures that no value is present for Schemas, not even an explicit nil
### GetArchived

`func (o *EventTypeOut) GetArchived() bool`

GetArchived returns the Archived field if non-nil, zero value otherwise.

### GetArchivedOk

`func (o *EventTypeOut) GetArchivedOk() (*bool, bool)`

GetArchivedOk returns a tuple with the Archived field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetArchived

`func (o *EventTypeOut) SetArchived(v bool)`

SetArchived sets Archived field to given value.

### HasArchived

`func (o *EventTypeOut) HasArchived() bool`

HasArchived returns a boolean if a field has been set.

### GetName

`func (o *EventTypeOut) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EventTypeOut) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EventTypeOut) SetName(v string)`

SetName sets Name field to given value.


### GetCreatedAt

`func (o *EventTypeOut) GetCreatedAt() time.Time`

GetCreatedAt returns the CreatedAt field if non-nil, zero value otherwise.

### GetCreatedAtOk

`func (o *EventTypeOut) GetCreatedAtOk() (*time.Time, bool)`

GetCreatedAtOk returns a tuple with the CreatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreatedAt

`func (o *EventTypeOut) SetCreatedAt(v time.Time)`

SetCreatedAt sets CreatedAt field to given value.


### GetUpdatedAt

`func (o *EventTypeOut) GetUpdatedAt() time.Time`

GetUpdatedAt returns the UpdatedAt field if non-nil, zero value otherwise.

### GetUpdatedAtOk

`func (o *EventTypeOut) GetUpdatedAtOk() (*time.Time, bool)`

GetUpdatedAtOk returns a tuple with the UpdatedAt field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUpdatedAt

`func (o *EventTypeOut) SetUpdatedAt(v time.Time)`

SetUpdatedAt sets UpdatedAt field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


