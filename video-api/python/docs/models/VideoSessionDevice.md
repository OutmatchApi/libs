# video-api.model.video_session_device.VideoSessionDevice

What type of device the user is on when in the video session.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | What type of device the user is on when in the video session. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**model** | str,  | str,  | The specific model of the device, if known. | [optional] 
**type** | str,  | str,  | What the type is like desktop, laptop, mobile. | [optional] 
**vendor** | str,  | str,  | If known, what the brand of the device is, like Apple, Dell, etc. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

