# svix::EndpointDeletedEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** |  | [optional][default to &#39;endpoint.deleted&#39;] |
| **data** | [**EndpointDeletedEventData**](EndpointDeletedEventData.md) |  |  |

## Example

```ruby
require 'svix'

instance = svix::EndpointDeletedEvent.new(
  type: null,
  data: null
)
```

