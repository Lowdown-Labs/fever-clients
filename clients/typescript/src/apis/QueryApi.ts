/* tslint:disable */
/* eslint-disable */

import * as runtime from '../runtime';
import {
    type HTTPValidationError,
    HTTPValidationErrorFromJSON,
    HTTPValidationErrorToJSON,
} from '../models/HTTPValidationError';
import {
    type QueryRequest,
    QueryRequestFromJSON,
    QueryRequestToJSON,
} from '../models/QueryRequest';
import {
    type QueryResult,
    QueryResultFromJSON,
    QueryResultToJSON,
} from '../models/QueryResult';

export interface QueryOperationRequest {

    queryRequest: QueryRequest;
}

export class QueryApi extends runtime.BaseAPI {

    async queryRequestOpts(requestParameters: QueryOperationRequest): Promise<runtime.RequestOpts> {
        if (requestParameters['queryRequest'] == null) {
            throw new runtime.RequiredError(
                'queryRequest',
                'Required parameter "queryRequest" was null or undefined when calling query().'
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

        let urlPath = `/v1/query`;

        return {
            path: urlPath,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: QueryRequestToJSON(requestParameters['queryRequest']),
        };
    }

    async queryRaw(requestParameters: QueryOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<QueryResult>> {
        const requestOptions = await this.queryRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => QueryResultFromJSON(jsonValue));
    }

    async query(requestParameters: QueryOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<QueryResult> {
        const response = await this.queryRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
