use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CorpusTag {
    #[serde(rename = "count")]
    pub count: i32,
    #[serde(rename = "tag")]
    pub tag: String,
}

impl CorpusTag {
    pub fn new(count: i32, tag: String) -> CorpusTag {
        CorpusTag {
            count,
            tag,
        }
    }
}

