/* tslint:disable */
/* eslint-disable */

import * as runtime from '../runtime';
import {
    type HTTPValidationError,
    HTTPValidationErrorFromJSON,
    HTTPValidationErrorToJSON,
} from '../models/HTTPValidationError';
import {
    type SearchHit,
    SearchHitFromJSON,
    SearchHitToJSON,
} from '../models/SearchHit';
import {
    type SearchRequest,
    SearchRequestFromJSON,
    SearchRequestToJSON,
} from '../models/SearchRequest';

export interface SearchOperationRequest {

    searchRequest: SearchRequest;
}

export class SearchApi extends runtime.BaseAPI {

    async searchRequestOpts(requestParameters: SearchOperationRequest): Promise<runtime.RequestOpts> {
        if (requestParameters['searchRequest'] == null) {
            throw new runtime.RequiredError(
                'searchRequest',
                'Required parameter "searchRequest" was null or undefined when calling search().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("bearerAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }

        let urlPath = `/v1/search`;

        return {
            path: urlPath,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: SearchRequestToJSON(requestParameters['searchRequest']),
        };
    }

    async searchRaw(requestParameters: SearchOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<SearchHit>>> {
        const requestOptions = await this.searchRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(SearchHitFromJSON));
    }

    async search(requestParameters: SearchOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<SearchHit>> {
        const response = await this.searchRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
