import sys

import atheris

from fever_client.models.duplicates_response import DuplicatesResponse
from fever_client.models.search_hit import SearchHit


def TestOneInput(data):
    try:
        DuplicatesResponse.from_json(data)
    except ValueError:
        pass
    try:
        SearchHit.from_json(data)
    except ValueError:
        pass


atheris.Setup(sys.argv, TestOneInput)
atheris.Fuzz()
