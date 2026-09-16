use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ExportResult {
    #[serde(rename = "exported")]
    pub exported: i32,
    #[serde(rename = "s3_uri")]
    pub s3_uri: String,
}

impl ExportResult {
    pub fn new(exported: i32, s3_uri: String) -> ExportResult {
        ExportResult {
            exported,
            s3_uri,
        }
    }
}

