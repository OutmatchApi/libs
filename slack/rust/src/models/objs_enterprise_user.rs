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
pub struct ObjsEnterpriseUser {
    #[serde(rename = "enterprise_id")]
    pub enterprise_id: String,
    #[serde(rename = "enterprise_name")]
    pub enterprise_name: String,
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "is_admin")]
    pub is_admin: bool,
    #[serde(rename = "is_owner")]
    pub is_owner: bool,
    #[serde(rename = "teams")]
    pub teams: Vec<String>,
}

impl ObjsEnterpriseUser {
    pub fn new(enterprise_id: String, enterprise_name: String, id: String, is_admin: bool, is_owner: bool, teams: Vec<String>) -> ObjsEnterpriseUser {
        ObjsEnterpriseUser {
            enterprise_id,
            enterprise_name,
            id,
            is_admin,
            is_owner,
            teams,
        }
    }
}


