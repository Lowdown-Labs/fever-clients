# \DuplicatesAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FindDuplicates**](DuplicatesAPI.md#FindDuplicates) | **Post** /v1/duplicates | Find near-duplicate media clusters for a customer
[**SuggestedDedupThreshold**](DuplicatesAPI.md#SuggestedDedupThreshold) | **Get** /v1/duplicates/suggested-threshold | Suggest a duplicate-detection threshold from this customer&#39;s edge cosine distribution



## FindDuplicates

> DuplicatesResponse FindDuplicates(ctx).DuplicatesRequest(duplicatesRequest).Execute()

Find near-duplicate media clusters for a customer



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func main() {
	duplicatesRequest := *openapiclient.NewDuplicatesRequest() // DuplicatesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DuplicatesAPI.FindDuplicates(context.Background()).DuplicatesRequest(duplicatesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DuplicatesAPI.FindDuplicates``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `FindDuplicates`: DuplicatesResponse
	fmt.Fprintf(os.Stdout, "Response from `DuplicatesAPI.FindDuplicates`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFindDuplicatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **duplicatesRequest** | [**DuplicatesRequest**](DuplicatesRequest.md) |  | 

### Return type

[**DuplicatesResponse**](DuplicatesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## SuggestedDedupThreshold

> interface{} SuggestedDedupThreshold(ctx).CustomerId(customerId).Execute()

Suggest a duplicate-detection threshold from this customer's edge cosine distribution

### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/Lowdown-Labs/fever-clients/clients/go"
)

func main() {
	customerId := "customerId_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DuplicatesAPI.SuggestedDedupThreshold(context.Background()).CustomerId(customerId).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DuplicatesAPI.SuggestedDedupThreshold``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `SuggestedDedupThreshold`: interface{}
	fmt.Fprintf(os.Stdout, "Response from `DuplicatesAPI.SuggestedDedupThreshold`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiSuggestedDedupThresholdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **string** |  | 

### Return type

**interface{}**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

