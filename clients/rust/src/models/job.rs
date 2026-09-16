use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct Job {
    #[serde(rename = "done", skip_serializing_if = "Option::is_none")]
    pub done: Option<i32>,
    #[serde(rename = "error", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub error: Option<Option<String>>,
    #[serde(rename = "id")]
    pub id: i32,
    #[serde(rename = "skipped", skip_serializing_if = "Option::is_none")]
    pub skipped: Option<i32>,
    #[serde(rename = "status")]
    pub status: String,
    #[serde(rename = "total", skip_serializing_if = "Option::is_none")]
    pub total: Option<i32>,
}

impl Job {
    pub fn new(id: i32, status: String) -> Job {
        Job {
            done: None,
            error: None,
            id,
            skipped: None,
            status,
            total: None,
        }
    }
}

