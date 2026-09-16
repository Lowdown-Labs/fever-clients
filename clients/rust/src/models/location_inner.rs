use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct LocationInner {
}

impl LocationInner {
    pub fn new() -> LocationInner {
        LocationInner {
        }
    }
}

