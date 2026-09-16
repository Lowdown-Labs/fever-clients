/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface IngestedMedia {

    blobId: number;

    externalRef?: string | null;
}

export function instanceOfIngestedMedia(value: object): value is IngestedMedia {
    if ((!('blobId' in (value as Record<string, any>)) && !('blob_id' in (value as Record<string, any>))) || ((value as Record<string, any>)['blobId'] === undefined && (value as Record<string, any>)['blob_id'] === undefined)) return false;
    return true;
}

export function IngestedMediaFromJSON(json: any): IngestedMedia {
    return IngestedMediaFromJSONTyped(json, false);
}

export function IngestedMediaFromJSONTyped(json: any, ignoreDiscriminator: boolean): IngestedMedia {
    if (json == null) {
        return json;
    }
    return {

        'blobId': json['blob_id'],
        'externalRef': json['external_ref'] === undefined ? undefined : json['external_ref'] === null ? null : json['external_ref'],
    };
}

export function IngestedMediaToJSON(json: any): IngestedMedia {
    return IngestedMediaToJSONTyped(json, false);
}

export function IngestedMediaToJSONTyped(value?: IngestedMedia | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'blob_id': value['blobId'],
        'external_ref': value['externalRef'],
    };
}

