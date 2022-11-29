# svix::MessageAttemptOut

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  |  |
| **msg_id** | **String** |  |  |
| **endpoint_id** | **String** |  |  |
| **response** | **String** |  |  |
| **response_status_code** | **Integer** |  |  |
| **timestamp** | **Time** |  |  |
| **status** | [**MessageStatus**](MessageStatus.md) |  |  |
| **trigger_type** | [**MessageAttemptTriggerType**](MessageAttemptTriggerType.md) |  |  |

## Example

```ruby
require 'svix'

instance = svix::MessageAttemptOut.new(
  id: atmpt_1srOrx2ZWZBpBUvZwXKQmoEYga2,
  msg_id: msg_1srOrx2ZWZBpBUvZwXKQmoEYga2,
  endpoint_id: ep_1srOrx2ZWZBpBUvZwXKQmoEYga2,
  response: {},
  response_status_code: 200,
  timestamp: null,
  status: null,
  trigger_type: null
)
```

