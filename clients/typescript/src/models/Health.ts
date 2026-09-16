/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface Health {

    status?: string;
}

export function instanceOfHealth(value: object): value is Health {
    return true;
}

export function HealthFromJSON(json: any): Health {
    return HealthFromJSONTyped(json, false);
}

export function HealthFromJSONTyped(json: any, ignoreDiscriminator: boolean): Health {
    if (json == null) {
        return json;
    }
    return {

        'status': json['status'] == null ? undefined : json['status'],
    };
}

export function HealthToJSON(json: any): Health {
    return HealthToJSONTyped(json, false);
}

export function HealthToJSONTyped(value?: Health | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'status': value['status'],
    };
}

