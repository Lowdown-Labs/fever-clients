/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';
import type { LocationInner } from './LocationInner';
import {
    LocationInnerFromJSON,
    LocationInnerFromJSONTyped,
    LocationInnerToJSON,
    LocationInnerToJSONTyped,
} from './LocationInner';

export interface ValidationError {

    ctx?: object;

    input?: any | null;

    loc: Array<LocationInner>;

    msg: string;

    type: string;
}

export function instanceOfValidationError(value: object): value is ValidationError {
    if (!('loc' in value) || value['loc'] === undefined) return false;
    if (!('msg' in value) || value['msg'] === undefined) return false;
    if (!('type' in value) || value['type'] === undefined) return false;
    return true;
}

export function ValidationErrorFromJSON(json: any): ValidationError {
    return ValidationErrorFromJSONTyped(json, false);
}

export function ValidationErrorFromJSONTyped(json: any, ignoreDiscriminator: boolean): ValidationError {
    if (json == null) {
        return json;
    }
    return {

        'ctx': json['ctx'] == null ? undefined : json['ctx'],
        'input': json['input'] === undefined ? undefined : json['input'] === null ? null : json['input'],
        'loc': ((json['loc'] as Array<any>).map(LocationInnerFromJSON)),
        'msg': json['msg'],
        'type': json['type'],
    };
}

export function ValidationErrorToJSON(json: any): ValidationError {
    return ValidationErrorToJSONTyped(json, false);
}

export function ValidationErrorToJSONTyped(value?: ValidationError | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'ctx': value['ctx'],
        'input': value['input'],
        'loc': ((value['loc'] as Array<any>).map(LocationInnerToJSON)),
        'msg': value['msg'],
        'type': value['type'],
    };
}

