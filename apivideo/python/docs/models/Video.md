# apivideo.model.video.Video

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**assets** | [**VideoAssets**](VideoAssets.md) | [**VideoAssets**](VideoAssets.md) |  | [optional] 
**description** | str,  | str,  | A description for the video content.  | [optional] 
**[metadata](#metadata)** | list, tuple,  | tuple,  | Metadata you can use to categorise and filter videos. Metadata is a list of dictionaries, where each dictionary represents a key value pair for categorising a video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.  | [optional] 
**mp4Support** | bool,  | BoolClass,  | This lets you know whether mp4 is supported. If enabled, an mp4 URL will be provided in the response for the video.  | [optional] 
**panoramic** | bool,  | BoolClass,  | Defines if video is panoramic.  | [optional] 
**playerId** | str,  | str,  | The id of the player that will be applied on the video.  | [optional] 
**public** | bool,  | BoolClass,  | Defines if the content is publicly reachable or if a unique token is needed for each play session. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos).  | [optional] 
**publishedAt** | str,  | str,  | The date and time the API created the video. Date and time are provided using ISO-8601 UTC format. | [optional] 
**source** | [**VideoSource**](VideoSource.md) | [**VideoSource**](VideoSource.md) |  | [optional] 
**[tags](#tags)** | list, tuple,  | tuple,  | One array of tags (each tag is a string) in order to categorize a video. Tags may include spaces.   | [optional] 
**title** | str,  | str,  | The title of the video content.  | [optional] 
**updatedAt** | str, datetime,  | str,  | The date and time the video was updated. Date and time are provided using ISO-8601 UTC format. | [optional] value must conform to RFC-3339 date-time
**videoId** | str,  | str,  | The unique identifier of the video object. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# metadata

Metadata you can use to categorise and filter videos. Metadata is a list of dictionaries, where each dictionary represents a key value pair for categorising a video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Metadata you can use to categorise and filter videos. Metadata is a list of dictionaries, where each dictionary represents a key value pair for categorising a video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Metadata**](Metadata.md) | [**Metadata**](Metadata.md) | [**Metadata**](Metadata.md) |  | 

# tags

One array of tags (each tag is a string) in order to categorize a video. Tags may include spaces.  

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | One array of tags (each tag is a string) in order to categorize a video. Tags may include spaces.   | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

