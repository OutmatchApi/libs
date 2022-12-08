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

/// struct for passing parameters to the method [`d_elete_webhook`]
#[derive(Clone, Debug, Default)]
pub struct DEleteWebhookParams {
    /// The webhook you wish to delete.
    pub webhook_id: String
}

/// struct for passing parameters to the method [`g_et_webhook`]
#[derive(Clone, Debug, Default)]
pub struct GEtWebhookParams {
    /// The unique webhook you wish to retreive details on.
    pub webhook_id: String
}

/// struct for passing parameters to the method [`l_ist_webhooks`]
#[derive(Clone, Debug, Default)]
pub struct LIstWebhooksParams {
    /// The webhook event that you wish to filter on.
    pub events: Option<String>,
    /// Choose the number of search results to return per page. Minimum value: 1
    pub current_page: Option<i32>,
    /// Results per page. Allowed values 1-100, default is 25.
    pub page_size: Option<i32>
}

/// struct for passing parameters to the method [`p_ost_webhooks`]
#[derive(Clone, Debug, Default)]
pub struct POstWebhooksParams {
    pub webhooks_create_payload: Option<crate::models::WebhooksCreatePayload>
}


/// struct for typed errors of method [`d_elete_webhook`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DEleteWebhookError {
    Status404(crate::models::NotFound),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`g_et_webhook`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GEtWebhookError {
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`l_ist_webhooks`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum LIstWebhooksError {
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`p_ost_webhooks`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum POstWebhooksError {
    Status400(crate::models::BadRequest),
    UnknownValue(serde_json::Value),
}


/// This endpoint will delete the indicated webhook.
pub async fn d_elete_webhook(configuration: &configuration::Configuration, params: DEleteWebhookParams) -> Result<(), Error<DEleteWebhookError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let webhook_id = params.webhook_id;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/webhooks/{webhookId}", local_var_configuration.base_path, webhookId=crate::apis::urlencode(webhook_id));
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
        let local_var_entity: Option<DEleteWebhookError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This call provides the same JSON information provided on Webjhook creation.
pub async fn g_et_webhook(configuration: &configuration::Configuration, params: GEtWebhookParams) -> Result<crate::models::Webhook, Error<GEtWebhookError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let webhook_id = params.webhook_id;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/webhooks/{webhookId}", local_var_configuration.base_path, webhookId=crate::apis::urlencode(webhook_id));
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
        let local_var_entity: Option<GEtWebhookError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Requests to this endpoint return a list of your webhooks (with all their details). You can filter what the webhook list that the API returns using the parameters described below.
pub async fn l_ist_webhooks(configuration: &configuration::Configuration, params: LIstWebhooksParams) -> Result<crate::models::WebhooksListResponse, Error<LIstWebhooksError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let events = params.events;
    let current_page = params.current_page;
    let page_size = params.page_size;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/webhooks", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = events {
        local_var_req_builder = local_var_req_builder.query(&[("events", &local_var_str.to_string())]);
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
        let local_var_entity: Option<LIstWebhooksError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Webhooks can push notifications to your server, rather than polling api.video for changes. We currently offer four events:  * ```video.encoding.quality.completed```  When a new video is uploaded into your account, it will be encoded into several different HLS sizes/bitrates.  When each version is encoded, your webhook will get a notification.  It will look like ```{ \\\"type\\\": \\\"video.encoding.quality.completed\\\", \\\"emittedAt\\\": \\\"2021-01-29T16:46:25.217+01:00\\\", \\\"videoId\\\": \\\"viXXXXXXXX\\\", \\\"encoding\\\": \\\"hls\\\", \\\"quality\\\": \\\"720p\\\"} ```. This request says that the 720p HLS encoding was completed. * ```live-stream.broadcast.started```  When a livestream begins broadcasting, the broadcasting parameter changes from false to true, and this webhook fires. * ```live-stream.broadcast.ended```  This event fores when the livestream has finished broadcasting, and the broadcasting parameter flips from false to true. * ```video.source.recorded```  This event is similar to ```video.encoding.quality.completed```, but tells you if a livestream has been recorded as a VOD.
pub async fn p_ost_webhooks(configuration: &configuration::Configuration, params: POstWebhooksParams) -> Result<crate::models::Webhook, Error<POstWebhooksError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let webhooks_create_payload = params.webhooks_create_payload;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/webhooks", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&webhooks_create_payload);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<POstWebhooksError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

