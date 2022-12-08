# slack::TeamIntegrationLogsSchema

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **logs** | [**Array&lt;TeamIntegrationLogsSchemaLogsInner&gt;**](TeamIntegrationLogsSchemaLogsInner.md) |  |  |
| **ok** | [**DefsOkTrue**](DefsOkTrue.md) |  |  |
| **paging** | [**ObjsPaging**](ObjsPaging.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::TeamIntegrationLogsSchema.new(
  logs: null,
  ok: null,
  paging: null
)
```

