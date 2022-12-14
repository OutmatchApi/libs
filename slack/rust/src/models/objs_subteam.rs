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
pub struct ObjsSubteam {
    #[serde(rename = "auto_provision")]
    pub auto_provision: bool,
    #[serde(rename = "auto_type")]
    pub auto_type: Vec<crate::models::ObjsSubteamAutoTypeInner>,
    #[serde(rename = "channel_count", skip_serializing_if = "Option::is_none")]
    pub channel_count: Option<i32>,
    #[serde(rename = "created_by")]
    pub created_by: String,
    #[serde(rename = "date_create")]
    pub date_create: i32,
    #[serde(rename = "date_delete")]
    pub date_delete: i32,
    #[serde(rename = "date_update")]
    pub date_update: i32,
    #[serde(rename = "deleted_by")]
    pub deleted_by: Vec<crate::models::ObjsSubteamDeletedByInner>,
    #[serde(rename = "description")]
    pub description: String,
    #[serde(rename = "enterprise_subteam_id")]
    pub enterprise_subteam_id: String,
    #[serde(rename = "handle")]
    pub handle: String,
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "is_external")]
    pub is_external: bool,
    #[serde(rename = "is_subteam")]
    pub is_subteam: bool,
    #[serde(rename = "is_usergroup")]
    pub is_usergroup: bool,
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "prefs")]
    pub prefs: Box<crate::models::ObjsSubteamPrefs>,
    #[serde(rename = "team_id")]
    pub team_id: String,
    #[serde(rename = "updated_by")]
    pub updated_by: String,
    #[serde(rename = "user_count", skip_serializing_if = "Option::is_none")]
    pub user_count: Option<i32>,
    #[serde(rename = "users", skip_serializing_if = "Option::is_none")]
    pub users: Option<Vec<String>>,
}

impl ObjsSubteam {
    pub fn new(auto_provision: bool, auto_type: Vec<crate::models::ObjsSubteamAutoTypeInner>, created_by: String, date_create: i32, date_delete: i32, date_update: i32, deleted_by: Vec<crate::models::ObjsSubteamDeletedByInner>, description: String, enterprise_subteam_id: String, handle: String, id: String, is_external: bool, is_subteam: bool, is_usergroup: bool, name: String, prefs: crate::models::ObjsSubteamPrefs, team_id: String, updated_by: String) -> ObjsSubteam {
        ObjsSubteam {
            auto_provision,
            auto_type,
            channel_count: None,
            created_by,
            date_create,
            date_delete,
            date_update,
            deleted_by,
            description,
            enterprise_subteam_id,
            handle,
            id,
            is_external,
            is_subteam,
            is_usergroup,
            name,
            prefs: Box::new(prefs),
            team_id,
            updated_by,
            user_count: None,
            users: None,
        }
    }
}


