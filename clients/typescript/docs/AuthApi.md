# AuthApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**whoami**](AuthApi.md#whoami) | **GET** /v1/whoami | Report the calling key\&#39;s role and customer scope |



## whoami

> any whoami(authorization)

Report the calling key\&#39;s role and customer scope

### Example

```ts
import {
  Configuration,
  AuthApi,
} from 'fever-client';
import type { WhoamiRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const api = new AuthApi();

  const body = {
    // string (optional)
    authorization: authorization_example,
  } satisfies WhoamiRequest;

  try {
    const data = await api.whoami(body);
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
| **authorization** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

**any**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

