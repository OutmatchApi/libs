/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// MigrationExchangeSuccessSchema : Schema for successful response from migration.exchange method



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct MigrationExchangeSuccessSchema {
    #[serde(rename = "enterprise_id")]
    pub enterprise_id: String,
    #[serde(rename = "invalid_user_ids", skip_serializing_if = "Option::is_none")]
    pub invalid_user_ids: Option<Vec<String>>,
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkTrue,
    #[serde(rename = "team_id")]
    pub team_id: String,
    #[serde(rename = "user_id_map", skip_serializing_if = "Option::is_none")]
    pub user_id_map: Option<::std::collections::HashMap<String, serde_json::Value>>,
}

impl MigrationExchangeSuccessSchema {
    /// Schema for successful response from migration.exchange method
    pub fn new(enterprise_id: String, ok: crate::models::DefsOkTrue, team_id: String) -> MigrationExchangeSuccessSchema {
        MigrationExchangeSuccessSchema {
            enterprise_id,
            invalid_user_ids: None,
            ok,
            team_id,
            user_id_map: None,
        }
    }
}


