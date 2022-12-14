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
pub struct RawStatisticsListSessionsResponse {
    #[serde(rename = "data", skip_serializing_if = "Option::is_none")]
    pub data: Option<Vec<crate::models::VideoSession>>,
    #[serde(rename = "pagination", skip_serializing_if = "Option::is_none")]
    pub pagination: Option<Box<crate::models::Pagination>>,
}

impl RawStatisticsListSessionsResponse {
    pub fn new() -> RawStatisticsListSessionsResponse {
        RawStatisticsListSessionsResponse {
            data: None,
            pagination: None,
        }
    }
}


