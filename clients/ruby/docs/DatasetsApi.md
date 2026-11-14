# FeverClient::DatasetsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**add_dataset_items**](DatasetsApi.md#add_dataset_items) | **POST** /v1/datasets/{dataset_id}/items | Add blobs to a dataset |
| [**create_dataset**](DatasetsApi.md#create_dataset) | **POST** /v1/datasets | Create a dataset, optionally with initial items |
| [**delete_dataset**](DatasetsApi.md#delete_dataset) | **DELETE** /v1/datasets/{dataset_id} | Delete a dataset (the blobs themselves stay indexed) |
| [**get_dataset**](DatasetsApi.md#get_dataset) | **GET** /v1/datasets/{dataset_id} | Get a dataset with its blob ids |
| [**list_datasets**](DatasetsApi.md#list_datasets) | **GET** /v1/datasets | List datasets visible to this key |
| [**remove_dataset_items**](DatasetsApi.md#remove_dataset_items) | **DELETE** /v1/datasets/{dataset_id}/items | Remove items from a dataset; no body clears every item |


## add_dataset_items

> <DatasetDetail> add_dataset_items(dataset_id, dataset_items_request)

Add blobs to a dataset

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::DatasetsApi.new
dataset_id = 56 # Integer | 
dataset_items_request = FeverClient::DatasetItemsRequest.new({blob_ids: [37]}) # DatasetItemsRequest | 

begin
  # Add blobs to a dataset
  result = api_instance.add_dataset_items(dataset_id, dataset_items_request)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling DatasetsApi->add_dataset_items: #{e}"
end
```

#### Using the add_dataset_items_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DatasetDetail>, Integer, Hash)> add_dataset_items_with_http_info(dataset_id, dataset_items_request)

```ruby
begin
  # Add blobs to a dataset
  data, status_code, headers = api_instance.add_dataset_items_with_http_info(dataset_id, dataset_items_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DatasetDetail>
rescue FeverClient::ApiError => e
  puts "Error when calling DatasetsApi->add_dataset_items_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dataset_id** | **Integer** |  |  |
| **dataset_items_request** | [**DatasetItemsRequest**](DatasetItemsRequest.md) |  |  |

### Return type

[**DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_dataset

> <DatasetDetail> create_dataset(dataset_create)

Create a dataset, optionally with initial items

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::DatasetsApi.new
dataset_create = FeverClient::DatasetCreate.new({name: 'name_example'}) # DatasetCreate | 

begin
  # Create a dataset, optionally with initial items
  result = api_instance.create_dataset(dataset_create)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling DatasetsApi->create_dataset: #{e}"
end
```

#### Using the create_dataset_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DatasetDetail>, Integer, Hash)> create_dataset_with_http_info(dataset_create)

```ruby
begin
  # Create a dataset, optionally with initial items
  data, status_code, headers = api_instance.create_dataset_with_http_info(dataset_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DatasetDetail>
rescue FeverClient::ApiError => e
  puts "Error when calling DatasetsApi->create_dataset_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dataset_create** | [**DatasetCreate**](DatasetCreate.md) |  |  |

### Return type

[**DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_dataset

> Hash&lt;String, Object&gt; delete_dataset(dataset_id)

Delete a dataset (the blobs themselves stay indexed)

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::DatasetsApi.new
dataset_id = 56 # Integer | 

begin
  # Delete a dataset (the blobs themselves stay indexed)
  result = api_instance.delete_dataset(dataset_id)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling DatasetsApi->delete_dataset: #{e}"
end
```

#### Using the delete_dataset_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(Hash&lt;String, Object&gt;, Integer, Hash)> delete_dataset_with_http_info(dataset_id)

```ruby
begin
  # Delete a dataset (the blobs themselves stay indexed)
  data, status_code, headers = api_instance.delete_dataset_with_http_info(dataset_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => Hash&lt;String, Object&gt;
rescue FeverClient::ApiError => e
  puts "Error when calling DatasetsApi->delete_dataset_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dataset_id** | **Integer** |  |  |

### Return type

**Hash&lt;String, Object&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_dataset

> <DatasetDetail> get_dataset(dataset_id)

Get a dataset with its blob ids

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::DatasetsApi.new
dataset_id = 56 # Integer | 

begin
  # Get a dataset with its blob ids
  result = api_instance.get_dataset(dataset_id)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling DatasetsApi->get_dataset: #{e}"
end
```

#### Using the get_dataset_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DatasetDetail>, Integer, Hash)> get_dataset_with_http_info(dataset_id)

```ruby
begin
  # Get a dataset with its blob ids
  data, status_code, headers = api_instance.get_dataset_with_http_info(dataset_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DatasetDetail>
rescue FeverClient::ApiError => e
  puts "Error when calling DatasetsApi->get_dataset_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dataset_id** | **Integer** |  |  |

### Return type

[**DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## list_datasets

> <Array<Dataset>> list_datasets(opts)

List datasets visible to this key

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::DatasetsApi.new
opts = {
  customer_id: 'customer_id_example' # String | 
}

begin
  # List datasets visible to this key
  result = api_instance.list_datasets(opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling DatasetsApi->list_datasets: #{e}"
end
```

#### Using the list_datasets_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Array<Dataset>>, Integer, Hash)> list_datasets_with_http_info(opts)

```ruby
begin
  # List datasets visible to this key
  data, status_code, headers = api_instance.list_datasets_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Array<Dataset>>
rescue FeverClient::ApiError => e
  puts "Error when calling DatasetsApi->list_datasets_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **customer_id** | **String** |  | [optional] |

### Return type

[**Array&lt;Dataset&gt;**](Dataset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## remove_dataset_items

> <DatasetDetail> remove_dataset_items(dataset_id, opts)

Remove items from a dataset; no body clears every item

### Examples

```ruby
require 'time'
require 'fever_client'
# setup authorization
FeverClient.configure do |config|
  # Configure Bearer authorization: bearerAuth
  config.access_token = 'YOUR_BEARER_TOKEN'
end

api_instance = FeverClient::DatasetsApi.new
dataset_id = 56 # Integer | 
opts = {
  dataset_items_remove: FeverClient::DatasetItemsRemove.new # DatasetItemsRemove | 
}

begin
  # Remove items from a dataset; no body clears every item
  result = api_instance.remove_dataset_items(dataset_id, opts)
  p result
rescue FeverClient::ApiError => e
  puts "Error when calling DatasetsApi->remove_dataset_items: #{e}"
end
```

#### Using the remove_dataset_items_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DatasetDetail>, Integer, Hash)> remove_dataset_items_with_http_info(dataset_id, opts)

```ruby
begin
  # Remove items from a dataset; no body clears every item
  data, status_code, headers = api_instance.remove_dataset_items_with_http_info(dataset_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DatasetDetail>
rescue FeverClient::ApiError => e
  puts "Error when calling DatasetsApi->remove_dataset_items_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **dataset_id** | **Integer** |  |  |
| **dataset_items_remove** | [**DatasetItemsRemove**](DatasetItemsRemove.md) |  | [optional] |

### Return type

[**DatasetDetail**](DatasetDetail.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

