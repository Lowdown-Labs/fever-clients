from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class ApiKey(BaseModel):
    created_at: Optional[StrictStr] = None
    customer_id: Optional[StrictStr] = None
    id: StrictInt
    name: Optional[StrictStr] = None
    revoked: Optional[StrictBool] = False
    role: Optional[StrictStr] = 'scoped'
    __properties: ClassVar[List[str]] = ["created_at", "customer_id", "id", "name", "revoked", "role"]

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
        if self.created_at is None and "created_at" in self.model_fields_set:
            _dict['created_at'] = None

        if self.customer_id is None and "customer_id" in self.model_fields_set:
            _dict['customer_id'] = None

        if self.name is None and "name" in self.model_fields_set:
            _dict['name'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "created_at": obj.get("created_at"),
            "customer_id": obj.get("customer_id"),
            "id": obj.get("id"),
            "name": obj.get("name"),
            "revoked": obj.get("revoked") if obj.get("revoked") is not None else False,
            "role": obj.get("role") if obj.get("role") is not None else 'scoped'
        })
        return _obj

