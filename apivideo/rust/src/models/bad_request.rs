/*
 * api.video
 *
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct BadRequest {
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    #[serde(rename = "problems", skip_serializing_if = "Option::is_none")]
    pub problems: Option<Vec<crate::models::BadRequest>>,
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<i32>,
    #[serde(rename = "title", skip_serializing_if = "Option::is_none")]
    pub title: Option<String>,
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<String>,
}

impl BadRequest {
    pub fn new() -> BadRequest {
        BadRequest {
            name: None,
            problems: None,
            status: None,
            title: None,
            r#type: None,
        }
    }
}


