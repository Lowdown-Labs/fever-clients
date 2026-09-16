/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface QueryResult {

    columns: Array<string>;

    rows: Array<Array<any>>;

    truncated: boolean;
}

export function instanceOfQueryResult(value: object): value is QueryResult {
    if (!('columns' in value) || value['columns'] === undefined) return false;
    if (!('rows' in value) || value['rows'] === undefined) return false;
    if (!('truncated' in value) || value['truncated'] === undefined) return false;
    return true;
}

export function QueryResultFromJSON(json: any): QueryResult {
    return QueryResultFromJSONTyped(json, false);
}

export function QueryResultFromJSONTyped(json: any, ignoreDiscriminator: boolean): QueryResult {
    if (json == null) {
        return json;
    }
    return {

        'columns': json['columns'],
        'rows': json['rows'],
        'truncated': json['truncated'],
    };
}

export function QueryResultToJSON(json: any): QueryResult {
    return QueryResultToJSONTyped(json, false);
}

export function QueryResultToJSONTyped(value?: QueryResult | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'columns': value['columns'],
        'rows': value['rows'],
        'truncated': value['truncated'],
    };
}

