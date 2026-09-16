use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct MediaSpan {
    #[serde(rename = "end_ms")]
    pub end_ms: i32,
    #[serde(rename = "start_ms")]
    pub start_ms: i32,
    #[serde(rename = "text", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub text: Option<Option<String>>,
}

impl MediaSpan {
    pub fn new(end_ms: i32, start_ms: i32) -> MediaSpan {
        MediaSpan {
            end_ms,
            start_ms,
            text: None,
        }
    }
}

