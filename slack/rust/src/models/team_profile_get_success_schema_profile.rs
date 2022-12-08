/*
 * Slack Web API
 *
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct TeamProfileGetSuccessSchemaProfile {
    #[serde(rename = "fields")]
    pub fields: Vec<crate::models::ObjsTeamProfileField>,
}

impl TeamProfileGetSuccessSchemaProfile {
    pub fn new(fields: Vec<crate::models::ObjsTeamProfileField>) -> TeamProfileGetSuccessSchemaProfile {
        TeamProfileGetSuccessSchemaProfile {
            fields,
        }
    }
}


