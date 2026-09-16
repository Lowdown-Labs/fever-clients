/* tslint:disable */
/* eslint-disable */

import * as runtime from '../runtime';
import {
    type Health,
    HealthFromJSON,
    HealthToJSON,
} from '../models/Health';

export class DefaultApi extends runtime.BaseAPI {

    async healthRequestOpts(): Promise<runtime.RequestOpts> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        let urlPath = `/v1/health`;

        return {
            path: urlPath,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        };
    }

    async healthRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Health>> {
        const requestOptions = await this.healthRequestOpts();
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => HealthFromJSON(jsonValue));
    }

    async health(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Health> {
        const response = await this.healthRaw(initOverrides);
        return await response.value();
    }

    async healthzHealthzGetRequestOpts(): Promise<runtime.RequestOpts> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        let urlPath = `/healthz`;

        return {
            path: urlPath,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        };
    }

    async healthzHealthzGetRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<any>> {
        const requestOptions = await this.healthzHealthzGetRequestOpts();
        const response = await this.request(requestOptions, initOverrides);

        if (this.isJsonMime(response.headers.get('content-type'))) {
            return new runtime.JSONApiResponse<any>(response);
        } else {
            return new runtime.TextApiResponse(response) as any;
        }
    }

    async healthzHealthzGet(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<any> {
        const response = await this.healthzHealthzGetRaw(initOverrides);
        return await response.value();
    }

}
