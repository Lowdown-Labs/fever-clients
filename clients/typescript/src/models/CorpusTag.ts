/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface CorpusTag {

    count: number;

    tag: string;
}

export function instanceOfCorpusTag(value: object): value is CorpusTag {
    if (!('count' in value) || value['count'] === undefined) return false;
    if (!('tag' in value) || value['tag'] === undefined) return false;
    return true;
}

export function CorpusTagFromJSON(json: any): CorpusTag {
    return CorpusTagFromJSONTyped(json, false);
}

export function CorpusTagFromJSONTyped(json: any, ignoreDiscriminator: boolean): CorpusTag {
    if (json == null) {
        return json;
    }
    return {

        'count': json['count'],
        'tag': json['tag'],
    };
}

export function CorpusTagToJSON(json: any): CorpusTag {
    return CorpusTagToJSONTyped(json, false);
}

export function CorpusTagToJSONTyped(value?: CorpusTag | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'count': value['count'],
        'tag': value['tag'],
    };
}

