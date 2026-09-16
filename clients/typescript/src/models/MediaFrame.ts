/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface MediaFrame {

    frameNo: number;

    tsMs: number;
}

export function instanceOfMediaFrame(value: object): value is MediaFrame {
    if ((!('frameNo' in (value as Record<string, any>)) && !('frame_no' in (value as Record<string, any>))) || ((value as Record<string, any>)['frameNo'] === undefined && (value as Record<string, any>)['frame_no'] === undefined)) return false;
    if ((!('tsMs' in (value as Record<string, any>)) && !('ts_ms' in (value as Record<string, any>))) || ((value as Record<string, any>)['tsMs'] === undefined && (value as Record<string, any>)['ts_ms'] === undefined)) return false;
    return true;
}

export function MediaFrameFromJSON(json: any): MediaFrame {
    return MediaFrameFromJSONTyped(json, false);
}

export function MediaFrameFromJSONTyped(json: any, ignoreDiscriminator: boolean): MediaFrame {
    if (json == null) {
        return json;
    }
    return {

        'frameNo': json['frame_no'],
        'tsMs': json['ts_ms'],
    };
}

export function MediaFrameToJSON(json: any): MediaFrame {
    return MediaFrameToJSONTyped(json, false);
}

export function MediaFrameToJSONTyped(value?: MediaFrame | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'frame_no': value['frameNo'],
        'ts_ms': value['tsMs'],
    };
}

