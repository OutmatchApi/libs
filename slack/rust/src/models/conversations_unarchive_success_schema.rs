/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// ConversationsUnarchiveSuccessSchema : Schema for successful response from conversations.unarchive method



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct ConversationsUnarchiveSuccessSchema {
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkTrue,
}

impl ConversationsUnarchiveSuccessSchema {
    /// Schema for successful response from conversations.unarchive method
    pub fn new(ok: crate::models::DefsOkTrue) -> ConversationsUnarchiveSuccessSchema {
        ConversationsUnarchiveSuccessSchema {
            ok,
        }
    }
}


