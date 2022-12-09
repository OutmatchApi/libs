# apivideo.model.access_token.AccessToken

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**access_token** | str,  | str,  | The access token containing security credentials allowing you to acccess the API. The token lasts for one hour. | [optional] 
**expires_in** | decimal.Decimal, int,  | decimal.Decimal,  | Lists the time in seconds when your access token expires. It lasts for one hour. | [optional] 
**refresh_token** | str,  | str,  | A token you can use to get the next access token when your current access token expires. | [optional] 
**token_type** | str,  | str,  | The type of token you have. | [optional] if omitted the server will use the default value of "bearer"
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

