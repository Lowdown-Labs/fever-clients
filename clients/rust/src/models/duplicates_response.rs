use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct DuplicatesResponse {
    #[serde(rename = "clusters")]
    pub clusters: i32,
    #[serde(rename = "duplicate_clusters", skip_serializing_if = "Option::is_none")]
    pub duplicate_clusters: Option<Vec<models::DuplicateCluster>>,
    #[serde(rename = "total_duplicates")]
    pub total_duplicates: i32,
}

impl DuplicatesResponse {
    pub fn new(clusters: i32, total_duplicates: i32) -> DuplicatesResponse {
        DuplicatesResponse {
            clusters,
            duplicate_clusters: None,
            total_duplicates,
        }
    }
}

