/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// ReactionsListErrorSchema : Schema for error response from reactions.list method



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct ReactionsListErrorSchema {
    /// Note: PHP callstack is only visible in dev/qa
    #[serde(rename = "callstack", skip_serializing_if = "Option::is_none")]
    pub callstack: Option<String>,
    #[serde(rename = "error")]
    pub error: Error,
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkFalse,
}

impl ReactionsListErrorSchema {
    /// Schema for error response from reactions.list method
    pub fn new(error: Error, ok: crate::models::DefsOkFalse) -> ReactionsListErrorSchema {
        ReactionsListErrorSchema {
            callstack: None,
            error,
            ok,
        }
    }
}

/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Error {
    #[serde(rename = "user_not_found")]
    UserNotFound,
    #[serde(rename = "not_authed")]
    NotAuthed,
    #[serde(rename = "invalid_auth")]
    InvalidAuth,
    #[serde(rename = "account_inactiv")]
    AccountInactiv,
    #[serde(rename = "no_permission")]
    NoPermission,
    #[serde(rename = "invalid_arg_name")]
    InvalidArgName,
    #[serde(rename = "invalid_array_arg")]
    InvalidArrayArg,
    #[serde(rename = "invalid_charset")]
    InvalidCharset,
    #[serde(rename = "invalid_form_data")]
    InvalidFormData,
    #[serde(rename = "invalid_post_type")]
    InvalidPostType,
    #[serde(rename = "missing_post_type")]
    MissingPostType,
    #[serde(rename = "team_added_to_org")]
    TeamAddedToOrg,
    #[serde(rename = "invalid_json")]
    InvalidJson,
    #[serde(rename = "json_not_object")]
    JsonNotObject,
    #[serde(rename = "request_timeout")]
    RequestTimeout,
    #[serde(rename = "upgrade_required")]
    UpgradeRequired,
    #[serde(rename = "fatal_error")]
    FatalError,
}

impl Default for Error {
    fn default() -> Error {
        Self::UserNotFound
    }
}
