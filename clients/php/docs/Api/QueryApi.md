# LowdownLabs\Fever\QueryApi

Read-only SQL over the whitelisted corpus tables.

All URIs are relative to http://localhost, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**query()**](QueryApi.md#query) | **POST** /v1/query | Run a read-only SQL SELECT over the corpus tables |


## `query()`

```php
query($query_request, $authorization): \LowdownLabs\Fever\Model\QueryResult
```

Run a read-only SQL SELECT over the corpus tables

A mini SQL console over the appliance's corpus tables: as_blobs, annotations, dup_edges, video_frames, transcript_segments, embeddings, datasets, dataset_items (internal jobs/job_items stay queryable for compatibility but are bookkeeping, not data). Exactly one SELECT statement. Natural-language semantic search: an `<=>` comparison between a vec_prefix/vec_full column and fever_search('some text') is allowed in the statement ORDER BY (rank by meaning) or in the SELECT target list (project the raw cosine distance; similarity = 1.0 - distance), at most four distinct fever_search() texts per statement. Raw vector columns (embeddings.vec_*, video_frames.vec_*) are selectable with an admin key; scoped keys get a rejection instead. tsvector (annotations.fts, transcript_segments.fts) columns are excluded for everyone. Scoped api keys are automatically restricted to their own customer_id, which is why they may only submit a narrow statement shape: plain tables and JOINs of them, with a FROM clause, and no subqueries, CTEs or set operations at any depth (those are rejected rather than risk a partial rewrite - use an admin key for them). Admin keys parse unrestricted and see every customer's rows in their own tenant.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new LowdownLabs\Fever\Api\QueryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$query_request = new \LowdownLabs\Fever\Model\QueryRequest(); // \LowdownLabs\Fever\Model\QueryRequest
$authorization = 'authorization_example'; // string

try {
    $result = $apiInstance->query($query_request, $authorization);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling QueryApi->query: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **query_request** | [**\LowdownLabs\Fever\Model\QueryRequest**](../Model/QueryRequest.md)|  | |
| **authorization** | **string**|  | [optional] |

### Return type

[**\LowdownLabs\Fever\Model\QueryResult**](../Model/QueryResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
