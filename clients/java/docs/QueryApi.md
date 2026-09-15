# QueryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](QueryApi.md#query) | **POST** /v1/query | Run a read-only SQL SELECT over the corpus tables |
| [**queryWithHttpInfo**](QueryApi.md#queryWithHttpInfo) | **POST** /v1/query | Run a read-only SQL SELECT over the corpus tables |



## query

> QueryResult query(queryRequest)

Run a read-only SQL SELECT over the corpus tables

A mini SQL console over the appliance&#39;s corpus tables: as_blobs, annotations, dup_edges, video_frames, transcript_segments, embeddings, datasets, dataset_items (internal jobs/job_items stay queryable for compatibility but are bookkeeping, not data). Exactly one SELECT statement. Natural-language semantic search: an &#x60;&lt;&#x3D;&gt;&#x60; comparison between a vec_prefix/vec_full column and fever_search(&#39;some text&#39;) is allowed in the statement ORDER BY (rank by meaning) or in the SELECT target list (project the raw cosine distance; similarity &#x3D; 1.0 - distance), at most four distinct fever_search() texts per statement. Raw vector columns (embeddings.vec_*, video_frames.vec_*) are selectable with an admin key; scoped keys get a rejection instead. tsvector (annotations.fts, transcript_segments.fts) columns are excluded for everyone. Scoped api keys are automatically restricted to their own customer_id, which is why they may only submit a narrow statement shape: plain tables and JOINs of them, with a FROM clause, and no subqueries, CTEs or set operations at any depth (those are rejected rather than risk a partial rewrite - use an admin key for them). Admin keys parse unrestricted and see every customer&#39;s rows in their own tenant.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.QueryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QueryApi apiInstance = new QueryApi(defaultClient);
        QueryRequest queryRequest = new QueryRequest(); // QueryRequest | 
        try {
            QueryResult result = apiInstance.query(queryRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling QueryApi#query");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queryRequest** | [**QueryRequest**](QueryRequest.md)|  | |

### Return type

[**QueryResult**](QueryResult.md)


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## queryWithHttpInfo

> ApiResponse<QueryResult> queryWithHttpInfo(queryRequest)

Run a read-only SQL SELECT over the corpus tables

A mini SQL console over the appliance&#39;s corpus tables: as_blobs, annotations, dup_edges, video_frames, transcript_segments, embeddings, datasets, dataset_items (internal jobs/job_items stay queryable for compatibility but are bookkeeping, not data). Exactly one SELECT statement. Natural-language semantic search: an &#x60;&lt;&#x3D;&gt;&#x60; comparison between a vec_prefix/vec_full column and fever_search(&#39;some text&#39;) is allowed in the statement ORDER BY (rank by meaning) or in the SELECT target list (project the raw cosine distance; similarity &#x3D; 1.0 - distance), at most four distinct fever_search() texts per statement. Raw vector columns (embeddings.vec_*, video_frames.vec_*) are selectable with an admin key; scoped keys get a rejection instead. tsvector (annotations.fts, transcript_segments.fts) columns are excluded for everyone. Scoped api keys are automatically restricted to their own customer_id, which is why they may only submit a narrow statement shape: plain tables and JOINs of them, with a FROM clause, and no subqueries, CTEs or set operations at any depth (those are rejected rather than risk a partial rewrite - use an admin key for them). Admin keys parse unrestricted and see every customer&#39;s rows in their own tenant.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.QueryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        QueryApi apiInstance = new QueryApi(defaultClient);
        QueryRequest queryRequest = new QueryRequest(); // QueryRequest | 
        try {
            ApiResponse<QueryResult> response = apiInstance.queryWithHttpInfo(queryRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling QueryApi#query");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **queryRequest** | [**QueryRequest**](QueryRequest.md)|  | |

### Return type

ApiResponse<[**QueryResult**](QueryResult.md)>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

