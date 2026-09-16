/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface ExportRequest {

    customerId?: string | null;

    format?: ExportRequestFormatEnum;

    kind?: ExportRequestKindEnum | null;

    s3Uri: string;

    tag?: string | null;
}

export const ExportRequestFormatEnum = {
    Ndjson: 'ndjson',
    Parquet: 'parquet',
} as const;
export type ExportRequestFormatEnum = typeof ExportRequestFormatEnum[keyof typeof ExportRequestFormatEnum];

export const ExportRequestKindEnum = {
    Image: 'image',
    Video: 'video',
    Audio: 'audio',
    Pdf: 'pdf',
    Doc: 'doc',
    Note: 'note',
} as const;
export type ExportRequestKindEnum = typeof ExportRequestKindEnum[keyof typeof ExportRequestKindEnum];

export function instanceOfExportRequest(value: object): value is ExportRequest {
    if ((!('s3Uri' in (value as Record<string, any>)) && !('s3_uri' in (value as Record<string, any>))) || ((value as Record<string, any>)['s3Uri'] === undefined && (value as Record<string, any>)['s3_uri'] === undefined)) return false;
    return true;
}

export function ExportRequestFromJSON(json: any): ExportRequest {
    return ExportRequestFromJSONTyped(json, false);
}

export function ExportRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): ExportRequest {
    if (json == null) {
        return json;
    }
    return {

        'customerId': json['customer_id'] === undefined ? undefined : json['customer_id'] === null ? null : json['customer_id'],
        'format': json['format'] == null ? undefined : json['format'],
        'kind': json['kind'] === undefined ? undefined : json['kind'] === null ? null : json['kind'],
        's3Uri': json['s3_uri'],
        'tag': json['tag'] === undefined ? undefined : json['tag'] === null ? null : json['tag'],
    };
}

export function ExportRequestToJSON(json: any): ExportRequest {
    return ExportRequestToJSONTyped(json, false);
}

export function ExportRequestToJSONTyped(value?: ExportRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'customer_id': value['customerId'],
        'format': value['format'],
        'kind': value['kind'],
        's3_uri': value['s3Uri'],
        'tag': value['tag'],
    };
}

