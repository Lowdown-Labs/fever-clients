# fever_client.KeysApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_key**](KeysApi.md#create_key) | **POST** /v1/keys | Mint an API key for this appliance
[**list_keys**](KeysApi.md#list_keys) | **GET** /v1/keys | List this appliance&#39;s API keys
[**revoke_key**](KeysApi.md#revoke_key) | **POST** /v1/keys/{key_id}/revoke | Revoke an API key


# **create_key**
> KeyReveal create_key(create_key_request)

Mint an API key for this appliance

### Example

* Bearer Authentication (adminToken):

```python
import fever_client
from fever_client.models.create_key_request import CreateKeyRequest
from fever_client.models.key_reveal import KeyReveal
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: adminToken
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.KeysApi(api_client)
    create_key_request = fever_client.CreateKeyRequest() # CreateKeyRequest | 

    try:
        # Mint an API key for this appliance
        api_response = await api_instance.create_key(create_key_request)
        print("The response of KeysApi->create_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KeysApi->create_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_key_request** | [**CreateKeyRequest**](CreateKeyRequest.md)|  | 

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
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_keys**
> List[ApiKey] list_keys()

List this appliance's API keys

### Example

* Bearer Authentication (adminToken):

```python
import fever_client
from fever_client.models.api_key import ApiKey
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: adminToken
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.KeysApi(api_client)

    try:
        # List this appliance's API keys
        api_response = await api_instance.list_keys()
        print("The response of KeysApi->list_keys:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KeysApi->list_keys: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[ApiKey]**](ApiKey.md)

### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **revoke_key**
> object revoke_key(key_id)

Revoke an API key

### Example

* Bearer Authentication (adminToken):

```python
import fever_client
from fever_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost
# See configuration.py for a list of all supported configuration parameters.
configuration = fever_client.Configuration(
    host = "http://localhost"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization: adminToken
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.KeysApi(api_client)
    key_id = 56 # int | 

    try:
        # Revoke an API key
        api_response = await api_instance.revoke_key(key_id)
        print("The response of KeysApi->revoke_key:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KeysApi->revoke_key: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key_id** | **int**|  | 

### Return type

**object**

### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

