/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// UsersIdentitySchemaInnerAnyOf3 : Schema for 'identity.basic,identity.team' scopes



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct UsersIdentitySchemaInnerAnyOf3 {
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkTrue,
    #[serde(rename = "team")]
    pub team: Box<crate::models::UsersIdentitySchemaInnerAnyOf3Team>,
    #[serde(rename = "user")]
    pub user: Box<crate::models::RtmConnectSchemaSelf>,
}

impl UsersIdentitySchemaInnerAnyOf3 {
    /// Schema for 'identity.basic,identity.team' scopes
    pub fn new(ok: crate::models::DefsOkTrue, team: crate::models::UsersIdentitySchemaInnerAnyOf3Team, user: crate::models::RtmConnectSchemaSelf) -> UsersIdentitySchemaInnerAnyOf3 {
        UsersIdentitySchemaInnerAnyOf3 {
            ok,
            team: Box::new(team),
            user: Box::new(user),
        }
    }
}


