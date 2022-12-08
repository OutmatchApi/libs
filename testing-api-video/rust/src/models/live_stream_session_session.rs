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
pub struct LiveStreamSessionSession {
    /// When the session ended, with the date and time presented in ISO-8601 format.
    #[serde(rename = "endedAt", skip_serializing_if = "Option::is_none")]
    pub ended_at: Option<String>,
    /// When the session started, with the date and time presented in ISO-8601 format.
    #[serde(rename = "loadedAt", skip_serializing_if = "Option::is_none")]
    pub loaded_at: Option<String>,
    /// A unique identifier for your session. You can use this to track what happens during a specific session.
    #[serde(rename = "sessionId", skip_serializing_if = "Option::is_none")]
    pub session_id: Option<String>,
}

impl LiveStreamSessionSession {
    pub fn new() -> LiveStreamSessionSession {
        LiveStreamSessionSession {
            ended_at: None,
            loaded_at: None,
            session_id: None,
        }
    }
}


