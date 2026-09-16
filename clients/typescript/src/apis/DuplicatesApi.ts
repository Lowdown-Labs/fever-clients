/* tslint:disable */
/* eslint-disable */

import * as runtime from '../runtime';
import {
    type DuplicatesRequest,
    DuplicatesRequestFromJSON,
    DuplicatesRequestToJSON,
} from '../models/DuplicatesRequest';
import {
    type DuplicatesResponse,
    DuplicatesResponseFromJSON,
    DuplicatesResponseToJSON,
} from '../models/DuplicatesResponse';
import {
    type HTTPValidationError,
    HTTPValidationErrorFromJSON,
    HTTPValidationErrorToJSON,
} from '../models/HTTPValidationError';

export interface FindDuplicatesRequest {

    duplicatesRequest: DuplicatesRequest;
}

export interface SuggestedDedupThresholdRequest {

    customerId?: string | null;
}

export class DuplicatesApi extends runtime.BaseAPI {

    async findDuplicatesRequestOpts(requestParameters: FindDuplicatesRequest): Promise<runtime.RequestOpts> {
        if (requestParameters['duplicatesRequest'] == null) {
            throw new runtime.RequiredError(
                'duplicatesRequest',
                'Required parameter "duplicatesRequest" was null or undefined when calling findDuplicates().'
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

        let urlPath = `/v1/duplicates`;

        return {
            path: urlPath,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: DuplicatesRequestToJSON(requestParameters['duplicatesRequest']),
        };
    }

    async findDuplicatesRaw(requestParameters: FindDuplicatesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<DuplicatesResponse>> {
        const requestOptions = await this.findDuplicatesRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => DuplicatesResponseFromJSON(jsonValue));
    }

    async findDuplicates(requestParameters: FindDuplicatesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<DuplicatesResponse> {
        const response = await this.findDuplicatesRaw(requestParameters, initOverrides);
        return await response.value();
    }

    async suggestedDedupThresholdRequestOpts(requestParameters: SuggestedDedupThresholdRequest): Promise<runtime.RequestOpts> {
        const queryParameters: any = {};

        if (requestParameters['customerId'] != null) {
            queryParameters['customer_id'] = requestParameters['customerId'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("bearerAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }

        let urlPath = `/v1/duplicates/suggested-threshold`;

        return {
            path: urlPath,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        };
    }

    async suggestedDedupThresholdRaw(requestParameters: SuggestedDedupThresholdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<any>> {
        const requestOptions = await this.suggestedDedupThresholdRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        if (this.isJsonMime(response.headers.get('content-type'))) {
            return new runtime.JSONApiResponse<any>(response);
        } else {
            return new runtime.TextApiResponse(response) as any;
        }
    }

    async suggestedDedupThreshold(requestParameters: SuggestedDedupThresholdRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<any> {
        const response = await this.suggestedDedupThresholdRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
