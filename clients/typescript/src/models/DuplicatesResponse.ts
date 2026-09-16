/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';
import type { DuplicateCluster } from './DuplicateCluster';
import {
    DuplicateClusterFromJSON,
    DuplicateClusterFromJSONTyped,
    DuplicateClusterToJSON,
    DuplicateClusterToJSONTyped,
} from './DuplicateCluster';

export interface DuplicatesResponse {

    clusters: number;

    duplicateClusters?: Array<DuplicateCluster>;

    totalDuplicates: number;
}

export function instanceOfDuplicatesResponse(value: object): value is DuplicatesResponse {
    if (!('clusters' in value) || value['clusters'] === undefined) return false;
    if ((!('totalDuplicates' in (value as Record<string, any>)) && !('total_duplicates' in (value as Record<string, any>))) || ((value as Record<string, any>)['totalDuplicates'] === undefined && (value as Record<string, any>)['total_duplicates'] === undefined)) return false;
    return true;
}

export function DuplicatesResponseFromJSON(json: any): DuplicatesResponse {
    return DuplicatesResponseFromJSONTyped(json, false);
}

export function DuplicatesResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): DuplicatesResponse {
    if (json == null) {
        return json;
    }
    return {

        'clusters': json['clusters'],
        'duplicateClusters': json['duplicate_clusters'] == null ? undefined : ((json['duplicate_clusters'] as Array<any>).map(DuplicateClusterFromJSON)),
        'totalDuplicates': json['total_duplicates'],
    };
}

export function DuplicatesResponseToJSON(json: any): DuplicatesResponse {
    return DuplicatesResponseToJSONTyped(json, false);
}

export function DuplicatesResponseToJSONTyped(value?: DuplicatesResponse | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'clusters': value['clusters'],
        'duplicate_clusters': value['duplicateClusters'] == null ? undefined : ((value['duplicateClusters'] as Array<any>).map(DuplicateClusterToJSON)),
        'total_duplicates': value['totalDuplicates'],
    };
}

