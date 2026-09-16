/* tslint:disable */
/* eslint-disable */

import { mapValues } from '../runtime';

export interface MediaFormats {

    audio: Array<string>;

    document: Array<string>;

    image: Array<string>;

    video: Array<string>;
}

export function instanceOfMediaFormats(value: object): value is MediaFormats {
    if (!('audio' in value) || value['audio'] === undefined) return false;
    if (!('document' in value) || value['document'] === undefined) return false;
    if (!('image' in value) || value['image'] === undefined) return false;
    if (!('video' in value) || value['video'] === undefined) return false;
    return true;
}

export function MediaFormatsFromJSON(json: any): MediaFormats {
    return MediaFormatsFromJSONTyped(json, false);
}

export function MediaFormatsFromJSONTyped(json: any, ignoreDiscriminator: boolean): MediaFormats {
    if (json == null) {
        return json;
    }
    return {

        'audio': json['audio'],
        'document': json['document'],
        'image': json['image'],
        'video': json['video'],
    };
}

export function MediaFormatsToJSON(json: any): MediaFormats {
    return MediaFormatsToJSONTyped(json, false);
}

export function MediaFormatsToJSONTyped(value?: MediaFormats | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {

        'audio': value['audio'],
        'document': value['document'],
        'image': value['image'],
        'video': value['video'],
    };
}

