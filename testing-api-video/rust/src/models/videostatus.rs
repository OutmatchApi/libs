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
pub struct Videostatus {
    #[serde(rename = "encoding", skip_serializing_if = "Option::is_none")]
    pub encoding: Option<Box<crate::models::VideostatusEncoding>>,
    #[serde(rename = "ingest", skip_serializing_if = "Option::is_none")]
    pub ingest: Option<Box<crate::models::VideostatusIngest>>,
}

impl Videostatus {
    pub fn new() -> Videostatus {
        Videostatus {
            encoding: None,
            ingest: None,
        }
    }
}


