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

/// struct for passing parameters to the method [`dnd_end_dnd`]
#[derive(Clone, Debug, Default)]
pub struct DndEndDndParams {
    /// Authentication token. Requires scope: `dnd:write`
    pub token: String
}

/// struct for passing parameters to the method [`dnd_end_snooze`]
#[derive(Clone, Debug, Default)]
pub struct DndEndSnoozeParams {
    /// Authentication token. Requires scope: `dnd:write`
    pub token: String
}

/// struct for passing parameters to the method [`dnd_info`]
#[derive(Clone, Debug, Default)]
pub struct DndInfoParams {
    /// Authentication token. Requires scope: `dnd:read`
    pub token: Option<String>,
    /// User to fetch status for (defaults to current user)
    pub user: Option<String>
}

/// struct for passing parameters to the method [`dnd_set_snooze`]
#[derive(Clone, Debug, Default)]
pub struct DndSetSnoozeParams {
    /// Number of minutes, from now, to snooze until.
    pub num_minutes: String,
    /// Authentication token. Requires scope: `dnd:write`
    pub token: String
}

/// struct for passing parameters to the method [`dnd_team_info`]
#[derive(Clone, Debug, Default)]
pub struct DndTeamInfoParams {
    /// Authentication token. Requires scope: `dnd:read`
    pub token: Option<String>,
    /// Comma-separated list of users to fetch Do Not Disturb status for
    pub users: Option<String>
}


/// struct for typed errors of method [`dnd_end_dnd`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DndEndDndError {
    DefaultResponse(crate::models::DndEndDndErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`dnd_end_snooze`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DndEndSnoozeError {
    DefaultResponse(crate::models::DndEndSnoozeErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`dnd_info`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DndInfoError {
    DefaultResponse(crate::models::DndInfoErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`dnd_set_snooze`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DndSetSnoozeError {
    DefaultResponse(crate::models::DndSetSnoozeErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`dnd_team_info`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DndTeamInfoError {
    DefaultResponse(crate::models::DefaultErrorTemplate),
    UnknownValue(serde_json::Value),
}


/// Ends the current user's Do Not Disturb session immediately.
pub async fn dnd_end_dnd(configuration: &configuration::Configuration, params: DndEndDndParams) -> Result<crate::models::DndEndDndSchema, Error<DndEndDndError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/dnd.endDnd", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("token", token.to_string());
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
        let local_var_entity: Option<DndEndDndError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Ends the current user's snooze mode immediately.
pub async fn dnd_end_snooze(configuration: &configuration::Configuration, params: DndEndSnoozeParams) -> Result<crate::models::DndEndSnoozeSchema, Error<DndEndSnoozeError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/dnd.endSnooze", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("token", token.to_string());
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
        let local_var_entity: Option<DndEndSnoozeError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Retrieves a user's current Do Not Disturb status.
pub async fn dnd_info(configuration: &configuration::Configuration, params: DndInfoParams) -> Result<crate::models::DndInfoSchema, Error<DndInfoError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let user = params.user;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/dnd.info", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = token {
        local_var_req_builder = local_var_req_builder.query(&[("token", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = user {
        local_var_req_builder = local_var_req_builder.query(&[("user", &local_var_str.to_string())]);
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
        let local_var_entity: Option<DndInfoError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Turns on Do Not Disturb mode for the current user, or changes its duration.
pub async fn dnd_set_snooze(configuration: &configuration::Configuration, params: DndSetSnoozeParams) -> Result<crate::models::DndSetSnoozeSchema, Error<DndSetSnoozeError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let num_minutes = params.num_minutes;
    let token = params.token;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/dnd.setSnooze", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    local_var_form_params.insert("num_minutes", num_minutes.to_string());
    local_var_form_params.insert("token", token.to_string());
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<DndSetSnoozeError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Retrieves the Do Not Disturb status for up to 50 users on a team.
pub async fn dnd_team_info(configuration: &configuration::Configuration, params: DndTeamInfoParams) -> Result<crate::models::DefaultSuccessTemplate, Error<DndTeamInfoError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let users = params.users;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/dnd.teamInfo", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = token {
        local_var_req_builder = local_var_req_builder.query(&[("token", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = users {
        local_var_req_builder = local_var_req_builder.query(&[("users", &local_var_str.to_string())]);
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
        let local_var_entity: Option<DndTeamInfoError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

