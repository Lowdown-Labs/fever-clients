/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface KeyReveal {

    apiKey: string;

    customerId?: string | null;

    id: number;

    name?: string | null;

    role?: string;
}

export function instanceOfKeyReveal(value: object): value is KeyReveal {
    if ((!('apiKey' in (value as Record<string, any>)) && !('api_key' in (value as Record<string, any>))) || ((value as Record<string, any>)['apiKey'] === undefined && (value as Record<string, any>)['api_key'] === undefined)) return false;
    if (!('id' in value) || value['id'] === undefined) return false;
    return true;
}

export function KeyRevealFromJSON(json: any): KeyReveal {
    return KeyRevealFromJSONTyped(json, false);
}

export function KeyRevealFromJSONTyped(json: any, ignoreDiscriminator: boolean): KeyReveal {
    if (json == null) {
        return json;
    }
    return {

        'apiKey': json['api_key'],
        'customerId': json['customer_id'] === undefined ? undefined : json['customer_id'] === null ? null : json['customer_id'],
        'id': json['id'],
        'name': json['name'] === undefined ? undefined : json['name'] === null ? null : json['name'],
        'role': json['role'] == null ? undefined : json['role'],
    };
}

export function KeyRevealToJSON(json: any): KeyReveal {
    return KeyRevealToJSONTyped(json, false);
}

export function KeyRevealToJSONTyped(value?: KeyReveal | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'api_key': value['apiKey'],
        'customer_id': value['customerId'],
        'id': value['id'],
        'name': value['name'],
        'role': value['role'],
    };
}

