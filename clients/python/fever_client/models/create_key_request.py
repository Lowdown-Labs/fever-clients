from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class CreateKeyRequest(BaseModel):
    customer_id: Optional[StrictStr] = Field(default=None, description="For a scoped key, the single customer_id every request with this key is forced to. Must be empty for an admin key.")
    name: Optional[StrictStr] = Field(default=None, description="Optional label for this API key (e.g. which app or integration uses it).")
    role: Optional[StrictStr] = Field(default=None, description="'admin' keys search/ingest across all customers and may pass any customer_id; 'scoped' keys are locked server-side to one customer_id. If omitted it is inferred from customer_id (present means scoped, absent means admin).")
    __properties: ClassVar[List[str]] = ["customer_id", "name", "role"]

    @field_validator('role')
    def role_validate_enum(cls, value):
        if value is None:
            return value

        if value not in set(['admin', 'scoped']):
            raise ValueError("must be one of enum values ('admin', 'scoped')")
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
        if self.customer_id is None and "customer_id" in self.model_fields_set:
            _dict['customer_id'] = None

        if self.name is None and "name" in self.model_fields_set:
            _dict['name'] = None

        if self.role is None and "role" in self.model_fields_set:
            _dict['role'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "customer_id": obj.get("customer_id"),
            "name": obj.get("name"),
            "role": obj.get("role")
        })
        return _obj

