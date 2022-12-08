# slack::ObjsSubteam

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auto_provision** | **Boolean** |  |  |
| **auto_type** | [**Array&lt;ObjsSubteamAutoTypeInner&gt;**](ObjsSubteamAutoTypeInner.md) |  |  |
| **channel_count** | **Integer** |  | [optional] |
| **created_by** | **String** |  |  |
| **date_create** | **Integer** |  |  |
| **date_delete** | **Integer** |  |  |
| **date_update** | **Integer** |  |  |
| **deleted_by** | [**Array&lt;ObjsSubteamDeletedByInner&gt;**](ObjsSubteamDeletedByInner.md) |  |  |
| **description** | **String** |  |  |
| **enterprise_subteam_id** | **String** |  |  |
| **handle** | **String** |  |  |
| **id** | **String** |  |  |
| **is_external** | **Boolean** |  |  |
| **is_subteam** | **Boolean** |  |  |
| **is_usergroup** | **Boolean** |  |  |
| **name** | **String** |  |  |
| **prefs** | [**ObjsSubteamPrefs**](ObjsSubteamPrefs.md) |  |  |
| **team_id** | **String** |  |  |
| **updated_by** | **String** |  |  |
| **user_count** | **Integer** |  | [optional] |
| **users** | **Array&lt;String&gt;** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ObjsSubteam.new(
  auto_provision: null,
  auto_type: null,
  channel_count: null,
  created_by: null,
  date_create: null,
  date_delete: null,
  date_update: null,
  deleted_by: null,
  description: null,
  enterprise_subteam_id: null,
  handle: null,
  id: null,
  is_external: null,
  is_subteam: null,
  is_usergroup: null,
  name: null,
  prefs: null,
  team_id: null,
  updated_by: null,
  user_count: null,
  users: null
)
```

