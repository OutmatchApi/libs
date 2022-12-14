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

/// struct for passing parameters to the method [`search_messages`]
#[derive(Clone, Debug, Default)]
pub struct SearchMessagesParams {
    /// Authentication token. Requires scope: `search:read`
    pub token: String,
    /// Search query.
    pub query: String,
    /// Pass the number of results you want per \"page\". Maximum of `100`.
    pub count: Option<i32>,
    /// Pass a value of `true` to enable query highlight markers (see below).
    pub highlight: Option<bool>,
    pub page: Option<i32>,
    /// Return matches sorted by either `score` or `timestamp`.
    pub sort: Option<String>,
    /// Change sort direction to ascending (`asc`) or descending (`desc`).
    pub sort_dir: Option<String>
}


/// struct for typed errors of method [`search_messages`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum SearchMessagesError {
    DefaultResponse(crate::models::DefaultErrorTemplate),
    UnknownValue(serde_json::Value),
}


/// Searches for messages matching a query.
pub async fn search_messages(configuration: &configuration::Configuration, params: SearchMessagesParams) -> Result<crate::models::DefaultSuccessTemplate, Error<SearchMessagesError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let query = params.query;
    let count = params.count;
    let highlight = params.highlight;
    let page = params.page;
    let sort = params.sort;
    let sort_dir = params.sort_dir;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/search.messages", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("token", &token.to_string())]);
    if let Some(ref local_var_str) = count {
        local_var_req_builder = local_var_req_builder.query(&[("count", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = highlight {
        local_var_req_builder = local_var_req_builder.query(&[("highlight", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = page {
        local_var_req_builder = local_var_req_builder.query(&[("page", &local_var_str.to_string())]);
    }
    local_var_req_builder = local_var_req_builder.query(&[("query", &query.to_string())]);
    if let Some(ref local_var_str) = sort {
        local_var_req_builder = local_var_req_builder.query(&[("sort", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = sort_dir {
        local_var_req_builder = local_var_req_builder.query(&[("sort_dir", &local_var_str.to_string())]);
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
        let local_var_entity: Option<SearchMessagesError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

