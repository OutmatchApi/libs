/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct ChatScheduledMessagesListSchemaScheduledMessagesInner {
    #[serde(rename = "channel_id")]
    pub channel_id: String,
    #[serde(rename = "date_created")]
    pub date_created: i32,
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "post_at")]
    pub post_at: i32,
    #[serde(rename = "text", skip_serializing_if = "Option::is_none")]
    pub text: Option<String>,
}

impl ChatScheduledMessagesListSchemaScheduledMessagesInner {
    pub fn new(channel_id: String, date_created: i32, id: String, post_at: i32) -> ChatScheduledMessagesListSchemaScheduledMessagesInner {
        ChatScheduledMessagesListSchemaScheduledMessagesInner {
            channel_id,
            date_created,
            id,
            post_at,
            text: None,
        }
    }
}


