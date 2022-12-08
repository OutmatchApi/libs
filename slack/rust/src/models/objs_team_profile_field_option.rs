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
pub struct ObjsTeamProfileFieldOption {
    #[serde(rename = "is_custom", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub is_custom: Option<Option<bool>>,
    #[serde(rename = "is_multiple_entry", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub is_multiple_entry: Option<Option<bool>>,
    #[serde(rename = "is_protected", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub is_protected: Option<Option<bool>>,
    #[serde(rename = "is_scim", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub is_scim: Option<Option<bool>>,
}

impl ObjsTeamProfileFieldOption {
    pub fn new() -> ObjsTeamProfileFieldOption {
        ObjsTeamProfileFieldOption {
            is_custom: None,
            is_multiple_entry: None,
            is_protected: None,
            is_scim: None,
        }
    }
}


