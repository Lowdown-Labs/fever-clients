/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';
import type { IngestMedia } from './IngestMedia';
import {
    IngestMediaFromJSON,
    IngestMediaFromJSONTyped,
    IngestMediaToJSON,
    IngestMediaToJSONTyped,
} from './IngestMedia';
import type { IngestSource } from './IngestSource';
import {
    IngestSourceFromJSON,
    IngestSourceFromJSONTyped,
    IngestSourceToJSON,
    IngestSourceToJSONTyped,
} from './IngestSource';

export interface IngestRequest {

    media?: Array<IngestMedia> | null;

    overwrite?: boolean;

    source?: IngestSource | null;

    targetRes?: number | null;
}

export function instanceOfIngestRequest(value: object): value is IngestRequest {
    return true;
}

export function IngestRequestFromJSON(json: any): IngestRequest {
    return IngestRequestFromJSONTyped(json, false);
}

export function IngestRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): IngestRequest {
    if (json == null) {
        return json;
    }
    return {

        'media': json['media'] === undefined ? undefined : json['media'] === null ? null : ((json['media'] as Array<any>).map(IngestMediaFromJSON)),
        'overwrite': json['overwrite'] == null ? undefined : json['overwrite'],
        'source': json['source'] === undefined ? undefined : json['source'] === null ? null : IngestSourceFromJSON(json['source']),
        'targetRes': json['target_res'] === undefined ? undefined : json['target_res'] === null ? null : json['target_res'],
    };
}

export function IngestRequestToJSON(json: any): IngestRequest {
    return IngestRequestToJSONTyped(json, false);
}

export function IngestRequestToJSONTyped(value?: IngestRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'media': value['media'] == null ? undefined : ((value['media'] as Array<any>).map(IngestMediaToJSON)),
        'overwrite': value['overwrite'],
        'source': IngestSourceToJSON(value['source']),
        'target_res': value['targetRes'],
    };
}

