from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field
from typing import Any, ClassVar, Dict, List, Optional
from fever_client.models.ingested_media import IngestedMedia
from fever_client.models.job import Job
from typing import Optional, Set
from typing_extensions import Self
from pydantic_core import to_jsonable_python

class IngestResult(BaseModel):
    existing: Optional[List[IngestedMedia]] = Field(default=None, description="Items skipped by delta ingest because they were already indexed, returned with their current blob_ids (only when overwrite=false).")
    ingested: Optional[List[IngestedMedia]] = Field(default=None, description="Media items processed inline (small requests).")
    job: Optional[Job] = Field(default=None, description="For large or bucket-source ingests, poll this job for progress.")
    __properties: ClassVar[List[str]] = ["existing", "ingested", "job"]

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
        if self.existing:
            for _item_existing in self.existing:
                _items.append(_item_existing.to_dict() if _item_existing is not None else None)
            _dict['existing'] = _items
        _items = []
        if self.ingested:
            for _item_ingested in self.ingested:
                _items.append(_item_ingested.to_dict() if _item_ingested is not None else None)
            _dict['ingested'] = _items
        if self.job:
            _dict['job'] = self.job.to_dict()
        if self.job is None and "job" in self.model_fields_set:
            _dict['job'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "existing": [IngestedMedia.from_dict(_item) for _item in obj["existing"]] if obj.get("existing") is not None else None,
            "ingested": [IngestedMedia.from_dict(_item) for _item in obj["ingested"]] if obj.get("ingested") is not None else None,
            "job": Job.from_dict(obj["job"]) if obj.get("job") is not None else None
        })
        return _obj

