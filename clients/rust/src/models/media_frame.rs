use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct MediaFrame {
    #[serde(rename = "frame_no")]
    pub frame_no: i32,
    #[serde(rename = "ts_ms")]
    pub ts_ms: i32,
}

impl MediaFrame {
    pub fn new(frame_no: i32, ts_ms: i32) -> MediaFrame {
        MediaFrame {
            frame_no,
            ts_ms,
        }
    }
}

