# Video

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets** | Option<[**crate::models::VideoAssets**](videoAssets.md)> |  | [optional]
**description** | Option<**String**> | A description for the video content.  | [optional]
**metadata** | Option<[**Vec<crate::models::Metadata>**](metadata.md)> | Metadata you can use to categorise and filter videos. Metadata is a list of dictionaries, where each dictionary represents a key value pair for categorising a video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.  | [optional]
**mp4_support** | Option<**bool**> | This lets you know whether mp4 is supported. If enabled, an mp4 URL will be provided in the response for the video.  | [optional]
**panoramic** | Option<**bool**> | Defines if video is panoramic.  | [optional]
**player_id** | Option<**String**> | The id of the player that will be applied on the video.  | [optional]
**public** | Option<**bool**> | Defines if the content is publicly reachable or if a unique token is needed for each play session. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos).  | [optional]
**published_at** | Option<**String**> | The date and time the API created the video. Date and time are provided using ISO-8601 UTC format. | [optional]
**source** | Option<[**crate::models::VideoSource**](videoSource.md)> |  | [optional]
**tags** | Option<[**Vec<serde_json::Value>**](serde_json::Value.md)> | One array of tags (each tag is a string) in order to categorize a video. Tags may include spaces.   | [optional]
**title** | Option<**String**> | The title of the video content.  | [optional]
**updated_at** | Option<**String**> | The date and time the video was updated. Date and time are provided using ISO-8601 UTC format. | [optional]
**video_id** | Option<**String**> | The unique identifier of the video object. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


