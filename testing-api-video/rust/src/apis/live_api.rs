/*
 * api.video
 *
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::apis::ResponseContent;
use super::{Error, configuration};

/// struct for passing parameters to the method [`d_elete_live_streams_live_stream_id`]
#[derive(Clone, Debug, Default)]
pub struct DEleteLiveStreamsLiveStreamIdParams {
    /// The unique ID for the live stream that you want to remove.
    pub live_stream_id: String
}

/// struct for passing parameters to the method [`d_elete_live_streams_live_stream_id_thumbnail`]
#[derive(Clone, Debug, Default)]
pub struct DEleteLiveStreamsLiveStreamIdThumbnailParams {
    /// The unique identifier for the live stream you want to delete. 
    pub live_stream_id: String
}

/// struct for passing parameters to the method [`g_et_live_streams`]
#[derive(Clone, Debug, Default)]
pub struct GEtLiveStreamsParams {
    /// The unique stream key that allows you to stream videos.
    pub stream_key: Option<String>,
    /// You can filter live streams by their name or a part of their name.
    pub name: Option<String>,
    /// Allowed: createdAt, publishedAt, name. createdAt - the time a livestream was created using the specified streamKey. publishedAt - the time a livestream was published using the specified streamKey. name - the name of the livestream. If you choose one of the time based options, the time is presented in ISO-8601 format.
    pub sort_by: Option<String>,
    /// Allowed: asc, desc. Ascending for date and time means that earlier values precede later ones. Descending means that later values preced earlier ones. For title, it is 0-9 and A-Z ascending and Z-A, 9-0 descending.
    pub sort_order: Option<String>,
    /// Choose the number of search results to return per page. Minimum value: 1
    pub current_page: Option<i32>,
    /// Results per page. Allowed values 1-100, default is 25.
    pub page_size: Option<i32>
}

/// struct for passing parameters to the method [`g_et_live_streams_live_stream_id`]
#[derive(Clone, Debug, Default)]
pub struct GEtLiveStreamsLiveStreamIdParams {
    /// The unique ID for the live stream you want to watch.
    pub live_stream_id: String
}

/// struct for passing parameters to the method [`p_atch_live_streams_live_stream_id`]
#[derive(Clone, Debug, Default)]
pub struct PAtchLiveStreamsLiveStreamIdParams {
    /// The unique ID for the live stream that you want to update information for such as player details, or whether you want the recording on or off.
    pub live_stream_id: String,
    pub live_stream_update_payload: Option<crate::models::LiveStreamUpdatePayload>
}

/// struct for passing parameters to the method [`p_ost_live_streams`]
#[derive(Clone, Debug, Default)]
pub struct POstLiveStreamsParams {
    pub live_stream_create_payload: Option<crate::models::LiveStreamCreatePayload>
}

/// struct for passing parameters to the method [`p_ost_live_streams_live_stream_id_thumbnail`]
#[derive(Clone, Debug, Default)]
pub struct POstLiveStreamsLiveStreamIdThumbnailParams {
    /// The unique ID for the live stream you want to upload.
    pub live_stream_id: String,
    /// The image to be added as a thumbnail.
    pub file: std::path::PathBuf
}


/// struct for typed errors of method [`d_elete_live_streams_live_stream_id`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DEleteLiveStreamsLiveStreamIdError {
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`d_elete_live_streams_live_stream_id_thumbnail`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DEleteLiveStreamsLiveStreamIdThumbnailError {
    Status404(crate::models::NotFound),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`g_et_live_streams`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GEtLiveStreamsError {
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`g_et_live_streams_live_stream_id`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GEtLiveStreamsLiveStreamIdError {
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`p_atch_live_streams_live_stream_id`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum PAtchLiveStreamsLiveStreamIdError {
    Status400(crate::models::BadRequest),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`p_ost_live_streams`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum POstLiveStreamsError {
    Status400(crate::models::BadRequest),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`p_ost_live_streams_live_stream_id_thumbnail`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum POstLiveStreamsLiveStreamIdThumbnailError {
    Status400(crate::models::BadRequest),
    Status404(crate::models::NotFound),
    UnknownValue(serde_json::Value),
}


pub async fn d_elete_live_streams_live_stream_id(configuration: &configuration::Configuration, params: DEleteLiveStreamsLiveStreamIdParams) -> Result<(), Error<DEleteLiveStreamsLiveStreamIdError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let live_stream_id = params.live_stream_id;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/live-streams/{liveStreamId}", local_var_configuration.base_path, liveStreamId=crate::apis::urlencode(live_stream_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::DELETE, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        Ok(())
    } else {
        let local_var_entity: Option<DEleteLiveStreamsLiveStreamIdError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Send the unique identifier for a live stream to delete it from the system.
pub async fn d_elete_live_streams_live_stream_id_thumbnail(configuration: &configuration::Configuration, params: DEleteLiveStreamsLiveStreamIdThumbnailParams) -> Result<crate::models::LiveStream, Error<DEleteLiveStreamsLiveStreamIdThumbnailError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let live_stream_id = params.live_stream_id;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/live-streams/{liveStreamId}/thumbnail", local_var_configuration.base_path, liveStreamId=crate::apis::urlencode(live_stream_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::DELETE, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<DEleteLiveStreamsLiveStreamIdThumbnailError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// With no parameters added to the url, this will return all livestreams. Query by name or key to limit the list.
pub async fn g_et_live_streams(configuration: &configuration::Configuration, params: GEtLiveStreamsParams) -> Result<crate::models::LiveStreamListResponse, Error<GEtLiveStreamsError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let stream_key = params.stream_key;
    let name = params.name;
    let sort_by = params.sort_by;
    let sort_order = params.sort_order;
    let current_page = params.current_page;
    let page_size = params.page_size;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/live-streams", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = stream_key {
        local_var_req_builder = local_var_req_builder.query(&[("streamKey", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = name {
        local_var_req_builder = local_var_req_builder.query(&[("name", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = sort_by {
        local_var_req_builder = local_var_req_builder.query(&[("sortBy", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = sort_order {
        local_var_req_builder = local_var_req_builder.query(&[("sortOrder", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = current_page {
        local_var_req_builder = local_var_req_builder.query(&[("currentPage", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = page_size {
        local_var_req_builder = local_var_req_builder.query(&[("pageSize", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GEtLiveStreamsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Supply a LivestreamId, and you'll get all the details for streaming into, and watching the livestream. Tutorials that use the [show livestream endpoint](https://api.video/blog/endpoints/live-stream-status).
pub async fn g_et_live_streams_live_stream_id(configuration: &configuration::Configuration, params: GEtLiveStreamsLiveStreamIdParams) -> Result<crate::models::LiveStream, Error<GEtLiveStreamsLiveStreamIdError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let live_stream_id = params.live_stream_id;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/live-streams/{liveStreamId}", local_var_configuration.base_path, liveStreamId=crate::apis::urlencode(live_stream_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GEtLiveStreamsLiveStreamIdError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Use this endpoint to update the player, or to turn recording on/off (saving a copy of the livestream). NOTE: If the livestream is actively streaming, changing the recording status will only affect the NEXT stream.    The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer.
pub async fn p_atch_live_streams_live_stream_id(configuration: &configuration::Configuration, params: PAtchLiveStreamsLiveStreamIdParams) -> Result<crate::models::LiveStream, Error<PAtchLiveStreamsLiveStreamIdError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let live_stream_id = params.live_stream_id;
    let live_stream_update_payload = params.live_stream_update_payload;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/live-streams/{liveStreamId}", local_var_configuration.base_path, liveStreamId=crate::apis::urlencode(live_stream_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::PATCH, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&live_stream_update_payload);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<PAtchLiveStreamsLiveStreamIdError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// A live stream will give you the 'connection point' to RTMP your video stream to api.video. It will also give you the details for viewers to watch the same livestream.  The public=false 'private livestream' is available as a BETA feature, and should be limited to livestreams of 3,000 viewers or fewer. See our [Live Stream Tutorial](https://api.video/blog/tutorials/live-stream-tutorial) for a walkthrough of this API with OBS. Your RTMP endpoint for the livestream is rtmp://broadcast.api.video/s/{streamKey} Tutorials that [create live streams](https://api.video/blog/endpoints/live-create).
pub async fn p_ost_live_streams(configuration: &configuration::Configuration, params: POstLiveStreamsParams) -> Result<crate::models::LiveStream, Error<POstLiveStreamsError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let live_stream_create_payload = params.live_stream_create_payload;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/live-streams", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&live_stream_create_payload);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<POstLiveStreamsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Upload an image to use as a backdrop for your livestream. Tutorials that [update live stream thumbnails](https://api.video/blog/endpoints/live-upload-a-thumbnail).
pub async fn p_ost_live_streams_live_stream_id_thumbnail(configuration: &configuration::Configuration, params: POstLiveStreamsLiveStreamIdThumbnailParams) -> Result<crate::models::LiveStream, Error<POstLiveStreamsLiveStreamIdThumbnailError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let live_stream_id = params.live_stream_id;
    let file = params.file;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/live-streams/{liveStreamId}/thumbnail", local_var_configuration.base_path, liveStreamId=crate::apis::urlencode(live_stream_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form = reqwest::multipart::Form::new();
    // TODO: support file upload for 'file' parameter
    local_var_req_builder = local_var_req_builder.multipart(local_var_form);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<POstLiveStreamsLiveStreamIdThumbnailError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

