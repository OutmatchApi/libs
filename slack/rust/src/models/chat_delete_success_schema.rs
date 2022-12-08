/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// ChatDeleteSuccessSchema : Schema for successful response of chat.delete method



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct ChatDeleteSuccessSchema {
    #[serde(rename = "channel")]
    pub channel: String,
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkTrue,
    #[serde(rename = "ts")]
    pub ts: String,
}

impl ChatDeleteSuccessSchema {
    /// Schema for successful response of chat.delete method
    pub fn new(channel: String, ok: crate::models::DefsOkTrue, ts: String) -> ChatDeleteSuccessSchema {
        ChatDeleteSuccessSchema {
            channel,
            ok,
            ts,
        }
    }
}


