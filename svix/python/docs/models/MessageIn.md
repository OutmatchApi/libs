# svix.model.message_in.MessageIn

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[payload](#payload)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 
**eventType** | str,  | str,  |  | 
**eventId** | None, str,  | NoneClass, str,  | Optional unique identifier for the message | [optional] 
**[channels](#channels)** | list, tuple, None,  | tuple, NoneClass,  | List of free-form identifiers that endpoints can filter by | [optional] 
**payloadRetentionPeriod** | decimal.Decimal, int,  | decimal.Decimal,  | The retention period for the payload (in days). | [optional] if omitted the server will use the default value of 90
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# payload

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# channels

List of free-form identifiers that endpoints can filter by

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | List of free-form identifiers that endpoints can filter by | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

