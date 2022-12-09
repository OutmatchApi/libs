# LiveStream

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets** | Option<[**crate::models::LiveStreamAssets**](live_stream_assets.md)> |  | [optional]
**broadcasting** | Option<**bool**> | Whether or not you are broadcasting the live video you recorded for others to see. True means you are broadcasting to viewers, false means you are not. | [optional]
**live_stream_id** | Option<**String**> | The unique identifier for the live stream. Live stream IDs begin with \"li.\" | [optional]
**name** | Option<**String**> | The name of your live stream. | [optional]
**player_id** | Option<**String**> | The unique identifier for the player. | [optional]
**public** | Option<**bool**> | BETA FEATURE Please limit all public = false (\"private\") livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. | [optional]
**record** | Option<**bool**> | Whether you are recording or not. | [optional]
**stream_key** | Option<**String**> | The unique, private stream key that you use to begin streaming. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


