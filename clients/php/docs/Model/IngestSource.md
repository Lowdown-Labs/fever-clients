# IngestSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collection_id** | **string** | Tag every vacuumed item with this collection_id. | [optional]
**customer_id** | **string** | Tag every vacuumed item with this customer_id. | [optional]
**hf_config** | **string** | Hugging Face dataset config/subset name, when the dataset has several. | [optional]
**hf_dataset** | **string** | Hugging Face dataset repo id (org/name) whose images are staged and ingested. Only available on deployments with FEVER_HF_INGEST_ENABLED. | [optional]
**hf_split** | **string** | Hugging Face split to ingest (e.g. &#39;train&#39;); unset ingests every split. | [optional]
**s3_uri** | **string** | s3://bucket/prefix in your VPC to vacuum every media item under. | [optional]
**target_res** | **int** | Resolution to index at, in pixels (rounded to a multiple of 16). Images are resized to this before embedding; higher means more detail but slower. Leave unset for the fast production default (64). | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
