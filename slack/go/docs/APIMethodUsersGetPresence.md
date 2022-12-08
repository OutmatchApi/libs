# APIMethodUsersGetPresence

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoAway** | Pointer to **bool** |  | [optional] 
**ConnectionCount** | Pointer to **int32** |  | [optional] 
**LastActivity** | Pointer to **int32** |  | [optional] 
**ManualAway** | Pointer to **bool** |  | [optional] 
**Ok** | [**DefsOkTrue**](DefsOkTrue.md) |  | 
**Online** | Pointer to **bool** |  | [optional] 
**Presence** | **string** |  | 

## Methods

### NewAPIMethodUsersGetPresence

`func NewAPIMethodUsersGetPresence(ok DefsOkTrue, presence string, ) *APIMethodUsersGetPresence`

NewAPIMethodUsersGetPresence instantiates a new APIMethodUsersGetPresence object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAPIMethodUsersGetPresenceWithDefaults

`func NewAPIMethodUsersGetPresenceWithDefaults() *APIMethodUsersGetPresence`

NewAPIMethodUsersGetPresenceWithDefaults instantiates a new APIMethodUsersGetPresence object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetAutoAway

`func (o *APIMethodUsersGetPresence) GetAutoAway() bool`

GetAutoAway returns the AutoAway field if non-nil, zero value otherwise.

### GetAutoAwayOk

`func (o *APIMethodUsersGetPresence) GetAutoAwayOk() (*bool, bool)`

GetAutoAwayOk returns a tuple with the AutoAway field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAutoAway

`func (o *APIMethodUsersGetPresence) SetAutoAway(v bool)`

SetAutoAway sets AutoAway field to given value.

### HasAutoAway

`func (o *APIMethodUsersGetPresence) HasAutoAway() bool`

HasAutoAway returns a boolean if a field has been set.

### GetConnectionCount

`func (o *APIMethodUsersGetPresence) GetConnectionCount() int32`

GetConnectionCount returns the ConnectionCount field if non-nil, zero value otherwise.

### GetConnectionCountOk

`func (o *APIMethodUsersGetPresence) GetConnectionCountOk() (*int32, bool)`

GetConnectionCountOk returns a tuple with the ConnectionCount field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetConnectionCount

`func (o *APIMethodUsersGetPresence) SetConnectionCount(v int32)`

SetConnectionCount sets ConnectionCount field to given value.

### HasConnectionCount

`func (o *APIMethodUsersGetPresence) HasConnectionCount() bool`

HasConnectionCount returns a boolean if a field has been set.

### GetLastActivity

`func (o *APIMethodUsersGetPresence) GetLastActivity() int32`

GetLastActivity returns the LastActivity field if non-nil, zero value otherwise.

### GetLastActivityOk

`func (o *APIMethodUsersGetPresence) GetLastActivityOk() (*int32, bool)`

GetLastActivityOk returns a tuple with the LastActivity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLastActivity

`func (o *APIMethodUsersGetPresence) SetLastActivity(v int32)`

SetLastActivity sets LastActivity field to given value.

### HasLastActivity

`func (o *APIMethodUsersGetPresence) HasLastActivity() bool`

HasLastActivity returns a boolean if a field has been set.

### GetManualAway

`func (o *APIMethodUsersGetPresence) GetManualAway() bool`

GetManualAway returns the ManualAway field if non-nil, zero value otherwise.

### GetManualAwayOk

`func (o *APIMethodUsersGetPresence) GetManualAwayOk() (*bool, bool)`

GetManualAwayOk returns a tuple with the ManualAway field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetManualAway

`func (o *APIMethodUsersGetPresence) SetManualAway(v bool)`

SetManualAway sets ManualAway field to given value.

### HasManualAway

`func (o *APIMethodUsersGetPresence) HasManualAway() bool`

HasManualAway returns a boolean if a field has been set.

### GetOk

`func (o *APIMethodUsersGetPresence) GetOk() DefsOkTrue`

GetOk returns the Ok field if non-nil, zero value otherwise.

### GetOkOk

`func (o *APIMethodUsersGetPresence) GetOkOk() (*DefsOkTrue, bool)`

GetOkOk returns a tuple with the Ok field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOk

`func (o *APIMethodUsersGetPresence) SetOk(v DefsOkTrue)`

SetOk sets Ok field to given value.


### GetOnline

`func (o *APIMethodUsersGetPresence) GetOnline() bool`

GetOnline returns the Online field if non-nil, zero value otherwise.

### GetOnlineOk

`func (o *APIMethodUsersGetPresence) GetOnlineOk() (*bool, bool)`

GetOnlineOk returns a tuple with the Online field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOnline

`func (o *APIMethodUsersGetPresence) SetOnline(v bool)`

SetOnline sets Online field to given value.

### HasOnline

`func (o *APIMethodUsersGetPresence) HasOnline() bool`

HasOnline returns a boolean if a field has been set.

### GetPresence

`func (o *APIMethodUsersGetPresence) GetPresence() string`

GetPresence returns the Presence field if non-nil, zero value otherwise.

### GetPresenceOk

`func (o *APIMethodUsersGetPresence) GetPresenceOk() (*string, bool)`

GetPresenceOk returns a tuple with the Presence field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPresence

`func (o *APIMethodUsersGetPresence) SetPresence(v string)`

SetPresence sets Presence field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


