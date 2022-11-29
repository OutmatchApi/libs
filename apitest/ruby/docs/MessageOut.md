# apitest::MessageOut

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_type** | **String** |  |  |
| **event_id** | **String** | Optional unique identifier for the message | [optional] |
| **channels** | **Array&lt;String&gt;** | List of free-form identifiers that endpoints can filter by | [optional] |
| **payload** | **Object** |  |  |
| **id** | **String** |  |  |
| **timestamp** | **Time** |  |  |

## Example

```ruby
require 'apitest'

instance = apitest::MessageOut.new(
  event_type: user.signup,
  event_id: evt_pNZKtWg8Azow,
  channels: [&quot;project_123&quot;,&quot;group_2&quot;],
  payload: {&quot;username&quot;:&quot;test_user&quot;,&quot;email&quot;:&quot;test@example.com&quot;},
  id: msg_1srOrx2ZWZBpBUvZwXKQmoEYga2,
  timestamp: null
)
```

