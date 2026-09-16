use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct SearchRequest {
    #[serde(rename = "after", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub after: Option<Option<String>>,
    #[serde(rename = "before", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub before: Option<Option<String>>,
    #[serde(rename = "collapse_duplicates", skip_serializing_if = "Option::is_none")]
    pub collapse_duplicates: Option<bool>,
    #[serde(rename = "customer_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub customer_id: Option<Option<String>>,
    #[serde(rename = "device", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub device: Option<Option<String>>,
    #[serde(rename = "dupe_threshold", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub dupe_threshold: Option<Option<f64>>,
    #[serde(rename = "exclude_tags", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub exclude_tags: Option<Option<Vec<String>>>,
    #[serde(rename = "image", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub image: Option<Option<String>>,
    #[serde(rename = "image_blob_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub image_blob_id: Option<Option<i32>>,
    #[serde(rename = "include_tags", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub include_tags: Option<Option<Vec<String>>>,
    #[serde(rename = "indexed_res", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub indexed_res: Option<Option<i32>>,
    #[serde(rename = "k", skip_serializing_if = "Option::is_none")]
    pub k: Option<i32>,
    #[serde(rename = "kind", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub kind: Option<Option<Kind>>,
    #[serde(rename = "max_height", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub max_height: Option<Option<i32>>,
    #[serde(rename = "max_width", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub max_width: Option<Option<i32>>,
    #[serde(rename = "min_score", skip_serializing_if = "Option::is_none")]
    pub min_score: Option<f64>,
    #[serde(rename = "near", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub near: Option<Option<Vec<f64>>>,
    #[serde(rename = "sort", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub sort: Option<Option<Sort>>,
    #[serde(rename = "text", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub text: Option<Option<String>>,
}

impl SearchRequest {
    pub fn new() -> SearchRequest {
        SearchRequest {
            after: None,
            before: None,
            collapse_duplicates: None,
            customer_id: None,
            device: None,
            dupe_threshold: None,
            exclude_tags: None,
            image: None,
            image_blob_id: None,
            include_tags: None,
            indexed_res: None,
            k: None,
            kind: None,
            max_height: None,
            max_width: None,
            min_score: None,
            near: None,
            sort: None,
            text: None,
        }
    }
}
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Kind {
    #[serde(rename = "image")]
    Image,
    #[serde(rename = "video")]
    Video,
    #[serde(rename = "audio")]
    Audio,
    #[serde(rename = "pdf")]
    Pdf,
    #[serde(rename = "doc")]
    Doc,
    #[serde(rename = "note")]
    Note,
}

impl Default for Kind {
    fn default() -> Kind {
        Self::Image
    }
}
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Sort {
    #[serde(rename = "relevance")]
    Relevance,
    #[serde(rename = "distance")]
    Distance,
}

impl Default for Sort {
    fn default() -> Sort {
        Self::Relevance
    }
}

