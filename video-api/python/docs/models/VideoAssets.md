# video-api.model.video_assets.VideoAssets

Collection of details about the video object that you can use to work with the video object.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Collection of details about the video object that you can use to work with the video object. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**hls** | str,  | str,  | This is the manifest URL. For HTTP Live Streaming (HLS), when a HLS video stream is initiated, the first file to download is the manifest. This file has the extension M3U8, and provides the video player with information about the various bitrates available for streaming. | [optional] 
**iframe** | str,  | str,  | Code to use video from a third party website | [optional] 
**mp4** | str,  | str,  | Available only if mp4Support is enabled. Raw mp4 url. | [optional] 
**player** | str,  | str,  | Raw url of the player. | [optional] 
**thumbnail** | str,  | str,  | Poster of the video. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

