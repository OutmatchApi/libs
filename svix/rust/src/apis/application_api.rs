/*
 * Svix API
 *
 * Welcome to the Svix API documentation!  Useful links: [Homepage](https://www.svix.com) | [Support email](mailto:support+docs@svix.com) | [Blog](https://www.svix.com/blog/) | [Slack Community](https://www.svix.com/slack/)  # Introduction  This is the reference documentation and schemas for the [Svix webhook service](https://www.svix.com) API. For tutorials and other documentation please refer to [the documentation](https://docs.svix.com).  ## Main concepts  In Svix you have four important entities you will be interacting with:  - `messages`: these are the webhooks being sent. They can have contents and a few other properties. - `application`: this is where `messages` are sent to. Usually you want to create one application for each user on your platform. - `endpoint`: endpoints are the URLs messages will be sent to. Each application can have multiple `endpoints` and each message sent to that application will be sent to all of them (unless they are not subscribed to the sent event type). - `event-type`: event types are identifiers denoting the type of the message being sent. Event types are primarily used to decide which events are sent to which endpoint.   ## Authentication  Get your authentication token (`AUTH_TOKEN`) from the [Svix dashboard](https://dashboard.svix.com) and use it as part of the `Authorization` header as such: `Authorization: Bearer ${AUTH_TOKEN}`.  <SecurityDefinitions />   ## Code samples  The code samples assume you already have the respective libraries installed and you know how to use them. For the latest information on how to do that, please refer to [the documentation](https://docs.svix.com/).   ## Idempotency  Svix supports [idempotency](https://en.wikipedia.org/wiki/Idempotence) for safely retrying requests without accidentally performing the same operation twice. This is useful when an API call is disrupted in transit and you do not receive a response.  To perform an idempotent request, pass the idempotency key in the `Idempotency-Key` header to the request. The idempotency key should be a unique value generated by the client. You can create the key in however way you like, though we suggest using UUID v4, or any other string with enough entropy to avoid collisions.  Svix's idempotency works by saving the resulting status code and body of the first request made for any given idempotency key for any successful request. Subsequent requests with the same key return the same result.  Please note that idempotency is only supported for `POST` requests.   ## Cross-Origin Resource Sharing  This API features Cross-Origin Resource Sharing (CORS) implemented in compliance with [W3C spec](https://www.w3.org/TR/cors/). And that allows cross-domain communication from the browser. All responses have a wildcard same-origin which makes them completely public and accessible to everyone, including any code on any site. 
 *
 * The version of the OpenAPI document: 1.4.0
 * 
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::apis::ResponseContent;
use super::{Error, configuration};

/// struct for passing parameters to the method [`create_application_api_v1_app_post`]
#[derive(Clone, Debug, Default)]
pub struct CreateApplicationApiV1AppPostParams {
    pub application_in: crate::models::ApplicationIn,
    /// Get an existing application, or create a new one if doesn't exist. It's two separate functions in the libs.
    pub get_if_exists: Option<bool>,
    /// The request's idempotency key
    pub idempotency_key: Option<String>
}

/// struct for passing parameters to the method [`delete_application_api_v1_app_app_id_delete`]
#[derive(Clone, Debug, Default)]
pub struct DeleteApplicationApiV1AppAppIdDeleteParams {
    pub app_id: String,
    /// The request's idempotency key
    pub idempotency_key: Option<String>
}

/// struct for passing parameters to the method [`get_application_api_v1_app_app_id_get`]
#[derive(Clone, Debug, Default)]
pub struct GetApplicationApiV1AppAppIdGetParams {
    pub app_id: String,
    /// The request's idempotency key
    pub idempotency_key: Option<String>
}

/// struct for passing parameters to the method [`list_applications_api_v1_app_get`]
#[derive(Clone, Debug, Default)]
pub struct ListApplicationsApiV1AppGetParams {
    pub iterator: Option<String>,
    pub limit: Option<i32>,
    /// The request's idempotency key
    pub idempotency_key: Option<String>
}

/// struct for passing parameters to the method [`update_application_api_v1_app_app_id_put`]
#[derive(Clone, Debug, Default)]
pub struct UpdateApplicationApiV1AppAppIdPutParams {
    pub app_id: String,
    pub application_in: crate::models::ApplicationIn,
    /// The request's idempotency key
    pub idempotency_key: Option<String>
}


/// struct for typed errors of method [`create_application_api_v1_app_post`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum CreateApplicationApiV1AppPostError {
    Status401(crate::models::HttpErrorOut),
    Status403(crate::models::HttpErrorOut),
    Status404(crate::models::HttpErrorOut),
    Status409(crate::models::HttpErrorOut),
    Status422(crate::models::HttpValidationError),
    Status429(crate::models::HttpErrorOut),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`delete_application_api_v1_app_app_id_delete`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DeleteApplicationApiV1AppAppIdDeleteError {
    Status401(crate::models::HttpErrorOut),
    Status403(crate::models::HttpErrorOut),
    Status404(crate::models::HttpErrorOut),
    Status409(crate::models::HttpErrorOut),
    Status422(crate::models::HttpValidationError),
    Status429(crate::models::HttpErrorOut),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`get_application_api_v1_app_app_id_get`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetApplicationApiV1AppAppIdGetError {
    Status401(crate::models::HttpErrorOut),
    Status403(crate::models::HttpErrorOut),
    Status404(crate::models::HttpErrorOut),
    Status409(crate::models::HttpErrorOut),
    Status422(crate::models::HttpValidationError),
    Status429(crate::models::HttpErrorOut),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`list_applications_api_v1_app_get`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ListApplicationsApiV1AppGetError {
    Status401(crate::models::HttpErrorOut),
    Status403(crate::models::HttpErrorOut),
    Status404(crate::models::HttpErrorOut),
    Status409(crate::models::HttpErrorOut),
    Status422(crate::models::HttpValidationError),
    Status429(crate::models::HttpErrorOut),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`update_application_api_v1_app_app_id_put`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UpdateApplicationApiV1AppAppIdPutError {
    Status401(crate::models::HttpErrorOut),
    Status403(crate::models::HttpErrorOut),
    Status404(crate::models::HttpErrorOut),
    Status409(crate::models::HttpErrorOut),
    Status422(crate::models::HttpValidationError),
    Status429(crate::models::HttpErrorOut),
    UnknownValue(serde_json::Value),
}


/// Create a new application.
pub async fn create_application_api_v1_app_post(configuration: &configuration::Configuration, params: CreateApplicationApiV1AppPostParams) -> Result<crate::models::ApplicationOut, Error<CreateApplicationApiV1AppPostError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let application_in = params.application_in;
    let get_if_exists = params.get_if_exists;
    let idempotency_key = params.idempotency_key;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/v1/app/", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = get_if_exists {
        local_var_req_builder = local_var_req_builder.query(&[("get_if_exists", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(local_var_param_value) = idempotency_key {
        local_var_req_builder = local_var_req_builder.header("idempotency-key", local_var_param_value.to_string());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&application_in);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<CreateApplicationApiV1AppPostError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Delete an application.
pub async fn delete_application_api_v1_app_app_id_delete(configuration: &configuration::Configuration, params: DeleteApplicationApiV1AppAppIdDeleteParams) -> Result<(), Error<DeleteApplicationApiV1AppAppIdDeleteError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let app_id = params.app_id;
    let idempotency_key = params.idempotency_key;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/v1/app/{app_id}/", local_var_configuration.base_path, app_id=crate::apis::urlencode(app_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::DELETE, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(local_var_param_value) = idempotency_key {
        local_var_req_builder = local_var_req_builder.header("idempotency-key", local_var_param_value.to_string());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        Ok(())
    } else {
        let local_var_entity: Option<DeleteApplicationApiV1AppAppIdDeleteError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Get an application.
pub async fn get_application_api_v1_app_app_id_get(configuration: &configuration::Configuration, params: GetApplicationApiV1AppAppIdGetParams) -> Result<crate::models::ApplicationOut, Error<GetApplicationApiV1AppAppIdGetError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let app_id = params.app_id;
    let idempotency_key = params.idempotency_key;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/v1/app/{app_id}/", local_var_configuration.base_path, app_id=crate::apis::urlencode(app_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(local_var_param_value) = idempotency_key {
        local_var_req_builder = local_var_req_builder.header("idempotency-key", local_var_param_value.to_string());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GetApplicationApiV1AppAppIdGetError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// List of all the organization's applications.
pub async fn list_applications_api_v1_app_get(configuration: &configuration::Configuration, params: ListApplicationsApiV1AppGetParams) -> Result<crate::models::ListResponseApplicationOut, Error<ListApplicationsApiV1AppGetError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let iterator = params.iterator;
    let limit = params.limit;
    let idempotency_key = params.idempotency_key;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/v1/app/", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = iterator {
        local_var_req_builder = local_var_req_builder.query(&[("iterator", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = limit {
        local_var_req_builder = local_var_req_builder.query(&[("limit", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(local_var_param_value) = idempotency_key {
        local_var_req_builder = local_var_req_builder.header("idempotency-key", local_var_param_value.to_string());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ListApplicationsApiV1AppGetError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Update an application.
pub async fn update_application_api_v1_app_app_id_put(configuration: &configuration::Configuration, params: UpdateApplicationApiV1AppAppIdPutParams) -> Result<crate::models::ApplicationOut, Error<UpdateApplicationApiV1AppAppIdPutError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let app_id = params.app_id;
    let application_in = params.application_in;
    let idempotency_key = params.idempotency_key;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/v1/app/{app_id}/", local_var_configuration.base_path, app_id=crate::apis::urlencode(app_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::PUT, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(local_var_param_value) = idempotency_key {
        local_var_req_builder = local_var_req_builder.header("idempotency-key", local_var_param_value.to_string());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&application_in);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<UpdateApplicationApiV1AppAppIdPutError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}
