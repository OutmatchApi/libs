# slack.model.objs_comment.ObjsComment

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**created** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**is_intro** | bool,  | BoolClass,  |  | 
**comment** | str,  | str,  |  | 
**id** | [**DefsCommentId**](DefsCommentId.md) | [**DefsCommentId**](DefsCommentId.md) |  | 
**user** | [**DefsUserId**](DefsUserId.md) | [**DefsUserId**](DefsUserId.md) |  | 
**timestamp** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**is_starred** | bool,  | BoolClass,  |  | [optional] 
**num_stars** | decimal.Decimal, int,  | decimal.Decimal,  |  | [optional] 
**[pinned_info](#pinned_info)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[pinned_to](#pinned_to)** | list, tuple,  | tuple,  |  | [optional] 
**[reactions](#reactions)** | list, tuple,  | tuple,  |  | [optional] 

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

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

