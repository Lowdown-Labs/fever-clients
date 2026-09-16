use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct QueryResult {
    #[serde(rename = "columns")]
    pub columns: Vec<String>,
    #[serde(rename = "rows")]
    pub rows: Vec<Vec<serde_json::Value>>,
    #[serde(rename = "truncated")]
    pub truncated: bool,
}

impl QueryResult {
    pub fn new(columns: Vec<String>, rows: Vec<Vec<serde_json::Value>>, truncated: bool) -> QueryResult {
        QueryResult {
            columns,
            rows,
            truncated,
        }
    }
}

