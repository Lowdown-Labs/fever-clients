from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class IngestSource(BaseModel):
    customer_id: Optional[StrictStr] = Field(default=None, description="Tag every vacuumed item with this customer_id.")
    s3_uri: StrictStr = Field(description="s3://bucket/prefix in your VPC to vacuum every media item under.")
    target_res: Optional[Annotated[int, Field(le=4096, strict=True, ge=64)]] = Field(default=None, description="Resolution to index at, in pixels (rounded to a multiple of 16). Images are resized to this before embedding; higher means more detail but slower. Leave unset for the fast production default (64).")
    __properties: ClassVar[List[str]] = ["customer_id", "s3_uri", "target_res"]

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
            "customer_id": obj.get("customer_id"),
            "s3_uri": obj.get("s3_uri"),
            "target_res": obj.get("target_res")
        })
        return _obj

