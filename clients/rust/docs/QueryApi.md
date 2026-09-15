# \QueryApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**query**](QueryApi.md#query) | **POST** /v1/query | Run a read-only SQL SELECT over the corpus tables



## query

> models::QueryResult query(query_request, authorization)
Run a read-only SQL SELECT over the corpus tables

A mini SQL console over the appliance's corpus tables: as_blobs, annotations, dup_edges, video_frames, transcript_segments, embeddings, datasets, dataset_items (internal jobs/job_items stay queryable for compatibility but are bookkeeping, not data). Exactly one SELECT statement. Natural-language semantic search: an `<=>` comparison between a vec_prefix/vec_full column and fever_search('some text') is allowed in the statement ORDER BY (rank by meaning) or in the SELECT target list (project the raw cosine distance; similarity = 1.0 - distance), at most four distinct fever_search() texts per statement. Raw vector columns (embeddings.vec_*, video_frames.vec_*) are selectable with an admin key; scoped keys get a rejection instead. tsvector (annotations.fts, transcript_segments.fts) columns are excluded for everyone. Scoped api keys are automatically restricted to their own customer_id, which is why they may only submit a narrow statement shape: plain tables and JOINs of them, with a FROM clause, and no subqueries, CTEs or set operations at any depth (those are rejected rather than risk a partial rewrite - use an admin key for them). Admin keys parse unrestricted and see every customer's rows in their own tenant.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**query_request** | [**QueryRequest**](QueryRequest.md) |  | [required] |
**authorization** | Option<**String**> |  |  |

### Return type

[**models::QueryResult**](QueryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

