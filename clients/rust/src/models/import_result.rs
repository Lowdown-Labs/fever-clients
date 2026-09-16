use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct ImportResult {
    #[serde(rename = "imported")]
    pub imported: i32,
    #[serde(rename = "s3_uri")]
    pub s3_uri: String,
}

impl ImportResult {
    pub fn new(imported: i32, s3_uri: String) -> ImportResult {
        ImportResult {
            imported,
            s3_uri,
        }
    }
}

