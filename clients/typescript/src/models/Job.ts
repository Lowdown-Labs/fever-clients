/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface Job {

    done?: number;

    error?: string | null;

    id: number;

    skipped?: number;

    status: string;

    total?: number;
}

export function instanceOfJob(value: object): value is Job {
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('status' in value) || value['status'] === undefined) return false;
    return true;
}

export function JobFromJSON(json: any): Job {
    return JobFromJSONTyped(json, false);
}

export function JobFromJSONTyped(json: any, ignoreDiscriminator: boolean): Job {
    if (json == null) {
        return json;
    }
    return {

        'done': json['done'] == null ? undefined : json['done'],
        'error': json['error'] === undefined ? undefined : json['error'] === null ? null : json['error'],
        'id': json['id'],
        'skipped': json['skipped'] == null ? undefined : json['skipped'],
        'status': json['status'],
        'total': json['total'] == null ? undefined : json['total'],
    };
}

export function JobToJSON(json: any): Job {
    return JobToJSONTyped(json, false);
}

export function JobToJSONTyped(value?: Job | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'done': value['done'],
        'error': value['error'],
        'id': value['id'],
        'skipped': value['skipped'],
        'status': value['status'],
        'total': value['total'],
    };
}

