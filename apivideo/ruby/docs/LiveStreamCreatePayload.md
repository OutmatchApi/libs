# apivideo::LiveStreamCreatePayload

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Add a name for your live stream here. |  |
| **player_id** | **String** | The unique identifier for the player. | [optional] |
| **public** | **Boolean** | BETA FEATURE Please limit all public &#x3D; false (\&quot;private\&quot;) livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view. | [optional] |
| **record** | **Boolean** | Whether you are recording or not. True for record, false for not record. | [optional][default to false] |

## Example

```ruby
require 'apivideo'

instance = apivideo::LiveStreamCreatePayload.new(
  name: My Live Stream Video,
  player_id: pl4f4ferf5erfr5zed4fsdd,
  public: null,
  record: true
)
```

