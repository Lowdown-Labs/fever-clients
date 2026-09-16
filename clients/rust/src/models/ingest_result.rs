use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct IngestResult {
    #[serde(rename = "existing", skip_serializing_if = "Option::is_none")]
    pub existing: Option<Vec<models::IngestedMedia>>,
    #[serde(rename = "ingested", skip_serializing_if = "Option::is_none")]
    pub ingested: Option<Vec<models::IngestedMedia>>,
    #[serde(rename = "job", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub job: Option<Option<Box<models::Job>>>,
}

impl IngestResult {
    pub fn new() -> IngestResult {
        IngestResult {
            existing: None,
            ingested: None,
            job: None,
        }
    }
}

