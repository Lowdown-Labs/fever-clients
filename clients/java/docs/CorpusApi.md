# CorpusApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**corpusStats**](CorpusApi.md#corpusStats) | **GET** /v1/corpus | Corpus composition: per-kind counts and top autotags |
| [**corpusStatsWithHttpInfo**](CorpusApi.md#corpusStatsWithHttpInfo) | **GET** /v1/corpus | Corpus composition: per-kind counts and top autotags |



## corpusStats

> CorpusStats corpusStats(customerId, authorization)

Corpus composition: per-kind counts and top autotags

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.CorpusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CorpusApi apiInstance = new CorpusApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        String authorization = "authorization_example"; // String | 
        try {
            CorpusStats result = apiInstance.corpusStats(customerId, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CorpusApi#corpusStats");
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
| **customerId** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |

### Return type

[**CorpusStats**](CorpusStats.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## corpusStatsWithHttpInfo

> ApiResponse<CorpusStats> corpusStatsWithHttpInfo(customerId, authorization)

Corpus composition: per-kind counts and top autotags

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.CorpusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CorpusApi apiInstance = new CorpusApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        String authorization = "authorization_example"; // String | 
        try {
            ApiResponse<CorpusStats> response = apiInstance.corpusStatsWithHttpInfo(customerId, authorization);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CorpusApi#corpusStats");
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
| **customerId** | **String**|  | [optional] |
| **authorization** | **String**|  | [optional] |

### Return type

ApiResponse<[**CorpusStats**](CorpusStats.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

