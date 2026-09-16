use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ImportRequest {
    #[serde(rename = "customer_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub customer_id: Option<Option<String>>,
    #[serde(rename = "s3_uri")]
    pub s3_uri: String,
}

impl ImportRequest {
    pub fn new(s3_uri: String) -> ImportRequest {
        ImportRequest {
            customer_id: None,
            s3_uri,
        }
    }
}

