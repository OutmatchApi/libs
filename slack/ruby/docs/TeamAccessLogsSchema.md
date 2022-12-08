# slack::TeamAccessLogsSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **logins** | [**Array&lt;TeamAccessLogsSchemaLoginsInner&gt;**](TeamAccessLogsSchemaLoginsInner.md) |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **paging** | [**ObjsPaging**](ObjsPaging.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::TeamAccessLogsSchema.new(
  logins: null,
  ok: null,
  paging: null
)
```

