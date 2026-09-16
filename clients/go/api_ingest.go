package fever

import (
	"bytes"
	"context"
	"io"
	"net/http"
	"net/url"
)

type IngestAPI interface {

	IngestMedia(ctx context.Context) ApiIngestMediaRequest

	IngestMediaExecute(r ApiIngestMediaRequest) (*IngestResult, *http.Response, error)
}

type IngestAPIService service

type ApiIngestMediaRequest struct {
	ctx context.Context
	ApiService IngestAPI
	ingestRequest *IngestRequest
}

func (r ApiIngestMediaRequest) IngestRequest(ingestRequest IngestRequest) ApiIngestMediaRequest {
	r.ingestRequest = &ingestRequest
	return r
}

func (r ApiIngestMediaRequest) Execute() (*IngestResult, *http.Response, error) {
	return r.ApiService.IngestMediaExecute(r)
}

func (a *IngestAPIService) IngestMedia(ctx context.Context) ApiIngestMediaRequest {
	return ApiIngestMediaRequest{
		ApiService: a,
		ctx: ctx,
	}
}

func (a *IngestAPIService) IngestMediaExecute(r ApiIngestMediaRequest) (*IngestResult, *http.Response, error) {
	var (
		localVarHTTPMethod   = http.MethodPost
		localVarPostBody     interface{}
		formFiles            []formFile
		localVarReturnValue  *IngestResult
	)

	localBasePath, err := a.client.cfg.ServerURLWithContext(r.ctx, "IngestAPIService.IngestMedia")
	if err != nil {
		return localVarReturnValue, nil, &GenericOpenAPIError{error: err.Error()}
	}

	localVarPath := localBasePath + "/v1/media"

	localVarHeaderParams := make(map[string]string)
	localVarQueryParams := url.Values{}
	localVarFormParams := url.Values{}
	if r.ingestRequest == nil {
		return localVarReturnValue, nil, reportError("ingestRequest is required and must be specified")
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
	localVarPostBody = r.ingestRequest
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
