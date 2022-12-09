# video-api.model.live_stream_session_referrer.LiveStreamSessionReferrer

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**medium** | str,  | str,  | The type of search that brought the viewer to the live stream. Organic would be they found it on their own, paid would be they found it via an advertisement. | [optional] 
**searchTerm** | str,  | str,  | What term they searched for that led them to the live stream. | [optional] 
**source** | str,  | str,  | Where the viewer came from to see the live stream (usually where they searched from). | [optional] 
**url** | str,  | str,  | The website the viewer of the live stream was referred to in order to view the live stream. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

