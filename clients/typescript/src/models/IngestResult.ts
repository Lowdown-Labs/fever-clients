/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';
import type { Job } from './Job';
import {
    JobFromJSON,
    JobFromJSONTyped,
    JobToJSON,
    JobToJSONTyped,
} from './Job';
import type { IngestedMedia } from './IngestedMedia';
import {
    IngestedMediaFromJSON,
    IngestedMediaFromJSONTyped,
    IngestedMediaToJSON,
    IngestedMediaToJSONTyped,
} from './IngestedMedia';

export interface IngestResult {

    existing?: Array<IngestedMedia>;

    ingested?: Array<IngestedMedia>;

    job?: Job | null;
}

export function instanceOfIngestResult(value: object): value is IngestResult {
    return true;
}

export function IngestResultFromJSON(json: any): IngestResult {
    return IngestResultFromJSONTyped(json, false);
}

export function IngestResultFromJSONTyped(json: any, ignoreDiscriminator: boolean): IngestResult {
    if (json == null) {
        return json;
    }
    return {

        'existing': json['existing'] == null ? undefined : ((json['existing'] as Array<any>).map(IngestedMediaFromJSON)),
        'ingested': json['ingested'] == null ? undefined : ((json['ingested'] as Array<any>).map(IngestedMediaFromJSON)),
        'job': json['job'] === undefined ? undefined : json['job'] === null ? null : JobFromJSON(json['job']),
    };
}

export function IngestResultToJSON(json: any): IngestResult {
    return IngestResultToJSONTyped(json, false);
}

export function IngestResultToJSONTyped(value?: IngestResult | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'existing': value['existing'] == null ? undefined : ((value['existing'] as Array<any>).map(IngestedMediaToJSON)),
        'ingested': value['ingested'] == null ? undefined : ((value['ingested'] as Array<any>).map(IngestedMediaToJSON)),
        'job': JobToJSON(value['job']),
    };
}

