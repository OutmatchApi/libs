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

/// struct for passing parameters to the method [`admin_usergroups_add_channels`]
#[derive(Clone, Debug, Default)]
pub struct AdminUsergroupsAddChannelsParams {
    /// Authentication token. Requires scope: `admin.usergroups:write`
    pub token: String,
    /// Comma separated string of channel IDs.
    pub channel_ids: String,
    /// ID of the IDP group to add default channels for.
    pub usergroup_id: String,
    /// The workspace to add default channels in.
    pub team_id: Option<String>
}

/// struct for passing parameters to the method [`admin_usergroups_add_teams`]
#[derive(Clone, Debug, Default)]
pub struct AdminUsergroupsAddTeamsParams {
    /// Authentication token. Requires scope: `admin.teams:write`
    pub token: String,
    /// A comma separated list of encoded team (workspace) IDs. Each workspace *MUST* belong to the organization associated with the token.
    pub team_ids: String,
    /// An encoded usergroup (IDP Group) ID.
    pub usergroup_id: String,
    /// When `true`, this method automatically creates new workspace accounts for the IDP group members.
    pub auto_provision: Option<bool>
}

/// struct for passing parameters to the method [`admin_usergroups_list_channels`]
#[derive(Clone, Debug, Default)]
pub struct AdminUsergroupsListChannelsParams {
    /// Authentication token. Requires scope: `admin.usergroups:read`
    pub token: String,
    /// ID of the IDP group to list default channels for.
    pub usergroup_id: String,
    /// ID of the the workspace.
    pub team_id: Option<String>,
    /// Flag to include or exclude the count of members per channel.
    pub include_num_members: Option<bool>
}

/// struct for passing parameters to the method [`admin_usergroups_remove_channels`]
#[derive(Clone, Debug, Default)]
pub struct AdminUsergroupsRemoveChannelsParams {
    /// Authentication token. Requires scope: `admin.usergroups:write`
    pub token: String,
    /// Comma-separated string of channel IDs
    pub channel_ids: String,
    /// ID of the IDP Group
    pub usergroup_id: String
}


/// struct for typed errors of method [`admin_usergroups_add_channels`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AdminUsergroupsAddChannelsError {
    DefaultResponse(crate::models::DefaultErrorTemplate),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`admin_usergroups_add_teams`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AdminUsergroupsAddTeamsError {
    DefaultResponse(crate::models::DefaultErrorTemplate),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`admin_usergroups_list_channels`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AdminUsergroupsListChannelsError {
    DefaultResponse(crate::models::DefaultErrorTemplate),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`admin_usergroups_remove_channels`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum AdminUsergroupsRemoveChannelsError {
    DefaultResponse(crate::models::DefaultErrorTemplate),
    UnknownValue(serde_json::Value),
}


/// Add one or more default channels to an IDP group.
pub async fn admin_usergroups_add_channels(configuration: &configuration::Configuration, params: AdminUsergroupsAddChannelsParams) -> Result<crate::models::DefaultSuccessTemplate, Error<AdminUsergroupsAddChannelsError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let channel_ids = params.channel_ids;
    let usergroup_id = params.usergroup_id;
    let team_id = params.team_id;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/admin.usergroups.addChannels", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("token", token.to_string());
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    local_var_form_params.insert("channel_ids", channel_ids.to_string());
    if let Some(local_var_param_value) = team_id {
        local_var_form_params.insert("team_id", local_var_param_value.to_string());
    }
    local_var_form_params.insert("usergroup_id", usergroup_id.to_string());
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<AdminUsergroupsAddChannelsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Associate one or more default workspaces with an organization-wide IDP group.
pub async fn admin_usergroups_add_teams(configuration: &configuration::Configuration, params: AdminUsergroupsAddTeamsParams) -> Result<crate::models::DefaultSuccessTemplate, Error<AdminUsergroupsAddTeamsError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let team_ids = params.team_ids;
    let usergroup_id = params.usergroup_id;
    let auto_provision = params.auto_provision;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/admin.usergroups.addTeams", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("token", token.to_string());
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    if let Some(local_var_param_value) = auto_provision {
        local_var_form_params.insert("auto_provision", local_var_param_value.to_string());
    }
    local_var_form_params.insert("team_ids", team_ids.to_string());
    local_var_form_params.insert("usergroup_id", usergroup_id.to_string());
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<AdminUsergroupsAddTeamsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// List the channels linked to an org-level IDP group (user group).
pub async fn admin_usergroups_list_channels(configuration: &configuration::Configuration, params: AdminUsergroupsListChannelsParams) -> Result<crate::models::DefaultSuccessTemplate, Error<AdminUsergroupsListChannelsError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let usergroup_id = params.usergroup_id;
    let team_id = params.team_id;
    let include_num_members = params.include_num_members;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/admin.usergroups.listChannels", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("usergroup_id", &usergroup_id.to_string())]);
    if let Some(ref local_var_str) = team_id {
        local_var_req_builder = local_var_req_builder.query(&[("team_id", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = include_num_members {
        local_var_req_builder = local_var_req_builder.query(&[("include_num_members", &local_var_str.to_string())]);
    }
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
        let local_var_entity: Option<AdminUsergroupsListChannelsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Remove one or more default channels from an org-level IDP group (user group).
pub async fn admin_usergroups_remove_channels(configuration: &configuration::Configuration, params: AdminUsergroupsRemoveChannelsParams) -> Result<crate::models::DefaultSuccessTemplate, Error<AdminUsergroupsRemoveChannelsError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let channel_ids = params.channel_ids;
    let usergroup_id = params.usergroup_id;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/admin.usergroups.removeChannels", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("token", token.to_string());
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    local_var_form_params.insert("channel_ids", channel_ids.to_string());
    local_var_form_params.insert("usergroup_id", usergroup_id.to_string());
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<AdminUsergroupsRemoveChannelsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

