# slack.model.objs_subteam.ObjsSubteam

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**date_delete** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**date_update** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**[deleted_by](#deleted_by)** | list, tuple,  | tuple,  |  | 
**description** | str,  | str,  |  | 
**is_external** | bool,  | BoolClass,  |  | 
**handle** | str,  | str,  |  | 
**team_id** | [**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) |  | 
**created_by** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 
**[auto_type](#auto_type)** | list, tuple,  | tuple,  |  | 
**[prefs](#prefs)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
**is_subteam** | bool,  | BoolClass,  |  | 
**date_create** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**name** | str,  | str,  |  | 
**updated_by** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 
**is_usergroup** | bool,  | BoolClass,  |  | 
**id** | [**DefsSubteamId**](DefsSubteamId.md) | [**DefsSubteamId**](DefsSubteamId.md) |  | 
**auto_provision** | bool,  | BoolClass,  |  | 
**enterprise_subteam_id** | str,  | str,  |  | 
**channel_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**user_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**[users](#users)** | list, tuple,  | tuple,  |  | [optional] 

# auto_type

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### anyOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[any_of_0](#any_of_0) | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 
[any_of_1](#any_of_1) | str,  | str,  |  | must be one of ["owner", "admin", ] 

# any_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# any_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["owner", "admin", ] 

# deleted_by

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### anyOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[any_of_0](#any_of_0) | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 
[DefsUserId](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 

# any_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# prefs

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[channels](#channels)** | list, tuple,  | tuple,  |  | 
**[groups](#groups)** | list, tuple,  | tuple,  |  | 

# channels

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsChannelId**](DefsChannelId.md) | [**DefsChannelId**](DefsChannelId.md) | [**DefsChannelId**](DefsChannelId.md) |  | 

# groups

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsGroupId**](DefsGroupId.md) | [**DefsGroupId**](DefsGroupId.md) | [**DefsGroupId**](DefsGroupId.md) |  | 

# users

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

