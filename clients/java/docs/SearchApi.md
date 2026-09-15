# SearchApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**search**](SearchApi.md#search) | **POST** /v1/search | Search by text or image |
| [**searchWithHttpInfo**](SearchApi.md#searchWithHttpInfo) | **POST** /v1/search | Search by text or image |



## search

> List<SearchHit> search(searchRequest, authorization)

Search by text or image

text runs a meaning-based vector search fused with lexical full-text (RRF), reranked and calibrated so min_score is a real match probability. image runs cosine similarity. customer_id and EXIF fields narrow the results.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SearchApi apiInstance = new SearchApi(defaultClient);
        SearchRequest searchRequest = new SearchRequest(); // SearchRequest | 
        String authorization = "authorization_example"; // String | 
        try {
            List<SearchHit> result = apiInstance.search(searchRequest, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#search");
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
| **searchRequest** | [**SearchRequest**](SearchRequest.md)|  | |
| **authorization** | **String**|  | [optional] |

### Return type

[**List&lt;SearchHit&gt;**](SearchHit.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## searchWithHttpInfo

> ApiResponse<List<SearchHit>> searchWithHttpInfo(searchRequest, authorization)

Search by text or image

text runs a meaning-based vector search fused with lexical full-text (RRF), reranked and calibrated so min_score is a real match probability. image runs cosine similarity. customer_id and EXIF fields narrow the results.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.SearchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SearchApi apiInstance = new SearchApi(defaultClient);
        SearchRequest searchRequest = new SearchRequest(); // SearchRequest | 
        String authorization = "authorization_example"; // String | 
        try {
            ApiResponse<List<SearchHit>> response = apiInstance.searchWithHttpInfo(searchRequest, authorization);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#search");
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
| **searchRequest** | [**SearchRequest**](SearchRequest.md)|  | |
| **authorization** | **String**|  | [optional] |

### Return type

ApiResponse<[**List&lt;SearchHit&gt;**](SearchHit.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

