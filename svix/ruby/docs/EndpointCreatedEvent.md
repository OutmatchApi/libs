# svix::EndpointCreatedEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** |  | [optional][default to &#39;endpoint.created&#39;] |
| **data** | [**EndpointCreatedEventData**](EndpointCreatedEventData.md) |  |  |

## Example

```ruby
require 'svix'

instance = svix::EndpointCreatedEvent.new(
  type: null,
  data: null
)
```

