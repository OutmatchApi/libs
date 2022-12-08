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
pub struct ConversationImChannelObjectFromConversationsMethods {
    #[serde(rename = "created")]
    pub created: i32,
    #[serde(rename = "has_pins", skip_serializing_if = "Option::is_none")]
    pub has_pins: Option<bool>,
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "is_archived", skip_serializing_if = "Option::is_none")]
    pub is_archived: Option<bool>,
    #[serde(rename = "is_ext_shared", skip_serializing_if = "Option::is_none")]
    pub is_ext_shared: Option<bool>,
    #[serde(rename = "is_frozen", skip_serializing_if = "Option::is_none")]
    pub is_frozen: Option<bool>,
    #[serde(rename = "is_im")]
    pub is_im: bool,
    #[serde(rename = "is_open", skip_serializing_if = "Option::is_none")]
    pub is_open: Option<bool>,
    #[serde(rename = "is_org_shared")]
    pub is_org_shared: bool,
    #[serde(rename = "is_shared", skip_serializing_if = "Option::is_none")]
    pub is_shared: Option<bool>,
    #[serde(rename = "is_starred", skip_serializing_if = "Option::is_none")]
    pub is_starred: Option<bool>,
    #[serde(rename = "is_user_deleted", skip_serializing_if = "Option::is_none")]
    pub is_user_deleted: Option<bool>,
    #[serde(rename = "last_read", skip_serializing_if = "Option::is_none")]
    pub last_read: Option<String>,
    #[serde(rename = "latest", skip_serializing_if = "Option::is_none")]
    pub latest: Option<Vec<crate::models::ObjsChannelLatestInner>>,
    #[serde(rename = "parent_conversation", skip_serializing_if = "Option::is_none")]
    pub parent_conversation: Option<Vec<crate::models::ConversationObjectParentConversationInner>>,
    #[serde(rename = "pin_count", skip_serializing_if = "Option::is_none")]
    pub pin_count: Option<i32>,
    #[serde(rename = "priority")]
    pub priority: f32,
    #[serde(rename = "shares", skip_serializing_if = "Option::is_none")]
    pub shares: Option<Vec<crate::models::ConversationImChannelObjectFromConversationsMethodsSharesInner>>,
    #[serde(rename = "unread_count", skip_serializing_if = "Option::is_none")]
    pub unread_count: Option<i32>,
    #[serde(rename = "unread_count_display", skip_serializing_if = "Option::is_none")]
    pub unread_count_display: Option<i32>,
    #[serde(rename = "user")]
    pub user: String,
    #[serde(rename = "version", skip_serializing_if = "Option::is_none")]
    pub version: Option<i32>,
}

impl ConversationImChannelObjectFromConversationsMethods {
    pub fn new(created: i32, id: String, is_im: bool, is_org_shared: bool, priority: f32, user: String) -> ConversationImChannelObjectFromConversationsMethods {
        ConversationImChannelObjectFromConversationsMethods {
            created,
            has_pins: None,
            id,
            is_archived: None,
            is_ext_shared: None,
            is_frozen: None,
            is_im,
            is_open: None,
            is_org_shared,
            is_shared: None,
            is_starred: None,
            is_user_deleted: None,
            last_read: None,
            latest: None,
            parent_conversation: None,
            pin_count: None,
            priority,
            shares: None,
            unread_count: None,
            unread_count_display: None,
            user,
            version: None,
        }
    }
}


