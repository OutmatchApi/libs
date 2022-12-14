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

/// struct for passing parameters to the method [`pins_add`]
#[derive(Clone, Debug, Default)]
pub struct PinsAddParams {
    /// Authentication token. Requires scope: `pins:write`
    pub token: String,
    /// Channel to pin the item in.
    pub channel: String,
    /// Timestamp of the message to pin.
    pub timestamp: Option<String>
}

/// struct for passing parameters to the method [`pins_list`]
#[derive(Clone, Debug, Default)]
pub struct PinsListParams {
    /// Authentication token. Requires scope: `pins:read`
    pub token: String,
    /// Channel to get pinned items for.
    pub channel: String
}

/// struct for passing parameters to the method [`pins_remove`]
#[derive(Clone, Debug, Default)]
pub struct PinsRemoveParams {
    /// Authentication token. Requires scope: `pins:write`
    pub token: String,
    /// Channel where the item is pinned to.
    pub channel: String,
    /// Timestamp of the message to un-pin.
    pub timestamp: Option<String>
}


/// struct for typed errors of method [`pins_add`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum PinsAddError {
    DefaultResponse(crate::models::PinsAddErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`pins_list`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum PinsListError {
    DefaultResponse(crate::models::PinsListErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`pins_remove`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum PinsRemoveError {
    DefaultResponse(crate::models::PinsRemoveErrorSchema),
    UnknownValue(serde_json::Value),
}


/// Pins an item to a channel.
pub async fn pins_add(configuration: &configuration::Configuration, params: PinsAddParams) -> Result<crate::models::PinsAddSchema, Error<PinsAddError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let channel = params.channel;
    let timestamp = params.timestamp;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/pins.add", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("token", token.to_string());
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    local_var_form_params.insert("channel", channel.to_string());
    if let Some(local_var_param_value) = timestamp {
        local_var_form_params.insert("timestamp", local_var_param_value.to_string());
    }
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<PinsAddError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Lists items pinned to a channel.
pub async fn pins_list(configuration: &configuration::Configuration, params: PinsListParams) -> Result<Vec<crate::models::PinsListSuccessSchemaInner>, Error<PinsListError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let channel = params.channel;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/pins.list", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("token", &token.to_string())]);
    local_var_req_builder = local_var_req_builder.query(&[("channel", &channel.to_string())]);
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
        let local_var_entity: Option<PinsListError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Un-pins an item from a channel.
pub async fn pins_remove(configuration: &configuration::Configuration, params: PinsRemoveParams) -> Result<crate::models::PinsRemoveSchema, Error<PinsRemoveError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let channel = params.channel;
    let timestamp = params.timestamp;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/pins.remove", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("token", token.to_string());
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    local_var_form_params.insert("channel", channel.to_string());
    if let Some(local_var_param_value) = timestamp {
        local_var_form_params.insert("timestamp", local_var_param_value.to_string());
    }
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<PinsRemoveError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

