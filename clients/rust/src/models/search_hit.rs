use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct SearchHit {
    #[serde(rename = "blob_id")]
    pub blob_id: i32,
    #[serde(rename = "caption", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub caption: Option<Option<String>>,
    #[serde(rename = "customer_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub customer_id: Option<Option<String>>,
    #[serde(rename = "duplicate_count", skip_serializing_if = "Option::is_none")]
    pub duplicate_count: Option<i32>,
    #[serde(rename = "duplicates", skip_serializing_if = "Option::is_none")]
    pub duplicates: Option<Vec<i32>>,
    #[serde(rename = "geo_label", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub geo_label: Option<Option<String>>,
    #[serde(rename = "headline", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub headline: Option<Option<String>>,
    #[serde(rename = "height", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub height: Option<Option<i32>>,
    #[serde(rename = "kind", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub kind: Option<Option<Kind>>,
    #[serde(rename = "media_ref", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub media_ref: Option<Option<String>>,
    #[serde(rename = "metadata", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub metadata: Option<Option<std::collections::HashMap<String, serde_json::Value>>>,
    #[serde(rename = "score")]
    pub score: f64,
    #[serde(rename = "score_type")]
    pub score_type: ScoreType,
    #[serde(rename = "seek_ms", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub seek_ms: Option<Option<i32>>,
    #[serde(rename = "span", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub span: Option<Option<Box<models::MediaSpan>>>,
    #[serde(rename = "span_headline", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub span_headline: Option<Option<String>>,
    #[serde(rename = "tags", skip_serializing_if = "Option::is_none")]
    pub tags: Option<Vec<String>>,
    #[serde(rename = "width", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub width: Option<Option<i32>>,
}

impl SearchHit {
    pub fn new(blob_id: i32, score: f64, score_type: ScoreType) -> SearchHit {
        SearchHit {
            blob_id,
            caption: None,
            customer_id: None,
            duplicate_count: None,
            duplicates: None,
            geo_label: None,
            headline: None,
            height: None,
            kind: None,
            media_ref: None,
            metadata: None,
            score,
            score_type,
            seek_ms: None,
            span: None,
            span_headline: None,
            tags: None,
            width: None,
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
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum ScoreType {
    #[serde(rename = "cosine")]
    Cosine,
    #[serde(rename = "cosine+lex")]
    CosinePlusLex,
    #[serde(rename = "rrf")]
    Rrf,
    #[serde(rename = "rerank")]
    Rerank,
}

impl Default for ScoreType {
    fn default() -> ScoreType {
        Self::Cosine
    }
}

