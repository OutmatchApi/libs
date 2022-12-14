/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// ObjsUserInnerAnyOf : user object for non enterprise type



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct ObjsUserInnerAnyOf {
    #[serde(rename = "color", skip_serializing_if = "Option::is_none")]
    pub color: Option<String>,
    #[serde(rename = "deleted", skip_serializing_if = "Option::is_none")]
    pub deleted: Option<bool>,
    #[serde(rename = "enterprise_user", skip_serializing_if = "Option::is_none")]
    pub enterprise_user: Option<Box<crate::models::ObjsEnterpriseUser>>,
    #[serde(rename = "has_2fa", skip_serializing_if = "Option::is_none")]
    pub has_2fa: Option<bool>,
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "is_admin", skip_serializing_if = "Option::is_none")]
    pub is_admin: Option<bool>,
    #[serde(rename = "is_app_user")]
    pub is_app_user: bool,
    #[serde(rename = "is_bot")]
    pub is_bot: bool,
    #[serde(rename = "is_external", skip_serializing_if = "Option::is_none")]
    pub is_external: Option<bool>,
    #[serde(rename = "is_forgotten", skip_serializing_if = "Option::is_none")]
    pub is_forgotten: Option<bool>,
    #[serde(rename = "is_invited_user", skip_serializing_if = "Option::is_none")]
    pub is_invited_user: Option<bool>,
    #[serde(rename = "is_owner", skip_serializing_if = "Option::is_none")]
    pub is_owner: Option<bool>,
    #[serde(rename = "is_primary_owner", skip_serializing_if = "Option::is_none")]
    pub is_primary_owner: Option<bool>,
    #[serde(rename = "is_restricted", skip_serializing_if = "Option::is_none")]
    pub is_restricted: Option<bool>,
    #[serde(rename = "is_stranger", skip_serializing_if = "Option::is_none")]
    pub is_stranger: Option<bool>,
    #[serde(rename = "is_ultra_restricted", skip_serializing_if = "Option::is_none")]
    pub is_ultra_restricted: Option<bool>,
    #[serde(rename = "locale", skip_serializing_if = "Option::is_none")]
    pub locale: Option<String>,
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "presence", skip_serializing_if = "Option::is_none")]
    pub presence: Option<String>,
    #[serde(rename = "profile")]
    pub profile: Box<crate::models::ObjsUserProfile>,
    #[serde(rename = "real_name", skip_serializing_if = "Option::is_none")]
    pub real_name: Option<String>,
    #[serde(rename = "team", skip_serializing_if = "Option::is_none")]
    pub team: Option<String>,
    #[serde(rename = "team_id", skip_serializing_if = "Option::is_none")]
    pub team_id: Option<String>,
    #[serde(rename = "team_profile", skip_serializing_if = "Option::is_none")]
    pub team_profile: Option<Box<crate::models::ObjsUserInnerAnyOfTeamProfile>>,
    #[serde(rename = "two_factor_type", skip_serializing_if = "Option::is_none")]
    pub two_factor_type: Option<String>,
    #[serde(rename = "tz", skip_serializing_if = "Option::is_none")]
    pub tz: Option<Vec<crate::models::ObjsTeamDiscoverableInner>>,
    #[serde(rename = "tz_label", skip_serializing_if = "Option::is_none")]
    pub tz_label: Option<String>,
    #[serde(rename = "tz_offset", skip_serializing_if = "Option::is_none")]
    pub tz_offset: Option<f32>,
    #[serde(rename = "updated")]
    pub updated: f32,
}

impl ObjsUserInnerAnyOf {
    /// user object for non enterprise type
    pub fn new(id: String, is_app_user: bool, is_bot: bool, name: String, profile: crate::models::ObjsUserProfile, updated: f32) -> ObjsUserInnerAnyOf {
        ObjsUserInnerAnyOf {
            color: None,
            deleted: None,
            enterprise_user: None,
            has_2fa: None,
            id,
            is_admin: None,
            is_app_user,
            is_bot,
            is_external: None,
            is_forgotten: None,
            is_invited_user: None,
            is_owner: None,
            is_primary_owner: None,
            is_restricted: None,
            is_stranger: None,
            is_ultra_restricted: None,
            locale: None,
            name,
            presence: None,
            profile: Box::new(profile),
            real_name: None,
            team: None,
            team_id: None,
            team_profile: None,
            two_factor_type: None,
            tz: None,
            tz_label: None,
            tz_offset: None,
            updated,
        }
    }
}


