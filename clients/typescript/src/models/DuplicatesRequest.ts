/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface DuplicatesRequest {

    customerId?: string | null;

    customerIds?: Array<string> | null;

    limit?: number;

    threshold?: number;
}

export function instanceOfDuplicatesRequest(value: object): value is DuplicatesRequest {
    return true;
}

export function DuplicatesRequestFromJSON(json: any): DuplicatesRequest {
    return DuplicatesRequestFromJSONTyped(json, false);
}

export function DuplicatesRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): DuplicatesRequest {
    if (json == null) {
        return json;
    }
    return {

        'customerId': json['customer_id'] === undefined ? undefined : json['customer_id'] === null ? null : json['customer_id'],
        'customerIds': json['customer_ids'] === undefined ? undefined : json['customer_ids'] === null ? null : json['customer_ids'],
        'limit': json['limit'] == null ? undefined : json['limit'],
        'threshold': json['threshold'] == null ? undefined : json['threshold'],
    };
}

export function DuplicatesRequestToJSON(json: any): DuplicatesRequest {
    return DuplicatesRequestToJSONTyped(json, false);
}

export function DuplicatesRequestToJSONTyped(value?: DuplicatesRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'customer_id': value['customerId'],
        'customer_ids': value['customerIds'],
        'limit': value['limit'],
        'threshold': value['threshold'],
    };
}

