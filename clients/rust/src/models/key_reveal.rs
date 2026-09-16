use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct KeyReveal {
    #[serde(rename = "api_key")]
    pub api_key: String,
    #[serde(rename = "customer_id", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub customer_id: Option<Option<String>>,
    #[serde(rename = "id")]
    pub id: i32,
    #[serde(rename = "name", default, with = "::serde_with::rust::double_option", skip_serializing_if = "Option::is_none")]
    pub name: Option<Option<String>>,
    #[serde(rename = "role", skip_serializing_if = "Option::is_none")]
    pub role: Option<String>,
}

impl KeyReveal {
    pub fn new(api_key: String, id: i32) -> KeyReveal {
        KeyReveal {
            api_key,
            customer_id: None,
            id,
            name: None,
            role: None,
        }
    }
}

