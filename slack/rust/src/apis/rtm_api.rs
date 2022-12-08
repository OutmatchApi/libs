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

/// struct for passing parameters to the method [`rtm_connect`]
#[derive(Clone, Debug, Default)]
pub struct RtmConnectParams {
    /// Authentication token. Requires scope: `rtm:stream`
    pub token: String,
    /// Batch presence deliveries via subscription. Enabling changes the shape of `presence_change` events. See [batch presence](/docs/presence-and-status#batching).
    pub batch_presence_aware: Option<bool>,
    /// Only deliver presence events when requested by subscription. See [presence subscriptions](/docs/presence-and-status#subscriptions).
    pub presence_sub: Option<bool>
}


/// struct for typed errors of method [`rtm_connect`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum RtmConnectError {
    DefaultResponse(crate::models::RtmConnectErrorSchema),
    UnknownValue(serde_json::Value),
}


/// Starts a Real Time Messaging session.
pub async fn rtm_connect(configuration: &configuration::Configuration, params: RtmConnectParams) -> Result<crate::models::RtmConnectSchema, Error<RtmConnectError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let batch_presence_aware = params.batch_presence_aware;
    let presence_sub = params.presence_sub;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/rtm.connect", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("token", &token.to_string())]);
    if let Some(ref local_var_str) = batch_presence_aware {
        local_var_req_builder = local_var_req_builder.query(&[("batch_presence_aware", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = presence_sub {
        local_var_req_builder = local_var_req_builder.query(&[("presence_sub", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
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
        let local_var_entity: Option<RtmConnectError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

