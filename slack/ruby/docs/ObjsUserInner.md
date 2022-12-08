# slack::ObjsUserInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **color** | **String** | refercing to bug: https://jira.tinyspeck.com/browse/EVALUE-1559 | [optional] |
| **deleted** | **Boolean** |  | [optional] |
| **enterprise_user** | [**ObjsEnterpriseUser**](ObjsEnterpriseUser.md) |  | [optional] |
| **has_2fa** | **Boolean** |  | [optional] |
| **id** | **String** |  |  |
| **is_admin** | **Boolean** |  | [optional] |
| **is_app_user** | **Boolean** |  |  |
| **is_bot** | **Boolean** |  |  |
| **is_external** | **Boolean** |  | [optional] |
| **is_forgotten** | **Boolean** |  | [optional] |
| **is_invited_user** | **Boolean** |  | [optional] |
| **is_owner** | **Boolean** |  | [optional] |
| **is_primary_owner** | **Boolean** |  | [optional] |
| **is_restricted** | **Boolean** |  | [optional] |
| **is_stranger** | **Boolean** |  | [optional] |
| **is_ultra_restricted** | **Boolean** |  | [optional] |
| **locale** | **String** |  | [optional] |
| **name** | **String** |  |  |
| **presence** | **String** |  | [optional] |
| **profile** | [**ObjsUserProfile**](ObjsUserProfile.md) |  |  |
| **real_name** | **String** |  | [optional] |
| **team** | **String** |  | [optional] |
| **team_id** | **String** |  | [optional] |
| **team_profile** | [**ObjsUserInnerAnyOfTeamProfile**](ObjsUserInnerAnyOfTeamProfile.md) |  | [optional] |
| **two_factor_type** | **String** |  | [optional] |
| **tz** | [**Array&lt;ObjsTeamDiscoverableInner&gt;**](ObjsTeamDiscoverableInner.md) |  | [optional] |
| **tz_label** | **String** |  | [optional] |
| **tz_offset** | **Float** |  | [optional] |
| **updated** | **Float** |  |  |
| **teams** | **Array&lt;String&gt;** |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ObjsUserInner.new(
  color: null,
  deleted: null,
  enterprise_user: null,
  has_2fa: null,
  id: null,
  is_admin: null,
  is_app_user: null,
  is_bot: null,
  is_external: null,
  is_forgotten: null,
  is_invited_user: null,
  is_owner: null,
  is_primary_owner: null,
  is_restricted: null,
  is_stranger: null,
  is_ultra_restricted: null,
  locale: null,
  name: null,
  presence: null,
  profile: null,
  real_name: null,
  team: null,
  team_id: null,
  team_profile: null,
  two_factor_type: null,
  tz: null,
  tz_label: null,
  tz_offset: null,
  updated: null,
  teams: null
)
```

