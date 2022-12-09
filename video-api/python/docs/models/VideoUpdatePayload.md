# video-api.model.video_update_payload.VideoUpdatePayload

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**description** | str,  | str,  | A brief description of the video. | [optional] 
**[metadata](#metadata)** | list, tuple,  | tuple,  | A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing metadata for the video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. | [optional] 
**mp4Support** | bool,  | BoolClass,  | Whether the player supports the mp4 format. | [optional] 
**panoramic** | bool,  | BoolClass,  | Whether the video is a 360 degree or immersive video. | [optional] 
**playerId** | str,  | str,  | The unique ID for the player you want to associate with your video. | [optional] 
**public** | bool,  | BoolClass,  | Whether the video is publicly available or not. False means it is set to private. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos). | [optional] 
**[tags](#tags)** | list, tuple,  | tuple,  | A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as whatever you send in this list will overwrite the existing list for the video. | [optional] 
**title** | str,  | str,  | The title you want to use for your video. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# metadata

A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing metadata for the video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | A list (array) of dictionaries where each dictionary contains a key value pair that describes the video. As with tags, you must send the complete list of metadata you want as whatever you send here will overwrite the existing metadata for the video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Metadata**](Metadata.md) | [**Metadata**](Metadata.md) | [**Metadata**](Metadata.md) |  | 

# tags

A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as whatever you send in this list will overwrite the existing list for the video.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | A list of terms or words you want to tag the video with. Make sure the list includes all the tags you want as whatever you send in this list will overwrite the existing list for the video. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

