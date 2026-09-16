from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from fever_client.models.ingest_media import IngestMedia
from fever_client.models.ingest_source import IngestSource
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class IngestRequest(BaseModel):
    media: Optional[List[IngestMedia]] = Field(default=None, description="1..N media items to ingest inline.")
    overwrite: Optional[StrictBool] = Field(default=False, description="Re-embed and update items already indexed (clobber). Default false = delta ingest: content already indexed is skipped, so re-running an ingest only processes new items.")
    source: Optional[IngestSource] = Field(default=None, description="Ingest every media item under an S3 prefix instead of sending bytes.")
    target_res: Optional[Annotated[int, Field(le=4096, strict=True, ge=64)]] = Field(default=None, description="Resolution to index this batch at, in pixels (rounded to a multiple of 16). Images are resized to this before embedding; higher means more detail but slower. Leave unset for the fast production default (64), which retains most of the search quality at a fraction of the cost.")
    __properties: ClassVar[List[str]] = ["media", "overwrite", "source", "target_res"]

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
        _items = []
        if self.media:
            for _item_media in self.media:
                _items.append(_item_media.to_dict() if _item_media is not None else None)
            _dict['media'] = _items
        if self.source:
            _dict['source'] = self.source.to_dict()
        if self.media is None and "media" in self.model_fields_set:
            _dict['media'] = None

        if self.source is None and "source" in self.model_fields_set:
            _dict['source'] = None

        if self.target_res is None and "target_res" in self.model_fields_set:
            _dict['target_res'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "media": [IngestMedia.from_dict(_item) for _item in obj["media"]] if obj.get("media") is not None else None,
            "overwrite": obj.get("overwrite") if obj.get("overwrite") is not None else False,
            "source": IngestSource.from_dict(obj["source"]) if obj.get("source") is not None else None,
            "target_res": obj.get("target_res")
        })
        return _obj

