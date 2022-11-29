# svix::ListResponseMessageAttemptEndpointOut

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **data** | [**Array&lt;MessageAttemptEndpointOut&gt;**](MessageAttemptEndpointOut.md) |  |  |
| **iterator** | **String** |  | [optional] |
| **prev_iterator** | **String** |  | [optional] |
| **done** | **Boolean** |  |  |

## Example

```ruby
require 'svix'

instance = svix::ListResponseMessageAttemptEndpointOut.new(
  data: null,
  iterator: iterator,
  prev_iterator: -iterator,
  done: null
)
```

