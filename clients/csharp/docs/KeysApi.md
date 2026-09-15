# LowdownLabs.Fever.Api.KeysApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**CreateKey**](KeysApi.md#createkey) | **POST** /v1/keys | Mint an API key for this appliance |
| [**ListKeys**](KeysApi.md#listkeys) | **GET** /v1/keys | List this appliance&#39;s API keys |
| [**RevokeKey**](KeysApi.md#revokekey) | **POST** /v1/keys/{key_id}/revoke | Revoke an API key |

<a id="createkey"></a>
# **CreateKey**
> KeyReveal CreateKey (CreateKeyRequest createKeyRequest, string? authorization = null)

Mint an API key for this appliance

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using LowdownLabs.Fever.Api;
using LowdownLabs.Fever.Client;
using LowdownLabs.Fever.Model;

namespace Example
{
    public class CreateKeyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new KeysApi(httpClient, config, httpClientHandler);
            var createKeyRequest = new CreateKeyRequest(); // CreateKeyRequest | 
            var authorization = "authorization_example";  // string? |  (optional) 

            try
            {
                // Mint an API key for this appliance
                KeyReveal result = apiInstance.CreateKey(createKeyRequest, authorization);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KeysApi.CreateKey: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the CreateKeyWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Mint an API key for this appliance
    ApiResponse<KeyReveal> response = apiInstance.CreateKeyWithHttpInfo(createKeyRequest, authorization);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KeysApi.CreateKeyWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **createKeyRequest** | [**CreateKeyRequest**](CreateKeyRequest.md) |  |  |
| **authorization** | **string?** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="listkeys"></a>
# **ListKeys**
> List&lt;ApiKey&gt; ListKeys (string? authorization = null)

List this appliance's API keys

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using LowdownLabs.Fever.Api;
using LowdownLabs.Fever.Client;
using LowdownLabs.Fever.Model;

namespace Example
{
    public class ListKeysExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new KeysApi(httpClient, config, httpClientHandler);
            var authorization = "authorization_example";  // string? |  (optional) 

            try
            {
                // List this appliance's API keys
                List<ApiKey> result = apiInstance.ListKeys(authorization);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KeysApi.ListKeys: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ListKeysWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // List this appliance's API keys
    ApiResponse<List<ApiKey>> response = apiInstance.ListKeysWithHttpInfo(authorization);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KeysApi.ListKeysWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string?** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="revokekey"></a>
# **RevokeKey**
> Object RevokeKey (int keyId, string? authorization = null)

Revoke an API key

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using System.Net.Http;
using LowdownLabs.Fever.Api;
using LowdownLabs.Fever.Client;
using LowdownLabs.Fever.Model;

namespace Example
{
    public class RevokeKeyExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new KeysApi(httpClient, config, httpClientHandler);
            var keyId = 56;  // int | 
            var authorization = "authorization_example";  // string? |  (optional) 

            try
            {
                // Revoke an API key
                Object result = apiInstance.RevokeKey(keyId, authorization);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling KeysApi.RevokeKey: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the RevokeKeyWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Revoke an API key
    ApiResponse<Object> response = apiInstance.RevokeKeyWithHttpInfo(keyId, authorization);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling KeysApi.RevokeKeyWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **keyId** | **int** |  |  |
| **authorization** | **string?** |  | [optional]  |

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

