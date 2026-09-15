# \KeysApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_key**](KeysApi.md#create_key) | **POST** /v1/keys | Mint an API key for this appliance
[**list_keys**](KeysApi.md#list_keys) | **GET** /v1/keys | List this appliance's API keys
[**revoke_key**](KeysApi.md#revoke_key) | **POST** /v1/keys/{key_id}/revoke | Revoke an API key



## create_key

> models::KeyReveal create_key(create_key_request)
Mint an API key for this appliance

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**create_key_request** | [**CreateKeyRequest**](CreateKeyRequest.md) |  | [required] |

### Return type

[**models::KeyReveal**](KeyReveal.md)

### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## list_keys

> Vec<models::ApiKey> list_keys()
List this appliance's API keys

### Parameters

This endpoint does not need any parameter.

### Return type

[**Vec<models::ApiKey>**](ApiKey.md)

### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## revoke_key

> serde_json::Value revoke_key(key_id)
Revoke an API key

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**key_id** | **i32** |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[adminToken](../README.md#adminToken)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

