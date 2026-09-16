import unittest

from fever_client.api.duplicates_api import DuplicatesApi

class TestDuplicatesApi(unittest.IsolatedAsyncioTestCase):

    async def asyncSetUp(self) -> None:
        self.api = DuplicatesApi()

    async def asyncTearDown(self) -> None:
        await self.api.api_client.close()

    async def test_find_duplicates(self) -> None:
        pass

    async def test_suggested_dedup_threshold(self) -> None:
        pass

if __name__ == '__main__':
    unittest.main()
