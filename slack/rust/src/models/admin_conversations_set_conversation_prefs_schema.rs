/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// AdminConversationsSetConversationPrefsSchema : Schema for successful response of admin.conversations.setConversationPrefs



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct AdminConversationsSetConversationPrefsSchema {
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkTrue,
}

impl AdminConversationsSetConversationPrefsSchema {
    /// Schema for successful response of admin.conversations.setConversationPrefs
    pub fn new(ok: crate::models::DefsOkTrue) -> AdminConversationsSetConversationPrefsSchema {
        AdminConversationsSetConversationPrefsSchema {
            ok,
        }
    }
}


