use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct MediaInfo {
    #[serde(rename = "blob_id")]
    pub blob_id: i32,
    #[serde(rename = "caption", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub caption: Option<Option<String>>,
    #[serde(rename = "captured_at", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub captured_at: Option<Option<chrono::DateTime<chrono::FixedOffset>>>,
    #[serde(rename = "customer_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub customer_id: Option<Option<String>>,
    #[serde(rename = "device", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub device: Option<Option<String>>,
    #[serde(rename = "external_ref", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub external_ref: Option<Option<String>>,
    #[serde(rename = "frame_count", skip_serializing_if = "Option::is_none")]
    pub frame_count: Option<i32>,
    #[serde(rename = "gps_lat", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub gps_lat: Option<Option<f64>>,
    #[serde(rename = "gps_lon", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub gps_lon: Option<Option<f64>>,
    #[serde(rename = "kind", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub kind: Option<Option<Kind>>,
    #[serde(rename = "metadata", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub metadata: Option<Option<std::collections::HashMap<String, serde_json::Value>>>,
    #[serde(rename = "ocr_text", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub ocr_text: Option<Option<String>>,
    #[serde(rename = "synthetic", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub synthetic: Option<Option<f64>>,
    #[serde(rename = "tags", skip_serializing_if = "Option::is_none")]
    pub tags: Option<Vec<String>>,
    #[serde(rename = "transcript_segments", skip_serializing_if = "Option::is_none")]
    pub transcript_segments: Option<i32>,
}

impl MediaInfo {
    pub fn new(blob_id: i32) -> MediaInfo {
        MediaInfo {
            blob_id,
            caption: None,
            captured_at: None,
            customer_id: None,
            device: None,
            external_ref: None,
            frame_count: None,
            gps_lat: None,
            gps_lon: None,
            kind: None,
            metadata: None,
            ocr_text: None,
            synthetic: None,
            tags: None,
            transcript_segments: None,
        }
    }
}
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Kind {
    #[serde(rename = "image")]
    Image,
    #[serde(rename = "video")]
    Video,
    #[serde(rename = "audio")]
    Audio,
    #[serde(rename = "pdf")]
    Pdf,
    #[serde(rename = "doc")]
    Doc,
    #[serde(rename = "note")]
    Note,
}

impl Default for Kind {
    fn default() -> Kind {
        Self::Image
    }
}

