# slack.model.objs_channel.ObjsChannel

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**is_private** | bool,  | BoolClass,  |  | 
**creator** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 
**is_mpim** | bool,  | BoolClass,  |  | 
**[purpose](#purpose)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
**created** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**name_normalized** | str,  | str,  |  | 
**is_channel** | bool,  | BoolClass,  |  | 
**is_shared** | bool,  | BoolClass,  |  | 
**[members](#members)** | list, tuple,  | tuple,  |  | 
**name** | str,  | str,  |  | 
**[topic](#topic)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
**id** | [**DefsChannelId**](DefsChannelId.md) | [**DefsChannelId**](DefsChannelId.md) |  | 
**is_org_shared** | bool,  | BoolClass,  |  | 
**accepted_user** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | [optional] 
**is_archived** | bool,  | BoolClass,  |  | [optional] 
**is_frozen** | bool,  | BoolClass,  |  | [optional] 
**is_general** | bool,  | BoolClass,  |  | [optional] 
**is_member** | bool,  | BoolClass,  |  | [optional] 
**is_moved** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**is_non_threadable** | bool,  | BoolClass,  |  | [optional] 
**is_pending_ext_shared** | bool,  | BoolClass,  |  | [optional] 
**is_read_only** | bool,  | BoolClass,  |  | [optional] 
**is_thread_only** | bool,  | BoolClass,  |  | [optional] 
**last_read** | [**DefsTs**](DefsTs.md) | [**DefsTs**](DefsTs.md) |  | [optional] 
**[latest](#latest)** | list, tuple,  | tuple,  |  | [optional] 
**num_members** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**[pending_shared](#pending_shared)** | list, tuple,  | tuple,  |  | [optional] 
**[previous_names](#previous_names)** | list, tuple,  | tuple,  |  | [optional] 
**priority** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**unlinked** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**unread_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**unread_count_display** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 

# members

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 

# purpose

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**last_set** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**creator** | [**DefsTopicPurposeCreator**](DefsTopicPurposeCreator.md) | [**DefsTopicPurposeCreator**](DefsTopicPurposeCreator.md) |  | 
**value** | str,  | str,  |  | 

# topic

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**last_set** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**creator** | [**DefsTopicPurposeCreator**](DefsTopicPurposeCreator.md) | [**DefsTopicPurposeCreator**](DefsTopicPurposeCreator.md) |  | 
**value** | str,  | str,  |  | 

# latest

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
[ObjsMessage](ObjsMessage.md) | [**ObjsMessage**](ObjsMessage.md) | [**ObjsMessage**](ObjsMessage.md) |  | 
[any_of_1](#any_of_1) | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# any_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# pending_shared

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) |  | 

# previous_names

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

