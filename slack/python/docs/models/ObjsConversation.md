# slack.model.objs_conversation.ObjsConversation

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
[any_of_0](#any_of_0) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
[any_of_1](#any_of_1) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
[any_of_2](#any_of_2) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# any_of_0

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**is_private** | bool,  | BoolClass,  |  | 
**creator** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 
**is_im** | bool,  | BoolClass,  |  | 
**is_mpim** | bool,  | BoolClass,  |  | must be one of [False, ] 
**[purpose](#purpose)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
**created** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**name_normalized** | str,  | str,  |  | 
**is_group** | bool,  | BoolClass,  |  | 
**is_archived** | bool,  | BoolClass,  |  | 
**is_channel** | bool,  | BoolClass,  |  | 
**is_general** | bool,  | BoolClass,  |  | 
**is_shared** | bool,  | BoolClass,  |  | 
**name** | str,  | str,  |  | 
**[topic](#topic)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
**id** | [**DefsChannel**](DefsChannel.md) | [**DefsChannel**](DefsChannel.md) |  | 
**is_org_shared** | bool,  | BoolClass,  |  | 
**accepted_user** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | [optional] 
**[connected_team_ids](#connected_team_ids)** | list, tuple,  | tuple,  |  | [optional] 
**conversation_host_id** | [**DefsWorkspaceId**](DefsWorkspaceId.md) | [**DefsWorkspaceId**](DefsWorkspaceId.md) |  | [optional] 
**[display_counts](#display_counts)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**enterprise_id** | [**DefsEnterpriseId**](DefsEnterpriseId.md) | [**DefsEnterpriseId**](DefsEnterpriseId.md) |  | [optional] 
**has_pins** | bool,  | BoolClass,  |  | [optional] 
**[internal_team_ids](#internal_team_ids)** | list, tuple,  | tuple,  |  | [optional] 
**is_ext_shared** | bool,  | BoolClass,  |  | [optional] 
**is_frozen** | bool,  | BoolClass,  |  | [optional] 
**is_global_shared** | bool,  | BoolClass,  |  | [optional] 
**is_member** | bool,  | BoolClass,  |  | [optional] 
**is_moved** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**is_non_threadable** | bool,  | BoolClass,  |  | [optional] 
**is_open** | bool,  | BoolClass,  |  | [optional] 
**is_org_default** | bool,  | BoolClass,  |  | [optional] 
**is_org_mandatory** | bool,  | BoolClass,  |  | [optional] 
**is_pending_ext_shared** | bool,  | BoolClass,  |  | [optional] 
**is_read_only** | bool,  | BoolClass,  |  | [optional] 
**is_starred** | bool,  | BoolClass,  |  | [optional] 
**is_thread_only** | bool,  | BoolClass,  |  | [optional] 
**last_read** | [**DefsTs**](DefsTs.md) | [**DefsTs**](DefsTs.md) |  | [optional] 
**[latest](#latest)** | list, tuple,  | tuple,  |  | [optional] 
**[members](#members)** | list, tuple,  | tuple,  |  | [optional] 
**num_members** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**[parent_conversation](#parent_conversation)** | list, tuple,  | tuple,  |  | [optional] 
**[pending_connected_team_ids](#pending_connected_team_ids)** | list, tuple,  | tuple,  |  | [optional] 
**[pending_shared](#pending_shared)** | list, tuple,  | tuple,  |  | [optional] 
**pin_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**[previous_names](#previous_names)** | list, tuple,  | tuple,  |  | [optional] 
**priority** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**[shared_team_ids](#shared_team_ids)** | list, tuple,  | tuple,  |  | [optional] 
**[shares](#shares)** | list, tuple,  | tuple,  |  | [optional] 
**timezone_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**unlinked** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**unread_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**unread_count_display** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**use_case** | str,  | str,  |  | [optional] 
**user** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | [optional] 
**version** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 

# connected_team_ids

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsWorkspaceId**](DefsWorkspaceId.md) | [**DefsWorkspaceId**](DefsWorkspaceId.md) | [**DefsWorkspaceId**](DefsWorkspaceId.md) |  | 

# display_counts

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**display_counts** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**guest_counts** | decimal.Decimal, int,  | decimal.Decimal,  |  | 

# internal_team_ids

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) |  | 

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

# members

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 

# parent_conversation

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
[DefsChannel](DefsChannel.md) | [**DefsChannel**](DefsChannel.md) | [**DefsChannel**](DefsChannel.md) |  | 
[any_of_1](#any_of_1) | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# any_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# pending_connected_team_ids

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) |  | 

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

# shared_team_ids

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) |  | 

# shares

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
**is_active** | bool,  | BoolClass,  |  | 
**team** | [**ObjsTeam**](ObjsTeam.md) | [**ObjsTeam**](ObjsTeam.md) |  | 
**user** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 
**accepted_user** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | [optional] 

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

# any_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**is_private** | bool,  | BoolClass,  |  | 
**creator** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 
**is_im** | bool,  | BoolClass,  |  | 
**is_mpim** | bool,  | BoolClass,  |  | must be one of [True, ] 
**[purpose](#purpose)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
**created** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**name_normalized** | str,  | str,  |  | 
**is_group** | bool,  | BoolClass,  |  | 
**is_archived** | bool,  | BoolClass,  |  | 
**is_channel** | bool,  | BoolClass,  |  | 
**is_general** | bool,  | BoolClass,  |  | 
**is_shared** | bool,  | BoolClass,  |  | 
**name** | str,  | str,  |  | 
**[topic](#topic)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
**id** | [**DefsChannel**](DefsChannel.md) | [**DefsChannel**](DefsChannel.md) |  | 
**is_org_shared** | bool,  | BoolClass,  |  | 
**accepted_user** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | [optional] 
**[connected_team_ids](#connected_team_ids)** | list, tuple,  | tuple,  |  | [optional] 
**conversation_host_id** | [**DefsWorkspaceId**](DefsWorkspaceId.md) | [**DefsWorkspaceId**](DefsWorkspaceId.md) |  | [optional] 
**[display_counts](#display_counts)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[internal_team_ids](#internal_team_ids)** | list, tuple,  | tuple,  |  | [optional] 
**is_ext_shared** | bool,  | BoolClass,  |  | [optional] 
**is_frozen** | bool,  | BoolClass,  |  | [optional] 
**is_member** | bool,  | BoolClass,  |  | [optional] 
**is_moved** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**is_non_threadable** | bool,  | BoolClass,  |  | [optional] 
**is_open** | bool,  | BoolClass,  |  | [optional] 
**is_pending_ext_shared** | bool,  | BoolClass,  |  | [optional] 
**is_read_only** | bool,  | BoolClass,  |  | [optional] 
**is_starred** | bool,  | BoolClass,  |  | [optional] 
**is_thread_only** | bool,  | BoolClass,  |  | [optional] 
**last_read** | [**DefsTs**](DefsTs.md) | [**DefsTs**](DefsTs.md) |  | [optional] 
**[latest](#latest)** | list, tuple,  | tuple,  |  | [optional] 
**[members](#members)** | list, tuple,  | tuple,  |  | [optional] 
**num_members** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**[parent_conversation](#parent_conversation)** | list, tuple,  | tuple,  |  | [optional] 
**[pending_connected_team_ids](#pending_connected_team_ids)** | list, tuple,  | tuple,  |  | [optional] 
**[pending_shared](#pending_shared)** | list, tuple,  | tuple,  |  | [optional] 
**pin_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**[previous_names](#previous_names)** | list, tuple,  | tuple,  |  | [optional] 
**priority** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**[shared_team_ids](#shared_team_ids)** | list, tuple,  | tuple,  |  | [optional] 
**[shares](#shares)** | list, tuple,  | tuple,  |  | [optional] 
**timezone_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**unlinked** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**unread_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**unread_count_display** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**user** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | [optional] 
**version** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 

# connected_team_ids

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) |  | 

# display_counts

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**display_counts** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**guest_counts** | decimal.Decimal, int,  | decimal.Decimal,  |  | 

# internal_team_ids

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) |  | 

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

# members

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 

# parent_conversation

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
[DefsChannel](DefsChannel.md) | [**DefsChannel**](DefsChannel.md) | [**DefsChannel**](DefsChannel.md) |  | 
[any_of_1](#any_of_1) | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# any_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# pending_connected_team_ids

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) |  | 

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

# shared_team_ids

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) |  | 

# shares

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
**is_active** | bool,  | BoolClass,  |  | 
**team** | [**ObjsTeam**](ObjsTeam.md) | [**ObjsTeam**](ObjsTeam.md) |  | 
**user** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 
**accepted_user** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | [optional] 

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

# any_of_2

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**is_im** | bool,  | BoolClass,  |  | 
**created** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**id** | [**DefsDmId**](DefsDmId.md) | [**DefsDmId**](DefsDmId.md) |  | 
**priority** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | 
**is_org_shared** | bool,  | BoolClass,  |  | 
**user** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 
**has_pins** | bool,  | BoolClass,  |  | [optional] 
**is_archived** | bool,  | BoolClass,  |  | [optional] 
**is_ext_shared** | bool,  | BoolClass,  |  | [optional] 
**is_frozen** | bool,  | BoolClass,  |  | [optional] 
**is_open** | bool,  | BoolClass,  |  | [optional] 
**is_shared** | bool,  | BoolClass,  |  | [optional] 
**is_starred** | bool,  | BoolClass,  |  | [optional] 
**is_user_deleted** | bool,  | BoolClass,  |  | [optional] 
**last_read** | [**DefsTs**](DefsTs.md) | [**DefsTs**](DefsTs.md) |  | [optional] 
**[latest](#latest)** | list, tuple,  | tuple,  |  | [optional] 
**[parent_conversation](#parent_conversation)** | list, tuple,  | tuple,  |  | [optional] 
**pin_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**[shares](#shares)** | list, tuple,  | tuple,  |  | [optional] 
**unread_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**unread_count_display** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**version** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 

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

# parent_conversation

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
[DefsChannel](DefsChannel.md) | [**DefsChannel**](DefsChannel.md) | [**DefsChannel**](DefsChannel.md) |  | 
[any_of_1](#any_of_1) | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# any_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# shares

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
**is_active** | bool,  | BoolClass,  |  | 
**date_create** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**name** | str,  | str,  |  | 
**id** | [**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) |  | 
**team** | [**ObjsTeam**](ObjsTeam.md) | [**ObjsTeam**](ObjsTeam.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

