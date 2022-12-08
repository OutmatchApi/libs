# testing-api-video::VideoAssets

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **hls** | **String** | This is the manifest URL. For HTTP Live Streaming (HLS), when a HLS video stream is initiated, the first file to download is the manifest. This file has the extension M3U8, and provides the video player with information about the various bitrates available for streaming. | [optional] |
| **iframe** | **String** | Code to use video from a third party website | [optional] |
| **mp4** | **String** | Available only if mp4Support is enabled. Raw mp4 url. | [optional] |
| **player** | **String** | Raw url of the player. | [optional] |
| **thumbnail** | **String** | Poster of the video. | [optional] |

## Example

```ruby
require 'testing-api-video'

instance = testing-api-video::VideoAssets.new(
  hls: null,
  iframe: &lt;iframe src&#x3D;&quot;//embed.api.video/c188ed58-3403-46a2-b91b-44603d10b2c9?token&#x3D;831a9bd9-9f50-464c-a369-8e9d914371ae&quot; width&#x3D;&quot;100%&quot; height&#x3D;&quot;100%&quot; frameborder&#x3D;&quot;0&quot; scrolling&#x3D;&quot;no&quot; allowfullscreen&#x3D;&quot;&quot;&gt;&lt;/iframe&gt;,
  mp4: https://cdn.api.video/vod/vi4k0jvEUuaTdRAEjQ4Jfrgz/token/8fd70443-d9f0-45d2-b01c-12c8cfc707c9/mp4/720/source.mp4,
  player: https://embed.api.video/1b9d6ae8-8f57-4b6d-8552-d636926b4f5f?token&#x3D;831a9bd9-9f50-464c-a369-8e9d914371ae,
  thumbnail: https://cdn.api.video/stream/831a9bd9-9f50-464c-a369-8e9d914371ae/thumbnail.jpg
)
```

