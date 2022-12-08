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
pub struct AppsPermissionsInfoSchemaInfoAppHome {
    #[serde(rename = "resources", skip_serializing_if = "Option::is_none")]
    pub resources: Option<Box<crate::models::ObjsResources>>,
    #[serde(rename = "scopes", skip_serializing_if = "Option::is_none")]
    pub scopes: Option<Vec<String>>,
}

impl AppsPermissionsInfoSchemaInfoAppHome {
    pub fn new() -> AppsPermissionsInfoSchemaInfoAppHome {
        AppsPermissionsInfoSchemaInfoAppHome {
            resources: None,
            scopes: None,
        }
    }
}

