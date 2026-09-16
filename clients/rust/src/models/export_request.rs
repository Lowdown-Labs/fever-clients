use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ExportRequest {
    #[serde(rename = "customer_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub customer_id: Option<Option<String>>,
    #[serde(rename = "format", skip_serializing_if = "Option::is_none")]
    pub format: Option<Format>,
    #[serde(rename = "kind", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub kind: Option<Option<Kind>>,
    #[serde(rename = "s3_uri")]
    pub s3_uri: String,
    #[serde(rename = "tag", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub tag: Option<Option<String>>,
}

impl ExportRequest {
    pub fn new(s3_uri: String) -> ExportRequest {
        ExportRequest {
            customer_id: None,
            format: None,
            kind: None,
            s3_uri,
            tag: None,
        }
    }
}
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum Format {
    #[serde(rename = "ndjson")]
    Ndjson,
    #[serde(rename = "parquet")]
    Parquet,
}

impl Default for Format {
    fn default() -> Format {
        Self::Ndjson
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

