use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct DuplicatesRequest {
    #[serde(rename = "customer_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub customer_id: Option<Option<String>>,
    #[serde(rename = "customer_ids", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub customer_ids: Option<Option<Vec<String>>>,
    #[serde(rename = "limit", skip_serializing_if = "Option::is_none")]
    pub limit: Option<i32>,
    #[serde(rename = "threshold", skip_serializing_if = "Option::is_none")]
    pub threshold: Option<f64>,
}

impl DuplicatesRequest {
    pub fn new() -> DuplicatesRequest {
        DuplicatesRequest {
            customer_id: None,
            customer_ids: None,
            limit: None,
            threshold: None,
        }
    }
}

