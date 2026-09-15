# DuplicatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findDuplicates**](DuplicatesApi.md#findDuplicates) | **POST** /v1/duplicates | Find near-duplicate media clusters for a customer |
| [**findDuplicatesWithHttpInfo**](DuplicatesApi.md#findDuplicatesWithHttpInfo) | **POST** /v1/duplicates | Find near-duplicate media clusters for a customer |
| [**suggestedDedupThreshold**](DuplicatesApi.md#suggestedDedupThreshold) | **GET** /v1/duplicates/suggested-threshold | Suggest a duplicate-detection threshold from this customer&#39;s edge cosine distribution |
| [**suggestedDedupThresholdWithHttpInfo**](DuplicatesApi.md#suggestedDedupThresholdWithHttpInfo) | **GET** /v1/duplicates/suggested-threshold | Suggest a duplicate-detection threshold from this customer&#39;s edge cosine distribution |



## findDuplicates

> DuplicatesResponse findDuplicates(duplicatesRequest, authorization)

Find near-duplicate media clusters for a customer

Find near-duplicate clusters. Scoped to one customer, this reads the edge set maintained at ingest (millisecond answers; edges exist down to cosine 0.80). An admin key with no customer_id scans live across all customers; passing customer_ids narrows that live scan to a handful of accounts. Both admin shapes see cross-customer duplicates. No delete or keep recommendation is made: the clusters are yours to act on.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.DuplicatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DuplicatesApi apiInstance = new DuplicatesApi(defaultClient);
        DuplicatesRequest duplicatesRequest = new DuplicatesRequest(); // DuplicatesRequest | 
        String authorization = "authorization_example"; // String | 
        try {
            DuplicatesResponse result = apiInstance.findDuplicates(duplicatesRequest, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DuplicatesApi#findDuplicates");
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
| **duplicatesRequest** | [**DuplicatesRequest**](DuplicatesRequest.md)|  | |
| **authorization** | **String**|  | [optional] |

### Return type

[**DuplicatesResponse**](DuplicatesResponse.md)


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

## findDuplicatesWithHttpInfo

> ApiResponse<DuplicatesResponse> findDuplicatesWithHttpInfo(duplicatesRequest, authorization)

Find near-duplicate media clusters for a customer

Find near-duplicate clusters. Scoped to one customer, this reads the edge set maintained at ingest (millisecond answers; edges exist down to cosine 0.80). An admin key with no customer_id scans live across all customers; passing customer_ids narrows that live scan to a handful of accounts. Both admin shapes see cross-customer duplicates. No delete or keep recommendation is made: the clusters are yours to act on.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.DuplicatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DuplicatesApi apiInstance = new DuplicatesApi(defaultClient);
        DuplicatesRequest duplicatesRequest = new DuplicatesRequest(); // DuplicatesRequest | 
        String authorization = "authorization_example"; // String | 
        try {
            ApiResponse<DuplicatesResponse> response = apiInstance.findDuplicatesWithHttpInfo(duplicatesRequest, authorization);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DuplicatesApi#findDuplicates");
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
| **duplicatesRequest** | [**DuplicatesRequest**](DuplicatesRequest.md)|  | |
| **authorization** | **String**|  | [optional] |

### Return type

ApiResponse<[**DuplicatesResponse**](DuplicatesResponse.md)>


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


## suggestedDedupThreshold

> Object suggestedDedupThreshold(customerId, authorization)

Suggest a duplicate-detection threshold from this customer&#39;s edge cosine distribution

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.DuplicatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DuplicatesApi apiInstance = new DuplicatesApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        String authorization = "authorization_example"; // String | 
        try {
            Object result = apiInstance.suggestedDedupThreshold(customerId, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DuplicatesApi#suggestedDedupThreshold");
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

**Object**


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

## suggestedDedupThresholdWithHttpInfo

> ApiResponse<Object> suggestedDedupThresholdWithHttpInfo(customerId, authorization)

Suggest a duplicate-detection threshold from this customer&#39;s edge cosine distribution

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.DuplicatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DuplicatesApi apiInstance = new DuplicatesApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        String authorization = "authorization_example"; // String | 
        try {
            ApiResponse<Object> response = apiInstance.suggestedDedupThresholdWithHttpInfo(customerId, authorization);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DuplicatesApi#suggestedDedupThreshold");
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

ApiResponse<**Object**>


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

