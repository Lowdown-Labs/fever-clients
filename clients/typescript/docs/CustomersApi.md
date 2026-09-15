# CustomersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reassignCustomersBulk**](CustomersApi.md#reassigncustomersbulk) | **POST** /v1/customers/reassign-bulk | Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping |



## reassignCustomersBulk

> any reassignCustomersBulk(file)

Reassign customer_id in bulk from a JSONL / CSV / Parquet mapping

Associate already-ingested images to customers after the fact, at millions-of-rows scale. Accepts a multipart file upload (.csv, .jsonl, .parquet) or a JSON body {\&quot;s3_uri\&quot;: \&quot;s3://bucket/key\&quot;, \&quot;format\&quot;?: \&quot;csv|jsonl|parquet\&quot;}. Each row maps a key (exact blob key) or filename to a customer_id; key is preferred when both are present. Rows are loaded with COPY and moved with one set-based UPDATE per table, so a million-row file completes in seconds. Reports matched/updated/noop/unmatched/conflict counts; filename fanout moves every match.

### Example

```ts
import {
  Configuration,
  CustomersApi,
} from 'fever-client';
import type { ReassignCustomersBulkRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: adminToken
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new CustomersApi(config);

  const body = {
    // Blob (optional)
    file: BINARY_DATA_HERE,
  } satisfies ReassignCustomersBulkRequest;

  try {
    const data = await api.reassignCustomersBulk(body);
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
| **file** | `Blob` |  | [Optional] [Defaults to `undefined`] |

### Return type

**any**

### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: `multipart/form-data`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

