from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from fever_client.models.location_inner import LocationInner
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class ValidationError(BaseModel):
    ctx: Optional[Dict[str, Any]] = None
    input: Optional[Any] = None
    loc: List[LocationInner]
    msg: StrictStr
    type: StrictStr
    __properties: ClassVar[List[str]] = ["ctx", "input", "loc", "msg", "type"]

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
        if self.loc:
            for _item_loc in self.loc:
                _items.append(_item_loc.to_dict() if _item_loc is not None else None)
            _dict['loc'] = _items
        if self.input is None and "input" in self.model_fields_set:
            _dict['input'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ctx": obj.get("ctx"),
            "input": obj.get("input"),
            "loc": [LocationInner.from_dict(_item) for _item in obj["loc"]] if obj.get("loc") is not None else None,
            "msg": obj.get("msg"),
            "type": obj.get("type")
        })
        return _obj

