# IngestSource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**collection_id** | Option<**String**> | Tag every vacuumed item with this collection_id. | [optional]
**customer_id** | Option<**String**> | Tag every vacuumed item with this customer_id. | [optional]
**hf_config** | Option<**String**> | Hugging Face dataset config/subset name, when the dataset has several. | [optional]
**hf_dataset** | Option<**String**> | Hugging Face dataset repo id (org/name) whose images are staged and ingested. Only available on deployments with FEVER_HF_INGEST_ENABLED. | [optional]
**hf_split** | Option<**String**> | Hugging Face split to ingest (e.g. 'train'); unset ingests every split. | [optional]
**s3_uri** | Option<**String**> | s3://bucket/prefix in your VPC to vacuum every media item under. | [optional]
**target_res** | Option<**i32**> | Resolution to index at, in pixels (rounded to a multiple of 16). Images are resized to this before embedding; higher means more detail but slower. Leave unset for the fast production default (64). | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


