# apitest.model.endpoint_updated_event.EndpointUpdatedEvent

Sent when an endpoint is updated.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Sent when an endpoint is updated. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**data** | [**EndpointUpdatedEventData**](EndpointUpdatedEventData.md) | [**EndpointUpdatedEventData**](EndpointUpdatedEventData.md) |  | 
**type** | str,  | str,  |  | [optional] must be one of ["endpoint.updated", ] if omitted the server will use the default value of "endpoint.updated"
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

