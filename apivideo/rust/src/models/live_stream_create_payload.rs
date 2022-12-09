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
pub struct LiveStreamCreatePayload {
    /// Add a name for your live stream here.
    #[serde(rename = "name")]
    pub name: String,
    /// The unique identifier for the player.
    #[serde(rename = "playerId", skip_serializing_if = "Option::is_none")]
    pub player_id: Option<String>,
    /// BETA FEATURE Please limit all public = false (\"private\") livestreams to 3,000 users. Whether your video can be viewed by everyone, or requires authentication to see it. A setting of false will require a unique token for each view.
    #[serde(rename = "public", skip_serializing_if = "Option::is_none")]
    pub public: Option<bool>,
    /// Whether you are recording or not. True for record, false for not record.
    #[serde(rename = "record", skip_serializing_if = "Option::is_none")]
    pub record: Option<bool>,
}

impl LiveStreamCreatePayload {
    pub fn new(name: String) -> LiveStreamCreatePayload {
        LiveStreamCreatePayload {
            name,
            player_id: None,
            public: None,
            record: None,
        }
    }
}


