# slack.model.objs_team.ObjsTeam

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**domain** | str,  | str,  |  | 
**icon** | [**ObjsIcon**](ObjsIcon.md) | [**ObjsIcon**](ObjsIcon.md) |  | 
**name** | str,  | str,  |  | 
**email_domain** | str,  | str,  |  | 
**id** | [**DefsWorkspaceId**](DefsWorkspaceId.md) | [**DefsWorkspaceId**](DefsWorkspaceId.md) |  | 
**archived** | bool,  | BoolClass,  |  | [optional] 
**avatar_base_url** | str,  | str,  |  | [optional] 
**created** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**date_create** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**deleted** | bool,  | BoolClass,  |  | [optional] 
**description** | None, str,  | NoneClass, str,  |  | [optional] 
**[discoverable](#discoverable)** | list, tuple,  | tuple,  |  | [optional] 
**enterprise_id** | [**DefsEnterpriseId**](DefsEnterpriseId.md) | [**DefsEnterpriseId**](DefsEnterpriseId.md) |  | [optional] 
**enterprise_name** | str,  | str,  |  | [optional] 
**external_org_migrations** | [**ObjsExternalOrgMigrations**](ObjsExternalOrgMigrations.md) | [**ObjsExternalOrgMigrations**](ObjsExternalOrgMigrations.md) |  | [optional] 
**has_compliance_export** | bool,  | BoolClass,  |  | [optional] 
**is_assigned** | bool,  | BoolClass,  |  | [optional] 
**is_enterprise** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**is_over_storage_limit** | bool,  | BoolClass,  |  | [optional] 
**limit_ts** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**locale** | str,  | str,  |  | [optional] 
**messages_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**msg_edit_window_mins** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**over_integrations_limit** | bool,  | BoolClass,  |  | [optional] 
**over_storage_limit** | bool,  | BoolClass,  |  | [optional] 
**pay_prod_cur** | str,  | str,  |  | [optional] 
**plan** | str,  | str,  |  | [optional] must be one of ["", "std", "plus", "compliance", "enterprise", ] 
**primary_owner** | [**ObjsPrimaryOwner**](ObjsPrimaryOwner.md) | [**ObjsPrimaryOwner**](ObjsPrimaryOwner.md) |  | [optional] 
**[sso_provider](#sso_provider)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 

# discoverable

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

# sso_provider

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**label** | str,  | str,  |  | [optional] 
**name** | str,  | str,  |  | [optional] 
**type** | str,  | str,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

