# video-api::VideostatusEncoding

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **metadata** | [**VideostatusEncodingMetadata**](VideostatusEncodingMetadata.md) |  | [optional] |
| **playable** | **Boolean** | Whether the video is playable or not. | [optional] |
| **qualities** | [**Array&lt;Quality&gt;**](Quality.md) | Available qualities the video can be viewed in. | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::VideostatusEncoding.new(
  metadata: null,
  playable: true,
  qualities: null
)
```

