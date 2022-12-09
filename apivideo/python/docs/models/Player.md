# apivideo.model.player.Player

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[Playerinput](Playerinput.md) | [**Playerinput**](Playerinput.md) | [**Playerinput**](Playerinput.md) |  | 
[all_of_1](#all_of_1) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# all_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[assets](#assets)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**createdAt** | str, datetime,  | str,  | When the player was created, presented in ISO-8601 format. | [optional] value must conform to RFC-3339 date-time
**linkActive** | str,  | str,  | Deprecated | [optional] 
**playerId** | str,  | str,  |  | [optional] 
**shapeAspect** | str,  | str,  | Deprecated | [optional] 
**shapeBackgroundBottom** | str,  | str,  | Deprecated | [optional] 
**shapeBackgroundTop** | str,  | str,  | Deprecated | [optional] 
**shapeMargin** | decimal.Decimal, int,  | decimal.Decimal,  | Deprecated | [optional] 
**shapeRadius** | decimal.Decimal, int,  | decimal.Decimal,  | Deprecated | [optional] 
**updatedAt** | str, datetime,  | str,  | When the player was last updated, presented in ISO-8601 format. | [optional] value must conform to RFC-3339 date-time
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# assets

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**link** | str,  | str,  | The path to the file containing your logo. | [optional] 
**logo** | str,  | str,  | The name of the file containing the logo you want to use. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

