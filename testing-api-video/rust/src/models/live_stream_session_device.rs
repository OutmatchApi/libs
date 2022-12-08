/*
 * api.video
 *
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// LiveStreamSessionDevice : What type of device the user is on when in the live stream session.



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct LiveStreamSessionDevice {
    /// The specific model of the device, if known.
    #[serde(rename = "model", skip_serializing_if = "Option::is_none")]
    pub model: Option<String>,
    /// What the type is like desktop, laptop, mobile.
    #[serde(rename = "type", skip_serializing_if = "Option::is_none")]
    pub r#type: Option<String>,
    /// If known, what the brand of the device is, like Apple, Dell, etc.
    #[serde(rename = "vendor", skip_serializing_if = "Option::is_none")]
    pub vendor: Option<String>,
}

impl LiveStreamSessionDevice {
    /// What type of device the user is on when in the live stream session.
    pub fn new() -> LiveStreamSessionDevice {
        LiveStreamSessionDevice {
            model: None,
            r#type: None,
            vendor: None,
        }
    }
}


