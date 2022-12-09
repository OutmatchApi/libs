# apivideo::VideoSessionClient

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | The name of the browser used to view the video session. | [optional] |
| **type** | **String** | The type of client used to view the video session. | [optional] |
| **version** | **String** | The version of the browser used to view the video session. | [optional] |

## Example

```ruby
require 'apivideo'

instance = apivideo::VideoSessionClient.new(
  name: Firefox,
  type: browser,
  version: 67.0
)
```

