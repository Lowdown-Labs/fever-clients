# fever_client.DatasetsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_dataset_items**](DatasetsApi.md#add_dataset_items) | **POST** /v1/datasets/{dataset_id}/items | Add blobs to a dataset
[**create_dataset**](DatasetsApi.md#create_dataset) | **POST** /v1/datasets | Create a dataset, optionally with initial items
[**delete_dataset**](DatasetsApi.md#delete_dataset) | **DELETE** /v1/datasets/{dataset_id} | Delete a dataset (the blobs themselves stay indexed)
[**get_dataset**](DatasetsApi.md#get_dataset) | **GET** /v1/datasets/{dataset_id} | Get a dataset with its blob ids
[**list_datasets**](DatasetsApi.md#list_datasets) | **GET** /v1/datasets | List datasets visible to this key
[**remove_dataset_items**](DatasetsApi.md#remove_dataset_items) | **DELETE** /v1/datasets/{dataset_id}/items | Remove items from a dataset; no body clears every item


# **add_dataset_items**
> DatasetDetail add_dataset_items(dataset_id, dataset_items_request)

Add blobs to a dataset

### Example

* Bearer Authentication (bearerAuth):

```python
import fever_client
from fever_client.models.dataset_detail import DatasetDetail
from fever_client.models.dataset_items_request import DatasetItemsRequest
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

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.DatasetsApi(api_client)
    dataset_id = 56 # int | 
    dataset_items_request = fever_client.DatasetItemsRequest() # DatasetItemsRequest | 

    try:
        # Add blobs to a dataset
        api_response = await api_instance.add_dataset_items(dataset_id, dataset_items_request)
        print("The response of DatasetsApi->add_dataset_items:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DatasetsApi->add_dataset_items: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset_id** | **int**|  | 
 **dataset_items_request** | [**DatasetItemsRequest**](DatasetItemsRequest.md)|  | 

### Return type

[**DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_dataset**
> DatasetDetail create_dataset(dataset_create)

Create a dataset, optionally with initial items

### Example

* Bearer Authentication (bearerAuth):

```python
import fever_client
from fever_client.models.dataset_create import DatasetCreate
from fever_client.models.dataset_detail import DatasetDetail
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

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.DatasetsApi(api_client)
    dataset_create = fever_client.DatasetCreate() # DatasetCreate | 

    try:
        # Create a dataset, optionally with initial items
        api_response = await api_instance.create_dataset(dataset_create)
        print("The response of DatasetsApi->create_dataset:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DatasetsApi->create_dataset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset_create** | [**DatasetCreate**](DatasetCreate.md)|  | 

### Return type

[**DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_dataset**
> Dict[str, Optional[object]] delete_dataset(dataset_id)

Delete a dataset (the blobs themselves stay indexed)

### Example

* Bearer Authentication (bearerAuth):

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

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.DatasetsApi(api_client)
    dataset_id = 56 # int | 

    try:
        # Delete a dataset (the blobs themselves stay indexed)
        api_response = await api_instance.delete_dataset(dataset_id)
        print("The response of DatasetsApi->delete_dataset:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DatasetsApi->delete_dataset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset_id** | **int**|  | 

### Return type

**Dict[str, Optional[object]]**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_dataset**
> DatasetDetail get_dataset(dataset_id)

Get a dataset with its blob ids

### Example

* Bearer Authentication (bearerAuth):

```python
import fever_client
from fever_client.models.dataset_detail import DatasetDetail
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

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.DatasetsApi(api_client)
    dataset_id = 56 # int | 

    try:
        # Get a dataset with its blob ids
        api_response = await api_instance.get_dataset(dataset_id)
        print("The response of DatasetsApi->get_dataset:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DatasetsApi->get_dataset: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset_id** | **int**|  | 

### Return type

[**DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_datasets**
> List[Dataset] list_datasets(customer_id=customer_id)

List datasets visible to this key

### Example

* Bearer Authentication (bearerAuth):

```python
import fever_client
from fever_client.models.dataset import Dataset
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

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.DatasetsApi(api_client)
    customer_id = 'customer_id_example' # str |  (optional)

    try:
        # List datasets visible to this key
        api_response = await api_instance.list_datasets(customer_id=customer_id)
        print("The response of DatasetsApi->list_datasets:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DatasetsApi->list_datasets: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_id** | **str**|  | [optional] 

### Return type

[**List[Dataset]**](Dataset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_dataset_items**
> DatasetDetail remove_dataset_items(dataset_id, dataset_items_remove=dataset_items_remove)

Remove items from a dataset; no body clears every item

### Example

* Bearer Authentication (bearerAuth):

```python
import fever_client
from fever_client.models.dataset_detail import DatasetDetail
from fever_client.models.dataset_items_remove import DatasetItemsRemove
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

# Configure Bearer authorization: bearerAuth
configuration = fever_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
async with fever_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = fever_client.DatasetsApi(api_client)
    dataset_id = 56 # int | 
    dataset_items_remove = fever_client.DatasetItemsRemove() # DatasetItemsRemove |  (optional)

    try:
        # Remove items from a dataset; no body clears every item
        api_response = await api_instance.remove_dataset_items(dataset_id, dataset_items_remove=dataset_items_remove)
        print("The response of DatasetsApi->remove_dataset_items:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DatasetsApi->remove_dataset_items: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dataset_id** | **int**|  | 
 **dataset_items_remove** | [**DatasetItemsRemove**](DatasetItemsRemove.md)|  | [optional] 

### Return type

[**DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |
**422** | Validation Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

