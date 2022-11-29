# api::CreateUserRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **email** | **String** |  |  |
| **first_name** | **String** |  |  |
| **last_name** | **String** |  |  |
| **company** | **String** |  |  |

## Example

```ruby
require 'api'

instance = api::CreateUserRequest.new(
  email: john@email.com,
  first_name: John,
  last_name: James,
  company: My Company
)
```

