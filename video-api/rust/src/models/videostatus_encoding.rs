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
pub struct VideostatusEncoding {
    #[serde(rename = "metadata", skip_serializing_if = "Option::is_none")]
    pub metadata: Option<Box<crate::models::VideostatusEncodingMetadata>>,
    /// Whether the video is playable or not.
    #[serde(rename = "playable", skip_serializing_if = "Option::is_none")]
    pub playable: Option<bool>,
    /// Available qualities the video can be viewed in.
    #[serde(rename = "qualities", skip_serializing_if = "Option::is_none")]
    pub qualities: Option<Vec<crate::models::Quality>>,
}

impl VideostatusEncoding {
    pub fn new() -> VideostatusEncoding {
        VideostatusEncoding {
            metadata: None,
            playable: None,
            qualities: None,
        }
    }
}


