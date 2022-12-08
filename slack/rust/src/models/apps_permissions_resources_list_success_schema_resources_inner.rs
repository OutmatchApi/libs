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
pub struct AppsPermissionsResourcesListSuccessSchemaResourcesInner {
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<String>,
}

impl AppsPermissionsResourcesListSuccessSchemaResourcesInner {
    pub fn new() -> AppsPermissionsResourcesListSuccessSchemaResourcesInner {
        AppsPermissionsResourcesListSuccessSchemaResourcesInner {
            id: None,
            r#type: None,
        }
    }
}


