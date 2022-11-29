# svix.model.message_attempt_out.MessageAttemptOut

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**responseStatusCode** | decimal.Decimal, int,  | decimal.Decimal,  |  | 
**endpointId** | str,  | str,  |  | 
**response** | str,  | str,  |  | 
**msgId** | str,  | str,  |  | 
**id** | str,  | str,  |  | 
**triggerType** | [**MessageAttemptTriggerType**](MessageAttemptTriggerType.md) | [**MessageAttemptTriggerType**](MessageAttemptTriggerType.md) |  | 
**status** | [**MessageStatus**](MessageStatus.md) | [**MessageStatus**](MessageStatus.md) |  | 
**timestamp** | str, datetime,  | str,  |  | value must conform to RFC-3339 date-time
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

