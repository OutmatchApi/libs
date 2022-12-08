
# ObjsTeam

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **kotlin.String** |  | 
**emailDomain** | **kotlin.String** |  | 
**icon** | [**ObjsIcon**](ObjsIcon.md) |  | 
**id** | **kotlin.String** |  | 
**name** | **kotlin.String** |  | 
**archived** | **kotlin.Boolean** |  |  [optional]
**avatarBaseUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional]
**created** | **kotlin.Int** |  |  [optional]
**dateCreate** | **kotlin.Int** |  |  [optional]
**deleted** | **kotlin.Boolean** |  |  [optional]
**description** | **kotlin.String** |  |  [optional]
**discoverable** | [**kotlin.collections.List&lt;ObjsTeamDiscoverableInner&gt;**](ObjsTeamDiscoverableInner.md) |  |  [optional]
**enterpriseId** | **kotlin.String** |  |  [optional]
**enterpriseName** | **kotlin.String** |  |  [optional]
**externalOrgMigrations** | [**ObjsExternalOrgMigrations**](ObjsExternalOrgMigrations.md) |  |  [optional]
**hasComplianceExport** | **kotlin.Boolean** |  |  [optional]
**isAssigned** | **kotlin.Boolean** |  |  [optional]
**isEnterprise** | **kotlin.Int** |  |  [optional]
**isOverStorageLimit** | **kotlin.Boolean** |  |  [optional]
**limitTs** | **kotlin.Int** |  |  [optional]
**locale** | **kotlin.String** |  |  [optional]
**messagesCount** | **kotlin.Int** |  |  [optional]
**msgEditWindowMins** | **kotlin.Int** |  |  [optional]
**overIntegrationsLimit** | **kotlin.Boolean** |  |  [optional]
**overStorageLimit** | **kotlin.Boolean** |  |  [optional]
**payProdCur** | **kotlin.String** |  |  [optional]
**plan** | [**inline**](#Plan) |  |  [optional]
**primaryOwner** | [**ObjsPrimaryOwner**](ObjsPrimaryOwner.md) |  |  [optional]
**ssoProvider** | [**ObjsTeamSsoProvider**](ObjsTeamSsoProvider.md) |  |  [optional]


<a name="Plan"></a>
## Enum: plan
Name | Value
---- | -----
plan | , std, plus, compliance, enterprise



