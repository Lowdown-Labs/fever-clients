# KeysApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createKey**](KeysApi.md#createKey) | **POST** /v1/keys | Mint an API key for this appliance |
| [**createKeyWithHttpInfo**](KeysApi.md#createKeyWithHttpInfo) | **POST** /v1/keys | Mint an API key for this appliance |
| [**listKeys**](KeysApi.md#listKeys) | **GET** /v1/keys | List this appliance&#39;s API keys |
| [**listKeysWithHttpInfo**](KeysApi.md#listKeysWithHttpInfo) | **GET** /v1/keys | List this appliance&#39;s API keys |
| [**revokeKey**](KeysApi.md#revokeKey) | **POST** /v1/keys/{key_id}/revoke | Revoke an API key |
| [**revokeKeyWithHttpInfo**](KeysApi.md#revokeKeyWithHttpInfo) | **POST** /v1/keys/{key_id}/revoke | Revoke an API key |



## createKey

> KeyReveal createKey(createKeyRequest)

Mint an API key for this appliance

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.KeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: adminToken
        HttpBearerAuth adminToken = (HttpBearerAuth) defaultClient.getAuthentication("adminToken");
        adminToken.setBearerToken("BEARER TOKEN");

        KeysApi apiInstance = new KeysApi(defaultClient);
        CreateKeyRequest createKeyRequest = new CreateKeyRequest(); // CreateKeyRequest | 
        try {
            KeyReveal result = apiInstance.createKey(createKeyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#createKey");
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
| **createKeyRequest** | [**CreateKeyRequest**](CreateKeyRequest.md)|  | |

### Return type

[**KeyReveal**](KeyReveal.md)


### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

## createKeyWithHttpInfo

> ApiResponse<KeyReveal> createKeyWithHttpInfo(createKeyRequest)

Mint an API key for this appliance

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.KeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: adminToken
        HttpBearerAuth adminToken = (HttpBearerAuth) defaultClient.getAuthentication("adminToken");
        adminToken.setBearerToken("BEARER TOKEN");

        KeysApi apiInstance = new KeysApi(defaultClient);
        CreateKeyRequest createKeyRequest = new CreateKeyRequest(); // CreateKeyRequest | 
        try {
            ApiResponse<KeyReveal> response = apiInstance.createKeyWithHttpInfo(createKeyRequest);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#createKey");
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
| **createKeyRequest** | [**CreateKeyRequest**](CreateKeyRequest.md)|  | |

### Return type

ApiResponse<[**KeyReveal**](KeyReveal.md)>


### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## listKeys

> List<ApiKey> listKeys()

List this appliance&#39;s API keys

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.KeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: adminToken
        HttpBearerAuth adminToken = (HttpBearerAuth) defaultClient.getAuthentication("adminToken");
        adminToken.setBearerToken("BEARER TOKEN");

        KeysApi apiInstance = new KeysApi(defaultClient);
        try {
            List<ApiKey> result = apiInstance.listKeys();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#listKeys");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;ApiKey&gt;**](ApiKey.md)


### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

## listKeysWithHttpInfo

> ApiResponse<List<ApiKey>> listKeysWithHttpInfo()

List this appliance&#39;s API keys

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.KeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: adminToken
        HttpBearerAuth adminToken = (HttpBearerAuth) defaultClient.getAuthentication("adminToken");
        adminToken.setBearerToken("BEARER TOKEN");

        KeysApi apiInstance = new KeysApi(defaultClient);
        try {
            ApiResponse<List<ApiKey>> response = apiInstance.listKeysWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#listKeys");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**List&lt;ApiKey&gt;**](ApiKey.md)>


### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## revokeKey

> Object revokeKey(keyId)

Revoke an API key

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.KeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: adminToken
        HttpBearerAuth adminToken = (HttpBearerAuth) defaultClient.getAuthentication("adminToken");
        adminToken.setBearerToken("BEARER TOKEN");

        KeysApi apiInstance = new KeysApi(defaultClient);
        Integer keyId = 56; // Integer | 
        try {
            Object result = apiInstance.revokeKey(keyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#revokeKey");
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
| **keyId** | **Integer**|  | |

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

## revokeKeyWithHttpInfo

> ApiResponse<Object> revokeKeyWithHttpInfo(keyId)

Revoke an API key

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.auth.*;
import com.lowdownlabs.fever.models.*;
import com.lowdownlabs.fever.api.KeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: adminToken
        HttpBearerAuth adminToken = (HttpBearerAuth) defaultClient.getAuthentication("adminToken");
        adminToken.setBearerToken("BEARER TOKEN");

        KeysApi apiInstance = new KeysApi(defaultClient);
        Integer keyId = 56; // Integer | 
        try {
            ApiResponse<Object> response = apiInstance.revokeKeyWithHttpInfo(keyId);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling KeysApi#revokeKey");
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
| **keyId** | **Integer**|  | |

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

