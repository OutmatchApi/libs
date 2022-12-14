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
pub struct VideosListResponse {
    #[serde(rename = "data")]
    pub data: Vec<crate::models::Video>,
    #[serde(rename = "pagination")]
    pub pagination: Box<crate::models::Pagination>,
}

impl VideosListResponse {
    pub fn new(data: Vec<crate::models::Video>, pagination: crate::models::Pagination) -> VideosListResponse {
        VideosListResponse {
            data,
            pagination: Box::new(pagination),
        }
    }
}


