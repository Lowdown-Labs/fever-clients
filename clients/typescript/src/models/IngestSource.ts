/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface IngestSource {

    customerId?: string | null;

    s3Uri: string;

    targetRes?: number | null;
}

export function instanceOfIngestSource(value: object): value is IngestSource {
    if ((!('s3Uri' in (value as Record<string, any>)) && !('s3_uri' in (value as Record<string, any>))) || ((value as Record<string, any>)['s3Uri'] === undefined && (value as Record<string, any>)['s3_uri'] === undefined)) return false;
    return true;
}

export function IngestSourceFromJSON(json: any): IngestSource {
    return IngestSourceFromJSONTyped(json, false);
}

export function IngestSourceFromJSONTyped(json: any, ignoreDiscriminator: boolean): IngestSource {
    if (json == null) {
        return json;
    }
    return {

        'customerId': json['customer_id'] === undefined ? undefined : json['customer_id'] === null ? null : json['customer_id'],
        's3Uri': json['s3_uri'],
        'targetRes': json['target_res'] === undefined ? undefined : json['target_res'] === null ? null : json['target_res'],
    };
}

export function IngestSourceToJSON(json: any): IngestSource {
    return IngestSourceToJSONTyped(json, false);
}

export function IngestSourceToJSONTyped(value?: IngestSource | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'customer_id': value['customerId'],
        's3_uri': value['s3Uri'],
        'target_res': value['targetRes'],
    };
}

