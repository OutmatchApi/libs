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
pub struct ObjsIcon {
    #[serde(rename = "image_102", skip_serializing_if = "Option::is_none")]
    pub image_102: Option<String>,
    #[serde(rename = "image_132", skip_serializing_if = "Option::is_none")]
    pub image_132: Option<String>,
    #[serde(rename = "image_230", skip_serializing_if = "Option::is_none")]
    pub image_230: Option<String>,
    #[serde(rename = "image_34", skip_serializing_if = "Option::is_none")]
    pub image_34: Option<String>,
    #[serde(rename = "image_44", skip_serializing_if = "Option::is_none")]
    pub image_44: Option<String>,
    #[serde(rename = "image_68", skip_serializing_if = "Option::is_none")]
    pub image_68: Option<String>,
    #[serde(rename = "image_88", skip_serializing_if = "Option::is_none")]
    pub image_88: Option<String>,
    #[serde(rename = "image_default", skip_serializing_if = "Option::is_none")]
    pub image_default: Option<bool>,
}

impl ObjsIcon {
    pub fn new() -> ObjsIcon {
        ObjsIcon {
            image_102: None,
            image_132: None,
            image_230: None,
            image_34: None,
            image_44: None,
            image_68: None,
            image_88: None,
            image_default: None,
        }
    }
}

