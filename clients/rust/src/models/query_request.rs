use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct QueryRequest {
    #[serde(rename = "row_limit", skip_serializing_if = "Option::is_none")]
    pub row_limit: Option<i32>,
    #[serde(rename = "sql")]
    pub sql: String,
}

impl QueryRequest {
    pub fn new(sql: String) -> QueryRequest {
        QueryRequest {
            row_limit: None,
            sql,
        }
    }
}

