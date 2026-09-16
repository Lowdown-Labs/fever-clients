from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing_extensions import Annotated
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class DuplicatesRequest(BaseModel):
    customer_id: Optional[StrictStr] = Field(default=None, description="Restrict the scan to media tagged with this customer_id. A scoped key is always forced to its own customer_id; an admin key may pass any customer_id or none (all customers).")
    customer_ids: Optional[List[StrictStr]] = Field(default=None, description="Admin only: restrict the scan to this set of customers. Spanning more than one customer is how cross-account duplicates (the same item submitted under different accounts) are found. Ignored for scoped keys, which stay pinned.")
    limit: Optional[Annotated[int, Field(le=5000, strict=True, ge=1)]] = Field(default=500, description="Max items to scan for near-duplicates.")
    threshold: Optional[Union[Annotated[float, Field(le=1.0, strict=True, ge=0.0)], Annotated[int, Field(le=1, strict=True, ge=0)]]] = Field(default=0.92, description="Similarity cutoff 0..1; higher is stricter (1.0 = near-identical).")
    __properties: ClassVar[List[str]] = ["customer_id", "customer_ids", "limit", "threshold"]

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

        if self.customer_ids is None and "customer_ids" in self.model_fields_set:
            _dict['customer_ids'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "customer_id": obj.get("customer_id"),
            "customer_ids": obj.get("customer_ids"),
            "limit": obj.get("limit") if obj.get("limit") is not None else 500,
            "threshold": obj.get("threshold") if obj.get("threshold") is not None else 0.92
        })
        return _obj

