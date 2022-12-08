# testing-api-video.model.video_create_payload.VideoCreatePayload

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**title** | str,  | str,  | The title of your new video. | 
**description** | str,  | str,  | A brief description of your video. | [optional] 
**[metadata](#metadata)** | list, tuple,  | tuple,  | A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. Read more on [dynamic metadata](https://api.video/blog/endpoints/dynamic-metadata). | [optional] 
**mp4Support** | bool,  | BoolClass,  | Enables mp4 version in addition to streamed version. | [optional] if omitted the server will use the default value of True
**panoramic** | bool,  | BoolClass,  | Indicates if your video is a 360/immersive video. | [optional] if omitted the server will use the default value of False
**playerId** | str,  | str,  | The unique identification number for your video player. | [optional] 
**public** | bool,  | BoolClass,  | Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos). | [optional] if omitted the server will use the default value of True
**publishedAt** | str, datetime,  | str,  | The API uses ISO-8601 format for time, and includes 3 places for milliseconds. | [optional] value must conform to RFC-3339 date-time
**source** | str,  | str,  | If you add a video already on the web, this is where you enter the url for the video. | [optional] 
**[tags](#tags)** | list, tuple,  | tuple,  | A list of tags you want to use to describe your video. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# metadata

A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. Read more on [dynamic metadata](https://api.video/blog/endpoints/dynamic-metadata).

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. Read more on [dynamic metadata](https://api.video/blog/endpoints/dynamic-metadata). | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Metadata**](Metadata.md) | [**Metadata**](Metadata.md) | [**Metadata**](Metadata.md) |  | 

# tags

A list of tags you want to use to describe your video.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | A list of tags you want to use to describe your video. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

