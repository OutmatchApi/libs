# MigrationExchangeSuccessSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EnterpriseId** | **string** |  | 
**InvalidUserIds** | Pointer to **[]string** |  | [optional] 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**TeamId** | **string** |  | 
**UserIdMap** | Pointer to **map[string]interface{}** |  | [optional] 

## Methods

### NewMigrationExchangeSuccessSchema

`func NewMigrationExchangeSuccessSchema(enterpriseId string, ok DefsOkTrue, teamId string, ) *MigrationExchangeSuccessSchema`

NewMigrationExchangeSuccessSchema instantiates a new MigrationExchangeSuccessSchema object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMigrationExchangeSuccessSchemaWithDefaults

`func NewMigrationExchangeSuccessSchemaWithDefaults() *MigrationExchangeSuccessSchema`

NewMigrationExchangeSuccessSchemaWithDefaults instantiates a new MigrationExchangeSuccessSchema object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEnterpriseId

`func (o *MigrationExchangeSuccessSchema) GetEnterpriseId() string`

GetEnterpriseId returns the EnterpriseId field if non-nil, zero value otherwise.

### GetEnterpriseIdOk

`func (o *MigrationExchangeSuccessSchema) GetEnterpriseIdOk() (*string, bool)`

GetEnterpriseIdOk returns a tuple with the EnterpriseId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnterpriseId

`func (o *MigrationExchangeSuccessSchema) SetEnterpriseId(v string)`

SetEnterpriseId sets EnterpriseId field to given value.


### GetInvalidUserIds

`func (o *MigrationExchangeSuccessSchema) GetInvalidUserIds() []string`

GetInvalidUserIds returns the InvalidUserIds field if non-nil, zero value otherwise.

### GetInvalidUserIdsOk

`func (o *MigrationExchangeSuccessSchema) GetInvalidUserIdsOk() (*[]string, bool)`

GetInvalidUserIdsOk returns a tuple with the InvalidUserIds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetInvalidUserIds

`func (o *MigrationExchangeSuccessSchema) SetInvalidUserIds(v []string)`

SetInvalidUserIds sets InvalidUserIds field to given value.

### HasInvalidUserIds

`func (o *MigrationExchangeSuccessSchema) HasInvalidUserIds() bool`

HasInvalidUserIds returns a boolean if a field has been set.

### GetOk

`func (o *MigrationExchangeSuccessSchema) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *MigrationExchangeSuccessSchema) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *MigrationExchangeSuccessSchema) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetTeamId

`func (o *MigrationExchangeSuccessSchema) GetTeamId() string`

GetTeamId returns the TeamId field if non-nil, zero value otherwise.

### GetTeamIdOk

`func (o *MigrationExchangeSuccessSchema) GetTeamIdOk() (*string, bool)`

GetTeamIdOk returns a tuple with the TeamId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTeamId

`func (o *MigrationExchangeSuccessSchema) SetTeamId(v string)`

SetTeamId sets TeamId field to given value.


### GetUserIdMap

`func (o *MigrationExchangeSuccessSchema) GetUserIdMap() map[string]interface{}`

GetUserIdMap returns the UserIdMap field if non-nil, zero value otherwise.

### GetUserIdMapOk

`func (o *MigrationExchangeSuccessSchema) GetUserIdMapOk() (*map[string]interface{}, bool)`

GetUserIdMapOk returns a tuple with the UserIdMap field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserIdMap

`func (o *MigrationExchangeSuccessSchema) SetUserIdMap(v map[string]interface{})`

SetUserIdMap sets UserIdMap field to given value.

### HasUserIdMap

`func (o *MigrationExchangeSuccessSchema) HasUserIdMap() bool`

HasUserIdMap returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


