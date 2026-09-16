/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface LocationInner {
}

export function instanceOfLocationInner(value: object): value is LocationInner {
    return true;
}

export function LocationInnerFromJSON(json: any): LocationInner {
    return LocationInnerFromJSONTyped(json, false);
}

export function LocationInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): LocationInner {
    return json;
}

export function LocationInnerToJSON(json: any): LocationInner {
    return LocationInnerToJSONTyped(json, false);
}

export function LocationInnerToJSONTyped(value?: LocationInner | null, ignoreDiscriminator: boolean = false): any {
    return value;
}

