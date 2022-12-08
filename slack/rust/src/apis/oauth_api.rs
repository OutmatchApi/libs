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

/// struct for passing parameters to the method [`oauth_access`]
#[derive(Clone, Debug, Default)]
pub struct OauthAccessParams {
    /// Issued when you created your application.
    pub client_id: Option<String>,
    /// Issued when you created your application.
    pub client_secret: Option<String>,
    /// The `code` param returned via the OAuth callback.
    pub code: Option<String>,
    /// This must match the originally submitted URI (if one was sent).
    pub redirect_uri: Option<String>,
    /// Request the user to add your app only to a single channel. Only valid with a [legacy workspace app](https://api.slack.com/legacy-workspace-apps).
    pub single_channel: Option<bool>
}

/// struct for passing parameters to the method [`oauth_token`]
#[derive(Clone, Debug, Default)]
pub struct OauthTokenParams {
    /// Issued when you created your application.
    pub client_id: Option<String>,
    /// Issued when you created your application.
    pub client_secret: Option<String>,
    /// The `code` param returned via the OAuth callback.
    pub code: Option<String>,
    /// This must match the originally submitted URI (if one was sent).
    pub redirect_uri: Option<String>,
    /// Request the user to add your app only to a single channel.
    pub single_channel: Option<bool>
}

/// struct for passing parameters to the method [`oauth_v2_access`]
#[derive(Clone, Debug, Default)]
pub struct OauthV2AccessParams {
    /// The `code` param returned via the OAuth callback.
    pub code: String,
    /// Issued when you created your application.
    pub client_id: Option<String>,
    /// Issued when you created your application.
    pub client_secret: Option<String>,
    /// This must match the originally submitted URI (if one was sent).
    pub redirect_uri: Option<String>
}


/// struct for typed errors of method [`oauth_access`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum OauthAccessError {
    DefaultResponse(crate::models::DefaultErrorTemplate),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`oauth_token`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum OauthTokenError {
    DefaultResponse(crate::models::DefaultErrorTemplate),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`oauth_v2_access`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum OauthV2AccessError {
    DefaultResponse(crate::models::DefaultErrorTemplate),
    UnknownValue(serde_json::Value),
}


/// Exchanges a temporary OAuth verifier code for an access token.
pub async fn oauth_access(configuration: &configuration::Configuration, params: OauthAccessParams) -> Result<crate::models::DefaultSuccessTemplate, Error<OauthAccessError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let client_id = params.client_id;
    let client_secret = params.client_secret;
    let code = params.code;
    let redirect_uri = params.redirect_uri;
    let single_channel = params.single_channel;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/oauth.access", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = client_id {
        local_var_req_builder = local_var_req_builder.query(&[("client_id", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = client_secret {
        local_var_req_builder = local_var_req_builder.query(&[("client_secret", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = code {
        local_var_req_builder = local_var_req_builder.query(&[("code", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = redirect_uri {
        local_var_req_builder = local_var_req_builder.query(&[("redirect_uri", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = single_channel {
        local_var_req_builder = local_var_req_builder.query(&[("single_channel", &local_var_str.to_string())]);
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
        let local_var_entity: Option<OauthAccessError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Exchanges a temporary OAuth verifier code for a workspace token.
pub async fn oauth_token(configuration: &configuration::Configuration, params: OauthTokenParams) -> Result<crate::models::DefaultSuccessTemplate, Error<OauthTokenError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let client_id = params.client_id;
    let client_secret = params.client_secret;
    let code = params.code;
    let redirect_uri = params.redirect_uri;
    let single_channel = params.single_channel;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/oauth.token", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = client_id {
        local_var_req_builder = local_var_req_builder.query(&[("client_id", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = client_secret {
        local_var_req_builder = local_var_req_builder.query(&[("client_secret", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = code {
        local_var_req_builder = local_var_req_builder.query(&[("code", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = redirect_uri {
        local_var_req_builder = local_var_req_builder.query(&[("redirect_uri", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = single_channel {
        local_var_req_builder = local_var_req_builder.query(&[("single_channel", &local_var_str.to_string())]);
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
        let local_var_entity: Option<OauthTokenError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Exchanges a temporary OAuth verifier code for an access token.
pub async fn oauth_v2_access(configuration: &configuration::Configuration, params: OauthV2AccessParams) -> Result<crate::models::DefaultSuccessTemplate, Error<OauthV2AccessError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let code = params.code;
    let client_id = params.client_id;
    let client_secret = params.client_secret;
    let redirect_uri = params.redirect_uri;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/oauth.v2.access", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = client_id {
        local_var_req_builder = local_var_req_builder.query(&[("client_id", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = client_secret {
        local_var_req_builder = local_var_req_builder.query(&[("client_secret", &local_var_str.to_string())]);
    }
    local_var_req_builder = local_var_req_builder.query(&[("code", &code.to_string())]);
    if let Some(ref local_var_str) = redirect_uri {
        local_var_req_builder = local_var_req_builder.query(&[("redirect_uri", &local_var_str.to_string())]);
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
        let local_var_entity: Option<OauthV2AccessError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

