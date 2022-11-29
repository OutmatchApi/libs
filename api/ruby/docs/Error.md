# api::Error

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status_code** | **Integer** |  |  |
| **description** | **String** |  |  |

## Example

```ruby
require 'api'

instance = api::Error.new(
  status_code: 400,
  description: Error description
)
```

