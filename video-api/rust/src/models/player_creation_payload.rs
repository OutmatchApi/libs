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
pub struct PlayerCreationPayload {
    /// RGBA color: bottom 50% of background. Default: rgba(0, 0, 0, .7)
    #[serde(rename = "backgroundBottom", skip_serializing_if = "Option::is_none")]
    pub background_bottom: Option<String>,
    /// RGBA color for title text. Default: rgba(255, 255, 255, 1)
    #[serde(rename = "backgroundText", skip_serializing_if = "Option::is_none")]
    pub background_text: Option<String>,
    /// RGBA color: top 50% of background. Default: rgba(0, 0, 0, .7)
    #[serde(rename = "backgroundTop", skip_serializing_if = "Option::is_none")]
    pub background_top: Option<String>,
    /// enable/disable player SDK access. Default: true
    #[serde(rename = "enableApi", skip_serializing_if = "Option::is_none")]
    pub enable_api: Option<bool>,
    /// enable/disable player controls. Default: true
    #[serde(rename = "enableControls", skip_serializing_if = "Option::is_none")]
    pub enable_controls: Option<bool>,
    /// enable/disable player autoplay. Default: false
    #[serde(rename = "forceAutoplay", skip_serializing_if = "Option::is_none")]
    pub force_autoplay: Option<bool>,
    /// enable/disable looping. Default: false
    #[serde(rename = "forceLoop", skip_serializing_if = "Option::is_none")]
    pub force_loop: Option<bool>,
    /// enable/disable title. Default: false
    #[serde(rename = "hideTitle", skip_serializing_if = "Option::is_none")]
    pub hide_title: Option<bool>,
    /// RGBA color for all controls. Default: rgba(255, 255, 255, 1)
    #[serde(rename = "link", skip_serializing_if = "Option::is_none")]
    pub link: Option<String>,
    /// RGBA color for all controls when hovered. Default: rgba(255, 255, 255, 1)
    #[serde(rename = "linkHover", skip_serializing_if = "Option::is_none")]
    pub link_hover: Option<String>,
    /// RGBA color for timer text. Default: rgba(255, 255, 255, 1)
    #[serde(rename = "text", skip_serializing_if = "Option::is_none")]
    pub text: Option<String>,
    /// RGBA color playback bar: background. Default: rgba(255, 255, 255, .2)
    #[serde(rename = "trackBackground", skip_serializing_if = "Option::is_none")]
    pub track_background: Option<String>,
    /// RGBA color playback bar: played content. Default: rgba(88, 131, 255, .95)
    #[serde(rename = "trackPlayed", skip_serializing_if = "Option::is_none")]
    pub track_played: Option<String>,
    /// RGBA color playback bar: downloaded but unplayed (buffered) content. Default: rgba(255, 255, 255, .35)
    #[serde(rename = "trackUnplayed", skip_serializing_if = "Option::is_none")]
    pub track_unplayed: Option<String>,
}

impl PlayerCreationPayload {
    pub fn new() -> PlayerCreationPayload {
        PlayerCreationPayload {
            background_bottom: None,
            background_text: None,
            background_top: None,
            enable_api: None,
            enable_controls: None,
            force_autoplay: None,
            force_loop: None,
            hide_title: None,
            link: None,
            link_hover: None,
            text: None,
            track_background: None,
            track_played: None,
            track_unplayed: None,
        }
    }
}


