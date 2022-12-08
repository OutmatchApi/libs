# slack::APIMethodUsersGetPresence

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auto_away** | **Boolean** |  | [optional] |
| **connection_count** | **Integer** |  | [optional] |
| **last_activity** | **Integer** |  | [optional] |
| **manual_away** | **Boolean** |  | [optional] |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **online** | **Boolean** |  | [optional] |
| **presence** | **String** |  |  |

## Example

```ruby
require 'slack'

instance = slack::APIMethodUsersGetPresence.new(
  auto_away: null,
  connection_count: null,
  last_activity: null,
  manual_away: null,
  ok: null,
  online: null,
  presence: null
)
```

