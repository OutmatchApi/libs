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
pub struct PinsListSuccessSchemaInnerAnyOfItemsInner {
    #[serde(rename = "created", skip_serializing_if = "Option::is_none")]
    pub created: Option<i32>,
    #[serde(rename = "created_by", skip_serializing_if = "Option::is_none")]
    pub created_by: Option<String>,
    #[serde(rename = "file", skip_serializing_if = "Option::is_none")]
    pub file: Option<Box<crate::models::ObjsFile>>,
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<RHashType>,
    #[serde(rename = "channel", skip_serializing_if = "Option::is_none")]
    pub channel: Option<String>,
    #[serde(rename = "message", skip_serializing_if = "Option::is_none")]
    pub message: Option<Box<crate::models::ObjsMessage>>,
}

impl PinsListSuccessSchemaInnerAnyOfItemsInner {
    pub fn new() -> PinsListSuccessSchemaInnerAnyOfItemsInner {
        PinsListSuccessSchemaInnerAnyOfItemsInner {
            created: None,
            created_by: None,
            file: None,
            r#type: None,
            channel: None,
            message: None,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum RHashType {
    #[serde(rename = "message")]
    Message,
}

impl Default for RHashType {
    fn default() -> RHashType {
        Self::Message
    }
}
