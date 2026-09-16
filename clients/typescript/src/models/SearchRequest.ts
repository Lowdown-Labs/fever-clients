/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface SearchRequest {

    after?: string | null;

    before?: string | null;

    collapseDuplicates?: boolean;

    customerId?: string | null;

    device?: string | null;

    dupeThreshold?: number | null;

    excludeTags?: Array<string> | null;

    image?: string | null;

    imageBlobId?: number | null;

    includeTags?: Array<string> | null;

    indexedRes?: number | null;

    k?: number;

    kind?: SearchRequestKindEnum | null;

    maxHeight?: number | null;

    maxWidth?: number | null;

    minScore?: number;

    near?: Array<number> | null;

    sort?: SearchRequestSortEnum | null;

    text?: string | null;
}

export const SearchRequestKindEnum = {
    Image: 'image',
    Video: 'video',
    Audio: 'audio',
    Pdf: 'pdf',
    Doc: 'doc',
    Note: 'note',
} as const;
export type SearchRequestKindEnum = typeof SearchRequestKindEnum[keyof typeof SearchRequestKindEnum];

export const SearchRequestSortEnum = {
    Relevance: 'relevance',
    Distance: 'distance',
} as const;
export type SearchRequestSortEnum = typeof SearchRequestSortEnum[keyof typeof SearchRequestSortEnum];

export function instanceOfSearchRequest(value: object): value is SearchRequest {
    return true;
}

export function SearchRequestFromJSON(json: any): SearchRequest {
    return SearchRequestFromJSONTyped(json, false);
}

export function SearchRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): SearchRequest {
    if (json == null) {
        return json;
    }
    return {

        'after': json['after'] === undefined ? undefined : json['after'] === null ? null : json['after'],
        'before': json['before'] === undefined ? undefined : json['before'] === null ? null : json['before'],
        'collapseDuplicates': json['collapse_duplicates'] == null ? undefined : json['collapse_duplicates'],
        'customerId': json['customer_id'] === undefined ? undefined : json['customer_id'] === null ? null : json['customer_id'],
        'device': json['device'] === undefined ? undefined : json['device'] === null ? null : json['device'],
        'dupeThreshold': json['dupe_threshold'] === undefined ? undefined : json['dupe_threshold'] === null ? null : json['dupe_threshold'],
        'excludeTags': json['exclude_tags'] === undefined ? undefined : json['exclude_tags'] === null ? null : json['exclude_tags'],
        'image': json['image'] === undefined ? undefined : json['image'] === null ? null : json['image'],
        'imageBlobId': json['image_blob_id'] === undefined ? undefined : json['image_blob_id'] === null ? null : json['image_blob_id'],
        'includeTags': json['include_tags'] === undefined ? undefined : json['include_tags'] === null ? null : json['include_tags'],
        'indexedRes': json['indexed_res'] === undefined ? undefined : json['indexed_res'] === null ? null : json['indexed_res'],
        'k': json['k'] == null ? undefined : json['k'],
        'kind': json['kind'] === undefined ? undefined : json['kind'] === null ? null : json['kind'],
        'maxHeight': json['max_height'] === undefined ? undefined : json['max_height'] === null ? null : json['max_height'],
        'maxWidth': json['max_width'] === undefined ? undefined : json['max_width'] === null ? null : json['max_width'],
        'minScore': json['min_score'] == null ? undefined : json['min_score'],
        'near': json['near'] === undefined ? undefined : json['near'] === null ? null : json['near'],
        'sort': json['sort'] === undefined ? undefined : json['sort'] === null ? null : json['sort'],
        'text': json['text'] === undefined ? undefined : json['text'] === null ? null : json['text'],
    };
}

export function SearchRequestToJSON(json: any): SearchRequest {
    return SearchRequestToJSONTyped(json, false);
}

export function SearchRequestToJSONTyped(value?: SearchRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'after': value['after'],
        'before': value['before'],
        'collapse_duplicates': value['collapseDuplicates'],
        'customer_id': value['customerId'],
        'device': value['device'],
        'dupe_threshold': value['dupeThreshold'],
        'exclude_tags': value['excludeTags'],
        'image': value['image'],
        'image_blob_id': value['imageBlobId'],
        'include_tags': value['includeTags'],
        'indexed_res': value['indexedRes'],
        'k': value['k'],
        'kind': value['kind'],
        'max_height': value['maxHeight'],
        'max_width': value['maxWidth'],
        'min_score': value['minScore'],
        'near': value['near'],
        'sort': value['sort'],
        'text': value['text'],
    };
}

