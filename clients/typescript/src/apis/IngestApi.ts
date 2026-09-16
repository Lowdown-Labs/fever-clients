/* tslint:disable */
/* eslint-disable */

import * as runtime from '../runtime';
import {
    type HTTPValidationError,
    HTTPValidationErrorFromJSON,
    HTTPValidationErrorToJSON,
} from '../models/HTTPValidationError';
import {
    type IngestRequest,
    IngestRequestFromJSON,
    IngestRequestToJSON,
} from '../models/IngestRequest';
import {
    type IngestResult,
    IngestResultFromJSON,
    IngestResultToJSON,
} from '../models/IngestResult';

export interface IngestMediaRequest {

    ingestRequest: IngestRequest;
}

export class IngestApi extends runtime.BaseAPI {

    async ingestMediaRequestOpts(requestParameters: IngestMediaRequest): Promise<runtime.RequestOpts> {
        if (requestParameters['ingestRequest'] == null) {
            throw new runtime.RequiredError(
                'ingestRequest',
                'Required parameter "ingestRequest" was null or undefined when calling ingestMedia().'
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

        let urlPath = `/v1/media`;

        return {
            path: urlPath,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: IngestRequestToJSON(requestParameters['ingestRequest']),
        };
    }

    async ingestMediaRaw(requestParameters: IngestMediaRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<IngestResult>> {
        const requestOptions = await this.ingestMediaRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => IngestResultFromJSON(jsonValue));
    }

    async ingestMedia(requestParameters: IngestMediaRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<IngestResult> {
        const response = await this.ingestMediaRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
