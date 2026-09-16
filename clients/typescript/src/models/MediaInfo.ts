/* tslint:disable */
/* eslint-disable */

import { mapValues, parseDate, parseDateTime, serializeDate, serializeDateTime } from '../runtime';

export interface MediaInfo {

    blobId: number;

    caption?: string | null;

    capturedAt?: Date | null;

    customerId?: string | null;

    device?: string | null;

    externalRef?: string | null;

    frameCount?: number;

    gpsLat?: number | null;

    gpsLon?: number | null;

    kind?: MediaInfoKindEnum | null;

    metadata?: { [key: string]: any; } | null;

    ocrText?: string | null;

    synthetic?: number | null;

    tags?: Array<string>;

    transcriptSegments?: number;
}

export const MediaInfoKindEnum = {
    Image: 'image',
    Video: 'video',
    Audio: 'audio',
    Pdf: 'pdf',
    Doc: 'doc',
    Note: 'note',
} as const;
export type MediaInfoKindEnum = typeof MediaInfoKindEnum[keyof typeof MediaInfoKindEnum];

export function instanceOfMediaInfo(value: object): value is MediaInfo {
    if ((!('blobId' in (value as Record<string, any>)) && !('blob_id' in (value as Record<string, any>))) || ((value as Record<string, any>)['blobId'] === undefined && (value as Record<string, any>)['blob_id'] === undefined)) return false;
    return true;
}

export function MediaInfoFromJSON(json: any): MediaInfo {
    return MediaInfoFromJSONTyped(json, false);
}

export function MediaInfoFromJSONTyped(json: any, ignoreDiscriminator: boolean): MediaInfo {
    if (json == null) {
        return json;
    }
    return {

        'blobId': json['blob_id'],
        'caption': json['caption'] === undefined ? undefined : json['caption'] === null ? null : json['caption'],
        'capturedAt': json['captured_at'] === undefined ? undefined : json['captured_at'] === null ? null : (parseDateTime(json['captured_at'])),
        'customerId': json['customer_id'] === undefined ? undefined : json['customer_id'] === null ? null : json['customer_id'],
        'device': json['device'] === undefined ? undefined : json['device'] === null ? null : json['device'],
        'externalRef': json['external_ref'] === undefined ? undefined : json['external_ref'] === null ? null : json['external_ref'],
        'frameCount': json['frame_count'] == null ? undefined : json['frame_count'],
        'gpsLat': json['gps_lat'] === undefined ? undefined : json['gps_lat'] === null ? null : json['gps_lat'],
        'gpsLon': json['gps_lon'] === undefined ? undefined : json['gps_lon'] === null ? null : json['gps_lon'],
        'kind': json['kind'] === undefined ? undefined : json['kind'] === null ? null : json['kind'],
        'metadata': json['metadata'] === undefined ? undefined : json['metadata'] === null ? null : json['metadata'],
        'ocrText': json['ocr_text'] === undefined ? undefined : json['ocr_text'] === null ? null : json['ocr_text'],
        'synthetic': json['synthetic'] === undefined ? undefined : json['synthetic'] === null ? null : json['synthetic'],
        'tags': json['tags'] == null ? undefined : json['tags'],
        'transcriptSegments': json['transcript_segments'] == null ? undefined : json['transcript_segments'],
    };
}

export function MediaInfoToJSON(json: any): MediaInfo {
    return MediaInfoToJSONTyped(json, false);
}

export function MediaInfoToJSONTyped(value?: MediaInfo | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'blob_id': value['blobId'],
        'caption': value['caption'],
        'captured_at': value['capturedAt'] == null ? value['capturedAt'] : serializeDateTime(value['capturedAt']),
        'customer_id': value['customerId'],
        'device': value['device'],
        'external_ref': value['externalRef'],
        'frame_count': value['frameCount'],
        'gps_lat': value['gpsLat'],
        'gps_lon': value['gpsLon'],
        'kind': value['kind'],
        'metadata': value['metadata'],
        'ocr_text': value['ocrText'],
        'synthetic': value['synthetic'],
        'tags': value['tags'],
        'transcript_segments': value['transcriptSegments'],
    };
}

