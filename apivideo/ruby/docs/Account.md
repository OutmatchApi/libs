# apivideo::Account

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **environment** | **String** | Deprecated. Whether you are using your production or sandbox API key will impact what environment is displayed here, as well as stats and features information. If you use your sandbox key, the environment is \&quot;sandbox.\&quot; If you use your production key, the environment is \&quot;production.\&quot; | [optional] |
| **features** | **Array&lt;String&gt;** | Deprecated. What features are enabled for your account. Choices include: app.dynamic_metadata - the ability to dynamically tag videos to better segment and understand your audiences, app.event_log - the ability to create and retrieve a log detailing how your videos were interacted with, player.white_label - the ability to customise your player, stats.player_events - the ability to see statistics about how your player is being used, transcode.mp4_support - the ability to reformat content into mp4 using the H264 codec. | [optional] |
| **quota** | [**AccountQuota**](AccountQuota.md) |  | [optional] |

## Example

```ruby
require 'apivideo'

instance = apivideo::Account.new(
  environment: null,
  features: [&quot;app.dynamic_metadata, app.event_log&quot;],
  quota: null
)
```

