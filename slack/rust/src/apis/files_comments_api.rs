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

/// struct for passing parameters to the method [`files_comments_delete`]
#[derive(Clone, Debug, Default)]
pub struct FilesCommentsDeleteParams {
    /// Authentication token. Requires scope: `files:write:user`
    pub token: Option<String>,
    /// File to delete a comment from.
    pub file: Option<String>,
    /// The comment to delete.
    pub id: Option<String>
}


/// struct for typed errors of method [`files_comments_delete`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum FilesCommentsDeleteError {
    DefaultResponse(crate::models::FilesCommentsDeleteErrorSchema),
    UnknownValue(serde_json::Value),
}


/// Deletes an existing comment on a file.
pub async fn files_comments_delete(configuration: &configuration::Configuration, params: FilesCommentsDeleteParams) -> Result<crate::models::FilesCommentsDeleteSchema, Error<FilesCommentsDeleteError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let file = params.file;
    let id = params.id;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/files.comments.delete", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(local_var_param_value) = token {
        local_var_req_builder = local_var_req_builder.header("token", local_var_param_value.to_string());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    if let Some(local_var_param_value) = file {
        local_var_form_params.insert("file", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = id {
        local_var_form_params.insert("id", local_var_param_value.to_string());
    }
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<FilesCommentsDeleteError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

