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
pub struct ReactionsGetSuccessSchemaInnerAnyOf1 {
    #[serde(rename = "file")]
    pub file: Box<crate::models::ObjsFile>,
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkTrue,
    #[serde(rename = "type")]
    pub r#type: RHashType,
}

impl ReactionsGetSuccessSchemaInnerAnyOf1 {
    pub fn new(file: crate::models::ObjsFile, ok: crate::models::DefsOkTrue, r#type: RHashType) -> ReactionsGetSuccessSchemaInnerAnyOf1 {
        ReactionsGetSuccessSchemaInnerAnyOf1 {
            file: Box::new(file),
            ok,
            r#type,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum RHashType {
    #[serde(rename = "file")]
    File,
}

impl Default for RHashType {
    fn default() -> RHashType {
        Self::File
    }
}

