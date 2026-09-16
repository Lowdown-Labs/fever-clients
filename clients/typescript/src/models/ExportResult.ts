/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface ExportResult {

    exported: number;

    s3Uri: string;
}

export function instanceOfExportResult(value: object): value is ExportResult {
    if (!('exported' in value) || value['exported'] === undefined) return false;
    if ((!('s3Uri' in (value as Record<string, any>)) && !('s3_uri' in (value as Record<string, any>))) || ((value as Record<string, any>)['s3Uri'] === undefined && (value as Record<string, any>)['s3_uri'] === undefined)) return false;
    return true;
}

export function ExportResultFromJSON(json: any): ExportResult {
    return ExportResultFromJSONTyped(json, false);
}

export function ExportResultFromJSONTyped(json: any, ignoreDiscriminator: boolean): ExportResult {
    if (json == null) {
        return json;
    }
    return {

        'exported': json['exported'],
        's3Uri': json['s3_uri'],
    };
}

export function ExportResultToJSON(json: any): ExportResult {
    return ExportResultToJSONTyped(json, false);
}

export function ExportResultToJSONTyped(value?: ExportResult | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'exported': value['exported'],
        's3_uri': value['s3Uri'],
    };
}

