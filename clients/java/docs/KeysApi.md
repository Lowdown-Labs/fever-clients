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

> KeyReveal createKey(createKeyRequest, authorization)

Mint an API key for this appliance

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.KeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        KeysApi apiInstance = new KeysApi(defaultClient);
        CreateKeyRequest createKeyRequest = new CreateKeyRequest(); // CreateKeyRequest | 
        String authorization = "authorization_example"; // String | 
        try {
            KeyReveal result = apiInstance.createKey(createKeyRequest, authorization);
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
| **authorization** | **String**|  | [optional] |

### Return type

[**KeyReveal**](KeyReveal.md)


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

## createKeyWithHttpInfo

> ApiResponse<KeyReveal> createKeyWithHttpInfo(createKeyRequest, authorization)

Mint an API key for this appliance

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.KeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        KeysApi apiInstance = new KeysApi(defaultClient);
        CreateKeyRequest createKeyRequest = new CreateKeyRequest(); // CreateKeyRequest | 
        String authorization = "authorization_example"; // String | 
        try {
            ApiResponse<KeyReveal> response = apiInstance.createKeyWithHttpInfo(createKeyRequest, authorization);
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
| **authorization** | **String**|  | [optional] |

### Return type

ApiResponse<[**KeyReveal**](KeyReveal.md)>


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


## listKeys

> List<ApiKey> listKeys(authorization)

List this appliance&#39;s API keys

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.KeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        KeysApi apiInstance = new KeysApi(defaultClient);
        String authorization = "authorization_example"; // String | 
        try {
            List<ApiKey> result = apiInstance.listKeys(authorization);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |

### Return type

[**List&lt;ApiKey&gt;**](ApiKey.md)


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

## listKeysWithHttpInfo

> ApiResponse<List<ApiKey>> listKeysWithHttpInfo(authorization)

List this appliance&#39;s API keys

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.KeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        KeysApi apiInstance = new KeysApi(defaultClient);
        String authorization = "authorization_example"; // String | 
        try {
            ApiResponse<List<ApiKey>> response = apiInstance.listKeysWithHttpInfo(authorization);
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


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**|  | [optional] |

### Return type

ApiResponse<[**List&lt;ApiKey&gt;**](ApiKey.md)>


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


## revokeKey

> Object revokeKey(keyId, authorization)

Revoke an API key

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.KeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        KeysApi apiInstance = new KeysApi(defaultClient);
        Integer keyId = 56; // Integer | 
        String authorization = "authorization_example"; // String | 
        try {
            Object result = apiInstance.revokeKey(keyId, authorization);
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

## revokeKeyWithHttpInfo

> ApiResponse<Object> revokeKeyWithHttpInfo(keyId, authorization)

Revoke an API key

### Example

```java
// Import classes:
import com.lowdownlabs.fever.ApiClient;
import com.lowdownlabs.fever.ApiException;
import com.lowdownlabs.fever.ApiResponse;
import com.lowdownlabs.fever.Configuration;
import com.lowdownlabs.fever.models.*;
import org.openapitools.client.api.KeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        KeysApi apiInstance = new KeysApi(defaultClient);
        Integer keyId = 56; // Integer | 
        String authorization = "authorization_example"; // String | 
        try {
            ApiResponse<Object> response = apiInstance.revokeKeyWithHttpInfo(keyId, authorization);
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

