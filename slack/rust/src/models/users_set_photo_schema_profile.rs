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
pub struct UsersSetPhotoSchemaProfile {
    #[serde(rename = "avatar_hash")]
    pub avatar_hash: String,
    #[serde(rename = "image_1024")]
    pub image_1024: String,
    #[serde(rename = "image_192")]
    pub image_192: String,
    #[serde(rename = "image_24")]
    pub image_24: String,
    #[serde(rename = "image_32")]
    pub image_32: String,
    #[serde(rename = "image_48")]
    pub image_48: String,
    #[serde(rename = "image_512")]
    pub image_512: String,
    #[serde(rename = "image_72")]
    pub image_72: String,
    #[serde(rename = "image_original")]
    pub image_original: String,
}

impl UsersSetPhotoSchemaProfile {
    pub fn new(avatar_hash: String, image_1024: String, image_192: String, image_24: String, image_32: String, image_48: String, image_512: String, image_72: String, image_original: String) -> UsersSetPhotoSchemaProfile {
        UsersSetPhotoSchemaProfile {
            avatar_hash,
            image_1024,
            image_192,
            image_24,
            image_32,
            image_48,
            image_512,
            image_72,
            image_original,
        }
    }
}


