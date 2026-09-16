import unittest

from fever_client.api.ingest_api import IngestApi

class TestIngestApi(unittest.IsolatedAsyncioTestCase):

    async def asyncSetUp(self) -> None:
        self.api = IngestApi()

    async def asyncTearDown(self) -> None:
        await self.api.api_client.close()

    async def test_ingest_media(self) -> None:
        pass

if __name__ == '__main__':
    unittest.main()
