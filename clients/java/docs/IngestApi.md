# IngestApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ingestMedia**](IngestApi.md#ingestMedia) | **POST** /v1/media | Ingest one or many media items |
| [**ingestMediaWithHttpInfo**](IngestApi.md#ingestMediaWithHttpInfo) | **POST** /v1/media | Ingest one or many media items |



## ingestMedia

> IngestResult ingestMedia(ingestRequest, authorization)

Ingest one or many media items

Throw 1..N media items over the wall. Small inline batches are embedded and indexed synchronously and return blob ids; large batches or an s3:// source return a Job you poll at /v1/jobs/{id}. Tenant is taken from the API key.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.IngestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        IngestApi apiInstance = new IngestApi(defaultClient);
        IngestRequest ingestRequest = new IngestRequest(); // IngestRequest | 
        String authorization = "authorization_example"; // String | 
        try {
            IngestResult result = apiInstance.ingestMedia(ingestRequest, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IngestApi#ingestMedia");
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
| **ingestRequest** | [**IngestRequest**](IngestRequest.md)|  | |
| **authorization** | **String**|  | [optional] |

### Return type

[**IngestResult**](IngestResult.md)


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

## ingestMediaWithHttpInfo

> ApiResponse<IngestResult> ingestMediaWithHttpInfo(ingestRequest, authorization)

Ingest one or many media items

Throw 1..N media items over the wall. Small inline batches are embedded and indexed synchronously and return blob ids; large batches or an s3:// source return a Job you poll at /v1/jobs/{id}. Tenant is taken from the API key.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.IngestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        IngestApi apiInstance = new IngestApi(defaultClient);
        IngestRequest ingestRequest = new IngestRequest(); // IngestRequest | 
        String authorization = "authorization_example"; // String | 
        try {
            ApiResponse<IngestResult> response = apiInstance.ingestMediaWithHttpInfo(ingestRequest, authorization);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling IngestApi#ingestMedia");
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
| **ingestRequest** | [**IngestRequest**](IngestRequest.md)|  | |
| **authorization** | **String**|  | [optional] |

### Return type

ApiResponse<[**IngestResult**](IngestResult.md)>


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

