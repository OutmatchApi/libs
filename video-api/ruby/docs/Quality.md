# video-api::Quality

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **quality** | **String** | The quality of the video you have, in pixels. Choices include 360p, 480p, 720p, 1080p, and 2160p. | [optional] |
| **status** | **String** | The status of your video. Statuses include waiting - the video is waiting to be encoded. encoding - the video is in the process of being encoded. encoded - the video was successfully encoded. failed - the video failed to be encoded. | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::Quality.new(
  quality: 720p,
  status: null
)
```

