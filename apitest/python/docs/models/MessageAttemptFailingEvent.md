# apitest.model.message_attempt_failing_event.MessageAttemptFailingEvent

Sent after a message has been failing for a few times. It's sent on the fourth failure. It complements `message.attempt.exhausted` which is sent after the last failure.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Sent after a message has been failing for a few times. It&#x27;s sent on the fourth failure. It complements &#x60;message.attempt.exhausted&#x60; which is sent after the last failure. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**data** | [**MessageAttemptFailingEventData**](MessageAttemptFailingEventData.md) | [**MessageAttemptFailingEventData**](MessageAttemptFailingEventData.md) |  | 
**type** | str,  | str,  |  | [optional] must be one of ["message.attempt.failing", ] if omitted the server will use the default value of "message.attempt.failing"
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

