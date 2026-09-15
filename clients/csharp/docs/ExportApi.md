# LowdownLabs.Fever.Api.ExportApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ExportTenant**](ExportApi.md#exporttenant) | **POST** /v1/export | Export the tenant&#39;s vectors and metadata to S3 |
| [**ImportTenant**](ExportApi.md#importtenant) | **POST** /v1/import | Import vectors and metadata from a previous FEVER export in S3 |

<a id="exporttenant"></a>
# **ExportTenant**
> ExportResult ExportTenant (ExportRequest exportRequest, string? authorization = null)

Export the tenant's vectors and metadata to S3

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
    public class ExportTenantExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ExportApi(httpClient, config, httpClientHandler);
            var exportRequest = new ExportRequest(); // ExportRequest | 
            var authorization = "authorization_example";  // string? |  (optional) 

            try
            {
                // Export the tenant's vectors and metadata to S3
                ExportResult result = apiInstance.ExportTenant(exportRequest, authorization);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ExportApi.ExportTenant: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ExportTenantWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Export the tenant's vectors and metadata to S3
    ApiResponse<ExportResult> response = apiInstance.ExportTenantWithHttpInfo(exportRequest, authorization);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ExportApi.ExportTenantWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **exportRequest** | [**ExportRequest**](ExportRequest.md) |  |  |
| **authorization** | **string?** |  | [optional]  |

### Return type

[**ExportResult**](ExportResult.md)

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

<a id="importtenant"></a>
# **ImportTenant**
> ImportResult ImportTenant (ImportRequest importRequest, string? authorization = null)

Import vectors and metadata from a previous FEVER export in S3

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
    public class ImportTenantExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new ExportApi(httpClient, config, httpClientHandler);
            var importRequest = new ImportRequest(); // ImportRequest | 
            var authorization = "authorization_example";  // string? |  (optional) 

            try
            {
                // Import vectors and metadata from a previous FEVER export in S3
                ImportResult result = apiInstance.ImportTenant(importRequest, authorization);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ExportApi.ImportTenant: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ImportTenantWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Import vectors and metadata from a previous FEVER export in S3
    ApiResponse<ImportResult> response = apiInstance.ImportTenantWithHttpInfo(importRequest, authorization);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling ExportApi.ImportTenantWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **importRequest** | [**ImportRequest**](ImportRequest.md) |  |  |
| **authorization** | **string?** |  | [optional]  |

### Return type

[**ImportResult**](ImportResult.md)

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

