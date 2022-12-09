# apivideo::VideoSourceLiveStream

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **links** | [**Array&lt;VideoSourceLiveStreamLink&gt;**](VideoSourceLiveStreamLink.md) |  | [optional] |
| **live_stream_id** | **String** | The unique identifier for the live stream. | [optional] |

## Example

```ruby
require 'apivideo'

instance = apivideo::VideoSourceLiveStream.new(
  links: null,
  live_stream_id: li400mYKSgQ6xs7taUeSaEKr
)
```

