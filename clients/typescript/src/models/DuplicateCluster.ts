/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface DuplicateCluster {

    memberCustomers?: Array<string | null>;

    members: Array<number>;

    size: number;

    tightness: number;
}

export function instanceOfDuplicateCluster(value: object): value is DuplicateCluster {
    if (!('members' in value) || value['members'] === undefined) return false;
    if (!('size' in value) || value['size'] === undefined) return false;
    if (!('tightness' in value) || value['tightness'] === undefined) return false;
    return true;
}

export function DuplicateClusterFromJSON(json: any): DuplicateCluster {
    return DuplicateClusterFromJSONTyped(json, false);
}

export function DuplicateClusterFromJSONTyped(json: any, ignoreDiscriminator: boolean): DuplicateCluster {
    if (json == null) {
        return json;
    }
    return {

        'memberCustomers': json['member_customers'] == null ? undefined : json['member_customers'],
        'members': json['members'],
        'size': json['size'],
        'tightness': json['tightness'],
    };
}

export function DuplicateClusterToJSON(json: any): DuplicateCluster {
    return DuplicateClusterToJSONTyped(json, false);
}

export function DuplicateClusterToJSONTyped(value?: DuplicateCluster | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'member_customers': value['memberCustomers'],
        'members': value['members'],
        'size': value['size'],
        'tightness': value['tightness'],
    };
}

