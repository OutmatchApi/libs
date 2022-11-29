# svix::WebhookTypes

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **a** | [**EndpointDisabledEvent**](EndpointDisabledEvent.md) |  |  |
| **b** | [**EndpointCreatedEvent**](EndpointCreatedEvent.md) |  |  |
| **c** | [**EndpointUpdatedEvent**](EndpointUpdatedEvent.md) |  |  |
| **d** | [**EndpointDeletedEvent**](EndpointDeletedEvent.md) |  |  |
| **e** | [**MessageAttemptExhaustedEvent**](MessageAttemptExhaustedEvent.md) |  |  |
| **a1** | [**MessageAttemptFailingEvent**](MessageAttemptFailingEvent.md) |  |  |

## Example

```ruby
require 'svix'

instance = svix::WebhookTypes.new(
  a: null,
  b: null,
  c: null,
  d: null,
  e: null,
  a1: null
)
```

