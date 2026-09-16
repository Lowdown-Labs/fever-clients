use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct IngestRequest {
    #[serde(rename = "media", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub media: Option<Option<Vec<models::IngestMedia>>>,
    #[serde(rename = "overwrite", skip_serializing_if = "Option::is_none")]
    pub overwrite: Option<bool>,
    #[serde(rename = "source", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub source: Option<Option<Box<models::IngestSource>>>,
    #[serde(rename = "target_res", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub target_res: Option<Option<i32>>,
}

impl IngestRequest {
    pub fn new() -> IngestRequest {
        IngestRequest {
            media: None,
            overwrite: None,
            source: None,
            target_res: None,
        }
    }
}

