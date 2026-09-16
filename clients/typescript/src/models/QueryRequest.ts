/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface QueryRequest {

    rowLimit?: number;

    sql: string;
}

export function instanceOfQueryRequest(value: object): value is QueryRequest {
    if (!('sql' in value) || value['sql'] === undefined) return false;
    return true;
}

export function QueryRequestFromJSON(json: any): QueryRequest {
    return QueryRequestFromJSONTyped(json, false);
}

export function QueryRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): QueryRequest {
    if (json == null) {
        return json;
    }
    return {

        'rowLimit': json['row_limit'] == null ? undefined : json['row_limit'],
        'sql': json['sql'],
    };
}

export function QueryRequestToJSON(json: any): QueryRequest {
    return QueryRequestToJSONTyped(json, false);
}

export function QueryRequestToJSONTyped(value?: QueryRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'row_limit': value['rowLimit'],
        'sql': value['sql'],
    };
}

