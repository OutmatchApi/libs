/*
 * api.video
 *
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::apis::ResponseContent;
use super::{Error, configuration};

/// struct for passing parameters to the method [`g_et_analytics_live_streams_live_stream_id`]
#[derive(Clone, Debug, Default)]
pub struct GEtAnalyticsLiveStreamsLiveStreamIdParams {
    /// The unique identifier for the live stream you want to retrieve analytics for.
    pub live_stream_id: String,
    /// Period must have one of the following formats:  - For a day : \"2018-01-01\", - For a week: \"2018-W01\",  - For a month: \"2018-01\" - For a year: \"2018\" For a range period:  -  Date range: \"2018-01-01/2018-01-15\" 
    pub period: Option<String>,
    /// Choose the number of search results to return per page. Minimum value: 1
    pub current_page: Option<i32>,
    /// Results per page. Allowed values 1-100, default is 25.
    pub page_size: Option<i32>
}

/// struct for passing parameters to the method [`g_et_analytics_sessions_session_id_events`]
#[derive(Clone, Debug, Default)]
pub struct GEtAnalyticsSessionsSessionIdEventsParams {
    /// A unique identifier you can use to reference and track a session with.
    pub session_id: String,
    /// Choose the number of search results to return per page. Minimum value: 1
    pub current_page: Option<i32>,
    /// Results per page. Allowed values 1-100, default is 25.
    pub page_size: Option<i32>
}

/// struct for passing parameters to the method [`g_et_analytics_videos_video_id`]
#[derive(Clone, Debug, Default)]
pub struct GEtAnalyticsVideosVideoIdParams {
    /// The unique identifier for the video you want to retrieve session information for.
    pub video_id: String,
    /// Period must have one of the following formats:  - For a day : 2018-01-01, - For a week: 2018-W01,  - For a month: 2018-01 - For a year: 2018 For a range period:  -  Date range: 2018-01-01/2018-01-15 
    pub period: Option<String>,
    /// Metadata and [Dynamic Metadata](https://api.video/blog/endpoints/dynamic-metadata) filter. Send an array of key value pairs you want to filter sessios with.
    pub metadata: Option<Vec<String>>,
    /// Choose the number of search results to return per page. Minimum value: 1
    pub current_page: Option<i32>,
    /// Results per page. Allowed values 1-100, default is 25.
    pub page_size: Option<i32>
}


/// struct for typed errors of method [`g_et_analytics_live_streams_live_stream_id`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GEtAnalyticsLiveStreamsLiveStreamIdError {
    Status404(crate::models::NotFound),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`g_et_analytics_sessions_session_id_events`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GEtAnalyticsSessionsSessionIdEventsError {
    Status404(crate::models::NotFound),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`g_et_analytics_videos_video_id`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GEtAnalyticsVideosVideoIdError {
    Status404(crate::models::NotFound),
    UnknownValue(serde_json::Value),
}


pub async fn g_et_analytics_live_streams_live_stream_id(configuration: &configuration::Configuration, params: GEtAnalyticsLiveStreamsLiveStreamIdParams) -> Result<crate::models::RawStatisticsListLiveStreamAnalyticsResponse, Error<GEtAnalyticsLiveStreamsLiveStreamIdError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let live_stream_id = params.live_stream_id;
    let period = params.period;
    let current_page = params.current_page;
    let page_size = params.page_size;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/analytics/live-streams/{liveStreamId}", local_var_configuration.base_path, liveStreamId=crate::apis::urlencode(live_stream_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = period {
        local_var_req_builder = local_var_req_builder.query(&[("period", &local_var_str.to_string())]);
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
        let local_var_entity: Option<GEtAnalyticsLiveStreamsLiveStreamIdError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Useful to track and measure video's engagement.
pub async fn g_et_analytics_sessions_session_id_events(configuration: &configuration::Configuration, params: GEtAnalyticsSessionsSessionIdEventsParams) -> Result<crate::models::RawStatisticsListPlayerSessionEventsResponse, Error<GEtAnalyticsSessionsSessionIdEventsError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let session_id = params.session_id;
    let current_page = params.current_page;
    let page_size = params.page_size;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/analytics/sessions/{sessionId}/events", local_var_configuration.base_path, sessionId=crate::apis::urlencode(session_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

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
        let local_var_entity: Option<GEtAnalyticsSessionsSessionIdEventsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Retrieve all available user sessions for a specific video. Tutorials that use the [analytics endpoint](https://api.video/blog/endpoints/analytics).
pub async fn g_et_analytics_videos_video_id(configuration: &configuration::Configuration, params: GEtAnalyticsVideosVideoIdParams) -> Result<crate::models::RawStatisticsListSessionsResponse, Error<GEtAnalyticsVideosVideoIdError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let video_id = params.video_id;
    let period = params.period;
    let metadata = params.metadata;
    let current_page = params.current_page;
    let page_size = params.page_size;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/analytics/videos/{videoId}", local_var_configuration.base_path, videoId=crate::apis::urlencode(video_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = period {
        local_var_req_builder = local_var_req_builder.query(&[("period", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = metadata {
        local_var_req_builder = match "multi" {
            "multi" => local_var_req_builder.query(&local_var_str.into_iter().map(|p| ("metadata".to_owned(), p.to_string())).collect::<Vec<(std::string::String, std::string::String)>>()),
            _ => local_var_req_builder.query(&[("metadata", &local_var_str.into_iter().map(|p| p.to_string()).collect::<Vec<String>>().join(",").to_string())]),
        };
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
        let local_var_entity: Option<GEtAnalyticsVideosVideoIdError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}
