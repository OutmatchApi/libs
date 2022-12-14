/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// AdminConversationsSearchErrorSchema : Schema for error response from admin.conversations.search



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct AdminConversationsSearchErrorSchema {
    #[serde(rename = "error")]
    pub error: Error,
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkFalse,
}

impl AdminConversationsSearchErrorSchema {
    /// Schema for error response from admin.conversations.search
    pub fn new(error: Error, ok: crate::models::DefsOkFalse) -> AdminConversationsSearchErrorSchema {
        AdminConversationsSearchErrorSchema {
            error,
            ok,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Error {
    #[serde(rename = "feature_not_enabled")]
    FeatureNotEnabled,
    #[serde(rename = "not_an_admin")]
    NotAnAdmin,
    #[serde(rename = "not_an_enterprise")]
    NotAnEnterprise,
    #[serde(rename = "team_not_found")]
    TeamNotFound,
    #[serde(rename = "not_allowed")]
    NotAllowed,
    #[serde(rename = "invalid_auth")]
    InvalidAuth,
    #[serde(rename = "invalid_cursor")]
    InvalidCursor,
    #[serde(rename = "invalid_search_channel_type")]
    InvalidSearchChannelType,
    #[serde(rename = "invalid_sort")]
    InvalidSort,
    #[serde(rename = "invalid_sort_dir")]
    InvalidSortDir,
}

impl Default for Error {
    fn default() -> Error {
        Self::FeatureNotEnabled
    }
}

