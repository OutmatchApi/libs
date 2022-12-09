# video-api.model.upload_token.UploadToken

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**createdAt** | str, datetime,  | str,  | When the token was created, displayed in ISO-8601 format. | [optional] value must conform to RFC-3339 date-time
**expiresAt** | str, datetime,  | str,  | When the token expires, displayed in ISO-8601 format. | [optional] value must conform to RFC-3339 date-time
**token** | str,  | str,  | The unique identifier for the token you will use to authenticate an upload. | [optional] 
**ttl** | decimal.Decimal, int,  | decimal.Decimal,  | Time-to-live - how long the upload token is valid for. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

