# testing-api-video::Webhook

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** | When an webhook was created, presented in ISO-8601 format. | [optional] |
| **events** | **Array&lt;String&gt;** | A list of events that will trigger the webhook. | [optional] |
| **url** | **String** | URL of the webhook | [optional] |
| **webhook_id** | **String** | Unique identifier of the webhook | [optional] |

## Example

```ruby
require 'testing-api-video'

instance = testing-api-video::Webhook.new(
  created_at: 2019-06-24T11:45:01.109Z,
  events: [&quot;video.encoding.quality.completed&quot;],
  url: http://clientnotificationserver.com/notif?myquery&#x3D;query,
  webhook_id: webhook_XXXXXXXXXXXXXXX
)
```

