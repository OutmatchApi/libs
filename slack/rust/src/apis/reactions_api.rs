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

/// struct for passing parameters to the method [`reactions_add`]
#[derive(Clone, Debug, Default)]
pub struct ReactionsAddParams {
    /// Authentication token. Requires scope: `reactions:write`
    pub token: String,
    /// Channel where the message to add reaction to was posted.
    pub channel: String,
    /// Reaction (emoji) name.
    pub name: String,
    /// Timestamp of the message to add reaction to.
    pub timestamp: String
}

/// struct for passing parameters to the method [`reactions_get`]
#[derive(Clone, Debug, Default)]
pub struct ReactionsGetParams {
    /// Authentication token. Requires scope: `reactions:read`
    pub token: String,
    /// Channel where the message to get reactions for was posted.
    pub channel: Option<String>,
    /// File to get reactions for.
    pub file: Option<String>,
    /// File comment to get reactions for.
    pub file_comment: Option<String>,
    /// If true always return the complete reaction list.
    pub full: Option<bool>,
    /// Timestamp of the message to get reactions for.
    pub timestamp: Option<String>
}

/// struct for passing parameters to the method [`reactions_list`]
#[derive(Clone, Debug, Default)]
pub struct ReactionsListParams {
    /// Authentication token. Requires scope: `reactions:read`
    pub token: String,
    /// Show reactions made by this user. Defaults to the authed user.
    pub user: Option<String>,
    /// If true always return the complete reaction list.
    pub full: Option<bool>,
    pub count: Option<i32>,
    pub page: Option<i32>,
    /// Parameter for pagination. Set `cursor` equal to the `next_cursor` attribute returned by the previous request's `response_metadata`. This parameter is optional, but pagination is mandatory: the default value simply fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more details.
    pub cursor: Option<String>,
    /// The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached.
    pub limit: Option<i32>
}

/// struct for passing parameters to the method [`reactions_remove`]
#[derive(Clone, Debug, Default)]
pub struct ReactionsRemoveParams {
    /// Authentication token. Requires scope: `reactions:write`
    pub token: String,
    /// Reaction (emoji) name.
    pub name: String,
    /// Channel where the message to remove reaction from was posted.
    pub channel: Option<String>,
    /// File to remove reaction from.
    pub file: Option<String>,
    /// File comment to remove reaction from.
    pub file_comment: Option<String>,
    /// Timestamp of the message to remove reaction from.
    pub timestamp: Option<String>
}


/// struct for typed errors of method [`reactions_add`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ReactionsAddError {
    DefaultResponse(crate::models::ReactionsAddErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`reactions_get`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ReactionsGetError {
    DefaultResponse(crate::models::ReactionsGetErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`reactions_list`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ReactionsListError {
    DefaultResponse(crate::models::ReactionsListErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`reactions_remove`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ReactionsRemoveError {
    DefaultResponse(crate::models::ReactionsRemoveErrorSchema),
    UnknownValue(serde_json::Value),
}


/// Adds a reaction to an item.
pub async fn reactions_add(configuration: &configuration::Configuration, params: ReactionsAddParams) -> Result<crate::models::ReactionsAddSchema, Error<ReactionsAddError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let channel = params.channel;
    let name = params.name;
    let timestamp = params.timestamp;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/reactions.add", local_var_configuration.base_path);
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
    local_var_form_params.insert("name", name.to_string());
    local_var_form_params.insert("timestamp", timestamp.to_string());
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ReactionsAddError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Gets reactions for an item.
pub async fn reactions_get(configuration: &configuration::Configuration, params: ReactionsGetParams) -> Result<Vec<crate::models::ReactionsGetSuccessSchemaInner>, Error<ReactionsGetError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let channel = params.channel;
    let file = params.file;
    let file_comment = params.file_comment;
    let full = params.full;
    let timestamp = params.timestamp;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/reactions.get", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("token", &token.to_string())]);
    if let Some(ref local_var_str) = channel {
        local_var_req_builder = local_var_req_builder.query(&[("channel", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = file {
        local_var_req_builder = local_var_req_builder.query(&[("file", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = file_comment {
        local_var_req_builder = local_var_req_builder.query(&[("file_comment", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = full {
        local_var_req_builder = local_var_req_builder.query(&[("full", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = timestamp {
        local_var_req_builder = local_var_req_builder.query(&[("timestamp", &local_var_str.to_string())]);
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
        let local_var_entity: Option<ReactionsGetError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Lists reactions made by a user.
pub async fn reactions_list(configuration: &configuration::Configuration, params: ReactionsListParams) -> Result<crate::models::ReactionsListSchema, Error<ReactionsListError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let user = params.user;
    let full = params.full;
    let count = params.count;
    let page = params.page;
    let cursor = params.cursor;
    let limit = params.limit;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/reactions.list", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("token", &token.to_string())]);
    if let Some(ref local_var_str) = user {
        local_var_req_builder = local_var_req_builder.query(&[("user", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = full {
        local_var_req_builder = local_var_req_builder.query(&[("full", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = count {
        local_var_req_builder = local_var_req_builder.query(&[("count", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = page {
        local_var_req_builder = local_var_req_builder.query(&[("page", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = cursor {
        local_var_req_builder = local_var_req_builder.query(&[("cursor", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = limit {
        local_var_req_builder = local_var_req_builder.query(&[("limit", &local_var_str.to_string())]);
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
        let local_var_entity: Option<ReactionsListError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Removes a reaction from an item.
pub async fn reactions_remove(configuration: &configuration::Configuration, params: ReactionsRemoveParams) -> Result<crate::models::ReactionsRemoveSchema, Error<ReactionsRemoveError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let name = params.name;
    let channel = params.channel;
    let file = params.file;
    let file_comment = params.file_comment;
    let timestamp = params.timestamp;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/reactions.remove", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("token", token.to_string());
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    if let Some(local_var_param_value) = channel {
        local_var_form_params.insert("channel", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = file {
        local_var_form_params.insert("file", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = file_comment {
        local_var_form_params.insert("file_comment", local_var_param_value.to_string());
    }
    local_var_form_params.insert("name", name.to_string());
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
        let local_var_entity: Option<ReactionsRemoveError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

