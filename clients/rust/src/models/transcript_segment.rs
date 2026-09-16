use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct TranscriptSegment {
    #[serde(rename = "end_ms", deserialize_with = "Option::deserialize")]
    pub end_ms: Option<i32>,
    #[serde(rename = "seq")]
    pub seq: i32,
    #[serde(rename = "start_ms", deserialize_with = "Option::deserialize")]
    pub start_ms: Option<i32>,
    #[serde(rename = "text", deserialize_with = "Option::deserialize")]
    pub text: Option<String>,
}

impl TranscriptSegment {
    pub fn new(end_ms: Option<i32>, seq: i32, start_ms: Option<i32>, text: Option<String>) -> TranscriptSegment {
        TranscriptSegment {
            end_ms,
            seq,
            start_ms,
            text,
        }
    }
}

