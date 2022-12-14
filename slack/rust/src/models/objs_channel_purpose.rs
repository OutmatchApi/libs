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
pub struct ObjsChannelPurpose {
    #[serde(rename = "creator")]
    pub creator: String,
    #[serde(rename = "last_set")]
    pub last_set: i32,
    #[serde(rename = "value")]
    pub value: String,
}

impl ObjsChannelPurpose {
    pub fn new(creator: String, last_set: i32, value: String) -> ObjsChannelPurpose {
        ObjsChannelPurpose {
            creator,
            last_set,
            value,
        }
    }
}


