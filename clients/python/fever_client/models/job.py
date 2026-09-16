from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class Job(BaseModel):
    done: Optional[StrictInt] = 0
    error: Optional[StrictStr] = None
    id: StrictInt
    skipped: Optional[StrictInt] = Field(default=0, description="Items skipped by delta ingest because their content was already indexed (overwrite=false).")
    status: StrictStr
    total: Optional[StrictInt] = 0
    __properties: ClassVar[List[str]] = ["done", "error", "id", "skipped", "status", "total"]

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
        if self.error is None and "error" in self.model_fields_set:
            _dict['error'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "done": obj.get("done") if obj.get("done") is not None else 0,
            "error": obj.get("error"),
            "id": obj.get("id"),
            "skipped": obj.get("skipped") if obj.get("skipped") is not None else 0,
            "status": obj.get("status"),
            "total": obj.get("total") if obj.get("total") is not None else 0
        })
        return _obj

