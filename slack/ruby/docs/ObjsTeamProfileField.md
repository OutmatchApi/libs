# slack::ObjsTeamProfileField

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **field_name** | **String** |  | [optional] |
| **hint** | **String** |  |  |
| **id** | **String** |  |  |
| **is_hidden** | **Boolean** |  | [optional] |
| **label** | **String** |  |  |
| **options** | [**Array&lt;ObjsTeamProfileFieldOptionsInner&gt;**](ObjsTeamProfileFieldOptionsInner.md) |  | [optional] |
| **ordering** | **Float** |  |  |
| **possible_values** | **Array&lt;String&gt;** |  | [optional] |
| **type** | **String** |  |  |

## Example

```ruby
require 'slack'

instance = slack::ObjsTeamProfileField.new(
  field_name: null,
  hint: null,
  id: null,
  is_hidden: null,
  label: null,
  options: null,
  ordering: null,
  possible_values: null,
  type: null
)
```

