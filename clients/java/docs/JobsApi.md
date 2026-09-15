# JobsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelJob**](JobsApi.md#cancelJob) | **POST** /v1/jobs/{job_id}/cancel | Cancel a pending or running ingest job |
| [**cancelJobWithHttpInfo**](JobsApi.md#cancelJobWithHttpInfo) | **POST** /v1/jobs/{job_id}/cancel | Cancel a pending or running ingest job |
| [**getJob**](JobsApi.md#getJob) | **GET** /v1/jobs/{job_id} | Get ingest job progress |
| [**getJobWithHttpInfo**](JobsApi.md#getJobWithHttpInfo) | **GET** /v1/jobs/{job_id} | Get ingest job progress |



## cancelJob

> Job cancelJob(jobId, authorization)

Cancel a pending or running ingest job

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.JobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        JobsApi apiInstance = new JobsApi(defaultClient);
        Integer jobId = 56; // Integer | 
        String authorization = "authorization_example"; // String | 
        try {
            Job result = apiInstance.cancelJob(jobId, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#cancelJob");
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
| **jobId** | **Integer**|  | |
| **authorization** | **String**|  | [optional] |

### Return type

[**Job**](Job.md)


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

## cancelJobWithHttpInfo

> ApiResponse<Job> cancelJobWithHttpInfo(jobId, authorization)

Cancel a pending or running ingest job

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.JobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        JobsApi apiInstance = new JobsApi(defaultClient);
        Integer jobId = 56; // Integer | 
        String authorization = "authorization_example"; // String | 
        try {
            ApiResponse<Job> response = apiInstance.cancelJobWithHttpInfo(jobId, authorization);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#cancelJob");
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
| **jobId** | **Integer**|  | |
| **authorization** | **String**|  | [optional] |

### Return type

ApiResponse<[**Job**](Job.md)>


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


## getJob

> Job getJob(jobId, authorization)

Get ingest job progress

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.JobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        JobsApi apiInstance = new JobsApi(defaultClient);
        Integer jobId = 56; // Integer | 
        String authorization = "authorization_example"; // String | 
        try {
            Job result = apiInstance.getJob(jobId, authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#getJob");
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
| **jobId** | **Integer**|  | |
| **authorization** | **String**|  | [optional] |

### Return type

[**Job**](Job.md)


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

## getJobWithHttpInfo

> ApiResponse<Job> getJobWithHttpInfo(jobId, authorization)

Get ingest job progress

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.JobsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        JobsApi apiInstance = new JobsApi(defaultClient);
        Integer jobId = 56; // Integer | 
        String authorization = "authorization_example"; // String | 
        try {
            ApiResponse<Job> response = apiInstance.getJobWithHttpInfo(jobId, authorization);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#getJob");
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
| **jobId** | **Integer**|  | |
| **authorization** | **String**|  | [optional] |

### Return type

ApiResponse<[**Job**](Job.md)>


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

