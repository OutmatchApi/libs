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
pub struct StarsListSchemaItemsInnerInnerAnyOf5 {
    #[serde(rename = "channel")]
    pub channel: String,
    #[serde(rename = "date_create")]
    pub date_create: i32,
    #[serde(rename = "type")]
    pub r#type: RHashType,
}

impl StarsListSchemaItemsInnerInnerAnyOf5 {
    pub fn new(channel: String, date_create: i32, r#type: RHashType) -> StarsListSchemaItemsInnerInnerAnyOf5 {
        StarsListSchemaItemsInnerInnerAnyOf5 {
            channel,
            date_create,
            r#type,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum RHashType {
    #[serde(rename = "group")]
    Group,
}

impl Default for RHashType {
    fn default() -> RHashType {
        Self::Group
    }
}

