import unittest

from fever_client.api.search_api import SearchApi

class TestSearchApi(unittest.IsolatedAsyncioTestCase):

    async def asyncSetUp(self) -> None:
        self.api = SearchApi()

    async def asyncTearDown(self) -> None:
        await self.api.api_client.close()

    async def test_search(self) -> None:
        pass

if __name__ == '__main__':
    unittest.main()
