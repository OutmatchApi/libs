/*
 * Outmatch API
 *
 * Outmatch API
 *
 * The version of the OpenAPI document: 0.0.44
 * Contact: internal@outmatchapi.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct CreateApiAppReleaseSdksRequest {
    #[serde(rename = "languages")]
    pub languages: Vec<crate::models::Language>,
}

impl CreateApiAppReleaseSdksRequest {
    pub fn new(languages: Vec<crate::models::Language>) -> CreateApiAppReleaseSdksRequest {
        CreateApiAppReleaseSdksRequest {
            languages,
        }
    }
}


