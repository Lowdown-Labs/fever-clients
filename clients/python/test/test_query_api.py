import unittest

from fever_client.api.query_api import QueryApi

class TestQueryApi(unittest.IsolatedAsyncioTestCase):

    async def asyncSetUp(self) -> None:
        self.api = QueryApi()

    async def asyncTearDown(self) -> None:
        await self.api.api_client.close()

    async def test_query(self) -> None:
        pass

if __name__ == '__main__':
    unittest.main()
