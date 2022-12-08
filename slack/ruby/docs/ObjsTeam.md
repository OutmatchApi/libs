# slack::ObjsTeam

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **archived** | **Boolean** |  | [optional] |
| **avatar_base_url** | **String** |  | [optional] |
| **created** | **Integer** |  | [optional] |
| **date_create** | **Integer** |  | [optional] |
| **deleted** | **Boolean** |  | [optional] |
| **description** | **String** |  | [optional] |
| **discoverable** | [**Array&lt;ObjsTeamDiscoverableInner&gt;**](ObjsTeamDiscoverableInner.md) |  | [optional] |
| **domain** | **String** |  |  |
| **email_domain** | **String** |  |  |
| **enterprise_id** | **String** |  | [optional] |
| **enterprise_name** | **String** |  | [optional] |
| **external_org_migrations** | [**ObjsExternalOrgMigrations**](ObjsExternalOrgMigrations.md) |  | [optional] |
| **has_compliance_export** | **Boolean** |  | [optional] |
| **icon** | [**ObjsIcon**](ObjsIcon.md) |  |  |
| **id** | **String** |  |  |
| **is_assigned** | **Boolean** |  | [optional] |
| **is_enterprise** | **Integer** |  | [optional] |
| **is_over_storage_limit** | **Boolean** |  | [optional] |
| **limit_ts** | **Integer** |  | [optional] |
| **locale** | **String** |  | [optional] |
| **messages_count** | **Integer** |  | [optional] |
| **msg_edit_window_mins** | **Integer** |  | [optional] |
| **name** | **String** |  |  |
| **over_integrations_limit** | **Boolean** |  | [optional] |
| **over_storage_limit** | **Boolean** |  | [optional] |
| **pay_prod_cur** | **String** |  | [optional] |
| **plan** | **String** |  | [optional] |
| **primary_owner** | [**ObjsPrimaryOwner**](ObjsPrimaryOwner.md) |  | [optional] |
| **sso_provider** | [**ObjsTeamSsoProvider**](ObjsTeamSsoProvider.md) |  | [optional] |

## Example

```ruby
require 'slack'

instance = slack::ObjsTeam.new(
  archived: null,
  avatar_base_url: null,
  created: null,
  date_create: null,
  deleted: null,
  description: null,
  discoverable: null,
  domain: null,
  email_domain: null,
  enterprise_id: null,
  enterprise_name: null,
  external_org_migrations: null,
  has_compliance_export: null,
  icon: null,
  id: null,
  is_assigned: null,
  is_enterprise: null,
  is_over_storage_limit: null,
  limit_ts: null,
  locale: null,
  messages_count: null,
  msg_edit_window_mins: null,
  name: null,
  over_integrations_limit: null,
  over_storage_limit: null,
  pay_prod_cur: null,
  plan: null,
  primary_owner: null,
  sso_provider: null
)
```

