

# IngestSource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collectionId** | **String** | Tag every vacuumed item with this collection_id. |  [optional] |
|**customerId** | **String** | Tag every vacuumed item with this customer_id. |  [optional] |
|**hfConfig** | **String** | Hugging Face dataset config/subset name, when the dataset has several. |  [optional] |
|**hfDataset** | **String** | Hugging Face dataset repo id (org/name) whose images are staged and ingested. Only available on deployments with FEVER_HF_INGEST_ENABLED. |  [optional] |
|**hfSplit** | **String** | Hugging Face split to ingest (e.g. &#39;train&#39;); unset ingests every split. |  [optional] |
|**s3Uri** | **String** | s3://bucket/prefix in your VPC to vacuum every media item under. |  [optional] |
|**targetRes** | **Integer** | Resolution to index at, in pixels (rounded to a multiple of 16). Images are resized to this before embedding; higher means more detail but slower. Leave unset for the fast production default (64). |  [optional] |



