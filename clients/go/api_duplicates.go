package fever

import (
	"bytes"
	"context"
	"io"
	"net/http"
	"net/url"
)

type DuplicatesAPI interface {

	FindDuplicates(ctx context.Context) ApiFindDuplicatesRequest

	FindDuplicatesExecute(r ApiFindDuplicatesRequest) (*DuplicatesResponse, *http.Response, error)

	SuggestedDedupThreshold(ctx context.Context) ApiSuggestedDedupThresholdRequest

	SuggestedDedupThresholdExecute(r ApiSuggestedDedupThresholdRequest) (interface{}, *http.Response, error)
}

type DuplicatesAPIService service

type ApiFindDuplicatesRequest struct {
	ctx context.Context
	ApiService DuplicatesAPI
	duplicatesRequest *DuplicatesRequest
}

func (r ApiFindDuplicatesRequest) DuplicatesRequest(duplicatesRequest DuplicatesRequest) ApiFindDuplicatesRequest {
	r.duplicatesRequest = &duplicatesRequest
	return r
}

func (r ApiFindDuplicatesRequest) Execute() (*DuplicatesResponse, *http.Response, error) {
	return r.ApiService.FindDuplicatesExecute(r)
}

func (a *DuplicatesAPIService) FindDuplicates(ctx context.Context) ApiFindDuplicatesRequest {
	return ApiFindDuplicatesRequest{
		ApiService: a,
		ctx: ctx,
	}
}

func (a *DuplicatesAPIService) FindDuplicatesExecute(r ApiFindDuplicatesRequest) (*DuplicatesResponse, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *DuplicatesResponse
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "DuplicatesAPIService.FindDuplicates")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/v1/duplicates"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.duplicatesRequest == nil {
		return localVarReturnValue, nil, reportError("duplicatesRequest is required and must be specified")
	}

	localVarHTTPContentTypes := []string{"application/json"}

	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	localVarHTTPHeaderAccepts := []string{"application/json"}

	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	localVarPostBody = r.duplicatesRequest
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 422 {
			var v HTTPValidationError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}

type ApiSuggestedDedupThresholdRequest struct {
	ctx context.Context
	ApiService DuplicatesAPI
	customerId *string
}

func (r ApiSuggestedDedupThresholdRequest) CustomerId(customerId string) ApiSuggestedDedupThresholdRequest {
	r.customerId = &customerId
	return r
}

func (r ApiSuggestedDedupThresholdRequest) Execute() (interface{}, *http.Response, error) {
	return r.ApiService.SuggestedDedupThresholdExecute(r)
}

func (a *DuplicatesAPIService) SuggestedDedupThreshold(ctx context.Context) ApiSuggestedDedupThresholdRequest {
	return ApiSuggestedDedupThresholdRequest{
		ApiService: a,
		ctx: ctx,
	}
}

func (a *DuplicatesAPIService) SuggestedDedupThresholdExecute(r ApiSuggestedDedupThresholdRequest) (interface{}, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodGet
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  interface{}
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "DuplicatesAPIService.SuggestedDedupThreshold")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/v1/duplicates/suggested-threshold"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}

	if r.customerId != nil {
		parameterAddToHeaderOrQuery(localVarQueryParams, "customer_id", r.customerId, "form", "")
	}
	localVarHTTPContentTypes := []string{}

	localVarHTTPContentType := selectHeaderContentType(localVarHTTPContentTypes)
	if localVarHTTPContentType != "" {
		localVarHeaderParams["Content-Type"] = localVarHTTPContentType
	}

	localVarHTTPHeaderAccepts := []string{"application/json"}

	localVarHTTPHeaderAccept := selectHeaderAccept(localVarHTTPHeaderAccepts)
	if localVarHTTPHeaderAccept != "" {
		localVarHeaderParams["Accept"] = localVarHTTPHeaderAccept
	}
	req, err := a.client.prepareRequest(r.ctx, localVarPath, localVarHTTPMethod, localVarPostBody, localVarHeaderParams, localVarQueryParams, localVarFormParams, formFiles)
	if err != nil {
		return localVarReturnValue, nil, err
	}

	localVarHTTPResponse, err := a.client.callAPI(req)
	if err != nil || localVarHTTPResponse == nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	localVarBody, err := io.ReadAll(localVarHTTPResponse.Body)
	localVarHTTPResponse.Body.Close()
	localVarHTTPResponse.Body = io.NopCloser(bytes.NewBuffer(localVarBody))
	if err != nil {
		return localVarReturnValue, localVarHTTPResponse, err
	}

	if localVarHTTPResponse.StatusCode >= 300 {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: localVarHTTPResponse.Status,
		}
		if localVarHTTPResponse.StatusCode == 422 {
			var v HTTPValidationError
			err = a.client.decode(&v, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
			if err != nil {
				newErr.error = err.Error()
				return localVarReturnValue, localVarHTTPResponse, newErr
			}
					newErr.error = formatErrorMessage(localVarHTTPResponse.Status, &v)
					newErr.model = v
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	err = a.client.decode(&localVarReturnValue, localVarBody, localVarHTTPResponse.Header.Get("Content-Type"))
	if err != nil {
		newErr := &GenericOpenAPIError{
			body:  localVarBody,
			error: err.Error(),
		}
		return localVarReturnValue, localVarHTTPResponse, newErr
	}

	return localVarReturnValue, localVarHTTPResponse, nil
}
