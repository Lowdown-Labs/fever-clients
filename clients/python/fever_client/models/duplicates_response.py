from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictInt
from typing import Any, ClassVar, Dict, List, Optional
from fever_client.models.duplicate_cluster import DuplicateCluster
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class DuplicatesResponse(BaseModel):
    clusters: StrictInt = Field(description="Number of near-duplicate clusters found.")
    duplicate_clusters: Optional[List[DuplicateCluster]] = Field(default=None, description="The near-duplicate clusters, largest and tightest first.")
    total_duplicates: StrictInt = Field(description="Count of items that fall in any cluster of size >= 2.")
    __properties: ClassVar[List[str]] = ["clusters", "duplicate_clusters", "total_duplicates"]

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
        if self.duplicate_clusters:
            for _item_duplicate_clusters in self.duplicate_clusters:
                _items.append(_item_duplicate_clusters.to_dict() if _item_duplicate_clusters is not None else None)
            _dict['duplicate_clusters'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "clusters": obj.get("clusters"),
            "duplicate_clusters": [DuplicateCluster.from_dict(_item) for _item in obj["duplicate_clusters"]] if obj.get("duplicate_clusters") is not None else None,
            "total_duplicates": obj.get("total_duplicates")
        })
        return _obj

