/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// UsergroupsCreateSchema : Schema for successful response from usergroups.create method



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct UsergroupsCreateSchema {
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkTrue,
    #[serde(rename = "usergroup")]
    pub usergroup: Box<crate::models::ObjsSubteam>,
}

impl UsergroupsCreateSchema {
    /// Schema for successful response from usergroups.create method
    pub fn new(ok: crate::models::DefsOkTrue, usergroup: crate::models::ObjsSubteam) -> UsergroupsCreateSchema {
        UsergroupsCreateSchema {
            ok,
            usergroup: Box::new(usergroup),
        }
    }
}


