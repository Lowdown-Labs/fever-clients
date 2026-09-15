# LowdownLabs.Fever.Api.CustomersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ReassignCustomersBulk**](CustomersApi.md#reassigncustomersbulk) | **POST** /v1/customers/reassign-bulk | Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping |

<a id="reassigncustomersbulk"></a>
# **ReassignCustomersBulk**
> Object ReassignCustomersBulk (string? authorization = null, FileParameter? file = null)

Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping

Associate already-ingested images to customers after the fact, at millions-of-rows scale. Accepts a multipart file upload (.csv, .jsonl, .parquet) or a JSON body {\"s3_uri\": \"s3://bucket/key\", \"format\"?: \"csv|jsonl|parquet\"}. Each row maps a key (exact blob key) or filename to a customer_id; key is preferred when both are present. Rows are loaded with COPY and moved with one set-based UPDATE per table, so a million-row file completes in seconds. Reports matched/updated/noop/unmatched/conflict counts; filename fanout moves every match.

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
    public class ReassignCustomersBulkExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost";
            // create instances of HttpClient, HttpClientHandler to be reused later with different Api classes
            HttpClient httpClient = new HttpClient();
            HttpClientHandler httpClientHandler = new HttpClientHandler();
            var apiInstance = new CustomersApi(httpClient, config, httpClientHandler);
            var authorization = "authorization_example";  // string? |  (optional) 
            var file = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // FileParameter? |  (optional) 

            try
            {
                // Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping
                Object result = apiInstance.ReassignCustomersBulk(authorization, file);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling CustomersApi.ReassignCustomersBulk: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ReassignCustomersBulkWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping
    ApiResponse<Object> response = apiInstance.ReassignCustomersBulkWithHttpInfo(authorization, file);
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling CustomersApi.ReassignCustomersBulkWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
}
```

### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **authorization** | **string?** |  | [optional]  |
| **file** | **FileParameter?****FileParameter?** |  | [optional]  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

