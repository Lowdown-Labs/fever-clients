# ExportApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportTenant**](ExportApi.md#exportTenant) | **POST** /v1/export | Export the tenant&#39;s vectors and metadata to S3 |
| [**exportTenantWithHttpInfo**](ExportApi.md#exportTenantWithHttpInfo) | **POST** /v1/export | Export the tenant&#39;s vectors and metadata to S3 |
| [**importTenant**](ExportApi.md#importTenant) | **POST** /v1/import | Import vectors and metadata from a previous FEVER export in S3 |
| [**importTenantWithHttpInfo**](ExportApi.md#importTenantWithHttpInfo) | **POST** /v1/import | Import vectors and metadata from a previous FEVER export in S3 |



## exportTenant

> ExportResult exportTenant(exportRequest)

Export the tenant&#39;s vectors and metadata to S3

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.ExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExportApi apiInstance = new ExportApi(defaultClient);
        ExportRequest exportRequest = new ExportRequest(); // ExportRequest | 
        try {
            ExportResult result = apiInstance.exportTenant(exportRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportApi#exportTenant");
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
| **exportRequest** | [**ExportRequest**](ExportRequest.md)|  | |

### Return type

[**ExportResult**](ExportResult.md)


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

## exportTenantWithHttpInfo

> ApiResponse<ExportResult> exportTenantWithHttpInfo(exportRequest)

Export the tenant&#39;s vectors and metadata to S3

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.ExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExportApi apiInstance = new ExportApi(defaultClient);
        ExportRequest exportRequest = new ExportRequest(); // ExportRequest | 
        try {
            ApiResponse<ExportResult> response = apiInstance.exportTenantWithHttpInfo(exportRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportApi#exportTenant");
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
| **exportRequest** | [**ExportRequest**](ExportRequest.md)|  | |

### Return type

ApiResponse<[**ExportResult**](ExportResult.md)>


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


## importTenant

> ImportResult importTenant(importRequest)

Import vectors and metadata from a previous FEVER export in S3

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.ExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExportApi apiInstance = new ExportApi(defaultClient);
        ImportRequest importRequest = new ImportRequest(); // ImportRequest | 
        try {
            ImportResult result = apiInstance.importTenant(importRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportApi#importTenant");
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
| **importRequest** | [**ImportRequest**](ImportRequest.md)|  | |

### Return type

[**ImportResult**](ImportResult.md)


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

## importTenantWithHttpInfo

> ApiResponse<ImportResult> importTenantWithHttpInfo(importRequest)

Import vectors and metadata from a previous FEVER export in S3

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.ExportApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ExportApi apiInstance = new ExportApi(defaultClient);
        ImportRequest importRequest = new ImportRequest(); // ImportRequest | 
        try {
            ApiResponse<ImportResult> response = apiInstance.importTenantWithHttpInfo(importRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling ExportApi#importTenant");
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
| **importRequest** | [**ImportRequest**](ImportRequest.md)|  | |

### Return type

ApiResponse<[**ImportResult**](ImportResult.md)>


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

