/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// DndSetSnoozeSchema : Schema for successful response from dnd.setSnooze method



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct DndSetSnoozeSchema {
    #[serde(rename = "ok")]
    pub ok: crate::models::DefsOkTrue,
    #[serde(rename = "snooze_enabled")]
    pub snooze_enabled: bool,
    #[serde(rename = "snooze_endtime")]
    pub snooze_endtime: i32,
    #[serde(rename = "snooze_remaining")]
    pub snooze_remaining: i32,
}

impl DndSetSnoozeSchema {
    /// Schema for successful response from dnd.setSnooze method
    pub fn new(ok: crate::models::DefsOkTrue, snooze_enabled: bool, snooze_endtime: i32, snooze_remaining: i32) -> DndSetSnoozeSchema {
        DndSetSnoozeSchema {
            ok,
            snooze_enabled,
            snooze_endtime,
            snooze_remaining,
        }
    }
}


