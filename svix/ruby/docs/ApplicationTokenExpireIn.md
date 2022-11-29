# svix::ApplicationTokenExpireIn

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **expiry** | **Integer** | How many seconds until the old key is expired. | [optional] |

## Example

```ruby
require 'svix'

instance = svix::ApplicationTokenExpireIn.new(
  expiry: 60
)
```

