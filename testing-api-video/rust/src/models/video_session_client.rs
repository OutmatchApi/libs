/*
 * api.video
 *
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// VideoSessionClient : What kind of browser the viewer is using for the video session.



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct VideoSessionClient {
    /// The name of the browser used to view the video session.
    #[serde(rename = "name", skip_serializing_if = "Option::is_none")]
    pub name: Option<String>,
    /// The type of client used to view the video session.
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<String>,
    /// The version of the browser used to view the video session.
    #[serde(rename = "version", skip_serializing_if = "Option::is_none")]
    pub version: Option<String>,
}

impl VideoSessionClient {
    /// What kind of browser the viewer is using for the video session.
    pub fn new() -> VideoSessionClient {
        VideoSessionClient {
            name: None,
            r#type: None,
            version: None,
        }
    }
}

