use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct IngestedMedia {
    #[serde(rename = "blob_id")]
    pub blob_id: i32,
    #[serde(rename = "external_ref", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub external_ref: Option<Option<String>>,
}

impl IngestedMedia {
    pub fn new(blob_id: i32) -> IngestedMedia {
        IngestedMedia {
            blob_id,
            external_ref: None,
        }
    }
}

