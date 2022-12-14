/*
 * api.video
 *
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::apis::ResponseContent;
use super::{Error, configuration};

/// struct for passing parameters to the method [`p_ost_auth_api_key`]
#[derive(Clone, Debug, Default)]
pub struct POstAuthApiKeyParams {
    pub authenticate_payload: Option<crate::models::AuthenticatePayload>
}

/// struct for passing parameters to the method [`p_ost_auth_refresh`]
#[derive(Clone, Debug, Default)]
pub struct POstAuthRefreshParams {
    pub refresh_token_payload: Option<crate::models::RefreshTokenPayload>
}


/// struct for typed errors of method [`p_ost_auth_api_key`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum POstAuthApiKeyError {
    Status400(crate::models::BadRequest),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`p_ost_auth_refresh`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum POstAuthRefreshError {
    Status400(crate::models::BadRequest),
    UnknownValue(serde_json::Value),
}


/// To get started, submit your API key in the body of your request. api.video returns an access token that is valid for one hour (3600 seconds). A refresh token is also returned. View a [tutorial](https://api.video/blog/tutorials/authentication-tutorial) on authentication. All tutorials using the [authentication endpoint](https://api.video/blog/endpoints/authenticate)
pub async fn p_ost_auth_api_key(configuration: &configuration::Configuration, params: POstAuthApiKeyParams) -> Result<crate::models::AccessToken, Error<POstAuthApiKeyError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let authenticate_payload = params.authenticate_payload;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/auth/api-key", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.json(&authenticate_payload);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<POstAuthApiKeyError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Use the refresh endpoint with the refresh token you received when you first authenticated using the api-key endpoint. Send the refresh token in the body of your request. The api.video API returns a new access token that is valid for one hour (3600 seconds) and a new refresh token.  
pub async fn p_ost_auth_refresh(configuration: &configuration::Configuration, params: POstAuthRefreshParams) -> Result<crate::models::AccessToken, Error<POstAuthRefreshError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let refresh_token_payload = params.refresh_token_payload;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/auth/refresh", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.json(&refresh_token_payload);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<POstAuthRefreshError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

