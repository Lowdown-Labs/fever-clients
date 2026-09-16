/* tslint:disable */
/* eslint-disable */

import * as runtime from '../runtime';
import {
    type HTTPValidationError,
    HTTPValidationErrorFromJSON,
    HTTPValidationErrorToJSON,
} from '../models/HTTPValidationError';
import {
    type Job,
    JobFromJSON,
    JobToJSON,
} from '../models/Job';

export interface CancelJobRequest {

    jobId: number;
}

export interface GetJobRequest {

    jobId: number;
}

export class JobsApi extends runtime.BaseAPI {

    async cancelJobRequestOpts(requestParameters: CancelJobRequest): Promise<runtime.RequestOpts> {
        if (requestParameters['jobId'] == null) {
            throw new runtime.RequiredError(
                'jobId',
                'Required parameter "jobId" was null or undefined when calling cancelJob().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("bearerAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }

        let urlPath = `/v1/jobs/{job_id}/cancel`;
        urlPath = urlPath.replace('{job_id}', encodeURIComponent(String(requestParameters['jobId'])));

        return {
            path: urlPath,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
        };
    }

    async cancelJobRaw(requestParameters: CancelJobRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Job>> {
        const requestOptions = await this.cancelJobRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => JobFromJSON(jsonValue));
    }

    async cancelJob(requestParameters: CancelJobRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Job> {
        const response = await this.cancelJobRaw(requestParameters, initOverrides);
        return await response.value();
    }

    async getJobRequestOpts(requestParameters: GetJobRequest): Promise<runtime.RequestOpts> {
        if (requestParameters['jobId'] == null) {
            throw new runtime.RequiredError(
                'jobId',
                'Required parameter "jobId" was null or undefined when calling getJob().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("bearerAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }

        let urlPath = `/v1/jobs/{job_id}`;
        urlPath = urlPath.replace('{job_id}', encodeURIComponent(String(requestParameters['jobId'])));

        return {
            path: urlPath,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        };
    }

    async getJobRaw(requestParameters: GetJobRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Job>> {
        const requestOptions = await this.getJobRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => JobFromJSON(jsonValue));
    }

    async getJob(requestParameters: GetJobRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Job> {
        const response = await this.getJobRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
