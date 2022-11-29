# svix::EndpointDisabledEvent

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | **String** |  | [optional][default to &#39;endpoint.disabled&#39;] |
| **data** | [**EndpointDisabledEventData**](EndpointDisabledEventData.md) |  |  |

## Example

```ruby
require 'svix'

instance = svix::EndpointDisabledEvent.new(
  type: null,
  data: null
)
```

