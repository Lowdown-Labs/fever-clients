/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface ImportRequest {

    customerId?: string | null;

    s3Uri: string;
}

export function instanceOfImportRequest(value: object): value is ImportRequest {
    if ((!('s3Uri' in (value as Record<string, any>)) && !('s3_uri' in (value as Record<string, any>))) || ((value as Record<string, any>)['s3Uri'] === undefined && (value as Record<string, any>)['s3_uri'] === undefined)) return false;
    return true;
}

export function ImportRequestFromJSON(json: any): ImportRequest {
    return ImportRequestFromJSONTyped(json, false);
}

export function ImportRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ImportRequest {
    if (json == null) {
        return json;
    }
    return {

        'customerId': json['customer_id'] === undefined ? undefined : json['customer_id'] === null ? null : json['customer_id'],
        's3Uri': json['s3_uri'],
    };
}

export function ImportRequestToJSON(json: any): ImportRequest {
    return ImportRequestToJSONTyped(json, false);
}

export function ImportRequestToJSONTyped(value?: ImportRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'customer_id': value['customerId'],
        's3_uri': value['s3Uri'],
    };
}

