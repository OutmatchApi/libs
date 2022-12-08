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
pub struct StarsListSchemaItemsInnerInnerAnyOf1 {
    #[serde(rename = "date_create")]
    pub date_create: i32,
    #[serde(rename = "file")]
    pub file: Box<crate::models::ObjsFile>,
    #[serde(rename = "type")]
    pub r#type: RHashType,
}

impl StarsListSchemaItemsInnerInnerAnyOf1 {
    pub fn new(date_create: i32, file: crate::models::ObjsFile, r#type: RHashType) -> StarsListSchemaItemsInnerInnerAnyOf1 {
        StarsListSchemaItemsInnerInnerAnyOf1 {
            date_create,
            file: Box::new(file),
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
