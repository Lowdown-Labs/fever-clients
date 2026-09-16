/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface ApiKey {

    createdAt?: string | null;

    customerId?: string | null;

    id: number;

    name?: string | null;

    revoked?: boolean;

    role?: string;
}

export function instanceOfApiKey(value: object): value is ApiKey {
    if (!('id' in value) || value['id'] === undefined) return false;
    return true;
}

export function ApiKeyFromJSON(json: any): ApiKey {
    return ApiKeyFromJSONTyped(json, false);
}

export function ApiKeyFromJSONTyped(json: any, ignoreDiscriminator: boolean): ApiKey {
    if (json == null) {
        return json;
    }
    return {

        'createdAt': json['created_at'] === undefined ? undefined : json['created_at'] === null ? null : json['created_at'],
        'customerId': json['customer_id'] === undefined ? undefined : json['customer_id'] === null ? null : json['customer_id'],
        'id': json['id'],
        'name': json['name'] === undefined ? undefined : json['name'] === null ? null : json['name'],
        'revoked': json['revoked'] == null ? undefined : json['revoked'],
        'role': json['role'] == null ? undefined : json['role'],
    };
}

export function ApiKeyToJSON(json: any): ApiKey {
    return ApiKeyToJSONTyped(json, false);
}

export function ApiKeyToJSONTyped(value?: ApiKey | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'created_at': value['createdAt'],
        'customer_id': value['customerId'],
        'id': value['id'],
        'name': value['name'],
        'revoked': value['revoked'],
        'role': value['role'],
    };
}

