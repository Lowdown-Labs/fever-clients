# CustomersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCustomer**](CustomersApi.md#deleteCustomer) | **DELETE** /v1/customers/{customer_id} | Delete all data for one customer |
| [**deleteCustomerWithHttpInfo**](CustomersApi.md#deleteCustomerWithHttpInfo) | **DELETE** /v1/customers/{customer_id} | Delete all data for one customer |
| [**reassignCustomersBulk**](CustomersApi.md#reassignCustomersBulk) | **POST** /v1/customers/reassign-bulk | Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping |
| [**reassignCustomersBulkWithHttpInfo**](CustomersApi.md#reassignCustomersBulkWithHttpInfo) | **POST** /v1/customers/reassign-bulk | Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping |



## deleteCustomer

> Object deleteCustomer(customerId)

Delete all data for one customer

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: adminToken
        HttpBearerAuth adminToken = (HttpBearerAuth) defaultClient.getAuthentication("adminToken");
        adminToken.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        try {
            Object result = apiInstance.deleteCustomer(customerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#deleteCustomer");
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
| **customerId** | **String**|  | |

### Return type

**Object**


### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## deleteCustomerWithHttpInfo

> ApiResponse<Object> deleteCustomerWithHttpInfo(customerId)

Delete all data for one customer

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: adminToken
        HttpBearerAuth adminToken = (HttpBearerAuth) defaultClient.getAuthentication("adminToken");
        adminToken.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String customerId = "customerId_example"; // String | 
        try {
            ApiResponse<Object> response = apiInstance.deleteCustomerWithHttpInfo(customerId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#deleteCustomer");
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
| **customerId** | **String**|  | |

### Return type

ApiResponse<**Object**>


### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## reassignCustomersBulk

> Object reassignCustomersBulk(_file)

Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping

Associate already-ingested images to customers after the fact, at millions-of-rows scale. Accepts a multipart file upload (.csv, .jsonl, .parquet) or a JSON body {\&quot;s3_uri\&quot;: \&quot;s3://bucket/key\&quot;, \&quot;format\&quot;?: \&quot;csv|jsonl|parquet\&quot;}. Each row maps a key (exact blob key) or filename to a customer_id; key is preferred when both are present. Rows are loaded with COPY and moved with one set-based UPDATE per table, so a million-row file completes in seconds. Reports matched/updated/noop/unmatched/conflict counts; filename fanout moves every match.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: adminToken
        HttpBearerAuth adminToken = (HttpBearerAuth) defaultClient.getAuthentication("adminToken");
        adminToken.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        File _file = new File("/path/to/file"); // File | 
        try {
            Object result = apiInstance.reassignCustomersBulk(_file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#reassignCustomersBulk");
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
| **_file** | **File**|  | [optional] |

### Return type

**Object**


### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## reassignCustomersBulkWithHttpInfo

> ApiResponse<Object> reassignCustomersBulkWithHttpInfo(_file)

Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping

Associate already-ingested images to customers after the fact, at millions-of-rows scale. Accepts a multipart file upload (.csv, .jsonl, .parquet) or a JSON body {\&quot;s3_uri\&quot;: \&quot;s3://bucket/key\&quot;, \&quot;format\&quot;?: \&quot;csv|jsonl|parquet\&quot;}. Each row maps a key (exact blob key) or filename to a customer_id; key is preferred when both are present. Rows are loaded with COPY and moved with one set-based UPDATE per table, so a million-row file completes in seconds. Reports matched/updated/noop/unmatched/conflict counts; filename fanout moves every match.

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: adminToken
        HttpBearerAuth adminToken = (HttpBearerAuth) defaultClient.getAuthentication("adminToken");
        adminToken.setBearerToken("BEARER TOKEN");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        File _file = new File("/path/to/file"); // File | 
        try {
            ApiResponse<Object> response = apiInstance.reassignCustomersBulkWithHttpInfo(_file);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#reassignCustomersBulk");
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
| **_file** | **File**|  | [optional] |

### Return type

ApiResponse<**Object**>


### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

