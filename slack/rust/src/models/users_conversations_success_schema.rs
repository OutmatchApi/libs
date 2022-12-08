/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// UsersConversationsSuccessSchema : Schema for successful response from users.conversations method. Returned conversation objects do not include `num_members` or `is_member`



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct UsersConversationsSuccessSchema {
    #[serde(rename = "channels")]
    pub channels: Vec<crate::models::Array>,
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkTrue,
    #[serde(rename = "response_metadata", skip_serializing_if = "Option::is_none")]
    pub response_metadata: Option<Box<crate::models::AdminConversationsGetTeamsSchemaResponseMetadata>>,
}

impl UsersConversationsSuccessSchema {
    /// Schema for successful response from users.conversations method. Returned conversation objects do not include `num_members` or `is_member`
    pub fn new(channels: Vec<crate::models::Array>, ok: crate::models::DefsOkTrue) -> UsersConversationsSuccessSchema {
        UsersConversationsSuccessSchema {
            channels,
            ok,
            response_metadata: None,
        }
    }
}


