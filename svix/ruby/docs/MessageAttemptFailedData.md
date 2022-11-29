# svix::MessageAttemptFailedData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  |  |
| **response_status_code** | **Integer** |  |  |
| **timestamp** | **Time** |  |  |

## Example

```ruby
require 'svix'

instance = svix::MessageAttemptFailedData.new(
  id: atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2,
  response_status_code: 500,
  timestamp: null
)
```

