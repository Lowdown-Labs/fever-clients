/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface IngestMedia {

    caption?: string | null;

    customerId?: string | null;

    data?: string | null;

    metadata?: { [key: string]: any; } | null;

    stripExif?: boolean;

    tags?: Array<string> | null;

    url?: string | null;
}

export function instanceOfIngestMedia(value: object): value is IngestMedia {
    return true;
}

export function IngestMediaFromJSON(json: any): IngestMedia {
    return IngestMediaFromJSONTyped(json, false);
}

export function IngestMediaFromJSONTyped(json: any, ignoreDiscriminator: boolean): IngestMedia {
    if (json == null) {
        return json;
    }
    return {

        'caption': json['caption'] === undefined ? undefined : json['caption'] === null ? null : json['caption'],
        'customerId': json['customer_id'] === undefined ? undefined : json['customer_id'] === null ? null : json['customer_id'],
        'data': json['data'] === undefined ? undefined : json['data'] === null ? null : json['data'],
        'metadata': json['metadata'] === undefined ? undefined : json['metadata'] === null ? null : json['metadata'],
        'stripExif': json['strip_exif'] == null ? undefined : json['strip_exif'],
        'tags': json['tags'] === undefined ? undefined : json['tags'] === null ? null : json['tags'],
        'url': json['url'] === undefined ? undefined : json['url'] === null ? null : json['url'],
    };
}

export function IngestMediaToJSON(json: any): IngestMedia {
    return IngestMediaToJSONTyped(json, false);
}

export function IngestMediaToJSONTyped(value?: IngestMedia | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'caption': value['caption'],
        'customer_id': value['customerId'],
        'data': value['data'],
        'metadata': value['metadata'],
        'strip_exif': value['stripExif'],
        'tags': value['tags'],
        'url': value['url'],
    };
}

