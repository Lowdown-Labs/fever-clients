use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct IngestSource {
    #[serde(rename = "customer_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub customer_id: Option<Option<String>>,
    #[serde(rename = "s3_uri")]
    pub s3_uri: String,
    #[serde(rename = "target_res", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub target_res: Option<Option<i32>>,
}

impl IngestSource {
    pub fn new(s3_uri: String) -> IngestSource {
        IngestSource {
            customer_id: None,
            s3_uri,
            target_res: None,
        }
    }
}

