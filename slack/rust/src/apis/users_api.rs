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

/// struct for passing parameters to the method [`users_conversations`]
#[derive(Clone, Debug, Default)]
pub struct UsersConversationsParams {
    /// Authentication token. Requires scope: `conversations:read`
    pub token: Option<String>,
    /// Browse conversations by a specific user ID's membership. Non-public channels are restricted to those where the calling user shares membership.
    pub user: Option<String>,
    /// Mix and match channel types by providing a comma-separated list of any combination of `public_channel`, `private_channel`, `mpim`, `im`
    pub types: Option<String>,
    /// Set to `true` to exclude archived channels from the list
    pub exclude_archived: Option<bool>,
    /// The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the list hasn't been reached. Must be an integer no larger than 1000.
    pub limit: Option<i32>,
    /// Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
    pub cursor: Option<String>
}

/// struct for passing parameters to the method [`users_delete_photo`]
#[derive(Clone, Debug, Default)]
pub struct UsersDeletePhotoParams {
    /// Authentication token. Requires scope: `users.profile:write`
    pub token: String
}

/// struct for passing parameters to the method [`users_get_presence`]
#[derive(Clone, Debug, Default)]
pub struct UsersGetPresenceParams {
    /// Authentication token. Requires scope: `users:read`
    pub token: String,
    /// User to get presence info on. Defaults to the authed user.
    pub user: Option<String>
}

/// struct for passing parameters to the method [`users_identity`]
#[derive(Clone, Debug, Default)]
pub struct UsersIdentityParams {
    /// Authentication token. Requires scope: `identity.basic`
    pub token: Option<String>
}

/// struct for passing parameters to the method [`users_info`]
#[derive(Clone, Debug, Default)]
pub struct UsersInfoParams {
    /// Authentication token. Requires scope: `users:read`
    pub token: String,
    /// Set this to `true` to receive the locale for this user. Defaults to `false`
    pub include_locale: Option<bool>,
    /// User to get info on
    pub user: Option<String>
}

/// struct for passing parameters to the method [`users_list`]
#[derive(Clone, Debug, Default)]
pub struct UsersListParams {
    /// Authentication token. Requires scope: `users:read`
    pub token: Option<String>,
    /// The maximum number of items to return. Fewer than the requested number of items may be returned, even if the end of the users list hasn't been reached. Providing no `limit` value will result in Slack attempting to deliver you the entire result set. If the collection is too large you may experience `limit_required` or HTTP 500 errors.
    pub limit: Option<i32>,
    /// Paginate through collections of data by setting the `cursor` parameter to a `next_cursor` attribute returned by a previous request's `response_metadata`. Default value fetches the first \"page\" of the collection. See [pagination](/docs/pagination) for more detail.
    pub cursor: Option<String>,
    /// Set this to `true` to receive the locale for users. Defaults to `false`
    pub include_locale: Option<bool>
}

/// struct for passing parameters to the method [`users_lookup_by_email`]
#[derive(Clone, Debug, Default)]
pub struct UsersLookupByEmailParams {
    /// Authentication token. Requires scope: `users:read.email`
    pub token: String,
    /// An email address belonging to a user in the workspace
    pub email: String
}

/// struct for passing parameters to the method [`users_profile_get`]
#[derive(Clone, Debug, Default)]
pub struct UsersProfileGetParams {
    /// Authentication token. Requires scope: `users.profile:read`
    pub token: String,
    /// Include labels for each ID in custom profile fields
    pub include_labels: Option<bool>,
    /// User to retrieve profile info for
    pub user: Option<String>
}

/// struct for passing parameters to the method [`users_profile_set`]
#[derive(Clone, Debug, Default)]
pub struct UsersProfileSetParams {
    /// Authentication token. Requires scope: `users.profile:write`
    pub token: String,
    /// Name of a single key to set. Usable only if `profile` is not passed.
    pub name: Option<String>,
    /// Collection of key:value pairs presented as a URL-encoded JSON hash. At most 50 fields may be set. Each field name is limited to 255 characters.
    pub profile: Option<String>,
    /// ID of user to change. This argument may only be specified by team admins on paid teams.
    pub user: Option<String>,
    /// Value to set a single key to. Usable only if `profile` is not passed.
    pub value: Option<String>
}

/// struct for passing parameters to the method [`users_set_active`]
#[derive(Clone, Debug, Default)]
pub struct UsersSetActiveParams {
    /// Authentication token. Requires scope: `users:write`
    pub token: String
}

/// struct for passing parameters to the method [`users_set_photo`]
#[derive(Clone, Debug, Default)]
pub struct UsersSetPhotoParams {
    /// Authentication token. Requires scope: `users.profile:write`
    pub token: String,
    /// Width/height of crop box (always square)
    pub crop_w: Option<String>,
    /// X coordinate of top-left corner of crop box
    pub crop_x: Option<String>,
    /// Y coordinate of top-left corner of crop box
    pub crop_y: Option<String>,
    /// File contents via `multipart/form-data`.
    pub image: Option<String>
}

/// struct for passing parameters to the method [`users_set_presence`]
#[derive(Clone, Debug, Default)]
pub struct UsersSetPresenceParams {
    /// Authentication token. Requires scope: `users:write`
    pub token: String,
    /// Either `auto` or `away`
    pub presence: String
}


/// struct for typed errors of method [`users_conversations`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UsersConversationsError {
    DefaultResponse(crate::models::UsersConversationsErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`users_delete_photo`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UsersDeletePhotoError {
    DefaultResponse(crate::models::UsersDeletePhotoErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`users_get_presence`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UsersGetPresenceError {
    DefaultResponse(crate::models::UsersCountsErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`users_identity`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UsersIdentityError {
    DefaultResponse(crate::models::UsersIdentityErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`users_info`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UsersInfoError {
    DefaultResponse(crate::models::UsersInfoErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`users_list`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UsersListError {
    DefaultResponse(crate::models::UsersListErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`users_lookup_by_email`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UsersLookupByEmailError {
    DefaultResponse(crate::models::UsersLookupByEmailErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`users_profile_get`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UsersProfileGetError {
    DefaultResponse(crate::models::UsersProfileGetErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`users_profile_set`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UsersProfileSetError {
    DefaultResponse(crate::models::UsersProfileSetErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`users_set_active`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UsersSetActiveError {
    DefaultResponse(crate::models::UsersSetActiveErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`users_set_photo`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UsersSetPhotoError {
    DefaultResponse(crate::models::UsersSetPhotoErrorSchema),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`users_set_presence`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum UsersSetPresenceError {
    DefaultResponse(crate::models::UsersSetPresenceErrorSchema),
    UnknownValue(serde_json::Value),
}


/// List conversations the calling user may access.
pub async fn users_conversations(configuration: &configuration::Configuration, params: UsersConversationsParams) -> Result<crate::models::UsersConversationsSuccessSchema, Error<UsersConversationsError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let user = params.user;
    let types = params.types;
    let exclude_archived = params.exclude_archived;
    let limit = params.limit;
    let cursor = params.cursor;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/users.conversations", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = token {
        local_var_req_builder = local_var_req_builder.query(&[("token", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = user {
        local_var_req_builder = local_var_req_builder.query(&[("user", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = types {
        local_var_req_builder = local_var_req_builder.query(&[("types", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = exclude_archived {
        local_var_req_builder = local_var_req_builder.query(&[("exclude_archived", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = limit {
        local_var_req_builder = local_var_req_builder.query(&[("limit", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = cursor {
        local_var_req_builder = local_var_req_builder.query(&[("cursor", &local_var_str.to_string())]);
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
        let local_var_entity: Option<UsersConversationsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Delete the user profile photo
pub async fn users_delete_photo(configuration: &configuration::Configuration, params: UsersDeletePhotoParams) -> Result<crate::models::UsersDeletePhotoSchema, Error<UsersDeletePhotoError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/users.deletePhoto", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    local_var_form_params.insert("token", token.to_string());
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<UsersDeletePhotoError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Gets user presence information.
pub async fn users_get_presence(configuration: &configuration::Configuration, params: UsersGetPresenceParams) -> Result<crate::models::ApiMethodUsersGetPresence, Error<UsersGetPresenceError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let user = params.user;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/users.getPresence", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("token", &token.to_string())]);
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
        let local_var_entity: Option<UsersGetPresenceError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Get a user's identity.
pub async fn users_identity(configuration: &configuration::Configuration, params: UsersIdentityParams) -> Result<Vec<crate::models::UsersIdentitySchemaInner>, Error<UsersIdentityError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/users.identity", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = token {
        local_var_req_builder = local_var_req_builder.query(&[("token", &local_var_str.to_string())]);
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
        let local_var_entity: Option<UsersIdentityError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Gets information about a user.
pub async fn users_info(configuration: &configuration::Configuration, params: UsersInfoParams) -> Result<crate::models::UsersInfoSuccessSchema, Error<UsersInfoError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let include_locale = params.include_locale;
    let user = params.user;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/users.info", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("token", &token.to_string())]);
    if let Some(ref local_var_str) = include_locale {
        local_var_req_builder = local_var_req_builder.query(&[("include_locale", &local_var_str.to_string())]);
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
        let local_var_entity: Option<UsersInfoError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Lists all users in a Slack team.
pub async fn users_list(configuration: &configuration::Configuration, params: UsersListParams) -> Result<crate::models::UsersListSchema, Error<UsersListError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let limit = params.limit;
    let cursor = params.cursor;
    let include_locale = params.include_locale;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/users.list", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = token {
        local_var_req_builder = local_var_req_builder.query(&[("token", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = limit {
        local_var_req_builder = local_var_req_builder.query(&[("limit", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = cursor {
        local_var_req_builder = local_var_req_builder.query(&[("cursor", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = include_locale {
        local_var_req_builder = local_var_req_builder.query(&[("include_locale", &local_var_str.to_string())]);
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
        let local_var_entity: Option<UsersListError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Find a user with an email address.
pub async fn users_lookup_by_email(configuration: &configuration::Configuration, params: UsersLookupByEmailParams) -> Result<crate::models::UsersLookupByEmailSuccessSchema, Error<UsersLookupByEmailError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let email = params.email;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/users.lookupByEmail", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("token", &token.to_string())]);
    local_var_req_builder = local_var_req_builder.query(&[("email", &email.to_string())]);
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
        let local_var_entity: Option<UsersLookupByEmailError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Retrieves a user's profile information.
pub async fn users_profile_get(configuration: &configuration::Configuration, params: UsersProfileGetParams) -> Result<crate::models::UsersProfileGetSchema, Error<UsersProfileGetError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let include_labels = params.include_labels;
    let user = params.user;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/users.profile.get", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

    local_var_req_builder = local_var_req_builder.query(&[("token", &token.to_string())]);
    if let Some(ref local_var_str) = include_labels {
        local_var_req_builder = local_var_req_builder.query(&[("include_labels", &local_var_str.to_string())]);
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
        let local_var_entity: Option<UsersProfileGetError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Set the profile information for a user.
pub async fn users_profile_set(configuration: &configuration::Configuration, params: UsersProfileSetParams) -> Result<crate::models::UsersProfileSetSchema, Error<UsersProfileSetError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let name = params.name;
    let profile = params.profile;
    let user = params.user;
    let value = params.value;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/users.profile.set", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("token", token.to_string());
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    if let Some(local_var_param_value) = name {
        local_var_form_params.insert("name", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = profile {
        local_var_form_params.insert("profile", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = user {
        local_var_form_params.insert("user", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = value {
        local_var_form_params.insert("value", local_var_param_value.to_string());
    }
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<UsersProfileSetError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Marked a user as active. Deprecated and non-functional.
pub async fn users_set_active(configuration: &configuration::Configuration, params: UsersSetActiveParams) -> Result<crate::models::UsersSetActiveSchema, Error<UsersSetActiveError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/users.setActive", local_var_configuration.base_path);
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
        let local_var_entity: Option<UsersSetActiveError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Set the user profile photo
pub async fn users_set_photo(configuration: &configuration::Configuration, params: UsersSetPhotoParams) -> Result<crate::models::UsersSetPhotoSchema, Error<UsersSetPhotoError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let crop_w = params.crop_w;
    let crop_x = params.crop_x;
    let crop_y = params.crop_y;
    let image = params.image;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/users.setPhoto", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    if let Some(local_var_param_value) = crop_w {
        local_var_form_params.insert("crop_w", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = crop_x {
        local_var_form_params.insert("crop_x", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = crop_y {
        local_var_form_params.insert("crop_y", local_var_param_value.to_string());
    }
    if let Some(local_var_param_value) = image {
        local_var_form_params.insert("image", local_var_param_value.to_string());
    }
    local_var_form_params.insert("token", token.to_string());
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<UsersSetPhotoError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Manually sets user presence.
pub async fn users_set_presence(configuration: &configuration::Configuration, params: UsersSetPresenceParams) -> Result<crate::models::UsersSetPresenceSchema, Error<UsersSetPresenceError>> {
    let local_var_configuration = configuration;

    // unbox the parameters
    let token = params.token;
    let presence = params.presence;


    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/users.setPresence", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    local_var_req_builder = local_var_req_builder.header("token", token.to_string());
    if let Some(ref local_var_token) = local_var_configuration.oauth_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    let mut local_var_form_params = std::collections::HashMap::new();
    local_var_form_params.insert("presence", presence.to_string());
    local_var_req_builder = local_var_req_builder.form(&local_var_form_params);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<UsersSetPresenceError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

