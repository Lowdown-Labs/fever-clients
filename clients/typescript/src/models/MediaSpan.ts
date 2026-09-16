/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface MediaSpan {

    endMs: number;

    startMs: number;

    text?: string | null;
}

export function instanceOfMediaSpan(value: object): value is MediaSpan {
    if ((!('endMs' in (value as Record<string, any>)) && !('end_ms' in (value as Record<string, any>))) || ((value as Record<string, any>)['endMs'] === undefined && (value as Record<string, any>)['end_ms'] === undefined)) return false;
    if ((!('startMs' in (value as Record<string, any>)) && !('start_ms' in (value as Record<string, any>))) || ((value as Record<string, any>)['startMs'] === undefined && (value as Record<string, any>)['start_ms'] === undefined)) return false;
    return true;
}

export function MediaSpanFromJSON(json: any): MediaSpan {
    return MediaSpanFromJSONTyped(json, false);
}

export function MediaSpanFromJSONTyped(json: any, ignoreDiscriminator: boolean): MediaSpan {
    if (json == null) {
        return json;
    }
    return {

        'endMs': json['end_ms'],
        'startMs': json['start_ms'],
        'text': json['text'] === undefined ? undefined : json['text'] === null ? null : json['text'],
    };
}

export function MediaSpanToJSON(json: any): MediaSpan {
    return MediaSpanToJSONTyped(json, false);
}

export function MediaSpanToJSONTyped(value?: MediaSpan | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'end_ms': value['endMs'],
        'start_ms': value['startMs'],
        'text': value['text'],
    };
}

