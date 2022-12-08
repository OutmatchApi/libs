# slack.model.objs_file.ObjsFile

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[channels](#channels)** | list, tuple,  | tuple,  |  | [optional] 
**comments_count** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**created** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**date_delete** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**display_as_bot** | bool,  | BoolClass,  |  | [optional] 
**editable** | bool,  | BoolClass,  |  | [optional] 
**editor** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | [optional] 
**external_id** | str,  | str,  |  | [optional] 
**external_type** | str,  | str,  |  | [optional] 
**external_url** | str,  | str,  |  | [optional] 
**filetype** | str,  | str,  |  | [optional] 
**[groups](#groups)** | list, tuple,  | tuple,  |  | [optional] 
**has_rich_preview** | bool,  | BoolClass,  |  | [optional] 
**id** | [**DefsFileId**](DefsFileId.md) | [**DefsFileId**](DefsFileId.md) |  | [optional] 
**image_exif_rotation** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**[ims](#ims)** | list, tuple,  | tuple,  |  | [optional] 
**is_external** | bool,  | BoolClass,  |  | [optional] 
**is_public** | bool,  | BoolClass,  |  | [optional] 
**is_starred** | bool,  | BoolClass,  |  | [optional] 
**is_tombstoned** | bool,  | BoolClass,  |  | [optional] 
**last_editor** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | [optional] 
**mimetype** | str,  | str,  |  | [optional] 
**mode** | str,  | str,  |  | [optional] 
**name** | str,  | str,  |  | [optional] 
**non_owner_editable** | bool,  | BoolClass,  |  | [optional] 
**num_stars** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**original_h** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**original_w** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**permalink** | str,  | str,  |  | [optional] 
**permalink_public** | str,  | str,  |  | [optional] 
**[pinned_info](#pinned_info)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[pinned_to](#pinned_to)** | list, tuple,  | tuple,  |  | [optional] 
**pretty_type** | str,  | str,  |  | [optional] 
**preview** | str,  | str,  |  | [optional] 
**public_url_shared** | bool,  | BoolClass,  |  | [optional] 
**[reactions](#reactions)** | list, tuple,  | tuple,  |  | [optional] 
**[shares](#shares)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**size** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**source_team** | [**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) |  | [optional] 
**state** | str,  | str,  |  | [optional] 
**thumb_1024** | str,  | str,  |  | [optional] 
**thumb_1024_h** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**thumb_1024_w** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**thumb_160** | str,  | str,  |  | [optional] 
**thumb_360** | str,  | str,  |  | [optional] 
**thumb_360_h** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**thumb_360_w** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**thumb_480** | str,  | str,  |  | [optional] 
**thumb_480_h** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**thumb_480_w** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**thumb_64** | str,  | str,  |  | [optional] 
**thumb_720** | str,  | str,  |  | [optional] 
**thumb_720_h** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**thumb_720_w** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**thumb_80** | str,  | str,  |  | [optional] 
**thumb_800** | str,  | str,  |  | [optional] 
**thumb_800_h** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**thumb_800_w** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**thumb_960** | str,  | str,  |  | [optional] 
**thumb_960_h** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**thumb_960_w** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**thumb_tiny** | str,  | str,  |  | [optional] 
**timestamp** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**title** | str,  | str,  |  | [optional] 
**updated** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**url_private** | str,  | str,  |  | [optional] 
**url_private_download** | str,  | str,  |  | [optional] 
**user** | str,  | str,  |  | [optional] 
**user_team** | [**DefsTeam**](DefsTeam.md) | [**DefsTeam**](DefsTeam.md) |  | [optional] 
**username** | str,  | str,  |  | [optional] 

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

# ims

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**DefsDmId**](DefsDmId.md) | [**DefsDmId**](DefsDmId.md) | [**DefsDmId**](DefsDmId.md) |  | 

# pinned_info

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------

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

# shares

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[private](#private)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[public](#public)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 

# private

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------

# public

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

