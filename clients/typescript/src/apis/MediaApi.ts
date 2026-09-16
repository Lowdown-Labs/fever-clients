/* tslint:disable */
/* eslint-disable */

import * as runtime from '../runtime';
import {
    type HTTPValidationError,
    HTTPValidationErrorFromJSON,
    HTTPValidationErrorToJSON,
} from '../models/HTTPValidationError';
import {
    type MediaFormats,
    MediaFormatsFromJSON,
    MediaFormatsToJSON,
} from '../models/MediaFormats';
import {
    type MediaFrame,
    MediaFrameFromJSON,
    MediaFrameToJSON,
} from '../models/MediaFrame';
import {
    type MediaInfo,
    MediaInfoFromJSON,
    MediaInfoToJSON,
} from '../models/MediaInfo';
import {
    type TranscriptSegment,
    TranscriptSegmentFromJSON,
    TranscriptSegmentToJSON,
} from '../models/TranscriptSegment';

export interface GetMediaBytesRequest {

    blobId: number;

    maxDim?: number;

    waveform?: number;
}

export interface GetMediaInfoRequest {

    blobId: number;

    customerId?: string | null;
}

export interface ListMediaFramesRequest {

    blobId: number;

    customerId?: string | null;
}

export interface ListMediaTranscriptRequest {

    blobId: number;

    customerId?: string | null;
}

export class MediaApi extends runtime.BaseAPI {

    async getMediaBytesRequestOpts(requestParameters: GetMediaBytesRequest): Promise<runtime.RequestOpts> {
        if (requestParameters['blobId'] == null) {
            throw new runtime.RequiredError(
                'blobId',
                'Required parameter "blobId" was null or undefined when calling getMediaBytes().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['maxDim'] != null) {
            queryParameters['max_dim'] = requestParameters['maxDim'];
        }

        if (requestParameters['waveform'] != null) {
            queryParameters['waveform'] = requestParameters['waveform'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("bearerAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }

        let urlPath = `/v1/media/{blob_id}/bytes`;
        urlPath = urlPath.replace('{blob_id}', encodeURIComponent(String(requestParameters['blobId'])));

        return {
            path: urlPath,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        };
    }

    async getMediaBytesRaw(requestParameters: GetMediaBytesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<any>> {
        const requestOptions = await this.getMediaBytesRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        if (this.isJsonMime(response.headers.get('content-type'))) {
            return new runtime.JSONApiResponse<any>(response);
        } else {
            return new runtime.TextApiResponse(response) as any;
        }
    }

    async getMediaBytes(requestParameters: GetMediaBytesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<any> {
        const response = await this.getMediaBytesRaw(requestParameters, initOverrides);
        return await response.value();
    }

    async getMediaInfoRequestOpts(requestParameters: GetMediaInfoRequest): Promise<runtime.RequestOpts> {
        if (requestParameters['blobId'] == null) {
            throw new runtime.RequiredError(
                'blobId',
                'Required parameter "blobId" was null or undefined when calling getMediaInfo().'
            );
        }

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

        let urlPath = `/v1/media/{blob_id}`;
        urlPath = urlPath.replace('{blob_id}', encodeURIComponent(String(requestParameters['blobId'])));

        return {
            path: urlPath,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        };
    }

    async getMediaInfoRaw(requestParameters: GetMediaInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<MediaInfo>> {
        const requestOptions = await this.getMediaInfoRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => MediaInfoFromJSON(jsonValue));
    }

    async getMediaInfo(requestParameters: GetMediaInfoRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<MediaInfo> {
        const response = await this.getMediaInfoRaw(requestParameters, initOverrides);
        return await response.value();
    }

    async listMediaFormatsRequestOpts(): Promise<runtime.RequestOpts> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            const token = this.configuration.accessToken;
            const tokenString = await token("bearerAuth", []);

            if (tokenString) {
                headerParameters["Authorization"] = `Bearer ${tokenString}`;
            }
        }

        let urlPath = `/v1/media/formats`;

        return {
            path: urlPath,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        };
    }

    async listMediaFormatsRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<MediaFormats>> {
        const requestOptions = await this.listMediaFormatsRequestOpts();
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => MediaFormatsFromJSON(jsonValue));
    }

    async listMediaFormats(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<MediaFormats> {
        const response = await this.listMediaFormatsRaw(initOverrides);
        return await response.value();
    }

    async listMediaFramesRequestOpts(requestParameters: ListMediaFramesRequest): Promise<runtime.RequestOpts> {
        if (requestParameters['blobId'] == null) {
            throw new runtime.RequiredError(
                'blobId',
                'Required parameter "blobId" was null or undefined when calling listMediaFrames().'
            );
        }

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

        let urlPath = `/v1/media/{blob_id}/frames`;
        urlPath = urlPath.replace('{blob_id}', encodeURIComponent(String(requestParameters['blobId'])));

        return {
            path: urlPath,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        };
    }

    async listMediaFramesRaw(requestParameters: ListMediaFramesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<MediaFrame>>> {
        const requestOptions = await this.listMediaFramesRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(MediaFrameFromJSON));
    }

    async listMediaFrames(requestParameters: ListMediaFramesRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<MediaFrame>> {
        const response = await this.listMediaFramesRaw(requestParameters, initOverrides);
        return await response.value();
    }

    async listMediaTranscriptRequestOpts(requestParameters: ListMediaTranscriptRequest): Promise<runtime.RequestOpts> {
        if (requestParameters['blobId'] == null) {
            throw new runtime.RequiredError(
                'blobId',
                'Required parameter "blobId" was null or undefined when calling listMediaTranscript().'
            );
        }

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

        let urlPath = `/v1/media/{blob_id}/transcript`;
        urlPath = urlPath.replace('{blob_id}', encodeURIComponent(String(requestParameters['blobId'])));

        return {
            path: urlPath,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        };
    }

    async listMediaTranscriptRaw(requestParameters: ListMediaTranscriptRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<TranscriptSegment>>> {
        const requestOptions = await this.listMediaTranscriptRequestOpts(requestParameters);
        const response = await this.request(requestOptions, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(TranscriptSegmentFromJSON));
    }

    async listMediaTranscript(requestParameters: ListMediaTranscriptRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<TranscriptSegment>> {
        const response = await this.listMediaTranscriptRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
