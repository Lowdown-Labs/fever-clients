use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct IngestMedia {
    #[serde(rename = "caption", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub caption: Option<Option<String>>,
    #[serde(rename = "customer_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub customer_id: Option<Option<String>>,
    #[serde(rename = "data", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub data: Option<Option<String>>,
    #[serde(rename = "metadata", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub metadata: Option<Option<std::collections::HashMap<String, serde_json::Value>>>,
    #[serde(rename = "strip_exif", skip_serializing_if = "Option::is_none")]
    pub strip_exif: Option<bool>,
    #[serde(rename = "tags", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub tags: Option<Option<Vec<String>>>,
    #[serde(rename = "url", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub url: Option<Option<String>>,
}

impl IngestMedia {
    pub fn new() -> IngestMedia {
        IngestMedia {
            caption: None,
            customer_id: None,
            data: None,
            metadata: None,
            strip_exif: None,
            tags: None,
            url: None,
        }
    }
}

