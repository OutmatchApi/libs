# api::UpdateUserRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **first_name** | **String** |  |  |
| **last_name** | **String** |  |  |
| **company** | **String** |  |  |

## Example

```ruby
require 'api'

instance = api::UpdateUserRequest.new(
  first_name: John,
  last_name: James,
  company: My Company
)
```

