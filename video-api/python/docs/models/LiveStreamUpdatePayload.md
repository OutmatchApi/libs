# video-api.model.live_stream_update_payload.LiveStreamUpdatePayload

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | str,  | str,  | The name you want to use for your live stream. | [optional] 
**playerId** | str,  | str,  | The unique ID for the player associated with a live stream that you want to update. | [optional] 
**public** | bool,  | BoolClass,  | BETA FEATURE Please limit all public &#x3D; false (\&quot;private\&quot;) livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. | [optional] 
**record** | bool,  | BoolClass,  | Use this to indicate whether you want the recording on or off. On is true, off is false. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

