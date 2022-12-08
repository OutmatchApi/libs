/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::apis::ResponseContent;
use super::{Error, configuration};

/// struct for passing parameters to the method [`chat_scheduled_messages_list`]
#[derive(Clone, Debug, Default)]
pub struct ChatScheduledMessagesListParams {
    /// Authentication token. Requires scope: `none`
    pub token: Option<String>,
    /// The channel of the scheduled messages
    pub channel: Option<String>,
    /// A UNIX timestamp of the latest value in the time range
    pub latest: Option<f32>,
    /// A UNIX timestamp of the oldest value in the time range
    pub oldest: Option<f32>,
    /// Maximum number of original entries to return.
    pub limit: Option<i32>,
    /// For pagination purposes, this is the `cursor` value returned from a previous call to `chat.scheduledmessages.list` indicating where you want to start this call from.
    pub cursor: Option<String>
}


/// struct for typed errors of method [`chat_scheduled_messages_list`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ChatScheduledMessagesListError {
    DefaultResponse(crate::models::ChatScheduledMessagesListErrorSchema),
    UnknownValue(serde_json::Value),
}


/// Returns a list of scheduled messages.
pub async fn chat_scheduled_messages_list(configuration: &configuration::Configuration, params: ChatScheduledMessagesListParams) -> Result<crate::models::ChatScheduledMessagesListSchema, Error<ChatScheduledMessagesListError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let channel = params.channel;
    let latest = params.latest;
    let oldest = params.oldest;
    let limit = params.limit;
    let cursor = params.cursor;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/chat.scheduledMessages.list", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = channel {
        local_var_req_builder = local_var_req_builder.query(&[("channel", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = latest {
        local_var_req_builder = local_var_req_builder.query(&[("latest", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = oldest {
        local_var_req_builder = local_var_req_builder.query(&[("oldest", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = limit {
        local_var_req_builder = local_var_req_builder.query(&[("limit", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = cursor {
        local_var_req_builder = local_var_req_builder.query(&[("cursor", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(local_var_param_value) = token {
        local_var_req_builder = local_var_req_builder.header("token", local_var_param_value.to_string());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ChatScheduledMessagesListError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

