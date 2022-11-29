# svix.model.endpoint_disabled_event.EndpointDisabledEvent

Sent when an endpoint has been automatically disabled after continuous failures.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Sent when an endpoint has been automatically disabled after continuous failures. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**data** | [**EndpointDisabledEventData**](EndpointDisabledEventData.md) | [**EndpointDisabledEventData**](EndpointDisabledEventData.md) |  | 
**type** | str,  | str,  |  | [optional] must be one of ["endpoint.disabled", ] if omitted the server will use the default value of "endpoint.disabled"
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

