# VideoCreatePayload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | Option<**String**> | A brief description of your video. | [optional]
**metadata** | Option<[**Vec<crate::models::Metadata>**](metadata.md)> | A list of key value pairs that you use to provide metadata for your video. These pairs can be made dynamic, allowing you to segment your audience. Read more on [dynamic metadata](https://api.video/blog/endpoints/dynamic-metadata). | [optional]
**mp4_support** | Option<**bool**> | Enables mp4 version in addition to streamed version. | [optional][default to true]
**panoramic** | Option<**bool**> | Indicates if your video is a 360/immersive video. | [optional][default to false]
**player_id** | Option<**String**> | The unique identification number for your video player. | [optional]
**public** | Option<**bool**> | Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. Default is true. Tutorials on [private videos](https://api.video/blog/endpoints/private-videos). | [optional][default to true]
**published_at** | Option<**String**> | The API uses ISO-8601 format for time, and includes 3 places for milliseconds. | [optional]
**source** | Option<**String**> | If you add a video already on the web, this is where you enter the url for the video. | [optional]
**tags** | Option<**Vec<String>**> | A list of tags you want to use to describe your video. | [optional]
**title** | **String** | The title of your new video. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


