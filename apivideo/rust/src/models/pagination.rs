/*
 * api.video
 *
 * api.video is an API that encodes on the go to facilitate immediate playback, enhancing viewer streaming experiences across multiple devices and platforms. You can stream live or on-demand online videos within minutes.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct Pagination {
    /// The current page index.
    #[serde(rename = "currentPage", skip_serializing_if = "Option::is_none")]
    pub current_page: Option<i32>,
    /// The number of items on the current page.
    #[serde(rename = "currentPageItems", skip_serializing_if = "Option::is_none")]
    pub current_page_items: Option<i32>,
    /// Total number of items that exist.
    #[serde(rename = "itemsTotal", skip_serializing_if = "Option::is_none")]
    pub items_total: Option<i32>,
    #[serde(rename = "links")]
    pub links: Vec<crate::models::PaginationLink>,
    /// Maximum number of item per page.
    #[serde(rename = "pageSize", skip_serializing_if = "Option::is_none")]
    pub page_size: Option<i32>,
    /// Number of items listed in the current page.
    #[serde(rename = "pagesTotal", skip_serializing_if = "Option::is_none")]
    pub pages_total: Option<i32>,
}

impl Pagination {
    pub fn new(links: Vec<crate::models::PaginationLink>) -> Pagination {
        Pagination {
            current_page: None,
            current_page_items: None,
            items_total: None,
            links,
            page_size: None,
            pages_total: None,
        }
    }
}


