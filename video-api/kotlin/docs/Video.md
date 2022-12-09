
# Video

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets** | [**VideoAssets**](VideoAssets.md) |  |  [optional]
**description** | **kotlin.String** | A description for the video content.  |  [optional]
**metadata** | [**kotlin.collections.List&lt;Metadata&gt;**](Metadata.md) | Metadata you can use to categorise and filter videos. Metadata is a list of dictionaries, where each dictionary represents a key value pair for categorising a video. [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) allows you to define a key that allows any value pair.  |  [optional]
**mp4Support** | **kotlin.Boolean** | This lets you know whether mp4 is supported. If enabled, an mp4 URL will be provided in the response for the video.  |  [optional]
**panoramic** | **kotlin.Boolean** | Defines if video is panoramic.  |  [optional]
**playerId** | **kotlin.String** | The id of the player that will be applied on the video.  |  [optional]
**&#x60;public&#x60;** | **kotlin.Boolean** | Defines if the content is publicly reachable or if a unique token is needed for each play session. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos).  |  [optional]
**publishedAt** | **kotlin.String** | The date and time the API created the video. Date and time are provided using ISO-8601 UTC format. |  [optional]
**source** | [**VideoSource**](VideoSource.md) |  |  [optional]
**tags** | [**kotlin.collections.List&lt;kotlin.Any&gt;**](kotlin.Any.md) | One array of tags (each tag is a string) in order to categorize a video. Tags may include spaces.   |  [optional]
**title** | **kotlin.String** | The title of the video content.  |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The date and time the video was updated. Date and time are provided using ISO-8601 UTC format. |  [optional]
**videoId** | **kotlin.String** | The unique identifier of the video object. |  [optional]



