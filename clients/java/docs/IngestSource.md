

# IngestSource


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | Tag every vacuumed item with this customer_id. |  [optional] |
|**s3Uri** | **String** | s3://bucket/prefix in your VPC to vacuum every media item under. |  |
|**targetRes** | **Integer** | Resolution to index at, in pixels (rounded to a multiple of 16). Images are resized to this before embedding; higher means more detail but slower. Leave unset for the fast production default (64). |  [optional] |



