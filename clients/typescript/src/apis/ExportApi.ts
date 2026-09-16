/* tslint:disable */
/* eslint-disable */

import * as runtime from '../runtime';
import {
    type ExportRequest,
    ExportRequestFromJSON,
    ExportRequestToJSON,
} from '../models/ExportRequest';
import {
    type ExportResult,
    ExportResultFromJSON,
    ExportResultToJSON,
} from '../models/ExportResult';
import {
    type HTTPValidationError,
    HTTPValidationErrorFromJSON,
    HTTPValidationErrorToJSON,
} from '../models/HTTPValidationError';
import {
    type ImportRequest,
    ImportRequestFromJSON,
    ImportRequestToJSON,
} from '../models/ImportRequest';
import {
    type ImportResult,
    ImportResultFromJSON,
    ImportResultToJSON,
} from '../models/ImportResult';

export interface ExportTenantRequest {

    exportRequest: ExportRequest;
}

export interface ImportTenantRequest {

    importRequest: ImportRequest;
}

export class ExportApi extends runtime.BaseAPI {

    async exportTenantRequestOpts(requestParameters: ExportTenantRequest): Promise<runtime.RequestOpts> {
        if (requestParameters['exportRequest'] == null) {
            throw new runtime.RequiredError(
                'exportRequest',
                'Required parameter "exportRequest" was null or undefined when calling exportTenant().'
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

        let urlPath = `/v1/export`;

        return {
            path: urlPath,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ExportRequestToJSON(requestParameters['exportRequest']),
        };
    }

    async exportTenantRaw(requestParameters: ExportTenantRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ExportResult>> {
        const requestOptions = await this.exportTenantRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ExportResultFromJSON(jsonValue));
    }

    async exportTenant(requestParameters: ExportTenantRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ExportResult> {
        const response = await this.exportTenantRaw(requestParameters, initOverrides);
        return await response.value();
    }

    async importTenantRequestOpts(requestParameters: ImportTenantRequest): Promise<runtime.RequestOpts> {
        if (requestParameters['importRequest'] == null) {
            throw new runtime.RequiredError(
                'importRequest',
                'Required parameter "importRequest" was null or undefined when calling importTenant().'
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

        let urlPath = `/v1/import`;

        return {
            path: urlPath,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ImportRequestToJSON(requestParameters['importRequest']),
        };
    }

    async importTenantRaw(requestParameters: ImportTenantRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ImportResult>> {
        const requestOptions = await this.importTenantRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ImportResultFromJSON(jsonValue));
    }

    async importTenant(requestParameters: ImportTenantRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ImportResult> {
        const response = await this.importTenantRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
