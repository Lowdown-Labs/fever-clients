/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';
import type { CorpusTag } from './CorpusTag';
import {
    CorpusTagFromJSON,
    CorpusTagFromJSONTyped,
    CorpusTagToJSON,
    CorpusTagToJSONTyped,
} from './CorpusTag';

export interface CorpusStats {

    kinds: { [key: string]: number; };

    topTags: Array<CorpusTag>;
}

export function instanceOfCorpusStats(value: object): value is CorpusStats {
    if (!('kinds' in value) || value['kinds'] === undefined) return false;
    if ((!('topTags' in (value as Record<string, any>)) && !('top_tags' in (value as Record<string, any>))) || ((value as Record<string, any>)['topTags'] === undefined && (value as Record<string, any>)['top_tags'] === undefined)) return false;
    return true;
}

export function CorpusStatsFromJSON(json: any): CorpusStats {
    return CorpusStatsFromJSONTyped(json, false);
}

export function CorpusStatsFromJSONTyped(json: any, ignoreDiscriminator: boolean): CorpusStats {
    if (json == null) {
        return json;
    }
    return {

        'kinds': json['kinds'],
        'topTags': ((json['top_tags'] as Array<any>).map(CorpusTagFromJSON)),
    };
}

export function CorpusStatsToJSON(json: any): CorpusStats {
    return CorpusStatsToJSONTyped(json, false);
}

export function CorpusStatsToJSONTyped(value?: CorpusStats | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'kinds': value['kinds'],
        'top_tags': ((value['topTags'] as Array<any>).map(CorpusTagToJSON)),
    };
}

