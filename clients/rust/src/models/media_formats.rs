use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct MediaFormats {
    #[serde(rename = "audio")]
    pub audio: Vec<String>,
    #[serde(rename = "document")]
    pub document: Vec<String>,
    #[serde(rename = "image")]
    pub image: Vec<String>,
    #[serde(rename = "video")]
    pub video: Vec<String>,
}

impl MediaFormats {
    pub fn new(audio: Vec<String>, document: Vec<String>, image: Vec<String>, video: Vec<String>) -> MediaFormats {
        MediaFormats {
            audio,
            document,
            image,
            video,
        }
    }
}

