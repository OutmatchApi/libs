
# VideoMinusCreateMinusPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title** | **kotlin.String** | The title of your new video. | 
**description** | **kotlin.String** | A brief description of your video. |  [optional]
**metadata** | [**kotlin.collections.List&lt;Metadata&gt;**](Metadata.md) | A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. Read more on [dynamic metadata](https://api.video/blog/endpoints/dynamic-metadata). |  [optional]
**mp4Support** | **kotlin.Boolean** | Enables mp4 version in addition to streamed version. |  [optional]
**panoramic** | **kotlin.Boolean** | Indicates if your video is a 360/immersive video. |  [optional]
**playerId** | **kotlin.String** | The unique identification number for your video player. |  [optional]
**&#x60;public&#x60;** | **kotlin.Boolean** | Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos). |  [optional]
**publishedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | The API uses ISO-8601 format for time, and includes 3 places for milliseconds. |  [optional]
**source** | **kotlin.String** | If you add a video already on the web, this is where you enter the url for the video. |  [optional]
**tags** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of tags you want to use to describe your video. |  [optional]



