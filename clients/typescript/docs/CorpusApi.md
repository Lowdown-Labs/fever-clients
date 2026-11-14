# CorpusApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**corpusStats**](CorpusApi.md#corpusstats) | **GET** /v1/corpus | Corpus composition: per-kind counts and top autotags |



## corpusStats

> CorpusStats corpusStats(customerId)

Corpus composition: per-kind counts and top autotags

kinds/top_tags/storage_bytes follow the same customer scoping. index_bytes is the appliance-wide footprint of as_blobs/embeddings/ annotations including their indexes: those tables are hash-partitioned by customer_id, not per tenant, so a per-tenant share is not attributable and every caller sees the same global value.

### Example

```ts
import {
  Configuration,
  CorpusApi,
} from 'fever-client';
import type { CorpusStatsRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: bearerAuth
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new CorpusApi(config);

  const body = {
    // string (optional)
    customerId: customerId_example,
  } satisfies CorpusStatsRequest;

  try {
    const data = await api.corpusStats(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **customerId** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**CorpusStats**](CorpusStats.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

