use reqwest;
use serde::{Deserialize, Serialize, de::Error as _};
use crate::{apis::ResponseContent, models};
use super::{Error, configuration, ContentType};
use tokio::fs::File as TokioFile;
use tokio_util::codec::{BytesCodec, FramedRead};


#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ReassignCustomersBulkError {
    Status422(models::HttpValidationError),
    UnknownValue(serde_json::Value),
}


pub async fn reassign_customers_bulk(configuration: &configuration::Configuration, file: Option<std::path::PathBuf>) -> Result<serde_json::Value, Error<ReassignCustomersBulkError>> {
    let p_form_file = file;

    let uri_str = format!("{}/v1/customers/reassign-bulk", configuration.base_path);
    let mut req_builder = configuration.client.request(reqwest::Method::POST, &uri_str);

    if let Some(ref user_agent) = configuration.user_agent {
        req_builder = req_builder.header(reqwest::header::USER_AGENT, user_agent.clone());
    }
    if let Some(ref token) = configuration.bearer_access_token {
        req_builder = req_builder.bearer_auth(token.to_owned());
    };
    let mut multipart_form = reqwest::multipart::Form::new();
    if let Some(ref param_value) = p_form_file {
                let file = TokioFile::open(param_value).await?;
                let stream = FramedRead::new(file, BytesCodec::new());
                let file_name = param_value.file_name().map(|n| n.to_string_lossy().to_string()).unwrap_or_default();
                let file_part = reqwest::multipart::Part::stream(reqwest::Body::wrap_stream(stream)).file_name(file_name);
                multipart_form = multipart_form.part("file", file_part);
    }
    req_builder = req_builder.multipart(multipart_form);

    let req = req_builder.build()?;
    let resp = configuration.client.execute(req).await?;

    let status = resp.status();
    let content_type = resp
        .headers()
        .get("content-type")
        .and_then(|v| v.to_str().ok())
        .unwrap_or("application/octet-stream");
    let content_type = super::ContentType::from(content_type);

    if !status.is_client_error() && !status.is_server_error() {
        let content = resp.text().await?;
        match content_type {
            ContentType::Json => serde_json::from_str(&content).map_err(Error::from),
            ContentType::Text => return Err(Error::from(serde_json::Error::custom("Received `text/plain` content type response that cannot be converted to `serde_json::Value`"))),
            ContentType::Unsupported(unknown_type) => return Err(Error::from(serde_json::Error::custom(format!("Received `{unknown_type}` content type response that cannot be converted to `serde_json::Value`")))),
        }
    } else {
        let content = resp.text().await?;
        let entity: Option<ReassignCustomersBulkError> = serde_json::from_str(&content).ok();
        Err(Error::ResponseError(ResponseContent { status, content, entity }))
    }
}

