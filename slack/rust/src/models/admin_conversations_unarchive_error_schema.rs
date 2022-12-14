/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// AdminConversationsUnarchiveErrorSchema : Schema for error response from admin.conversations.getConversationPrefs



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct AdminConversationsUnarchiveErrorSchema {
    #[serde(rename = "error")]
    pub error: Error,
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkFalse,
}

impl AdminConversationsUnarchiveErrorSchema {
    /// Schema for error response from admin.conversations.getConversationPrefs
    pub fn new(error: Error, ok: crate::models::DefsOkFalse) -> AdminConversationsUnarchiveErrorSchema {
        AdminConversationsUnarchiveErrorSchema {
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
    #[serde(rename = "restricted_action")]
    RestrictedAction,
    #[serde(rename = "missing_scope")]
    MissingScope,
    #[serde(rename = "channel_not_found")]
    ChannelNotFound,
    #[serde(rename = "channel_type_not_supported")]
    ChannelTypeNotSupported,
    #[serde(rename = "could_not_get_conversation_prefs")]
    CouldNotGetConversationPrefs,
}

impl Default for Error {
    fn default() -> Error {
        Self::FeatureNotEnabled
    }
}

