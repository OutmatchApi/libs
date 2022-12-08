# ObjsTeamProfileField

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FieldName** | Pointer to **NullableString** |  | [optional] 
**Hint** | **string** |  | 
**Id** | **string** |  | 
**IsHidden** | Pointer to **bool** |  | [optional] 
**Label** | **string** |  | 
**Options** | Pointer to [**[]ObjsTeamProfileFieldOptionsInner**](ObjsTeamProfileFieldOptionsInner.md) |  | [optional] 
**Ordering** | **float32** |  | 
**PossibleValues** | Pointer to **[]string** |  | [optional] 
**Type** | **string** |  | 

## Methods

### NewObjsTeamProfileField

`func NewObjsTeamProfileField(hint string, id string, label string, ordering float32, type_ string, ) *ObjsTeamProfileField`

NewObjsTeamProfileField instantiates a new ObjsTeamProfileField object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewObjsTeamProfileFieldWithDefaults

`func NewObjsTeamProfileFieldWithDefaults() *ObjsTeamProfileField`

NewObjsTeamProfileFieldWithDefaults instantiates a new ObjsTeamProfileField object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetFieldName

`func (o *ObjsTeamProfileField) GetFieldName() string`

GetFieldName returns the FieldName field if non-nil, zero value otherwise.

### GetFieldNameOk

`func (o *ObjsTeamProfileField) GetFieldNameOk() (*string, bool)`

GetFieldNameOk returns a tuple with the FieldName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFieldName

`func (o *ObjsTeamProfileField) SetFieldName(v string)`

SetFieldName sets FieldName field to given value.

### HasFieldName

`func (o *ObjsTeamProfileField) HasFieldName() bool`

HasFieldName returns a boolean if a field has been set.

### SetFieldNameNil

`func (o *ObjsTeamProfileField) SetFieldNameNil(b bool)`

 SetFieldNameNil sets the value for FieldName to be an explicit nil

### UnsetFieldName
`func (o *ObjsTeamProfileField) UnsetFieldName()`

UnsetFieldName ensures that no value is present for FieldName, not even an explicit nil
### GetHint

`func (o *ObjsTeamProfileField) GetHint() string`

GetHint returns the Hint field if non-nil, zero value otherwise.

### GetHintOk

`func (o *ObjsTeamProfileField) GetHintOk() (*string, bool)`

GetHintOk returns a tuple with the Hint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHint

`func (o *ObjsTeamProfileField) SetHint(v string)`

SetHint sets Hint field to given value.


### GetId

`func (o *ObjsTeamProfileField) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ObjsTeamProfileField) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ObjsTeamProfileField) SetId(v string)`

SetId sets Id field to given value.


### GetIsHidden

`func (o *ObjsTeamProfileField) GetIsHidden() bool`

GetIsHidden returns the IsHidden field if non-nil, zero value otherwise.

### GetIsHiddenOk

`func (o *ObjsTeamProfileField) GetIsHiddenOk() (*bool, bool)`

GetIsHiddenOk returns a tuple with the IsHidden field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsHidden

`func (o *ObjsTeamProfileField) SetIsHidden(v bool)`

SetIsHidden sets IsHidden field to given value.

### HasIsHidden

`func (o *ObjsTeamProfileField) HasIsHidden() bool`

HasIsHidden returns a boolean if a field has been set.

### GetLabel

`func (o *ObjsTeamProfileField) GetLabel() string`

GetLabel returns the Label field if non-nil, zero value otherwise.

### GetLabelOk

`func (o *ObjsTeamProfileField) GetLabelOk() (*string, bool)`

GetLabelOk returns a tuple with the Label field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLabel

`func (o *ObjsTeamProfileField) SetLabel(v string)`

SetLabel sets Label field to given value.


### GetOptions

`func (o *ObjsTeamProfileField) GetOptions() []ObjsTeamProfileFieldOptionsInner`

GetOptions returns the Options field if non-nil, zero value otherwise.

### GetOptionsOk

`func (o *ObjsTeamProfileField) GetOptionsOk() (*[]ObjsTeamProfileFieldOptionsInner, bool)`

GetOptionsOk returns a tuple with the Options field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptions

`func (o *ObjsTeamProfileField) SetOptions(v []ObjsTeamProfileFieldOptionsInner)`

SetOptions sets Options field to given value.

### HasOptions

`func (o *ObjsTeamProfileField) HasOptions() bool`

HasOptions returns a boolean if a field has been set.

### GetOrdering

`func (o *ObjsTeamProfileField) GetOrdering() float32`

GetOrdering returns the Ordering field if non-nil, zero value otherwise.

### GetOrderingOk

`func (o *ObjsTeamProfileField) GetOrderingOk() (*float32, bool)`

GetOrderingOk returns a tuple with the Ordering field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrdering

`func (o *ObjsTeamProfileField) SetOrdering(v float32)`

SetOrdering sets Ordering field to given value.


### GetPossibleValues

`func (o *ObjsTeamProfileField) GetPossibleValues() []string`

GetPossibleValues returns the PossibleValues field if non-nil, zero value otherwise.

### GetPossibleValuesOk

`func (o *ObjsTeamProfileField) GetPossibleValuesOk() (*[]string, bool)`

GetPossibleValuesOk returns a tuple with the PossibleValues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPossibleValues

`func (o *ObjsTeamProfileField) SetPossibleValues(v []string)`

SetPossibleValues sets PossibleValues field to given value.

### HasPossibleValues

`func (o *ObjsTeamProfileField) HasPossibleValues() bool`

HasPossibleValues returns a boolean if a field has been set.

### SetPossibleValuesNil

`func (o *ObjsTeamProfileField) SetPossibleValuesNil(b bool)`

 SetPossibleValuesNil sets the value for PossibleValues to be an explicit nil

### UnsetPossibleValues
`func (o *ObjsTeamProfileField) UnsetPossibleValues()`

UnsetPossibleValues ensures that no value is present for PossibleValues, not even an explicit nil
### GetType

`func (o *ObjsTeamProfileField) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ObjsTeamProfileField) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ObjsTeamProfileField) SetType(v string)`

SetType sets Type field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


