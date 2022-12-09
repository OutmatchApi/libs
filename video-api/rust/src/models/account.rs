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
pub struct Account {
    /// Deprecated. Whether you are using your production or sandbox API key will impact what environment is displayed here, as well as stats and features information. If you use your sandbox key, the environment is \"sandbox.\" If you use your production key, the environment is \"production.\"
    #[serde(rename = "environment", skip_serializing_if = "Option::is_none")]
    pub environment: Option<String>,
    /// Deprecated. What features are enabled for your account. Choices include: app.dynamic_metadata - the ability to dynamically tag videos to better segment and understand your audiences, app.event_log - the ability to create and retrieve a log detailing how your videos were interacted with, player.white_label - the ability to customise your player, stats.player_events - the ability to see statistics about how your player is being used, transcode.mp4_support - the ability to reformat content into mp4 using the H264 codec.
    #[serde(rename = "features", skip_serializing_if = "Option::is_none")]
    pub features: Option<Vec<String>>,
    #[serde(rename = "quota", skip_serializing_if = "Option::is_none")]
    pub quota: Option<Box<crate::models::AccountQuota>>,
}

impl Account {
    pub fn new() -> Account {
        Account {
            environment: None,
            features: None,
            quota: None,
        }
    }
}


