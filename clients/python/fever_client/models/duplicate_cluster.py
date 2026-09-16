from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class DuplicateCluster(BaseModel):
    member_customers: Optional[List[Optional[StrictStr]]] = Field(default=None, description="customer_id of each member, parallel to members; a cluster whose distinct customer count exceeds 1 is duplicated across accounts.")
    members: List[StrictInt] = Field(description="blob_ids of the items in this cluster.")
    size: StrictInt = Field(description="Number of items in this near-duplicate cluster.")
    tightness: Union[StrictFloat, StrictInt] = Field(description="Minimum pairwise cosine similarity across the cluster.")
    __properties: ClassVar[List[str]] = ["member_customers", "members", "size", "tightness"]

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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "member_customers": obj.get("member_customers"),
            "members": obj.get("members"),
            "size": obj.get("size"),
            "tightness": obj.get("tightness")
        })
        return _obj

