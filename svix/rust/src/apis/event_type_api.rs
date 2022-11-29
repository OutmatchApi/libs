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

/// struct for passing parameters to the method [`create_event_type_api_v1_event_type_post`]
#[derive(Clone, Debug, Default)]
pub struct CreateEventTypeApiV1EventTypePostParams {
    pub event_type_in: crate::models::EventTypeIn,
    /// The request's idempotency key
    pub idempotency_key: Option<String>
}

/// struct for passing parameters to the method [`delete_event_type_api_v1_event_type_event_type_name_delete`]
#[derive(Clone, Debug, Default)]
pub struct DeleteEventTypeApiV1EventTypeEventTypeNameDeleteParams {
    pub event_type_name: String,
    /// The request's idempotency key
    pub idempotency_key: Option<String>
}

/// struct for passing parameters to the method [`get_event_type_api_v1_event_type_event_type_name_get`]
#[derive(Clone, Debug, Default)]
pub struct GetEventTypeApiV1EventTypeEventTypeNameGetParams {
    pub event_type_name: String,
    /// The request's idempotency key
    pub idempotency_key: Option<String>
}

/// struct for passing parameters to the method [`list_event_types_api_v1_event_type_get`]
#[derive(Clone, Debug, Default)]
pub struct ListEventTypesApiV1EventTypeGetParams {
    pub iterator: Option<String>,
    pub limit: Option<i32>,
    pub with_content: Option<bool>,
    pub include_archived: Option<bool>,
    /// The request's idempotency key
    pub idempotency_key: Option<String>
}

/// struct for passing parameters to the method [`update_event_type_api_v1_event_type_event_type_name_put`]
#[derive(Clone, Debug, Default)]
pub struct UpdateEventTypeApiV1EventTypeEventTypeNamePutParams {
    pub event_type_name: String,
    pub event_type_update: crate::models::EventTypeUpdate,
    /// The request's idempotency key
    pub idempotency_key: Option<String>
}


/// struct for typed errors of method [`create_event_type_api_v1_event_type_post`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum CreateEventTypeApiV1EventTypePostError {
    Status401(crate::models::HttpErrorOut),
    Status403(crate::models::HttpErrorOut),
    Status404(crate::models::HttpErrorOut),
    Status409(crate::models::HttpErrorOut),
    Status422(crate::models::HttpValidationError),
    Status429(crate::models::HttpErrorOut),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`delete_event_type_api_v1_event_type_event_type_name_delete`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DeleteEventTypeApiV1EventTypeEventTypeNameDeleteError {
    Status401(crate::models::HttpErrorOut),
    Status403(crate::models::HttpErrorOut),
    Status404(crate::models::HttpErrorOut),
    Status409(crate::models::HttpErrorOut),
    Status422(crate::models::HttpValidationError),
    Status429(crate::models::HttpErrorOut),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`get_event_type_api_v1_event_type_event_type_name_get`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetEventTypeApiV1EventTypeEventTypeNameGetError {
    Status401(crate::models::HttpErrorOut),
    Status403(crate::models::HttpErrorOut),
    Status404(crate::models::HttpErrorOut),
    Status409(crate::models::HttpErrorOut),
    Status422(crate::models::HttpValidationError),
    Status429(crate::models::HttpErrorOut),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`list_event_types_api_v1_event_type_get`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ListEventTypesApiV1EventTypeGetError {
    Status401(crate::models::HttpErrorOut),
    Status403(crate::models::HttpErrorOut),
    Status404(crate::models::HttpErrorOut),
    Status409(crate::models::HttpErrorOut),
    Status422(crate::models::HttpValidationError),
    Status429(crate::models::HttpErrorOut),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`update_event_type_api_v1_event_type_event_type_name_put`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UpdateEventTypeApiV1EventTypeEventTypeNamePutError {
    Status401(crate::models::HttpErrorOut),
    Status403(crate::models::HttpErrorOut),
    Status404(crate::models::HttpErrorOut),
    Status409(crate::models::HttpErrorOut),
    Status422(crate::models::HttpValidationError),
    Status429(crate::models::HttpErrorOut),
    UnknownValue(serde_json::Value),
}


/// Create new or unarchive existing event type.  Unarchiving an event type will allow endpoints to filter on it and messages to be sent with it. Endpoints filtering on the event type before archival will continue to filter on it. This operation does not preserve the description and schemas.
pub async fn create_event_type_api_v1_event_type_post(configuration: &configuration::Configuration, params: CreateEventTypeApiV1EventTypePostParams) -> Result<crate::models::EventTypeOut, Error<CreateEventTypeApiV1EventTypePostError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let event_type_in = params.event_type_in;
    let idempotency_key = params.idempotency_key;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/v1/event-type/", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(local_var_param_value) = idempotency_key {
        local_var_req_builder = local_var_req_builder.header("idempotency-key", local_var_param_value.to_string());
    }
    if let Some(ref local_var_token) = local_var_configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&event_type_in);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<CreateEventTypeApiV1EventTypePostError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Archive an event type.  Endpoints already configured to filter on an event type will continue to do so after archival. However, new messages can not be sent with it and endpoints can not filter on it. An event type can be unarchived with the [create operation](#operation/create_event_type_api_v1_event_type__post).
pub async fn delete_event_type_api_v1_event_type_event_type_name_delete(configuration: &configuration::Configuration, params: DeleteEventTypeApiV1EventTypeEventTypeNameDeleteParams) -> Result<(), Error<DeleteEventTypeApiV1EventTypeEventTypeNameDeleteError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let event_type_name = params.event_type_name;
    let idempotency_key = params.idempotency_key;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/v1/event-type/{event_type_name}/", local_var_configuration.base_path, event_type_name=crate::apis::urlencode(event_type_name));
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
        let local_var_entity: Option<DeleteEventTypeApiV1EventTypeEventTypeNameDeleteError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Get an event type.
pub async fn get_event_type_api_v1_event_type_event_type_name_get(configuration: &configuration::Configuration, params: GetEventTypeApiV1EventTypeEventTypeNameGetParams) -> Result<crate::models::EventTypeOut, Error<GetEventTypeApiV1EventTypeEventTypeNameGetError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let event_type_name = params.event_type_name;
    let idempotency_key = params.idempotency_key;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/v1/event-type/{event_type_name}/", local_var_configuration.base_path, event_type_name=crate::apis::urlencode(event_type_name));
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
        let local_var_entity: Option<GetEventTypeApiV1EventTypeEventTypeNameGetError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Return the list of event types.
pub async fn list_event_types_api_v1_event_type_get(configuration: &configuration::Configuration, params: ListEventTypesApiV1EventTypeGetParams) -> Result<crate::models::ListResponseEventTypeOut, Error<ListEventTypesApiV1EventTypeGetError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let iterator = params.iterator;
    let limit = params.limit;
    let with_content = params.with_content;
    let include_archived = params.include_archived;
    let idempotency_key = params.idempotency_key;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/v1/event-type/", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = iterator {
        local_var_req_builder = local_var_req_builder.query(&[("iterator", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = limit {
        local_var_req_builder = local_var_req_builder.query(&[("limit", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = with_content {
        local_var_req_builder = local_var_req_builder.query(&[("with_content", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = include_archived {
        local_var_req_builder = local_var_req_builder.query(&[("include_archived", &local_var_str.to_string())]);
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
        let local_var_entity: Option<ListEventTypesApiV1EventTypeGetError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Update an event type.
pub async fn update_event_type_api_v1_event_type_event_type_name_put(configuration: &configuration::Configuration, params: UpdateEventTypeApiV1EventTypeEventTypeNamePutParams) -> Result<crate::models::EventTypeOut, Error<UpdateEventTypeApiV1EventTypeEventTypeNamePutError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let event_type_name = params.event_type_name;
    let event_type_update = params.event_type_update;
    let idempotency_key = params.idempotency_key;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/api/v1/event-type/{event_type_name}/", local_var_configuration.base_path, event_type_name=crate::apis::urlencode(event_type_name));
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
    local_var_req_builder = local_var_req_builder.json(&event_type_update);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<UpdateEventTypeApiV1EventTypeEventTypeNamePutError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

