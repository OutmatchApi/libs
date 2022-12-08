# slack::AppsPermissionsInfoSchemaInfo

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_home** | [**AppsPermissionsInfoSchemaInfoAppHome**](AppsPermissionsInfoSchemaInfoAppHome.md) |  |  |
| **channel** | [**AppsPermissionsInfoSchemaInfoAppHome**](AppsPermissionsInfoSchemaInfoAppHome.md) |  |  |
| **group** | [**AppsPermissionsInfoSchemaInfoAppHome**](AppsPermissionsInfoSchemaInfoAppHome.md) |  |  |
| **im** | [**AppsPermissionsInfoSchemaInfoAppHome**](AppsPermissionsInfoSchemaInfoAppHome.md) |  |  |
| **mpim** | [**AppsPermissionsInfoSchemaInfoAppHome**](AppsPermissionsInfoSchemaInfoAppHome.md) |  |  |
| **team** | [**AppsPermissionsInfoSchemaInfoTeam**](AppsPermissionsInfoSchemaInfoTeam.md) |  |  |

## Example

```ruby
require 'slack'

instance = slack::AppsPermissionsInfoSchemaInfo.new(
  app_home: null,
  channel: null,
  group: null,
  im: null,
  mpim: null,
  team: null
)
```

