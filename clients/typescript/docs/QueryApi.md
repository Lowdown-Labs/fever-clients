# QueryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](QueryApi.md#queryoperation) | **POST** /v1/query | Run a read-only SQL SELECT over the corpus tables |



## query

> QueryResult query(queryRequest, authorization)

Run a read-only SQL SELECT over the corpus tables

A mini SQL console over the appliance\&#39;s corpus tables: as_blobs, annotations, dup_edges, video_frames, transcript_segments, embeddings, datasets, dataset_items (internal jobs/job_items stay queryable for compatibility but are bookkeeping, not data). Exactly one SELECT statement. Natural-language semantic search: an &#x60;&lt;&#x3D;&gt;&#x60; comparison between a vec_prefix/vec_full column and fever_search(\&#39;some text\&#39;) is allowed in the statement ORDER BY (rank by meaning) or in the SELECT target list (project the raw cosine distance; similarity &#x3D; 1.0 - distance), at most four distinct fever_search() texts per statement. Raw vector columns (embeddings.vec_*, video_frames.vec_*) are selectable with an admin key; scoped keys get a rejection instead. tsvector (annotations.fts, transcript_segments.fts) columns are excluded for everyone. Scoped api keys are automatically restricted to their own customer_id, which is why they may only submit a narrow statement shape: plain tables and JOINs of them, with a FROM clause, and no subqueries, CTEs or set operations at any depth (those are rejected rather than risk a partial rewrite - use an admin key for them). Admin keys parse unrestricted and see every customer\&#39;s rows in their own tenant.

### Example

```ts
import {
  Configuration,
  QueryApi,
} from 'fever-client';
import type { QueryOperationRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const api = new QueryApi();

  const body = {
    // QueryRequest
    queryRequest: ...,
    // string (optional)
    authorization: authorization_example,
  } satisfies QueryOperationRequest;

  try {
    const data = await api.query(body);
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
| **queryRequest** | [QueryRequest](QueryRequest.md) |  | |
| **authorization** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**QueryResult**](QueryResult.md)

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

