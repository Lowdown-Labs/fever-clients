# KeysApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createKey**](KeysApi.md#createkeyoperation) | **POST** /v1/keys | Mint an API key for this appliance |
| [**listKeys**](KeysApi.md#listkeys) | **GET** /v1/keys | List this appliance\&#39;s API keys |
| [**revokeKey**](KeysApi.md#revokekey) | **POST** /v1/keys/{key_id}/revoke | Revoke an API key |



## createKey

> KeyReveal createKey(createKeyRequest, authorization)

Mint an API key for this appliance

### Example

```ts
import {
  Configuration,
  KeysApi,
} from 'fever-client';
import type { CreateKeyOperationRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const api = new KeysApi();

  const body = {
    // CreateKeyRequest
    createKeyRequest: ...,
    // string (optional)
    authorization: authorization_example,
  } satisfies CreateKeyOperationRequest;

  try {
    const data = await api.createKey(body);
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
| **createKeyRequest** | [CreateKeyRequest](CreateKeyRequest.md) |  | |
| **authorization** | `string` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**KeyReveal**](KeyReveal.md)

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


## listKeys

> Array&lt;ApiKey&gt; listKeys(authorization)

List this appliance\&#39;s API keys

### Example

```ts
import {
  Configuration,
  KeysApi,
} from 'fever-client';
import type { ListKeysRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const api = new KeysApi();

  const body = {
    // string (optional)
    authorization: authorization_example,
  } satisfies ListKeysRequest;

  try {
    const data = await api.listKeys(body);
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

[**Array&lt;ApiKey&gt;**](ApiKey.md)

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


## revokeKey

> any revokeKey(keyId, authorization)

Revoke an API key

### Example

```ts
import {
  Configuration,
  KeysApi,
} from 'fever-client';
import type { RevokeKeyRequest } from 'fever-client';

async function example() {
  console.log("🚀 Testing fever-client SDK...");
  const api = new KeysApi();

  const body = {
    // number
    keyId: 56,
    // string (optional)
    authorization: authorization_example,
  } satisfies RevokeKeyRequest;

  try {
    const data = await api.revokeKey(body);
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
| **keyId** | `number` |  | [Defaults to `undefined`] |
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

