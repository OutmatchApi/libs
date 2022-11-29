# svix.model.message_attempt_exhausted_event.MessageAttemptExhaustedEvent

Sent when a message delivery has failed (all of the retry attempts have been exhausted).

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Sent when a message delivery has failed (all of the retry attempts have been exhausted). | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**data** | [**MessageAttemptExhaustedEventData**](MessageAttemptExhaustedEventData.md) | [**MessageAttemptExhaustedEventData**](MessageAttemptExhaustedEventData.md) |  | 
**type** | str,  | str,  |  | [optional] must be one of ["message.attempt.exhausted", ] if omitted the server will use the default value of "message.attempt.exhausted"
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

