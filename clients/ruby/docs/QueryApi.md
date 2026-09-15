# FeverClient::QueryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**query**](QueryApi.md#query) | **POST** /v1/query | Run a read-only SQL SELECT over the corpus tables |


## query

> <QueryResult> query(query_request, opts)

Run a read-only SQL SELECT over the corpus tables

A mini SQL console over the appliance's corpus tables: as_blobs, annotations, dup_edges, video_frames, transcript_segments, embeddings, datasets, dataset_items (internal jobs/job_items stay queryable for compatibility but are bookkeeping, not data). Exactly one SELECT statement. Natural-language semantic search: an `<=>` comparison between a vec_prefix/vec_full column and fever_search('some text') is allowed in the statement ORDER BY (rank by meaning) or in the SELECT target list (project the raw cosine distance; similarity = 1.0 - distance), at most four distinct fever_search() texts per statement. Raw vector columns (embeddings.vec_*, video_frames.vec_*) are selectable with an admin key; scoped keys get a rejection instead. tsvector (annotations.fts, transcript_segments.fts) columns are excluded for everyone. Scoped api keys are automatically restricted to their own customer_id, which is why they may only submit a narrow statement shape: plain tables and JOINs of them, with a FROM clause, and no subqueries, CTEs or set operations at any depth (those are rejected rather than risk a partial rewrite - use an admin key for them). Admin keys parse unrestricted and see every customer's rows in their own tenant.

### Examples

```ruby
require 'time'
require 'fever_client'

api_instance = FeverClient::QueryApi.new
query_request = FeverClient::QueryRequest.new({sql: 'sql_example'}) # QueryRequest | 
opts = {
  authorization: 'authorization_example' # String | 
}

begin
  # Run a read-only SQL SELECT over the corpus tables
  result = api_instance.query(query_request, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling QueryApi->query: #{e}"
end
```

#### Using the query_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<QueryResult>, Integer, Hash)> query_with_http_info(query_request, opts)

```ruby
begin
  # Run a read-only SQL SELECT over the corpus tables
  data, status_code, headers = api_instance.query_with_http_info(query_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <QueryResult>
rescue FeverClient::ApiError => e
  puts "Error when calling QueryApi->query_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **query_request** | [**QueryRequest**](QueryRequest.md) |  |  |
| **authorization** | **String** |  | [optional] |

### Return type

[**QueryResult**](QueryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

