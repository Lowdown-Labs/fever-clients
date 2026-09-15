

# CreateKeyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerId** | **String** | For a scoped key, the single customer_id every request with this key is forced to. Must be empty for an admin key. |  [optional] |
|**name** | **String** | Optional label for this API key (e.g. which app or integration uses it). |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | &#39;admin&#39; keys search/ingest across all customers and may pass any customer_id; &#39;scoped&#39; keys are locked server-side to one customer_id. If omitted it is inferred from customer_id (present means scoped, absent means admin). |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| SCOPED | &quot;scoped&quot; |



