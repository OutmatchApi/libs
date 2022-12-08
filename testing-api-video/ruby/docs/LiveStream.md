# testing-api-video::LiveStream

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **assets** | [**LiveStreamAssets**](LiveStreamAssets.md) |  | [optional] |
| **broadcasting** | **Boolean** | Whether or not you are broadcasting the live video you recorded for others to see. True means you are broadcasting to viewers, false means you are not. | [optional] |
| **live_stream_id** | **String** | The unique identifier for the live stream. Live stream IDs begin with \&quot;li.\&quot; | [optional] |
| **name** | **String** | The name of your live stream. | [optional] |
| **player_id** | **String** | The unique identifier for the player. | [optional] |
| **public** | **Boolean** | BETA FEATURE Please limit all public &#x3D; false (\&quot;private\&quot;) livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. | [optional] |
| **record** | **Boolean** | Whether you are recording or not. | [optional] |
| **stream_key** | **String** | The unique, private stream key that you use to begin streaming. | [optional] |

## Example

```ruby
require 'testing-api-video'

instance = testing-api-video::LiveStream.new(
  assets: null,
  broadcasting: true,
  live_stream_id: li400mYKSgQ6xs7taUeSaEKr,
  name: My Live Stream,
  player_id: pl45d5vFFGrfdsdsd156dGhh,
  public: true,
  record: true,
  stream_key: cc1b4df0-d1c5-4064-a8f9-9f0368385135
)
```

