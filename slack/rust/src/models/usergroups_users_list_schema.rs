/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// UsergroupsUsersListSchema : Schema for successful response from usergroups.users.list method



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct UsergroupsUsersListSchema {
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkTrue,
    #[serde(rename = "users")]
    pub users: Vec<String>,
}

impl UsergroupsUsersListSchema {
    /// Schema for successful response from usergroups.users.list method
    pub fn new(ok: crate::models::DefsOkTrue, users: Vec<String>) -> UsergroupsUsersListSchema {
        UsergroupsUsersListSchema {
            ok,
            users,
        }
    }
}


