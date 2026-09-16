/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface ImportResult {

    imported: number;

    s3Uri: string;
}

export function instanceOfImportResult(value: object): value is ImportResult {
    if (!('imported' in value) || value['imported'] === undefined) return false;
    if ((!('s3Uri' in (value as Record<string, any>)) && !('s3_uri' in (value as Record<string, any>))) || ((value as Record<string, any>)['s3Uri'] === undefined && (value as Record<string, any>)['s3_uri'] === undefined)) return false;
    return true;
}

export function ImportResultFromJSON(json: any): ImportResult {
    return ImportResultFromJSONTyped(json, false);
}

export function ImportResultFromJSONTyped(json: any, ignoreDiscriminator: boolean): ImportResult {
    if (json == null) {
        return json;
    }
    return {

        'imported': json['imported'],
        's3Uri': json['s3_uri'],
    };
}

export function ImportResultToJSON(json: any): ImportResult {
    return ImportResultToJSONTyped(json, false);
}

export function ImportResultToJSONTyped(value?: ImportResult | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'imported': value['imported'],
        's3_uri': value['s3Uri'],
    };
}

