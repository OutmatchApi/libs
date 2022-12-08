/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// ConversationsSetTopicSuccessSchema : Schema for successful response from conversations.setTopic method



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct ConversationsSetTopicSuccessSchema {
    #[serde(rename = "channel")]
    pub channel: Vec<crate::models::ObjsConversationInner>,
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkTrue,
}

impl ConversationsSetTopicSuccessSchema {
    /// Schema for successful response from conversations.setTopic method
    pub fn new(channel: Vec<crate::models::ObjsConversationInner>, ok: crate::models::DefsOkTrue) -> ConversationsSetTopicSuccessSchema {
        ConversationsSetTopicSuccessSchema {
            channel,
            ok,
        }
    }
}

