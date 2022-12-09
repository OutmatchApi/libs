# video-api::LiveStreamSessionClient

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The name of the browser used to view the live stream session. | [optional] |
| **type** | **String** | The type of client used to view the live stream session. | [optional] |
| **version** | **String** | The version of the browser used to view the live stream session. | [optional] |

## Example

```ruby
require 'video-api'

instance = video-api::LiveStreamSessionClient.new(
  name: Firefox,
  type: browser,
  version: 67.0
)
```

