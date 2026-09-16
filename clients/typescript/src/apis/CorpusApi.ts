/* tslint:disable */
/* eslint-disable */

import * as runtime from '../runtime';
import {
    type CorpusStats,
    CorpusStatsFromJSON,
    CorpusStatsToJSON,
} from '../models/CorpusStats';
import {
    type HTTPValidationError,
    HTTPValidationErrorFromJSON,
    HTTPValidationErrorToJSON,
} from '../models/HTTPValidationError';

export interface CorpusStatsRequest {

    customerId?: string | null;
}

export class CorpusApi extends runtime.BaseAPI {

    async corpusStatsRequestOpts(requestParameters: CorpusStatsRequest): Promise<runtime.RequestOpts> {
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

        let urlPath = `/v1/corpus`;

        return {
            path: urlPath,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        };
    }

    async corpusStatsRaw(requestParameters: CorpusStatsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<CorpusStats>> {
        const requestOptions = await this.corpusStatsRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => CorpusStatsFromJSON(jsonValue));
    }

    async corpusStats(requestParameters: CorpusStatsRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<CorpusStats> {
        const response = await this.corpusStatsRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
