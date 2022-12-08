# slack.model.objs_user.ObjsUser

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
[any_of_0](#any_of_0) | dict, frozendict.frozendict,  | frozendict.frozendict,  | user object for non enterprise type | 
[any_of_1](#any_of_1) | dict, frozendict.frozendict,  | frozendict.frozendict,  | enterprise user | 

# any_of_0

user object for non enterprise type

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | user object for non enterprise type | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**is_app_user** | bool,  | BoolClass,  |  | 
**profile** | [**ObjsUserProfile**](ObjsUserProfile.md) | [**ObjsUserProfile**](ObjsUserProfile.md) |  | 
**name** | str,  | str,  |  | 
**id** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 
**is_bot** | bool,  | BoolClass,  |  | 
**updated** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | 
**color** | str,  | str,  |  | [optional] 
**deleted** | bool,  | BoolClass,  |  | [optional] 
**enterprise_user** | [**ObjsEnterpriseUser**](ObjsEnterpriseUser.md) | [**ObjsEnterpriseUser**](ObjsEnterpriseUser.md) |  | [optional] 
**has_2fa** | bool,  | BoolClass,  |  | [optional] 
**is_admin** | bool,  | BoolClass,  |  | [optional] 
**is_external** | bool,  | BoolClass,  |  | [optional] 
**is_forgotten** | bool,  | BoolClass,  |  | [optional] 
**is_invited_user** | bool,  | BoolClass,  |  | [optional] 
**is_owner** | bool,  | BoolClass,  |  | [optional] 
**is_primary_owner** | bool,  | BoolClass,  |  | [optional] 
**is_restricted** | bool,  | BoolClass,  |  | [optional] 
**is_stranger** | bool,  | BoolClass,  |  | [optional] 
**is_ultra_restricted** | bool,  | BoolClass,  |  | [optional] 
**locale** | str,  | str,  |  | [optional] 
**presence** | str,  | str,  |  | [optional] 
**real_name** | str,  | str,  |  | [optional] 
**team** | [**DefsWorkspaceId**](DefsWorkspaceId.md) | [**DefsWorkspaceId**](DefsWorkspaceId.md) |  | [optional] 
**team_id** | [**DefsWorkspaceId**](DefsWorkspaceId.md) | [**DefsWorkspaceId**](DefsWorkspaceId.md) |  | [optional] 
**[team_profile](#team_profile)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**two_factor_type** | str,  | str,  |  | [optional] 
**[tz](#tz)** | list, tuple,  | tuple,  |  | [optional] 
**tz_label** | str,  | str,  |  | [optional] 
**tz_offset** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 

# team_profile

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[fields](#fields)** | list, tuple,  | tuple,  |  | 

# fields

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ObjsTeamProfileField**](ObjsTeamProfileField.md) | [**ObjsTeamProfileField**](ObjsTeamProfileField.md) | [**ObjsTeamProfileField**](ObjsTeamProfileField.md) |  | 

# tz

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
[any_of_1](#any_of_1) | str,  | str,  |  | 

# any_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# any_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# any_of_1

enterprise user

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | enterprise user | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**is_app_user** | bool,  | BoolClass,  |  | 
**profile** | [**ObjsUserProfile**](ObjsUserProfile.md) | [**ObjsUserProfile**](ObjsUserProfile.md) |  | 
**name** | str,  | str,  |  | 
**id** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 
**is_bot** | bool,  | BoolClass,  |  | 
**updated** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | 
**color** | str,  | str,  | refercing to bug: https://jira.tinyspeck.com/browse/EVALUE-1559 | [optional] 
**deleted** | bool,  | BoolClass,  |  | [optional] 
**enterprise_user** | [**ObjsEnterpriseUser**](ObjsEnterpriseUser.md) | [**ObjsEnterpriseUser**](ObjsEnterpriseUser.md) |  | [optional] 
**has_2fa** | bool,  | BoolClass,  |  | [optional] 
**is_admin** | bool,  | BoolClass,  |  | [optional] 
**is_external** | bool,  | BoolClass,  |  | [optional] 
**is_forgotten** | bool,  | BoolClass,  |  | [optional] 
**is_owner** | bool,  | BoolClass,  |  | [optional] 
**is_primary_owner** | bool,  | BoolClass,  |  | [optional] 
**is_restricted** | bool,  | BoolClass,  |  | [optional] 
**is_stranger** | bool,  | BoolClass,  |  | [optional] 
**is_ultra_restricted** | bool,  | BoolClass,  |  | [optional] 
**locale** | str,  | str,  |  | [optional] 
**presence** | str,  | str,  |  | [optional] 
**real_name** | str,  | str,  |  | [optional] 
**team_id** | [**DefsWorkspaceId**](DefsWorkspaceId.md) | [**DefsWorkspaceId**](DefsWorkspaceId.md) |  | [optional] 
**[team_profile](#team_profile)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[teams](#teams)** | list, tuple,  | tuple,  |  | [optional] 
**two_factor_type** | str,  | str,  |  | [optional] 
**[tz](#tz)** | list, tuple,  | tuple,  |  | [optional] 
**tz_label** | str,  | str,  |  | [optional] 
**tz_offset** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 

# team_profile

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[fields](#fields)** | list, tuple,  | tuple,  |  | 

# fields

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ObjsTeamProfileField**](ObjsTeamProfileField.md) | [**ObjsTeamProfileField**](ObjsTeamProfileField.md) | [**ObjsTeamProfileField**](ObjsTeamProfileField.md) |  | 

# teams

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsWorkspaceId**](DefsWorkspaceId.md) | [**DefsWorkspaceId**](DefsWorkspaceId.md) | [**DefsWorkspaceId**](DefsWorkspaceId.md) |  | 

# tz

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
[any_of_1](#any_of_1) | str,  | str,  |  | 

# any_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# any_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

