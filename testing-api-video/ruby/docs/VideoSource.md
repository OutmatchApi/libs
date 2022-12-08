# testing-api-video::VideoSource

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **live_stream** | [**VideoSourceLiveStream**](VideoSourceLiveStream.md) |  | [optional] |
| **type** | **String** |  | [optional] |
| **uri** | **String** | The URL where the video is stored. | [optional] |

## Example

```ruby
require 'testing-api-video'

instance = testing-api-video::VideoSource.new(
  live_stream: null,
  type: null,
  uri: /videos/vi4k0jvEUuaTdRAEjQ4Prklg/source
)
```

