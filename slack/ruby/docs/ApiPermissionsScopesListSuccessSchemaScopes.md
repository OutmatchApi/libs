# slack::ApiPermissionsScopesListSuccessSchemaScopes

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **app_home** | **Array&lt;String&gt;** |  | [optional] |
| **channel** | **Array&lt;String&gt;** |  | [optional] |
| **group** | **Array&lt;String&gt;** |  | [optional] |
| **im** | **Array&lt;String&gt;** |  | [optional] |
| **mpim** | **Array&lt;String&gt;** |  | [optional] |
| **team** | **Array&lt;String&gt;** |  | [optional] |
| **user** | **Array&lt;String&gt;** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ApiPermissionsScopesListSuccessSchemaScopes.new(
  app_home: null,
  channel: null,
  group: null,
  im: null,
  mpim: null,
  team: null,
  user: null
)
```

