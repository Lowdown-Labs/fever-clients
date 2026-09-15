# SearchApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**search**](SearchApi.md#searchoperation) | **POST** /v1/search | Search by text or image |



## search

> Array&lt;SearchHit&gt; search(searchRequest, authorization)

Search by text or image

text runs a meaning-based vector search fused with lexical full-text (RRF), reranked and calibrated so min_score is a real match probability. image runs cosine similarity. customer_id and EXIF fields narrow the results.

### Example

```ts
import {
  Configuration,
  SearchApi,
} from 'fever-client';
import type { SearchOperationRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const api = new SearchApi();

  const body = {
    // SearchRequest
    searchRequest: ...,
    // string (optional)
    authorization: authorization_example,
  } satisfies SearchOperationRequest;

  try {
    const data = await api.search(body);
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
| **searchRequest** | [SearchRequest](SearchRequest.md) |  | |
| **authorization** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**Array&lt;SearchHit&gt;**](SearchHit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

