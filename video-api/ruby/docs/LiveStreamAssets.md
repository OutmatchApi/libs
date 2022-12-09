# video-api::LiveStreamAssets

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **hls** | **String** | The http live streaming (HLS) link for your live video stream. | [optional] |
| **iframe** | **String** | The embed code for the iframe containing your live video stream. | [optional] |
| **player** | **String** | A link to the video player that is playing your live stream. | [optional] |
| **thumbnail** | **String** | A link to the thumbnail for your video. | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::LiveStreamAssets.new(
  hls: https://live.api.video/li4pqNqGUkhKfWcBGpZVLRY5.m3u8,
  iframe: &lt;iframe src&#x3D;\&quot;https://embed.api.video/live/li4pqNqGUkhKfWcBGpZVLRY5\&quot; width&#x3D;\&quot;100%\&quot; height&#x3D;\&quot;100%\&quot; frameborder&#x3D;\&quot;0\&quot; scrolling&#x3D;\&quot;no\&quot; allowfullscreen&#x3D;\&quot;\&quot;&gt;&lt;/iframe&gt;,
  player: https://embed.api.video/live/li400mYKSgQ6xs7taUeSaEKr,
  thumbnail: https://cdn.api.video/live/li400mYKSgQ6xs7taUeSaEKr/thumbnail.jpg
)
```

