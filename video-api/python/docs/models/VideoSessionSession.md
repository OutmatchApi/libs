# video-api.model.video_session_session.VideoSessionSession

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**endedAt** | str, datetime,  | str,  | When the video session ended, presented in ISO-8601 format. | [optional] value must conform to RFC-3339 date-time
**loadedAt** | str, datetime,  | str,  | When the video session started, presented in ISO-8601 format. | [optional] value must conform to RFC-3339 date-time
**sessionId** | str,  | str,  | The unique identifier for the session that you can use to track what happens during it. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

