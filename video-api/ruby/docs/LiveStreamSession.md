# video-api::LiveStreamSession

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **client** | [**LiveStreamSessionClient**](LiveStreamSessionClient.md) |  | [optional] |
| **device** | [**LiveStreamSessionDevice**](LiveStreamSessionDevice.md) |  | [optional] |
| **location** | [**LiveStreamSessionLocation**](LiveStreamSessionLocation.md) |  | [optional] |
| **os** | [**VideoSessionOs**](VideoSessionOs.md) |  | [optional] |
| **referrer** | [**LiveStreamSessionReferrer**](LiveStreamSessionReferrer.md) |  | [optional] |
| **session** | [**LiveStreamSessionSession**](LiveStreamSessionSession.md) |  | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::LiveStreamSession.new(
  client: null,
  device: null,
  location: null,
  os: null,
  referrer: null,
  session: null
)
```

