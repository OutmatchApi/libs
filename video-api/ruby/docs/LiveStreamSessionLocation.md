# video-api::LiveStreamSessionLocation

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **city** | **String** | The city of the viewer of the live stream. | [optional] |
| **country** | **String** | The country of the viewer of the live stream. | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::LiveStreamSessionLocation.new(
  city: Paris,
  country: France
)
```

