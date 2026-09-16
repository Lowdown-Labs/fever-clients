use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CorpusStats {
    #[serde(rename = "kinds")]
    pub kinds: std::collections::HashMap<String, i32>,
    #[serde(rename = "top_tags")]
    pub top_tags: Vec<models::CorpusTag>,
}

impl CorpusStats {
    pub fn new(kinds: std::collections::HashMap<String, i32>, top_tags: Vec<models::CorpusTag>) -> CorpusStats {
        CorpusStats {
            kinds,
            top_tags,
        }
    }
}

