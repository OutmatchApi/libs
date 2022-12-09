# video-api::LiveStreamUpdatePayload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The name you want to use for your live stream. | [optional] |
| **player_id** | **String** | The unique ID for the player associated with a live stream that you want to update. | [optional] |
| **public** | **Boolean** | BETA FEATURE Please limit all public &#x3D; false (\&quot;private\&quot;) livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. | [optional] |
| **record** | **Boolean** | Use this to indicate whether you want the recording on or off. On is true, off is false. | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::LiveStreamUpdatePayload.new(
  name: My Live Stream Video,
  player_id: pl45KFKdlddgk654dspkze,
  public: null,
  record: true
)
```

