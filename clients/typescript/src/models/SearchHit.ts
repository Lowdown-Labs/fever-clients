/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';
import type { MediaSpan } from './MediaSpan';
import {
    MediaSpanFromJSON,
    MediaSpanFromJSONTyped,
    MediaSpanToJSON,
    MediaSpanToJSONTyped,
} from './MediaSpan';

export interface SearchHit {

    blobId: number;

    caption?: string | null;

    customerId?: string | null;

    duplicateCount?: number;

    duplicates?: Array<number>;

    geoLabel?: string | null;

    headline?: string | null;

    height?: number | null;

    kind?: SearchHitKindEnum | null;

    mediaRef?: string | null;

    metadata?: { [key: string]: any; } | null;

    score: number;

    scoreType: SearchHitScoreTypeEnum;

    seekMs?: number | null;

    span?: MediaSpan | null;

    spanHeadline?: string | null;

    tags?: Array<string>;

    width?: number | null;
}

export const SearchHitKindEnum = {
    Image: 'image',
    Video: 'video',
    Audio: 'audio',
    Pdf: 'pdf',
    Doc: 'doc',
    Note: 'note',
} as const;
export type SearchHitKindEnum = typeof SearchHitKindEnum[keyof typeof SearchHitKindEnum];

export const SearchHitScoreTypeEnum = {
    Cosine: 'cosine',
    Cosinelex: 'cosine+lex',
    Rrf: 'rrf',
    Rerank: 'rerank',
} as const;
export type SearchHitScoreTypeEnum = typeof SearchHitScoreTypeEnum[keyof typeof SearchHitScoreTypeEnum];

export function instanceOfSearchHit(value: object): value is SearchHit {
    if ((!('blobId' in (value as Record<string, any>)) && !('blob_id' in (value as Record<string, any>))) || ((value as Record<string, any>)['blobId'] === undefined && (value as Record<string, any>)['blob_id'] === undefined)) return false;
    if (!('score' in value) || value['score'] === undefined) return false;
    if ((!('scoreType' in (value as Record<string, any>)) && !('score_type' in (value as Record<string, any>))) || ((value as Record<string, any>)['scoreType'] === undefined && (value as Record<string, any>)['score_type'] === undefined)) return false;
    return true;
}

export function SearchHitFromJSON(json: any): SearchHit {
    return SearchHitFromJSONTyped(json, false);
}

export function SearchHitFromJSONTyped(json: any, ignoreDiscriminator: boolean): SearchHit {
    if (json == null) {
        return json;
    }
    return {

        'blobId': json['blob_id'],
        'caption': json['caption'] === undefined ? undefined : json['caption'] === null ? null : json['caption'],
        'customerId': json['customer_id'] === undefined ? undefined : json['customer_id'] === null ? null : json['customer_id'],
        'duplicateCount': json['duplicate_count'] == null ? undefined : json['duplicate_count'],
        'duplicates': json['duplicates'] == null ? undefined : json['duplicates'],
        'geoLabel': json['geo_label'] === undefined ? undefined : json['geo_label'] === null ? null : json['geo_label'],
        'headline': json['headline'] === undefined ? undefined : json['headline'] === null ? null : json['headline'],
        'height': json['height'] === undefined ? undefined : json['height'] === null ? null : json['height'],
        'kind': json['kind'] === undefined ? undefined : json['kind'] === null ? null : json['kind'],
        'mediaRef': json['media_ref'] === undefined ? undefined : json['media_ref'] === null ? null : json['media_ref'],
        'metadata': json['metadata'] === undefined ? undefined : json['metadata'] === null ? null : json['metadata'],
        'score': json['score'],
        'scoreType': json['score_type'],
        'seekMs': json['seek_ms'] === undefined ? undefined : json['seek_ms'] === null ? null : json['seek_ms'],
        'span': json['span'] === undefined ? undefined : json['span'] === null ? null : MediaSpanFromJSON(json['span']),
        'spanHeadline': json['span_headline'] === undefined ? undefined : json['span_headline'] === null ? null : json['span_headline'],
        'tags': json['tags'] == null ? undefined : json['tags'],
        'width': json['width'] === undefined ? undefined : json['width'] === null ? null : json['width'],
    };
}

export function SearchHitToJSON(json: any): SearchHit {
    return SearchHitToJSONTyped(json, false);
}

export function SearchHitToJSONTyped(value?: SearchHit | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'blob_id': value['blobId'],
        'caption': value['caption'],
        'customer_id': value['customerId'],
        'duplicate_count': value['duplicateCount'],
        'duplicates': value['duplicates'],
        'geo_label': value['geoLabel'],
        'headline': value['headline'],
        'height': value['height'],
        'kind': value['kind'],
        'media_ref': value['mediaRef'],
        'metadata': value['metadata'],
        'score': value['score'],
        'score_type': value['scoreType'],
        'seek_ms': value['seekMs'],
        'span': MediaSpanToJSON(value['span']),
        'span_headline': value['spanHeadline'],
        'tags': value['tags'],
        'width': value['width'],
    };
}

