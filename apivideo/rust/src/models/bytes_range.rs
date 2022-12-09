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
pub struct BytesRange {
    /// The starting point for the range of bytes for a chunk of a video.
    #[serde(rename = "from", skip_serializing_if = "Option::is_none")]
    pub from: Option<i32>,
    /// The ending point for the range of bytes for a chunk of a video.
    #[serde(rename = "to", skip_serializing_if = "Option::is_none")]
    pub to: Option<i32>,
    /// The total number of bytes in the provided range.
    #[serde(rename = "total", skip_serializing_if = "Option::is_none")]
    pub total: Option<i32>,
}

impl BytesRange {
    pub fn new() -> BytesRange {
        BytesRange {
            from: None,
            to: None,
            total: None,
        }
    }
}


