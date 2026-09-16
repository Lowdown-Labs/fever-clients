from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class SearchRequest(BaseModel):
    after: Optional[StrictStr] = Field(default=None, description="EXIF capture time >= this ISO datetime.")
    before: Optional[StrictStr] = Field(default=None, description="EXIF capture time <= this ISO datetime.")
    collapse_duplicates: Optional[StrictBool] = Field(default=True, description="Collapse near-duplicate items so each result is a distinct representative; the folded-in duplicates are listed on each hit.")
    customer_id: Optional[StrictStr] = Field(default=None, description="Restrict results to media tagged with this customer_id.")
    device: Optional[StrictStr] = Field(default=None, description="EXIF camera make/model substring.")
    dupe_threshold: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, description="Cosine similarity cutoff 0..1 for treating two items as duplicates; higher is stricter. Defaults to the appliance setting when omitted.")
    exclude_tags: Optional[List[StrictStr]] = Field(default=None, description="Exclude blobs carrying any of these tags (ingest tags and/or zero-shot autotags), e.g. ['people'] to build a no-people dataset.")
    image: Optional[StrictStr] = Field(default=None, description="Base64 image for image-to-image search / dedup.")
    image_blob_id: Optional[StrictInt] = Field(default=None, description="Search with the vector of an already-indexed image (no re-upload, no re-embed).")
    include_tags: Optional[List[StrictStr]] = Field(default=None, description="Only blobs carrying at least one of these tags (ANY semantics: e.g. a list of geo:<place> tags an integrator's UI offers). Combine with exclude_tags as you like.")
    indexed_res: Optional[StrictInt] = Field(default=None, description="Restrict results to blobs indexed at exactly this resolution (pixels; see IngestRequest.target_res). Blobs ingested before this filter existed have no recorded resolution and are excluded whenever this is set.")
    k: Optional[StrictInt] = Field(default=10, description="Max results.")
    kind: Optional[StrictStr] = Field(default=None, description="Constrain results to one media kind; unset scans every kind. Video hits attach seek_ms; audio/transcript hits attach span.")
    max_height: Optional[StrictInt] = Field(default=None, description="Restrict results to blobs at most this many pixels tall (stored media dimensions; blobs with unknown dimensions are excluded whenever this is set).")
    max_width: Optional[StrictInt] = Field(default=None, description="Restrict results to blobs at most this many pixels wide (stored media dimensions; blobs with unknown dimensions are excluded whenever this is set).")
    min_score: Optional[Union[StrictFloat, StrictInt]] = Field(default=0.0, description="Confidence cutoff 0..1; for text this is the reranker's match probability.")
    near: Optional[List[Union[StrictFloat, StrictInt]]] = Field(default=None, description="Geo filter [lat, lon, radius_km] from EXIF GPS.")
    sort: Optional[StrictStr] = Field(default=None, description="'relevance' (default) is the fused/calibrated ordering; 'distance' reorders results nearest-first and requires the near filter - e.g. an integrator's map view. An explicit ordering knob, not another relevance signal.")
    text: Optional[StrictStr] = Field(default=None, description="Text query (meaning-based, not keyword).")
    __properties: ClassVar[List[str]] = ["after", "before", "collapse_duplicates", "customer_id", "device", "dupe_threshold", "exclude_tags", "image", "image_blob_id", "include_tags", "indexed_res", "k", "kind", "max_height", "max_width", "min_score", "near", "sort", "text"]

    @field_validator('kind')
    def kind_validate_enum(cls, value):
        if value is None:
            return value

        if value not in set(['image', 'video', 'audio', 'pdf', 'doc', 'note']):
            raise ValueError("must be one of enum values ('image', 'video', 'audio', 'pdf', 'doc', 'note')")
        return value

    @field_validator('sort')
    def sort_validate_enum(cls, value):
        if value is None:
            return value

        if value not in set(['relevance', 'distance']):
            raise ValueError("must be one of enum values ('relevance', 'distance')")
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
        if self.after is None and "after" in self.model_fields_set:
            _dict['after'] = None

        if self.before is None and "before" in self.model_fields_set:
            _dict['before'] = None

        if self.customer_id is None and "customer_id" in self.model_fields_set:
            _dict['customer_id'] = None

        if self.device is None and "device" in self.model_fields_set:
            _dict['device'] = None

        if self.dupe_threshold is None and "dupe_threshold" in self.model_fields_set:
            _dict['dupe_threshold'] = None

        if self.exclude_tags is None and "exclude_tags" in self.model_fields_set:
            _dict['exclude_tags'] = None

        if self.image is None and "image" in self.model_fields_set:
            _dict['image'] = None

        if self.image_blob_id is None and "image_blob_id" in self.model_fields_set:
            _dict['image_blob_id'] = None

        if self.include_tags is None and "include_tags" in self.model_fields_set:
            _dict['include_tags'] = None

        if self.indexed_res is None and "indexed_res" in self.model_fields_set:
            _dict['indexed_res'] = None

        if self.kind is None and "kind" in self.model_fields_set:
            _dict['kind'] = None

        if self.max_height is None and "max_height" in self.model_fields_set:
            _dict['max_height'] = None

        if self.max_width is None and "max_width" in self.model_fields_set:
            _dict['max_width'] = None

        if self.near is None and "near" in self.model_fields_set:
            _dict['near'] = None

        if self.sort is None and "sort" in self.model_fields_set:
            _dict['sort'] = None

        if self.text is None and "text" in self.model_fields_set:
            _dict['text'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "after": obj.get("after"),
            "before": obj.get("before"),
            "collapse_duplicates": obj.get("collapse_duplicates") if obj.get("collapse_duplicates") is not None else True,
            "customer_id": obj.get("customer_id"),
            "device": obj.get("device"),
            "dupe_threshold": obj.get("dupe_threshold"),
            "exclude_tags": obj.get("exclude_tags"),
            "image": obj.get("image"),
            "image_blob_id": obj.get("image_blob_id"),
            "include_tags": obj.get("include_tags"),
            "indexed_res": obj.get("indexed_res"),
            "k": obj.get("k") if obj.get("k") is not None else 10,
            "kind": obj.get("kind"),
            "max_height": obj.get("max_height"),
            "max_width": obj.get("max_width"),
            "min_score": obj.get("min_score") if obj.get("min_score") is not None else 0.0,
            "near": obj.get("near"),
            "sort": obj.get("sort"),
            "text": obj.get("text")
        })
        return _obj

