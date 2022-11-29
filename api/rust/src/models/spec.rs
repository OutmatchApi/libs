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
pub struct Spec {
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "specType")]
    pub spec_type: String,
    #[serde(rename = "link")]
    pub link: String,
    #[serde(rename = "title")]
    pub title: String,
    #[serde(rename = "description")]
    pub description: String,
    #[serde(rename = "version")]
    pub version: String,
    #[serde(rename = "logo")]
    pub logo: Box<crate::models::Logo>,
}

impl Spec {
    pub fn new(id: String, spec_type: String, link: String, title: String, description: String, version: String, logo: crate::models::Logo) -> Spec {
        Spec {
            id,
            spec_type,
            link,
            title,
            description,
            version,
            logo: Box::new(logo),
        }
    }
}


