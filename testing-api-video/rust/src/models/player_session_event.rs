/*
 * api.video
 *
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct PlayerSessionEvent {
    #[serde(rename = "at", skip_serializing_if = "Option::is_none")]
    pub at: Option<i32>,
    /// When an event occurred, presented in ISO-8601 format.
    #[serde(rename = "emittedAt", skip_serializing_if = "Option::is_none")]
    pub emitted_at: Option<String>,
    #[serde(rename = "from", skip_serializing_if = "Option::is_none")]
    pub from: Option<i32>,
    #[serde(rename = "to", skip_serializing_if = "Option::is_none")]
    pub to: Option<i32>,
    /// Possible values are: ready, play, pause, resume, seek.backward, seek.forward, end
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<String>,
}

impl PlayerSessionEvent {
    pub fn new() -> PlayerSessionEvent {
        PlayerSessionEvent {
            at: None,
            emitted_at: None,
            from: None,
            to: None,
            r#type: None,
        }
    }
}

