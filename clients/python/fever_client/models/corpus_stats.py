from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, StrictInt
from typing import Any, ClassVar, Dict, List
from fever_client.models.corpus_tag import CorpusTag
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class CorpusStats(BaseModel):
    kinds: Dict[str, StrictInt]
    top_tags: List[CorpusTag]
    __properties: ClassVar[List[str]] = ["kinds", "top_tags"]

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
        if self.top_tags:
            for _item_top_tags in self.top_tags:
                _items.append(_item_top_tags.to_dict() if _item_top_tags is not None else None)
            _dict['top_tags'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "kinds": obj.get("kinds"),
            "top_tags": [CorpusTag.from_dict(_item) for _item in obj["top_tags"]] if obj.get("top_tags") is not None else None
        })
        return _obj

