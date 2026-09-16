/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface CreateKeyRequest {

    customerId?: string | null;

    name?: string | null;

    role?: CreateKeyRequestRoleEnum | null;
}

export const CreateKeyRequestRoleEnum = {
    Admin: 'admin',
    Scoped: 'scoped',
} as const;
export type CreateKeyRequestRoleEnum = typeof CreateKeyRequestRoleEnum[keyof typeof CreateKeyRequestRoleEnum];

export function instanceOfCreateKeyRequest(value: object): value is CreateKeyRequest {
    return true;
}

export function CreateKeyRequestFromJSON(json: any): CreateKeyRequest {
    return CreateKeyRequestFromJSONTyped(json, false);
}

export function CreateKeyRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateKeyRequest {
    if (json == null) {
        return json;
    }
    return {

        'customerId': json['customer_id'] === undefined ? undefined : json['customer_id'] === null ? null : json['customer_id'],
        'name': json['name'] === undefined ? undefined : json['name'] === null ? null : json['name'],
        'role': json['role'] === undefined ? undefined : json['role'] === null ? null : json['role'],
    };
}

export function CreateKeyRequestToJSON(json: any): CreateKeyRequest {
    return CreateKeyRequestToJSONTyped(json, false);
}

export function CreateKeyRequestToJSONTyped(value?: CreateKeyRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'customer_id': value['customerId'],
        'name': value['name'],
        'role': value['role'],
    };
}

