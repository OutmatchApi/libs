/*
 * api.video
 *
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */

/// AccountQuota : Deprecated



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct AccountQuota {
    /// Deprecated
    #[serde(rename = "quotaRemaining", skip_serializing_if = "Option::is_none")]
    pub quota_remaining: Option<f32>,
    /// Deprecated
    #[serde(rename = "quotaTotal", skip_serializing_if = "Option::is_none")]
    pub quota_total: Option<f32>,
    /// Deprecated
    #[serde(rename = "quotaUsed", skip_serializing_if = "Option::is_none")]
    pub quota_used: Option<f32>,
}

impl AccountQuota {
    /// Deprecated
    pub fn new() -> AccountQuota {
        AccountQuota {
            quota_remaining: None,
            quota_total: None,
            quota_used: None,
        }
    }
}


