# DuplicatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findDuplicates**](DuplicatesApi.md#findDuplicates) | **POST** /v1/duplicates | Find near-duplicate media clusters for a customer |
| [**findDuplicatesWithHttpInfo**](DuplicatesApi.md#findDuplicatesWithHttpInfo) | **POST** /v1/duplicates | Find near-duplicate media clusters for a customer |
| [**suggestedDedupThreshold**](DuplicatesApi.md#suggestedDedupThreshold) | **GET** /v1/duplicates/suggested-threshold | Suggest a duplicate-detection threshold from this customer&#39;s edge cosine distribution |
| [**suggestedDedupThresholdWithHttpInfo**](DuplicatesApi.md#suggestedDedupThresholdWithHttpInfo) | **GET** /v1/duplicates/suggested-threshold | Suggest a duplicate-detection threshold from this customer&#39;s edge cosine distribution |



## findDuplicates

> DuplicatesResponse findDuplicates(duplicatesRequest)

Find near-duplicate media clusters for a customer

Find near-duplicate clusters. Scoped to one customer, this reads the edge set maintained at ingest (millisecond answers; edges exist down to cosine 0.80). An admin key with no customer_id scans live across all customers; passing customer_ids narrows that live scan to a handful of accounts. Both admin shapes see cross-customer duplicates. No delete or keep recommendation is made: the clusters are yours to act on.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.DuplicatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DuplicatesApi apiInstance = new DuplicatesApi(defaultClient);
        DuplicatesRequest duplicatesRequest = new DuplicatesRequest(); // DuplicatesRequest | 
        try {
            DuplicatesResponse result = apiInstance.findDuplicates(duplicatesRequest);
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

### Return type

[**DuplicatesResponse**](DuplicatesResponse.md)


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

## findDuplicatesWithHttpInfo

> ApiResponse<DuplicatesResponse> findDuplicatesWithHttpInfo(duplicatesRequest)

Find near-duplicate media clusters for a customer

Find near-duplicate clusters. Scoped to one customer, this reads the edge set maintained at ingest (millisecond answers; edges exist down to cosine 0.80). An admin key with no customer_id scans live across all customers; passing customer_ids narrows that live scan to a handful of accounts. Both admin shapes see cross-customer duplicates. No delete or keep recommendation is made: the clusters are yours to act on.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.DuplicatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DuplicatesApi apiInstance = new DuplicatesApi(defaultClient);
        DuplicatesRequest duplicatesRequest = new DuplicatesRequest(); // DuplicatesRequest | 
        try {
            ApiResponse<DuplicatesResponse> response = apiInstance.findDuplicatesWithHttpInfo(duplicatesRequest);
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

### Return type

ApiResponse<[**DuplicatesResponse**](DuplicatesResponse.md)>


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


## suggestedDedupThreshold

> Object suggestedDedupThreshold(customerId)

Suggest a duplicate-detection threshold from this customer&#39;s edge cosine distribution

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.DuplicatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DuplicatesApi apiInstance = new DuplicatesApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        try {
            Object result = apiInstance.suggestedDedupThreshold(customerId);
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

### Return type

**Object**


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## suggestedDedupThresholdWithHttpInfo

> ApiResponse<Object> suggestedDedupThresholdWithHttpInfo(customerId)

Suggest a duplicate-detection threshold from this customer&#39;s edge cosine distribution

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.DuplicatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DuplicatesApi apiInstance = new DuplicatesApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        try {
            ApiResponse<Object> response = apiInstance.suggestedDedupThresholdWithHttpInfo(customerId);
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

### Return type

ApiResponse<**Object**>


### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

