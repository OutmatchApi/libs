# svix::ApplicationIn

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **uid** | **String** | Optional unique identifier for the application | [optional] |
| **name** | **String** |  |  |
| **rate_limit** | **Integer** |  | [optional] |
| **metadata** | **Hash&lt;String, String&gt;** |  | [optional] |

## Example

```ruby
require 'svix'

instance = svix::ApplicationIn.new(
  uid: unique-app-identifier,
  name: My first application,
  rate_limit: 1000,
  metadata: null
)
```

