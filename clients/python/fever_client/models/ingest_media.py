from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class IngestMedia(BaseModel):
    caption: Optional[StrictStr] = Field(default=None, description="Optional caption/keywords; indexed at the highest text-search weight.")
    customer_id: Optional[StrictStr] = Field(default=None, description="Optional tag attributing this item to one of your customers; filterable at search time.")
    data: Optional[StrictStr] = Field(default=None, description="Base64-encoded media item bytes.")
    metadata: Optional[Dict[str, Any]] = Field(default=None, description="Opaque JSON returned with search hits.")
    strip_exif: Optional[StrictBool] = Field(default=False, description="Skip EXIF extraction/retention for this item.")
    tags: Optional[List[StrictStr]] = Field(default=None, description="Optional tags for this item; indexed for text search and returned on hits. Merged with the appliance's zero-shot autotags.")
    url: Optional[StrictStr] = Field(default=None, description="An s3:// URI to one media item you already store, instead of inline bytes.")
    __properties: ClassVar[List[str]] = ["caption", "customer_id", "data", "metadata", "strip_exif", "tags", "url"]

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

        if self.customer_id is None and "customer_id" in self.model_fields_set:
            _dict['customer_id'] = None

        if self.data is None and "data" in self.model_fields_set:
            _dict['data'] = None

        if self.metadata is None and "metadata" in self.model_fields_set:
            _dict['metadata'] = None

        if self.tags is None and "tags" in self.model_fields_set:
            _dict['tags'] = None

        if self.url is None and "url" in self.model_fields_set:
            _dict['url'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "caption": obj.get("caption"),
            "customer_id": obj.get("customer_id"),
            "data": obj.get("data"),
            "metadata": obj.get("metadata"),
            "strip_exif": obj.get("strip_exif") if obj.get("strip_exif") is not None else False,
            "tags": obj.get("tags"),
            "url": obj.get("url")
        })
        return _obj

