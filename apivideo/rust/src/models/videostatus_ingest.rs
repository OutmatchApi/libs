/*
 * api.video
 *
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 * Generated by: https://openapi-generator.tech
 */

/// VideostatusIngest : Details about the capturing, transferring, and storing of your video for use immediately or in the future.



#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct VideostatusIngest {
    /// The size of your file in bytes.
    #[serde(rename = "filesize", skip_serializing_if = "Option::is_none")]
    pub filesize: Option<i32>,
    /// The total number of bytes received, listed for each chunk of the upload.
    #[serde(rename = "receivedBytes", skip_serializing_if = "Option::is_none")]
    pub received_bytes: Option<Vec<crate::models::BytesRange>>,
    /// There are three possible ingest statuses. missing - you are missing information required to ingest the video. uploading - the video is in the process of being uploaded. uploaded - the video is ready for use.
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<Status>,
}

impl VideostatusIngest {
    /// Details about the capturing, transferring, and storing of your video for use immediately or in the future.
    pub fn new() -> VideostatusIngest {
        VideostatusIngest {
            filesize: None,
            received_bytes: None,
            status: None,
        }
    }
}

/// There are three possible ingest statuses. missing - you are missing information required to ingest the video. uploading - the video is in the process of being uploaded. uploaded - the video is ready for use.
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Status {
    #[serde(rename = "missing")]
    Missing,
    #[serde(rename = "uploading")]
    Uploading,
    #[serde(rename = "uploaded")]
    Uploaded,
}

impl Default for Status {
    fn default() -> Status {
        Self::Missing
    }
}

