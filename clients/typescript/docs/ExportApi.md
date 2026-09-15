# ExportApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**exportTenant**](ExportApi.md#exporttenant) | **POST** /v1/export | Export the tenant\&#39;s vectors and metadata to S3 |
| [**importTenant**](ExportApi.md#importtenant) | **POST** /v1/import | Import vectors and metadata from a previous FEVER export in S3 |



## exportTenant

> ExportResult exportTenant(exportRequest, authorization)

Export the tenant\&#39;s vectors and metadata to S3

### Example

```ts
import {
  Configuration,
  ExportApi,
} from 'fever-client';
import type { ExportTenantRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const api = new ExportApi();

  const body = {
    // ExportRequest
    exportRequest: ...,
    // string (optional)
    authorization: authorization_example,
  } satisfies ExportTenantRequest;

  try {
    const data = await api.exportTenant(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **exportRequest** | [ExportRequest](ExportRequest.md) |  | |
| **authorization** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**ExportResult**](ExportResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## importTenant

> ImportResult importTenant(importRequest, authorization)

Import vectors and metadata from a previous FEVER export in S3

### Example

```ts
import {
  Configuration,
  ExportApi,
} from 'fever-client';
import type { ImportTenantRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const api = new ExportApi();

  const body = {
    // ImportRequest
    importRequest: ...,
    // string (optional)
    authorization: authorization_example,
  } satisfies ImportTenantRequest;

  try {
    const data = await api.importTenant(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **importRequest** | [ImportRequest](ImportRequest.md) |  | |
| **authorization** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**ImportResult**](ImportResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

