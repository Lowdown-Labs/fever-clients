from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict
from typing import Any, ClassVar, Dict, List, Optional
from fever_client.models.validation_error import ValidationError
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class HTTPValidationError(BaseModel):
    detail: Optional[List[ValidationError]] = None
    __properties: ClassVar[List[str]] = ["detail"]

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
        if self.detail:
            for _item_detail in self.detail:
                _items.append(_item_detail.to_dict() if _item_detail is not None else None)
            _dict['detail'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "detail": [ValidationError.from_dict(_item) for _item in obj["detail"]] if obj.get("detail") is not None else None
        })
        return _obj

