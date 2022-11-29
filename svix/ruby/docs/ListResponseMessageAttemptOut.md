# svix::ListResponseMessageAttemptOut

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **data** | [**Array&lt;MessageAttemptOut&gt;**](MessageAttemptOut.md) |  |  |
| **iterator** | **String** |  | [optional] |
| **prev_iterator** | **String** |  | [optional] |
| **done** | **Boolean** |  |  |

## Example

```ruby
require 'svix'

instance = svix::ListResponseMessageAttemptOut.new(
  data: null,
  iterator: iterator,
  prev_iterator: -iterator,
  done: null
)
```

