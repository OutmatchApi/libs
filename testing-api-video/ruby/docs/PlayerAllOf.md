# testing-api-video::PlayerAllOf

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **assets** | [**PlayerAllOfAssets**](PlayerAllOfAssets.md) |  | [optional] |
| **created_at** | **Time** | When the player was created, presented in ISO-8601 format. | [optional] |
| **link_active** | **String** | Deprecated | [optional] |
| **player_id** | **String** |  | [optional] |
| **shape_aspect** | **String** | Deprecated | [optional] |
| **shape_background_bottom** | **String** | Deprecated | [optional] |
| **shape_background_top** | **String** | Deprecated | [optional] |
| **shape_margin** | **Integer** | Deprecated | [optional] |
| **shape_radius** | **Integer** | Deprecated | [optional] |
| **updated_at** | **Time** | When the player was last updated, presented in ISO-8601 format. | [optional] |

## Example

```ruby
require 'testing-api-video'

instance = testing-api-video::PlayerAllOf.new(
  assets: null,
  created_at: 2020-01-31T10:17:47Z,
  link_active: null,
  player_id: pl45KFKdlddgk654dspkze,
  shape_aspect: null,
  shape_background_bottom: null,
  shape_background_top: null,
  shape_margin: null,
  shape_radius: null,
  updated_at: 2020-01-31T10:18:47Z
)
```

