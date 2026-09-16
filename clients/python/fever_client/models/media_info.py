from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class MediaInfo(BaseModel):
    blob_id: StrictInt
    caption: Optional[StrictStr] = Field(default=None, description="The user_text caption/keywords supplied at ingest.")
    captured_at: Optional[datetime] = Field(default=None, description="EXIF capture time.")
    customer_id: Optional[StrictStr] = None
    device: Optional[StrictStr] = Field(default=None, description="EXIF camera make/model.")
    external_ref: Optional[StrictStr] = Field(default=None, description="s3:// URI of the stored original.")
    frame_count: Optional[StrictInt] = Field(default=0, description="Sampled video frames derived from this blob.")
    gps_lat: Optional[Union[StrictFloat, StrictInt]] = None
    gps_lon: Optional[Union[StrictFloat, StrictInt]] = None
    kind: Optional[StrictStr] = Field(default=None, description="Media kind of this blob (image/video/audio/pdf/doc/note).")
    metadata: Optional[Dict[str, Any]] = None
    ocr_text: Optional[StrictStr] = Field(default=None, description="Text OCR'd out of the item (PDF pages always, photos when enabled).")
    synthetic: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Likely-AI score in [0,1] (FEVER_SYNTHETIC), when scored.")
    tags: Optional[List[StrictStr]] = Field(default=None, description="Client-supplied tags merged with zero-shot autotags.")
    transcript_segments: Optional[StrictInt] = Field(default=0, description="Whisper transcript segments derived from this blob.")
    __properties: ClassVar[List[str]] = ["blob_id", "caption", "captured_at", "customer_id", "device", "external_ref", "frame_count", "gps_lat", "gps_lon", "kind", "metadata", "ocr_text", "synthetic", "tags", "transcript_segments"]

    @field_validator('kind')
    def kind_validate_enum(cls, value):
        if value is None:
            return value

        if value not in set(['image', 'video', 'audio', 'pdf', 'doc', 'note']):
            raise ValueError("must be one of enum values ('image', 'video', 'audio', 'pdf', 'doc', 'note')")
        return value

    model_config = ConfigDict(
        validate_by_name=True,
        validate_by_alias=True,
        validate_assignment=True,
        protected_namespaces=(),
    )

    def to_str(self) -> str:
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        return json.dumps(to_jsonable_python(self.to_dict()))

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        if self.caption is None and "caption" in self.model_fields_set:
            _dict['caption'] = None

        if self.captured_at is None and "captured_at" in self.model_fields_set:
            _dict['captured_at'] = None

        if self.customer_id is None and "customer_id" in self.model_fields_set:
            _dict['customer_id'] = None

        if self.device is None and "device" in self.model_fields_set:
            _dict['device'] = None

        if self.external_ref is None and "external_ref" in self.model_fields_set:
            _dict['external_ref'] = None

        if self.gps_lat is None and "gps_lat" in self.model_fields_set:
            _dict['gps_lat'] = None

        if self.gps_lon is None and "gps_lon" in self.model_fields_set:
            _dict['gps_lon'] = None

        if self.kind is None and "kind" in self.model_fields_set:
            _dict['kind'] = None

        if self.metadata is None and "metadata" in self.model_fields_set:
            _dict['metadata'] = None

        if self.ocr_text is None and "ocr_text" in self.model_fields_set:
            _dict['ocr_text'] = None

        if self.synthetic is None and "synthetic" in self.model_fields_set:
            _dict['synthetic'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "blob_id": obj.get("blob_id"),
            "caption": obj.get("caption"),
            "captured_at": obj.get("captured_at"),
            "customer_id": obj.get("customer_id"),
            "device": obj.get("device"),
            "external_ref": obj.get("external_ref"),
            "frame_count": obj.get("frame_count") if obj.get("frame_count") is not None else 0,
            "gps_lat": obj.get("gps_lat"),
            "gps_lon": obj.get("gps_lon"),
            "kind": obj.get("kind"),
            "metadata": obj.get("metadata"),
            "ocr_text": obj.get("ocr_text"),
            "synthetic": obj.get("synthetic"),
            "tags": obj.get("tags"),
            "transcript_segments": obj.get("transcript_segments") if obj.get("transcript_segments") is not None else 0
        })
        return _obj

