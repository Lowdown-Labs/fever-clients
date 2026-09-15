# \IngestAPI

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**IngestMedia**](IngestAPI.md#IngestMedia) | **Post** /v1/media | Ingest one or many media items



## IngestMedia

> IngestResult IngestMedia(ctx).IngestRequest(ingestRequest).Authorization(authorization).Execute()

Ingest one or many media items



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
	ingestRequest := *openapiclient.NewIngestRequest() // IngestRequest | 
	authorization := "authorization_example" // string |  (optional)

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.IngestAPI.IngestMedia(context.Background()).IngestRequest(ingestRequest).Authorization(authorization).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `IngestAPI.IngestMedia``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `IngestMedia`: IngestResult
	fmt.Fprintf(os.Stdout, "Response from `IngestAPI.IngestMedia`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiIngestMediaRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ingestRequest** | [**IngestRequest**](IngestRequest.md) |  | 
 **authorization** | **string** |  | 

### Return type

[**IngestResult**](IngestResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

