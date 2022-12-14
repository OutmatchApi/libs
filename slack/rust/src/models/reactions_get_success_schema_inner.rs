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
pub struct ReactionsGetSuccessSchemaInner {
    #[serde(rename = "channel")]
    pub channel: String,
    #[serde(rename = "message")]
    pub message: Box<crate::models::ObjsMessage>,
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkTrue,
    #[serde(rename = "type")]
    pub r#type: RHashType,
    #[serde(rename = "file")]
    pub file: Box<crate::models::ObjsFile>,
    #[serde(rename = "comment")]
    pub comment: Box<crate::models::ObjsComment>,
}

impl ReactionsGetSuccessSchemaInner {
    pub fn new(channel: String, message: crate::models::ObjsMessage, ok: crate::models::DefsOkTrue, r#type: RHashType, file: crate::models::ObjsFile, comment: crate::models::ObjsComment) -> ReactionsGetSuccessSchemaInner {
        ReactionsGetSuccessSchemaInner {
            channel,
            message: Box::new(message),
            ok,
            r#type,
            file: Box::new(file),
            comment: Box::new(comment),
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum RHashType {
    #[serde(rename = "file_comment")]
    FileComment,
}

impl Default for RHashType {
    fn default() -> RHashType {
        Self::FileComment
    }
}

