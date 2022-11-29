# svix::MessageIn

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **event_type** | **String** |  |  |
| **event_id** | **String** | Optional unique identifier for the message | [optional] |
| **channels** | **Array&lt;String&gt;** | List of free-form identifiers that endpoints can filter by | [optional] |
| **payload** | **Object** |  |  |
| **payload_retention_period** | **Integer** | The retention period for the payload (in days). | [optional][default to 90] |

## Example

```ruby
require 'svix'

instance = svix::MessageIn.new(
  event_type: user.signup,
  event_id: evt_pNZKtWg8Azow,
  channels: [&quot;project_123&quot;,&quot;group_2&quot;],
  payload: {&quot;username&quot;:&quot;test_user&quot;,&quot;email&quot;:&quot;test@example.com&quot;},
  payload_retention_period: 90
)
```

