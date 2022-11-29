# api::User

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  |  |
| **email** | **String** |  |  |
| **first_name** | **String** |  |  |
| **last_name** | **String** |  |  |
| **company** | **String** |  |  |

## Example

```ruby
require 'api'

instance = api::User.new(
  id: 0000-0000-0000-0000,
  email: john@email.com,
  first_name: John,
  last_name: James,
  company: My Company
)
```

