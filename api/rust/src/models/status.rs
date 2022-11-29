/*
 * Outmatch API
 *
 * Outmatch API
 *
 * The version of the OpenAPI document: 0.0.45
 * Contact: internal@outmatchapi.com
 * Generated by: https://openapi-generator.tech
 */


/// 
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Status {
    #[serde(rename = "pending")]
    Pending,
    #[serde(rename = "success")]
    Success,
    #[serde(rename = "fail")]
    Fail,

}

impl ToString for Status {
    fn to_string(&self) -> String {
        match self {
            Self::Pending => String::from("pending"),
            Self::Success => String::from("success"),
            Self::Fail => String::from("fail"),
        }
    }
}

impl Default for Status {
    fn default() -> Status {
        Self::Pending
    }
}




