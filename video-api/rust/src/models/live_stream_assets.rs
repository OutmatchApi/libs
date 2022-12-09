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
pub struct LiveStreamAssets {
    /// The http live streaming (HLS) link for your live video stream.
    #[serde(rename = "hls", skip_serializing_if = "Option::is_none")]
    pub hls: Option<String>,
    /// The embed code for the iframe containing your live video stream.
    #[serde(rename = "iframe", skip_serializing_if = "Option::is_none")]
    pub iframe: Option<String>,
    /// A link to the video player that is playing your live stream.
    #[serde(rename = "player", skip_serializing_if = "Option::is_none")]
    pub player: Option<String>,
    /// A link to the thumbnail for your video.
    #[serde(rename = "thumbnail", skip_serializing_if = "Option::is_none")]
    pub thumbnail: Option<String>,
}

impl LiveStreamAssets {
    pub fn new() -> LiveStreamAssets {
        LiveStreamAssets {
            hls: None,
            iframe: None,
            player: None,
            thumbnail: None,
        }
    }
}


