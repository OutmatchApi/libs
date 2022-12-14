/*
 * Outmatch API
 *
 * Outmatch API
 *
 * The version of the OpenAPI document: 0.0.45
 * Contact: internal@outmatchapi.com
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct User {
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "email")]
    pub email: String,
    #[serde(rename = "firstName")]
    pub first_name: String,
    #[serde(rename = "lastName")]
    pub last_name: String,
    #[serde(rename = "company")]
    pub company: String,
}

impl User {
    pub fn new(id: String, email: String, first_name: String, last_name: String, company: String) -> User {
        User {
            id,
            email,
            first_name,
            last_name,
            company,
        }
    }
}


