# MediaInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attachments** | [**List[MediaAttachment]**](MediaAttachment.md) | Related items pointing at this blob via parent_ref (e.g. a LiDAR scan attached to the photo or video it belongs to). | [optional] 
**blob_id** | **int** |  | 
**caption** | **str** | The user_text caption/keywords supplied at ingest. | [optional] 
**captured_at** | **datetime** | EXIF capture time. | [optional] 
**collection_id** | **str** | Collection this item was grouped under at ingest, if any. | [optional] 
**customer_id** | **str** |  | [optional] 
**device** | **str** | EXIF camera make/model. | [optional] 
**external_ref** | **str** | s3:// URI of the stored original. | [optional] 
**frame_count** | **int** | Sampled video frames derived from this blob. | [optional] [default to 0]
**gps_lat** | **float** |  | [optional] 
**gps_lon** | **float** |  | [optional] 
**kind** | **str** | Media kind of this blob (image/video/audio/pdf/doc/note/lidar). | [optional] 
**metadata** | **Dict[str, object]** |  | [optional] 
**ocr_text** | **str** | Text OCR&#39;d out of the item (PDF pages always, photos when enabled). | [optional] 
**parent_ref** | **str** | Pointer to this item&#39;s related parent asset, if declared. | [optional] 
**synthetic** | **float** | Likely-AI score in [0,1] (FEVER_SYNTHETIC), when scored. | [optional] 
**tags** | **List[str]** | Client-supplied tags merged with zero-shot autotags. | [optional] 
**transcript_segments** | **int** | Whisper transcript segments derived from this blob. | [optional] [default to 0]

## Example

```python
from fever_client.models.media_info import MediaInfo

# TODO update the JSON string below
json = "{}"
# create an instance of MediaInfo from a JSON string
media_info_instance = MediaInfo.from_json(json)
# print the JSON string representation of the object
print(MediaInfo.to_json())

# convert the object into a dict
media_info_dict = media_info_instance.to_dict()
# create an instance of MediaInfo from a dict
media_info_from_dict = MediaInfo.from_dict(media_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


