# video-api.model.live_stream.LiveStream

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**assets** | [**LiveStreamAssets**](LiveStreamAssets.md) | [**LiveStreamAssets**](LiveStreamAssets.md) |  | [optional] 
**broadcasting** | bool,  | BoolClass,  | Whether or not you are broadcasting the live video you recorded for others to see. True means you are broadcasting to viewers, false means you are not. | [optional] 
**liveStreamId** | str,  | str,  | The unique identifier for the live stream. Live stream IDs begin with \&quot;li.\&quot; | [optional] 
**name** | str,  | str,  | The name of your live stream. | [optional] 
**playerId** | str,  | str,  | The unique identifier for the player. | [optional] 
**public** | bool,  | BoolClass,  | BETA FEATURE Please limit all public &#x3D; false (\&quot;private\&quot;) livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. | [optional] 
**record** | bool,  | BoolClass,  | Whether you are recording or not. | [optional] 
**streamKey** | str,  | str,  | The unique, private stream key that you use to begin streaming. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

