# testing-api-video.model.video_thumbnail_pick_payload.VideoThumbnailPickPayload

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**timecode** | str,  | str,  | Frame in video to be used as a placeholder before the video plays.  Example: &#x27;\&quot;00:01:00.000\&quot; for 1 minute into the video.&#x27; Valid Patterns:  \&quot;hh:mm:ss.ms\&quot; \&quot;hh:mm:ss:frameNumber\&quot; \&quot;124\&quot; (integer value is reported as seconds)  If selection is out of range, \&quot;00:00:00.00\&quot; will be chosen. | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

