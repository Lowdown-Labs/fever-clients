use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct DuplicateCluster {
    #[serde(rename = "member_customers", skip_serializing_if = "Option::is_none")]
    pub member_customers: Option<Vec<String>>,
    #[serde(rename = "members")]
    pub members: Vec<i32>,
    #[serde(rename = "size")]
    pub size: i32,
    #[serde(rename = "tightness")]
    pub tightness: f64,
}

impl DuplicateCluster {
    pub fn new(members: Vec<i32>, size: i32, tightness: f64) -> DuplicateCluster {
        DuplicateCluster {
            member_customers: None,
            members,
            size,
            tightness,
        }
    }
}

