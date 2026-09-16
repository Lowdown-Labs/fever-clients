/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface TranscriptSegment {

    endMs: number | null;

    seq: number;

    startMs: number | null;

    text: string | null;
}

export function instanceOfTranscriptSegment(value: object): value is TranscriptSegment {
    if ((!('endMs' in (value as Record<string, any>)) && !('end_ms' in (value as Record<string, any>))) || ((value as Record<string, any>)['endMs'] === undefined && (value as Record<string, any>)['end_ms'] === undefined)) return false;
    if (!('seq' in value) || value['seq'] === undefined) return false;
    if ((!('startMs' in (value as Record<string, any>)) && !('start_ms' in (value as Record<string, any>))) || ((value as Record<string, any>)['startMs'] === undefined && (value as Record<string, any>)['start_ms'] === undefined)) return false;
    if (!('text' in value) || value['text'] === undefined) return false;
    return true;
}

export function TranscriptSegmentFromJSON(json: any): TranscriptSegment {
    return TranscriptSegmentFromJSONTyped(json, false);
}

export function TranscriptSegmentFromJSONTyped(json: any, ignoreDiscriminator: boolean): TranscriptSegment {
    if (json == null) {
        return json;
    }
    return {

        'endMs': json['end_ms'],
        'seq': json['seq'],
        'startMs': json['start_ms'],
        'text': json['text'],
    };
}

export function TranscriptSegmentToJSON(json: any): TranscriptSegment {
    return TranscriptSegmentToJSONTyped(json, false);
}

export function TranscriptSegmentToJSONTyped(value?: TranscriptSegment | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'end_ms': value['endMs'],
        'seq': value['seq'],
        'start_ms': value['startMs'],
        'text': value['text'],
    };
}

