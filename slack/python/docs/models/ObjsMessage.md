# slack.model.objs_message.ObjsMessage

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**text** | str,  | str,  |  | 
**type** | str,  | str,  |  | 
**ts** | [**DefsTs**](DefsTs.md) | [**DefsTs**](DefsTs.md) |  | 
**[attachments](#attachments)** | list, tuple,  | tuple,  |  | [optional] 
**blocks** | [**Blocks**](Blocks.md) | [**Blocks**](Blocks.md) |  | [optional] 
**[bot_id](#bot_id)** | list, tuple,  | tuple,  |  | [optional] 
**bot_profile** | [**ObjsBotProfile**](ObjsBotProfile.md) | [**ObjsBotProfile**](ObjsBotProfile.md) |  | [optional] 
**client_msg_id** | str,  | str,  |  | [optional] 
**comment** | [**ObjsComment**](ObjsComment.md) | [**ObjsComment**](ObjsComment.md) |  | [optional] 
**display_as_bot** | bool,  | BoolClass,  |  | [optional] 
**file** | [**ObjsFile**](ObjsFile.md) | [**ObjsFile**](ObjsFile.md) |  | [optional] 
**[files](#files)** | list, tuple,  | tuple,  |  | [optional] 
**[icons](#icons)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**inviter** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | [optional] 
**is_delayed_message** | bool,  | BoolClass,  |  | [optional] 
**is_intro** | bool,  | BoolClass,  |  | [optional] 
**is_starred** | bool,  | BoolClass,  |  | [optional] 
**last_read** | [**DefsTs**](DefsTs.md) | [**DefsTs**](DefsTs.md) |  | [optional] 
**latest_reply** | [**DefsTs**](DefsTs.md) | [**DefsTs**](DefsTs.md) |  | [optional] 
**name** | str,  | str,  |  | [optional] 
**old_name** | str,  | str,  |  | [optional] 
**parent_user_id** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | [optional] 
**permalink** | str,  | str,  |  | [optional] 
**[pinned_to](#pinned_to)** | list, tuple,  | tuple,  |  | [optional] 
**purpose** | str,  | str,  |  | [optional] 
**[reactions](#reactions)** | list, tuple,  | tuple,  |  | [optional] 
**reply_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**[reply_users](#reply_users)** | list, tuple,  | tuple,  |  | [optional] 
**reply_users_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**source_team** | [**DefsWorkspaceId**](DefsWorkspaceId.md) | [**DefsWorkspaceId**](DefsWorkspaceId.md) |  | [optional] 
**subscribed** | bool,  | BoolClass,  |  | [optional] 
**subtype** | str,  | str,  |  | [optional] 
**team** | [**DefsWorkspaceId**](DefsWorkspaceId.md) | [**DefsWorkspaceId**](DefsWorkspaceId.md) |  | [optional] 
**thread_ts** | [**DefsTs**](DefsTs.md) | [**DefsTs**](DefsTs.md) |  | [optional] 
**topic** | str,  | str,  |  | [optional] 
**unread_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**upload** | bool,  | BoolClass,  |  | [optional] 
**user** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | [optional] 
**user_profile** | [**ObjsUserProfileShort**](ObjsUserProfileShort.md) | [**ObjsUserProfileShort**](ObjsUserProfileShort.md) |  | [optional] 
**user_team** | [**DefsWorkspaceId**](DefsWorkspaceId.md) | [**DefsWorkspaceId**](DefsWorkspaceId.md) |  | [optional] 
**username** | str,  | str,  |  | [optional] 

# attachments

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**fallback** | str,  | str,  |  | [optional] 
**image_bytes** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**image_height** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**image_url** | str,  | str,  |  | [optional] 
**image_width** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 

# bot_id

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
[DefsBotId](DefsBotId.md) | [**DefsBotId**](DefsBotId.md) | [**DefsBotId**](DefsBotId.md) |  | 
[any_of_1](#any_of_1) | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# any_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# files

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ObjsFile**](ObjsFile.md) | [**ObjsFile**](ObjsFile.md) | [**ObjsFile**](ObjsFile.md) |  | 

# icons

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**emoji** | str,  | str,  |  | [optional] 
**image_64** | str,  | str,  |  | [optional] 

# pinned_to

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsChannel**](DefsChannel.md) | [**DefsChannel**](DefsChannel.md) | [**DefsChannel**](DefsChannel.md) |  | 

# reactions

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ObjsReaction**](ObjsReaction.md) | [**ObjsReaction**](ObjsReaction.md) | [**ObjsReaction**](ObjsReaction.md) |  | 

# reply_users

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

