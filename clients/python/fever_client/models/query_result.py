from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class QueryResult(BaseModel):
    columns: List[StrictStr] = Field(description="Result column names, in order.")
    rows: List[List[Any]] = Field(description="Result rows, each a list of values in column order. Timestamps/bytes are JSON-safe (ISO strings / hex).")
    truncated: StrictBool = Field(description="True when more rows matched than were returned (hit the row cap).")
    __properties: ClassVar[List[str]] = ["columns", "rows", "truncated"]

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
            "columns": obj.get("columns"),
            "rows": obj.get("rows"),
            "truncated": obj.get("truncated")
        })
        return _obj

