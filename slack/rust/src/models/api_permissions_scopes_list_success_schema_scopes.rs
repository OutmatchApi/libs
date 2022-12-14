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
pub struct ApiPermissionsScopesListSuccessSchemaScopes {
    #[serde(rename = "app_home", skip_serializing_if = "Option::is_none")]
    pub app_home: Option<Vec<String>>,
    #[serde(rename = "channel", skip_serializing_if = "Option::is_none")]
    pub channel: Option<Vec<String>>,
    #[serde(rename = "group", skip_serializing_if = "Option::is_none")]
    pub group: Option<Vec<String>>,
    #[serde(rename = "im", skip_serializing_if = "Option::is_none")]
    pub im: Option<Vec<String>>,
    #[serde(rename = "mpim", skip_serializing_if = "Option::is_none")]
    pub mpim: Option<Vec<String>>,
    #[serde(rename = "team", skip_serializing_if = "Option::is_none")]
    pub team: Option<Vec<String>>,
    #[serde(rename = "user", skip_serializing_if = "Option::is_none")]
    pub user: Option<Vec<String>>,
}

impl ApiPermissionsScopesListSuccessSchemaScopes {
    pub fn new() -> ApiPermissionsScopesListSuccessSchemaScopes {
        ApiPermissionsScopesListSuccessSchemaScopes {
            app_home: None,
            channel: None,
            group: None,
            im: None,
            mpim: None,
            team: None,
            user: None,
        }
    }
}


